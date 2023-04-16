package com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$ShopOrderTaskStatus$CouponInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$ShopOrderTaskStatus$CouponInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;

public final class NeoTaskStatusResponse$ShopOrderTaskStatus$CouponInfo implements Serializable	// class@00150b
{
    public final long expireTimestampMs;
    public final String iconText;
    public final String subTitle;
    public static final NeoTaskStatusResponse$ShopOrderTaskStatus$CouponInfo$a Companion;
    public static final long serialVersionUID;

    static {
       NeoTaskStatusResponse$ShopOrderTaskStatus$CouponInfo.Companion = new NeoTaskStatusResponse$ShopOrderTaskStatus$CouponInfo$a(null);
    }
    public void NeoTaskStatusResponse$ShopOrderTaskStatus$CouponInfo(){
       super(0, null, null, 7, null);
    }
    public void NeoTaskStatusResponse$ShopOrderTaskStatus$CouponInfo(long p0,String p1,String p2){
       super();
       this.expireTimestampMs = p0;
       this.subTitle = p1;
       this.iconText = p2;
    }
    public void NeoTaskStatusResponse$ShopOrderTaskStatus$CouponInfo(long p0,String p1,String p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0;
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public final long getExpireTimestampMs(){
       return this.expireTimestampMs;
    }
    public final String getIconText(){
       return this.iconText;
    }
    public final String getSubTitle(){
       return this.subTitle;
    }
}
