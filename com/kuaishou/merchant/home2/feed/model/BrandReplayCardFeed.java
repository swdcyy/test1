package com.kuaishou.merchant.home2.feed.model.BrandReplayCardFeed;
import com.kuaishou.merchant.home2.feed.model.BaseFeed$a;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.BrandInfo;

public class BrandReplayCardFeed extends BaseFeed implements BaseFeed$a	// class@001797
{
    public String mAvatarUrl;
    public List mAvatarUrls;
    public BrandInfo mBrandInfo;
    public List mCommodityInfoList;
    public int mHeight;
    public String mId;
    public String mJumpUrl;
    public String mNick;
    public String mPhotoUrl;
    public CDNUrl[] mPhotoUrls;
    public int mWidth;
    public static final long serialVersionUID = 0xcdeeb68b2e100fd5;

    public void BrandReplayCardFeed(){
       super();
    }
    public String getBiz(){
       return "CloudReplayActivityFeedLogger";
    }
    public BrandInfo getCardBrandInfo(){
       BrandReplayCardFeed tmBrandInfo = this.mBrandInfo;
       if (tmBrandInfo == null) {
          tmBrandInfo = BrandInfo.EMPTY;
       }
       return tmBrandInfo;
    }
    public String getId(){
       return this.mId;
    }
}
