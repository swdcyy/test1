package bi9.d;
import erd.g;
import java.lang.Object;
import bi9.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import j8c.a;
import q87.c;

public final class d implements g	// class@0004ae
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, b.class, "3")) {
       }else {
          String str = 1;
          if (p0.c.size() < str) {
             Object[] objArray = new Object[0];
             a.D().A("RecordSampling", "removeLastSegmentData when has no SampleData", objArray);
          }else {
             p0 = p0.c;
             p0.remove((p0.size() - str));
          }
       }
       return;
    }
}
