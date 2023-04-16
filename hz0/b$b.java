package hz0.b$b;
import x43.a;
import hz0.b;
import java.lang.Object;
import x43.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import android.view.View;

public class b$b implements a	// class@0027cb
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "2")) {
          return;
       }
       this.a.r.remove(p0);
       return;
    }
    public View b(){
       return this.a.s;
    }
    public void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       this.a.r.add(p0);
       return;
    }
}
