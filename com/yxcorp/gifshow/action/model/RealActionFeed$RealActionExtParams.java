package com.yxcorp.gifshow.action.model.RealActionFeed$RealActionExtParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class RealActionFeed$RealActionExtParams implements Serializable	// class@001326
{
    public long mActualPlayDuration;
    public String mBizExtraParam;
    public String mClientExpTag;
    public long mCommentStayDuration;
    public boolean mHasReported;
    public String mHyperTagRecoLogInfo;
    public boolean mIsBigCard;
    public boolean mIsFromCache;
    public boolean mIsPrefetch;
    public String mNegativeDetailType;
    public int mNegativeType;
    public String mRequestParams;
    public String mShareId;
    public long mTimestamp;
    public long mTotalSendGiftPrice;
    public static final long serialVersionUID = 0xbbecf9b4fff9bda8;

    public void RealActionFeed$RealActionExtParams(){
       super();
       this.mIsBigCard = false;
    }
    public static RealActionFeed$RealActionExtParams newInstance(){
       Object obj = PatchProxy.apply(null, null, RealActionFeed$RealActionExtParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RealActionFeed$RealActionExtParams();
    }
}
