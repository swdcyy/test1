package com.yxcorp.gifshow.entity.TrendingInfo;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.entity.TrendingInfo$SubTrendingInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class TrendingInfo implements Serializable, a	// class@000d84
{
    public String mChallengeBoardPostScheme;
    public CDNUrl[] mCoverUrls;
    public String mDesc;
    public boolean mEnableRelatedHotspot;
    public int mFeedCount;
    public String mHeating;
    public int mIconHeight;
    public CDNUrl[] mIconUrl;
    public int mIconWidth;
    public String mId;
    public String mLinkUrl;
    public String mPopularType;
    public List mSubTrendingInfos;
    public int mTop;
    public String mTrendingLocationString;
    public String mTrendingType;
    public String mTypeName;
    public long mViewCount;
    public String mWordId;
    public static final long serialVersionUID = 0x65781859389368ad;

    public void TrendingInfo(){
       super();
       this.mPopularType = "COMMON";
       this.mChallengeBoardPostScheme = null;
       this.mEnableRelatedHotspot = false;
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, TrendingInfo.class, "5")) {
          return;
       }
       if (this.mSubTrendingInfos != null) {
          for (int i = 0; i < this.mSubTrendingInfos.size(); i = i + 1) {
             TrendingInfo$SubTrendingInfo subTrendingI = this.mSubTrendingInfos.get(i);
             subTrendingI.mTrendingType = this.mTrendingType;
             TrendingInfo$SubTrendingInfo mSubTrending = subTrendingI.mSubTrendingId;
             subTrendingI.mId = mSubTrending;
             subTrendingI.mWordId = mSubTrending;
          }
       }
       return;
    }
    public String getWrapperId(){
       Object obj = PatchProxy.apply(null, this, TrendingInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this instanceof TrendingInfo$SubTrendingInfo) {
          return this.mId+this.mRootTrendingId;
       }
       return this.mId;
    }
    public boolean isEmptyTrending(){
       Object obj = PatchProxy.apply(null, this, TrendingInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("EMPTY_TYPE").equals(this.mPopularType);
    }
    public boolean isRisingTrending(){
       Object obj = PatchProxy.apply(null, this, TrendingInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("REAL_TIME").equals(this.mPopularType);
    }
    public boolean isSubTrending(){
       return this instanceof TrendingInfo$SubTrendingInfo;
    }
    public boolean isTopTrending(){
       boolean b = (this.mTop == null)? true: false;
       return b;
    }
    public boolean isTopicTrending(){
       Object obj = PatchProxy.apply(null, this, TrendingInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.isTopTrending() && !TextUtils.x(this.mLinkUrl))? true: false;
       return b;
    }
}
