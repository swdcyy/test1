package a5b.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.b;

public final class d implements g	// class@000049
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          b.c("MagicSearchCandidateDataHolder", "refreshMagicSearchCandidateWords error", p0);
       }
       return;
    }
}
