package z5c.a;
import java.lang.Object;
import com.kwai.library.widget.popup.bubble.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Boolean;
import ekd.s0;
import java.lang.Number;
import ab.d;

public abstract class a	// class@004b8a
{

    public void a(){
       super();
    }
    public boolean a(){
       return true;
    }
    public abstract a b();
    public String c(){
       return "";
    }
    public String d(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e()+this.c();
    }
    public abstract String e();
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       return s0.a(this.d(), p0.d());
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.d()};
       return d.b(obj);
    }
}
