package com.yxcorp.gifshow.ad.detail.router.AdLoginDetectionHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import com.yxcorp.gifshow.ad.detail.router.AdLoginDetectionHandler$a;
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
import android.app.Activity;
import lnc.y0;
import java.util.Map;
import android.net.Uri;
import ekd.x0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.ad.detail.router.AdLoginDetectionHandler$b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.AdProcessUtils;
import yh7.a;
import java.lang.StringBuilder;
import yx.j0;

public final class AdLoginDetectionHandler extends AnnotationUriHandler	// class@0016ea
{
    public static final AdLoginDetectionHandler$a b;

    static {
       AdLoginDetectionHandler.b = new AdLoginDetectionHandler$a(null);
    }
    public void AdLoginDetectionHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdLoginDetectionHandler.class, "1")) {
          return;
       }
       a.p(p0, "uriRequest");
       a.p(p1, "callback");
       Context uContext = p0.b();
       QPhoto qPhoto = null;
       if (!uContext instanceof GifshowActivity) {
          uContext = qPhoto;
       }
       Context uContext1 = uContext;
       String str = "AdLoginDetectionHandler";
       int i = 0;
       if (uContext1 == null || y0.o(uContext1)) {
          p1.a(new a(406));
          Object[] objArray = new Object[i];
          j0.f(str, "activityFinishingOrDestroyed", objArray);
          return;
       }else {
          Map map = p0.c(Map.class, "EXTRA_CONTEXT_MAP");
          String str1 = x0.b(p0.g(), "internalJump", "");
          QPhoto qPhoto1 = (map != null)? map.get("QPhoto"): qPhoto;
          if (qPhoto1 instanceof QPhoto) {
             qPhoto = qPhoto1;
          }
          boolean b = true;
          String str2 = (str1 == null || !str1.length())? 1: null;
          if (str2 || qPhoto == null) {
             p1.a(new a(400));
             StringBuilder str3 = str1+"---feed is null ";
             if (qPhoto != null) {
                b = false;
             }
             Object[] objArray1 = new Object[i];
             j0.f(str, str3+b, objArray1);
             return;
          }else {
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             if (!mE.isLogined()) {
                d.a(-1712118428).ne(uContext1, qPhoto.getFullSource(), "AdLoginDetectionHandler", 0, null, qPhoto.mEntity, qPhoto.getUser(), null, new AdLoginDetectionHandler$b(uContext1, qPhoto, str1, p1)).h();
             }else {
                AdProcessUtils.o(uContext1, new PhotoAdDataWrapper(qPhoto.mEntity), str1);
                p1.a(new a(200));
             }
             return;
          }
       }
    }
}
