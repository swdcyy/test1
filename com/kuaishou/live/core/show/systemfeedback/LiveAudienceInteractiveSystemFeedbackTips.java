package com.kuaishou.live.core.show.systemfeedback.LiveAudienceInteractiveSystemFeedbackTips;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.systemfeedback.ColdStartTips;
import com.kuaishou.live.core.show.systemfeedback.EnterRoomWatchTips;
import com.kuaishou.live.core.show.systemfeedback.NoCommentTips;
import com.kuaishou.live.core.show.systemfeedback.WatchTaskTips;

public final class LiveAudienceInteractiveSystemFeedbackTips implements Serializable	// class@00116e
{
    public final ColdStartTips coldStartTips;
    public final EnterRoomWatchTips enterRoomWatchTips;
    public final NoCommentTips noCommentTips;
    public final WatchTaskTips watchTaskTips;

    public void LiveAudienceInteractiveSystemFeedbackTips(){
       super();
    }
    public final ColdStartTips getColdStartTips(){
       return this.coldStartTips;
    }
    public final EnterRoomWatchTips getEnterRoomWatchTips(){
       return this.enterRoomWatchTips;
    }
    public final NoCommentTips getNoCommentTips(){
       return this.noCommentTips;
    }
    public final WatchTaskTips getWatchTaskTips(){
       return this.watchTaskTips;
    }
}
