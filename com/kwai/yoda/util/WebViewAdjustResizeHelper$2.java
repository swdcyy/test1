package com.kwai.yoda.util.WebViewAdjustResizeHelper$2;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.yoda.util.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yz7.q;
import java.lang.Runnable;
import android.view.View;

public class WebViewAdjustResizeHelper$2 implements LifecycleObserver	// class@0012f5
{
    public final a b;

    public void WebViewAdjustResizeHelper$2(a p0){
       this.b = p0;
       super();
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, WebViewAdjustResizeHelper$2.class, "1")) {
          return;
       }
       WebViewAdjustResizeHelper$2 tb = this.b;
       if (tb.d != null) {
          tb.a.post(new q(tb));
       }
       return;
    }
}
