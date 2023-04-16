package nfd.e;
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

public class e implements d	// class@001da3
{
    public b a;

    public void e(b p0){
       super();
       this.a = p0;
    }
    public boolean a(MotionEvent p0,boolean p1){
       View obj;
       int i;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a.get();
       if (obj != null && (i0.X(obj) && (obj.getVisibility() || n.N(obj, p0)))) {
          return false;
       }else if(p1){
          i = -1;
       }else {
          i = 1;
       }
       return obj.canScrollHorizontally(i);
    }
}
