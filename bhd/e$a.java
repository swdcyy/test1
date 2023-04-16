package bhd.e$a;
import androidx.lifecycle.Observer;
import bhd.e;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.TextUtils;
import android.widget.Button;

public final class e$a implements Observer	// class@000265
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
       }else {
          e p = this.b.p;
          if (p == null) {
             a.S("button");
          }
          int i = (TextUtils.x(p0))? 0: 8;
          p.setVisibility(i);
       }
       return;
    }
}
