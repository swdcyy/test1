package com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.io.Serializable;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.model.customconfig.TaskCustomConfig;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import java.lang.Number;

public final class TaskCommonParams implements Serializable	// class@000747
{
    public boolean b;
    public boolean c;
    public String mActivityId;
    public boolean mActivityTask;
    public String mBizId;
    public int mCheckValue;
    public int mCurrentProgress;
    public TaskCustomConfig mCustomConfig;
    public boolean mDisableStoreTask;
    public long mExpireTime;
    public boolean mIgnoreLastProgress;
    public boolean mIsFallback;
    public boolean mIsMiniGame;
    public boolean mIsUseBehind;
    public TaskPendantConfig mPendantConfig;
    public int mTargetProgress;
    public String mTaskToken;
    public String mTaskTypeId;
    public static final TaskCommonParams$a Companion;
    public static final long serialVersionUID;

    static {
       TaskCommonParams.Companion = new TaskCommonParams$a(null);
       TaskCommonParams.serialVersionUID = 0x8b47315816b1e0dc;
    }
    public void TaskCommonParams(){
       super();
    }
    public static void getMTaskTypeId$annotations(){
    }
    public static final long getSerialVersionUID(){
       return TaskCommonParams.serialVersionUID;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TaskCommonParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof TaskCommonParams && a.g(this.mTaskToken, p0.mTaskToken))? true: false;
       return b;
    }
    public final String getMActivityId(){
       return this.mActivityId;
    }
    public final boolean getMActivityTask(){
       return this.mActivityTask;
    }
    public final String getMBizId(){
       return this.mBizId;
    }
    public final int getMCheckValue(){
       return this.mCheckValue;
    }
    public final int getMCurrentProgress(){
       return this.mCurrentProgress;
    }
    public final TaskCustomConfig getMCustomConfig(){
       return this.mCustomConfig;
    }
    public final boolean getMDisableStoreTask(){
       return this.mDisableStoreTask;
    }
    public final long getMExpireTime(){
       return this.mExpireTime;
    }
    public final boolean getMIgnoreLastProgress(){
       return this.mIgnoreLastProgress;
    }
    public final boolean getMIsFallback(){
       return this.mIsFallback;
    }
    public final boolean getMIsFromTkError(){
       return this.b;
    }
    public final boolean getMIsMiniGame(){
       return this.mIsMiniGame;
    }
    public final boolean getMIsTK(){
       return this.c;
    }
    public final boolean getMIsUseBehind(){
       return this.mIsUseBehind;
    }
    public final TaskPendantConfig getMPendantConfig(){
       return this.mPendantConfig;
    }
    public final int getMTargetProgress(){
       return this.mTargetProgress;
    }
    public final String getMTaskToken(){
       return this.mTaskToken;
    }
    public final String getMTaskTypeId(){
       return this.mTaskTypeId;
    }
    public int hashCode(){
       TaskCommonParams obj = PatchProxy.apply(null, this, TaskCommonParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTaskToken;
       int i = 0;
       if (obj != null && obj != null) {
          i = obj.hashCode();
       }
       return i;
    }
    public final boolean isTaskComplete(){
       boolean b = (this.mCurrentProgress >= this.mTargetProgress)? true: false;
       return b;
    }
    public final void setMActivityId(String p0){
       this.mActivityId = p0;
    }
    public final void setMActivityTask(boolean p0){
       this.mActivityTask = p0;
    }
    public final void setMBizId(String p0){
       this.mBizId = p0;
    }
    public final void setMCheckValue(int p0){
       this.mCheckValue = p0;
    }
    public final void setMCurrentProgress(int p0){
       this.mCurrentProgress = p0;
    }
    public final void setMCustomConfig(TaskCustomConfig p0){
       this.mCustomConfig = p0;
    }
    public final void setMDisableStoreTask(boolean p0){
       this.mDisableStoreTask = p0;
    }
    public final void setMExpireTime(long p0){
       this.mExpireTime = p0;
    }
    public final void setMIgnoreLastProgress(boolean p0){
       this.mIgnoreLastProgress = p0;
    }
    public final void setMIsFallback(boolean p0){
       this.mIsFallback = p0;
    }
    public final void setMIsFromTkError(boolean p0){
       this.b = p0;
    }
    public final void setMIsMiniGame(boolean p0){
       this.mIsMiniGame = p0;
    }
    public final void setMIsTK(boolean p0){
       this.c = p0;
    }
    public final void setMIsUseBehind(boolean p0){
       this.mIsUseBehind = p0;
    }
    public final void setMPendantConfig(TaskPendantConfig p0){
       this.mPendantConfig = p0;
    }
    public final void setMTargetProgress(int p0){
       this.mTargetProgress = p0;
    }
    public final void setMTaskToken(String p0){
       this.mTaskToken = p0;
    }
    public final void setMTaskTypeId(String p0){
       this.mTaskTypeId = p0;
    }
    public final void update(TaskCommonParams p0){
       TaskCommonParams tmCurrentPro;
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCommonParams.class, "3")) {
          return;
       }
       a.p(p0, "params");
       TaskCommonParams tmTaskToken = this.mTaskToken;
       if (tmTaskToken != null && (a.g(tmTaskToken, p0.mTaskToken) ^ 0x01)) {
          return;
       }
       this.mActivityId = p0.mActivityId;
       this.mBizId = p0.mBizId;
       this.mTaskToken = p0.mTaskToken;
       tmTaskToken = p0.mIgnoreLastProgress;
       if (tmTaskToken == null) {
          tmCurrentPro = this.mCurrentProgress;
          if (tmCurrentPro < p0.mTargetProgress) {
          label_0037 :
             this.mCurrentProgress = tmCurrentPro;
             this.mTargetProgress = p0.mTargetProgress;
             this.mIgnoreLastProgress = tmTaskToken;
             this.mExpireTime = p0.mExpireTime;
             this.mTaskTypeId = p0.mTaskTypeId;
             this.mCheckValue = p0.mCheckValue;
             this.mDisableStoreTask = p0.mDisableStoreTask;
             this.mIsUseBehind = p0.mIsUseBehind;
             this.mPendantConfig = p0.mPendantConfig;
             this.mCustomConfig = p0.mCustomConfig;
             this.mActivityTask = p0.mActivityTask;
             return;
          }
       }
       tmCurrentPro = p0.mCurrentProgress;
       goto label_0037 ;
    }
}
