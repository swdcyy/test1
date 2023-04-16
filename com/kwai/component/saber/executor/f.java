package com.kwai.component.saber.executor.f;
import okhttp3.WebSocketListener;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import pg5.e;
import okhttp3.WebSocket;
import okhttp3.Response;
import cb.a;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.component.saber.executor.f$a;

public class f extends WebSocketListener	// class@000b33
{
    public f$a a;
    public WebSocket b;
    public OkHttpClient c;
    public e d;
    public final AtomicInteger e;
    public final ConcurrentHashMap f;

    public void f(){
       super();
       this.e = new AtomicInteger();
       this.f = new ConcurrentHashMap();
    }
    public final void a(int p0,Throwable p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uof, "4")) {
          return;
       }
       e uoe = this.f.get(Integer.valueOf(p0));
       if (uoe != null) {
          this.f.remove(Integer.valueOf(p0));
          uoe.onFailure(p1);
       }
       return;
    }
    public void onClosed(WebSocket p0,int p1,String p2){
       this.b = null;
    }
    public void onFailure(WebSocket p0,Throwable p1,Response p2){
       Iterator iterator;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "7")) {
          return;
       }
       f uof = f.class;
       if (!PatchProxy.applyVoidTwoRefs("Websocket exception", p1, this, uof, "9")) {
          a.h("SaberWebSocketClient", "Error occurred, shutting down websocket connection: Websocket exception", p1);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, uof, "2")) {
             try{
                uof = this.b;
                if (uof != null) {
                   int i = 1000;
                   uof.close(i, "End of session");
                   this.b = objArray;
                }
             }catch(java.lang.Exception e0){
             }
          }
       }
       return;
    }
    public void onMessage(WebSocket p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "6")) {
          return;
       }
       this.a.a(p1);
       return;
    }
    public void onOpen(WebSocket p0,Response p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "8")) {
          return;
       }
       this.b = p0;
       this.d.onSuccess(null);
       this.d = null;
       return;
    }
}
