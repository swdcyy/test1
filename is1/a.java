package is1.a;
import is1.a$b;
import nsd.u;
import is1.a$a;
import msd.a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Boolean;
import java.lang.Long;
import ekd.t;
import ekd.k1;
import java.lang.Number;
import is1.b;
import usd.q;

public class a	// class@00298a
{
    public final MutableLiveData a;
    public final LiveData b;
    public final MutableLiveData c;
    public final LiveData d;
    public t e;
    public final a f;
    public final Runnable g;
    public static final c h;
    public static final a$b i;

    static {
       a.i = new a$b(null);
       a.h = a$a.b;
    }
    public void a(a p0,Runnable p1){
       a.p(p0, "serverTimeGetter");
       super();
       this.f = p0;
       this.g = p1;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.a = mutableLiveD;
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.c = mutableLiveD;
       this.d = mutableLiveD;
    }
    public final LiveData a(){
       return this.d;
    }
    public final LiveData b(){
       return this.b;
    }
    public final void c(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "1")) {
          return;
       }
       b.Z(a.h, "release");
       if (!PatchProxy.applyVoid(null, this, uoa, "5")) {
          this.a.setValue(Boolean.FALSE);
          this.c.setValue(Long.valueOf(0));
          uoa = this.e;
          if (uoa != null) {
             uoa.a();
          }
          this.e = null;
          k1.n(this);
       }
       return;
    }
    public final void d(long p0,long p1){
       boolean b;
       a uoa = this;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, a.class, "2")) {
          return;
       }
       c h = a.h;
       b.d0(h, "handleDeadlineUpdate", "countdownDeadlineMs", Long.valueOf(p0), "notifyDeadlineMs", Long.valueOf(p1));
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, a.class, "3")) {
          a e = uoa.e;
          if (e != null) {
             e.a();
          }
          uoa.e = null;
          if (p0 <= 0) {
             b.Z(h, "updateCountdown, cancel countdown");
             uoa.a.setValue(Boolean.FALSE);
             uoa.c.setValue(Long.valueOf(0));
          }else {
             uoa.a.setValue(Boolean.TRUE);
             long l1 = p0 - uoa.f.invoke().longValue();
             b.c0(h, "updateCountdown", "countdownMs", Long.valueOf(l1));
             if (l1 <= 0) {
                uoa.c.setValue(Long.valueOf(0));
             }else {
                uoa.c.setValue(Long.valueOf(l1));
                b uob = new b(this, l1, (int)(l1 / (long)1000), 1000);
                uoa.e = v10;
                v10.f();
             }
          }
       }
       a g = uoa.g;
       if (g != null) {
          Boolean value = uoa.b.getValue();
          if (value == null) {
             value = Boolean.FALSE;
          }
          a.o(value, "isCountdownEnable.value ?: false");
          b = value.booleanValue();
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(b), Long.valueOf(p1), g, this, a.class, "4")) {
             k1.n(this);
             if (!b) {
                b.Z(h, "scheduleNotifySwitchBizIfNeed return");
             }else {
                long l = q.o((p1 - uoa.f.invoke().longValue()), 0);
                b.c0(h, "scheduleNotifySwitchBizIfNeed", "delay", Long.valueOf(l));
                k1.s(g, this, l);
             }
          }
       }
       return;
    }
}
