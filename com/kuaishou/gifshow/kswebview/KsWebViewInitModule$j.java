package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$j;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p80.z;
import p80.z$a;
import android.os.Build$VERSION;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kuaishou.webkit.WebSettings;
import java.lang.StringBuilder;
import java.lang.Exception;
import yz7.r;
import bz7.f;
import bz7.f$a;
import com.kwai.yoda.kernel.cookie.YodaCookie;

public final class KsWebViewInitModule$j implements Runnable	// class@0019e0
{
    public static final KsWebViewInitModule$j b;

    static {
       KsWebViewInitModule$j.b = new KsWebViewInitModule$j();
    }
    public void KsWebViewInitModule$j(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KsWebViewInitModule$j.class, "1")) {
          return;
       }
       z$a a = z.a;
       if (a.a() == 3) {
          if (Build$VERSION.SDK_INT >= 26 || KsWebViewInitModule.A.e()) {
             try{
                WebSettings.getDefaultUserAgent(a.b());
             }catch(java.lang.Exception e0){
                r.h("KsWebView", "--- onLaunchFinish, getDefaultUserAgent fail, 3, e:"+e0.getMessage()+32);
                f.a.c(e0.getMessage(), "ua");
             }
          }
       }else if(a.a() == 4){
          if (Build$VERSION.SDK_INT >= 26 || KsWebViewInitModule.A.e()) {
             try{
                WebSettings.getDefaultUserAgent(a.b());
             }catch(java.lang.Exception e0){
                r.h("KsWebView", "--- onLaunchFinish, getDefaultUserAgent fail, 4, e:"+e0.getMessage()+32);
                f.a.c(e0.getMessage(), "ua");
             }
          }
       }
    }
}
