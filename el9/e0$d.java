package el9.e0$d;
import androidx.recyclerview.widget.o;
import android.content.Context;
import xk9.b;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$x$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.DisplayMetrics;

public class e0$d extends o	// class@0021e4
{
    public WeakReference q;

    public void e0$d(Context p0,b p1){
       super(p0);
       this.q = new WeakReference(p1);
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e0$d.class, "1")) {
          return;
       }
       super.o(p0, p1, p2);
       if (this.q.get() != null) {
          this.q.get().a((float)this.u(p0, this.B()));
       }
       return;
    }
    public int s(int p0,int p1,int p2,int p3,int p4){
       return (((p2 + ((p3 - p2) / 2)) - p0) - ((p1 - p0) / 2));
    }
    public float v(DisplayMetrics p0){
       return (35.00f / (float)p0.densityDpi);
    }
}
