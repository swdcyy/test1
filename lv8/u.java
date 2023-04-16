package lv8.u;
import android.content.Context;
import android.net.Uri;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.content.pm.PackageManager;
import java.util.List;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import com.kuaishou.webkit.URLUtil;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity$a;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.activity.PayYodaWebViewActivity;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import com.kuaishou.webkit.SslErrorHandler;
import androidx.appcompat.app.a$a;
import lv8.s;
import android.content.DialogInterface$OnClickListener;
import lv8.r;
import androidx.appcompat.app.a;
import android.app.Dialog;
import com.kuaishou.webkit.WebView;
import lv8.t;
import java.lang.Runnable;
import ekd.k1;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.StringBuilder;
import lv8.d;
import com.google.gson.Gson;
import org.json.JSONObject;

public final class u	// class@002dbf
{

    public static Intent a(Context p0,Uri p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(u.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), null, u.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null) {
          return null;
       }else {
          try{
             Intent intent = Intent.parseUri(p1.toString(), 3);
             List list = p0.getPackageManager().queryIntentActivities(intent, 0x10000);
             if (list != null && !list.isEmpty()) {
                Iterator iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      ResolveInfo resolveInfo = iterator.next();
                      if ((p0.getPackageName()).equals(resolveInfo.activityInfo.packageName)) {
                         ResolveInfo activityInfo = resolveInfo.activityInfo;
                         intent.setClassName(activityInfo.packageName, activityInfo.name);
                         return intent;
                      }
                   }
                }
             }
             if (p2 && URLUtil.isNetworkUrl(p1.toString())) {
                String str = p1.toString();
                PayYodaWebViewActivity payYodaWebVi = (PayManager.getInstance().isEnableExperimentalYoda())? PayYodaWebViewActivity.class: PayWebViewActivity.class;
                return new PayWebViewActivity$a(p0, payYodaWebVi, str).a();
             }else if(p3 && (list != null && !list.isEmpty())){
                return intent;
             }else {
                return e0;
             }
          }catch(java.net.URISyntaxException e0){
          }
       }
    }
    public static void b(Context p0,SslErrorHandler p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, u.class, "5")) {
          return;
       }
       a$a uoa = new a$a(p0);
       uoa.m(R.string.arg_RES_7f103bb2);
       uoa.g(R.string.arg_RES_7f103bb1);
       uoa.d(false);
       uoa.k(R.string.arg_RES_7f103bb0, new s(p1));
       uoa.h(R.string.arg_RES_7f103baf, new r(p1));
       uoa.a().show();
       return;
    }
    public static void c(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, u.class, "3")) {
          return;
       }
       k1.o(new t(p0, p1));
       return;
    }
    public static void d(WebView p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, u.class, "2")) {
          return;
       }
       if (p2 instanceof CharSequence || p2 instanceof Number) {
          p1 = "javascript:"+p1+"\("+JSONObject.quote(String.valueOf(p2))+"\)";
       }else if(p2 != null){
          p1 = ("javascript:"+p1+"\("+JSONObject.quote(d.a.q(p2))+"\)").replace("\\n", "\n");
       }else {
          p1 = "javascript:"+p1+"\(\)";
       }
       u.c(p0, p1);
       return;
    }
}
