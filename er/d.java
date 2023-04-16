package er.d;
import er.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public final class d extends k	// class@00158b
{
    public final boolean a;

    public void d(boolean p0){
       super();
       this.a = p0;
    }
    public boolean b(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof k) {
          return false;
       }
       if (this.a != p0.b()) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       int i = (this.a != null)? 1231: 1237;
       return (i ^ 0xf4243);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UploadInfo{degrade="+this.a+"}";
    }
}
