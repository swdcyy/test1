package androidx.lifecycle.Transformations$3;
import androidx.lifecycle.Observer;
import androidx.lifecycle.MediatorLiveData;
import java.lang.Object;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public final class Transformations$3 implements Observer	// class@0007fb
{
    public boolean mFirstTime;
    public final MediatorLiveData val$outputLiveData;

    public void Transformations$3(MediatorLiveData p0){
       this.val$outputLiveData = p0;
       super();
       this.mFirstTime = true;
    }
    public void onChanged(Object p0){
       Object value = this.val$outputLiveData.getValue();
       if (this.mFirstTime == null && (value != null || (p0 != null || (value != null && !value.equals(p0))))) {
          this.mFirstTime = false;
          this.val$outputLiveData.setValue(p0);
       }
       return;
    }
}
