package agd.d;
import android.view.View$OnClickListener;
import agd.e;
import agd.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import a17.c$a;
import a17.c;
import a17.b$b;
import com.kwai.library.widget.popup.common.c;

public class d implements View$OnClickListener	// class@00002b
{
    public final f b;
    public final e c;

    public void d(e p0,f p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       int adapterPosit = this.b.getAdapterPosition();
       this.c.J0(adapterPosit);
       e e = this.c.e;
       c$a q = e.Q;
       if (q != null) {
          q.a(e.G, p0, adapterPosit);
          this.c.e.c0().q(4);
       }
       return;
    }
}
