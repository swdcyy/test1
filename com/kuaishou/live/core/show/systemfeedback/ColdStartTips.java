package com.kuaishou.live.core.show.systemfeedback.ColdStartTips;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class ColdStartTips implements Serializable	// class@00116b
{
    public final String enterRoomTip;
    public final int noCommentThreshold;
    public final String noCommentTip;

    public void ColdStartTips(){
       super();
    }
    public final String getEnterRoomTip(){
       return this.enterRoomTip;
    }
    public final int getNoCommentThreshold(){
       return this.noCommentThreshold;
    }
    public final String getNoCommentTip(){
       return this.noCommentTip;
    }
}
