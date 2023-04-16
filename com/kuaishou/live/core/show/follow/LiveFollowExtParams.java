package com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import java.io.Serializable;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams$a;
import java.lang.Object;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams$LiveRedPacketParmas;
import java.lang.String;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams$LiveUserFollowExtraParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams$ProfileCardOperationParams;

public class LiveFollowExtParams implements Serializable	// class@000baf
{
    public String mEntrySrc;
    public String mLiveActivityName;
    public String mLiveBizParamsStr;
    public LiveFollowExtParams$LiveRedPacketParmas mLiveRedPacketParams;
    public LiveFollowExtParams$LiveUserFollowExtraParams mLiveUserFollowExtraParams;
    public String mPosition;
    public LiveFollowExtParams$ProfileCardOperationParams mProfileCardOperationParams;
    public static final long serialVersionUID = 0xd105e4376902f74a;

    public void LiveFollowExtParams(LiveFollowExtParams$a p0){
       super();
       this.mLiveRedPacketParams = new LiveFollowExtParams$LiveRedPacketParmas(this, p0.a, p0.b, p0.d);
       this.mLiveUserFollowExtraParams = new LiveFollowExtParams$LiveUserFollowExtraParams(p0.f);
       this.mLiveActivityName = p0.g;
       this.mEntrySrc = p0.h;
       this.mPosition = p0.i;
       this.mLiveBizParamsStr = p0.j;
    }
    public void updateFollowClickPositionOnProfileCard(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFollowExtParams.class, "1")) {
          return;
       }
       if (this.mProfileCardOperationParams == null) {
          this.mProfileCardOperationParams = new LiveFollowExtParams$ProfileCardOperationParams();
       }
       this.mProfileCardOperationParams.mFollowClickPosition = p0;
       return;
    }
}
