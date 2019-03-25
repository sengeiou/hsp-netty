package com.cmcc.hsp.netty.core;

import io.netty.channel.socket.SocketChannel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NettySocketHolder {

    private static Map<String, SocketChannel> map = new ConcurrentHashMap<>();

    public static void addGatewayChannel(String id, SocketChannel gateway_channel){
        map.put(id, gateway_channel);
    }

    public static Map<String, SocketChannel> getChannels(){
        return map;
    }

    public static SocketChannel getGatewayChannel(String id){
        return map.get(id);
    }

    public static void removeGatewayChannel(String id){
        map.remove(id);
    }
}

