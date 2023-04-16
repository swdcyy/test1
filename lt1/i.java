package lt1.i;
import yh3.a;
import com.kuaishou.protobuf.livestream.nano.LiveMultiPkTimeLine;
import msd.a;
import st1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zh3.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import java.lang.Number;
import lt1.i$a;
import android.os.CountDownTimer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import java.lang.Long;
import com.yxcorp.gifshow.util.DateUtils;

public final class i extends a	// class@00302e
{
    public final LiveEvent a;
    public final CountDownTimer b;
    public final a c;
    public final a d;
    public final a e;

    public void i(LiveMultiPkTimeLine p0,a p1,a p2,a p3,a p4){
       a.p(p0, "timeLine");
       a.p(p1, "serverTime");
       a.p(p2, "closePkEvent");
       a.p(p3, "bandsClosePkClickEvent");
       a.p(p4, "multiPkLogDelegate");
       super();
       this.c = p2;
       this.d = p3;
       this.e = p4;
       c uoc = new c();
       this.p0(uoc);
       this.a = uoc;
       long l = p0.penaltyDeadline - p1.invoke().longValue();
       i$a uoa = new i$a(this, l, l, 1000);
       this.b = p1.invoke().longValue();
       p1.invoke().longValue().start();
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       super.onCleared();
       this.b.cancel();
       return;
    }
    public final void u0(long p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, oi, "4")) {
          return;
       }
       String str = DateUtils.v(p0);
       a.o(str, "DateUtils.getMSDuration\(timeLeftMs\)");
       this.s0(this.a).q(str);
       return;
    }
}
