package com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoActionHandler$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoActionHandler;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.AdNeoH5VideoData;
import zl9.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import lnc.k;
import com.kuaishou.android.model.ads.AdNeoInfo;
import java.lang.Long;
import p59.t;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.kwai.component.uiconfig.browsestyle.model.BrowseStyle;
import uh5.e;
import kotlin.jvm.internal.a;
import org.json.JSONArray;
import ol9.b;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import zsd.d;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import yx.j0;
import wkd.b;
import u49.h;
import s00.b$b;
import s00.b;
import brd.t;
import o49.h;
import o49.f;
import p49.c;
import p49.c$a;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoActionHandler$requestData$1;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import msd.l;
import nsd.u;
import com.kwai.framework.model.feed.BaseFeed;
import brd.x;
import cjd.e;
import erd.o;
import p59.e;
import p59.f;
import erd.g;
import crd.b;
import crd.a;

public final class AdNeoH5VideoActionHandler$c implements Runnable	// class@0018da
{
    public final AdNeoH5VideoActionHandler b;
    public final AdNeoH5VideoData c;
    public final e d;

    public void AdNeoH5VideoActionHandler$c(AdNeoH5VideoActionHandler p0,AdNeoH5VideoData p1,e p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, AdNeoH5VideoActionHandler$c.class, "1")) {
          return;
       }
       AdNeoH5VideoActionHandler$c b = obj.b;
       AdNeoH5VideoActionHandler$c c = obj.c;
       AdNeoH5VideoActionHandler$c d = obj.d;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidTwoRefs(c, d, b, AdNeoH5VideoActionHandler.class, "4")) {
          String str = PatchProxy.applyOneRefs(c, b, AdNeoH5VideoActionHandler.class, "6");
          int i = 0;
          if (str != PatchProxyResult.class) {
          }else {
             JSONObject jSONObject = new JSONObject();
             k.a(jSONObject);
             JSONObject jSONObject1 = new JSONObject();
             AdNeoInfo adInfo2 = c.getAdInfo();
             Long longx = (adInfo2 != null)? Long.valueOf(adInfo2.mPageId): objArray;
             jSONObject1.put("pageId", longx);
             adInfo2 = c.getAdInfo();
             if (adInfo2 != null) {
                objArray = Long.valueOf(adInfo2.mSubPageId);
             }
             jSONObject1.put("subPageId", objArray);
             jSONObject1.put("action", i);
             jSONObject1.put("width", n.k(b.c.a));
             jSONObject1.put("height", n.j(b.c.a));
             BrowseStyle uBrowseStyle = e.d();
             a.o(uBrowseStyle, "BrowseStyleUtils.getBrowseStyle\(\)");
             jSONObject1.put("browseType", uBrowseStyle.getParamType());
             JSONArray jSONArray = new JSONArray();
             b.a(jSONArray, jSONObject1);
             jSONObject.put("impInfo", jSONArray);
             str = jSONObject.toString();
             a.o(str, "params.toString\(\)");
          }
          MXSec mXSec = MXSec.get();
          a.o(mXSec, "MXSec.get\(\)");
          Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
          byte[] bytes = str.getBytes(d.a);
          a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
          byte[] uobyteArray = mXSec.getWrapper().atlasEncrypt("KwaiAdAwardVideo", "95147564-9763-4413-a937-6f0e3c12caf1", i, bytes);
          MXSec mXSec1 = MXSec.get();
          a.o(mXSec1, "MXSec.get\(\)");
          Object[] objArray1 = new Object[i];
          j0.f("adNeoH5VideoAction", "params: "+str, objArray1);
          t ot = b.a(0x49c6a210).a(b.b().a(uobyteArray), mXSec1.getWrapper().atlasSign("KwaiAdAwardVideo", "95147564-9763-4413-a937-6f0e3c12caf1", i, str));
          AdNeoInfo adInfo = c.getAdInfo();
          AdNeoInfo uAdNeoInfo = null;
          AdNeoInfo mPageId = (adInfo != null)? adInfo.mPageId: uAdNeoInfo;
          AdNeoInfo adInfo1 = c.getAdInfo();
          if (adInfo1 != null) {
             uAdNeoInfo = adInfo1.mSubPageId;
          }
          f uof = new f(c.Z.k(), null, AdNeoH5VideoActionHandler$requestData$1.INSTANCE, null, 10, null);
          f uof1 = adInfo1;
          h oh = new h(null, mPageId, uAdNeoInfo, uof1, 0, 17, 0);
          b uob = ot.compose(v15).map(new e()).subscribe(new e(b, d), new f(d));
          a.o(uob, "Singleton.get\(NeoVideoAd¡­sage}\"\)\n        }\n      \)");
          if (!PatchProxy.applyVoidOneRefs(uob, b, AdNeoH5VideoActionHandler.class, "3")) {
             AdNeoH5VideoActionHandler b1 = b.b;
             if (b1 == null || b1.isDisposed() == true) {
                b.b = new a();
             }
             AdNeoH5VideoActionHandler b2 = b.b;
             if (b2 != null) {
                b2.c(uob);
             }
          }
       }
    label_018e :
       return;
    }
}
