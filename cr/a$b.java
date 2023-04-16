package cr.a$b;
import cr.f$a;
import cr.f;
import java.lang.String;
import java.lang.Integer;
import cr.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import cr.a;
import java.lang.IllegalStateException;
import java.util.Objects;

public final class a$b extends f$a	// class@00141c
{
    public String a;
    public Integer b;

    public void a$b(){
       super();
    }
    public void a$b(f p0){
       super();
       this.a = p0.b();
       this.b = Integer.valueOf(p0.c());
    }
    public void a$b(f p0,a$a p1){
       super(p0);
    }
    public f a(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.a == null)? " config": "";
       if (this.b == null) {
          obj = obj+" droppedLogCount";
       }
       if (obj.isEmpty()) {
          return new a(this.a, this.b.intValue(), objArray);
       }else {
          throw new IllegalStateException("Missing required properties:"+obj);
       }
    }
    public f$a b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null config");
       this.a = p0;
       return this;
    }
    public f$a c(int p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b = Integer.valueOf(p0);
       return this;
    }
}
