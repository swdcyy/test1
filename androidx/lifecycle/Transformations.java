package androidx.lifecycle.Transformations;
import java.lang.Object;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Transformations$3;
import androidx.lifecycle.Observer;
import z0.a;
import androidx.lifecycle.Transformations$1;
import androidx.lifecycle.Transformations$2;

public class Transformations	// class@0007fc
{

    public void Transformations(){
       super();
    }
    public static LiveData distinctUntilChanged(LiveData p0){
       MediatorLiveData mediatorLive = new MediatorLiveData();
       mediatorLive.addSource(p0, new Transformations$3(mediatorLive));
       return mediatorLive;
    }
    public static LiveData map(LiveData p0,a p1){
       MediatorLiveData mediatorLive = new MediatorLiveData();
       mediatorLive.addSource(p0, new Transformations$1(mediatorLive, p1));
       return mediatorLive;
    }
    public static LiveData switchMap(LiveData p0,a p1){
       MediatorLiveData mediatorLive = new MediatorLiveData();
       mediatorLive.addSource(p0, new Transformations$2(p1, mediatorLive));
       return mediatorLive;
    }
}
