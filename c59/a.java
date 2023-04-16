package c59.a;
import lnc.g2$a;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKFragment;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import d59.a;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig;
import d59.h;
import d59.c;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter;

public final class a implements g2$a	// class@0004e0
{
    public final AdMKFragment b;

    public void a(AdMKFragment p0){
       this.b = p0;
       super();
    }
    public final PresenterV2 B2(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.applyWithListener(objArray, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       PresenterV2 presenterV2 = PatchProxy.applyWithListener(objArray, obj, AdMKFragment.class, "4");
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          presenterV2.U7(new a());
          AdMKFragment l = obj.l;
          if (l == null || l.b() != true) {
             presenterV2.U7(new h());
          }
          presenterV2.U7(new c());
          presenterV2.U7(new AdMKPageLoadPresenter());
          PatchProxy.onMethodExit(AdMKFragment.class, "4");
       }
       PatchProxy.onMethodExit(a.class, "1");
       return presenterV2;
    }
}
