package jx0.c;
import lf3.g;
import jx0.i;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant;
import java.util.Objects;
import java.lang.String;
import p91.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import lf3.f;

public final class c implements g	// class@002c23
{
    public final i b;

    public void c(i p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == null) {
       }else {
          LiveBlindDateSignalMessages$SCLiveBlindDateShowAudiencePendant liveStreamId = p0.liveStreamId;
          String liveStreamId1 = tb.P.getLiveStreamId();
          if (!TextUtils.n(liveStreamId, liveStreamId1)) {
             b.Z(LiveCommonLogTag.BLIND_DATE, "SCLiveBlindDateShowAudiencePendant repeat:"+liveStreamId+" "+liveStreamId1);
          }else {
             tb.V = p0;
             b.Z(LiveCommonLogTag.BLIND_DATE, "SCLiveBlindDateShowAudiencePendant receive:"+tb.U0);
             if (tb.U0 != null) {
                if (TextUtils.x(tb.T)) {
                   tb.T = p0.contentKey;
                }
                tb.j9(p0);
             }else {
                tb.T = p0.contentKey;
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
