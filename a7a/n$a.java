package a7a.n$a;
import d6a.a;
import a7a.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import jd5.i;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import crd.a;
import a7a.m;
import erd.g;
import crd.b;
import brd.t;

public class n$a extends a	// class@00006d
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoidWithListener(null, this, n$a.class, "2")) {
          return;
       }
       n$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidWithListener(null, tb, n.class, "5")) {
          n r = tb.r;
          if (r != null) {
             r.M(tb.v);
          }
          r = tb.t;
          if (r != null) {
             r.dispose();
             tb.t = null;
          }
          PatchProxy.onMethodExit(n.class, "5");
       }
       PatchProxy.onMethodExit(n$a.class, "2");
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, n$a.class, "1")) {
          return;
       }
       n$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidWithListener(objArray, tb, n.class, "4")) {
          tb.P8(tb.r.getCurrentPosition());
          tb.r.x(tb.v);
          a uoa = new a();
          tb.t = uoa;
          uoa.c(tb.s.subscribe(new m(tb)));
          PatchProxy.onMethodExit(n.class, "4");
       }
       PatchProxy.onMethodExit(n$a.class, "1");
       return;
    }
}
