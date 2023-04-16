package aw9.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import android.view.View;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@0002c3
{
    public final BaseDrawer a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;

    public void a(BaseDrawer p0,float p1,float p2,float p3,float p4,float p5,float p6,float p7,float p8,float p9){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       a ta = this.a;
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       a tf = this.f;
       a tg = this.g;
       a th = this.h;
       a ti = this.i;
       a tj = this.j;
       BaseDrawer mDecorationS = ta.mDecorationShowingView;
       if (mDecorationS == null) {
       }else {
          mDecorationS.setScaleX((tb + ((tc - tb) * p0.getAnimatedValue().floatValue())));
          ta.mDecorationShowingView.setScaleY((td + ((tc - td) * p0.getAnimatedValue().floatValue())));
          ta.mDecorationShowingView.setTranslationX((te + ((tf - te) * p0.getAnimatedValue().floatValue())));
          ta.mDecorationShowingView.setTranslationY((tg + ((th - tg) * p0.getAnimatedValue().floatValue())));
          ta.mDecorationShowingView.setAlpha((ti + ((tj - ti) * p0.getAnimatedValue().floatValue())));
       }
       return;
    }
}
