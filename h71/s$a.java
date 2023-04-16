package h71.s$a;
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

public final class s$a	// class@002646
{
    public final Integer durationType;
    public final String text;

    public final Integer a(){
       return this.durationType;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof s$a && (a.g(this.text, p0.text) && a.g(this.durationType, p0.durationType)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       s$a obj = PatchProxy.apply(null, this, s$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.text;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       s$a tdurationTyp = this.durationType;
       if (tdurationTyp != null) {
          i = tdurationTyp.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, s$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(text="+this.text+", durationType="+this.durationType+"\)";
    }
}
