package com.kuaishou.aegon.okhttp.impl.b;
import aegon.chrome.net.n$a;
import java.lang.String;
import okhttp3.Interceptor$Chain;
import okhttp3.EventListener;
import java.util.concurrent.Executor;
import com.kuaishou.aegon.okhttp.impl.b$a;
import aegon.chrome.net.n;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import bo.t;
import bo.r;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.aegon.Aegon;
import bo.q;
import io.b$a;
import io.b;
import go.a;
import okhttp3.Call;
import aegon.chrome.net.n$b;
import aegon.chrome.net.CronetException;

public class b extends n$a	// class@0005ed
{
    public String b;
    public int c;
    public Interceptor$Chain d;
    public EventListener e;
    public boolean f;

    public void b(String p0,int p1,Interceptor$Chain p2,EventListener p3,Executor p4){
       super(p4);
       this.e = new b$a(this);
       this.f = false;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       if (p3 != null) {
          this.e = p3;
       }
       return;
    }
    public void b(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       t.a("CronetInterceptor", "onRequestFinished. requestId: "+this.b);
       b tb = this.b;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(tb, obj, r.class, "1");
       if (obj1 != PatchProxyResult.class) {
          obj = obj1;
       }else if(!Aegon.f()){
          obj = b.b(new q(tb));
       }
       if (obj == null) {
          obj = "";
       }
       tb = this.e;
       if (tb instanceof a) {
          tb.c(this.d.call(), p0.d(), obj);
       }
       if (p0.b() == null) {
          this.e.callEnd(this.d.call());
       }
       _monitor_enter(this);
       this.f = true;
       this.notifyAll();
       _monitor_exit(this);
       return;
    }
}
