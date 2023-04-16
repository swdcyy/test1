package com.kuaishou.gifshow.kswebview.KsWebViewInstaller2$b;
import com.kwai.plugin.dva.work.c$c;
import com.kuaishou.gifshow.kswebview.KsWebViewInstaller2;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Float;
import sj7.d;

public final class KsWebViewInstaller2$b implements c$c	// class@0019e5
{
    public final KsWebViewInstaller2 a;

    public void KsWebViewInstaller2$b(KsWebViewInstaller2 p0){
       this.a = p0;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsWebViewInstaller2$b.class, "3")) {
          return;
       }
       StringBuilder str = "Dva plugin install failed ";
       String str1 = null;
       String str2 = (p0 != null)? p0.toString(): str1;
       Log.g("KsWebView", str+str2);
       KsWebViewInstaller2$b ta = this.a;
       if (p0 != null) {
          str1 = p0.toString();
       }
       ta.e(false, str1);
       return;
    }
    public void onProgress(float p0){
       KsWebViewInstaller2$b uob = KsWebViewInstaller2$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       Log.b("KsWebView", "Dva plugin install onProgress: "+p0);
       this.a.b(p0);
       return;
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsWebViewInstaller2$b.class, "2")) {
       }else {
          Log.g("KsWebView", "Dva plugin install success "+p0);
          this.a.e(true, null);
       }
       return;
    }
}
