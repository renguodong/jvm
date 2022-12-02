package com.learn.jvm.demo.basicsDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Client1 {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端1启动。。。。");

        /**
         * 接收信息
         */
        //1,创建一个指定端口的DatagramSocket
        DatagramSocket socket = new DatagramSocket(8888);
        //2,创建一个字节数组
        byte[] data = new byte[1024];
        //3,创建DatagramPacket接收客户端的信息
        DatagramPacket packet = new DatagramPacket(data, data.length);
        //4,接收消息
        socket.receive(packet);

        //读取数据
        String msg = new String(data, 0, packet.getLength());
        System.out.println("客户端2：" + msg);


        /**
         * 发送消息
         */
        //5,指定地址，端口
        byte[] data2 = "你好，我是客户端1".getBytes();
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9999;
        //6，创建消息
        DatagramPacket packet2 = new DatagramPacket(data2, data2.length, localhost, port);
        //7,发送消息
        socket.send(packet2);


        //8
        socket.close();


    }
}

