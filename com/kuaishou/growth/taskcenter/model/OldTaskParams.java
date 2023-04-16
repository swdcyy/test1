package com.kuaishou.growth.taskcenter.model.OldTaskParams;
import java.io.Serializable;
import com.kuaishou.growth.taskcenter.model.OldTaskParams$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.pendant.response.PendantLocationParam;
import java.lang.Number;

public final class OldTaskParams implements Serializable	// class@000740
{
    public String mActivityId;
    public boolean mActivityTask;
    public int mAnimationFramePMs;
    public String mAnimationResourceUrl;
    public String mBizId;
    public int mCheckValue;
    public String mCloseDialogText;
    public String mCompleteIconUrl;
    public int mCurrentCount;
    public boolean mDisableStoreProgress;
    public int mDisappearFewSeconds;
    public String mEventId;
    public String mIconUrl;
    public int[] mSectionIntervals;
    public int[] mShowPages;
    public String[] mShowPages2;
    public int mTargetCount;
    public String mTaskCompleteUrl;
    public String mTaskDesc;
    public String mTaskId;
    public String mTaskInProgressUrl;
    public String mTextColor;
    public long mWidgetExpireTime;
    public PendantLocationParam mWidgetInitialPosition;
    public String mWidgetTaskCompleteText;
    public int mXPolicy;
    public static final OldTaskParams$a Companion;
    public static final long serialVersionUID;

    static {
       OldTaskParams.Companion = new OldTaskParams$a(null);
    }
    public void OldTaskParams(){
       super();
    }
    public static void getMEventId$annotations(){
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OldTaskParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof OldTaskParams && a.g(this.mTaskId, p0.mTaskId))? true: false;
       return b;
    }
    public final String getMActivityId(){
       return this.mActivityId;
    }
    public final boolean getMActivityTask(){
       return this.mActivityTask;
    }
    public final int getMAnimationFramePMs(){
       return this.mAnimationFramePMs;
    }
    public final String getMAnimationResourceUrl(){
       return this.mAnimationResourceUrl;
    }
    public final String getMBizId(){
       return this.mBizId;
    }
    public final int getMCheckValue(){
       return this.mCheckValue;
    }
    public final String getMCloseDialogText(){
       return this.mCloseDialogText;
    }
    public final String getMCompleteIconUrl(){
       return this.mCompleteIconUrl;
    }
    public final int getMCurrentCount(){
       return this.mCurrentCount;
    }
    public final boolean getMDisableStoreProgress(){
       return this.mDisableStoreProgress;
    }
    public final int getMDisappearFewSeconds(){
       return this.mDisappearFewSeconds;
    }
    public final String getMEventId(){
       return this.mEventId;
    }
    public final String getMIconUrl(){
       return this.mIconUrl;
    }
    public final int[] getMSectionIntervals(){
       return this.mSectionIntervals;
    }
    public final int[] getMShowPages(){
       return this.mShowPages;
    }
    public final String[] getMShowPages2(){
       return this.mShowPages2;
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
    public final String getMTaskId(){
       return this.mTaskId;
    }
    public final String getMTaskInProgressUrl(){
       return this.mTaskInProgressUrl;
    }
    public final String getMTextColor(){
       return this.mTextColor;
    }
    public final long getMWidgetExpireTime(){
       return this.mWidgetExpireTime;
    }
    public final PendantLocationParam getMWidgetInitialPosition(){
       return this.mWidgetInitialPosition;
    }
    public final String getMWidgetTaskCompleteText(){
       return this.mWidgetTaskCompleteText;
    }
    public final int getMXPolicy(){
       return this.mXPolicy;
    }
    public int hashCode(){
       OldTaskParams obj = PatchProxy.apply(null, this, OldTaskParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTaskId;
       int i = 0;
       if (obj != null && obj != null) {
          i = obj.hashCode();
       }
       return i;
    }
    public final void setMActivityId(String p0){
       this.mActivityId = p0;
    }
    public final void setMActivityTask(boolean p0){
       this.mActivityTask = p0;
    }
    public final void setMAnimationFramePMs(int p0){
       this.mAnimationFramePMs = p0;
    }
    public final void setMAnimationResourceUrl(String p0){
       this.mAnimationResourceUrl = p0;
    }
    public final void setMBizId(String p0){
       this.mBizId = p0;
    }
    public final void setMCheckValue(int p0){
       this.mCheckValue = p0;
    }
    public final void setMCloseDialogText(String p0){
       this.mCloseDialogText = p0;
    }
    public final void setMCompleteIconUrl(String p0){
       this.mCompleteIconUrl = p0;
    }
    public final void setMCurrentCount(int p0){
       this.mCurrentCount = p0;
    }
    public final void setMDisableStoreProgress(boolean p0){
       this.mDisableStoreProgress = p0;
    }
    public final void setMDisappearFewSeconds(int p0){
       this.mDisappearFewSeconds = p0;
    }
    public final void setMEventId(String p0){
       this.mEventId = p0;
    }
    public final void setMIconUrl(String p0){
       this.mIconUrl = p0;
    }
    public final void setMSectionIntervals(int[] p0){
       this.mSectionIntervals = p0;
    }
    public final void setMShowPages(int[] p0){
       this.mShowPages = p0;
    }
    public final void setMShowPages2(String[] p0){
       this.mShowPages2 = p0;
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
    public final void setMTaskId(String p0){
       this.mTaskId = p0;
    }
    public final void setMTaskInProgressUrl(String p0){
       this.mTaskInProgressUrl = p0;
    }
    public final void setMTextColor(String p0){
       this.mTextColor = p0;
    }
    public final void setMWidgetExpireTime(long p0){
       this.mWidgetExpireTime = p0;
    }
    public final void setMWidgetInitialPosition(PendantLocationParam p0){
       this.mWidgetInitialPosition = p0;
    }
    public final void setMWidgetTaskCompleteText(String p0){
       this.mWidgetTaskCompleteText = p0;
    }
    public final void setMXPolicy(int p0){
       this.mXPolicy = p0;
    }
}
