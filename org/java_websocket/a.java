package org.java_websocket.a;
import org.java_websocket.c;
import java.lang.Object;
import fwd.b;
import jwd.a;
import jwd.h;
import org.java_websocket.drafts.b;
import jwd.i;
import jwd.e;
import iwd.c;
import iwd.e;
import iwd.d;

public abstract class a implements c	// class@00213b
{

    public void a(){
       super();
    }
    public void onWebsocketHandshakeReceivedAsClient(b p0,a p1,h p2){
    }
    public i onWebsocketHandshakeReceivedAsServer(b p0,b p1,a p2){
       return new e();
    }
    public void onWebsocketHandshakeSentAsClient(b p0,a p1){
    }
    public void onWebsocketPing(b p0,c p1){
       p0.sendFrame(new e(p1));
    }
    public void onWebsocketPong(b p0,c p1){
    }
}
