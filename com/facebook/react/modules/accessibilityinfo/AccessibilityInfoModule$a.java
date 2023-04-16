package com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule$a;
import android.database.ContentObserver;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import android.os.Handler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactContext;

public class AccessibilityInfoModule$a extends ContentObserver	// class@00126e
{
    public final AccessibilityInfoModule a;

    public void AccessibilityInfoModule$a(AccessibilityInfoModule p0,Handler p1){
       this.a = p0;
       super(p1);
    }
    public void onChange(boolean p0){
       if (PatchProxy.isSupport(AccessibilityInfoModule$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AccessibilityInfoModule$a.class, "1")) {
          return;
       }
       this.onChange(p0, null);
       return;
    }
    public void onChange(boolean p0,Uri p1){
       if (PatchProxy.isSupport(AccessibilityInfoModule$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, AccessibilityInfoModule$a.class, "2")) {
          return;
       }
       if (this.a.getReactApplicationContext().hasActiveCatalystInstance()) {
          this.a.updateAndSendReduceMotionChangeEvent();
       }
       return;
    }
}
