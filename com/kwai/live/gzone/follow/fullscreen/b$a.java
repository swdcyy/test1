package com.kwai.live.gzone.follow.fullscreen.b$a;
import android.view.View$OnLayoutChangeListener;
import com.kwai.live.gzone.follow.fullscreen.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.kwai.live.gzone.follow.fullscreen.b$a$a;
import android.animation.Animator$AnimatorListener;

public class b$a implements View$OnLayoutChangeListener	// class@000cf9
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(b$a.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, b$a.class, "1")) {
             return;
          }
       }
       b$a tb = this.b;
       tb.p.removeOnLayoutChangeListener(tb.B);
       tb = this.b;
       tb.x = (float)((n.k(tb.getActivity()) + this.b.p.getWidth()) / 2);
       tb = this.b;
       float[] uofloatArray = new float[]{tb.x,0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tb.p, "translationX", uofloatArray).setDuration(2000);
       objectAnimat.setInterpolator(new LinearInterpolator());
       objectAnimat.addListener(new b$a$a(this));
       objectAnimat.start();
       return;
    }
}
