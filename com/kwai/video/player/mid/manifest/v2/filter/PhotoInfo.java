package com.kwai.video.player.mid.manifest.v2.filter.PhotoInfo;
import java.io.Serializable;
import java.lang.Object;

public final class PhotoInfo implements Serializable	// class@000b78
{
    public int adType;
    public int plcType;
    public boolean shouldUseVip;

    public void PhotoInfo(){
       super();
    }
    public void PhotoInfo(int p0,int p1){
       super();
       this.adType = p0;
       this.plcType = p1;
    }
    public final int getAdType(){
       return this.adType;
    }
    public final int getPlcType(){
       return this.plcType;
    }
    public final boolean getShouldUseVip(){
       return this.shouldUseVip;
    }
    public final void setAdType(int p0){
       this.adType = p0;
    }
    public final void setPlcType(int p0){
       this.plcType = p0;
    }
    public final void setShouldUseVip(boolean p0){
       this.shouldUseVip = p0;
    }
}
