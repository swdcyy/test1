package com.kuaishou.growth.pendant.model.TaskRewardResponseV2;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.TaskRewardResponseV2$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import com.kuaishou.growth.pendant.model.RewardPopupV2;
import com.kuaishou.growth.pendant.model.RewardV2;

public final class TaskRewardResponseV2 implements Serializable	// class@000693
{
    public TaskParamsV2 mNextTaskParamsV2;
    public RewardPopupV2 mRewardPopupV2;
    public boolean mRewardSuccess;
    public RewardV2 mRewardV2;
    public static final TaskRewardResponseV2$a Companion;
    public static final long serialVersionUID;

    static {
       TaskRewardResponseV2.Companion = new TaskRewardResponseV2$a(null);
    }
    public void TaskRewardResponseV2(){
       super();
    }
    public final TaskParamsV2 getMNextTaskParamsV2(){
       return this.mNextTaskParamsV2;
    }
    public final RewardPopupV2 getMRewardPopupV2(){
       return this.mRewardPopupV2;
    }
    public final boolean getMRewardSuccess(){
       return this.mRewardSuccess;
    }
    public final RewardV2 getMRewardV2(){
       return this.mRewardV2;
    }
    public final void setMNextTaskParamsV2(TaskParamsV2 p0){
       this.mNextTaskParamsV2 = p0;
    }
    public final void setMRewardPopupV2(RewardPopupV2 p0){
       this.mRewardPopupV2 = p0;
    }
    public final void setMRewardSuccess(boolean p0){
       this.mRewardSuccess = p0;
    }
    public final void setMRewardV2(RewardV2 p0){
       this.mRewardV2 = p0;
    }
}
