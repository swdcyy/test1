package hz0.b$c;
import x43.c;
import hz0.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Iterator;
import java.util.Set;
import x43.b;
import java.lang.Integer;
import ug1.s0;
import com.kwai.robust.PatchProxyResult;

public class b$c implements c	// class@0027cc
{
    public final b a;

    public void b$c(b p0){
       this.a = p0;
       super();
    }
    public void a(View p0,boolean p1){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "2")) {
          return;
       }
       Iterator iterator = this.a.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public void b(View p0,boolean p1){
       b.d(this, p0, p1);
    }
    public void c(View p0,boolean p1){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "1")) {
          return;
       }
       Iterator iterator = this.a.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0, p1);
       }
       return;
    }
    public void d(int p0){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "4")) {
          return;
       }
       b e = this.a.E;
       if (e == null) {
          return;
       }
       e.e(p0);
       return;
    }
    public boolean e(int p0){
       b obj;
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a.E;
       if (obj == null) {
          return true;
       }else {
          return obj.d(p0);
       }
    }
}
