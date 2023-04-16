package com.kwai.live.gzone.rn.LiveGzoneKRNFragmentDismissBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.kwai.live.gzone.rn.LiveGzoneKRNFragmentDismissBridge$a;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.rn.LiveGzoneKRNFragmentDismissBridge$b;
import java.lang.Runnable;
import ekd.k1;

public final class LiveGzoneKRNFragmentDismissBridge extends KrnBridge	// class@000def
{
    public ReactApplicationContext reactContext;
    public static final LiveGzoneKRNFragmentDismissBridge$a Companion;

    static {
       LiveGzoneKRNFragmentDismissBridge.Companion = new LiveGzoneKRNFragmentDismissBridge$a(null);
    }
    public void LiveGzoneKRNFragmentDismissBridge(ReactApplicationContext p0){
       a.p(p0, "reactContext");
       super(p0);
       this.reactContext = p0;
    }
    public final void dismiss(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneKRNFragmentDismissBridge.class, "1")) {
          return;
       }
       k1.o(new LiveGzoneKRNFragmentDismissBridge$b(this));
       return;
    }
    public String getName(){
       return "LiveGzoneKRNFragmentDismiss";
    }
    public final ReactApplicationContext getReactContext(){
       return this.reactContext;
    }
    public final void setReactContext(ReactApplicationContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneKRNFragmentDismissBridge.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.reactContext = p0;
       return;
    }
}
