package a7a.p$a;
import d6a.a;
import a7a.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import jd5.i;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import wd5.o;
import android.util.SparseIntArray;
import wd5.a;
import crd.b;
import lnc.b9;
import crd.a;
import a7a.o;
import erd.g;
import brd.t;

public class p$a extends a	// class@000071
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public void F1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, p$a.class, "2")) {
          return;
       }
       p$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidWithListener(objArray, tb, p.class, "5")) {
          p v = tb.v;
          if (v != null) {
             v.M(tb.C);
          }
          tb.p.getAtlasList();
          tb.r.c = tb.p.getAtlasList().size();
          int i1 = 0;
          for (int i = 0; i < tb.s.size(); i = i + 1) {
             i1 = i1 + tb.s.valueAt(i);
          }
          int i2 = 0;
          for (i = 0; i < tb.t.size(); i = i + 1) {
             i2 = i2 + tb.t.valueAt(i);
          }
          tb.r.b = tb.A.b();
          tb.r.a = tb.A.c();
          p r = tb.r;
          r.e = i1;
          r.d = tb.s.size();
          r = tb.r;
          r.g = i2;
          r.f = tb.t.size();
          tb.A.a();
          tb.s.clear();
          tb.t.clear();
          b9.a(tb.y);
          tb.z = 0;
          PatchProxy.onMethodExit(p.class, "5");
       }
       PatchProxy.onMethodExit(p$a.class, "2");
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, p$a.class, "1")) {
          return;
       }
       p$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidWithListener(objArray, tb, p.class, "4")) {
          tb.p.getAtlasList();
          tb.r.c = tb.p.getAtlasList().size();
          tb.P8(tb.v.getCurrentPosition());
          tb.v.x(tb.C);
          a uoa = new a();
          tb.y = uoa;
          uoa.c(tb.x.subscribe(new o(tb)));
          PatchProxy.onMethodExit(p.class, "4");
       }
       PatchProxy.onMethodExit(p$a.class, "1");
       return;
    }
}
