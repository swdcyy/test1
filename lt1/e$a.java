package lt1.e$a;
import bt1.c;
import lt1.e;
import java.lang.Object;
import bt1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import bt1.a;
import kotlin.jvm.internal.a;
import zs1.b;
import ut1.f;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTimeLine;
import java.util.Objects;
import android.os.CountDownTimer;
import pu1.m;
import msd.a;
import lt1.f;

public final class e$a implements c	// class@003026
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void Y0(){
       b.d(this);
    }
    public void Z1(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "2")) {
          return;
       }
       e$a tb = this.b;
       tb.r0(tb.v0()).setValue(new Object());
       return;
    }
    public void e2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       a.p(p0, "gameInfo");
       e$a tb = this.b;
       tb.r0(tb.w0()).setValue(p0.h);
       f value = this.b.h.l().getValue();
       if (value != null) {
          LiveMultiPkTimeLine liveMultiPkT = value.m();
          if (liveMultiPkT != null) {
             e$a tb1 = this.b;
             e j = tb1.j;
             Objects.requireNonNull(tb1);
             if (!PatchProxy.applyVoidThreeRefs(p0, liveMultiPkT, j, tb1, e.class, "4")) {
                e d = tb1.d;
                if (d != null) {
                   d.cancel();
                }
                long l = m.a.f(p0, liveMultiPkT, j);
                f uof = new f(tb1, l, l, 1000);
                tb1.d = p0;
                p0.start();
             }
          }
       }
       return;
    }
    public void i2(){
       b.b(this);
    }
}
