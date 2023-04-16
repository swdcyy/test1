package p80.r;
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
import java.lang.Float;
import java.lang.Number;
import java.lang.StringBuilder;

public final class r	// class@0028dc
{
    public final String coreVersion;
    public final String kwSdkVersion;
    public final int loadType;
    public final String query;
    public float ratio;
    public final boolean systemWebView;
    public final String url;

    public void r(String p0,String p1,int p2,boolean p3,float p4,String p5,String p6,int p7,u p8){
       p6 = "";
       if (p7 & 0x01) {
          p0 = p6;
       }
       if (p7 & 0x02) {
          p1 = p6;
       }
       if (p7 & 0x10) {
          p4 = 0x3f800000;
       }
       p6 = null;
       p5 = (p7 & 0x20)? v.c(): p6;
       if (p7 & 0x40) {
          p6 = KwSdk.getVersionName();
          a.o(p6, "KwSdk.getVersionName\(\)");
       }
       a.p(p0, "url");
       a.p(p1, "query");
       a.p(p5, "coreVersion");
       a.p(p6, "kwSdkVersion");
       super();
       this.url = p0;
       this.query = p1;
       this.loadType = p2;
       this.systemWebView = p3;
       this.ratio = p4;
       this.coreVersion = p5;
       this.kwSdkVersion = p6;
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof r && (a.g(this.url, p0.url) && (a.g(this.query, p0.query) && (this.loadType == p0.loadType && (this.systemWebView == p0.systemWebView && (!Float.compare(this.ratio, p0.ratio) && (a.g(this.coreVersion, p0.coreVersion) && a.g(this.kwSdkVersion, p0.kwSdkVersion))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       r obj = PatchProxy.apply(null, this, r.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.url;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       r tquery = this.query;
       int i2 = (tquery != null)? tquery.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.loadType) * 31;
       tquery = this.systemWebView;
       if (tquery != null) {
          i2 = 1;
       }
       i1 = (((i1 + i2) * 31) + Float.floatToIntBits(this.ratio)) * 31;
       tquery = this.coreVersion;
       i2 = (tquery != null)? tquery.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tquery = this.kwSdkVersion;
       if (tquery != null) {
          i = tquery.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, r.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PageLoadReportParam\(url="+this.url+", query="+this.query+", loadType="+this.loadType+", systemWebView="+this.systemWebView+", ratio="+this.ratio+", coreVersion="+this.coreVersion+", kwSdkVersion="+this.kwSdkVersion+"\)";
    }
}
