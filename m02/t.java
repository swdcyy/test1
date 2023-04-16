package m02.t;
import erd.g;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import kotlin.Pair;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import u02.a;
import android.os.SystemClock;
import t02.a0;
import hf3.a;

public final class t implements g	// class@0030e3
{
    public final LivePlayFragment b;

    public void t(LivePlayFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = p0.getFirst().booleanValue();
       long l = p0.getSecond().longValue();
       if (!PatchProxy.isSupport(LivePlayFragment.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Long.valueOf(l), tb, LivePlayFragment.class, "41")) {
          tb.s1 = true;
          p0 = tb.t1;
          p0.a = b;
          p0.b = l;
          p0.c = SystemClock.uptimeMillis();
          if (tb.q1 != null) {
             tb.K.C.d(false);
             tb.Kh();
          }
       }
       return;
    }
}
