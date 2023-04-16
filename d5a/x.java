package d5a.x;
import j1b.e;
import d5a.u;
import androidx.fragment.app.FragmentActivity;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import uw9.o;
import q87.c;
import java.util.Iterator;
import java.lang.Iterable;
import d5a.t;

public final class x extends e	// class@001e94
{
    public final u g;
    public final FragmentActivity h;

    public void x(u p0,FragmentActivity p1,Context p2){
       this.g = p0;
       this.h = p1;
       super(p2);
    }
    public void c(int p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ox, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("WindowOrientationManager", "accept rotation event", objArray);
       Iterator iterator = this.g.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
}
