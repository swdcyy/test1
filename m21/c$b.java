package m21.c$b;
import erd.g;
import m21.c;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.model.LiveCarouselPendantInfo;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Iterator;
import java.lang.Iterable;
import l12.c;
import m21.a;
import kotlin.jvm.internal.a;
import m21.d;
import android.view.View$OnClickListener;
import java.util.ArrayList;
import com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantView;
import android.util.AttributeSet;
import android.app.Activity;
import androidx.viewpager.widget.ViewPager;
import android.view.View;
import va1.i0;
import com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantViewController;
import t02.a0;
import android.widget.LinearLayout;
import java.util.List;
import lv1.d;
import rq5.a;
import pq5.c;
import m21.e;
import java.util.Objects;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;

public final class c$b implements g	// class@003110
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Context context;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, c$b.class, "1")) {
       }else {
          LiveTimeConsumingUserStatusResponse mLiveCarouse = obj1.mLiveCarouselPendantInfo;
          if (mLiveCarouse != null) {
             LiveCarouselPendantInfo liveCarouseP = mLiveCarouse.liveCarousePedantItemList;
             if (liveCarouseP != null && obj.b.getContext() != null) {
                Iterator iterator = liveCarouseP.iterator();
                int i = 0;
                int i1 = 0;
                String str = "context!!";
                while (iterator.hasNext()) {
                   c uoc = iterator.next();
                   c$b b = obj.b;
                   context = b.getContext();
                   a.m(context);
                   a.o(context, str);
                   b.u.add(new a(context, uoc, new d(uoc, i1, obj, obj1)));
                   i1 = i1 + 1;
                }
                Context context1 = obj.b.getContext();
                a.m(context1);
                a.o(context1, str);
                AttributeSet uAttributeSe = null;
                obj.b.s = new LiveCarouselPendantView(context1, uAttributeSe, i);
                Activity activity = obj.b.getActivity();
                c s = obj.b.s;
                if (s != null) {
                   uAttributeSe = s.getMViewPager();
                }
                i0.b(activity, uAttributeSe);
                Context context2 = obj.b.getContext();
                a.m(context2);
                a.o(context2, str);
                c s1 = obj.b.s;
                a.m(s1);
                ViewPager mViewPager = s1.getMViewPager();
                s1 = obj.b.s;
                a.m(s1);
                LinearLayout mDotView = s1.getMDotView();
                c$b b1 = obj.b;
                c s2 = b1.s;
                a.m(s2);
                LiveTimeConsumingUserStatusResponse mLiveCarouse1 = obj1.mLiveCarouselPendantInfo;
                a.m(mLiveCarouse1);
                LiveCarouselPendantViewController liveCarousel = new LiveCarouselPendantViewController(c.P8(obj.b), context2, mViewPager, mDotView, b1.u, s2, mLiveCarouse1.interval);
                obj.b.t = s;
                c t = obj.b.t;
                if (t != null) {
                   t.c();
                }
                t = obj.b.r;
                if (t == null) {
                   a.S("mLiveRightPendantContainerService");
                }
                t.eo(obj.b.x);
                t = obj.b.t;
                if (t != null) {
                   t.f(1);
                }
                if (c.P8(obj.b).g != null) {
                   c$b b2 = obj.b;
                   b2.w = new e(obj, obj1);
                   if (c.P8(b2).g != null) {
                      t = obj.b.w;
                      Objects.requireNonNull(t, "null cannot be cast to non-null type com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayListener");
                      c.P8(obj.b).y2.P4(t);
                   }
                }
             }
          }
       }
       return;
    }
}
