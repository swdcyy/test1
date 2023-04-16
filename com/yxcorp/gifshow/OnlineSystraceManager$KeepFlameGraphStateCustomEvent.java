package com.yxcorp.gifshow.OnlineSystraceManager$KeepFlameGraphStateCustomEvent;
import java.io.Serializable;
import java.lang.Object;

public class OnlineSystraceManager$KeepFlameGraphStateCustomEvent implements Serializable	// class@0012fd
{
    public String error_msg;
    public String pull_log_task_id;
    public int pull_state;
    public String pull_sub_task_id;
    public int pull_subtype;
    public long timestamp;

    public void OnlineSystraceManager$KeepFlameGraphStateCustomEvent(){
       super();
       this.pull_log_task_id = "";
       this.pull_sub_task_id = "";
       this.pull_state = 0;
       this.pull_subtype = 6;
       this.error_msg = "";
       this.timestamp = 0;
    }
}
