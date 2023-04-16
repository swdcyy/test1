package jb1.y;
import y8c.g;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import nl8.p;
import tkd.b;
import tkd.d;
import nx5.d;
import y8c.r;
import jb1.y$a;
import ml8.c;

public class y extends g	// class@002b29
{
    public boolean w;

    public void y(boolean p0){
       super();
       this.w = false;
       this.w = p0;
    }
    public f h1(ViewGroup p0,int p1){
       p obj;
       y oy = y.class;
       if (PatchProxy.isSupport(oy)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oy, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new p();
       obj.n(0, d.a(0x47047d).OY());
       obj.n(0, new y$a(this));
       return new f(a.i(p0, 0x7f0d042a), obj);
    }
}
