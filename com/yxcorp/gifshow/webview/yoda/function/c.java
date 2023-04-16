package com.yxcorp.gifshow.webview.yoda.function.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.webview.yoda.function.d;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import android.app.Activity;
import brd.t;
import com.yxcorp.gifshow.util.PermissionUtils;
import t45.d;
import brd.z;
import oyc.c;
import oyc.b;
import erd.g;
import crd.b;

public final class c implements Runnable	// class@0017b6
{
    public final d b;
    public final YodaBaseWebView c;

    public void c(d p0,YodaBaseWebView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, d.class, "2")) {
       }else {
          PermissionUtils.f(tb.f.get(), "android.permission.WRITE_EXTERNAL_STORAGE").subscribeOn(d.b).subscribe(new c(tb, tc), new b(tb, tc));
       }
       return;
    }
}
