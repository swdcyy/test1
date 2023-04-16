package b8a.t0$a;
import d6a.a;
import b8a.t0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import az6.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import im8.f;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;

public class t0$a extends a	// class@0003f4
{
    public final t0 b;

    public void t0$a(t0 p0){
       this.b = p0;
       super();
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t0$a.class, "1")) {
          return;
       }
       t0$a tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.apply(objArray, tb, t0.class, "4");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): tb.p.q(tb.r.mPhotoIndex);
       if (this.b.s.getNasaSlideParam().mDisableAllSmoothSwipeBack == null && (!this.b.t.get().booleanValue() && i)) {
          this.b.t.set(Boolean.TRUE);
          new c(this.b.getActivity()).a();
       }
    label_0063 :
       tb = this.b;
       t0 r = this.b.r;
       tb.p.z1(tb.r.getSlidePlayConfig(), r.mSlidePlayId, r.mDetailCommonParam.getUnserializableBundleId(), this.b.s.getNasaSlideParam().mIsHotSpotAnchorRedirect);
       return;
    }
}
