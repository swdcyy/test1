package com.kuaishou.android.model.mix.FansTopDisplayStyle;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.mix.FansTopDisplayStyle$FansTopExtData;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;

public class FansTopDisplayStyle implements Serializable	// class@000c6f
{
    public FansTopDisplayStyle$FansTopExtData mExtData;
    public List mFansTopRecommendUsers;
    public boolean mShowDeliveryIcon;
    public static final long serialVersionUID = 0xd5d42dc57f2972f4;

    public void FansTopDisplayStyle(){
       super();
    }
    public long getFansTopCommentCount(){
       FansTopDisplayStyle obj = PatchProxy.apply(null, this, FansTopDisplayStyle.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.mExtData;
       if (obj != null && !TextUtils.x(obj.mFansTopCommentCount)) {
          return Long.parseLong(this.mExtData.mFansTopCommentCount);
       }
       return -1;
    }
    public int getFansTopStatus(){
       FansTopDisplayStyle tmExtData = this.mExtData;
       FansTopDisplayStyle$FansTopExtData mFansTopStat = (tmExtData != null)? tmExtData.mFansTopStatus: -1;
       return mFansTopStat;
    }
    public boolean isFansTopBoostRunning(){
       FansTopDisplayStyle tmExtData = this.mExtData;
       boolean b = (tmExtData != null && tmExtData.mFanstopBoostRunning != null)? true: false;
       return b;
    }
    public boolean isFansTopNeedAlertForOperation(){
       FansTopDisplayStyle tmExtData = this.mExtData;
       boolean b = (tmExtData != null && tmExtData.mNeedAlertForOperation != null)? true: false;
       return b;
    }
    public boolean shouldShowFansTopOwnnerStyle(){
       FansTopDisplayStyle tmExtData = this.mExtData;
       boolean b = true;
       if (tmExtData != null) {
          FansTopDisplayStyle$FansTopExtData mFansTopStat = tmExtData.mFansTopStatus;
          if (mFansTopStat != b && (mFansTopStat == 2 || mFansTopStat == 3)) {
          label_0011 :
             return b;
          }
       }
       b = false;
       goto label_0011 ;
    }
    public boolean shouldShowFansTopWatchIcon(){
       boolean b;
       FansTopDisplayStyle tmExtData = this.mExtData;
       if (tmExtData != null) {
          FansTopDisplayStyle$FansTopExtData mFansTopStat = tmExtData.mFansTopStatus;
          if (mFansTopStat == 2 || (mFansTopStat == 3 && tmExtData.mFanstopBoostRunning != null)) {
             b = true;
          label_0013 :
             return b;
          }
       }
       b = false;
       goto label_0013 ;
    }
    public boolean shouldShowThanosStatusAndRightArrow(){
       FansTopDisplayStyle tmExtData = this.mExtData;
       boolean b = true;
       if (tmExtData != null) {
          FansTopDisplayStyle$FansTopExtData mFansTopStat = tmExtData.mFansTopStatus;
          if (mFansTopStat != b && (mFansTopStat == 2 || tmExtData.mFanstopBoostRunning != null)) {
          label_0012 :
             return b;
          }
       }
       b = false;
       goto label_0012 ;
    }
}
