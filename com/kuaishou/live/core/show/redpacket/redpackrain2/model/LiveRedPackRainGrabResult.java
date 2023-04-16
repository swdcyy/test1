package com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainGrabResult;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveRedPackRainGrabResult implements Serializable	// class@000f03
{
    public String mAckTips;
    public boolean mIsKoi;
    public int mLinkActionType;
    public String mLinkUrl;
    public String mPrizeDesc;
    public List mPrizeList;
    public String mRedPackRainId;
    public String mSubTitle;
    public String mTips;
    public String mTitle;
    public static final long serialVersionUID = 0x447ba338e06c450;

    public void LiveRedPackRainGrabResult(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveRedPackRainGrabResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveRedPackRainGrabResult{mIsKoi="+this.mIsKoi+", mRedPackRainId=\'"+this.mRedPackRainId+'''+", mTitle=\'"+this.mTitle+'''+", mSubTitle=\'"+this.mSubTitle+'''+", mAckTips=\'"+this.mAckTips+'''+", mPrizeDesc=\'"+this.mPrizeDesc+'''+", mPrizeList="+this.mPrizeList+'}';
    }
}
