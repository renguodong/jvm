package com.learn.jvm.demo.basicsDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client2 {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端2启动。。。。。");
        /**
         * 发送消息
         */
        //1,创建DatagramSocket，指定端口
        DatagramSocket socket = new DatagramSocket(9999);
        //2,指定地址端口
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 8888;
        //3,要发送的消息
        byte[] data = "你好，客户端1".getBytes();
        //4,创建
        DatagramPacket packet = new DatagramPacket(data, data.length, localhost, port);
        //5,发送
        socket.send(packet);

        /**
         * 接收消息
         */

        //1,创建一个数组
        byte[] data2 = new byte[1024];
        DatagramPacket packet2 = new DatagramPacket(data2, data2.length);
        //2,
        socket.receive(packet2);
        //3,解析发送过来的消息
        String msg = new String(data2, 0, packet2.getLength());
        System.out.println("客户端1：" + msg);
        socket.close();


    }
}

