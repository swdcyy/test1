package com.yxcorp.gifshow.init.module.e1;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.WebViewSpeedUpInitModule;
import android.app.Application;
import o56.a;
import java.lang.String;
import android.content.ClipboardManager;
import com.yxcorp.gifshow.init.module.d1;
import android.content.ClipboardManager$OnPrimaryClipChangedListener;
import com.kwai.privacykit.interceptor.ClipboardInterceptor;
import java.lang.Exception;

public final class e1 implements Runnable	// class@0019bc
{
    public static final e1 b;

    static {
       e1.b = new e1();
    }
    public void e1(){
       super();
    }
    public final void run(){
       int q = WebViewSpeedUpInitModule.q;
       try{
          ClipboardManager systemServic = a.b().getSystemService("clipboard");
          if (systemServic != null) {
             ClipboardInterceptor.addPrimaryClipChangedListener(systemServic, d1.a);
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
