package androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import y0.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.MediatorLiveData$Source;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Iterator;
import y0.b$e;
import java.util.Map$Entry;

public class MediatorLiveData extends MutableLiveData	// class@0007e6
{
    public b mSources;

    public void MediatorLiveData(){
       super();
       this.mSources = new b();
    }
    public void addSource(LiveData p0,Observer p1){
       MediatorLiveData$Source source = new MediatorLiveData$Source(p0, p1);
       MediatorLiveData$Source source1 = this.mSources.p(p0, source);
       if (source1 != null && source1.mObserver != p1) {
          throw new IllegalArgumentException("This source was already added with the different observer");
       }
       if (source1 != null) {
          return;
       }
       if (this.hasActiveObservers()) {
          source.plug();
       }
       return;
    }
    public void onActive(){
       Iterator iterator = this.mSources.iterator();
       Iterator iterator1 = iterator;
       while (iterator1.hasNext()) {
          iterator1.next().getValue().plug();
       }
       return;
    }
    public void onInactive(){
       Iterator iterator = this.mSources.iterator();
       Iterator iterator1 = iterator;
       while (iterator1.hasNext()) {
          iterator1.next().getValue().unplug();
       }
       return;
    }
    public void removeSource(LiveData p0){
       MediatorLiveData$Source source = this.mSources.q(p0);
       if (source != null) {
          source.unplug();
       }
       return;
    }
}
