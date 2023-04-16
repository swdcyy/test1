package com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;

public class KwaiWebViewActivity$a extends KwaiYodaWebViewActivity$c	// class@0016c8
{

    public void KwaiWebViewActivity$a(Context p0,Class p1,String p2){
       super(p0, p1, p2);
    }
    public void KwaiWebViewActivity$a(Context p0,String p1){
       super(p0, p1);
    }
    public KwaiYodaWebViewActivity$c c(String p0,float p1){
       KwaiYodaWebViewActivity$c uoc;
       KwaiWebViewActivity$a uoa = KwaiWebViewActivity$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoc = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), this, uoa, "6");
          if (uoc != PatchProxyResult.class) {
          label_001d :
             return uoc;
          }
       }
       super.c(p0, p1);
       uoc = this;
       goto label_001d ;
    }
    public KwaiYodaWebViewActivity$c d(String p0,int p1){
       KwaiYodaWebViewActivity$c uoc;
       KwaiWebViewActivity$a uoa = KwaiWebViewActivity$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoc = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "7");
          if (uoc != PatchProxyResult.class) {
          label_001d :
             return uoc;
          }
       }
       super.d(p0, p1);
       uoc = this;
       goto label_001d ;
    }
    public KwaiYodaWebViewActivity$c e(String p0,String p1){
       return this.l(p0, p1);
    }
    public KwaiYodaWebViewActivity$c f(String p0,boolean p1){
       return this.m(p0, p1);
    }
    public KwaiYodaWebViewActivity$c i(String p0){
       return this.n(p0);
    }
    public KwaiYodaWebViewActivity$c k(String p0){
       return this.o(p0);
    }
    public KwaiWebViewActivity$a l(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KwaiWebViewActivity$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.e(p0, p1);
       return this;
    }
    public KwaiWebViewActivity$a m(String p0,boolean p1){
       KwaiWebViewActivity$a uoa = KwaiWebViewActivity$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       super.f(p0, p1);
       return this;
    }
    public KwaiWebViewActivity$a n(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiWebViewActivity$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.i(p0);
       return this;
    }
    public KwaiWebViewActivity$a o(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiWebViewActivity$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.k(p0);
       return this;
    }
}
