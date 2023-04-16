package com.kwai.component.saber.executor.g;
import java.lang.Object;
import java.lang.String;
import pg5.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.component.saber.executor.f;
import pg5.g;
import com.kwai.component.saber.executor.g$a;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request$Builder;
import okhttp3.Request;
import okhttp3.WebSocketListener;
import okhttp3.WebSocket;
import java.lang.IllegalStateException;

public class g	// class@000b36
{
    public f a;
    public g$b b;

    public void g(){
       super();
    }
    public void a(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "2")) {
          return;
       }
       f uof = new f();
       this.a = uof;
       uof.a = new g(this);
       g$a uoa = new g$a(this, p1);
       if (!PatchProxy.applyVoidTwoRefs(p0, uoa, uof, f.class, "1")) {
          if (uof.c == null) {
             uof.d = uoa;
             TimeUnit sECONDS = TimeUnit.SECONDS;
             OkHttpClient$Builder uBuilder = new OkHttpClient$Builder().connectTimeout(10, sECONDS).writeTimeout(10, sECONDS);
             uof.c = uBuilder.readTimeout(0, TimeUnit.MINUTES).build();
             uof.c.newWebSocket(new Request$Builder().url(p0).build(), uof);
          }else {
             throw new IllegalStateException("KstToolsDebuggerWebSocketClient is already initialized.");
          }
       }
       return;
    }
}
