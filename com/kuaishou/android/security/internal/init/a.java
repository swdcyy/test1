package com.kuaishou.android.security.internal.init.a;
import com.kuaishou.android.security.internal.init.c;
import java.lang.Object;
import com.kuaishou.android.security.internal.init.f;
import java.lang.String;
import com.kuaishou.android.security.internal.plugin.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.kuaishou.android.security.base.perf.b;
import com.kuaishou.android.security.base.util.KSecurityTrack;
import java.lang.Exception;
import com.kuaishou.android.security.internal.init.c$a;
import java.lang.Number;
import java.lang.Boolean;

public class a implements c	// class@0006e4
{
    public f a;

    public void a(){
       this.a = new f();
    }
    public void a(String p0){
       this.a = new f(p0);
    }
    public g a(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.a();
    }
    public void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       int g = b.G;
       try{
          KSecurityTrack.sLog(g);
          this.b(p0);
       }catch(com.kuaishou.android.security.base.exception.KSException e3){
          e3.printStackTrace();
       }
       return;
    }
    public void a(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.a.a(p0);
       return;
    }
    public void b(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       this.a.a(p0);
       return;
    }
    public void b(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.a.b(p0);
       return;
    }
    public int c(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.b(p0);
    }
    public boolean d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.c(p0);
    }
    public int e(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       KSecurityTrack.sLog(b.F);
       return this.c(p0);
    }
}
