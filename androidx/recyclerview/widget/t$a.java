package androidx.recyclerview.widget.t$a;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.t;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$x$a;
import androidx.recyclerview.widget.z;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Math;
import android.view.animation.Interpolator;
import android.util.DisplayMetrics;

public class t$a extends o	// class@000935
{
    public final t q;

    public void t$a(t p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       t$a tq = this.q;
       int[] ointArray = tq.c(tq.a.getLayoutManager(), p0);
       int i = ointArray[0];
       int i1 = ointArray[1];
       int i2 = this.w(Math.max(Math.abs(i), Math.abs(i1)));
       if (i2 > 0) {
          p2.f(i, i1, i2, this.j);
       }
       return;
    }
    public float v(DisplayMetrics p0){
       return (100.00f / (float)p0.densityDpi);
    }
    public int x(int p0){
       return Math.min(100, super.x(p0));
    }
}
