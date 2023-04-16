package com.kuaishou.growth.pendant.model.TaskReportResponseV2;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.TaskReportResponseV2$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.growth.pendant.model.CompleteTipConfigV2;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import com.kuaishou.growth.pendant.model.RewardV2;
import java.util.Map;

public class TaskReportResponseV2 implements Serializable	// class@000691
{
    public String mBubbleToast;
    public CompleteTipConfigV2 mCompleteTipConfigV2;
    public int mNewCurrentCount;
    public String mNewTaskId;
    public TaskParamsV2 mNextTaskParamsV2;
    public RewardV2 mRewardV2;
    public boolean mTaskCompleted;
    public Map mTaskRewardMap;
    public String mToast;
    public String mWidgetBubbleMsg;
    public static final TaskReportResponseV2$a Companion;
    public static final long serialVersionUID;

    static {
       TaskReportResponseV2.Companion = new TaskReportResponseV2$a(null);
    }
    public void TaskReportResponseV2(){
       super();
    }
    public final String getMBubbleToast(){
       return this.mBubbleToast;
    }
    public final CompleteTipConfigV2 getMCompleteTipConfigV2(){
       return this.mCompleteTipConfigV2;
    }
    public final int getMNewCurrentCount(){
       return this.mNewCurrentCount;
    }
    public final String getMNewTaskId(){
       return this.mNewTaskId;
    }
    public final TaskParamsV2 getMNextTaskParamsV2(){
       return this.mNextTaskParamsV2;
    }
    public final RewardV2 getMRewardV2(){
       return this.mRewardV2;
    }
    public final boolean getMTaskCompleted(){
       return this.mTaskCompleted;
    }
    public final Map getMTaskRewardMap(){
       return this.mTaskRewardMap;
    }
    public final String getMToast(){
       return this.mToast;
    }
    public final String getMWidgetBubbleMsg(){
       return this.mWidgetBubbleMsg;
    }
    public final void setMBubbleToast(String p0){
       this.mBubbleToast = p0;
    }
    public final void setMCompleteTipConfigV2(CompleteTipConfigV2 p0){
       this.mCompleteTipConfigV2 = p0;
    }
    public final void setMNewCurrentCount(int p0){
       this.mNewCurrentCount = p0;
    }
    public final void setMNewTaskId(String p0){
       this.mNewTaskId = p0;
    }
    public final void setMNextTaskParamsV2(TaskParamsV2 p0){
       this.mNextTaskParamsV2 = p0;
    }
    public final void setMRewardV2(RewardV2 p0){
       this.mRewardV2 = p0;
    }
    public final void setMTaskCompleted(boolean p0){
       this.mTaskCompleted = p0;
    }
    public final void setMTaskRewardMap(Map p0){
       this.mTaskRewardMap = p0;
    }
    public final void setMToast(String p0){
       this.mToast = p0;
    }
    public final void setMWidgetBubbleMsg(String p0){
       this.mWidgetBubbleMsg = p0;
    }
}
