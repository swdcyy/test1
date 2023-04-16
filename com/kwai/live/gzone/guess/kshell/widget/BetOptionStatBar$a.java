package com.kwai.live.gzone.guess.kshell.widget.BetOptionStatBar$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.live.gzone.guess.kshell.widget.BetOptionStatBar;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import android.graphics.drawable.Drawable;

public class BetOptionStatBar$a implements ValueAnimator$AnimatorUpdateListener	// class@000d70
{
    public final BetOptionStatBar a;

    public void BetOptionStatBar$a(BetOptionStatBar p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BetOptionStatBar$a.class, "1")) {
          return;
       }
       this.a.i.setLevel((int)(p0.getAnimatedValue().floatValue() * 10000.00f));
       return;
    }
}
