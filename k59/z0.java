package k59.z0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k59.z0$a;
import nsd.u;
import k59.z0$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import k59.z0$c;
import android.view.View$OnTouchListener;
import com.kuaishou.webkit.WebView;
import yx.j0;
import k59.a1;
import r59.d;
import k59.h2;
import kotlin.jvm.internal.a;
import r59.c;
import v59.a;
import java.util.List;
import java.lang.Boolean;
import lnc.y0;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2;

public final class z0 extends PresenterV2	// class@002b3c
{
    public AdYodaFragment2 p;
    public BaseFeed q;
    public h2 r;
    public List s;
    public long t;
    public boolean u;
    public boolean v;
    public a w;
    public c x;
    public Runnable y;
    public static final z0$a z;

    static {
       z0.z = new z0$a(null);
    }
    public void z0(){
       super();
       this.v = true;
       this.y = new z0$b(this);
    }
    public void E8(){
       PhotoAdvertisement$H5ControlInfo mH5AutoJumpL;
       z0 tw;
       z0 oz0 = z0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oz0, "2")) {
          return;
       }
       if (this.p != null) {
          PhotoAdvertisement photoAdverti = k.A(this.q);
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
             if (adData != null) {
                adData = adData.mH5ControlInfo;
                if (adData != null) {
                   mH5AutoJumpL = adData.mH5AutoJumpLimitedTimeMs;
                label_0028 :
                   this.t = mH5AutoJumpL;
                   if (!mH5AutoJumpL) {
                      return;
                   }else {
                      z0 tp = this.p;
                      if (tp != null) {
                         YodaBaseWebView yodaBaseWebV = tp.Ch();
                         if (yodaBaseWebV != null) {
                            yodaBaseWebV.setOnTouchListener(new z0$c(this));
                         }
                      }
                      if (!PatchProxy.applyVoid(objArray, this, oz0, "3")) {
                         Object[] objArray1 = new Object[0];
                         j0.f("AdWebAutoJumpPresenter", "startInterceptAutoJump", objArray1);
                         if (!PatchProxy.applyVoid(objArray, this, oz0, "4")) {
                            if (this.x == null) {
                               this.x = new a1(this);
                            }
                            tp = this.r;
                            if (tp != null) {
                               d uod = tp.a();
                               if (uod != null) {
                                  z0 tx = this.x;
                                  a.m(tx);
                                  if (!uod.l(tx)) {
                                     tx = this.x;
                                     a.m(tx);
                                     uod.k(tx);
                                  }
                               }
                            }
                         }
                      label_0086 :
                         if (!PatchProxy.applyVoid(objArray, this, oz0, "5")) {
                            if (this.w == null) {
                               this.w = new a();
                            }
                            oz0 = this.s;
                            if (oz0 != null) {
                               tw = this.w;
                               a.m(tw);
                               objArray = Boolean.valueOf(oz0.contains(tw));
                            }
                            if (!y0.p(objArray)) {
                               oz0 = this.s;
                               if (oz0 != null) {
                                  tw = this.w;
                                  a.m(tw);
                                  oz0.add(tw);
                               }
                            }
                         }
                      }
                   label_00be :
                      oz0 = this.t;
                      if (oz0 > 0) {
                         k1.r(this.y, oz0);
                      }
                   }
                }
             }
             mH5AutoJumpL = 0;
             goto label_0028 ;
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, z0.class, "7")) {
          return;
       }
       k1.m(this.y);
       this.u = false;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, z0.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("AdWebAutoJumpPresenter", "stopInterceptAutoJump", objArray);
       this.v = false;
       z0 tw = this.w;
       if (tw != null) {
          z0 ts = this.s;
          if (ts != null) {
             ts.remove(tw);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z0.class, "1")) {
          return;
       }
       this.p = this.s8(AdYodaFragment2.class);
       this.q = this.s8(BaseFeed.class);
       this.r = this.s8(h2.class);
       this.s = this.t8("WEB_REQUEST_INTERCEPTOR_LIST");
       return;
    }
}
