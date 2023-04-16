package c61.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@00047d
{
    public int a;

    public void a(int p0){
       super();
       this.a = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof a && this.a == p0.a)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Data\(userLayerFrequency="+this.a+"\)";
    }
}
