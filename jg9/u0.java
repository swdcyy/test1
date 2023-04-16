package jg9.u0;
import java.lang.Runnable;
import jg9.t0;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;

public final class u0 implements Runnable	// class@002ab8
{
    public final t0 b;
    public final l c;

    public void u0(t0 p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, u0.class, "1")) {
          return;
       }
       int i = 0;
       if (this.b.h0().getChildAt(i) != null) {
          View childAt = this.b.h0().getChildAt(i);
          a.o(childAt, "recyclerView.getChildAt\(0\)");
          this.c.invoke(childAt);
       }
       return;
    }
}
