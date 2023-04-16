package bx8.l;
import erd.r;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;

public final class l implements r	// class@000481
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          Object[] objArray = new Object[0];
          a.b().w("ShareReEditRepo", "sub: "+p0, objArray);
          b = (p0.length() > 0)? true: false;
       }
       return b;
    }
}
