package com.yxcorp.gateway.pay.webview.WebviewAdjustResizeHelperOpt$2;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gateway.pay.webview.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rv8.r;
import java.lang.Runnable;
import android.view.View;

public class WebviewAdjustResizeHelperOpt$2 implements LifecycleObserver	// class@00127b
{
    public final n b;

    public void WebviewAdjustResizeHelperOpt$2(n p0){
       this.b = p0;
       super();
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, WebviewAdjustResizeHelperOpt$2.class, "1")) {
          return;
       }
       WebviewAdjustResizeHelperOpt$2 tb = this.b;
       if (tb.d != null) {
          tb.a.post(new r(tb));
       }
       return;
    }
}
