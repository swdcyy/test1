package jg9.w0;
import android.view.View$OnClickListener;
import jg9.t0;
import jg9.t0$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.concurrent.CopyOnWriteArrayList;

public final class w0 implements View$OnClickListener	// class@002abc
{
    public final t0 b;
    public final t0$b c;

    public void w0(t0 p0,t0$b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w0.class, "1")) {
          return;
       }
       int adapterPosit = this.c.getAdapterPosition();
       if (adapterPosit >= 0 && adapterPosit < this.b.K0().size()) {
          this.b.J0(adapterPosit, true);
       }
       return;
    }
}
