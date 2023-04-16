package com.kwai.yoda.session.logger.batch.HybridBatchDataItem;
import com.kwai.yoda.session.logger.HybridDataItem;
import java.lang.String;
import java.lang.Boolean;

public class HybridBatchDataItem extends HybridDataItem	// class@0012d4
{
    public String eventTriggerSource;
    public Boolean taskEvent;
    public String taskIdentifier;
    public String taskStatus;

    public void HybridBatchDataItem(){
       super();
    }
    public final String getEventTriggerSource(){
       return this.eventTriggerSource;
    }
    public final Boolean getTaskEvent(){
       return this.taskEvent;
    }
    public final String getTaskIdentifier(){
       return this.taskIdentifier;
    }
    public final String getTaskStatus(){
       return this.taskStatus;
    }
    public final void setEventTriggerSource(String p0){
       this.eventTriggerSource = p0;
    }
    public final void setTaskEvent(Boolean p0){
       this.taskEvent = p0;
    }
    public final void setTaskIdentifier(String p0){
       this.taskIdentifier = p0;
    }
    public final void setTaskStatus(String p0){
       this.taskStatus = p0;
    }
}
