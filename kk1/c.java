package kk1.c;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c	// class@002d5e
{
    public final int count;
    public final int entryType;
    public final String giftId;
    public final boolean isCombo;
    public final int sourceType;

    public void c(String p0,int p1,boolean p2,int p3,int p4){
       a.p(p0, "giftId");
       super();
       this.giftId = p0;
       this.count = p1;
       this.isCombo = p2;
       this.entryType = p3;
       this.sourceType = p4;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.giftId, p0.giftId) && (this.count == p0.count && (this.isCombo == p0.isCombo && (this.entryType == p0.entryType && this.sourceType == p0.sourceType)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.giftId;
       int i = (obj != null)? obj.hashCode(): 0;
       i = ((i * 31) + this.count) * 31;
       c tisCombo = this.isCombo;
       if (tisCombo != null) {
          tisCombo = 1;
       }
       return (((((i + tisCombo) * 31) + this.entryType) * 31) + this.sourceType);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ResultData\(giftId="+this.giftId+", count="+this.count+", isCombo="+this.isCombo+", entryType="+this.entryType+", sourceType="+this.sourceType+"\)";
    }
}
