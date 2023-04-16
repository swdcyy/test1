package com.kwai.live.gzone.accompanyplay.audience.l;
import com.kwai.live.gzone.accompanyplay.audience.b1;
import com.kwai.live.gzone.accompanyplay.audience.b1$a;
import o37.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAudienceAccompanyFleetInfo;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyUserOrderInfo;
import java.util.List;
import g37.e;

public class l extends b1	// class@000b96
{

    public void l(){
       super();
    }
    public boolean g(b1$a p0){
       boolean b;
       a obj = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!super.g(p0)){
          obj = this.h();
          if (obj != null && p0.mServerTime - obj.mServerTime >= 0) {
             obj = obj.mUserOrderInfo;
             p0.mUserOrderInfo = obj;
             LiveGzoneAudienceAccompanyFleetInfo mOnBoardMemb = p0.mFleetInfo.mOnBoardMembers;
             if (mOnBoardMemb != null && (obj != null && obj.mOrderStatus == 20)) {
                e.d(mOnBoardMemb);
             }
          }else {
             b = false;
          }
       }
       b = true;
       return b;
    }
}
