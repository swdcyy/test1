package com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class RealAction$ExtParams implements Serializable	// class@000e88
{
    public long mActualPlayDuration;
    public String mBizExtraParam;
    public long mCommentStayDuration;
    public boolean mHasReported;
    public String mHyperTagRecoLogInfo;
    public boolean mIsBigCard;
    public boolean mIsPrefetch;
    public String mNegativeDetailType;
    public int mNegativeType;
    public String mRequestParams;
    public ShareInitResponse$SharePanelElement mSharePanelElement;
    public long mTimestamp;
    public long mTotalSendGiftPrice;
    public static final long serialVersionUID = 0x2a5e976a658bb097;

    public void RealAction$ExtParams(){
       super();
       this.mIsBigCard = false;
    }
    public static RealAction$ExtParams newInstance(){
       Object obj = PatchProxy.apply(null, null, RealAction$ExtParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RealAction$ExtParams();
    }
}
