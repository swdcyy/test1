package com.kuaishou.merchant.feed.model.CommodityFeed;
import com.kuaishou.merchant.feed.model.BaseFeed;
import com.kuaishou.merchant.api.core.model.Commodity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.CommodityFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;

public class CommodityFeed extends BaseFeed	// class@0016b7
{
    public List mActivityImageUrls;
    public int mActivityLabel;
    public String mActivityText;
    public List mAvatarUrls;
    public String mCompensationText;
    public Commodity mIconListCommodity;
    public long mId;
    public List mImageUrls;
    public String mJumpUrl;
    public List mMarketingTagList;
    public String mNick;
    public String mOriginalPrice;
    public String mPrice;
    public QPhoto mQPhoto;
    public String mSalesDesc;
    public String mSource;
    public int mSourceType;
    public List mSquareTagList;
    public String mTitle;
    public String mUserShopRelationUrl;
    public String mWorkId;
    public static final long serialVersionUID = 0x26780e79e2b65dca;

    public void CommodityFeed(){
       super();
       this.mIconListCommodity = new Commodity();
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, CommodityFeed.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.mId);
    }
    public QPhoto getQPhoto(){
       CommodityFeed obj = PatchProxy.apply(null, this, CommodityFeed.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mQPhoto == null) {
          this.mQPhoto = new QPhoto();
          obj = new CommodityFeed();
          CommonMeta uCommonMeta = new CommonMeta();
          obj.mCommonMeta = uCommonMeta;
          uCommonMeta.mId = String.valueOf(this.mId);
          CommodityFeed mCommonMeta = obj.mCommonMeta;
          BaseFeed tmExpTag = this.mExpTag;
          if (tmExpTag == null) {
             tmExpTag = "";
          }
          mCommonMeta.mExpTag = tmExpTag;
          mCommonMeta.mServerExpTag = this.mServerExpTag;
          this.mQPhoto.mEntity = obj;
       }
       return this.mQPhoto;
    }
    public boolean hasMarketingTagList(){
       Object obj = PatchProxy.apply(null, this, CommodityFeed.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (q.f(this.mMarketingTagList) ^ 0x01);
    }
    public boolean hasTagList(){
       Object obj = PatchProxy.apply(null, this, CommodityFeed.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (q.f(this.mSquareTagList) ^ 0x01);
    }
    public boolean isSelfBuilt(){
       boolean b = (this.mSourceType == 99)? true: false;
       return b;
    }
}
