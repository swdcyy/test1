package h71.t$a;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class t$a	// class@002648
{
    public final String bizExtraInfo;
    public final Integer bizType;
    public final String liveStreamId;
    public final List muteInfo;

    public final String a(){
       return this.liveStreamId;
    }
    public final List b(){
       return this.muteInfo;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof t$a && (a.g(this.liveStreamId, p0.liveStreamId) && (a.g(this.bizType, p0.bizType) && (a.g(this.bizExtraInfo, p0.bizExtraInfo) && a.g(this.muteInfo, p0.muteInfo)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       t$a obj = PatchProxy.apply(null, this, t$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveStreamId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       t$a tbizType = this.bizType;
       int i2 = (tbizType != null)? tbizType.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbizType = this.bizExtraInfo;
       i2 = (tbizType != null)? tbizType.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tbizType = this.muteInfo;
       if (tbizType != null) {
          i = tbizType.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, t$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Params\(liveStreamId="+this.liveStreamId+", bizType="+this.bizType+", bizExtraInfo="+this.bizExtraInfo+", muteInfo="+this.muteInfo+"\)";
    }
}
