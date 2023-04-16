package led.g$c;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import led.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.String;
import com.google.android.material.appbar.AppBarLayout;
import o17.i;

public class g$c implements RefreshLayout$h	// class@001c21
{
    public final g a;

    public void g$c(g p0){
       this.a = p0;
       super();
    }
    public void a(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(g$c.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, g$c.class, "1")) {
          return;
       }
       if (p2) {
          g x = this.a.x;
          if (x != null) {
             x.p(true, true);
          }
       }
       return;
    }
    public void b(){
       i.d(this);
    }
    public void pullToRefresh(){
       i.b(this);
    }
    public void refreshComplete(){
       i.c(this);
    }
    public void releaseToRefresh(){
       i.e(this);
    }
}
