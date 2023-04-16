package com.kwai.plugin.dva.hook.component.PluginApplication$2;
import android.app.Application$ActivityLifecycleCallbacks;
import com.kwai.plugin.dva.hook.component.PluginApplication;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ClassLoader;

public class PluginApplication$2 implements Application$ActivityLifecycleCallbacks	// class@00132d
{
    public final PluginApplication this$0;
    public final Application$ActivityLifecycleCallbacks val$callback;

    public void PluginApplication$2(PluginApplication p0,Application$ActivityLifecycleCallbacks p1){
       this.this$0 = p0;
       this.val$callback = p1;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PluginApplication$2.class, "1")) {
          return;
       }
       if (p0.getClassLoader() == this.this$0.getClassLoader()) {
          this.val$callback.onActivityCreated(p0, p1);
       }
       return;
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication$2.class, "7")) {
          return;
       }
       if (p0.getClassLoader() == this.this$0.getClassLoader()) {
          this.val$callback.onActivityDestroyed(p0);
       }
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication$2.class, "4")) {
          return;
       }
       if (p0.getClassLoader() == this.this$0.getClassLoader()) {
          this.val$callback.onActivityPaused(p0);
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication$2.class, "3")) {
          return;
       }
       if (p0.getClassLoader() == this.this$0.getClassLoader()) {
          this.val$callback.onActivityResumed(p0);
       }
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PluginApplication$2.class, "6")) {
          return;
       }
       if (p0.getClassLoader() == this.this$0.getClassLoader()) {
          this.val$callback.onActivitySaveInstanceState(p0, p1);
       }
       return;
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication$2.class, "2")) {
          return;
       }
       if (p0.getClassLoader() == this.this$0.getClassLoader()) {
          this.val$callback.onActivityStarted(p0);
       }
       return;
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginApplication$2.class, "5")) {
          return;
       }
       if (p0.getClassLoader() == this.this$0.getClassLoader()) {
          this.val$callback.onActivityStopped(p0);
       }
       return;
    }
}
