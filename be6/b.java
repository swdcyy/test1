package be6.b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class b	// class@000467
{
    public final long costTime;
    public final int errCode;
    public final String errMsg;
    public final String fileName;
    public final boolean isSuccess;
    public final String source;

    public void b(String p0,boolean p1,String p2,long p3,int p4,String p5){
       a.p(p0, "fileName");
       a.p(p2, "source");
       super();
       this.fileName = p0;
       this.isSuccess = p1;
       this.source = p2;
       this.costTime = p3;
       this.errCode = p4;
       this.errMsg = p5;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof b && (a.g(this.fileName, p0.fileName) && (this.isSuccess == p0.isSuccess && (a.g(this.source, p0.source) && (!this.costTime - p0.costTime && (this.errCode == p0.errCode && a.g(this.errMsg, p0.errMsg)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.fileName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       b tisSuccess = this.isSuccess;
       if (tisSuccess != null) {
          tisSuccess = 1;
       }
       i1 = (i1 + tisSuccess) * 31;
       tisSuccess = this.source;
       int i2 = (tisSuccess != null)? tisSuccess.hashCode(): 0;
       tisSuccess = this.costTime;
       i1 = (((((i1 + i2) * 31) + (int)(tisSuccess ^ (tisSuccess >> 32))) * 31) + this.errCode) * 31;
       tisSuccess = this.errMsg;
       if (tisSuccess != null) {
          i = tisSuccess.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PluginWarmUpHitEvent\(fileName="+this.fileName+", isSuccess="+this.isSuccess+", source="+this.source+", costTime="+this.costTime+", errCode="+this.errCode+", errMsg="+this.errMsg+"\)";
    }
}
