package a5a.a$a;
import joc.t;
import a5a.a;
import android.app.Activity;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.String;

public class a$a extends t	// class@000032
{
    public final Activity d;
    public final a e;

    public void a$a(a p0,Activity p1,Activity p2){
       this.e = p0;
       this.d = p2;
       super(p1);
    }
    public void d(boolean p0,float p1,float p2,MotionEvent p3,boolean p4,float p5,float p6){
       if (PatchProxy.isSupport(a$a.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),p3,Boolean.valueOf(p4),Float.valueOf(p5),Float.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
             return;
          }
       }
       this.d.finishAfterTransition();
       return;
    }
}
