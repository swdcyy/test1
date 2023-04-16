package com.kwai.feature.api.live.floatingscreen.magicface.LiveFloatingScreenMagicFaceEnterRoomBaseData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;

public class LiveFloatingScreenMagicFaceEnterRoomBaseData extends LiveFloatingScreenBaseData	// class@000fcb
{
    public final LiveCommonEffectInfo mCommonEffectInfo;
    public static final long serialVersionUID = 0x34d060870877dd02;

    public void LiveFloatingScreenMagicFaceEnterRoomBaseData(LiveCommonEffectInfo p0){
       super();
       this.mCommonEffectInfo = p0;
    }
    public LiveCommonEffectInfo getCommonEffectInfo(){
       return this.mCommonEffectInfo;
    }
}
