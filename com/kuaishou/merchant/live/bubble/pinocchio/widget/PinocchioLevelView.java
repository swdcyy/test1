package com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioLevelView;
import android.content.Context;
import com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioBubble;
import java.lang.Object;
import java.util.ArrayList;
import android.view.View;
import com.kuaishou.merchant.live.bubble.pinocchio.widget.PinocchioLevelView$ViewData;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;

public abstract class PinocchioLevelView	// class@0018f1
{
    public final ArrayList a;
    public final ArrayList b;
    public View c;
    public PinocchioBubble d;

    public void PinocchioLevelView(Context p0,PinocchioBubble p1){
       super();
       this.a = new ArrayList();
       this.b = new ArrayList();
       this.c = this.b(p0);
       this.d = p1;
    }
    public abstract void a(PinocchioLevelView$ViewData p0);
    public abstract View b(Context p0);
    public void c(){
       if (PatchProxy.applyVoid(null, this, PinocchioLevelView.class, "10")) {
          return;
       }
       this.a.clear();
       this.b.clear();
       return;
    }
    public abstract float d();
    public final PinocchioBubble e(){
       return this.d;
    }
    public final ArrayList f(){
       return this.a;
    }
    public final View g(){
       return this.c;
    }
    public final Animator h(){
       ObjectAnimator obj = PatchProxy.apply(null, this, PinocchioLevelView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.c.setPivotX(0);
       this.c.setPivotY(this.d());
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000})};
       obj = ObjectAnimator.ofPropertyValuesHolder(this.c, propertyValu);
       obj.setInterpolator(new AccelerateDecelerateInterpolator());
       obj.setDuration(500);
       return obj;
    }
}
