package com.kuaishou.android.model.mix.LabelLiveInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class LabelLiveInfo implements Serializable	// class@000cf9
{
    public String mLiveReservationId;
    public int mLiveReservationStatus;
    public int mLiveStatus;
    public String mLiveStreamId;

    public void LabelLiveInfo(){
       super();
       this.mLiveStatus = -1;
       this.mLiveReservationStatus = -1;
    }
    public final String getMLiveReservationId(){
       return this.mLiveReservationId;
    }
    public final int getMLiveReservationStatus(){
       return this.mLiveReservationStatus;
    }
    public final int getMLiveStatus(){
       return this.mLiveStatus;
    }
    public final String getMLiveStreamId(){
       return this.mLiveStreamId;
    }
    public final void setMLiveReservationId(String p0){
       this.mLiveReservationId = p0;
    }
    public final void setMLiveReservationStatus(int p0){
       this.mLiveReservationStatus = p0;
    }
    public final void setMLiveStatus(int p0){
       this.mLiveStatus = p0;
    }
    public final void setMLiveStreamId(String p0){
       this.mLiveStreamId = p0;
    }
}
