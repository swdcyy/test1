package dz9.d$b;
import erd.g;
import e17.i$b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;

public final class d$b implements g	// class@00200d
{
    public final i$b b;

    public void d$b(i$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
       }else {
          i.z(this.b);
       }
       return;
    }
}
