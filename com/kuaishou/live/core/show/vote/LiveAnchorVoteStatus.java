package com.kuaishou.live.core.show.vote.LiveAnchorVoteStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAnchorVoteStatus extends Enum	// class@00122c
{
    public static final LiveAnchorVoteStatus[] $VALUES;
    public static final LiveAnchorVoteStatus ANCHOR_VOTE_DOING;
    public static final LiveAnchorVoteStatus ANCHOR_VOTE_IDLE;

    static {
       LiveAnchorVoteStatus liveAnchorVo = new LiveAnchorVoteStatus("ANCHOR_VOTE_IDLE", 0);
       LiveAnchorVoteStatus.ANCHOR_VOTE_IDLE = liveAnchorVo;
       LiveAnchorVoteStatus liveAnchorVo1 = new LiveAnchorVoteStatus("ANCHOR_VOTE_DOING", 1);
       LiveAnchorVoteStatus.ANCHOR_VOTE_DOING = liveAnchorVo1;
       LiveAnchorVoteStatus[] liveAnchorVo2 = new LiveAnchorVoteStatus[]{liveAnchorVo,liveAnchorVo1};
       LiveAnchorVoteStatus.$VALUES = liveAnchorVo2;
    }
    public void LiveAnchorVoteStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAnchorVoteStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAnchorVoteStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAnchorVoteStatus.class, p0);
    }
    public static LiveAnchorVoteStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAnchorVoteStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAnchorVoteStatus.$VALUES.clone();
    }
}
