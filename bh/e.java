package bh.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.util.Arrays;

public final class e	// class@000b31
{
    public final Object a;
    public final Throwable b;

    public void e(Object p0){
       super();
       this.a = p0;
       this.b = null;
    }
    public void e(Throwable p0){
       super();
       this.b = p0;
       this.a = null;
    }
    public Throwable a(){
       return this.b;
    }
    public Object b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof e) {
          return false;
       }
       if (this.b() != null && this.b().equals(p0.b())) {
          return b;
       }
       if (this.a() != null && p0.a() != null) {
          return (this.a().toString()).equals(this.a().toString());
       }
       return false;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.b(),this.a()};
       return Arrays.hashCode(obj);
    }
}
