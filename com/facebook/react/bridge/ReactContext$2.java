package com.facebook.react.bridge.ReactContext$2;
import com.facebook.react.views.scroll.FpsListener;
import com.facebook.react.bridge.ReactContext;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yd.e;
import java.util.concurrent.atomic.AtomicBoolean;

public class ReactContext$2 implements FpsListener	// class@00121d
{
    public final ReactContext this$0;
    public final WeakReference val$weakReference;

    public void ReactContext$2(ReactContext p0,WeakReference p1){
       this.this$0 = p0;
       this.val$weakReference = p1;
       super();
    }
    public void disable(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext$2.class, "2")) {
          return;
       }
       ReactContext reactContext = this.val$weakReference.get();
       if (reactContext != null) {
          reactContext.onScrollEvent(false, p0);
       }
       return;
    }
    public void enable(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactContext$2.class, "1")) {
          return;
       }
       ReactContext reactContext = this.val$weakReference.get();
       if (reactContext != null) {
          reactContext.onScrollEvent(true, p0);
       }
       return;
    }
    public boolean isEnabled(){
       Object obj = PatchProxy.apply(null, this, ReactContext$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.k.get();
    }
}
