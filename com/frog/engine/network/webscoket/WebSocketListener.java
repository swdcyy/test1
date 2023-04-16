package com.frog.engine.network.webscoket.WebSocketListener;
import java.lang.String;
import java.lang.Throwable;
import java.nio.ByteBuffer;
import java.util.Map;

public interface abstract WebSocketListener	// class@00155a
{

    void onClose(int p0,String p1);
    void onError(Throwable p0);
    void onMessage(String p0);
    void onMessage(ByteBuffer p0);
    void onOpen(Map p0);
}
