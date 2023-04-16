package org.java_websocket.c;
import fwd.b;
import java.net.InetSocketAddress;
import java.lang.String;
import java.lang.Exception;
import jwd.a;
import jwd.h;
import org.java_websocket.drafts.b;
import jwd.i;
import java.nio.ByteBuffer;
import jwd.f;
import iwd.c;

public interface abstract c	// class@00213c
{

    InetSocketAddress getLocalSocketAddress(b p0);
    InetSocketAddress getRemoteSocketAddress(b p0);
    void onWebsocketClose(b p0,int p1,String p2,boolean p3);
    void onWebsocketCloseInitiated(b p0,int p1,String p2);
    void onWebsocketClosing(b p0,int p1,String p2,boolean p3);
    void onWebsocketError(b p0,Exception p1);
    void onWebsocketHandshakeReceivedAsClient(b p0,a p1,h p2);
    i onWebsocketHandshakeReceivedAsServer(b p0,b p1,a p2);
    void onWebsocketHandshakeSentAsClient(b p0,a p1);
    void onWebsocketMessage(b p0,String p1);
    void onWebsocketMessage(b p0,ByteBuffer p1);
    void onWebsocketOpen(b p0,f p1);
    void onWebsocketPing(b p0,c p1);
    void onWebsocketPong(b p0,c p1);
    void onWriteDemand(b p0);
}
