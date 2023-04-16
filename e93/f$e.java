package e93.f$e;
import java.util.Comparator;
import java.lang.Object;
import e93.f$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class f$e implements Comparator	// class@0026c0
{
    public static final f$e b;

    static {
       f$e.b = new f$e();
    }
    public void f$e(){
       super();
    }
    public int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f$e.class, "1");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): p0.a() - p1.a();
       return i;
    }
}
