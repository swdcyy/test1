package com.yxcorp.gateway.pay.webview.JsNativeEventCommunication$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public class JsNativeEventCommunication$1 implements LifecycleObserver	// class@001277
{
    public final JsNativeEventCommunication b;

    public void JsNativeEventCommunication$1(JsNativeEventCommunication p0){
       this.b = p0;
       super();
    }
    public final void onProcessBackground(){
       if (PatchProxy.applyVoid(null, this, JsNativeEventCommunication$1.class, "1")) {
          return;
       }
       JsNativeEventCommunication$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, JsNativeEventCommunication.class, "6")) {
          tb.b("native_background", null);
       }
       return;
    }
    public final void onProcessForeground(){
       if (PatchProxy.applyVoid(null, this, JsNativeEventCommunication$1.class, "2")) {
          return;
       }
       JsNativeEventCommunication$1 tb = this.b;
       boolean b = false;
       if (tb.g != null) {
          tb.g = b;
          return;
       }else if(tb.d(true)){
          this.b.f = b;
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, JsNativeEventCommunication.class, "7")) {
          tb.b("native_foreground", null);
       }
       return;
    }
}
