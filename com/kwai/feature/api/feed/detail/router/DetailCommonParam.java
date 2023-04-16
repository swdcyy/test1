package com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import java.io.Serializable;
import java.lang.Cloneable;
import im8.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CloneNotSupportedException;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.detail.DetailCoverInfo;
import com.kwai.framework.model.channel.HotChannel;
import vm5.d;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.entity.QPreInfo;
import java.lang.Integer;

public class DetailCommonParam implements Serializable, Cloneable, g	// class@000e95
{
    public QComment mComment;
    public boolean mCommentPushFirst;
    public DetailCoverInfo mDetailCoverInfo;
    public boolean mDisallowScreenShot;
    public int mDynamicPrefetcherId;
    public String mFromChannel;
    public boolean mFromCommentAt;
    public boolean mFromCommentPush;
    public HotChannel mHotChannel;
    public boolean mIsFromProfile;
    public boolean mIsFromShareTask;
    public boolean mIsMyFollowFriendEntrance;
    public boolean mIsWindowTranslucent;
    public int mMessageFromType;
    public String mMessageSenderName;
    public long mOpendTimeStamp;
    public QPreInfo mPreInfo;
    public int mRankFetcherId;
    public String mShareUid;
    public boolean mSlidePlayDetailDifferentFollowRefer;
    public String mSourceFlag;
    public int mSourceFlagType;
    public int mSourcePage;
    public int mUnserializableBundleId;
    public String sourcePage2;
    public static final long serialVersionUID = 0x6c7af3e7f3479f18;

