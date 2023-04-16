package d59.i;
import y49.f;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter;
import java.lang.String;
import msd.l;
import org.json.JSONObject;
import a59.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yx.j0;
import java.lang.System;
import android.net.Uri;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig;
import com.kwai.adclient.kscommerciallogger.snapshot.Span;
import d59.i$a;
import java.util.Map;
import z1.a;
import x49.a;
import a59.e;

public final class i extends f	// class@00204f
{
    public final AdMKPageLoadPresenter d;

    public void i(AdMKPageLoadPresenter p0,String p1,l p2){
       this.d = p0;
       super(p1, p2);
    }
    public Object c(JSONObject p0,a p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       obj = "pageId";
       String str = p0.optString(obj);
       if (this.d.getContext() != null) {
          Object[] objArray = new Object[0];
          j0.f("AdMKLoadPresenter", "getPageJson Bridge run", objArray);
          this.d.W8(true);
          long l = System.currentTimeMillis();
          AdMKPageLoadPresenter z = this.d.z;
          String host = (z != null)? z.getHost(): null;
          String str1 = host;
          a.o(str, obj);
          AdMKPageLoadPresenter v = this.d.v;
          if (v == null) {
             a.S("mAdMKPageConfig");
          }
          i td = this.d;
          Span span = td.R8();
          i$a uoa = new i$a(l, this, str, p1);
          a.e(str1, str, v.f(), td.C, span, v10);
       }
       return this.e();
    }
}
