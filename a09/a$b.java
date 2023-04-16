package a09.a$b;
import a09.b;
import a09.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo;
import java.lang.Boolean;
import im8.f;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.kwai.framework.model.feed.BaseFeed;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.view.AdPlayEndBaseView;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import a09.g;
import android.view.View;
import android.view.ViewGroup;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$2;
import msd.a;

public final class a$b implements b	// class@00000a
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       a p1;
       g a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "1")) {
          return;
       }
       a$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a.class, "12") && ta.P8()) {
          a p = ta.p;
          String str = "mPhoto";
          if (p == null) {
             a.S(str);
          }
          PhotoAdvertisement photoAdverti = k.B(p);
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
             if (adData != null) {
                adData = adData.mRequestEApiInfo;
                if (adData != null) {
                   adData.setExpireIfDataNullWhenShowed();
                }
             }
          }
          p = ta.C;
          if (p != null) {
             a s = ta.s;
             if (s == null) {
                a.S("mIsPlayEndScreenPrepare");
             }
             Boolean tRUE = Boolean.TRUE;
             s.set(tRUE);
             if (!ta.R8()) {
                j0 oj0 = o.z();
                int i = 531;
                p1 = ta.p;
                if (p1 == null) {
                   a.S(str);
                }
                oj0.e(i, p1.mEntity).a();
             }
             p.setVisibility(0);
             p.c();
             a y = ta.y;
             if (y == null) {
                a.S("mDetailParam");
             }
             if (y.enableSlidePlay()) {
                a = g.a;
                p1 = ta.p;
                if (p1 == null) {
                   a.S(str);
                }
                a.a(p1, p.findViewById(R.id.ad_play_end_container));
             }
             p = ta.t;
             if (p == null) {
                a.S("mIsPlayEndScreenVisible");
             }
             p.set(tRUE);
             p = ta.x;
             if (p == null) {
                a.S("mAdPlayEndViewState");
             }
             p.onNext(tRUE);
             a w = ta.w;
             if (w == null) {
                a.S("mPlayEndVisibilityPublish");
             }
             w.onNext(Integer.valueOf(0));
          }
       }
    label_00c2 :
       return;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.P8();
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$b.class, "2")) {
          return;
       }
       a$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, a.class, "13")) {
          a c = ta.C;
          if (c != null && ta.R8()) {
             a s = ta.s;
             if (s == null) {
                a.S("mIsPlayEndScreenPrepare");
             }
             s.set(Boolean.FALSE);
             c.b();
             new BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$1(c, ta).invoke(new BaseAdPlayEndPresenter$hidePlayEnd$$inlined$let$lambda$2(c, ta));
          }
          a w = ta.w;
          if (w == null) {
             a.S("mPlayEndVisibilityPublish");
          }
          w.onNext(Integer.valueOf(8));
       }
       return;
    }
}
