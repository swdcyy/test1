package n90.j;
import androidx.lifecycle.Observer;
import n90.g;
import java.util.List;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import t90.i;

public final class j implements Observer	// class@0026e6
{
    public final g b;
    public final long c;
    public final List d;
    public final String e;
    public final boolean f;

    public void j(g p0,long p1,List p2,String p3,boolean p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          long l = 50;
          if (p0 != null && p0.intValue() == l) {
             i.a((System.currentTimeMillis() - this.c));
             this.b.d(this.d, this.e, this.f);
          }
       }
       return;
    }
}
