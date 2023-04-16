package com.frog.engine.network.webscoket.WebSocketTask;
import java.lang.String;
import com.frog.engine.network.webscoket.WebSocketRequest;
import com.frog.engine.network.webscoket.WebSocketListener;
import java.nio.ByteBuffer;

public interface abstract WebSocketTask	// class@00155f
{

    void close(int p0,String p1);
    void connect(WebSocketRequest p0,WebSocketListener p1);
    void send(String p0);
    void send(ByteBuffer p0);
}
