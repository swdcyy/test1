package cl5.b;
import java.lang.Runnable;
import cl5.e;
import java.lang.Object;
import uk5.r;
import androidx.recyclerview.widget.GridLayoutManager;
import cl5.e$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class b implements Runnable	// class@0006eb
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       int i = r.a(tb.s);
       tb.y = i;
       if (i < 1) {
       }else {
          tb.v.setSpanCount(i);
          tb.z.f();
          tb.u.k0();
       }
       return;
    }
}
