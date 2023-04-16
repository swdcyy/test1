package eg1.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d	// class@00214c
{
    public final int supportMaxVersion;

    public void d(int p0){
       super();
       this.supportMaxVersion = p0;
    }
    public final int a(){
       return this.supportMaxVersion;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof d && this.supportMaxVersion == p0.supportMaxVersion)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.supportMaxVersion;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveEffectSDKInfo\(supportMaxVersion="+this.supportMaxVersion+"\)";
    }
}
