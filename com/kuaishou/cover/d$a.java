package com.kuaishou.cover.d$a;
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

public class d$a implements b	// class@0016dd
{
    public final d a;

    public void d$a(d p0){
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
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       c.f("on widget onDismiss");
       return;
    }
    public boolean onFailed(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       c.f("on widget load failed");
       return false;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       c.f("on widget show");
       return;
    }
}
