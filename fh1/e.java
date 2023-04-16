package fh1.e;
import com.kuaishou.live.common.core.component.gift.data.giftbox.api.response.LiveVipGradeInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class e	// class@00233a
{
    public LiveVipGradeInfo mLiveVipGradeInfo;

    public void e(){
       super(null);
    }
    public void e(LiveVipGradeInfo p0){
       super();
       this.mLiveVipGradeInfo = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof e && a.g(this.mLiveVipGradeInfo, p0.mLiveVipGradeInfo))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       e obj = PatchProxy.apply(null, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mLiveVipGradeInfo;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveVipGradeInfoResponse\(mLiveVipGradeInfo="+this.mLiveVipGradeInfo+"\)";
    }
}
