package androidx.recyclerview.widget.SlideVerticalAtlasPlayer$AutoPlayLinearSmoothScroller;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer$AutoPlayLinearSmoothScroller$verticalHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.view.View;
import androidx.recyclerview.widget.s;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$x$a;
import android.view.animation.PathInterpolator;
import android.view.animation.Interpolator;

public final class SlideVerticalAtlasPlayer$AutoPlayLinearSmoothScroller extends o	// class@0008bf
{
    public final p q;
    public final SlideVerticalAtlasPlayer r;

    public void SlideVerticalAtlasPlayer$AutoPlayLinearSmoothScroller(SlideVerticalAtlasPlayer p0,Context p1){
       a.p(p1, "context");
       this.r = p0;
       super(p1);
       this.q = s.c(new SlideVerticalAtlasPlayer$AutoPlayLinearSmoothScroller$verticalHelper$2(this));
    }
    public final int D(View p0,s p1){
       int i = (p1.g(p0) + (p1.e(p0) / 2)) - (p1.n() + (p1.o() / 2));
       int i1 = (!i)? Math.abs(((p0.getHeight() - p1.o()) / 2)): Math.abs(i);
       return i1;
    }
    public final s E(){
       return this.q.getValue();
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       a.p(p0, "targetView");
       a.p(p1, "state");
       a.p(p2, "action");
       s os = this.E();
       a.o(os, "verticalHelper");
       int i = this.D(p0, os);
       SlideVerticalAtlasPlayer$AutoPlayLinearSmoothScroller tr = this.r;
       p2.f(0, i, tr.d, tr.getAnimationInterpolator());
    }
}
