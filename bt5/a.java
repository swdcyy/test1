package bt5.a;
import joc.d;
import lkd.b;
import java.lang.Object;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import a2.i0;
import com.yxcorp.utility.n;

public class a implements d	// class@0005fd
{
    public b a;

    public void a(b p0){
       super();
       this.a = p0;
    }
    public boolean a(MotionEvent p0,boolean p1){
       View obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a.get();
       if (obj != null && (!i0.X(obj) || obj.getVisibility())) {
          return false;
       }else {
          return (n.N(obj, p0) ^ 0x01);
       }
    }
}
