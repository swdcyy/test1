package ekd.b;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import ekd.b$a;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import hkd.b;
import java.lang.String;
import java.util.concurrent.ThreadFactory;
import android.os.SystemClock;
import java.lang.Runnable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;

public class b	// class@000d2a
{
    public ScheduledThreadPoolExecutor mExecutor;
    public Handler mHandler;
    public long mHistoryElapse;
    public long mInterval;
    public Runnable mRunnable;
    public long mStartTime;

    public void b(long p0){
       super();
       this.mHandler = new Handler(Looper.getMainLooper());
       this.mRunnable = new b$a(this);
       this.mStartTime = 0;
       this.mInterval = p0;
    }
    public final void buildExecutor(){
       ScheduledThreadPoolExecutor scheduledThr = new ScheduledThreadPoolExecutor(1, new b("accurate-timer"));
       this.mExecutor = scheduledThr;
       scheduledThr.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
       this.mExecutor.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
    }
    public long getElapse(){
       if (!this.mStartTime - null) {
          return this.mHistoryElapse;
       }
       return ((SystemClock.elapsedRealtime() - this.mStartTime) + this.mHistoryElapse);
    }
    public boolean isAlive(){
       boolean b = (this.mExecutor != null)? true: false;
       return b;
    }
    public void pause(){
       this.mHistoryElapse = this.mHistoryElapse + (SystemClock.elapsedRealtime() - this.mStartTime);
       this.mStartTime = 0;
    }
    public Object prepareData(long p0){
       return null;
    }
    public void resume(){
       if (!this.mStartTime) {
          this.mStartTime = SystemClock.elapsedRealtime();
       }
       return;
    }
    public void run(long p0,Object p1){
    }
    public void start(){
       if (this.mExecutor != null) {
          this.mHandler.removeCallbacksAndMessages(null);
          this.mExecutor.remove(this.mRunnable);
          this.mExecutor.shutdown();
       }
       this.buildExecutor();
       this.mStartTime = SystemClock.elapsedRealtime();
       this.mExecutor.scheduleAtFixedRate(this.mRunnable, 50, this.mInterval, TimeUnit.MILLISECONDS);
       return;
    }
    public void stop(){
       this.mStartTime = 0;
       this.mHistoryElapse = 0;
       if (this.mExecutor != null) {
          this.mHandler.removeCallbacksAndMessages(null);
          this.mExecutor.remove(this.mRunnable);
          this.mExecutor.shutdown();
          this.mExecutor = null;
       }
       return;
    }
}
