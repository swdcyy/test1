package e7a.f;
import erd.g;
import e7a.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;

public final class f implements g	// class@002086
{
    public final d b;

    public void f(d p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          d u = this.b.u;
          if (u != null) {
             u.setText(p0);
          }
       }
       return;
    }
}
