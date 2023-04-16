package androidx.lifecycle.Transformations$2;
import androidx.lifecycle.Observer;
import z0.a;
import androidx.lifecycle.MediatorLiveData;
import java.lang.Object;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations$2$1;

public final class Transformations$2 implements Observer	// class@0007fa
{
    public LiveData mSource;
    public final MediatorLiveData val$result;
    public final a val$switchMapFunction;

    public void Transformations$2(a p0,MediatorLiveData p1){
       this.val$switchMapFunction = p0;
       this.val$result = p1;
       super();
    }
    public void onChanged(Object p0){
       p0 = this.val$switchMapFunction.apply(p0);
       Transformations$2 tmSource = this.mSource;
       if (tmSource == p0) {
          return;
       }
       if (tmSource != null) {
          this.val$result.removeSource(tmSource);
       }
       this.mSource = p0;
       if (p0 != null) {
          this.val$result.addSource(p0, new Transformations$2$1(this));
       }
       return;
    }
}
