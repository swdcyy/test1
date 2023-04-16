package com.yxcorp.gifshow.record.album.model.LocalAlbumBannerInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import elb.w;
import com.yxcorp.gifshow.record.album.model.LocalAlbumBannerInfo$IncomePosterText;
import com.yxcorp.gifshow.record.album.model.LocalAlbumBannerInfo$EditConfig;
import com.yxcorp.gifshow.record.album.model.LocalAlbumBannerInfo$PublishConfig;
import com.yxcorp.gifshow.record.album.model.LocalAlbumBannerInfo$PublishedConfig;
import java.lang.Integer;
import q46.d;

public class LocalAlbumBannerInfo implements Serializable	// class@00173b
{
    public int mCoinNum;
    public int mCoinTaskType;
    public String mDraftIconUrl;
    public String mDraftIncomeText;
    public String mDraftText;
    public LocalAlbumBannerInfo$IncomePosterText mIncomePosterText;
    public int mIncomePosterType;
    public int mMaxCoinNum;
    public String mPublishDialogSubTitle;
    public String mPublishDialogTitle;

    public void LocalAlbumBannerInfo(){
       super();
       this.mMaxCoinNum = 1000;
       this.mCoinTaskType = 0;
    }
    public final int a(){
       LocalAlbumBannerInfo tmIncomePost = this.mIncomePosterType;
       if (tmIncomePost == 3) {
          return 26;
       }
       if (tmIncomePost == 1) {
          return 29;
       }
       if (tmIncomePost == 2) {
          tmIncomePost = 14;
       }
       return tmIncomePost;
    }
    public boolean isValidBannerInfo(){
       Object obj = PatchProxy.apply(null, this, LocalAlbumBannerInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mIncomePosterType != null && (!TextUtils.x(this.mDraftText) && (!TextUtils.x(this.mDraftIncomeText) && !TextUtils.x(this.mDraftIconUrl))))? true: false;
       return b;
    }
    public w toPostBenefitGuideData(){
       w obj = PatchProxy.apply(null, this, LocalAlbumBannerInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new w();
       if (this.mIncomePosterType != null) {
          obj.k(6);
       }
       obj.o(this.a());
       LocalAlbumBannerInfo tmIncomePost = this.mIncomePosterText;
       if (tmIncomePost != null) {
          obj.k = tmIncomePost.mActivityId;
          LocalAlbumBannerInfo$IncomePosterText mEditConfig = tmIncomePost.mEditConfig;
          if (mEditConfig != null) {
             obj.h = mEditConfig.mExitAskText;
             obj.i = mEditConfig.mExitContinueText;
             obj.j = mEditConfig.mExitText;
             obj.j(mEditConfig.mEditRightButtonMarkText);
          }
          tmIncomePost = this.mIncomePosterText;
          LocalAlbumBannerInfo$IncomePosterText mPublishConf = tmIncomePost.mPublishConfig;
          if (mPublishConf != null) {
             obj.d = mPublishConf.mPublishButtonText;
             obj.e = mPublishConf.mPublishButtonIconUrl;
          }
          mEditConfig = tmIncomePost.mPublishedConfig;
          if (mEditConfig != null) {
             obj.f = mEditConfig.mPublishedToastText;
             obj.g = mEditConfig.mPublishedToastIconUrl;
          }
       }
       if (d.c(Integer.valueOf(this.a())) && d.d(Integer.valueOf(this.mCoinTaskType))) {
          obj.h(this.mCoinNum);
          obj.l(this.mMaxCoinNum);
          obj.i(this.mCoinTaskType);
          obj.n(this.mPublishDialogTitle);
          obj.m(this.mPublishDialogSubTitle);
       }
       return obj;
    }
}
