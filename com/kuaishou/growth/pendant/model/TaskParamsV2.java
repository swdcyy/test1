package com.kuaishou.growth.pendant.model.TaskParamsV2;
import com.yxcorp.gifshow.pendant.response.PendantSharedParams;
import com.kuaishou.growth.pendant.model.TaskParamsV2$a;
import nsd.u;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import mf0.b;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.model.PendantActiveParams;
import java.util.Map;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.growth.pendant.model.CompleteTipConfigV2;
import com.kuaishou.growth.pendant.model.PendantCycleFinishedTextConfig;
import com.kuaishou.growth.pendant.model.PendantExpandButtonConfig;
import com.kuaishou.growth.pendant.model.ShrinkDoubleParams;
import com.google.gson.JsonElement;
import com.kuaishou.growth.pendant.model.WatchVideoExtraRewardToastConfigV2;
import com.yxcorp.gifshow.pendant.response.PendantLocationParam;
import java.lang.Number;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import mf0.a;
import usd.q;
import sf0.e;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import sf0.d;
import com.yxcorp.gifshow.pendant.response.AdsorptionStateConfigV2;
import java.util.List;

public final class TaskParamsV2 extends PendantSharedParams	// class@00068d
{
    public PendantActiveParams mActiveWidgetParams;
    public boolean mActivityTask;
    public int mAnimationFramePMs;
    public int mAnimationId;
    public String mAnimationResourceUrl;
    public String mBizId;
    public Map mBubbleConfigs;
    public int mCheckValue;
    public CDNUrl[] mCompleteBackgroundIconCdnUrls;
    public String mCompleteBackgroundIconUrl;
    public CDNUrl[] mCompleteForegroundIconCdnUrls;
    public String mCompleteForegroundIconUrl;
    public CDNUrl[] mCompleteIconCdnUrls;
    public String mCompleteIconUrl;
    public CompleteTipConfigV2 mCompleteTipConfigV2;
    public int mCurrentCount;
    public long mCycleFinishedAnimDuration;
    public PendantCycleFinishedTextConfig mCycleFinishedTextConfig;
    public boolean mDisableStoreProgress;
    public int[] mDisplayPages;
    public String[] mDisplayPages2;
    public String mEventId;
    public PendantExpandButtonConfig mExpandButtonConfig;
    public long mExpireTimeMillis;
    public String mFinishedIconUrl;
    public CDNUrl[] mIconCdnUrls;
    public String mIconUrl;
    public boolean mIsSideBarOpen;
    public int mMaxClickXMarkCount;
    public boolean mNeedReportWhenClose;
    public int mOriginWidgetStatus;
    public String mProgressBgColor;
    public String mProgressColor;
    public String mReportId;
    public String mReportToken;
    public int[] mRestorePages;
    public String[] mRestorePages2;
    public double mRewardCount;
    public int[] mSectionIntervals;
    public ShrinkDoubleParams mShrinkDoubleParams;
    public int mTargetCount;
    public String mTaskCompleteUrl;
    public String mTaskDesc;
    public String mTaskIdentify;
    public String mTaskInProgressUrl;
    public String mTaskReportToken;
    public String mTextColor;
    public JsonElement mVideoCompleteRedPacketTaskConfig;
    public WatchVideoExtraRewardToastConfigV2 mWatchVideoExtraRewardToastConfigV2;
    public long mWidgetExpireTime;
    public PendantLocationParam mWidgetInitialPosition;
    public String mWidgetQueueType;
    public int mWidgetStatus;
    public int mWidgetStyle;
    public static final TaskParamsV2$a Companion;
    public static final long serialVersionUID;

