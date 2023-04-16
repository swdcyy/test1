package h82.s;
import androidx.lifecycle.Observer;
import h82.z;
import java.lang.Object;
import java.lang.Integer;
import h82.b0;
import androidx.lifecycle.MutableLiveData;

public final class s implements Observer	// class@002cea
{
    public final z b;

    public void s(z p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       s tb = this.b;
       tb.Q.f = p0.intValue();
       tb.R.setValue(tb.Q);
    }
}
