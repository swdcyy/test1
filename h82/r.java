package h82.r;
import androidx.lifecycle.Observer;
import h82.z;
import java.lang.Object;
import java.lang.Integer;
import h82.b0;
import androidx.lifecycle.MutableLiveData;

public final class r implements Observer	// class@002ce9
{
    public final z b;

    public void r(z p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       r tb = this.b;
       tb.Q.e = p0.intValue();
       tb.R.setValue(tb.Q);
    }
}
