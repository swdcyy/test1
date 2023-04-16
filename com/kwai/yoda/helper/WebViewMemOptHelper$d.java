package com.kwai.yoda.helper.WebViewMemOptHelper$d;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yz7.r;

public final class WebViewMemOptHelper$d implements Runnable	// class@001262
{
    public final Activity b;

    public void WebViewMemOptHelper$d(Activity p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, WebViewMemOptHelper$d.class, "1")) {
          return;
       }
       r.h("WebViewMemOptHelper", '['+this.b.getClass().getSimpleName()+"]_finish_for_opt");
       this.b.finish();
       this.b.overridePendingTransition(0, 0);
       return;
    }
}
