package at7.c;
import androidx.lifecycle.Observer;
import at7.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;

public final class c implements Observer	// class@000368
{
    public final e b;

    public void c(e p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          e m = this.b.m;
          if (m == null) {
             a.S("trafficView");
          }
          m.setText(p0);
       }
       return;
    }
}
