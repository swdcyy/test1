package d01.h;
import d61.k0$a;
import java.lang.Object;
import d01.m;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class h implements k0$a	// class@001edb
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final Object get(Object p0){
       Objects.requireNonNull(p0);
       Object obj = PatchProxy.apply(null, p0, m.class, "3");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): p0.a();
       return Boolean.valueOf(b);
    }
}
