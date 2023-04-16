package com.yxcorp.gifshow.ad.detail.router.AdCommonWebUriHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import com.yxcorp.gifshow.ad.detail.router.AdCommonWebUriHandler$a;
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
import com.yxcorp.gifshow.activity.GifshowActivity;
import yh7.a;
import android.app.Activity;
import lnc.y0;
import yx.j0;
import android.net.Uri;
import ekd.x0;
import java.util.Map;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.webkit.URLUtil;
import java.lang.StringBuilder;
import lnc.o5;
import nl9.f;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import tkd.b;
import tkd.d;
import nl9.u;
import com.kwai.framework.model.feed.BaseFeed;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;

public final class AdCommonWebUriHandler extends AnnotationUriHandler	// class@0016e1
{
    public static final AdCommonWebUriHandler$a b;

    static {
       AdCommonWebUriHandler.b = new AdCommonWebUriHandler$a(null);
    }
    public void AdCommonWebUriHandler(){
       super();
    }
    public void c(b p0,c p1){
       Object[] obj = p0;
       Object obj1 = p1;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, this, AdCommonWebUriHandler.class, str)) {
          return;
       }
       a.p(obj, "uriRequest");
       a.p(obj1, "uriCallback");
       Context uContext = p0.b();
       QPhoto qPhoto = null;
       if (!uContext instanceof GifshowActivity) {
          uContext = qPhoto;
       }
       Context uContext1 = uContext;
       a uoa = new a(200);
       String str1 = "AdCommonWebUriHandler";
       int i = 0;
       if (y0.o(uContext1)) {
          obj = new Object[i];
          j0.f(str1, "activity is finishingOrDestroyed", obj);
          uoa.a = 406;
          obj1.a(uoa);
          return;
       }else {
          String str2 = x0.b(p0.g(), "url", "");
          str = x0.b(p0.g(), "heightRatio", str);
          Map map = obj.c(Map.class, "EXTRA_CONTEXT_MAP");
          QPhoto qPhoto1 = (map != null)? map.get("QPhoto"): qPhoto;
          if (!qPhoto1 instanceof QPhoto) {
             qPhoto1 = qPhoto;
          }
          if (!URLUtil.isNetworkUrl(str2)) {
             Object[] objArray = new Object[i];
             j0.c(str1, "url: "+str2, objArray);
             uoa.a = 400;
             obj1.a(uoa);
             return;
          }else {
             float f = o5.a(str, 0x3f800000);
             int i1 = -1694791652;
             if (f - (float)i > 0 && f - (float)1 < 0) {
                f uof = new f(false, f, null, 0, 12, null);
                b uob = d.a(i1);
                if (qPhoto1 != null) {
                   qPhoto = qPhoto1.mEntity;
                }
                uob.ST(uContext1, qPhoto, str2, str, null);
             }else {
                u ou = d.a(i1);
                if (qPhoto1 != null) {
                   qPhoto = qPhoto1.mEntity;
                }
                ou.RQ(uContext1, qPhoto, str2);
             }
             obj1.a(uoa);
             return;
          }
       }
    }
}
