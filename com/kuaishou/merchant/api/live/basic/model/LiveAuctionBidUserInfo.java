package com.kuaishou.merchant.api.live.basic.model.LiveAuctionBidUserInfo;
import java.io.Serializable;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.StringBuilder;
import java.util.Arrays;

public class LiveAuctionBidUserInfo implements Serializable	// class@001560
{
    public String mAvatar;
    public CDNUrl[] mAvatarUrls;
    public String mNickName;
    public long mPrice;
    public static final long serialVersionUID = 0xb26840e3867cc719;

    public void LiveAuctionBidUserInfo(){
       super();
    }
    public LiveAuctionBidUserInfo setAvatar(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAuctionBidUserInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.exists()) {
          this.mAvatar = p0.getAbsolutePath();
       }
       return this;
    }
    public LiveAuctionBidUserInfo setAvatarUrls(CDNUrl[] p0){
       this.mAvatarUrls = p0;
       return this;
    }
    public LiveAuctionBidUserInfo setNickName(String p0){
       this.mNickName = p0;
       return this;
    }
    public LiveAuctionBidUserInfo setPrice(long p0){
       this.mPrice = p0;
       return this;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAuctionBidUserInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAuctionBidUserInfo{mPrice="+this.mPrice+", mNickName=\'"+this.mNickName+'''+", mAvatar=\'"+this.mAvatar+'''+", mAvatarUrls="+Arrays.toString(this.mAvatarUrls)+'}';
    }
}
