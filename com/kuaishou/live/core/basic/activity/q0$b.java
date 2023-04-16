package com.kuaishou.live.core.basic.activity.q0$b;
import com.kuaishou.live.core.basic.activity.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class q0$b implements a$a	// class@00184e
{
    public a$a a;
    public boolean b;

    public void q0$b(a$a p0){
       super();
       this.a = p0;
    }
    public void A1(){
       if (PatchProxy.applyVoid(null, this, q0$b.class, "1")) {
          return;
       }
       this.a.A1();
       this.b = true;
       return;
    }
    public void y1(){
       if (PatchProxy.applyVoid(null, this, q0$b.class, "2")) {
          return;
       }
       this.a.y1();
       return;
    }
    public String z1(){
       return null;
    }
}
