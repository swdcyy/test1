package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$a$a$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kuaishou.webkit.WebSettings;
import com.kuaishou.weapon.i.WeaponHI;

public final class KsWebViewInitModule$a$a$a implements Runnable	// class@0019d2
{
    public final boolean b;

    public void KsWebViewInitModule$a$a$a(boolean p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KsWebViewInitModule$a$a$a.class, "1")) {
          return;
       }
       Log.g("KsWebView", "onFirstWebViewCreated useKsWebview="+this.b);
       WeaponHI.u(WebSettings.getDefaultUserAgent(a.b()));
       return;
    }
}
