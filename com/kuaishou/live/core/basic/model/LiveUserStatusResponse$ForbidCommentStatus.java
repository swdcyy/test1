package com.kuaishou.live.core.basic.model.LiveUserStatusResponse$ForbidCommentStatus;
import java.io.Serializable;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCForbidComment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class LiveUserStatusResponse$ForbidCommentStatus implements Serializable	// class@0008a2
{
    public long mDurationMs;
    public boolean mIsForbidden;
    public long mStartTime;
    public long mTime;
    public final LiveUserStatusResponse this$0;
    public static final long serialVersionUID = 0x78291f5ede8912a0;

    public void LiveUserStatusResponse$ForbidCommentStatus(LiveUserStatusResponse p0){
       this.this$0 = p0;
       super();
    }
    public LiveStreamMessages$SCForbidComment parseToProto(){
       LiveStreamMessages$SCForbidComment obj = PatchProxy.apply(null, this, LiveUserStatusResponse$ForbidCommentStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveStreamMessages$SCForbidComment();
       obj.startTime = this.mStartTime;
       obj.time = this.mTime;
       obj.operatorType = 0;
       obj.duration = this.mDurationMs;
       return obj;
    }
}
