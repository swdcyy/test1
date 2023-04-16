package androidx.recyclerview.widget.z$b;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.z;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$x$a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Math;
import android.view.animation.Interpolator;
import android.util.DisplayMetrics;

public class z$b extends o	// class@000940
{
    public final z q;

    public void z$b(z p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       z$b tq = this.q;
       z a = tq.a;
       if (a == null) {
          return;
       }
       int[] ointArray = tq.c(a.getLayoutManager(), p0);
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
}
