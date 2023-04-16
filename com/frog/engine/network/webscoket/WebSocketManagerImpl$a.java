package com.frog.engine.network.webscoket.WebSocketManagerImpl$a;
import com.frog.engine.network.webscoket.WebSocketListener;
import com.frog.engine.network.webscoket.WebSocketManagerImpl;
import com.frog.engine.network.webscoket.WebSocketRequest;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.frog.engine.internal.FrogLog;
import java.util.Map;
import java.lang.Throwable;
import android.util.Log;
import java.nio.ByteBuffer;

public class WebSocketManagerImpl$a implements WebSocketListener	// class@00155c
{
    public final WebSocketListener a;
    public final WebSocketRequest b;
    public final WebSocketManagerImpl c;

    public void WebSocketManagerImpl$a(WebSocketManagerImpl p0,WebSocketListener p1,WebSocketRequest p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onClose(int p0,String p1){
       WebSocketManagerImpl$a uoa = WebSocketManagerImpl$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "4")) {
          return;
       }
       FrogLog.d("WebSocketManagerImpl", "onClose "+p0+" "+p1);
       WebSocketManagerImpl mLock = this.c.mLock;
       _monitor_enter(mLock);
       this.c.mWebSocketTaskMap.remove(Integer.valueOf(this.b.taskId));
       _monitor_exit(mLock);
       this.a.onClose(p0, p1);
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebSocketManagerImpl$a.class, "5")) {
          return;
       }
       FrogLog.e("WebSocketManagerImpl", "onError "+Log.getStackTraceString(p0));
       WebSocketManagerImpl mLock = this.c.mLock;
       _monitor_enter(mLock);
       this.c.mWebSocketTaskMap.remove(Integer.valueOf(this.b.taskId));
       _monitor_exit(mLock);
       this.a.onError(p0);
       return;
    }
    public void onMessage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebSocketManagerImpl$a.class, "2")) {
          return;
       }
       this.a.onMessage(p0);
       return;
    }
    public void onMessage(ByteBuffer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebSocketManagerImpl$a.class, "3")) {
          return;
       }
       this.a.onMessage(p0);
       return;
    }
    public void onOpen(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebSocketManagerImpl$a.class, "1")) {
          return;
       }
       FrogLog.d("WebSocketManagerImpl", "onOpen "+p0);
       this.a.onOpen(p0);
       return;
    }
}
