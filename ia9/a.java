package ia9.a;
import android.view.View$OnClickListener;
import ia9.c;
import ia9.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import ja9.b;

public final class a implements View$OnClickListener	// class@002659
{
    public final c b;
    public final d c;

    public void a(c p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       int adapterPosit = this.c.getAdapterPosition();
       if (adapterPosit == -1) {
          PatchProxy.onMethodExit(a.class, "1");
          return;
       }else {
          a tb = this.b;
          c g = tb.g;
          if (g != null) {
             g.V(tb, p0, adapterPosit);
          }
          PatchProxy.onMethodExit(a.class, "1");
          return;
       }
    }
}
