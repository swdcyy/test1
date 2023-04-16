package ad7.b;
import zr6.e;
import wq6.h;
import ad7.a;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.nearby.local.HomeLocalFragment;
import wq6.d;
import fr6.a;
import fr6.e;

public class b extends e	// class@0000aa
{
    public HomeLocalFragment e;
    public boolean f;
    public h g;
    public final e h;

    public void b(h p0){
       super();
       this.h = new a(this);
       this.g = p0;
    }
    public void f(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (p0 instanceof HomeLocalFragment) {
          this.e = p0;
          this.n().b0().a(this.h);
       }
       return;
    }
    public void g(Fragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       if (this.e != null) {
          this.n().b0().d(this.h);
       }
       return;
    }
    public void h(h p0){
    }
    public void i(h p0){
    }
}
