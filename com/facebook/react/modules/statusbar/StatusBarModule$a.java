package com.facebook.react.modules.statusbar.StatusBarModule$a;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.facebook.react.bridge.ReactContext;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Window;
import android.animation.ArgbEvaluator;
import java.lang.Integer;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import com.facebook.react.modules.statusbar.StatusBarModule$a$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class StatusBarModule$a extends GuardedRunnable	// class@0012e1
{
    public final Activity b;
    public final boolean c;
    public final int d;
    public final StatusBarModule e;

    public void StatusBarModule$a(StatusBarModule p0,ReactContext p1,Activity p2,boolean p3,int p4){
       this.e = p0;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super(p1);
    }
    public void runGuarded(){
       if (PatchProxy.applyVoid(null, this, StatusBarModule$a.class, "1")) {
          return;
       }
       this.b.getWindow().addFlags(Integer.MIN_VALUE);
       if (this.c != null) {
          Object[] objArray = new Object[]{Integer.valueOf(this.b.getWindow().getStatusBarColor()),Integer.valueOf(this.d)};
          ValueAnimator valueAnimato = ValueAnimator.ofObject(new ArgbEvaluator(), objArray);
          valueAnimato.addUpdateListener(new StatusBarModule$a$a(this));
          valueAnimato.setDuration(300).setStartDelay(0);
          valueAnimato.start();
       }else {
          this.b.getWindow().setStatusBarColor(this.d);
       }
       return;
    }
}
