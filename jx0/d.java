package jx0.d;
import lf3.g;
import jx0.i;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant;
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

public final class d implements g	// class@002c24
{
    public final i b;

    public void d(i p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == null) {
       }else {
          LiveBlindDateSignalMessages$SCLiveBlindDateHideAudiencePendant liveStreamId = p0.liveStreamId;
          String liveStreamId1 = tb.P.getLiveStreamId();
          if (!TextUtils.n(liveStreamId, liveStreamId1)) {
             b.Z(LiveCommonLogTag.BLIND_DATE, "SCLiveBlindDateHideAudiencePendant repeat:"+liveStreamId+" "+liveStreamId1);
          }else {
             tb.b9();
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
