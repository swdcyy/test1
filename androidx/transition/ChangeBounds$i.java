package androidx.transition.ChangeBounds$i;
import android.animation.AnimatorListenerAdapter;
import androidx.transition.ChangeBounds;
import android.view.View;
import android.graphics.Rect;
import android.animation.Animator;
import a2.i0;
import e3.w;

public class ChangeBounds$i extends AnimatorListenerAdapter	// class@0009ab
{
    public boolean a;
    public final View b;
    public final Rect c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final ChangeBounds h;

    public void ChangeBounds$i(ChangeBounds p0,View p1,Rect p2,int p3,int p4,int p5,int p6){
       this.h = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public void onAnimationCancel(Animator p0){
       this.a = true;
    }
    public void onAnimationEnd(Animator p0){
       if (this.a == null) {
          i0.z0(this.b, this.c);
          w.h(this.b, this.d, this.e, this.f, this.g);
       }
       return;
    }
}
