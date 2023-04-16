package m02.t0;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$e;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import t02.g;
import mq5.h;
import mq5.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kuaishou.live.core.basic.utils.e;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import kq5.b;

public final class t0 implements LivePlayLoader$e	// class@0030e1
{
    public final LivePlayFragment a;

    public void t0(LivePlayFragment p0){
       this.a = p0;
    }
    public final void a(boolean p0){
       t0 ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(LivePlayFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), ta, LivePlayFragment.class, "32")) {
          ta.Nh("onBasicComponentLoaded");
          ta.J.i.Km(ta.F1);
          if (p0) {
             if (e.s(ta.getActivity())) {
                ta.J.l.u8();
             }
             ta.J.p.b();
          }
          ta.p1 = true;
       }
       return;
    }
}
