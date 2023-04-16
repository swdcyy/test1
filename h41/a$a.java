package h41.a$a;
import ok.h;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import crd.a;

public final class a$a implements h	// class@00261b
{
    public static final a$a b;

    static {
       a$a.b = new a$a();
    }
    public void a$a(){
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = new a();
       }
       return p0;
    }
}
