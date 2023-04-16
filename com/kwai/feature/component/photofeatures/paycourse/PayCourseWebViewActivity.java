package com.kwai.feature.component.photofeatures.paycourse.PayCourseWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.net.Uri;
import java.util.Locale;
import java.util.Objects;
import zsd.u;
import com.kwai.feature.component.photofeatures.paycourse.PayCourseUtils;
import java.lang.Integer;
import zsd.t;
import android.content.Intent;
import qrd.l1;
import android.app.Activity;
import e17.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;

public final class PayCourseWebViewActivity extends KwaiYodaWebViewActivity	// class@001229
{

    public void PayCourseWebViewActivity(){
       super();
    }
    public int E3(){
       return 0;
    }
    public boolean J(WebView p0,String p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PayCourseWebViewActivity payCourseWeb = PayCourseWebViewActivity.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, payCourseWeb, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "view");
       boolean b = false;
       String str = (p1 == null || !p1.length())? 1: null;
       if (!str) {
          Uri uri = Uri.parse(p1);
          a.o(uri, "Uri.parse\(url\)");
          Locale obj1 = PatchProxy.applyOneRefs(uri, this, payCourseWeb, "3");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             String str1 = uri.toString();
             a.o(str1, "uri.toString\(\)");
             obj1 = Locale.getDefault();
             a.o(obj1, "Locale.getDefault\(\)");
             Objects.requireNonNull(str1, "null cannot be cast to non-null type java.lang.String");
             str1 = str1.toLowerCase(obj1);
             a.o(str1, "\(this as java.lang.String\).toLowerCase\(locale\)");
             if (u.q2(str1, "kwai://vision/pay-counter", b, 2, null)) {
                PayCourseUtils e = PayCourseUtils.e;
                String queryParamet = uri.getQueryParameter(e.c());
                if (queryParamet == null) {
                   queryParamet = "";
                }
                a.o(queryParamet, "\(uri.getQueryParameter\(P\x20\x02ls.KEY_PAY_RESULT\) ?: \"\"\)\x00");
                Integer integer = t.X0(queryParamet);
                int i = (integer != null)? integer.intValue(): 0;
                uri = uri.getQueryParameter(e.b());
                Intent intent = new Intent();
                intent.putExtra(e.c(), i);
                intent.putExtra(e.b(), uri);
                intent.putExtra(PayCourseUtils.c, this.getUrl());
                this.setResult(-1, intent);
                e = (uri == null || !uri.length())? 1: 0;
                if (!e) {
                   i.d(R.style.arg_RES_7f11066a, uri);
                }
                this.finish();
                b1 = true;
             }else {
                b1 = false;
             }
          }
          if (b1) {
             b = true;
          }
       }
       return b;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, PayCourseWebViewActivity.class, "1")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PayCourseWebViewActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
}
