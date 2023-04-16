package bx8.k$g;
import erd.o;
import java.lang.String;
import java.lang.Object;
import java.lang.Double;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;

public final class k$g implements o	// class@00047f
{
    public final String b;

    public void k$g(String p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       k$g og = PatchProxy.applyOneRefs(p0, this, k$g.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Object[] objArray = new Object[0];
          a.b().w("ShareReEditRepo", "remuxVideo complete:"+p0, objArray);
          og = this.b;
       }
       return og;
    }
}
