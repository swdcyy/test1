package be6.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@000466
{
    public final long costTime;
    public final String downloadPriority;
    public final String downloadType;
    public final int errCode;
    public final String errMsg;
    public final String fileName;
    public final boolean isSuccess;

    public void a(String p0,boolean p1,String p2,long p3,int p4,String p5,String p6){
       a.p(p0, "fileName");
       a.p(p2, "downloadType");
       super();
       this.fileName = p0;
       this.isSuccess = p1;
       this.downloadType = p2;
       this.costTime = p3;
       this.errCode = p4;
       this.errMsg = p5;
       this.downloadPriority = p6;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (a.g(this.fileName, p0.fileName) && (this.isSuccess == p0.isSuccess && (a.g(this.downloadType, p0.downloadType) && (!this.costTime - p0.costTime && (this.errCode == p0.errCode && (a.g(this.errMsg, p0.errMsg) && a.g(this.downloadPriority, p0.downloadPriority))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.fileName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a tisSuccess = this.isSuccess;
       if (tisSuccess != null) {
          tisSuccess = 1;
       }
       i1 = (i1 + tisSuccess) * 31;
       tisSuccess = this.downloadType;
       int i2 = (tisSuccess != null)? tisSuccess.hashCode(): 0;
       tisSuccess = this.costTime;
       i1 = (((((i1 + i2) * 31) + (int)(tisSuccess ^ (tisSuccess >> 32))) * 31) + this.errCode) * 31;
       tisSuccess = this.errMsg;
       i2 = (tisSuccess != null)? tisSuccess.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tisSuccess = this.downloadPriority;
       if (tisSuccess != null) {
          i = tisSuccess.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PluginWarmUpDownloadEvent\(fileName="+this.fileName+", isSuccess="+this.isSuccess+", downloadType="+this.downloadType+", costTime="+this.costTime+", errCode="+this.errCode+", errMsg="+this.errMsg+", downloadPriority="+this.downloadPriority+"\)";
    }
}
