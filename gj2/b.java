package gj2.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b	// class@002b32
{
    public final List hlsPlayUrls;

    public void b(List p0){
       a.p(p0, "hlsPlayUrls");
       super();
       this.hlsPlayUrls = p0;
    }
    public final List a(){
       return this.hlsPlayUrls;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && a.g(this.hlsPlayUrls, p0.hlsPlayUrls))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.hlsPlayUrls;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAudienceScreencastHlsConfig\(hlsPlayUrls="+this.hlsPlayUrls+"\)";
    }
}
