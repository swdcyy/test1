package a99.j$a;
import androidx.recyclerview.widget.o;
import a99.j;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$x$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import android.view.animation.Interpolator;

public class j$a extends o	// class@000067
{
    public final j q;

    public void j$a(j p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j$a.class, "1")) {
          return;
       }
       int i = this.t(p0, this.z());
       int i1 = this.u(p0, this.B());
       Math.sqrt((double)((i * i) + (i1 * i1)));
       p2.f((- i), (- i1), 140, this.i);
       return;
    }
    public int w(int p0){
       return 140;
    }
    public int x(int p0){
       return 140;
    }
}
