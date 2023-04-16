package com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.PublishGuideInfo;
import java.lang.Cloneable;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.util.DateUtils;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.HomeExtraBubbleInfo;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.NewPublishGuideInfoGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import a0c.c;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.NewPublishGuideInfo;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.postentrance.bubblev2.model.bubbleinfo.HomeOperateIconInfo;

public class PublishGuideInfo implements Cloneable, Serializable	// class@001011
{
    public NewPublishGuideInfo b;
    public boolean isFromServer;
    public long mBubbleShowDuration;
    public int mBubbleUiType;
    public int mCameraButtonLocation;
    public int mClientEffectVersion;
    public CommonShootDialog mCommonShootDialog;
    public boolean mDisableAfterPost;
    public String mDraftIdentifier;
    public BubbleEnterPostParam mDraftParams;
    public long mExpireTime;
    public HomeExtraBubbleInfo mExtParams;
    public Drawable mIconDrawable;
    public int mIconHeight;
    public int mIconWidth;
    public String mId;
    public boolean mIsDisableLinkWithShootButton;
    public a mKwaiTKContainer;
    public String mLongPressScheme;
    public boolean mNeedRemoteValidation;
    public Drawable mOperateIconDrawable;
    public String mOriginBubbleInfo;
    public NewPublishGuideInfoGroup mPublishGuideInfoGroup;
    public String mScheme;
    public String mSubTitle;
    public Object mTKViewContainer;
    public String mTitle;
    public Drawable mTitleDrawable;
    public String mTitleImage;
    public Map mTkBubbleConfig;
    public int mType;
    public i preCreatedViewbinder;
    public static final String c;
    public static final long serialVersionUID;

    static {
       PublishGuideInfo.c = "PublishGuideInfo";
    }
    public void PublishGuideInfo(){
       super();
       this.mTitleDrawable = null;
       this.mNeedRemoteValidation = false;
       this.mExpireTime = DateUtils.l();
       this.mExtParams = new HomeExtraBubbleInfo();
       this.mPublishGuideInfoGroup = new NewPublishGuideInfoGroup();
       this.mDisableAfterPost = true;
       this.isFromServer = false;
       this.mOriginBubbleInfo = null;
       this.mIconDrawable = null;
       this.mOperateIconDrawable = null;
       this.mIconWidth = -1;
       this.mIconHeight = -1;
    }
    public PublishGuideInfo clone(){
       Object obj = PatchProxy.apply(null, this, PublishGuideInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public int getBubbleIconHeight(){
       PublishGuideInfo obj = PatchProxy.apply(null, this, PublishGuideInfo.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mIconHeight;
       if (obj != -1) {
          return obj;
       }
       int i = c.b.d(this.mType);
       this.mIconHeight = i;
       return i;
    }
    public int getBubbleIconWidth(){
       PublishGuideInfo obj = PatchProxy.apply(null, this, PublishGuideInfo.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mIconWidth;
       if (obj != -1) {
          return obj;
       }
       int i = c.b.e(this.mType);
       this.mIconWidth = i;
       return i;
    }
    public int getBubbleStyle(){
       int i;
       Object obj = PatchProxy.apply(null, this, PublishGuideInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(c.b);
       switch (this.mType){
           case 14:
           case 16:
           case 17:
           case 18:
           case 19:
           case 20:
             i = 1;
             break;
           default:
          label_001e :
             i = 0;
       }
       return i;
    }
    public String getExpandCameraIcon(int p0){
       if (PatchProxy.isSupport(PublishGuideInfo.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PublishGuideInfo.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = null;
       if (this.getNewBubbleInfo() == null) {
          return str;
       }else if(p0 != 2){
          str = this.b.mCameraIconExpandBottomBarV2;
       }
       return str;
    }
    public String getImage(){
       Object obj = PatchProxy.apply(null, this, PublishGuideInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getImage(this.mCameraButtonLocation);
    }
    public String getImage(int p0){
       if (PatchProxy.isSupport(PublishGuideInfo.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, PublishGuideInfo.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.getNewBubbleInfo() == null) {
          return null;
       }else {
          this.mCameraButtonLocation = p0;
          if (p0 == 1) {
             return this.b.mRightTopImage;
          }else {
             return this.b.mImage;
          }
       }
    }
    public NewPublishGuideInfo getNewBubbleInfo(){
       PublishGuideInfo tb = this.b;
       if (tb != null) {
          return tb;
       }
       tb = this.mPublishGuideInfoGroup;
       if (tb == null) {
          return null;
       }
       NewPublishGuideInfoGroup mBubbleInfo = tb.mBubbleInfo;
       this.b = mBubbleInfo;
       return mBubbleInfo;
    }
    public String getOriginBubbleInfo(){
       Object obj = PatchProxy.apply(null, this, PublishGuideInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mOriginBubbleInfo == null) {
          this.mOriginBubbleInfo = a.a.q(this);
       }
       return this.mOriginBubbleInfo;
    }
    public String getPendantImage(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, PublishGuideInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getNewBubbleInfo() == null) {
          return objArray;
       }
       if (this.mBubbleUiType != 6) {
          return this.b.mImage;
       }
       return this.b.topIconInfo.mIconUrl;
    }
    public boolean isCoinBubble(){
       boolean b = (this.mType == 22)? true: false;
       return b;
    }
    public boolean isDialogBubble(){
       PublishGuideInfo tmType = this.mType;
       boolean b = (tmType == 29 || tmType == 22)? true: false;
       return b;
    }
    public boolean isDraftBubble(){
       boolean b = (this.mType == 16)? true: false;
       return b;
    }
    public boolean isFlowFeedBackBubble(){
       boolean b = (this.mType == 26)? true: false;
       return b;
    }
    public boolean isLocalBubble(){
       boolean b = (this.mType == 3)? true: false;
       return b;
    }
    public boolean isMainCoinBubble(){
       boolean b = (this.mType == 29)? true: false;
       return b;
    }
    public boolean isMusicBubble(){
       boolean b = (this.mType == 20)? true: false;
       return b;
    }
    public boolean isNewUserBubble(){
       boolean b = (this.mType == 3)? true: false;
       return b;
    }
    public boolean isPendantBubble(){
       boolean b = (this.mType == 14)? true: false;
       return b;
    }
    public boolean isTopRight(){
       boolean b = true;
       if (this.mCameraButtonLocation == b) {
       }else {
          b = false;
       }
       return b;
    }
    public void setOriginBubbleInfo(String p0){
       this.mOriginBubbleInfo = p0;
    }
}
