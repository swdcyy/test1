package com.facebook.react.modules.network.f;
import com.facebook.react.modules.network.a;
import com.facebook.react.modules.network.g;
import java.io.OutputStream;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qe.f;
import java.lang.Integer;

public class f extends a	// class@0012d6
{
    public final g c;

    public void f(g p0,OutputStream p1){
       this.c = p0;
       super(p1);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       a tb = this.b;
       long l = this.c.contentLength();
       g b = this.c.b;
       boolean b1 = (!tb - l)? true: false;
       b.a(tb, l, b1);
       return;
    }
    public void write(int p0){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, f.class, "2")) {
          return;
       }
       super.write(p0);
       this.a();
       return;
    }
    public void write(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, f.class, "1")) {
          return;
       }
       super.write(p0, p1, p2);
       this.a();
       return;
    }
}
