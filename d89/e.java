package d89.e;
import erd.o;
import d89.k;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import brd.t;
import com.yxcorp.gifshow.model.response.login.LoginUserResponse;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import java.lang.String;
import mw4.a;
import com.kwai.sdk.switchconfig.a;
import com.kwai.yoda.v2.YodaWebViewActivity;
import com.kwai.yoda.controller.YodaWebViewActivityController;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.controller.YodaWebViewController;
import com.kuaishou.webkit.WebView;
import java.lang.Class;
import eu5.b;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import com.yxcorp.gateway.pay.activity.PayYodaWebViewActivity;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import android.net.Uri;
import ekd.x0;
import io.reactivex.subjects.PublishSubject;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import d89.f;
import java.lang.Runnable;
import ekd.k1;

public final class e implements o	// class@001487
{
    public final k b;

    public void e(k p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t ot;
       HashMap hashMap;
       e b = this.b;
       Throwable throwable = p0;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       if (throwable instanceof KwaiException) {
          KwaiException mResponse = throwable.mResponse;
          int i = mResponse.b();
          boolean b1 = true;
          boolean b2 = false;
          LoginUserResponse obj = (i < 0x61a81 || i > 0x64577)? 1: null;
          if (obj) {
             ot = t.error(throwable);
          }else if(mResponse.a() instanceof LoginUserResponse){
             obj = mResponse.a();
             if (!TextUtils.isEmpty(obj.mQuickLoginToken)) {
                obj = obj.mQuickLoginToken;
             label_004f :
                Activity uActivity = ActivityContext.g().e();
                String str = (!TextUtils.isEmpty(a.b()) && a.t().d("enableBiometric", b2))? 1: null;
                if (v12 = uActivity instanceof YodaWebViewActivity) {
                   Activity uActivity1 = uActivity;
                   YodaWebViewActivityController yodaWebViewA = null;
                   if (uActivity1.E2() != null && uActivity1.E2().getWebView() != null) {
                      yodaWebViewA = uActivity1.E2().getWebView().getUrl();
                   }
                   String str1 = mResponse.d();
                   String simpleName = uActivity1.getClass().getSimpleName();
                   if (PatchProxy.isSupport(b.class)) {
                      p0 = str1;
                      if (!PatchProxy.applyVoidFourRefs(str1, Integer.valueOf(i), simpleName, yodaWebViewA, null, b.class, "2")) {
                      }
                   }else {
                      p0 = str1;
                   }
                }
             label_00e7 :
                String str2 = "face_recogniton";
                if (str && (v12 || uActivity instanceof PayYodaWebViewActivity)) {
                   Log.g(str2, "biometric supported£¡");
                   if (uActivity.isFinishing()) {
                      ot = t.error(throwable);
                   }
                }else {
                   Log.g(str2, "biometric not supported£¡");
                   if (!uActivity instanceof GifshowActivity || uActivity.isFinishing()) {
                      ot = t.error(throwable);
                   }
                }
                str2 = mResponse.d();
                PublishSubject obj1 = PatchProxy.applyOneRefs(str2, b, ok, "4");
                if (obj1 != patchProxyRe) {
                   b2 = obj1.booleanValue();
                }else if(TextUtils.isEmpty(str2)){
                   b2 = false;
                }else {
                   Iterator iterator = b.c.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (str2.contains(iterator.next())) {
                            b2 = true;
                         }
                      }else {
                         b2 = ("kwai").equals(x0.f(str2).getScheme());
                      }
                   }
                }
                if (!b2) {
                   ot = t.error(throwable);
                }else {
                   obj1 = PublishSubject.g();
                   String obj2 = PatchProxy.applyOneRefs(mResponse, b, ok, "6");
                   if (obj2 != patchProxyRe) {
                      b1 = obj2.booleanValue();
                   }else if(mResponse.i() != null && mResponse.i().E()){
                      obj2 = "verifyNotShowConfirm";
                      if (mResponse.i().r().e0(obj2) != null && mResponse.i().r().e0(obj2).p() == b1) {
                         b1 = false;
                      }
                   }
                   if (!b1) {
                      b.a(uActivity, str2, obj1, obj);
                   }else {
                      f uof = new f(b, uActivity, str2, obj1, obj, throwable);
                      k1.o(b1);
                   }
                   ot = obj1;
                }
             }
          }
          String str3 = "";
          goto label_004f ;
       }else {
          ot = t.error(throwable);
       }
       return ot;
    }
}
