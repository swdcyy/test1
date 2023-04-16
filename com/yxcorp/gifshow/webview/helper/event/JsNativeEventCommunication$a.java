package com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication$a;
import byc.c;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication$b;

public class JsNativeEventCommunication$a implements c	// class@00175e
{
    public final JsNativeEventCommunication a;

    public void JsNativeEventCommunication$a(JsNativeEventCommunication p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, JsNativeEventCommunication$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.h();
    }
    public void onPauseEvent(boolean p0){
       JsNativeEventCommunication$a uoa = JsNativeEventCommunication$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       if (p0) {
          JsNativeEventCommunication$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, JsNativeEventCommunication.class, "7")) {
             ta.r(false);
             ta.b("native_background", null);
             Iterator iterator = ta.g.values().iterator();
             while (iterator.hasNext()) {
                iterator.next().onBackground();
             }
          }
       }else {
          this.a.l();
       }
       return;
    }
    public void onResumeEvent(boolean p0){
       JsNativeEventCommunication$a ta;
       JsNativeEventCommunication jsNativeEven = JsNativeEventCommunication.class;
       JsNativeEventCommunication$a uoa = JsNativeEventCommunication$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (p0) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, jsNativeEven, "8")) {
             ta.r(true);
             ta.b("native_foreground", null);
             Iterator iterator = ta.g.values().iterator();
             while (iterator.hasNext()) {
                iterator.next().onForeground();
             }
          }
       }else {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, jsNativeEven, "10")) {
             ta.r(true);
             ta.b("native_reentry", null);
          }
       }
       return;
    }
}
