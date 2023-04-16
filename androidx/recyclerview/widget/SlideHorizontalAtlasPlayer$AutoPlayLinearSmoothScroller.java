package androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$AutoPlayLinearSmoothScroller;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer$AutoPlayLinearSmoothScroller$horizontalHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$x$a;
import android.view.animation.PathInterpolator;
import android.view.animation.Interpolator;

public final class SlideHorizontalAtlasPlayer$AutoPlayLinearSmoothScroller extends o	// class@0008ab
{
    public final p q;
    public final SlideHorizontalAtlasPlayer r;

    public void SlideHorizontalAtlasPlayer$AutoPlayLinearSmoothScroller(SlideHorizontalAtlasPlayer p0,Context p1){
       a.p(p1, "context");
       this.r = p0;
       super(p1);
       this.q = s.c(new SlideHorizontalAtlasPlayer$AutoPlayLinearSmoothScroller$horizontalHelper$2(this));
    }
    public final int D(View p0,s p1){
       return ((p1.g(p0) + (p1.e(p0) / 2)) - (p1.n() + (p1.o() / 2)));
    }
    public final s E(){
       return this.q.getValue();
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       a.p(p0, "targetView");
       a.p(p1, "state");
       a.p(p2, "action");
       s os = this.E();
       a.o(os, "horizontalHelper");
       int i = this.D(p0, os);
       SlideHorizontalAtlasPlayer$AutoPlayLinearSmoothScroller tr = this.r;
       p2.f(i, 0, tr.c, tr.getAnimationInterpolator());
    }
}
