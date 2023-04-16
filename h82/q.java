package h82.q;
import androidx.lifecycle.Observer;
import h82.z;
import java.lang.Object;
import java.lang.Integer;
import h82.b0;
import androidx.lifecycle.MutableLiveData;

public final class q implements Observer	// class@002ce7
{
    public final z b;

    public void q(z p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       q tb = this.b;
       tb.Q.d = p0.intValue();
       p0.g = tb.c9();
       tb.k9();
       tb.R.setValue(tb.Q);
    }
}
