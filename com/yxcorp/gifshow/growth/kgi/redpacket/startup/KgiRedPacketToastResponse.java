package com.yxcorp.gifshow.growth.kgi.redpacket.startup.KgiRedPacketToastResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.kgi.redpacket.startup.KgiRedPacketToastResponse$a;
import nsd.u;
import java.lang.Object;
import yb6.d;

public final class KgiRedPacketToastResponse implements Serializable	// class@0013fa
{
    public int activityId;
    public String amount;
    public ArrayList avoidPage2List;
    public ArrayList avoidPageList;
    public long delaySecond;
    public boolean hasDealDelay;
    public JsonObject report;
    public long responseTime;
    public String text;
    public static final KgiRedPacketToastResponse$a Companion;
    public static final long serialVersionUID;

    static {
       KgiRedPacketToastResponse.Companion = new KgiRedPacketToastResponse$a(null);
    }
    public void KgiRedPacketToastResponse(){
       super();
       this.activityId = -1;
       this.delaySecond = -1;
       this.responseTime = d.a();
    }
}
