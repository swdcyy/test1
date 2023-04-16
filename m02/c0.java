package m02.c0;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import u02.a;
import t02.a0;
import hf3.a;

public final class c0 implements Runnable	// class@0030ae
{
    public final LivePlayFragment b;

    public void c0(LivePlayFragment p0){
       this.b = p0;
    }
    public final void run(){
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LivePlayFragment.class, "40")) {
       }else {
          tb.q1 = true;
          tb.t1.d = SystemClock.uptimeMillis();
          if (tb.s1 != null) {
             tb.K.C.d(false);
             tb.Kh();
          }
       }
       return;
    }
}
