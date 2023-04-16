package com.kuaishou.merchant.home2.feed.stream.reservation.activity.model.ActivityReservationFeed;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.String;
import java.util.List;
import com.kuaishou.merchant.home2.feed.model.ReservationInfo;

public final class ActivityReservationFeed extends BaseFeed	// class@0017d3
{
    public String jumpUrl;
    public String mId;
    public String photoUrl;
    public List photoUrls;
    public ReservationInfo reservationInfo;

    public void ActivityReservationFeed(){
       super();
       this.mId = "";
    }
    public String getBiz(){
       return "ActivityReservationLogger";
    }
    public String getId(){
       return this.mId;
    }
    public final String getJumpUrl(){
       return this.jumpUrl;
    }
    public final String getMId(){
       return this.mId;
    }
    public final String getPhotoUrl(){
       return this.photoUrl;
    }
    public final List getPhotoUrls(){
       return this.photoUrls;
    }
    public final ReservationInfo getReservationInfo(){
       return this.reservationInfo;
    }
    public final void setJumpUrl(String p0){
       this.jumpUrl = p0;
    }
    public final void setMId(String p0){
       this.mId = p0;
    }
    public final void setPhotoUrl(String p0){
       this.photoUrl = p0;
    }
    public final void setPhotoUrls(List p0){
       this.photoUrls = p0;
    }
    public final void setReservationInfo(ReservationInfo p0){
       this.reservationInfo = p0;
    }
}
