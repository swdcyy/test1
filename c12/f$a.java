package c12.f$a;
import androidx.fragment.app.c$b;
import c12.f;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class f$a extends c$b	// class@00049e
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "2")) {
          return;
       }
       this.a.V8();
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "1")) {
          return;
       }
       this.a.W8();
       return;
    }
}
