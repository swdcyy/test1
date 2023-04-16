package b4d.x;
import java.lang.Runnable;
import b4d.z;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import x3d.b;
import g9c.a;

public final class x implements Runnable	// class@00039f
{
    public final z b;

    public void x(z p0){
       this.b = p0;
    }
    public final void run(){
       x tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, z.class, "5")) {
       }else if(tb.getActivity() != null){
          z p = tb.p;
          if (p != null) {
             RecyclerView$Adapter adapter = p.getAdapter();
             if (adapter instanceof b) {
                int itemCount = adapter.getItemCount();
                z r = tb.r;
                if (itemCount > r) {
                   adapter.U0(r, (itemCount - r));
                }
             }
          }
       }
       return;
    }
}
