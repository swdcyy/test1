package com.kwai.component.photo.detail.core.widget.progress.b;
import android.content.Context;
import java.lang.Object;
import ke5.e;
import android.graphics.Rect;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.ColorFilter;

public abstract class b	// class@000a3f
{
    public Animator[] a;
    public boolean b;
    public long c;
    public final ValueAnimator$AnimatorUpdateListener d;
    public final Rect e;
    public Drawable$Callback f;
    public ValueAnimator g;
    public float h;
    public float i;

    public void b(Context p0){
       b uob = b.class;
       super();
       this.b = true;
       e uoe = new e(this);
       this.d = uoe;
       this.e = new Rect();
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
       }else {
          float f = 38.00f;
          this.h = (float)n.c(p0, f);
          this.i = (float)n.c(p0, f);
       }
       if (!PatchProxy.applyVoid(null, this, uob, "6")) {
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          this.g = valueAnimato;
          valueAnimato.setRepeatCount(-1);
          this.g.setRepeatMode(true);
          this.g.setDuration(1000);
          this.g.setInterpolator(new LinearInterpolator());
          this.g.addUpdateListener(uoe);
       }
       return;
    }
    public void a(Canvas p0,int p1,int p2){
    }
    public abstract void b(int p0);
    public abstract void c(ColorFilter p0);
}
