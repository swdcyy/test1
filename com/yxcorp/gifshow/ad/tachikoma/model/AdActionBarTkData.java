package com.yxcorp.gifshow.ad.tachikoma.model.AdActionBarTkData;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.String;
import java.lang.Long;

public final class AdActionBarTkData implements Serializable	// class@00182d
{
    public long actionBarLoadTime;
    public PhotoAdvertisement ad;
    public String dataString;
    public int detailBrowseType;
    public String headUrl;
    public int isFollowing;
    public boolean mHasLiveReserved;
    public Long realShowDelayTime;
    public String userName;

    public void AdActionBarTkData(){
       super();
    }
    public final long getActionBarLoadTime(){
       return this.actionBarLoadTime;
    }
    public final PhotoAdvertisement getAd(){
       return this.ad;
    }
    public final String getDataString(){
       return this.dataString;
    }
    public final int getDetailBrowseType(){
       return this.detailBrowseType;
    }
    public final String getHeadUrl(){
       return this.headUrl;
    }
    public final boolean getMHasLiveReserved(){
       return this.mHasLiveReserved;
    }
    public final Long getRealShowDelayTime(){
       return this.realShowDelayTime;
    }
    public final String getUserName(){
       return this.userName;
    }
    public final int isFollowing(){
       return this.isFollowing;
    }
    public final void setActionBarLoadTime(long p0){
       this.actionBarLoadTime = p0;
    }
    public final void setAd(PhotoAdvertisement p0){
       this.ad = p0;
    }
    public final void setDataString(String p0){
       this.dataString = p0;
    }
    public final void setDetailBrowseType(int p0){
       this.detailBrowseType = p0;
    }
    public final void setFollowing(int p0){
       this.isFollowing = p0;
    }
    public final void setHeadUrl(String p0){
       this.headUrl = p0;
    }
    public final void setMHasLiveReserved(boolean p0){
       this.mHasLiveReserved = p0;
    }
    public final void setRealShowDelayTime(Long p0){
       this.realShowDelayTime = p0;
    }
    public final void setUserName(String p0){
       this.userName = p0;
    }
}
