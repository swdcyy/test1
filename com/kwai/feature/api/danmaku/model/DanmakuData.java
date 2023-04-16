package com.kwai.feature.api.danmaku.model.DanmakuData;
import java.io.Serializable;
import java.lang.CharSequence;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.StringBuilder;

public class DanmakuData implements Serializable	// class@000e75
{
    public boolean drawingProcess;
    public boolean forceInset;
    public Drawable mAvatarDrawable;
    public String mBarrage;
    public ArrayList mBodySections;
    public int mColor;
    public int mDanmakuTailType;
    public int mDanmakuType;
    public String mDisplayLikeCount;
    public int mDriftType;
    public boolean mErrorReported;
    public ExtraDanmakuDisplayInfo mExtraDisplayInfo;
    public int mGrade;
    public CDNUrl[] mHeadUrls;
    public String mId;
    public boolean mIsHighCopyDanmaku;
    public boolean mIsHighCopyType;
    public int mIsMockType;
    public boolean mIsNormalOrSelfType;
    public boolean mIsOverLimitShow;
    public boolean mIsSelecting;
    public boolean mIsliked;
    public long mLikeCount;
    public View$OnLongClickListener mOnLongClickListener;
    public String mPlatformDanmakuId;
    public long mPosition;
    public long mPostPosition;
    public int mQuality;
    public boolean mSelfSend;
    public String mSource;
    public final ConcurrentHashMap mTags;
    public String mType;
    public int mUnchangedColor;
    public int mUserAge;
    public String mUserId;
    public String mUserName;
    public String mUserSex;
    public boolean showLikeViewAndCount;
    public String videoUserId;

    public void DanmakuData(CharSequence p0,long p1){
       super();
       this.mGrade = 0;
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.mHeadUrls = uCDNUrlArray;
       this.mDanmakuTailType = 0;
       this.mQuality = 0;
       this.mSource = "UNKNOWN";
       this.mColor = -1;
       this.mType = "NORMAL";
       this.mDanmakuType = 0;
       this.mIsOverLimitShow = false;
       this.mDriftType = 0;
       this.mTags = new ConcurrentHashMap();
       this.showLikeViewAndCount = false;
       this.drawingProcess = false;
       this.mErrorReported = false;
       this.mBarrage = p0.toString();
       this.mPosition = p1;
    }
    public void DanmakuData(String p0,String p1){
       super();
       this.mGrade = 0;
       CDNUrl[] uCDNUrlArray = new CDNUrl[0];
       this.mHeadUrls = uCDNUrlArray;
       this.mDanmakuTailType = 0;
       this.mQuality = 0;
       this.mSource = "UNKNOWN";
       this.mColor = -1;
       this.mType = "NORMAL";
       this.mDanmakuType = 0;
       this.mIsOverLimitShow = false;
       this.mDriftType = 0;
       this.mTags = new ConcurrentHashMap();
       this.showLikeViewAndCount = false;
       this.drawingProcess = false;
       this.mErrorReported = false;
       this.mBarrage = p0;
       this.mType = p1;
    }
    public boolean enableDelete(){
       Object obj = PatchProxy.apply(null, this, DanmakuData.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mSelfSend != null || (QCurrentUser.me().getId()).equals(this.videoUserId))? true: false;
       return b;
    }
    public boolean enableReport(){
       return (this.mSelfSend ^ 0x01);
    }
    public Object getTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DanmakuData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mTags.get(p0);
    }
    public boolean isActivityDanmaku(){
       boolean b = true;
       if (this.mDanmakuType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean isAnimationDanmaku(){
       boolean b = (this.mDanmakuType == 2 && this.mExtraDisplayInfo != null)? true: false;
       return b;
    }
    public boolean isCommingGuided(){
       Object obj = PatchProxy.apply(null, this, DanmakuData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("COMMING_GUIDED").equals(this.mSource);
    }
    public boolean isHighPriority(){
       Object obj = PatchProxy.apply(null, this, DanmakuData.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.isIncredible() && (this.mSelfSend == null && (this.isPlatform() || this.forceInset != null)))? true: false;
       return b;
    }
    public boolean isIncredible(){
       boolean b = (this.mQuality == 5)? true: false;
       return b;
    }
    public boolean isPlatform(){
       Object obj = PatchProxy.apply(null, this, DanmakuData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (("PLATFORM").equals(this.mSource) && this.mPlatformDanmakuId != null)? true: false;
       return b;
    }
    public boolean isProtected(){
       boolean b = true;
       if (this.mGrade == b) {
       }else {
          b = false;
       }
       return b;
    }
    public void removeTag(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuData.class, "3")) {
          return;
       }
       this.mTags.remove(p0);
       return;
    }
    public void setTag(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DanmakuData.class, "1")) {
          return;
       }
       if (p1 == null) {
          this.removeTag(p0);
          return;
       }else {
          this.mTags.put(p0, p1);
          return;
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DanmakuData.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Barrage{mBarrage="+this.mBarrage+", mPosition="+this.mPosition+'}';
    }
}
