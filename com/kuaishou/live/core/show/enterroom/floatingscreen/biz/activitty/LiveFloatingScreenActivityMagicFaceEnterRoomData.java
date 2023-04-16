package com.kuaishou.live.core.show.enterroom.floatingscreen.biz.activitty.LiveFloatingScreenActivityMagicFaceEnterRoomData;
import com.kwai.feature.api.live.floatingscreen.magicface.LiveFloatingScreenMagicFaceEnterRoomBaseData;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$ActivityEnterRoomHint;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import com.kuaishou.livestream.message.nano.LiveActivityEnterRoomTip;

public class LiveFloatingScreenActivityMagicFaceEnterRoomData extends LiveFloatingScreenMagicFaceEnterRoomBaseData	// class@000b05
{
    public LiveUserStatusResponse$ActivityEnterRoomHint mActivityEnterRoomHint;
    public LiveActivityEnterRoomTip mEnterRoomTip;
    public static final long serialVersionUID = 0x9c738dbc2faa1a3e;

    public void LiveFloatingScreenActivityMagicFaceEnterRoomData(LiveUserStatusResponse$ActivityEnterRoomHint p0,LiveCommonEffectInfo p1){
       super(p1);
       this.mActivityEnterRoomHint = p0;
    }
    public void LiveFloatingScreenActivityMagicFaceEnterRoomData(LiveActivityEnterRoomTip p0,LiveCommonEffectInfo p1){
       super(p1);
       this.mEnterRoomTip = p0;
    }
}
