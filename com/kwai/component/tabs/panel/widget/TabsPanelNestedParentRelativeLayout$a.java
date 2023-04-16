package com.kwai.component.tabs.panel.widget.TabsPanelNestedParentRelativeLayout$a;
import android.animation.AnimatorListenerAdapter;
import com.kwai.component.tabs.panel.widget.TabsPanelNestedParentRelativeLayout;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;

public class TabsPanelNestedParentRelativeLayout$a extends AnimatorListenerAdapter	// class@000b86
{
    public final TabsPanelNestedParentRelativeLayout a;

    public void TabsPanelNestedParentRelativeLayout$a(TabsPanelNestedParentRelativeLayout p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabsPanelNestedParentRelativeLayout$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setEnabled(true);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabsPanelNestedParentRelativeLayout$a.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setEnabled(false);
       return;
    }
}
