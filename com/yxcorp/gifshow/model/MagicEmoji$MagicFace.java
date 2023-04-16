package com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFaceType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.MagicFaceExtraParams;
import java.lang.Long;
import com.yxcorp.gifshow.model.MagicGuideParams;
import com.kuaishou.android.model.music.Music;
import java.lang.Number;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Enum;
import java.util.HashMap;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.FriendsUseInfo;
import com.yxcorp.gifshow.model.MagicEmoji$SeekBarType;
import java.lang.Float;
import com.yxcorp.gifshow.model.MagicEmoji$a;

public class MagicEmoji$MagicFace extends MagicBaseConfig	// class@001e4b
{
    public a mActivityCount;
    public String mBackTips;
    public ChildMagicFace mChildMagicFace;
    public int mDefaultDuration;
    public List mDisableBeautylist;
    public MagicFaceExtraParams mExtraParams;
    public List mFileMd5CheckList;
    public FriendsUseInfo mFriendsUsingInfo;
    public String mFrontTips;
    public CDNUrl[] mGifIconUrls;
    public int mGifMaxShowCount;
    public long mGifShowEndTime;
    public long mGifShowStartTime;
    public boolean mHasMusic;
    public j mHotMagicUseRecoInfo;
    public boolean mIsSameTips;
    public MagicFaceIconTipMsg mMagicFaceIconTipMsg;
    public MagicEmoji$MagicFaceType mMagicFaceType;
    public int mMagicFaceUseType;
    public MagicGuideParams mMagicGuideParams;
    public String mMagicUserInfo;
    public Music mMusic;
    public String mPlatformEffect;
    public String mRequestId;
    public String mSearchKeyword;
    public HashMap mSeekBarConfigs;
    public boolean mShouldShowMagicFaceTip;
    public boolean mSwitchable;
    public String mTimelineColor;
    public String mTopic;
    public long mUseTime;
    public VoteConfig mVoteConfig;
    public WishMagicInfo mWishMagicInfo;
    public static final long serialVersionUID = 0x1;

