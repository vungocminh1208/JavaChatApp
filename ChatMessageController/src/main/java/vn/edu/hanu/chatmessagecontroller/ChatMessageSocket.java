/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.hanu.chatmessagecontroller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author Hiiro
 */
public class ChatMessageSocket {
    private Socket socket;
    private JTextPane txpMessageBoard;
    private PrintWriter pw;
    private BufferedReader br;
    /**
     * The constructor of the Controller 
     * initialize the Print Writer and BufferReader in this
     */
    public ChatMessageSocket(Socket socket, JTextPane txpMessageBoard)throws IOException {
        this.socket = socket;
        this.txpMessageBoard = txpMessageBoard;

        
        pw = new PrintWriter(socket.getOutputStream());
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        txpMessageBoard.setEditable(false);
        
        received();
    }
    /**
     * The received method for receiving the data from 2 side
     * With each line that has been read
     *      set that line to board and display
     *         get the previous messages 
     */
    public void received() {
        Thread thread = new Thread() {
            public void run() {
                while(true) {               
                    try {
                        String line = br.readLine();
                        if (line != null) {
                            txpMessageBoard.setText(txpMessageBoard.getText()+"\nSent: - "+ line);
                        }
                    } catch (Exception e) {
                    }
                }
            }
        };
        thread.start();      
    }
    
    /**
     * This method is used to send message data
     * 
     */  
    public void send(String message) {
        String curMessage = txpMessageBoard.getText();
        txpMessageBoard.setText(curMessage+ "\nReceived: - " + message);
        pw.println(message);
        //push the stream
        pw.flush();
    }
    
    /**
     * For closing
     */
    public void close() {
        try {
            pw.close();
            br.close();
            socket.close();
        } catch (Exception e) {
        }
    }    
}
