package go1.a$a;
import lo1.c;
import go1.a;
import java.lang.Object;
import android.view.View$OnTouchListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lo1.b;
import android.view.MotionEvent;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import ko1.b0;

public class a$a implements c	// class@00252e
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void a(View$OnTouchListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       a$a tb = this.b;
       a v = tb.v;
       if (v != null) {
          v.a(p0);
       }else {
          tb.w = p0;
       }
       return;
    }
    public void b(boolean p0){
       b.a(this, p0);
    }
    public boolean c(MotionEvent p0,boolean p1){
       a obj;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b.v;
       if (obj != null) {
          return obj.c(p0, p1);
       }else {
          return false;
       }
    }
    public b0 d(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.v;
       if (obj != null) {
          objArray = obj.d();
       }
       return objArray;
    }
}
