package agd.i;
import android.view.View$OnClickListener;
import agd.j;
import agd.k;
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

public class i implements View$OnClickListener	// class@000030
{
    public final k b;
    public final j c;

    public void i(j p0,k p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       int adapterPosit = this.b.getAdapterPosition();
       if (adapterPosit != 3) {
          this.c.J0(adapterPosit);
       }
       j e = this.c.e;
       c$a q = e.Q;
       if (q != null) {
          q.a(e.G, p0, adapterPosit);
          this.c.e.c0().q(4);
       }
       return;
    }
}
