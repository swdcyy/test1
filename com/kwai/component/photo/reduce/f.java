package com.kwai.component.photo.reduce.f;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Object;
import android.graphics.PointF;
import android.graphics.Rect;
import com.kwai.component.photo.reduce.f$a;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.component.photo.reduce.h;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;

public class f implements View$OnTouchListener	// class@000ae4
{
    public final RecyclerFragment b;
    public final RecyclerView c;
    public final PointF d;
    public final PointF e;
    public final Rect f;
    public final h g;
    public final f$a h;
    public View i;
    public View j;
    public View k;
    public KwaiRadiusImageView l;
    public TextView m;
    public QPhoto n;
    public int o;
    public boolean p;
    public AnimatorSet q;
    public AnimatorSet r;
    public Drawable s;
    public a t;
    public boolean u;
    public boolean v;

    public void f(RecyclerFragment p0){
       super();
       this.d = new PointF();
       this.e = new PointF();
       this.f = new Rect();
       this.h = new f$a();
       this.b = p0;
       this.c = p0.h0();
       this.g = new h(p0);
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       int actionMasked = p1.getActionMasked();
       if (actionMasked) {
          if (actionMasked == 1 || (actionMasked != 3 || (this.p == null || (this.q == null && !PatchProxy.applyVoidOneRefs(p1, this, f.class, "3"))))) {
             float[] uofloatArray = new float[]{0};
             float[] uofloatArray1 = new float[]{0};
             AnimatorSet uAnimatorSet = new AnimatorSet();
             uAnimatorSet.setDuration(200);
             Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.k, "translationX", uofloatArray),ObjectAnimator.ofFloat(this.k, "translationY", uofloatArray1)};
             uAnimatorSet.playTogether(uAnimatorArr);
             uAnimatorSet.start();
          }
       }else if(PatchProxy.applyVoidOneRefs(p1, this, f.class, "2")){
          float rawX = p1.getRawX();
          this.e.x = rawX;
          actionMasked.x = rawX;
          float rawY = p1.getRawY();
          this.e.y = rawY;
          actionMasked.y = rawY;
          this.p = false;
          this.u = false;
          this.v = false;
       }
       return false;
    }
}
