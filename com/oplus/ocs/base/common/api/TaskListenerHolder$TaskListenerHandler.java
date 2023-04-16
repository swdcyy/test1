package com.oplus.ocs.base.common.api.TaskListenerHolder$TaskListenerHandler;
import com.oplus.ocs.base.common.a;
import com.oplus.ocs.base.common.api.TaskListenerHolder;
import android.os.Looper;
import android.os.Message;
import android.os.Handler;
import java.lang.IllegalArgumentException;

public class TaskListenerHolder$TaskListenerHandler extends a	// class@000ad5
{
    public final TaskListenerHolder this$0;

    public void TaskListenerHolder$TaskListenerHandler(TaskListenerHolder p0,Looper p1){
       this.this$0 = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       super.handleMessage(p0);
       int i = 1;
       if (p0.what == i) {
       }else {
          i = 0;
       }
       if (i) {
          TaskListenerHolder.a(this.this$0, p0.arg1);
          return;
       }else {
          throw new IllegalArgumentException();
       }
    }
}
