package i91.k$i;
import z1.a;
import java.lang.Object;
import lt.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class k$i implements a	// class@00286e
{
    public final int a;

    public void k$i(int p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$i.class, "1")) {
       }else if(p0 != null){
          p0.g(this.a);
       }
       return;
    }
}
