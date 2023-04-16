package com.kuaishou.live.gzone.v2.activity.a$b;
import o63.c;
import com.kuaishou.live.gzone.v2.activity.a;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import y43.a;
import k67.b;
import zj0.x;
import androidx.lifecycle.Lifecycle;

public class a$b implements c	// class@001caf
{
    public final Fragment b;
    public final a c;

    public void a$b(a p0,Fragment p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public Integer I2(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Integer.valueOf(0);
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "2")) {
          return;
       }
       a d = this.c.s.d;
       if (d != null) {
          d.u7();
       }
       return;
    }
    public x ea(){
       return null;
    }
    public Lifecycle getLifecycle(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getLifecycle();
    }
    public void l0(boolean p0){
    }
    public void n0(){
    }
}
