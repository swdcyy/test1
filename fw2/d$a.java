package fw2.d$a;
import androidx.recyclerview.widget.RecyclerView$q;
import fw2.d;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import msd.a;

public final class d$a implements RecyclerView$q	// class@0029f2
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public boolean a(RecyclerView p0,MotionEvent p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "rv");
       a.p(p1, "e");
       return true;
    }
    public void onRequestDisallowInterceptTouchEvent(boolean p0){
    }
    public void onTouchEvent(RecyclerView p0,MotionEvent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "2")) {
          return;
       }
       a.p(p0, "rv");
       a.p(p1, "e");
       if (!p1.getActionMasked()) {
          this.b.b.invoke();
       }
       return;
    }
}
