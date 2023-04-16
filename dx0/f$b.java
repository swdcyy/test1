package dx0.f$b;
import xv4.i;
import dx0.f;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class f$b extends i	// class@002055
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public void f(String p0,String[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$b.class, "1")) {
          return;
       }
       this.a.d9(p1);
       return;
    }
}
