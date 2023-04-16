package m02.k0;
import msd.a;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import java.lang.Object;
import qrd.l1;
import t02.g;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.yxcorp.utility.TextUtils;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import pp.d;
import t02.a0;
import p91.m;
import mi2.l;
import com.kwai.component.photo.detail.slide.DetailSlidePlayFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import vy6.a;
import zv6.t;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.Fragment;

public final class k0 implements a	// class@0030c6
{
    public final LivePlayFragment b;

    public void k0(LivePlayFragment p0){
       this.b = p0;
    }
    public final Object invoke(){
       l1 a;
       k0 tb = this.b;
       if (tb.x1 != null) {
          a = l1.a;
       }else {
          tb.J.H.g(LivePlayFragment.K1, "detachedOnScrollEnd", ImmutableMap.of("userName", TextUtils.k(tb.H.getUserName())));
          tb.n1 = false;
          tb.Qh();
          LivePlayFragment k = tb.K;
          if (k != null) {
             k.Z2.A(true);
             a0 z1 = tb.K.Z1;
             if (z1 != null) {
                z1.a(tb.H);
             }
          }
          if (!PatchProxy.applyVoid(null, tb, DetailSlidePlayFragment.class, "12")) {
             Iterator iterator = tb.u.iterator();
             while (iterator.hasNext()) {
                iterator.next().B0();
             }
             DetailSlidePlayFragment v = tb.v;
             if (v != null) {
                v.t1().v(tb);
             }
          }
          a = l1.a;
       }
       return a;
    }
}
