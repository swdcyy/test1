package com.yxcorp.gifshow.ad.challenge.model.RankListItemInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.challenge.model.RankListItemInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class RankListItemInfo implements Serializable	// class@001532
{
    public final String mCaption;
    public final String mCoinPic;
    public final String mPhotoCoverUrl;
    public final String mPhotoId;
    public final String mProfit;
    public final String mServerExpTag;
    public boolean mShowed;
    public final String mUserId;
    public final String mUserName;
    public static final RankListItemInfo$a Companion;
    public static final long serialVersionUID;

    static {
       RankListItemInfo.Companion = new RankListItemInfo$a(null);
    }
    public void RankListItemInfo(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,boolean p8){
       super();
       this.mPhotoCoverUrl = p0;
       this.mPhotoId = p1;
       this.mUserId = p2;
       this.mUserName = p3;
       this.mServerExpTag = p4;
       this.mCaption = p5;
       this.mCoinPic = p6;
       this.mProfit = p7;
       this.mShowed = p8;
    }
    public static RankListItemInfo copy$default(RankListItemInfo p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,boolean p9,int p10,Object p11){
       RankListItemInfo rankListItem = p0;
       int i = p10;
       RankListItemInfo mPhotoCoverU = (i & 0x01)? rankListItem.mPhotoCoverUrl: p1;
       RankListItemInfo mPhotoId = (i & 0x02)? rankListItem.mPhotoId: p2;
       RankListItemInfo mUserId = (i & 0x04)? rankListItem.mUserId: p3;
       RankListItemInfo mUserName = (i & 0x08)? rankListItem.mUserName: p4;
       RankListItemInfo mServerExpTa = (i & 0x10)? rankListItem.mServerExpTag: p5;
       RankListItemInfo mCaption = (i & 0x20)? rankListItem.mCaption: p6;
       RankListItemInfo mCoinPic = (i & 0x40)? rankListItem.mCoinPic: p7;
       RankListItemInfo mProfit = (i & 0x0080)? rankListItem.mProfit: p8;
       RankListItemInfo mShowed = (i & 0x0100)? rankListItem.mShowed: p9;
       return p0.copy(mPhotoCoverU, mPhotoId, mUserId, mUserName, mServerExpTa, mCaption, mCoinPic, mProfit, mShowed);
    }
    public final String component1(){
       return this.mPhotoCoverUrl;
    }
    public final String component2(){
       return this.mPhotoId;
    }
    public final String component3(){
       return this.mUserId;
    }
    public final String component4(){
       return this.mUserName;
    }
    public final String component5(){
       return this.mServerExpTag;
    }
    public final String component6(){
       return this.mCaption;
    }
    public final String component7(){
       return this.mCoinPic;
    }
    public final String component8(){
       return this.mProfit;
    }
    public final boolean component9(){
       return this.mShowed;
    }
    public final RankListItemInfo copy(String p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,boolean p8){
       Object obj;
       if (PatchProxy.isSupport(RankListItemInfo.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = Boolean.valueOf(p8);
          obj = PatchProxy.apply(objArray, this, RankListItemInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       RankListItemInfo rankListItem = new RankListItemInfo(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RankListItemInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RankListItemInfo && (a.g(this.mPhotoCoverUrl, p0.mPhotoCoverUrl) && (a.g(this.mPhotoId, p0.mPhotoId) && (a.g(this.mUserId, p0.mUserId) && (a.g(this.mUserName, p0.mUserName) && (a.g(this.mServerExpTag, p0.mServerExpTag) && (a.g(this.mCaption, p0.mCaption) && (a.g(this.mCoinPic, p0.mCoinPic) && (a.g(this.mProfit, p0.mProfit) && this.mShowed == p0.mShowed)))))))))) {
          return true;
       }
       return false;
    }
    public final boolean getMShowed(){
       return this.mShowed;
    }
    public int hashCode(){
       RankListItemInfo obj = PatchProxy.apply(null, this, RankListItemInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mPhotoCoverUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       RankListItemInfo tmPhotoId = this.mPhotoId;
       int i2 = (tmPhotoId != null)? tmPhotoId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmPhotoId = this.mUserId;
       i2 = (tmPhotoId != null)? tmPhotoId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmPhotoId = this.mUserName;
       i2 = (tmPhotoId != null)? tmPhotoId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmPhotoId = this.mServerExpTag;
       i2 = (tmPhotoId != null)? tmPhotoId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmPhotoId = this.mCaption;
       i2 = (tmPhotoId != null)? tmPhotoId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmPhotoId = this.mCoinPic;
       i2 = (tmPhotoId != null)? tmPhotoId.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmPhotoId = this.mProfit;
       if (tmPhotoId != null) {
          i = tmPhotoId.hashCode();
       }
       i1 = (i1 + i) * 31;
       RankListItemInfo tmShowed = this.mShowed;
       if (tmShowed != null) {
          tmShowed = 1;
       }
       return (i1 + tmShowed);
    }
    public final void setMShowed(boolean p0){
       this.mShowed = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RankListItemInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RankListItemInfo\(mPhotoCoverUrl="+this.mPhotoCoverUrl+", mPhotoId="+this.mPhotoId+", mUserId="+this.mUserId+", mUserName="+this.mUserName+", mServerExpTag="+this.mServerExpTag+", mCaption="+this.mCaption+", mCoinPic="+this.mCoinPic+", mProfit="+this.mProfit+", mShowed="+this.mShowed+"\)";
    }
}
