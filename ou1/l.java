package ou1.l;
import androidx.lifecycle.Observer;
import ou1.o;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;
import ou1.k;
import java.lang.Runnable;
import ekd.k1;

public final class l implements Observer	// class@0035a1
{
    public final o b;

    public void l(o p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else {
          o s = this.b.s;
          if (s == null) {
             a.S("multiPkGradeTextView");
          }
          s.setText(p0);
          k1.s(new k(this), this.b, 0);
       }
       return;
    }
}
