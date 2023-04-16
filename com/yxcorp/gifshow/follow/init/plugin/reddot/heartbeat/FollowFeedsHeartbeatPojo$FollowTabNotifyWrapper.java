package com.yxcorp.gifshow.follow.init.plugin.reddot.heartbeat.FollowFeedsHeartbeatPojo$FollowTabNotifyWrapper;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import com.yxcorp.gifshow.model.FollowTabNotify;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class FollowFeedsHeartbeatPojo$FollowTabNotifyWrapper implements Serializable, a	// class@0010f3
{
    public FollowTabNotify mCommonFollowTabNotify;
    public FollowTabNotify mInTabFollowTabNotify;
    public long mNotifyId;
    public String mPayload;
    public static final long serialVersionUID = 0xc62703ba00cc506;

    public void FollowFeedsHeartbeatPojo$FollowTabNotifyWrapper(){
       super();
    }
    public void afterDeserialize(){
       FollowFeedsHeartbeatPojo$FollowTabNotifyWrapper tmCommonFoll = this.mCommonFollowTabNotify;
       if (tmCommonFoll != null) {
          tmCommonFoll.mNotifyId = this.mNotifyId;
          tmCommonFoll.mPayload = this.mPayload;
       }
       tmCommonFoll = this.mInTabFollowTabNotify;
       if (tmCommonFoll != null) {
          tmCommonFoll.mNotifyId = this.mNotifyId;
          tmCommonFoll.mPayload = this.mPayload;
       }
       return;
    }
    public boolean valid(){
       FollowFeedsHeartbeatPojo$FollowTabNotifyWrapper obj = PatchProxy.apply(null, this, FollowFeedsHeartbeatPojo$FollowTabNotifyWrapper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mCommonFollowTabNotify;
       boolean b = (obj != null && obj.valid())? true: false;
       return b;
    }
}
