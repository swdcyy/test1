package com.kuaishou.kds.animate.core.a;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kuaishou.kds.animate.core.b;
import vh0.f;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class a implements LifecycleEventListener	// class@00079b
{
    public final ReactContext b;
    public final UIManagerModule c;
    public final Map d;

    public void a(ReactContext p0){
       super();
       this.d = new ConcurrentHashMap();
       this.b = p0;
       this.c = p0.getNativeModule(UIManagerModule.class);
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       if (this.d.containsKey(p0)) {
          this.d.remove(p0);
       }
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       b uob = this.d.get(p0);
       if (uob != null && uob.d()) {
          UiThreadUtil.runOnUiThread(new f(uob));
       }
       return;
    }
    public void onHostDestroy(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          Iterator iterator = this.d.entrySet().iterator();
          if (iterator != null) {
             while (iterator.hasNext()) {
                b value = iterator.next().getValue();
                if (value != null && value.e()) {
                   value.a(false);
                }
                iterator.remove();
             }
          }
       }
       this.d.clear();
       return;
    }
    public void onHostPause(){
    }
    public void onHostResume(){
    }
}
