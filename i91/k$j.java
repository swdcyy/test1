package i91.k$j;
import z1.a;
import java.lang.String;
import java.lang.Object;
import lt.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class k$j implements a	// class@00286f
{
    public final String a;

    public void k$j(String p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$j.class, "1")) {
       }else if(p0 != null){
          p0.i(this.a);
       }
       return;
    }
}
