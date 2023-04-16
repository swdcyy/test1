package f11.a$b;
import lo1.c;
import f11.a;
import java.lang.Object;
import android.view.View$OnTouchListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import ko1.b0;

public class a$b implements c	// class@002268
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void a(View$OnTouchListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "2")) {
          return;
       }
       a$b tb = this.b;
       a p = tb.p;
       if (p != null) {
          p.a(p0);
       }else {
          tb.q = p0;
       }
       return;
    }
    public void b(boolean p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "4")) {
          return;
       }
       a p = this.b.p;
       if (p != null) {
          p.b(p0);
       }
       return;
    }
    public boolean c(MotionEvent p0,boolean p1){
       a obj;
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b.p;
       if (obj != null) {
          return obj.c(p0, p1);
       }else {
          return false;
       }
    }
    public b0 d(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.p;
       if (obj != null) {
          objArray = obj.d();
       }
       return objArray;
    }
}
