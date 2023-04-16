package androidx.lifecycle.MediatorLiveData$Source;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.lang.Object;

public class MediatorLiveData$Source implements Observer	// class@0007e5
{
    public final LiveData mLiveData;
    public final Observer mObserver;
    public int mVersion;

    public void MediatorLiveData$Source(LiveData p0,Observer p1){
       super();
       this.mVersion = -1;
       this.mLiveData = p0;
       this.mObserver = p1;
    }
    public void onChanged(Object p0){
       if (this.mVersion != this.mLiveData.getVersion()) {
          this.mVersion = this.mLiveData.getVersion();
          this.mObserver.onChanged(p0);
       }
       return;
    }
    public void plug(){
       this.mLiveData.observeForever(this);
    }
    public void unplug(){
       this.mLiveData.removeObserver(this);
    }
}
