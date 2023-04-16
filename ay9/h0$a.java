package ay9.h0$a;
import qp7.y0;
import ay9.h0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ay9.j0;
import java.lang.Runnable;
import ekd.k1;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import i8a.a;
import i8a.g;
import java.util.concurrent.atomic.AtomicInteger;
import i8a.e;
import t45.c;
import android.os.SystemClock;

public class h0$a extends y0	// class@0002f8
{
    public final h0 a;

    public void h0$a(h0 p0){
       this.a = p0;
       super();
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h0$a.class, "2")) {
          return;
       }
       h0 m = this.a.M;
       Objects.requireNonNull(m);
       if (!PatchProxy.applyVoid(objArray, m, j0.class, "3")) {
          if (m.a == null || m.b == null) {
             a.c("CaptionShownChecker", m.b, "enter error,caption = "+m.a);
          }else {
             k1.m(m.e);
          }
       }
       return;
    }
    public void h(){
       h0 l;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h0$a.class, "1")) {
          return;
       }
       StringBuilder str = 3;
       if (this.a.L.r() != str) {
          l = this.a.L;
          Objects.requireNonNull(l);
          if (!PatchProxy.applyVoid(objArray, l, g.class, "5") && !l.r.get()) {
             c.a(new e(l));
          }
       }
       l = this.a.M;
       Objects.requireNonNull(l);
       if (!PatchProxy.applyVoid(objArray, l, j0.class, "2")) {
          j0 a = l.a;
          if (a == null || l.b == null) {
             a.c("CaptionShownChecker", l.b, "enter error,caption = "+l.a);
          }else if(a.r() != str){
             a.c("CaptionShownChecker", l.b, "当前页卡已经显示，但是caption还没有准备好！！！，状态:"+l.a.r());
             l.c = SystemClock.elapsedRealtime();
             k1.r(l.e, 1000);
          }
       }
       return;
    }
}
