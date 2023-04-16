package ft1.i;
import erd.g;
import ft1.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multipk.api.LiveMultiPkInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.List;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt;
import java.lang.Boolean;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkVoteEnd;
import zs1.b;
import com.kuaishou.android.live.log.b;
import it1.b;
import com.kuaishou.live.lite.pk.MultiPkGameState;
import com.kwai.robust.PatchProxyResult;
import ut1.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class i implements g	// class@0023a0
{
    public final b b;

    public void i(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int i;
       boolean b2;
       b uob1;
       Object obj = this;
       SCLiveMultiPkVoteEnd obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, i.class, "1")) {
       }else {
          i b = obj.b;
          a.o(obj1, "it");
          Objects.requireNonNull(b);
          b uob = b.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, uob, "29")) {
             List list = LiveMultiPkDebugLogKt.b();
             Boolean uBoolean = Boolean.valueOf(obj1.isVoteEnd());
             SCLiveMultiPkVoteEnd voteEndInfo = obj1.getVoteEndInfo();
             voteEndInfo = (voteEndInfo != null)? voteEndInfo.pkId: null;
             b.U(list, "queryMultiPkInfo success", "isVoteEnd", uBoolean, "pkId", voteEndInfo, "param", b.n.p());
             boolean b1 = obj1.isVoteEnd();
             i = 0;
             int i1 = (b.g.k == MultiPkGameState.VOTE)? 1: 0;
             if (b1 & i1) {
                obj1 = obj1.getVoteEndInfo();
                if (obj1 != null) {
                   SCLiveMultiPkVoteEnd obj2 = PatchProxy.applyOneRefs(obj1, b, uob, "27");
                   if (obj2 != PatchProxyResult.class) {
                      b2 = obj2.booleanValue();
                   }else {
                      b.U(LiveMultiPkDebugLogKt.b(), "checkVoteEndInfo", "pkId", obj1.pkId, "globalPkId", b.i.e(), "param", b.n.p());
                      obj2 = obj1.pkId;
                      if (obj2 == null || !obj2.length()) {
                         i = 1;
                      }
                      b2 = (i ^ 0x01) & TextUtils.n(obj1.pkId, b.i.e());
                   }
                   if (b2) {
                      b.r(obj1, b.i);
                   }
                }
             }
          }
       }
       return;
    }
}
