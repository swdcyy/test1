package com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule$b;
import android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule;
import java.lang.Object;
import com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public class AccessibilityInfoModule$b implements AccessibilityManager$TouchExplorationStateChangeListener	// class@00126f
{
    public final AccessibilityInfoModule a;

    public void AccessibilityInfoModule$b(AccessibilityInfoModule p0){
       this.a = p0;
       super();
    }
    public void AccessibilityInfoModule$b(AccessibilityInfoModule p0,AccessibilityInfoModule$a p1){
       super(p0);
    }
    public void onTouchExplorationStateChanged(boolean p0){
       if (PatchProxy.isSupport(AccessibilityInfoModule$b.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, AccessibilityInfoModule$b.class, "1")) {
          return;
       }
       this.a.updateAndSendTouchExplorationChangeEvent(p0);
       return;
    }
}
