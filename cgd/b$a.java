package cgd.b$a;
import android.view.View$OnClickListener;
import cgd.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import cgd.b$d;

public class b$a implements View$OnClickListener	// class@00031e
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       p0 = p0.getTag();
       if (p0 instanceof Integer) {
          b h = this.b.h;
          if (h != null) {
             h.a(p0.intValue());
          }
       }
       return;
    }
}
