package cc0.h;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class h implements g	// class@00030d
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public void accept(Object p0){
       PatchProxy.applyVoidOneRefs(p0, this, h.class, "1");
    }
}
