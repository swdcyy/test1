package i91.k$a;
import z1.a;
import java.lang.Object;
import lt.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class k$a implements a	// class@002866
{
    public final int a;

    public void k$a(int p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
       }else if(p0 != null){
          p0.f(this.a);
       }
       return;
    }
}
