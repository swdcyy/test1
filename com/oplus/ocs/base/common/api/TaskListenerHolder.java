package com.oplus.ocs.base.common.api.TaskListenerHolder;
import android.os.Looper;
import com.oplus.ocs.base.task.TaskImpl;
import com.oplus.ocs.base.common.api.TaskListenerHolder$SuccessNotifier;
import com.oplus.ocs.base.common.api.TaskListenerHolder$FailureNotifier;
import java.lang.Object;
import com.oplus.ocs.base.common.api.TaskListenerHolder$TaskListenerHandler;
import java.lang.String;
import com.oplus.ocs.base.common.constant.CommonStatusCodes;
import android.os.Message;
import android.os.Handler;

public class TaskListenerHolder	// class@000ad6
{
    public final String a;
    public Looper b;
    public TaskImpl c;
    public int d;
    public TaskListenerHolder$SuccessNotifier e;
    public TaskListenerHolder$FailureNotifier f;
    public TaskListenerHolder$TaskListenerHandler g;

    public void TaskListenerHolder(Looper p0,TaskImpl p1,TaskListenerHolder$SuccessNotifier p2,TaskListenerHolder$FailureNotifier p3){
       super();
       this.a = "TaskListenerHolder";
       this.b = p0;
       this.c = p1;
       this.e = p2;
       this.f = p3;
       this.g = new TaskListenerHolder$TaskListenerHandler(this, this.b);
    }
    public static void a(TaskListenerHolder p0,int p1){
       if (!p1) {
          TaskListenerHolder e = p0.e;
          if (e != null) {
             e.notifyListener(p0.c);
             return;
          }
       }else {
          TaskListenerHolder f = p0.f;
          if (f != null) {
             f.onNotifyListenerFailed(p0.c, p1, CommonStatusCodes.getStatusCodeString(p1));
          }
       }
       return;
    }
    public TaskListenerHolder$FailureNotifier getFailureNotifier(){
       return this.f;
    }
    public Looper getLooper(){
       return this.b;
    }
    public TaskListenerHolder$SuccessNotifier getOnTaskSuccessListener(){
       return this.e;
    }
    public TaskImpl getTask(){
       return this.c;
    }
    public void setErrorCode(int p0){
       this.d = p0;
       Message message = Message.obtain();
       message.what = 1;
       message.arg1 = this.d;
       this.g.sendMessage(message);
    }
}
