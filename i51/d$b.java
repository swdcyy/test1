package i51.d$b;
import i51.g;
import i51.d;
import java.lang.Object;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i51.f;
import java.lang.Boolean;
import java.lang.Number;

public class d$b implements g	// class@002824
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public e0 c(){
       Object obj = PatchProxy.apply(null, this, d$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.b.c();
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, d$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.b.d();
    }
    public boolean e(){
       Object obj = PatchProxy.apply(null, this, d$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.b.e();
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, d$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.b.g();
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, d$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.b.getLiveStreamId();
    }
}
