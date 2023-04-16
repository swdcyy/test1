package i91.k$d;
import z1.a;
import java.lang.String;
import java.lang.Object;
import lt.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class k$d implements a	// class@002869
{
    public final String a;
    public final String b;

    public void k$d(String p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$d.class, "1")) {
       }else if(p0 != null){
          p0.a(this.a, this.b);
       }
       return;
    }
}
