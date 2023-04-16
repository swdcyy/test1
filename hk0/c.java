package hk0.c;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@0026f6
{
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public void c(String p0,String p1,String p2,int p3,boolean p4){
       a.p(p0, "downloadUrl");
       a.p(p1, "destinationDir");
       a.p(p2, "destinationFileName");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (this.d == p0.d && this.e == p0.e)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       c tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       if (tb != null) {
          i = tb.hashCode();
       }
       i1 = (((i1 + i) * 31) + this.d) * 31;
       c te = this.e;
       if (te != null) {
          te = 1;
       }
       return (i1 + te);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KrnDownloadParams\(downloadUrl="+this.a+", destinationDir="+this.b+", destinationFileName="+this.c+", retryTimes="+this.d+", isPreload="+this.e+"\)";
    }
}
