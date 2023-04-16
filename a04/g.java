package a04.g;
import erd.g;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a04.j;

public final class g implements g	// class@00000d
{
    public final boolean b;

    public void g(boolean p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          j.k.e(p0, this.b);
       }
       return;
    }
}
