package g93.d;
import androidx.recyclerview.widget.RecyclerView$w;
import g93.g;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import g93.d$a;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class d extends RecyclerView$w	// class@002ad7
{
    public final g b;

    public void d(g p0){
       this.b = p0;
       super();
    }
    public boolean a(RecyclerView p0,MotionEvent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "rv");
       a.p(p1, "e");
       if (p1.getActionMasked() != 1) {
          return false;
       }
       p0.post(new d$a(this));
       return true;
    }
}
