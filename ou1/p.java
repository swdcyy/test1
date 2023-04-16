package ou1.p;
import androidx.lifecycle.Observer;
import ou1.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;

public final class p implements Observer	// class@0035a5
{
    public final u b;

    public void p(u p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
       }else {
          u r = this.b.r;
          if (r == null) {
             a.S("multiPkGradeTextView");
          }
          r.setText(p0);
          this.b.f3();
       }
       return;
    }
}
