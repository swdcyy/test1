package ab2.i$a;
import ab2.i$b;
import ab2.i;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public class i$a implements i$b	// class@0000a3
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(long p0,String p1,String p2,String p3){
       if (PatchProxy.isSupport(i$a.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), p1, p2, p3, this, i$a.class, "2")) {
          return;
       }
       this.a.P8(p0, p1, p2, p3);
       return;
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
          return;
       }
       this.a.P8(0, null, p0, null);
       return;
    }
}
