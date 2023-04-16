package com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyUserOrderInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class LiveGzoneAccompanyUserOrderInfo implements Serializable	// class@000c45
{
    public String mOrderId;
    public int mOrderStatus;
    public String mTripRoundId;
    public long mUpdateTime;
    public int mWaitingNo;
    public static final long serialVersionUID = 0xf582a238c395cb2;

    public void LiveGzoneAccompanyUserOrderInfo(){
       super();
       this.mWaitingNo = -1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAccompanyUserOrderInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mOrderStatus != p0.mOrderStatus) {
          return false;
       }
       if (this.mWaitingNo != p0.mWaitingNo) {
          return false;
       }
       LiveGzoneAccompanyUserOrderInfo tmOrderId = this.mOrderId;
       if (tmOrderId != null) {
          if (!tmOrderId.equals(p0.mOrderId)) {
          label_0046 :
             return false;
          }
       }else if(p0.mOrderId != null){
          goto label_0046 ;
       }
       tmOrderId = this.mTripRoundId;
       if (tmOrderId != null) {
          b = tmOrderId.equals(p0.mTripRoundId);
       }else if(p0.mTripRoundId == null){
          b = false;
       }
       return b;
    }
    public int hashCode(){
       LiveGzoneAccompanyUserOrderInfo obj = PatchProxy.apply(null, this, LiveGzoneAccompanyUserOrderInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mOrderId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((i1 * 31) + this.mOrderStatus) * 31) + this.mWaitingNo) * 31;
       LiveGzoneAccompanyUserOrderInfo tmTripRoundI = this.mTripRoundId;
       if (tmTripRoundI != null) {
          i = tmTripRoundI.hashCode();
       }
       return (i1 + i);
    }
    public boolean isOnBard(){
       LiveGzoneAccompanyUserOrderInfo tmOrderStatu = this.mOrderStatus;
       boolean b = (tmOrderStatu >= 2 && tmOrderStatu <= 7)? true: false;
       return b;
    }
}
