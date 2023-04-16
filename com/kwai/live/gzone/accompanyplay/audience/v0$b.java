package com.kwai.live.gzone.accompanyplay.audience.v0$b;
import erd.g;
import com.kwai.live.gzone.accompanyplay.audience.v0;
import java.lang.Object;
import o37.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.StringBuilder;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAudienceAccompanyFleetInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyUserOrderInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanySettingInfo;

public class v0$b implements g	// class@000bbe
{
    public final v0 b;

    public void v0$b(v0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v0$b.class, "1")) {
       }else {
          v0$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, v0.class, "10")) {
             StringBuilder str = " accompanyId:"+p0.mFleetInfo.mAccompanyId+" ,accompanyStatus:"+p0.mFleetInfo.mAccompanyStatus+" ,roundId:"+p0.mFleetInfo.mCurrentRoundId;
             str = (p0.mUserOrderInfo != null)? str+" ,orderId:"+p0.mUserOrderInfo.mOrderId+" ,orderStatus:"+p0.mUserOrderInfo.mOrderStatus: str+" ,no orderInfo:";
             b.c0(LiveLogTag.LIVE_GZONE_ACCOMPANY, "updateJointInfo", "info:", str);
          }
          a mUserOrderIn = p0.mUserOrderInfo;
          if (mUserOrderIn != null) {
             this.b.Z8(mUserOrderIn, p0.mFleetInfo.mAccompanyId);
          }
          a mFleetInfo = p0.mFleetInfo;
          this.b.Y8(mFleetInfo.mAccompanyId, mFleetInfo.mAccompanyStatus);
          tb = this.b;
          tb.y = p0.mFleetInfo.mSettingInfo.isFree() ^ 0x01;
       }
       return;
    }
}
