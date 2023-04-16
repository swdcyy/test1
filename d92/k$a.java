package d92.k$a;
import d92.p;
import d92.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.SwipeLayout$b;

public class k$a implements p	// class@0024af
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       this.a.z = p0;
    }
    public void b(boolean p0){
       this.a.y = p0;
    }
    public boolean c(){
       return this.a.x;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "1")) {
          return;
       }
       k a = this.a.A;
       if (a != null) {
          a.a();
       }
       return;
    }
}
