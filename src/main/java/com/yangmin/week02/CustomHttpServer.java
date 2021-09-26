package com.yangmin.week02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  使用阻塞IO，简单模拟HttpServer
 */
public class CustomHttpServer {


    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8801);

        try {
            while (true){
                Socket socket = server.accept();
                service(socket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void service(Socket socket){
        try {
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Content-Type:text/html;charset=utf-8");

            String body = "Hello NIO 1.";

            printWriter.println("Content-Length:" + body.getBytes().length );
            printWriter.println();
            printWriter.println(body);

            printWriter.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