    public void DetailCommonParam(){
       super();
       this.mOpendTimeStamp = -1;
       this.mSlidePlayDetailDifferentFollowRefer = true;
       this.mIsMyFollowFriendEntrance = false;
    }
    public DetailCommonParam clone(){
       Object obj = PatchProxy.apply(null, this, DetailCommonParam.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public QComment getComment(){
       return this.mComment;
    }
    public DetailCoverInfo getDetailCoverInfo(){
       return this.mDetailCoverInfo;
    }
    public int getDynamicPrefetcherId(){
       return this.mDynamicPrefetcherId;
    }
    public String getFromChannel(){
       return this.mFromChannel;
    }
    public HotChannel getHotChannel(){
       return this.mHotChannel;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailCommonParam.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, DetailCommonParam.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(DetailCommonParam.class, new d());
       }else {
          obj.put(DetailCommonParam.class, null);
       }
       return obj;
    }
    public long getOpendTimeStamp(){
       return this.mOpendTimeStamp;
    }
    public String getPreExpTag(){
       DetailCommonParam tmPreInfo = this.mPreInfo;
       String str = (tmPreInfo == null)? null: tmPreInfo.mPreExpTag;
       return str;
    }
    public QPreInfo getPreInfo(){
       return this.mPreInfo;
    }
    public String getPreLLSId(){
       DetailCommonParam tmPreInfo = this.mPreInfo;
       String str = (tmPreInfo == null)? null: tmPreInfo.mPreLLSId;
       return str;
    }
    public String getPrePhotoId(){
       DetailCommonParam tmPreInfo = this.mPreInfo;
       String str = (tmPreInfo == null)? null: tmPreInfo.mPrePhotoId;
       return str;
    }
    public int getPrePhotoIndex(){
       DetailCommonParam tmPreInfo = this.mPreInfo;
       int i = (tmPreInfo == null)? -1: tmPreInfo.mPrePhotoIndex;
       return i;
    }
    public String getPreUserId(){
       DetailCommonParam tmPreInfo = this.mPreInfo;
       String str = (tmPreInfo == null)? null: tmPreInfo.mPreUserId;
       return str;
    }
    public int getRankFetcherId(){
       return this.mRankFetcherId;
    }
    public String getShareUid(){
       return this.mShareUid;
    }
    public String getSourceFlag(){
       return this.mSourceFlag;
    }
    public int getSourceFlagType(){
       return this.mSourceFlagType;
    }
    public int getSourcePage(){
       return this.mSourcePage;
    }
    public String getSourcePage2(){
       return this.sourcePage2;
    }
    public int getUnserializableBundleId(){
       return this.mUnserializableBundleId;
    }
    public boolean isCommentPushFirst(){
       return this.mCommentPushFirst;
    }
    public boolean isDisallowScreenShot(){
       return this.mDisallowScreenShot;
    }
    public boolean isFromCommentAt(){
       return this.mFromCommentAt;
    }
    public boolean isFromCommentPush(){
       return this.mFromCommentPush;
    }
    public boolean isFromProfile(){
       return this.mIsFromProfile;
    }
    public boolean isFromShareTask(){
       return this.mIsFromShareTask;
    }
    public boolean isMyFollowFriendEntrance(){
       return this.mIsMyFollowFriendEntrance;
    }
    public boolean isSlidePlayDetailDifferentFollowRefer(){
       return this.mSlidePlayDetailDifferentFollowRefer;
    }
    public void setComment(QComment p0){
       this.mComment = p0;
    }
    public void setCommentPushFirst(boolean p0){
       this.mCommentPushFirst = p0;
    }
    public void setDetailCoverInfo(DetailCoverInfo p0){
       this.mDetailCoverInfo = p0;
    }
    public void setDisallowScreenShot(boolean p0){
       this.mDisallowScreenShot = p0;
    }
    public void setDynamicPrefetcherId(int p0){
       this.mDynamicPrefetcherId = p0;
    }
    public void setFromChannel(String p0){
       this.mFromChannel = p0;
    }
    public void setFromCommentAt(boolean p0){
       this.mFromCommentAt = p0;
    }
    public void setFromCommentPush(boolean p0){
       this.mFromCommentPush = p0;
    }
    public void setHotChannel(HotChannel p0){
       this.mHotChannel = p0;
    }
    public void setIsFromProfile(boolean p0){
       this.mIsFromProfile = p0;
    }
    public void setIsFromShareTask(boolean p0){
       this.mIsFromShareTask = p0;
    }
    public DetailCommonParam setMyFollowFriendEntrance(boolean p0){
       this.mIsMyFollowFriendEntrance = p0;
       return this;
    }
    public void setOpendTimeStamp(long p0){
       this.mOpendTimeStamp = p0;
    }
    public DetailCommonParam setPreExpTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailCommonParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPreInfo == null) {
          this.mPreInfo = new QPreInfo();
       }
       this.mPreInfo.mPreExpTag = p0;
       return this;
    }
    public void setPreInfo(QPreInfo p0){
       this.mPreInfo = p0;
    }
    public DetailCommonParam setPreLLSId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailCommonParam.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPreInfo == null) {
          this.mPreInfo = new QPreInfo();
       }
       this.mPreInfo.mPreLLSId = p0;
       return this;
    }
    public DetailCommonParam setPreLiveStreamId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailCommonParam.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPreInfo == null) {
          this.mPreInfo = new QPreInfo();
       }
       this.mPreInfo.mPreLiveStreamId = p0;
       return this;
    }
    public DetailCommonParam setPrePhotoId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailCommonParam.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPreInfo == null) {
          this.mPreInfo = new QPreInfo();
       }
       this.mPreInfo.mPrePhotoId = p0;
       return this;
    }
    public DetailCommonParam setPrePhotoIndex(int p0){
       if (PatchProxy.isSupport(DetailCommonParam.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, DetailCommonParam.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.mPreInfo == null) {
          this.mPreInfo = new QPreInfo();
       }
       this.mPreInfo.mPrePhotoIndex = p0;
       return this;
    }
    public DetailCommonParam setPreUserId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DetailCommonParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mPreInfo == null) {
          this.mPreInfo = new QPreInfo();
       }
       this.mPreInfo.mPreUserId = p0;
       return this;
    }
    public void setRankFetcherId(int p0){
       this.mRankFetcherId = p0;
    }
    public void setShareUid(String p0){
       this.mShareUid = p0;
    }
    public DetailCommonParam setSlidePlayDetailDifferentFollowRefer(boolean p0){
       this.mSlidePlayDetailDifferentFollowRefer = p0;
       return this;
    }
    public void setSourceFlag(String p0){
       this.mSourceFlag = p0;
    }
    public void setSourceFlagType(int p0){
       this.mSourceFlagType = p0;
    }
    public void setSourcePage(int p0){
       this.mSourcePage = p0;
    }
    public void setSourcePage2(String p0){
       this.sourcePage2 = p0;
    }
    public void setUnserializableBundleId(int p0){
       this.mUnserializableBundleId = p0;
    }
}
