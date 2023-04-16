package sd5.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Runnable;

public abstract class b	// class@003b81
{
    public final QPhoto mPhoto;

    public void b(QPhoto p0){
       super();
       this.mPhoto = p0;
    }
    public abstract void clear();
    public abstract long getAutoHideControllerDelay();
    public abstract long getCurrentPosition();
    public abstract long getDuration();
    public abstract boolean isPlaying();
    public abstract boolean isPrepared();
    public abstract void onStartTouchProgress();
    public abstract void onStopTouchProgress();
    public abstract void pausePlayer();
    public abstract void seekAndRun(long p0,Runnable p1);
    public abstract void seekTo(long p0);
    public abstract void startPlayer();
}
