package com.yxcorp.gifshow.darkmode.DayNightSwitchTransitionActivity$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.darkmode.DayNightSwitchTransitionActivity;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;

public class DayNightSwitchTransitionActivity$a extends AnimatorListenerAdapter	// class@0012a2
{
    public final DayNightSwitchTransitionActivity a;

    public void DayNightSwitchTransitionActivity$a(DayNightSwitchTransitionActivity p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DayNightSwitchTransitionActivity$a.class, "1")) {
          return;
       }
       this.a.finish();
       this.a.overridePendingTransition(0, 0);
       return;
    }
}
