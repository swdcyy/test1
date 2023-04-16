package androidx.lifecycle.Transformations$2$1;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations$2;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;

public class Transformations$2$1 implements Observer	// class@0007f9
{
    public final Transformations$2 this$0;

    public void Transformations$2$1(Transformations$2 p0){
       this.this$0 = p0;
       super();
    }
    public void onChanged(Object p0){
       this.this$0.val$result.setValue(p0);
    }
}
