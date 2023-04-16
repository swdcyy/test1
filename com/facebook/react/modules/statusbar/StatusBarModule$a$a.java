package com.facebook.react.modules.statusbar.StatusBarModule$a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.facebook.react.modules.statusbar.StatusBarModule$a;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Window;
import android.app.Activity;
import java.lang.Integer;

public class StatusBarModule$a$a implements ValueAnimator$AnimatorUpdateListener	// class@0012e0
{
    public final StatusBarModule$a a;

    public void StatusBarModule$a$a(StatusBarModule$a p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StatusBarModule$a$a.class, "1")) {
          return;
       }
       this.a.b.getWindow().setStatusBarColor(p0.getAnimatedValue().intValue());
       return;
    }
}
