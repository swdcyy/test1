package com.kuaishou.merchant.home2.feed.model.CommodityCardFeed;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.CommodityFeed;
import com.kuaishou.android.model.mix.CommonMeta;

public class CommodityCardFeed extends BaseFeed	// class@00179a
{
    public String mAvatarUrl;
    public List mAvatarUrls;
    public List mCommodityInfoList;
    public String mId;
    public String mJumpUrl;
    public String mNick;
    public QPhoto mQPhoto;
    public LiveFeed$TagInfo mTagInfo;
    public static final long serialVersionUID = 0x94ecc91f9f77db4c;

    public void CommodityCardFeed(){
       super();
    }
    public String getBiz(){
       return "CommodityCardFeedLogger";
    }
    public String getId(){
       return this.mId;
    }
    public QPhoto getQPhoto(){
       CommodityFeed obj = PatchProxy.apply(null, this, CommodityCardFeed.class, "1");
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
}
