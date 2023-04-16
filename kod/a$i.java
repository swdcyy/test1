package kod.a$i;
import t36.f$a;
import java.lang.Object;
import voc.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$i implements f$a	// class@001800
{
    public static final a$i a;

    static {
       a$i.a = new a$i();
    }
    public void a$i(){
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$i.class, "1")) {
       }else {
          p0.h();
       }
       return;
    }
}
