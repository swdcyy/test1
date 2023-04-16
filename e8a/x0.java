package e8a.x0;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.k$a;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import zz5.f;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.k;
import com.yxcorp.gifshow.entity.QPhoto;
import f6a.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.google.common.base.Optional;
import com.yxcorp.gifshow.detail.slideplay.nasa.a;
import ok.h;
import zz5.g;
import java.util.Map;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import androidx.fragment.app.Fragment;
import com.kwai.component.photo.detail.slide.degrade.SlidePlayDegradeApi;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import zz5.d;

public final class x0 implements Runnable	// class@0020e2
{
    public final k$a b;

    public void x0(k$a p0){
       this.b = p0;
    }
    public final void run(){
       boolean b1;
       f a;
       x0 tb = this.b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = new f(tb.c.p);
       boolean b = true;
       uof.a(b);
       k p = tb.c.p;
       i oi = i.class;
       String str = "1";
       Object obj = PatchProxy.applyOneRefsWithListener(p, null, oi, str);
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          b1 = Optional.fromNullable(p.getPhotoMeta()).transform(a.b).or(Boolean.FALSE).booleanValue();
          PatchProxy.onMethodExit(oi, str);
       }
       if (b1) {
          if (PatchProxy.apply(null, uof, f.class, "2") != patchProxyRe) {
          }else {
             f b2 = uof.b;
             a = uof.a;
             if (!PatchProxy.applyVoidTwoRefs(b2, a, null, g.class, "6")) {
                b2.put("enablePlcEntry", String.valueOf(b));
                b2.put("plcFeatureEntryData", r1.w1(a.mEntity));
             }
          }
       }
       if (tb.c.r.isAdded()) {
          k$a c = tb.c;
          k p1 = c.p;
          k r = c.r;
          RequestTiming oN_HOME_PAGE = (SlidePlayDegradeApi.PHOTO_START_UP.shouldDegrade())? RequestTiming.ON_HOME_PAGE_CREATED: RequestTiming.DEFAULT;
          d.h(p1, r, null, uof, oN_HOME_PAGE);
       }
       return;
    }
}
