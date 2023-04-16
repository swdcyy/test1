package a1d.s;
import sfc.a;
import a1d.r;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class s extends a	// class@000054
{
    public final r c;

    public void s(r p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.R8();
       return;
    }
}
