package com.kuaishou.live.core.show.activityredpacket.condition.model.LiveActivityRedPacketQueryReservationData;
import java.io.Serializable;
import java.lang.Object;

public final class LiveActivityRedPacketQueryReservationData implements Serializable	// class@00094a
{
    public int reservationStat;

    public void LiveActivityRedPacketQueryReservationData(int p0){
       super();
       this.reservationStat = p0;
    }
    public final int getReservationStat(){
       return this.reservationStat;
    }
    public final void setReservationStat(int p0){
       this.reservationStat = p0;
    }
}
