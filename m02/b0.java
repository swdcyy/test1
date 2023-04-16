package m02.b0;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import t02.g;
import mq5.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kuaishou.live.core.basic.utils.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import vp5.b;
import t02.a0;
import p91.m;

public final class b0 implements Runnable	// class@0030ab
{
    public final LivePlayFragment b;

    public void b0(LivePlayFragment p0){
       this.b = p0;
    }
    public final void run(){
       b0 tb = this.b;
       tb.J.i.eh();
       if (e.s(tb.getActivity())) {
          tb.Vh();
       }
       if (!PatchProxy.applyVoid(null, tb, LivePlayFragment.class, "66")) {
          LivePlayFragment k = tb.K;
          if (k != null) {
             RxBus.f.b(new b(k.Z2.d(), tb.K.Z2.getLiveStreamId()));
          }
       }
       return;
    }
}
