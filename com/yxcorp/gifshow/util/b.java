package com.yxcorp.gifshow.util.b;
import android.app.Activity;
import com.yxcorp.gifshow.model.Action;
import java.util.Map;
import com.yxcorp.gifshow.util.b$a;
import java.lang.Enum;
import com.yxcorp.plugin.login.TencentPlatform;
import o56.a;
import android.content.Context;
import oe6.a;
import java.lang.String;
import android.app.Application;
import java.lang.CharSequence;
import e17.i;
import lnc.a;
import r4d.a;
import n3d.a;
import com.yxcorp.utility.TextUtils;
import java.lang.Object;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Intent;
import java.util.HashMap;
import com.kwai.framework.model.router.RouteType;
import jb6.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class b	// class@001f5d
{

    public static void a(Activity p0,Action p1,Map p2){
       int i = b$a.a[p1.mActionType.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i != 2 && i != 3) {
             if (i == 4) {
                TencentPlatform tencentPlatf = new TencentPlatform(a.B);
                if (!a.k() || !tencentPlatf.isLogined()) {
                   tencentPlatf.login(p0, new a(tencentPlatf));
                }else if(tencentPlatf.isLogined()){
                   a.W(b);
                   i.d(R.style.arg_RES_7f110669, a.B.getString(R.string.arg_RES_7f1003ac));
                }
             }
          }else if(p0 == null || TextUtils.x(p1.mUrl)){
             Intent intent = b.a(0x66dce92a).a(p0, w0.f(p1.mUrl));
             if (intent != null) {
                p0.startActivity(intent);
             }
          }
       }else if(TextUtils.x(p1.mUrl)){
          HashMap hashMap = new HashMap();
          Action mEcho = p1.mEcho;
          if (mEcho != null) {
             hashMap.put("echo", mEcho);
          }
          String str = (TextUtils.x(w0.f(p1.mUrl).getHost()))? b.e(p1.mUrl, RouteType.API): p1.mUrl;
          b.a(0x330163e).requestAction(str, hashMap).subscribe(Functions.d(), Functions.d());
       }
    label_00bd :
       return;
    }
}
