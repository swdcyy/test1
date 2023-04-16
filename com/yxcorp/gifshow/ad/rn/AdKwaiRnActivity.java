package com.yxcorp.gifshow.ad.rn.AdKwaiRnActivity;
import com.kwai.kds.krn.api.page.KwaiRnActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import ekd.j0;
import com.kwai.framework.model.feed.BaseFeed;
import moc.b;
import vs6.b;
import t49.a;
import vs6.b$b;
import android.net.Uri;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.award.pendant.navigation.NeoNavigationPendantPresenter;
import android.view.View;
import im8.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p59.t;
import androidx.fragment.app.Fragment;
import com.kuaishou.krn.model.LaunchModel;
import fi0.c;
import java.lang.StringBuilder;
import yx.j0;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import com.yxcorp.gifshow.ad.webview.jshandler.d;
import u59.c;
import kotlin.jvm.internal.a;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import ekd.x0;
import u59.d;
import zl9.b;
import u59.e;
import u59.f;
import wi0.a;
import ik0.g;
import t49.c;
import t49.b;
import tl9.f;
import f55.c;
import com.kwai.bridge.context.AbsBridgeContext;
import tl9.b;
import com.kuaishou.krn.delegate.c$b;
import com.kuaishou.krn.delegate.c;

public class AdKwaiRnActivity extends KwaiRnActivity	// class@0017f6
{
    public PresenterV2 E;
    public t F;
    public BaseFeed G;
    public int H;

    public void AdKwaiRnActivity(){
       super();
       this.E = null;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AdKwaiRnActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       AdKwaiRnActivity uAdKwaiRnAct = AdKwaiRnActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAdKwaiRnAct, "1")) {
          return;
       }
       int i = j0.b(this.getIntent(), "KEY_FEED_KEY", -1);
       this.H = i;
       this.G = b.c(i, BaseFeed.class);
       if (!PatchProxy.applyVoid(null, this, uAdKwaiRnAct, "2")) {
          new b(new a(this), "adkrn").a(this, this.getIntent().getData());
       }
       super.onCreate(p0);
       PresenterV2 presenterV2 = new PresenterV2();
       this.E = presenterV2;
       presenterV2.U7(new NeoNavigationPendantPresenter());
       this.E.f(this.findViewById(0x1020002));
       Object[] objArray = new Object[]{this,new c("LINK_URL", this.getIntent().getDataString())};
       this.E.i(objArray);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AdKwaiRnActivity.class, "4")) {
          return;
       }
       super.onDestroy();
       AdKwaiRnActivity tF = this.F;
       if (tF != null) {
          tF.b();
       }
       tF = this.E;
       if (tF != null) {
          tF.destroy();
       }
       b.f(this.H);
       return;
    }
    public Fragment u3(){
       t d;
       Object[] objArray = null;
       KwaiRnActivity obj = PatchProxy.apply(objArray, this, AdKwaiRnActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj == null) {
          return objArray;
       }
       obj.g().putString("containerSource", "AdKwaiRnActivity");
       int i = 0;
       Object[] objArray1 = new Object[i];
       j0.f(c.a, "Krn启动参数为："+this.A, objArray1);
       KwaiRnFragment kwaiRnFragme = KwaiRnFragment.Yg(this.A);
       t ot = new t();
       this.F = ot;
       ot.a = this;
       ot.b = kwaiRnFragme.getView();
       this.F.d = this.G;
       g og = new g(this);
       String dataString = this.getIntent().getDataString();
       d.a(og, this.F, dataString);
       c uoc = new c(og, this.F, dataString);
       if (!PatchProxy.applyVoid(objArray, uoc, c.class, "1")) {
          d = uoc.b.d;
          if (d != null) {
             a.o(d, "mBridgeContext.mFeed ?: return");
             PhotoAdvertisement photoAdverti = d.get("AD");
             if (photoAdverti != null) {
                PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
                if (adData != null) {
                   objArray = adData.mAdExposedInfo;
                }
                int i1 = 1;
                if (objArray == null || !objArray.length()) {
                   i = 1;
                }
                if (!i && !(a.g(x0.a(x0.f(uoc.c), "bundleId"), "CommercialWhiteBox") ^ i1)) {
                   uoc.a.f(new d(d, photoAdverti, objArray));
                   uoc.a.f(new e(uoc, uoc.b.a, d));
                   uoc.a.f(new f(uoc, d));
                }
             }
          }
       }
       a uoa = new a(kwaiRnFragme);
       uoa.n(f.class, new c(og));
       uoa.n(b.class, new b(this.G));
       kwaiRnFragme.setKrnDelegateConfig(c.a().b("KDS_BRIDGE_CONTEXT", uoa).a());
       return kwaiRnFragme;
    }
}
