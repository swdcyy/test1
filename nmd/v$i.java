package nmd.v$i;
import t36.f$a;
import java.lang.Object;
import voc.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class v$i implements f$a	// class@001e81
{
    public static final v$i a;

    static {
       v$i.a = new v$i();
    }
    public void v$i(){
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$i.class, "1")) {
       }else {
          p0.h();
       }
       return;
    }
}
