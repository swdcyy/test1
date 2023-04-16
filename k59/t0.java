package k59.t0;
import k59.t0$a;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import dy8.a;
import wkd.b;
import mxb.f0;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import tw.f;
import com.yxcorp.gifshow.ad.webview.AdNeoH5VideoModel$fetchAvatarInfoResponseIfNeed$1;
import k59.u0;
import msd.l;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import androidx.lifecycle.Observer;
import zz5.d;
import zz5.f;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import brd.t;
import k59.v0;
import k59.w0;
import erd.g;
import crd.b;
import java.lang.Boolean;
import n49.d;
import android.app.Activity;
import n49.e;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import lnc.b9;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User$FollowStatus;

public final class t0	// class@002b1b
{
    public AvatarInfoResponse a;
    public b b;
    public final a c;
    public final QPhoto d;
    public final u e;
    public final GifshowActivity f;
    public static final t0$a g;

    static {
       t0.g = new t0$a(null);
    }
    public void t0(QPhoto p0,u p1,GifshowActivity p2){
       a.p(p0, "mQPhoto");
       a.p(p1, "mClickProcessor");
       a.p(p2, "mActivity");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.c = new a(p0);
       b.a(-762347696).r1(p0.getEntity(), "key_enteraction", Integer.valueOf(7));
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t0.class, "3")) {
       }else {
          PhotoAdvertisement photoAdverti1 = k.B(p0);
          if (photoAdverti1 != null) {
             a.o(photoAdverti1, "CommercialFeedExt.getPhotoAd\(mQPhoto\) ?: return");
             if (photoAdverti1.mConversionType == 6 && !f.h(photoAdverti1)) {
                d.c(p0, p2, new u0(new AdNeoH5VideoModel$fetchAvatarInfoResponseIfNeed$1(this)));
                f uof = new f(p0);
                uof.a(true);
                d.i(p0, p2, objArray, uof, RequestTiming.DEFAULT);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, t0.class, "2")) {
          PhotoAdvertisement photoAdverti = k.B(p0);
          if (photoAdverti != null) {
             a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mQPhoto\) ?: return");
             photoAdverti = photoAdverti.mConversionType;
             if (photoAdverti != 6 && (photoAdverti == 7 || photoAdverti == 8)) {
                this.b = RxBus.f.f(n.class).subscribe(new v0(this), w0.b);
             }
          }
       }
       return;
    }
    public final void a(boolean p0,int p1){
       t0 ot0 = t0.class;
       if (PatchProxy.isSupport(ot0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, ot0, "6")) {
          return;
       }
       PhotoAdvertisement photoAdverti = k.B(this.d);
       if (photoAdverti != null) {
          a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mQPhoto\) ?: return");
          photoAdverti = photoAdverti.mConversionType;
          if (photoAdverti != 1) {
             if (photoAdverti != 6) {
                if (photoAdverti != 7) {
                   if (photoAdverti != 8) {
                      if (p0) {
                         d uod = d.a();
                         uod.b(p1);
                         a.o(uod, "ClickParams.newInstance\(¡­tClickType\(itemClickType\)");
                         this.e.c(this.d, this.f, uod);
                      }else {
                         this.e.a(this.d, this.f, new e(p1));
                      }
                   }else if(p0){
                      this.c.a(p1, this.f);
                   }else {
                      this.c.d(p1, this.f);
                   }
                }else {
                   this.c.d(p1, this.f);
                }
             }else {
                this.c.c(p1, this.f, this.a);
             }
          }else {
             this.e.a(this.d, this.f, new e(p1));
          }
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, t0.class, "1")) {
          return;
       }
       this.a = null;
       b9.a(this.b);
       return;
    }
    public final void onFollowUpdateEvent(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t0.class, "5")) {
          return;
       }
       if (p0.d != null) {
          return;
       }
       if (TextUtils.n(p0.b, this.d.getUserId())) {
          if (p0.c != null) {
             this.c.e(User$FollowStatus.FOLLOWING, this.a);
          }else {
             this.c.e(User$FollowStatus.UNFOLLOW, this.a);
          }
       }
       return;
    }
}
