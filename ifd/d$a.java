package ifd.d$a;
import com.yxcorp.plugin.search.b$a;
import ifd.d;
import java.lang.Object;
import com.yxcorp.plugin.search.SearchMode;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v99.a;
import x6d.r;

public class d$a implements b$a	// class@001003
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void i1(SearchMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       this.b.p.j("dispatch_interrupted");
       return;
    }
    public void u1(SearchMode p0){
       r.b(this, p0);
    }
}
