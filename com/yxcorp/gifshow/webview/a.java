package com.yxcorp.gifshow.webview.a;
import rf6.b;
import rf6.a;
import java.lang.Object;
import android.content.Context;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.e;
import com.yxcorp.gifshow.webview.c;
import java.lang.System;
import android.net.Uri;
import android.content.ComponentName;
import com.kwai.yoda.Yoda;
import java.lang.StringBuilder;
import yz7.r;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;

public class a implements b, a	// class@0016f7
{

    public void a(){
       super();
    }
    public Intent a(Context p0,Intent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "5")) {
          if (c.d(p1)) {
             p1.putExtra("buildIntentTimestamp", System.currentTimeMillis());
          }
          e.b(p0, p1);
       }
       return p1;
    }
    public Intent b(Context p0,Uri p1,Intent p2){
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null && p2 != null) {
          obj = (p2.getComponent() != null)? p2.getComponent().getClassName(): "";
          Class jumpActivity = Yoda.get().getJumpActivity(p1.toString(), obj);
          if (jumpActivity != null) {
             p2.setClass(p0, jumpActivity);
             r.h("WebViewIntentHandler", "--- hookSubBizActivity, clazz:"+jumpActivity.getName());
          }
       }
    label_0053 :
       return p2;
    }
    public Intent c(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiWebViewActivity.N3(p0, p1).a();
    }
}
