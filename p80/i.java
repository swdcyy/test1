package p80.i;
import java.lang.String;
import nsd.u;
import com.kuaishou.webkit.extension.KwSdk;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public final class i	// class@0028d1
{
    public final int errCode;
    public final String errMsg;
    public final String kwSdkVersion;
    public final int retryTimes;
    public final boolean value;

    public void i(){
       super(false, 0, null, 0, null, 31, null);
    }
    public void i(boolean p0,int p1,String p2,int p3,String p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = true;
       }
       if (p5 & 0x02) {
          p1 = 0x30da4;
       }
       if (p5 & 0x04) {
          p2 = "";
       }
       if (p5 & 0x08) {
          p3 = 0;
       }
       if (p5 & 0x10) {
          p4 = KwSdk.getVersionName();
          a.o(p4, "KwSdk.getVersionName\(\)");
       }else {
          p4 = null;
       }
       a.p(p2, "errMsg");
       a.p(p4, "kwSdkVersion");
       super();
       this.value = p0;
       this.errCode = p1;
       this.errMsg = p2;
       this.retryTimes = p3;
       this.kwSdkVersion = p4;
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       String str = a.a.q(this);
       u1.Q("kswebview_event_kernel_install_new", str);
       Log.b("KsWebView", "kswebview_event_kernel_install_new"+": "+str);
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof i && (this.value == p0.value && (this.errCode == p0.errCode && (a.g(this.errMsg, p0.errMsg) && (this.retryTimes == p0.retryTimes && a.g(this.kwSdkVersion, p0.kwSdkVersion))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       int i;
       i obj = PatchProxy.apply(null, this, i.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.value;
       if (obj != null) {
          i = 1;
       }
       i = ((i * 31) + this.errCode) * 31;
       i terrMsg = this.errMsg;
       int i1 = 0;
       int i2 = (terrMsg != null)? terrMsg.hashCode(): 0;
       i = (((i + i2) * 31) + this.retryTimes) * 31;
       terrMsg = this.kwSdkVersion;
       if (terrMsg != null) {
          i1 = terrMsg.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KsWebViewInstallLogger\(value="+this.value+", errCode="+this.errCode+", errMsg="+this.errMsg+", retryTimes="+this.retryTimes+", kwSdkVersion="+this.kwSdkVersion+"\)";
    }
}
