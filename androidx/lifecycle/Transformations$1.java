package androidx.lifecycle.Transformations$1;
import androidx.lifecycle.Observer;
import androidx.lifecycle.MediatorLiveData;
import z0.a;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;

public final class Transformations$1 implements Observer	// class@0007f8
{
    public final a val$mapFunction;
    public final MediatorLiveData val$result;

    public void Transformations$1(MediatorLiveData p0,a p1){
       this.val$result = p0;
       this.val$mapFunction = p1;
       super();
    }
    public void onChanged(Object p0){
       this.val$result.setValue(this.val$mapFunction.apply(p0));
    }
}
