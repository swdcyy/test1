package i71.a$e;
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;
import java.lang.CharSequence;

public final class a$e	// class@002848
{
    public final Map bizExtraMap;
    public final Integer businessType;
    public final String liveStreamId;
    public final String pbString;

    public final Integer a(){
       return this.businessType;
    }
    public final String b(){
       return this.pbString;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a$e && (a.g(this.liveStreamId, p0.liveStreamId) && (a.g(this.businessType, p0.businessType) && (a.g(this.pbString, p0.pbString) && a.g(this.bizExtraMap, p0.bizExtraMap)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       a$e obj = PatchProxy.apply(null, this, a$e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveStreamId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       a$e tbusinessTyp = this.businessType;
       int i2 = (tbusinessTyp != null)? tbusinessTyp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbusinessTyp = this.pbString;
       i2 = (tbusinessTyp != null)? tbusinessTyp.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbusinessTyp = this.bizExtraMap;
       if (tbusinessTyp != null) {
          i = tbusinessTyp.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, a$e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "Param\(liveStreamId="+this.liveStreamId+", businessType="+this.businessType+", pbString=";
       a$e tpbString = this.pbString;
       boolean b = (tpbString == null || !tpbString.length())? true: false;
       return obj+b+')';
    }
}
