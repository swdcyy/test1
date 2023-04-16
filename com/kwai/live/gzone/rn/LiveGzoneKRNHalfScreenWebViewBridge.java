package com.kwai.live.gzone.rn.LiveGzoneKRNHalfScreenWebViewBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.kwai.live.gzone.rn.LiveGzoneKRNHalfScreenWebViewBridge$a;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import com.kwai.live.gzone.rn.LiveGzoneKRNHalfScreenWebViewBridge$b;
import java.lang.Runnable;
import ekd.k1;

public final class LiveGzoneKRNHalfScreenWebViewBridge extends KrnBridge	// class@000df2
{
    public final ReactApplicationContext reactContext;
    public static final LiveGzoneKRNHalfScreenWebViewBridge$a Companion;

    static {
       LiveGzoneKRNHalfScreenWebViewBridge.Companion = new LiveGzoneKRNHalfScreenWebViewBridge$a(null);
    }
    public void LiveGzoneKRNHalfScreenWebViewBridge(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
       this.reactContext = p0;
    }
    public String getName(){
       return "LiveGzoneKRNHalfScreenWebViewBridge";
    }
    public final void openWebView(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneKRNHalfScreenWebViewBridge.class, "1")) {
          return;
       }
       a.p(p0, "url");
       Intent intent = new Intent();
       k1.o(new LiveGzoneKRNHalfScreenWebViewBridge$b(p0));
       return;
    }
}
