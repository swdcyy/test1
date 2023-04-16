package com.kwai.feature.post.api.liveavatar.LiveAvatarPostedStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAvatarPostedStatus extends Enum	// class@0013f6
{
    public final int value;
    public static final LiveAvatarPostedStatus[] $VALUES;
    public static final LiveAvatarPostedStatus NONE;
    public static final LiveAvatarPostedStatus PHOTO;
    public static final LiveAvatarPostedStatus STATE;
    public static final LiveAvatarPostedStatus STATE_AND_PHOTO;

    static {
       LiveAvatarPostedStatus liveAvatarPo1;
       LiveAvatarPostedStatus[] liveAvatarPo = new LiveAvatarPostedStatus[]{liveAvatarPo1,liveAvatarPo1,liveAvatarPo1,liveAvatarPo1};
       liveAvatarPo1 = new LiveAvatarPostedStatus("NONE", 0, 0);
       LiveAvatarPostedStatus.NONE = liveAvatarPo1;
       liveAvatarPo1 = new LiveAvatarPostedStatus("STATE_AND_PHOTO", 1, 1);
       LiveAvatarPostedStatus.STATE_AND_PHOTO = liveAvatarPo1;
       liveAvatarPo1 = new LiveAvatarPostedStatus("STATE", 2, 2);
       LiveAvatarPostedStatus.STATE = liveAvatarPo1;
       liveAvatarPo1 = new LiveAvatarPostedStatus("PHOTO", 3, 3);
       LiveAvatarPostedStatus.PHOTO = liveAvatarPo1;
       LiveAvatarPostedStatus.$VALUES = liveAvatarPo;
    }
    public void LiveAvatarPostedStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LiveAvatarPostedStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAvatarPostedStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAvatarPostedStatus.class, p0);
    }
    public static LiveAvatarPostedStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAvatarPostedStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAvatarPostedStatus.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
