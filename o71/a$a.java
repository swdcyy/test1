package o71.a$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a$a	// class@00349c
{
    public final String bizExtraInfo;
    public final Boolean isMultiPk;
    public final Integer mediaType;
    public final String pkId;
    public final String targetUserId;

    public final String a(){
       return this.bizExtraInfo;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$a && (a.g(this.pkId, p0.pkId) && (a.g(this.isMultiPk, p0.isMultiPk) && (a.g(this.targetUserId, p0.targetUserId) && (a.g(this.mediaType, p0.mediaType) && a.g(this.bizExtraInfo, p0.bizExtraInfo))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.pkId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a$a tisMultiPk = this.isMultiPk;
       int i2 = (tisMultiPk != null)? tisMultiPk.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tisMultiPk = this.targetUserId;
       i2 = (tisMultiPk != null)? tisMultiPk.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tisMultiPk = this.mediaType;
       i2 = (tisMultiPk != null)? tisMultiPk.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tisMultiPk = this.bizExtraInfo;
       if (tisMultiPk != null) {
          i = tisMultiPk.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Request\(pkId="+this.pkId+", isMultiPk="+this.isMultiPk+", targetUserId="+this.targetUserId+", mediaType="+this.mediaType+", bizExtraInfo="+this.bizExtraInfo+"\)";
    }
}
