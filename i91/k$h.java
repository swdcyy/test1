package i91.k$h;
import z1.a;
import java.lang.String;
import java.lang.Object;
import lt.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class k$h implements a	// class@00286d
{
    public final String a;

    public void k$h(String p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$h.class, "1")) {
       }else if(p0 != null){
          p0.b(this.a);
       }
       return;
    }
}
