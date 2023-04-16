package com.yxcorp.gifshow.ad.tachikoma.page.AdtkUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkUriHandler$a;
import nsd.u;
import xh7.b;
import qh7.c;
import com.kwai.robust.PatchProxyResult;
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
import java.util.Map;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import x49.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import x49.l$a;
import com.kuaishou.tk.api.b;
import tkd.b;
import tkd.d;
import rx4.i;
import xf6.l;
import java.lang.StringBuilder;
import c59.j;
import moc.b;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkPageConfig;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkActivity;
import java.util.Objects;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkActivity$a;
import android.content.Intent;
import android.os.Parcelable;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qh7.b;
import qh7.a;
import e17.i;

public final class AdtkUriHandler extends AnnotationUriHandler	// class@001847
{
    public static final AdtkUriHandler$a b;

    static {
       AdtkUriHandler.b = new AdtkUriHandler$a(null);
    }
    public void AdtkUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       boolean b;
       boolean b1;
       Object[] objArray1;
       Object obj = this;
       Object[] obj1 = p0;
       AdtkActivity$a obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdtkUriHandler uAdtkUriHand = AdtkUriHandler.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, uAdtkUriHand, "1")) {
          return;
       }
       a.p(obj1, "uriRequest");
       a.p(obj2, "uriCallback");
       Context uContext = p0.b();
       a.o(uContext, "uriRequest.context");
       a uoa = new a(200);
       String str = "adtkHandler";
       int i = 0;
       if (uContext instanceof Activity && !a1.i(uContext)) {
          obj1 = new Object[i];
          j0.c(str, "context will destroy", obj1);
          uoa.a = 406;
          obj2.a(uoa);
          return;
       }else {
          Uri uri = p0.g();
          a.o(uri, "uriRequest.uri");
          String str1 = "";
          String str2 = x0.b(uri, "templateId", str1);
          String str3 = "tkPageType";
          String str4 = x0.b(uri, str3, str1);
          Map map = obj1.c(Map.class, "EXTRA_CONTEXT_MAP");
          obj2 = PatchProxy.applyTwoRefs(map, str2, obj, uAdtkUriHand, "2");
          Uri uri1 = uri;
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(map == null || str2 == null){
             Object[] objArray = new Object[0];
             j0.c(str, " extraData is null or templateId is null "+str2, objArray);
             b1 = 1;
             AdtkUriHandler.b.a(str1, b1);
             b = true;
          label_012c :
             if (!b) {
                if (map != null) {
                   j.b.b(b1);
                   a.o(str2, "templateId");
                   a.o(str4, str3);
                   AdtkPageConfig uAdtkPageCon = new AdtkPageConfig(0x3f4ccccd, str2, b.d(map.get("QPhoto")), str4, 16.00f);
                   obj2 = AdtkActivity.A;
                   Objects.requireNonNull(obj2);
                   Intent intent = PatchProxy.applyTwoRefs(uContext, map, obj2, AdtkActivity$a.class, "1");
                   if (intent != patchProxyRe) {
                   }else {
                      a.p(uContext, "context");
                      a.p(map, "config");
                      intent = new Intent(uContext, AdtkActivity.class);
                      intent.putExtra("adtk_config", map);
                   }
                   if (!uContext instanceof GifshowActivity) {
                      intent.setFlags(0x10000000);
                   }
                   uContext.startActivity(intent);
                }
             }else {
                int i1 = 404;
                uoa.a = i1;
                String str5 = x0.a(uri1, "backupUrl");
                if (!TextUtils.x(str5)) {
                   a.b(new b(uContext, str5), null);
                }else {
                   uoa.a = i1;
                   a.o(i.e(R.style.arg_RES_7f11066a, "“≥√Ê√ª’“µΩ", 0), "KSToast.applyStyle\(R.sty°≠oastManager.LENGTH_SHORT\)");
                }
             }
             p1.a(uoa);
             return;
          }else {
             PhotoAdvertisement obj3 = map.get("QPhoto");
             if (obj3 != null) {
                obj3 = k.B(obj3);
                if (obj3 == null || l.a.b(str2, obj3) == null) {
                   AdtkUriHandler.b.a(str2, 2);
                   objArray1 = new Object[0];
                   j0.f(str, "adtk page data is invalid ", objArray1);
                }else {
                   b obj4 = PatchProxy.apply(null, obj, uAdtkUriHand, "3");
                   if (obj4 != patchProxyRe) {
                      b = obj4.booleanValue();
                   }else {
                      obj4 = b.b();
                      a.o(obj4, "TKPluginManager.getInstance\(\)");
                      if (obj4.d()) {
                         obj4 = d.a(0x256720e1);
                         a.o(obj4, "PluginManager.get\(TKPlugin::class.java\)");
                         if (obj4.k4()) {
                            b = true;
                         }
                      }
                      b = false;
                   }
                   if (!b) {
                      objArray1 = new Object[0];
                      j0.f(str, "adtk page v8 so not load success ,now downgrade ", objArray1);
                      AdtkUriHandler.b.a(str2, 3);
                   }else {
                      b = false;
                      if (l.c("adTkPageForceDowngrade", b)) {
                         AdtkUriHandler.b.a(str2, 999);
                      }else {
                         AdtkUriHandler.b.a(str2, b);
                      }
                   }
                }
             }
             b = true;
          }
          b1 = true;
          goto label_012c ;
       }
    }
}
