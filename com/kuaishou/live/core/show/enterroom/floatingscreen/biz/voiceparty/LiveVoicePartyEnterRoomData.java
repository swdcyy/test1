package com.kuaishou.live.core.show.enterroom.floatingscreen.biz.voiceparty.LiveVoicePartyEnterRoomData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import ey2.d$a;

public final class LiveVoicePartyEnterRoomData extends LiveFloatingScreenCommonData	// class@000b07
{
    public d$a enterRoomInfo;

    public void LiveVoicePartyEnterRoomData(){
       super();
    }
    public final d$a getEnterRoomInfo(){
       return this.enterRoomInfo;
    }
    public final void setEnterRoomInfo(d$a p0){
       this.enterRoomInfo = p0;
    }
}
