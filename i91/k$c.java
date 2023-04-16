package i91.k$c;
import z1.a;
import java.lang.String;
import java.lang.Object;
import lt.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class k$c implements a	// class@002868
{
    public final String a;

    public void k$c(String p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c.class, "1")) {
       }else if(p0 != null){
          p0.e(this.a);
       }
       return;
    }
}
