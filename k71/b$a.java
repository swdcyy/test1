package k71.b$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b$a	// class@002ca2
{
    public final String magicFaceId;

    public void b$a(){
       super("");
    }
    public void b$a(String p0){
       super();
       this.magicFaceId = p0;
    }
    public final String a(){
       return this.magicFaceId;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b$a && a.g(this.magicFaceId, p0.magicFaceId))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b$a obj = PatchProxy.apply(null, this, b$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.magicFaceId;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(magicFaceId="+this.magicFaceId+"\)";
    }
}
