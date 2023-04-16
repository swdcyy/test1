package com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import java.io.Serializable;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.growth.taskcenter.model.Reward;
import java.lang.String;

public final class TaskReportResponse implements Serializable	// class@000750
{
    public Reward mReward;
    public boolean mTaskCompleted;
    public String mToast;
    public static final TaskReportResponse$a Companion;
    public static final long serialVersionUID;

    static {
       TaskReportResponse.Companion = new TaskReportResponse$a(null);
       TaskReportResponse.serialVersionUID = 0x7cec5f46403c8785;
    }
    public void TaskReportResponse(){
       super();
    }
    public static final long getSerialVersionUID(){
       return TaskReportResponse.serialVersionUID;
    }
    public final Reward getMReward(){
       return this.mReward;
    }
    public final boolean getMTaskCompleted(){
       return this.mTaskCompleted;
    }
    public final String getMToast(){
       return this.mToast;
    }
    public final void setMReward(Reward p0){
       this.mReward = p0;
    }
    public final void setMTaskCompleted(boolean p0){
       this.mTaskCompleted = p0;
    }
    public final void setMToast(String p0){
       this.mToast = p0;
    }
}
