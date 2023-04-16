package p80.d;
import java.lang.String;
import java.util.HashMap;
import java.util.ArrayList;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d	// class@0028cb
{
    public HashMap assistantInfo;
    public final String kernelVersion;
    public final String kwSdkVersion;
    public ArrayList recentUrls;

    public void d(){
       super(null, null, null, null, 15, null);
    }
    public void d(String p0,String p1,HashMap p2,ArrayList p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = "";
       }
       if (p4 & 0x02) {
          p1 = "";
       }
       a.p(p0, "kernelVersion");
       a.p(p1, "kwSdkVersion");
       super();
       this.kernelVersion = p0;
       this.kwSdkVersion = p1;
       this.assistantInfo = null;
       this.recentUrls = null;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && (a.g(this.kernelVersion, p0.kernelVersion) && (a.g(this.kwSdkVersion, p0.kwSdkVersion) && (a.g(this.assistantInfo, p0.assistantInfo) && a.g(this.recentUrls, p0.recentUrls)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.kernelVersion;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       d tkwSdkVersio = this.kwSdkVersion;
       int i2 = (tkwSdkVersio != null)? tkwSdkVersio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tkwSdkVersio = this.assistantInfo;
       i2 = (tkwSdkVersio != null)? tkwSdkVersio.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tkwSdkVersio = this.recentUrls;
       if (tkwSdkVersio != null) {
          i = tkwSdkVersio.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsWebViewExceptionInfo\(kernelVersion="+this.kernelVersion+", kwSdkVersion="+this.kwSdkVersion+", assistantInfo="+this.assistantInfo+", recentUrls="+this.recentUrls+"\)";
    }
}
