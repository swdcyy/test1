package bh.i$a;
import java.util.Comparator;
import bh.i;
import java.lang.Object;
import gh.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class i$a implements Comparator	// class@000b36
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i$a.class, "1");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): p1.b() - p0.b();
       return i;
    }
}
