package hi0.f;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class f implements g	// class@0026cf
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else if(p0 != null){
          p0.printStackTrace();
       }
       return;
    }
}
