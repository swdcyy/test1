package cq1.d$b;
import java.util.Comparator;
import java.lang.Object;
import cq1.d$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class d$b implements Comparator	// class@001e35
{
    public static final d$b b;

    static {
       d$b.b = new d$b();
    }
    public void d$b(){
       super();
    }
    public int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d$b.class, "1");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): p0.a() - p1.a();
       return i;
    }
}
