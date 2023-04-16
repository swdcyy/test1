package com.kuaishou.cover.d$b;
import a30.b;
import com.kuaishou.cover.d;
import java.lang.Object;
import a30.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nv.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class d$b implements b	// class@0016de
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void a(long p0){
       a.b(this, p0);
    }
    public void b(boolean p0){
       a.a(this, p0);
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "2")) {
          return;
       }
       c.f("on link onDismiss");
       return;
    }
    public boolean onFailed(){
       Object obj = PatchProxy.apply(null, this, d$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       c.f("on link load failed");
       return false;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       c.f("on link show");
       return;
    }
}
