package ez8.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ez8.a$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper$c;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HeaderData;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$HalfLandingPageInfo;
import n49.s;
import com.yxcorp.gifshow.ad.detail.AdDownloadProgressHelper;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import com.yxcorp.gifshow.commercial.adsdk.model.AdUrlInfo;
import tw.c;
import com.yxcorp.gifshow.ad.widget.BaseAdProgressView;
import tw.j;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import qrd.l1;
import com.yxcorp.gifshow.ad.widget.AdDownloadProgressBar;
import ez8.b;
import android.view.View$OnClickListener;
import ez8.c;
import java.lang.Runnable;
import android.widget.FrameLayout;
import android.view.View;
import ekd.m1;
import bz8.n;
import n49.o;

public final class a extends PresenterV2	// class@00226c
{
    public QPhoto p;
    public PhotoAdvertisement$HeaderData q;
    public o r;
    public AdDownloadProgressHelper s;
    public AdDownloadProgressBar t;
    public static final a$a u;

    static {
       a.u = new a$a(null);
    }
    public void a(){
       super();
    }
    public void E8(){
       a tt;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          a tq = this.q;
          if (tq == null) {
             a.S("mHeaderData");
          }
          PhotoAdvertisement$HeaderData mButtonText = tq.mButtonText;
          PhotoAdvertisement$HalfLandingPageInfo halfLandingP = PatchProxy.apply(objArray, this, uoa, "9");
          if (halfLandingP != PatchProxyResult.class) {
          }else {
             tt = this.p;
             if (tt == null) {
                a.S("mPhoto");
             }
             PhotoAdvertisement photoAdverti1 = k.B(tt);
             if (photoAdverti1 != null) {
                a.o(photoAdverti1, "it");
                PhotoAdvertisement$AdData adData = photoAdverti1.getAdData();
                if (adData != null) {
                   adData = adData.mHalfLandingPageInfo;
                   if (adData != null) {
                      PhotoAdvertisement$HalfLandingPageInfo mActionbarCo = adData.mActionbarColor;
                      if (mActionbarCo != null) {
                         halfLandingP = mActionbarCo;
                      }
                   }
                }
                halfLandingP = s.e(photoAdverti1);
             }else {
                halfLandingP = objArray;
             }
          }
          AdDownloadProgressHelper$c uoc = new AdDownloadProgressHelper$c(mButtonText, halfLandingP, "E6");
          tt = this.t;
          if (tt == null) {
             a.S("mActionbarView");
          }
          a tp = this.p;
          if (tp == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement photoAdverti = k.B(tp);
          a.m(photoAdverti);
          a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mPhoto\)!!");
          AdDownloadProgressHelper uAdDownloadP = new AdDownloadProgressHelper(tt, c.a(photoAdverti), uoc);
          a tp1 = this.p;
          if (tp1 == null) {
             a.S("mPhoto");
          }
          if (j.D(tp1)) {
             Activity activity = this.getActivity();
             if (!activity instanceof GifshowActivity) {
                activity = objArray;
             }
             Lifecycle lifecycle = (activity != null)? activity.getLifecycle(): objArray;
             uAdDownloadP.d(lifecycle);
          }
          uAdDownloadP.e();
          uAdDownloadP.b();
          this.s = uAdDownloadP;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "7")) {
          uoa = this.t;
          if (uoa == null) {
             a.S("mActionbarView");
          }
          uoa.setTextSize(12.00f);
          uoa = this.t;
          if (uoa == null) {
             a.S("mActionbarView");
          }
          uoa.setOnClickListener(new b(this));
          uoa = this.t;
          if (uoa == null) {
             a.S("mActionbarView");
          }
          uoa.post(new c(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a ts = this.s;
       if (ts != null) {
          ts.f();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.action_bar);
       a.o(p0, "ViewBindUtils.bindWidget¡­ootView, R.id.action_bar\)");
       this.t = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.q8(n.class);
       a.o(obj, "inject\(HalfLandingItem::class.java\)");
       this.q = obj.a();
       obj = this.q8(o.class);
       a.o(obj, "inject\(PhotoAdActionBarClickProcessor::class.java\)");
       this.r = obj;
       return;
    }
}
