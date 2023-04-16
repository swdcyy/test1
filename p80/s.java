package p80.s;
import java.lang.String;
import nsd.u;
import p80.v;
import com.kuaishou.webkit.extension.KwSdk;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class s	// class@0028dd
{
    public final String coreVersion;
    public final String kwSdkVersion;
    public final String msg;
    public final String value;

    public void s(){
       super(null, null, null, null, 15, null);
    }
    public void s(String p0,String p1,String p2,String p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = "";
       }
       if (p4 & 0x02) {
          p1 = "";
       }
       if (p4 & 0x04) {
          p2 = v.c();
       }
       if (p4 & 0x08) {
          p3 = KwSdk.getVersionName();
          a.o(p3, "KwSdk.getVersionName\(\)");
       }else {
          p3 = null;
       }
       a.p(p0, "value");
       a.p(p1, "msg");
       a.p(p2, "coreVersion");
       a.p(p3, "kwSdkVersion");
       super();
       this.value = p0;
       this.msg = p1;
       this.coreVersion = p2;
       this.kwSdkVersion = p3;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, s.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof s && (a.g(this.value, p0.value) && (a.g(this.msg, p0.msg) && (a.g(this.coreVersion, p0.coreVersion) && a.g(this.kwSdkVersion, p0.kwSdkVersion)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       s obj = PatchProxy.apply(null, this, s.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.value;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       s tmsg = this.msg;
       int i2 = (tmsg != null)? tmsg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmsg = this.coreVersion;
       i2 = (tmsg != null)? tmsg.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmsg = this.kwSdkVersion;
       if (tmsg != null) {
          i = tmsg.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, s.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ReportParam\(value="+this.value+", msg="+this.msg+", coreVersion="+this.coreVersion+", kwSdkVersion="+this.kwSdkVersion+"\)";
    }
}
