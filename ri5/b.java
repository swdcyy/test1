package ri5.b;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import ri5.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public abstract class b	// class@003a42
{

    public void b(){
       super();
    }
    public abstract void a(View p0,String p1,b$a p2);
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       this.d(p0, null, null);
       return;
    }
    public final void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "3")) {
          return;
       }
       a.p(p0, "msg");
       a.p(p1, "key");
       this.d(p0, p1, null);
       return;
    }
    public abstract void d(String p0,String p1,b$a p2);
    public abstract b e(int p0);
}
