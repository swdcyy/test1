package bwc.i;
import androidx.lifecycle.Observer;
import bwc.l;
import java.lang.Object;
import android.widget.Button;
import com.yxcorp.gifshow.v3.mixed.model.b;

public final class i implements Observer	// class@0004ac
{
    public final l b;

    public void i(l p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       p0 = this.b;
       p0.p.setClickable(true);
       p0.v = false;
    }
}
