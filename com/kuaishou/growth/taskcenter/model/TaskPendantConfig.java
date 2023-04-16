package com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import java.io.Serializable;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.growth.taskcenter.model.TaskUIConfig;

public final class TaskPendantConfig implements Serializable	// class@00074e
{
    public int mClickPolicy;
    public String mCompleteLinkUrl;
    public int mDisappearSecondsIfComplete;
    public String mInProgressLinkUrl;
    public boolean mOnlyTk;
    public String[] mShowPage2List;
    public int[] mShowPageList;
    public String mTkBundleId;
    public String mTkExtraParams;
    public TaskUIConfig mUiConfig;
    public static final TaskPendantConfig$a Companion;
    public static final long serialVersionUID;

    static {
       TaskPendantConfig.Companion = new TaskPendantConfig$a(null);
       TaskPendantConfig.serialVersionUID = 0x646bb9765f6d5c84;
    }
    public void TaskPendantConfig(){
       super();
    }
    public static void getMClickPolicy$annotations(){
    }
    public static final long getSerialVersionUID(){
       return TaskPendantConfig.serialVersionUID;
    }
    public final int getMClickPolicy(){
       return this.mClickPolicy;
    }
    public final String getMCompleteLinkUrl(){
       return this.mCompleteLinkUrl;
    }
    public final int getMDisappearSecondsIfComplete(){
       return this.mDisappearSecondsIfComplete;
    }
    public final String getMInProgressLinkUrl(){
       return this.mInProgressLinkUrl;
    }
    public final boolean getMOnlyTk(){
       return this.mOnlyTk;
    }
    public final String[] getMShowPage2List(){
       return this.mShowPage2List;
    }
    public final int[] getMShowPageList(){
       return this.mShowPageList;
    }
    public final String getMTkBundleId(){
       return this.mTkBundleId;
    }
    public final String getMTkExtraParams(){
       return this.mTkExtraParams;
    }
    public final TaskUIConfig getMUiConfig(){
       return this.mUiConfig;
    }
    public final void setMClickPolicy(int p0){
       this.mClickPolicy = p0;
    }
    public final void setMCompleteLinkUrl(String p0){
       this.mCompleteLinkUrl = p0;
    }
    public final void setMDisappearSecondsIfComplete(int p0){
       this.mDisappearSecondsIfComplete = p0;
    }
    public final void setMInProgressLinkUrl(String p0){
       this.mInProgressLinkUrl = p0;
    }
    public final void setMOnlyTk(boolean p0){
       this.mOnlyTk = p0;
    }
    public final void setMShowPage2List(String[] p0){
       this.mShowPage2List = p0;
    }
    public final void setMShowPageList(int[] p0){
       this.mShowPageList = p0;
    }
    public final void setMTkBundleId(String p0){
       this.mTkBundleId = p0;
    }
    public final void setMTkExtraParams(String p0){
       this.mTkExtraParams = p0;
    }
    public final void setMUiConfig(TaskUIConfig p0){
       this.mUiConfig = p0;
    }
}
