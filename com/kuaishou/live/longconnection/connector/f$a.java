package com.kuaishou.live.longconnection.connector.f$a;
import java.lang.Runnable;
import com.kuaishou.live.longconnection.connector.f;
import java.lang.Class;
import lf3.g;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.longconnection.connector.c;

public class f$a implements Runnable	// class@000c6b
{
    public final int b;
    public final Class c;
    public final g d;
    public final boolean e;
    public final f f;

    public void f$a(f p0,int p1,Class p2,g p3,boolean p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       this.f.c.J(this.b, this.c, this.d, this.e);
       return;
    }
}
