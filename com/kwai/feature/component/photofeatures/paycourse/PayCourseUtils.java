package com.kwai.feature.component.photofeatures.paycourse.PayCourseUtils;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Collection;
import java.lang.StringBuilder;
import android.content.Context;
import z1.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.component.photofeatures.paycourse.PayCourseWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import android.app.Activity;
import com.kwai.feature.component.photofeatures.paycourse.PayCourseUtils$a;
import n3d.a;
import com.yxcorp.gifshow.webview.c;

public final class PayCourseUtils	// class@001228
{
    public static final String a = "payResult";
    public static final String b = "message";
    public static final String c = "url";
    public static final int d = 10000;
    public static final PayCourseUtils e;

    static {
       PayCourseUtils.e = new PayCourseUtils();
    }
    public void PayCourseUtils(){
       super();
    }
    public final Uri a(String p0){
       Uri uri;
       Uri obj = PatchProxy.applyOneRefs(p0, this, PayCourseUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Uri.parse(p0);
       if (obj.getQueryParameter("webview_bgcolor") == null) {
          a.o(obj, "uri");
          Set queryParamet = obj.getQueryParameterNames();
          StringBuilder str = (queryParamet == null || queryParamet.isEmpty())? 1: null;
          if (str) {
             uri = Uri.parse(p0+"?"+"webview_bgcolor"+"=%2300000000");
             a.o(uri, "Uri.parse\(url + \"?\" + We\x20\x02KGROUND + \"=%2300000000\"\)\x00");
             return uri;
          }else {
             uri = Uri.parse(p0+"&"+"webview_bgcolor"+"=%2300000000");
             a.o(uri, "Uri.parse\(url + \"&\" + We¡­KGROUND + \"=%2300000000\"\)");
             return uri;
          }
       }else {
          a.o(obj, "uri");
          return obj;
       }
    }
    public final String b(){
       return PayCourseUtils.b;
    }
    public final String c(){
       return PayCourseUtils.a;
    }
    public final void d(Context p0,String p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PayCourseUtils.class, "3")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "webUrl");
       a.p(p2, "completeCallback");
       if (p0 instanceof GifshowActivity) {
          p0.overridePendingTransition(0, 0);
          c.k(p0, KwaiYodaWebViewActivity.F3(p0, PayCourseWebViewActivity.class, this.a(p1).toString()).e("KEY_THEME", "4").a(), PayCourseUtils.d, new PayCourseUtils$a(p2));
       }
       return;
    }
    public final void e(Context p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PayCourseUtils.class, "4")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "webUrl");
       c.i(p0, KwaiYodaWebViewActivity.F3(p0, PayCourseWebViewActivity.class, this.a(p1).toString()).e("KEY_THEME", "4").a());
       return;
    }
}