    public void MagicEmoji$MagicFace(){
       super();
       this.mMagicFaceType = MagicEmoji$MagicFaceType.Normal;
       this.mDisableBeautylist = null;
       this.mMagicUserInfo = "";
       this.mShouldShowMagicFaceTip = false;
    }
    public void MagicEmoji$MagicFace(String p0){
       super(p0);
       this.mMagicFaceType = MagicEmoji$MagicFaceType.Normal;
       this.mDisableBeautylist = null;
       this.mMagicUserInfo = "";
       this.mShouldShowMagicFaceTip = false;
    }
    public static MagicEmoji$MagicFace getParentMagicFace(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicEmoji$MagicFace.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0.mChildId)) {
          return null;
       }
       p0 = p0.clone();
       p0.mChildId = "";
       p0.mChildMagicFace = null;
       return p0;
    }
    public static boolean isChildMagicFace(MagicEmoji$MagicFace p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicEmoji$MagicFace.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       return (TextUtils.isEmpty(p0.mChildId) ^ 0x01);
    }
    public static boolean isH5Entrance(MagicEmoji$MagicFace p0){
       boolean b = (p0 != null && p0.mResourceType == 5)? true: false;
       return b;
    }
    public static boolean isImmerseMagicFace(MagicBaseConfig p0){
       boolean b = false;
       if (!p0 instanceof MagicEmoji$MagicFace) {
          return b;
       }
       MagicEmoji$MagicFace mExtraParams = p0.mExtraParams;
       if (mExtraParams != null && mExtraParams.mIsImmerseMode != null) {
          b = true;
       }
       return b;
    }
    public static boolean isInvalidCheckSum(Long p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicEmoji$MagicFace.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || !p0.longValue())? true: false;
       return b;
    }
    public static boolean isMagicFaceEquals(MagicEmoji$MagicFace p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, MagicEmoji$MagicFace.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return MagicEmoji$MagicFace.isMagicFaceEquals(p0, p1, null);
    }
    public static boolean isMagicFaceEquals(MagicEmoji$MagicFace p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, MagicEmoji$MagicFace.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return TextUtils.isEmpty(p1);
       }
       boolean b = false;
       if (!TextUtils.equals(p0.mId, p1)) {
          return b;
       }
       if (!TextUtils.isEmpty(p0.mChildId) || (TextUtils.isEmpty(p2) || TextUtils.equals(p0.mChildId, p2))) {
          b = true;
       }
       return b;
    }
    public static boolean isMagicGift(MagicBaseConfig p0){
       boolean b = false;
       if (!p0 instanceof MagicEmoji$MagicFace) {
          return b;
       }
       if (p0.mMagicFaceType == MagicEmoji$MagicFaceType.Gift) {
          b = true;
       }
       return b;
    }
    public static boolean isPlatformMagicFace(MagicBaseConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MagicEmoji$MagicFace.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof MagicEmoji$MagicFace) {
          return false;
       }
       return (TextUtils.isEmpty(p0.mPlatformEffect) ^ 0x01);
    }
    public static boolean needPreDownloadGuideVideo(MagicBaseConfig p0){
       boolean b = false;
       if (!p0 instanceof MagicEmoji$MagicFace) {
          return b;
       }
       MagicEmoji$MagicFace mMagicGuideP = p0.mMagicGuideParams;
       if (mMagicGuideP != null && mMagicGuideP.mShowType == 3) {
          b = true;
       }
       return b;
    }
    public void clearSeekBarConfig(){
       this.mSeekBarConfigs = null;
    }
    public MagicBaseConfig clone(){
       return this.clone();
    }
    public MagicEmoji$MagicFace clone(){
       Object obj = PatchProxy.apply(null, this, MagicEmoji$MagicFace.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.clone();
    }
    public Object clone(){
       return this.clone();
    }
    public void copyFrom(MagicBaseConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmoji$MagicFace.class, "7")) {
          return;
       }
       super.copyFrom(p0);
       if (!p0.isMagicFace()) {
          return;
       }
       this.mMusic = p0.mMusic;
       this.mSwitchable = p0.mSwitchable;
       this.mTopic = p0.mTopic;
       this.mMagicFaceType = p0.mMagicFaceType;
       this.mExtraParams = p0.mExtraParams;
       this.mHasMusic = p0.mHasMusic;
       this.mIsOffline = p0.mIsOffline;
       this.mUnSupportReason = p0.mUnSupportReason;
       this.mFileMd5CheckList = p0.mFileMd5CheckList;
       this.mPlatformEffect = p0.mPlatformEffect;
       this.mMagicGuideParams = p0.mMagicGuideParams;
       return;
    }
    public String getActivityId(){
       MagicEmoji$MagicFace tmExtraParam = this.mExtraParams;
       String str = (tmExtraParam == null)? null: tmExtraParam.mActivityId;
       return str;
    }
    public String getMagicMusicId(){
       MagicEmoji$MagicFace tmMusic = this.mMusic;
       String str = (tmMusic == null)? "": tmMusic.mId;
       return str;
    }
    public String getMagicMusicName(){
       MagicEmoji$MagicFace tmMusic = this.mMusic;
       String str = (tmMusic == null)? "": tmMusic.mName;
       return str;
    }
    public int getMagicMusicType(){
       MagicEmoji$MagicFace obj = PatchProxy.apply(null, this, MagicEmoji$MagicFace.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mMusic;
       MusicType uNKNOWN = (obj == null)? MusicType.UNKNOWN: obj.mType;
       return uNKNOWN.ordinal();
    }
    public HashMap getSeekBarConfigs(){
       return this.mSeekBarConfigs;
    }
    public String getStickerTopic(){
       Object[] objArray = null;
       MagicEmoji$MagicFace obj = PatchProxy.apply(objArray, this, MagicEmoji$MagicFace.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mExtraParams;
       if (obj != null) {
          objArray = obj.getStickerTopic();
       }
       return objArray;
    }
    public String getSupportedInfo(){
       Object obj = PatchProxy.apply(null, this, MagicEmoji$MagicFace.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{"+" id:"+this.mId+" name:"+this.mName+" offline:"+this.mIsOffline+" version:"+this.mVersion+"}";
    }
    public String getTopic(){
       Object[] objArray = null;
       MagicEmoji$MagicFace obj = PatchProxy.apply(objArray, this, MagicEmoji$MagicFace.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mExtraParams;
       if (obj != null) {
          objArray = obj.getTopic();
       }
       return objArray;
    }
    public boolean isFriendsUsing(){
       MagicEmoji$MagicFace obj = PatchProxy.apply(null, this, MagicEmoji$MagicFace.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mFriendsUsingInfo;
       boolean b = true;
       if (obj == null || obj.getUseCount() < b) {
          b = false;
       }
       return b;
    }
    public boolean isMagicFace(){
       return true;
    }
    public boolean isNormal(){
       boolean b = (this.mMagicFaceType == MagicEmoji$MagicFaceType.Normal)? true: false;
       return b;
    }
    public boolean isNotSupportMakeUpSeekBar(){
       MagicEmoji$MagicFace tmExtraParam = this.mExtraParams;
       boolean b = (tmExtraParam != null && tmExtraParam.mRecordId > null)? true: false;
       return b;
    }
    public boolean isVoteMagic(){
       MagicEmoji$MagicFace tmExtraParam = this.mExtraParams;
       boolean b = (tmExtraParam != null && tmExtraParam.mVoteConfig != null)? true: false;
       return b;
    }
    public void setActivityId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEmoji$MagicFace.class, "1")) {
          return;
       }
       if (this.mExtraParams == null) {
          this.mExtraParams = new MagicFaceExtraParams();
       }
       this.mExtraParams.mActivityId = p0;
       return;
    }
    public void setSeekBarConfig(float p0,MagicEmoji$SeekBarType p1){
       if (PatchProxy.isSupport(MagicEmoji$MagicFace.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, MagicEmoji$MagicFace.class, "9")) {
          return;
       }
       if (this.mSeekBarConfigs == null) {
          this.mSeekBarConfigs = new HashMap();
       }
       this.mSeekBarConfigs.put(p1, new MagicEmoji$a(p0, p1));
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MagicEmoji$MagicFace.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{"+"id="+this.mId+" name="+this.mName+" groupId="+this.mGroupId+" hashCode="+this.hashCode()+"} ";
    }
}
