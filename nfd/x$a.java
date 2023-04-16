package nfd.x$a;
import com.yxcorp.plugin.search.SearchMode;
import java.lang.Object;
import nfd.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class x$a	// class@001e20
{
    public final SearchMode a;
    public boolean b;

    public void x$a(SearchMode p0){
       super();
       this.a = p0;
    }
    public x a(){
       Object obj = PatchProxy.apply(null, this, x$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new x(this);
    }
}
