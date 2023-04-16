package com.kuaishou.merchant.api.live.reservation.MerchantLiveReservationModel;
import java.io.Serializable;
import mkd.a;
import java.lang.String;
import java.lang.Object;
import lnc.o5;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.merchant.api.live.reservation.ReserveResultInfo$BatchReserveInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class MerchantLiveReservationModel implements Serializable, a	// class@001569
{
    public int mActivityType;
    public String mAnchorId;
    public String mBizSource;
    public int mChannel;
    public int mFollowType;
    public String mReservationId;
    public List mReservationInfoList;
    public int mReserveType;
    public static final long serialVersionUID = 0x29b1366768e93e34;

    public void MerchantLiveReservationModel(String p0,int p1,int p2,int p3,String p4){
       super();
       this.mFollowType = 0;
       this.mReservationId = p0;
       this.mChannel = p3;
       this.mReserveType = p1;
       this.mActivityType = p2;
       this.mAnchorId = p4;
    }
    public void MerchantLiveReservationModel(String p0,String p1,String p2,int p3,String p4){
       super();
       this.mFollowType = 0;
       this.mReservationId = p0;
       this.mChannel = p3;
       this.mReserveType = o5.b(p1, -1);
       this.mActivityType = o5.b(p2, -1);
       this.mAnchorId = p4;
    }
    public void MerchantLiveReservationModel(String p0,String p1,String p2,int p3,String p4,String p5){
       super();
       this.mFollowType = 0;
       this.mReservationId = p0;
       this.mChannel = p3;
       this.mReserveType = o5.b(p1, -1);
       this.mActivityType = o5.b(p2, -1);
       this.mAnchorId = p4;
       this.mBizSource = p5;
    }
    public void MerchantLiveReservationModel(List p0,int p1,String p2,String p3){
       super();
       this.mFollowType = 0;
       this.mReservationInfoList = p0;
       this.mChannel = p1;
       this.mAnchorId = p2;
       this.mBizSource = p3;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, MerchantLiveReservationModel.class, "3")) {
          return;
       }
       if (!q.f(this.mReservationInfoList)) {
          Iterator iterator = this.mReservationInfoList.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().mActiveBizType == 2) {
                this.mFollowType = 1;
                break ;
             }
          }
       }else if(this.mActivityType == 2){
          this.mFollowType = 1;
       }
       return;
    }
    public boolean isFollowAndReserve(){
       Iterator obj = PatchProxy.apply(null, this, MerchantLiveReservationModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!q.f(this.mReservationInfoList)) {
          obj = this.mReservationInfoList.iterator();
          while (true) {
             if (obj.hasNext()) {
                if (obj.next().mActiveBizType == 3) {
                   return b;
                }
                continue ;
             }
          }
       }
       if (this.mActivityType != 3) {
          b = false;
       }
       return b;
    }
    public boolean isInvalid(){
       Iterator obj = PatchProxy.apply(null, this, MerchantLiveReservationModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (q.f(this.mReservationInfoList)) {
          if (!TextUtils.x(this.mReservationId) && (this.mReserveType == -1 || this.mActivityType == -1)) {
             b = true;
          }
          return b;
       }else {
          obj = this.mReservationInfoList.iterator();
          while (true) {
             if (!obj.hasNext()) {
                return b;
             }
             ReserveResultInfo$BatchReserveInfo uBatchReserv = obj.next();
             if (!TextUtils.x(uBatchReserv.mReservationId) && (uBatchReserv.mReserveType == -1 || uBatchReserv.mActiveBizType == -1)) {
                break ;
             }
          }
          return true;
       }
    }
}
