package g0.j;
import g0.i;
import aegon.chrome.base.task.e;
import android.os.Handler;
import g0.n;
import java.lang.String;
import aegon.chrome.base.task.e$a;
import aegon.chrome.base.task.f;
import K.S;
import java.lang.Boolean;
import android.os.Looper;
import java.lang.Thread;
import java.lang.Runnable;
import android.os.Message;

public class j extends e implements i	// class@00202a
{
    public final Handler m;
    public final boolean n;
    public static final boolean o;

    public void j(Handler p0,n p1){
       super(p1, "SingleThreadTaskRunnerImpl", 2);
       this.m = null;
       this.n = false;
    }
    public boolean b(){
       Boolean uBoolean;
       boolean b;
       e tf = this.f;
       _monitor_enter(tf);
       this.f();
       _monitor_exit(tf);
       if (!this.d) {
          uBoolean = null;
       }else {
          f.e();
          uBoolean = Boolean.valueOf(S.MdFi6sVQ(this.d));
       }
       if (uBoolean != null) {
          return uBoolean.booleanValue();
       }else if(this.m.getLooper().getThread() == Thread.currentThread()){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public void h(){
       j tm = this.m;
       if (tm == null) {
          return;
       }
       if (this.n != null) {
          Message message = Message.obtain(tm, this.e);
          message.setAsynchronous(true);
          this.m.sendMessageAtFrontOfQueue(message);
       }else {
          tm.post(this.e);
       }
       return;
    }
}
