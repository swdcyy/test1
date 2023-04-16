package androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ProcessLifecycleOwner$1;
import androidx.lifecycle.ProcessLifecycleOwner$2;
import android.content.Context;
import java.lang.Runnable;
import android.os.Handler;
import androidx.lifecycle.Lifecycle$Event;
import android.app.Application;
import androidx.lifecycle.ProcessLifecycleOwner$3;
import android.app.Application$ActivityLifecycleCallbacks;
import androidx.lifecycle.Lifecycle;

public class ProcessLifecycleOwner implements LifecycleOwner	// class@000256
{
    public Runnable mDelayedPauseRunnable;
    public Handler mHandler;
    public ReportFragment$ActivityInitializationListener mInitializationListener;
    public boolean mPauseSent;
    public final LifecycleRegistry mRegistry;
    public int mResumedCounter;
    public int mStartedCounter;
    public boolean mStopSent;
    public static final ProcessLifecycleOwner sInstance;

    static {
       ProcessLifecycleOwner.sInstance = new ProcessLifecycleOwner();
    }
    public void ProcessLifecycleOwner(){
       super();
       this.mStartedCounter = 0;
       this.mResumedCounter = 0;
       this.mPauseSent = true;
       this.mStopSent = true;
       this.mRegistry = new LifecycleRegistry(this);
       this.mDelayedPauseRunnable = new ProcessLifecycleOwner$1(this);
       this.mInitializationListener = new ProcessLifecycleOwner$2(this);
    }
    public static LifecycleOwner get(){
       return ProcessLifecycleOwner.sInstance;
    }
    public static void init(Context p0){
       ProcessLifecycleOwner.sInstance.attach(p0);
    }
    public void activityPaused(){
       int i = this.mResumedCounter - 1;
       this.mResumedCounter = i;
       if (!i) {
          this.mHandler.postDelayed(this.mDelayedPauseRunnable, 700);
       }
       return;
    }
    public void activityResumed(){
       int i = 1;
       int i1 = this.mResumedCounter + i;
       this.mResumedCounter = i1;
       if (i1 == i) {
          if (this.mPauseSent != null) {
             this.mRegistry.handleLifecycleEvent(Lifecycle$Event.ON_RESUME);
             this.mPauseSent = false;
          }else {
             this.mHandler.removeCallbacks(this.mDelayedPauseRunnable);
          }
       }
       return;
    }
    public void activityStarted(){
       int i = 1;
       int i1 = this.mStartedCounter + i;
       this.mStartedCounter = i1;
       if (i1 == i && this.mStopSent != null) {
          this.mRegistry.handleLifecycleEvent(Lifecycle$Event.ON_START);
          this.mStopSent = false;
       }
       return;
    }
    public void activityStopped(){
       this.mStartedCounter = this.mStartedCounter - 1;
       this.dispatchStopIfNeeded();
    }
    public void attach(Context p0){
       this.mHandler = new Handler();
       this.mRegistry.handleLifecycleEvent(Lifecycle$Event.ON_CREATE);
       p0.getApplicationContext().registerActivityLifecycleCallbacks(new ProcessLifecycleOwner$3(this));
    }
    public void dispatchPauseIfNeeded(){
       if (this.mResumedCounter == null) {
          this.mPauseSent = true;
          this.mRegistry.handleLifecycleEvent(Lifecycle$Event.ON_PAUSE);
       }
       return;
    }
    public void dispatchStopIfNeeded(){
       if (this.mStartedCounter == null && this.mPauseSent != null) {
          this.mRegistry.handleLifecycleEvent(Lifecycle$Event.ON_STOP);
          this.mStopSent = true;
       }
       return;
    }
    public Lifecycle getLifecycle(){
       return this.mRegistry;
    }
}
