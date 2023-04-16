package com.yxcorp.gateway.pay.webview.b$m;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.LoggerParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import nv8.b;

public class b$m extends d	// class@00128b
{
    public final b e;

    public void b$m(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$m.class, "1")) {
       }else if(p0 == null){
          LoggerParams mLevel = p0.mLevel;
          if (mLevel != 1) {
             if (mLevel != 2) {
                if (mLevel != 3) {
                   if (mLevel != 4) {
                      if (mLevel == 5) {
                         b.l(p0.mTag, p0.mMsg, p0.mParams);
                      }
                   }else {
                      b.t(p0.mTag, p0.mMsg, p0.mParams);
                   }
                }else {
                   b.n(p0.mTag, p0.mMsg, p0.mParams);
                }
             }else {
                b.e(p0.mTag, p0.mMsg, p0.mParams);
             }
          }else {
             b.s(p0.mTag, p0.mMsg, p0.mParams);
          }
       }
       return;
    }
}
