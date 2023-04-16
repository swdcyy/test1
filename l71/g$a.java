package l71.g$a;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class g$a	// class@002e97
{
    public final JsonObject animParam;
    public final Integer animType;

    public final JsonObject a(){
       return this.animParam;
    }
    public final Integer b(){
       return this.animType;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof g$a && (a.g(this.animType, p0.animType) && a.g(this.animParam, p0.animParam)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       g$a obj = PatchProxy.apply(null, this, g$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.animType;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       g$a tanimParam = this.animParam;
       if (tanimParam != null) {
          i = tanimParam.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, g$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(animType="+this.animType+", animParam="+this.animParam+"\)";
    }
}
