package com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointPanel$a;
import lnc.o;
import com.yxcorp.gifshow.camera.record.breakpoint.panel.BreakpointPanel;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.widget.RelativeLayout;

public class BreakpointPanel$a extends o	// class@000db4
{
    public final BreakpointPanel b;

    public void BreakpointPanel$a(BreakpointPanel p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport(BreakpointPanel$a.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, BreakpointPanel$a.class, "1")) {
          return;
       }
       this.b.setVisibility(8);
       return;
    }
}
