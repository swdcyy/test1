package daa.c;
import com.yxcorp.gifshow.easteregg.model.ConditionConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c implements ConditionConfig	// class@001ecd
{
    public final long endTime;
    public final Set keywords;
    public final long startTime;

    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c && (a.g(this.keywords, p0.keywords) && (!this.startTime - p0.startTime && !this.endTime - p0.endTime)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       c obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.keywords;
       int i = (obj != null)? obj.hashCode(): 0;
       c tstartTime = this.startTime;
       tstartTime = this.endTime;
       return ((((i * 31) + (int)(tstartTime ^ (tstartTime >> 32))) * 31) + (int)(tstartTime ^ (tstartTime >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ConditionConfigKeywordsAndTime\(keywords="+this.keywords+", startTime="+this.startTime+", endTime="+this.endTime+"\)";
    }
}
