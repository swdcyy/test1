package com.kwai.feature.api.feed.detail.router.biz.thanos.ThanosDetailBizParam;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.thanos.MerchantSlidePlayModel;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Parcelable;
import org.parceler.b;
import android.content.Intent;
import java.lang.Boolean;
import com.yxcorp.gifshow.nearby.NearbyGuideParam;

public final class ThanosDetailBizParam	// class@000ebc
{
    public boolean isCleanScreenWhenEnter;
    public int mAtlasPhotoIndex;
    public int mAtlasPhotoOffset;
    public String mChameleonActivityId;
    public String mCouponAccountId;
    public boolean mDisableSwipeProfileFeed;
    public boolean mEnableAtlasAutoPlay;
    public boolean mEnableExitShrink;
    public String mFansGuidePhotoId;
    public boolean mHideProfileFeedTitleAndCount;
    public MerchantSlidePlayModel mMerchantSlidePlayModel;
    public boolean mModifyOriginDataAlso;
    public NearbyGuideParam mNearbyGuideParam;
    public boolean mNeedReplaceFeedInThanos;
    public int mPopSharePanelStyle;
    public boolean mShouldShowFloatWidget;
    public boolean mShowDistance;
    public boolean mShowThanosProfileSideLive;

    public void ThanosDetailBizParam(){
       super();
       this.mShowThanosProfileSideLive = true;
       this.mNeedReplaceFeedInThanos = true;
       this.mHideProfileFeedTitleAndCount = false;
       this.mModifyOriginDataAlso = true;
       this.mMerchantSlidePlayModel = new MerchantSlidePlayModel();
       this.mShouldShowFloatWidget = true;
       this.isCleanScreenWhenEnter = false;
    }
    public static ThanosDetailBizParam getBizParamFromBundle(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ThanosDetailBizParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.getParcelable("thanosDetailBizParam"));
    }
    public static ThanosDetailBizParam getBizParamFromIntent(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ThanosDetailBizParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.getParcelableExtra("thanosDetailBizParam"));
    }
    public boolean isLocalForceShowGuide(){
       ThanosDetailBizParam obj = PatchProxy.apply(null, this, ThanosDetailBizParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mNearbyGuideParam;
       boolean b = (obj != null && obj.isLocalForceShowGuide())? true: false;
       return b;
    }
    public void putParamIntoBundle(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosDetailBizParam.class, "4")) {
          return;
       }
       p0.putParcelable("thanosDetailBizParam", b.c(this));
       return;
    }
    public void putParamIntoIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosDetailBizParam.class, "2")) {
          return;
       }
       p0.putExtra("thanosDetailBizParam", b.c(this));
       return;
    }
}
