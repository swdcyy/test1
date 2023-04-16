package lh5.c;
import lh5.b;
import eh5.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lh5.b$a;
import java.lang.Long;

public abstract class c implements b, k	// class@002f60
{
    public long b;

    public void c(){
       super();
    }
    public void a(long[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "taskIds");
       b$a.b(this, p0);
       return;
    }
    public void j(long p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "2")) {
          return;
       }
       b$a.a(this, p0);
       return;
    }
}
