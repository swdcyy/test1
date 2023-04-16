package i91.k$b;
import z1.a;
import java.lang.Object;
import lt.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class k$b implements a	// class@002867
{
    public final int a;

    public void k$b(int p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "1")) {
       }else if(p0 != null){
          p0.j(this.a);
       }
       return;
    }
}
