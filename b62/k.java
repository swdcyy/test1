package b62.k;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import com.kwai.framework.model.user.UserInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class k implements g	// class@000346
{
    public final i b;

    public void k(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "17")) {
       }else {
          LiveConditionRedPacketInfo liveConditio = tb.n6();
          if (liveConditio != null) {
             LiveConditionRedPacketInfo e = liveConditio.e;
             if (e != null && !TextUtils.x(e.mId)) {
                if (p0 == null || TextUtils.x(p0.b)) {
                   b.B(LiveLogTag.LIVE_RED_PACKET, "update red packet follow status fail, course event or userId not exist!");
                }else if(TextUtils.n(p0.b, liveConditio.e.mId)){
                   tb.Z8(p0.c, false);
                }
             }
          }
       }
       return;
    }
}
