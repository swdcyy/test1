package fh1.d;
import com.kuaishou.live.common.core.component.gift.data.giftbox.api.response.LiveUserRightsInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class d	// class@002339
{
    public LiveUserRightsInfo liveUserRightsInfo;

    public void d(){
       super(null);
    }
    public void d(LiveUserRightsInfo p0){
       super();
       this.liveUserRightsInfo = p0;
    }
    public final LiveUserRightsInfo a(){
       return this.liveUserRightsInfo;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof d && a.g(this.liveUserRightsInfo, p0.liveUserRightsInfo))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       d obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liveUserRightsInfo;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveUserRightsInfoResponse\(liveUserRightsInfo="+this.liveUserRightsInfo+"\)";
    }
}
