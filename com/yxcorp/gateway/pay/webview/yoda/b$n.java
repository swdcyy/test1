package com.yxcorp.gateway.pay.webview.yoda.b$n;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.LoggerParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.Map;
import nv8.b;

public class b$n extends p0	// class@0012bd
{
    public final b g;

    public void b$n(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$n.class, "1")) {
       }else if(p0 == null){
          LoggerParams mLevel = p0.mLevel;
          if (mLevel != 1) {
             if (mLevel != 2) {
                if (mLevel != 3) {
                   if (mLevel != 4) {
                      if (mLevel == 5) {
                         b.l("bridge:"+p0.mTag, p0.mMsg, p0.mParams);
                      }
                   }else {
                      b.t("bridge:"+p0.mTag, p0.mMsg, p0.mParams);
                   }
                }else {
                   b.n("bridge:"+p0.mTag, p0.mMsg, p0.mParams);
                }
             }else {
                b.e("bridge:"+p0.mTag, p0.mMsg, p0.mParams);
             }
          }else {
             b.s("bridge:"+p0.mTag, p0.mMsg, p0.mParams);
          }
       }
       return;
    }
}
