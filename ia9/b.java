package ia9.b;
import android.view.View$OnLongClickListener;
import ia9.c;
import ia9.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import ja9.c;

public final class b implements View$OnLongClickListener	// class@00265a
{
    public final c b;
    public final d c;

    public void b(c p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final boolean onLongClick(View p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int adapterPosit = this.c.getAdapterPosition();
       b = false;
       if (adapterPosit == -1) {
          PatchProxy.onMethodExit(b.class, "1");
          return b;
       }else {
          b tb = this.b;
          c h = tb.h;
          if (h != null) {
             b = h.a(tb, p0, adapterPosit);
          }
          PatchProxy.onMethodExit(b.class, "1");
          return b;
       }
    }
}
