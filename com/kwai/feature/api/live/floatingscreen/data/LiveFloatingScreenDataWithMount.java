package com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenDataWithMount;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenMountData;

public class LiveFloatingScreenDataWithMount extends LiveFloatingScreenBaseData	// class@000fbb
{
    public LiveFloatingScreenMountData mountData;

    public void LiveFloatingScreenDataWithMount(){
       super();
    }
    public final LiveFloatingScreenMountData getMountData(){
       return this.mountData;
    }
    public final void setMountData(LiveFloatingScreenMountData p0){
       this.mountData = p0;
    }
}
