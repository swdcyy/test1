package androidx.recyclerview.widget.m$a;
import java.lang.Runnable;
import androidx.recyclerview.widget.m;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup;
import android.view.View;
import a2.i0;

public class m$a implements Runnable	// class@00091e
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public void run(){
       m$a tb = this.b;
       if (tb.d != null && tb.x()) {
          tb = this.b;
          m d = tb.d;
          if (d != null) {
             tb.s(d);
          }
          tb = this.b;
          tb.s.removeCallbacks(tb.t);
          i0.k0(this.b.s, this);
       }
       return;
    }
}
