package com.frog.engine.network.webscoket.WebSocketManager;
import java.lang.String;
import com.frog.engine.network.webscoket.WebSocketRequest;
import com.frog.engine.network.webscoket.WebSocketListener;
import java.util.List;
import java.nio.ByteBuffer;

public interface abstract WebSocketManager	// class@00155b
{

    void close(int p0,int p1,String p2);
    void connect(WebSocketRequest p0,WebSocketListener p1);
    int getSize();
    List getTaskList();
    boolean isEnable(String p0);
    void send(int p0,String p1);
    void send(int p0,ByteBuffer p1);
}
