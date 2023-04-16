package djc.d0;
import androidx.recyclerview.widget.RecyclerView$w;
import djc.c0;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class d0 extends RecyclerView$w	// class@0021da
{
    public final c0 b;

    public void d0(c0 p0){
       this.b = p0;
       super();
    }
    public boolean a(RecyclerView p0,MotionEvent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "rv");
       a.p(p1, "e");
       if (!p1.getAction()) {
          d0 tb = this.b;
          tb.b(tb.d, tb.e);
       }
       return false;
    }
}