    static {
       TaskParamsV2.Companion = new TaskParamsV2$a(null);
    }
    public void TaskParamsV2(){
       super();
       this.mWidgetStatus = 1;
       this.mOriginWidgetStatus = -1;
    }
    public static void getMEventId$annotations(){
    }
    public static void getMOriginWidgetStatus$annotations(){
    }
    public static void getMWidgetQueueType$annotations(){
    }
    public static void getMWidgetStatus$annotations(){
    }
    public final boolean completeNeedTakeReward(){
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, TaskParamsV2.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(this, objArray, b.class, "12");
       b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else {
          a.p(this, "$this$isUsedInUiRefresh");
          b1 = (a.g(this.getMEventId(), "widget_browse_behind_detail_page_ui_unlogin") || a.g(this.getMEventId(), "widget_browse_behind_detail_page_ui_finished"))? true: false;
       }
       if (!b1 && b.s(this)) {
          b = true;
       }
       return b;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TaskParamsV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof TaskParamsV2 && a.g(b.g(this), b.g(p0)))? true: false;
       return b;
    }
    public final PendantActiveParams getMActiveWidgetParams(){
       return this.mActiveWidgetParams;
    }
    public final boolean getMActivityTask(){
       return this.mActivityTask;
    }
    public final int getMAnimationFramePMs(){
       return this.mAnimationFramePMs;
    }
    public final int getMAnimationId(){
       return this.mAnimationId;
    }
    public final String getMAnimationResourceUrl(){
       return this.mAnimationResourceUrl;
    }
    public final String getMBizId(){
       return this.mBizId;
    }
    public final Map getMBubbleConfigs(){
       return this.mBubbleConfigs;
    }
    public final int getMCheckValue(){
       return this.mCheckValue;
    }
    public final CDNUrl[] getMCompleteBackgroundIconCdnUrls(){
       return this.mCompleteBackgroundIconCdnUrls;
    }
    public final String getMCompleteBackgroundIconUrl(){
       return this.mCompleteBackgroundIconUrl;
    }
    public final CDNUrl[] getMCompleteForegroundIconCdnUrls(){
       return this.mCompleteForegroundIconCdnUrls;
    }
    public final String getMCompleteForegroundIconUrl(){
       return this.mCompleteForegroundIconUrl;
    }
    public final CDNUrl[] getMCompleteIconCdnUrls(){
       return this.mCompleteIconCdnUrls;
    }
    public final String getMCompleteIconUrl(){
       return this.mCompleteIconUrl;
    }
    public final CompleteTipConfigV2 getMCompleteTipConfigV2(){
       return this.mCompleteTipConfigV2;
    }
    public final int getMCurrentCount(){
       return this.mCurrentCount;
    }
    public final long getMCycleFinishedAnimDuration(){
       return this.mCycleFinishedAnimDuration;
    }
    public final PendantCycleFinishedTextConfig getMCycleFinishedTextConfig(){
       return this.mCycleFinishedTextConfig;
    }
    public final boolean getMDisableStoreProgress(){
       return this.mDisableStoreProgress;
    }
    public final int[] getMDisplayPages(){
       return this.mDisplayPages;
    }
    public final String[] getMDisplayPages2(){
       return this.mDisplayPages2;
    }
    public final String getMEventId(){
       return this.mEventId;
    }
    public final PendantExpandButtonConfig getMExpandButtonConfig(){
       return this.mExpandButtonConfig;
    }
    public final long getMExpireTimeMillis(){
       return this.mExpireTimeMillis;
    }
    public final String getMFinishedIconUrl(){
       return this.mFinishedIconUrl;
    }
    public final CDNUrl[] getMIconCdnUrls(){
       return this.mIconCdnUrls;
    }
    public final String getMIconUrl(){
       return this.mIconUrl;
    }
    public final boolean getMIsSideBarOpen(){
       return this.mIsSideBarOpen;
    }
    public final int getMMaxClickXMarkCount(){
       return this.mMaxClickXMarkCount;
    }
    public final boolean getMNeedReportWhenClose(){
       return this.mNeedReportWhenClose;
    }
    public final int getMOriginWidgetStatus(){
       return this.mOriginWidgetStatus;
    }
    public final String getMProgressBgColor(){
       return this.mProgressBgColor;
    }
    public final String getMProgressColor(){
       return this.mProgressColor;
    }
    public final String getMReportId(){
       return this.mReportId;
    }
    public final String getMReportToken(){
       return this.mReportToken;
    }
    public final int[] getMRestorePages(){
       return this.mRestorePages;
    }
    public final String[] getMRestorePages2(){
       return this.mRestorePages2;
    }
    public final double getMRewardCount(){
       return this.mRewardCount;
    }
    public final int[] getMSectionIntervals(){
       return this.mSectionIntervals;
    }
    public final ShrinkDoubleParams getMShrinkDoubleParams(){
       return this.mShrinkDoubleParams;
    }
    public final int getMTargetCount(){
       return this.mTargetCount;
    }
    public final String getMTaskCompleteUrl(){
       return this.mTaskCompleteUrl;
    }
    public final String getMTaskDesc(){
       return this.mTaskDesc;
    }
    public final String getMTaskIdentify(){
       return this.mTaskIdentify;
    }
    public final String getMTaskInProgressUrl(){
       return this.mTaskInProgressUrl;
    }
    public final String getMTaskReportToken(){
       return this.mTaskReportToken;
    }
    public final String getMTextColor(){
       return this.mTextColor;
    }
    public final JsonElement getMVideoCompleteRedPacketTaskConfig(){
       return this.mVideoCompleteRedPacketTaskConfig;
    }
    public final WatchVideoExtraRewardToastConfigV2 getMWatchVideoExtraRewardToastConfigV2(){
       return this.mWatchVideoExtraRewardToastConfigV2;
    }
    public final long getMWidgetExpireTime(){
       return this.mWidgetExpireTime;
    }
    public final PendantLocationParam getMWidgetInitialPosition(){
       return this.mWidgetInitialPosition;
    }
    public final String getMWidgetQueueType(){
       return this.mWidgetQueueType;
    }
    public final int getMWidgetStatus(){
       return this.mWidgetStatus;
    }
    public final int getMWidgetStyle(){
       return this.mWidgetStyle;
    }
    public int hashCode(){
       String obj = PatchProxy.apply(null, this, TaskParamsV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       obj = (b.g(this).length() > 0)? 1: null;
       if (obj) {
          i = (b.g(this)).hashCode();
       }
       return i;
    }
    public final void setMActiveWidgetParams(PendantActiveParams p0){
       this.mActiveWidgetParams = p0;
    }
    public final void setMActivityTask(boolean p0){
       this.mActivityTask = p0;
    }
    public final void setMAnimationFramePMs(int p0){
       this.mAnimationFramePMs = p0;
    }
    public final void setMAnimationId(int p0){
       this.mAnimationId = p0;
    }
    public final void setMAnimationResourceUrl(String p0){
       this.mAnimationResourceUrl = p0;
    }
    public final void setMBizId(String p0){
       this.mBizId = p0;
    }
    public final void setMBubbleConfigs(Map p0){
       this.mBubbleConfigs = p0;
    }
    public final void setMCheckValue(int p0){
       this.mCheckValue = p0;
    }
    public final void setMCompleteBackgroundIconCdnUrls(CDNUrl[] p0){
       this.mCompleteBackgroundIconCdnUrls = p0;
    }
    public final void setMCompleteBackgroundIconUrl(String p0){
       this.mCompleteBackgroundIconUrl = p0;
    }
    public final void setMCompleteForegroundIconCdnUrls(CDNUrl[] p0){
       this.mCompleteForegroundIconCdnUrls = p0;
    }
    public final void setMCompleteForegroundIconUrl(String p0){
       this.mCompleteForegroundIconUrl = p0;
    }
    public final void setMCompleteIconCdnUrls(CDNUrl[] p0){
       this.mCompleteIconCdnUrls = p0;
    }
    public final void setMCompleteIconUrl(String p0){
       this.mCompleteIconUrl = p0;
    }
    public final void setMCompleteTipConfigV2(CompleteTipConfigV2 p0){
       this.mCompleteTipConfigV2 = p0;
    }
    public final void setMCurrentCount(int p0){
       this.mCurrentCount = p0;
    }
    public final void setMCycleFinishedAnimDuration(long p0){
       this.mCycleFinishedAnimDuration = p0;
    }
    public final void setMCycleFinishedTextConfig(PendantCycleFinishedTextConfig p0){
       this.mCycleFinishedTextConfig = p0;
    }
    public final void setMDisableStoreProgress(boolean p0){
       this.mDisableStoreProgress = p0;
    }
    public final void setMDisplayPages(int[] p0){
       this.mDisplayPages = p0;
    }
    public final void setMDisplayPages2(String[] p0){
       this.mDisplayPages2 = p0;
    }
    public final void setMEventId(String p0){
       this.mEventId = p0;
    }
    public final void setMExpandButtonConfig(PendantExpandButtonConfig p0){
       this.mExpandButtonConfig = p0;
    }
    public final void setMExpireTimeMillis(long p0){
       this.mExpireTimeMillis = p0;
    }
    public final void setMFinishedIconUrl(String p0){
       this.mFinishedIconUrl = p0;
    }
    public final void setMIconCdnUrls(CDNUrl[] p0){
       this.mIconCdnUrls = p0;
    }
    public final void setMIconUrl(String p0){
       this.mIconUrl = p0;
    }
    public final void setMIsSideBarOpen(boolean p0){
       this.mIsSideBarOpen = p0;
    }
    public final void setMMaxClickXMarkCount(int p0){
       this.mMaxClickXMarkCount = p0;
    }
    public final void setMNeedReportWhenClose(boolean p0){
       this.mNeedReportWhenClose = p0;
    }
    public final void setMOriginWidgetStatus(int p0){
       this.mOriginWidgetStatus = p0;
    }
    public final void setMProgressBgColor(String p0){
       this.mProgressBgColor = p0;
    }
    public final void setMProgressColor(String p0){
       this.mProgressColor = p0;
    }
    public final void setMReportId(String p0){
       this.mReportId = p0;
    }
    public final void setMReportToken(String p0){
       this.mReportToken = p0;
    }
    public final void setMRestorePages(int[] p0){
       this.mRestorePages = p0;
    }
    public final void setMRestorePages2(String[] p0){
       this.mRestorePages2 = p0;
    }
    public final void setMRewardCount(double p0){
       this.mRewardCount = p0;
    }
    public final void setMSectionIntervals(int[] p0){
       this.mSectionIntervals = p0;
    }
    public final void setMShrinkDoubleParams(ShrinkDoubleParams p0){
       this.mShrinkDoubleParams = p0;
    }
    public final void setMTargetCount(int p0){
       this.mTargetCount = p0;
    }
    public final void setMTaskCompleteUrl(String p0){
       this.mTaskCompleteUrl = p0;
    }
    public final void setMTaskDesc(String p0){
       this.mTaskDesc = p0;
    }
    public final void setMTaskIdentify(String p0){
       this.mTaskIdentify = p0;
    }
    public final void setMTaskInProgressUrl(String p0){
       this.mTaskInProgressUrl = p0;
    }
    public final void setMTaskReportToken(String p0){
       this.mTaskReportToken = p0;
    }
    public final void setMTextColor(String p0){
       this.mTextColor = p0;
    }
    public final void setMVideoCompleteRedPacketTaskConfig(JsonElement p0){
       this.mVideoCompleteRedPacketTaskConfig = p0;
    }
    public final void setMWatchVideoExtraRewardToastConfigV2(WatchVideoExtraRewardToastConfigV2 p0){
       this.mWatchVideoExtraRewardToastConfigV2 = p0;
    }
    public final void setMWidgetExpireTime(long p0){
       this.mWidgetExpireTime = p0;
    }
    public final void setMWidgetInitialPosition(PendantLocationParam p0){
       this.mWidgetInitialPosition = p0;
    }
    public final void setMWidgetQueueType(String p0){
       this.mWidgetQueueType = p0;
    }
    public final void setMWidgetStatus(int p0){
       this.mWidgetStatus = p0;
    }
    public final void setMWidgetStyle(int p0){
       this.mWidgetStyle = p0;
    }
    public final void update(TaskParamsV2 p0){
       TaskParamsV2 tmCurrentCou;
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskParamsV2.class, "3")) {
          return;
       }
       a.p(p0, "paramsV2");
       String str = b.g(this);
       String str1 = (str.length() > 0)? 1: null;
       if (str1 && (a.g(str, b.g(p0)) ^ 1)) {
          return;
       }else {
          a.c("update:"+this.mTaskReportToken+" currentCount:"+this.mCurrentCount+" params.currentCount:"+p0.mCurrentCount);
          this.mBizId = p0.mBizId;
          this.mTaskIdentify = p0.mTaskIdentify;
          this.mTaskReportToken = p0.mTaskReportToken;
          if (p0.mDisableStoreProgress == null) {
             tmCurrentCou = this.mCurrentCount;
             if (tmCurrentCou < p0.mTargetCount) {
                int i = q.n(tmCurrentCou, p0.mCurrentCount);
             label_0076 :
                this.mCurrentCount = tmCurrentCou;
                this.mTargetCount = p0.mTargetCount;
                this.mSectionIntervals = p0.mSectionIntervals;
                this.mWidgetExpireTime = p0.mWidgetExpireTime;
                this.mEventId = p0.mEventId;
                this.mTaskDesc = p0.mTaskDesc;
                this.mCheckValue = p0.mCheckValue;
                this.mIconUrl = p0.mIconUrl;
                this.mIconCdnUrls = p0.mIconCdnUrls;
                this.mCompleteIconUrl = p0.mCompleteIconUrl;
                this.mFinishedIconUrl = p0.mFinishedIconUrl;
                this.mCompleteIconCdnUrls = p0.mCompleteIconCdnUrls;
                this.mCompleteBackgroundIconUrl = p0.mCompleteBackgroundIconUrl;
                this.mCompleteBackgroundIconCdnUrls = p0.mCompleteBackgroundIconCdnUrls;
                this.mCompleteForegroundIconUrl = p0.mCompleteForegroundIconUrl;
                this.mCompleteForegroundIconCdnUrls = p0.mCompleteForegroundIconCdnUrls;
                this.mWidgetStyle = p0.mWidgetStyle;
                this.mTaskInProgressUrl = p0.mTaskInProgressUrl;
                this.mTaskCompleteUrl = p0.mTaskCompleteUrl;
                this.mTextColor = p0.mTextColor;
                this.mProgressColor = p0.mProgressColor;
                this.mProgressBgColor = p0.mProgressBgColor;
                this.mRestorePages = p0.mRestorePages;
                this.mRestorePages2 = p0.mRestorePages2;
                this.mAnimationResourceUrl = p0.mAnimationResourceUrl;
                this.mAnimationFramePMs = p0.mAnimationFramePMs;
                this.mDisableStoreProgress = p0.mDisableStoreProgress;
                this.mBubbleConfigs = p0.mBubbleConfigs;
                this.mWidgetInitialPosition = p0.mWidgetInitialPosition;
                this.mAnimationId = p0.mAnimationId;
                this.mRewardCount = p0.mRewardCount;
                this.mCompleteTipConfigV2 = p0.mCompleteTipConfigV2;
                this.mWidgetQueueType = p0.mWidgetQueueType;
                this.updateConfig(p0);
                return;
             }
          }
          tmCurrentCou = p0.mCurrentCount;
          goto label_0076 ;
       }
    }
    public final void updateConfig(TaskParamsV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskParamsV2.class, "4")) {
          return;
       }
       a.p(p0, "paramsV2");
       e b = e.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(p0, b, e.class, "3")) {
          a.p(p0, "taskParamsV2");
          Iterator iterator = e.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p0);
          }
       }
       this.setAdsorptionStateConfigV2(p0.getAdsorptionStateConfigV2());
       this.setLegalArea(p0.getLegalArea());
       this.mReportToken = p0.mReportToken;
       this.mExpireTimeMillis = p0.mExpireTimeMillis;
       this.mVideoCompleteRedPacketTaskConfig = p0.mVideoCompleteRedPacketTaskConfig;
       this.mWidgetStatus = p0.mWidgetStatus;
       this.mOriginWidgetStatus = p0.mOriginWidgetStatus;
       this.mActiveWidgetParams = p0.mActiveWidgetParams;
       this.mShrinkDoubleParams = p0.mShrinkDoubleParams;
       this.mExpandButtonConfig = p0.mExpandButtonConfig;
       this.mCycleFinishedTextConfig = p0.mCycleFinishedTextConfig;
       this.mCycleFinishedAnimDuration = p0.mCycleFinishedAnimDuration;
       return;
    }
}
