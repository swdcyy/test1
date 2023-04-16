package h51.d;
import sw6.a;
import h51.e;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import h51.a;

public class d implements a	// class@002624
{
    public final e a;

    public void d(e p0){
       this.a = p0;
       super();
    }
    public boolean a(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a.e.a(p0);
       return true;
    }
    public boolean b(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a.e.b(p0);
       return true;
    }
    public void c(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "3")) {
          return;
       }
       this.a.e.setEnabled(p0);
       return;
    }
}
