package ik1.c;
import ok.o;
import com.kuaishou.live.common.core.component.gift.gift.i;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.gift.GiftMessage;
import qx1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import lm1.i;
import java.lang.Integer;
import lp3.i;
import km1.b;
import java.util.List;
import mm1.c;
import mm1.e;
import mm1.g;

public final class c implements o	// class@002920
{
    public final i b;

    public void c(i p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       int i;
       c tb = this.b;
       Objects.requireNonNull(tb);
       i oi = i.class;
       LiveSendGiftTraceInfo obj = PatchProxy.applyOneRefs(p0, tb, oi, "10");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          p0 = p0.cast();
          i = 5;
          if (tb.N.g6(i, String.valueOf(p0.mGiftId))) {
             b.c0(LiveLogTag.LIVE_SERVER_SIGNAL_BLOCK, "LiveGiftFeedBasePresenter ServerSignalBlocked", "data", p0.toString());
             if (!PatchProxy.applyVoidOneRefs(p0, tb, oi, "11")) {
                obj = tb.K.Ig(p0.mId);
                obj.i(p0);
                p0 = new i(obj);
                if (PatchProxy.isSupport(oi)) {
                   Object[] objArray = new Object[i];
                   objArray[b] = p0;
                   objArray[1] = "AFTER_SEND_GIFT";
                   objArray[2] = "CLIENT_HANDLE_FEED_PUSH";
                   objArray[3] = "[LiveGiftFeedBasePresenter][logServerSignalTraceInfo]sever signal block";
                   objArray[4] = Integer.valueOf(617);
                   if (!PatchProxy.applyVoid(objArray, tb, oi, "37")) {
                   }
                }else if(tb.F.b()){
                   b.P(b.a, "[LiveGiftFeedBasePresenter][logTraceInfo]service manager cleared");
                }else {
                   tb.K.yk(p0.e()).f("AFTER_SEND_GIFT").d("CLIENT_HANDLE_FEED_PUSH").g(617).e("[LiveGiftFeedBasePresenter][logServerSignalTraceInfo]sever signal block").a();
                }
             }
             b = 1;
          }
       }
       return (b ^ 0x01);
    }
}
