package cr.a;
import cr.f;
import java.lang.String;
import cr.a$a;
import cr.f$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cr.a$b;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a extends f	// class@00141d
{
    public final String a;
    public final int b;

    public void a(String p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(String p0,int p1,a$a p2){
       super(p0, p1);
    }
    public String b(){
       return this.a;
    }
    public int c(){
       return this.b;
    }
    public f$a d(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$b(this, null);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof f) {
          return false;
       }
       if (!(this.a).equals(p0.b()) || this.b != p0.c()) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((this.a).hashCode() ^ 0xf4243) * 0xf4243) ^ this.b);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ControlConfigStat{config="+this.a+", droppedLogCount="+this.b+"}";
    }
}
