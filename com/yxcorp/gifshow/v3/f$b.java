package com.yxcorp.gifshow.v3.f$b;
import wpc.y;
import java.lang.Runnable;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ooc.r;
import ekd.k1;
import wpc.x;

public class f$b implements y	// class@001521
{
    public final Runnable a;
    public final Map b;

    public void f$b(Runnable p0,Map p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$b.class, "1")) {
          return;
       }
       this.a.run();
       k1.r(new r(this.b, this), 0);
       return;
    }
    public void b(){
       x.c(this);
    }
    public void c(boolean p0){
       x.a(this, p0);
    }
}
