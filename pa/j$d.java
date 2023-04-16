package pa.j$d;
import erd.g;
import pa.j;
import java.lang.Object;
import ox8.e;
import java.lang.StringBuilder;
import java.lang.String;
import yx.j0;
import ql9.e$c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NovelCardInfo;
import mxb.c;
import x49.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import x49.l$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import com.example.commercial.diversead.banner.AdTKBannerView;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.ad.widget.RoundCornerLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import ql9.e$a;
import kotlin.jvm.internal.a;
import pa.k;
import ux.b;
import java.lang.Class;
import java.lang.reflect.Constructor;
import sx.d;
import rx.d;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import rx.b;
import rx.d$b;
import a59.f;
import n49.o;
import ux.a;
import com.example.commercial.diversead.banner.AdTKBannerView$renderBanner$tkBridgeContext$1;
import com.example.commercial.diversead.banner.AdTKBannerView$renderBanner$tkBridgeContext$2;
import android.app.Activity;
import mxb.u;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import msd.l;
import a59.j;
import a59.k;
import msd.r;
import java.lang.Integer;
import java.util.Map;
import msd.a;
import gr.c;
import com.kwai.framework.player.core.b;
import io.reactivex.subjects.PublishSubject;
import nsd.u;
import tkd.b;
import tkd.d;
import nl9.m;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import com.example.commercial.diversead.banner.AdTKBannerView$renderBanner$1;
import pa.b;
import com.example.commercial.diversead.banner.AdTKBannerView$renderBanner$3;
import a59.c;
import pa.c;
import com.example.commercial.diversead.banner.AdTKBannerView$renderBanner$5;
import pa.d;
import com.example.commercial.diversead.banner.AdTKBannerView$renderBanner$7;
import android.view.ViewGroup;
import com.yxcorp.gifshow.ad.tachikoma.a;
import pa.e;
import x49.q;
import java.lang.Exception;

public final class j$d implements g	// class@002901
{
    public final j b;

    public void j$d(j p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       j b;
       TkBridgeGroup tkBridgeGrou1;
       j$d uod = this;
       e uoe = p0;
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "KsBannerAdControl";
       j0.f(str, "AdSdkFetchResult : "+uoe.e(), objArray);
       if (!uoe.e()) {
          Object[] objArray1 = new Object[i];
          j0.c(str, "adSdkFetchResult error"+uoe.a(), objArray1);
          b = uod.b.b;
          if (b != null) {
             b.onError(-1, uoe.b());
          }
          uod.b.b();
       }else {
          uod.b.a = uoe.c();
          j$d b1 = uod.b;
          b = b1.a;
          if (b != null) {
             if (b1.e != null) {
                Object[] objArray2 = new Object[i];
                j0.c(str, "KsBannerAdControl has abandon, not render", objArray2);
             }else {
                PhotoAdvertisement photoAdverti = k.B(b);
                if (photoAdverti != null) {
                   PhotoAdvertisement$NovelCardInfo novelCardInf = c.w(b1.a);
                   l$a a = l.a;
                   TkBridgeGroup tkBridgeGrou = null;
                   PhotoAdvertisement$NovelCardInfo mTemplateId = (novelCardInf != null)? novelCardInf.mTemplateId: tkBridgeGrou;
                   PhotoAdvertisement$TkTemplateData tkTemplateDa = a.b(mTemplateId, photoAdverti);
                   novelCardInf = (novelCardInf != null)? novelCardInf.mTemplateId: tkBridgeGrou;
                   PhotoAdvertisement$TkTemplateInfo tkTemplateIn = a.a(novelCardInf, photoAdverti);
                   AdTKBannerView uAdTKBannerV = new AdTKBannerView(b1.f);
                   b1.d = uAdTKBannerV;
                   uAdTKBannerV.setRadius((float)n.c(b1.f, 6.00f));
                   ViewGroup$LayoutParams layoutParams = new ViewGroup$LayoutParams(-2, -2);
                   j d = b1.d;
                   if (d != null) {
                      d.setLayoutParams(layoutParams);
                   }
                   j d1 = b1.d;
                   if (d1 != null) {
                      d1.setAdInteractionListener(b1.c);
                   }
                   d1 = b1.d;
                   if (d1 != null) {
                      j f = b1.f;
                      j a1 = b1.a;
                      a.m(a1);
                      k ok = new k(b1, photoAdverti);
                      a.p(f, "activity");
                      a.p(a1, "qPhoto");
                      Object[] objArray3 = new Object[i];
                      j0.f("bannerLeakLog", "‰÷»æπ„∏Ê "+d1, objArray3);
                      d1.removeAllViews();
                      if (tkTemplateIn == null || tkTemplateDa == null) {
                         objArray3 = new Object[i];
                         j0.c("AdTKBannerView", "template info is null", objArray3);
                         ok.a(new Exception("template info is null"));
                      }else {
                         d1.m = a1;
                         String str1 = d1.d(a1);
                         int i1 = 1;
                         Class[] uClassArray = new Class[i1];
                         uClassArray[i] = str1.getClass();
                         Object[] objArray4 = new Object[i1];
                         objArray4[i] = str1;
                         AdTKBannerView obj = b.class.getDeclaredConstructor(uClassArray).newInstance(objArray4);
                         a.o(obj, "T::class.java.getDeclare°≠ava\).newInstance\(session\)");
                         Object obj1 = obj;
                         QPhoto mEntity = a1.mEntity;
                         a.o(mEntity, "qPhoto.mEntity");
                         d$b.b(obj1, mEntity, null, null, false, 14, null);
                         String str2 = d1.d(a1);
                         o oo = (a.g("undefined", str2))? new o(): new a(str2);
                         AdTKBannerView$renderBanner$tkBridgeContext$1 orenderBanne = i;
                         AdTKBannerView$renderBanner$tkBridgeContext$1 orenderBanne1 = new AdTKBannerView$renderBanner$tkBridgeContext$1(d1);
                         AdTKBannerView$renderBanner$tkBridgeContext$2 orenderBanne2 = orenderBanne1;
                         AdTKBannerView$renderBanner$tkBridgeContext$2 orenderBanne3 = new AdTKBannerView$renderBanner$tkBridgeContext$2(d1);
                         f uof = new f(f, a1, tkTemplateIn, oo, tkTemplateDa, null, null, null, null, null, null, orenderBanne, null, null, null, orenderBanne2, null, null, null, 0x777e0, null);
                         obj = d.a(-2125799450).qY(obj);
                         if (obj instanceof TkBridgeGroup) {
                            tkBridgeGrou = obj;
                         }
                         d1.k = tkBridgeGrou;
                         if (tkBridgeGrou != null) {
                            tkBridgeGrou.j("preRenderConfig", new AdTKBannerView$renderBanner$1(d1));
                         }
                         obj = d1.k;
                         if (obj != null) {
                            obj.i(new b(d1, "getPlayerFeed", AdTKBannerView$renderBanner$3.INSTANCE));
                         }
                         obj = d1.k;
                         if (obj != null) {
                            obj.i(new c(d1, "registerVideoObserveNativeStatusListener", AdTKBannerView$renderBanner$5.INSTANCE));
                         }
                         obj = d1.k;
                         if (obj != null) {
                            obj.i(new d(d1, "tkPlayerReportVse", AdTKBannerView$renderBanner$7.INSTANCE));
                         }
                         d1.j.a(d1, d1.k, true);
                         d1.j.b(tkTemplateIn, new e(ok));
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
