package com.kuaishou.live.core.show.enterroom.floatingscreen.biz.activitty.LiveActivityEnterRoomData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import java.lang.String;

public final class LiveActivityEnterRoomData extends LiveFloatingScreenCommonData	// class@000b04
{
    public String activityType;
    public int displayType;

    public void LiveActivityEnterRoomData(){
       super();
       this.activityType = "";
    }
    public final String getActivityType(){
       return this.activityType;
    }
    public final int getDisplayType(){
       return this.displayType;
    }
    public final void setActivityType(String p0){
       this.activityType = p0;
    }
    public final void setDisplayType(int p0){
       this.displayType = p0;
    }
}
