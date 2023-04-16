package g9a.b;
import joc.q;
import lnc.a1;
import g9a.b$a;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.String;

public class b extends q	// class@002412
{
    public final b$a c;
    public boolean d;
    public static final float e;

    static {
       b.e = (float)a1.e(250.00f);
    }
    public void b(b$a p0){
       super();
       this.c = p0;
    }
    public boolean b(){
       return true;
    }
    public void c(float p0,float p1,MotionEvent p2){
       this.d = false;
    }
    public void d(boolean p0,float p1,float p2,MotionEvent p3,boolean p4,float p5,float p6){
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),p3,Boolean.valueOf(p4),Float.valueOf(p5),Float.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
             return;
          }
       }
       if (p4) {
          if (p5 > 0) {
             this.g();
          }
       }else if((p3.getRawX() - p1) - b.e >= 0){
          this.g();
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.d == null) {
          this.d = true;
          this.c.a();
       }
       return;
    }
}
