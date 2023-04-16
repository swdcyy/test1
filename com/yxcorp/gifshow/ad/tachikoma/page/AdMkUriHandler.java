package com.yxcorp.gifshow.ad.tachikoma.page.AdMkUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMkUriHandler$a;
import nsd.u;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.content.Context;
import xh7.a;
import yh7.a;
import android.app.Activity;
import lnc.a1;
import yx.j0;
import android.net.Uri;
import ekd.x0;
import java.lang.Boolean;
import java.util.Map;
import moc.b;
import java.lang.Integer;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageActivity;
import java.util.Objects;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageActivity$a;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.os.Parcelable;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class AdMkUriHandler extends AnnotationUriHandler	// class@001838
{
    public static final AdMkUriHandler$a b;

    static {
       AdMkUriHandler.b = new AdMkUriHandler$a(null);
    }
    public void AdMkUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdMkUriHandler.class, str)) {
          return;
       }
       a.p(p0, "uriRequest");
       a.p(p1, "uriCallback");
       Context uContext = p0.b();
       a.o(uContext, "uriRequest.context");
       a uoa = new a(200);
       if (uContext instanceof Activity && !a1.i(uContext)) {
          Object[] objArray = new Object[0];
          j0.c("AdMkHandler", "context will destroy", objArray);
          uoa.a = 406;
          p1.a(uoa);
          return;
       }else {
          Uri uri = p0.g();
          a.o(uri, "uriRequest.uri");
          boolean b = Boolean.parseBoolean(x0.b(uri, "debug", "false"));
          Map map = p0.c(Map.class, "EXTRA_CONTEXT_MAP");
          String str1 = null;
          if (map != null) {
             str1 = Integer.valueOf(b.d(map.get("QPhoto")));
          }
          AdMKPageConfig uAdMKPageCon = new AdMKPageConfig(uri, str1, b);
          AdMKPageActivity$a z = AdMKPageActivity.z;
          Objects.requireNonNull(z);
          Intent intent = PatchProxy.applyTwoRefs(uContext, uAdMKPageCon, z, AdMKPageActivity$a.class, str);
          if (intent != PatchProxyResult.class) {
          }else {
             a.p(uContext, "context");
             a.p(uAdMKPageCon, "config");
             intent = new Intent(uContext, AdMKPageActivity.class);
             intent.putExtra("ad_mk_config", uAdMKPageCon);
          }
          if (!uContext instanceof GifshowActivity) {
             intent.setFlags(0x10000000);
          }
          uContext.startActivity(intent);
          p1.a(uoa);
          return;
       }
    }
}
