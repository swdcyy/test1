package com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import im8.g;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.normal.ToProfilePlan;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Parcelable;
import org.parceler.b;
import android.content.Intent;
import xm5.c;
import java.util.Map;
import java.util.HashMap;

public final class NormalDetailBizParam implements g	// class@000eac
{
    public boolean mAnchorToCommentItemTopWithOffset;
    public String mCouponAccountId;
    public boolean mDetailImageAnimaOpt;
    public int mDetailImageContainerHeight;
    public boolean mDisableAutoReply;
    public boolean mDisableFeedBack;
    public boolean mEnableLastFrame;
    public String mFansGuidePhotoId;
    public boolean mFromCaptionOrCommentClick;
    public boolean mFromCoronaChannelFeed;
    public boolean mFromSlidePlayPhotoClick;
    public int mImageContainerHeight;
    public int mImageTotalOffset;
    public boolean mIsLongAtlas;
    public Integer mKeyOfAtlasViewedCounts;
    public NonslideLandscapeParam mNonslideLandscapeParam;
    public int mPopSharePanelStyle;
    public ReplaceFragmentParam mReplaceFragmentParam;
    public boolean mScrollToComment;
    public boolean mShowEditor;
    public int mShrinkTypeIn;
    public int mShrinkTypeOut;
    public int mStartImageIndex;
    public int mStartImageOffset;
    public ToProfilePlan mToProfilePlan;

    public void NormalDetailBizParam(){
       super();
       this.mToProfilePlan = ToProfilePlan.NON_SMOOTH;
       this.mShrinkTypeIn = 1;
       this.mShrinkTypeOut = 1;
    }
    public static NormalDetailBizParam getBizParamFromBundle(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NormalDetailBizParam.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.getParcelable("normalDetailBizParam"));
    }
    public static NormalDetailBizParam getBizParamFromIntent(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, NormalDetailBizParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p0.getParcelableExtra("normalDetailBizParam"));
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NormalDetailBizParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, NormalDetailBizParam.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(NormalDetailBizParam.class, new c());
       }else {
          obj.put(NormalDetailBizParam.class, null);
       }
       return obj;
    }
    public void putParamIntoBundle(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NormalDetailBizParam.class, "3")) {
          return;
       }
       p0.putParcelable("normalDetailBizParam", b.c(this));
       return;
    }
    public void putParamIntoIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NormalDetailBizParam.class, "1")) {
          return;
       }
       p0.putExtra("normalDetailBizParam", b.c(this));
       return;
    }
}
