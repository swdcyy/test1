package f1b.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import f1b.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import z0b.b;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import java.util.Objects;
import f1b.a;

public class c implements ViewTreeObserver$OnGlobalLayoutListener	// class@00286b
{
    public final d b;

    public void c(d p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "1")) {
          return;
       }
       if (this.b.b.h0() == null) {
          return;
       }
       this.b.b.h0().getViewTreeObserver().removeGlobalOnLayoutListener(this);
       c tb = this.b;
       tb.d = -1;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "7")) {
          tb.b();
          tb.a();
          d e = tb.e;
          if (e != null) {
             e.a();
          }
       }
       return;
    }
}
