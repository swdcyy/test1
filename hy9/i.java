package hy9.i;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.detail.common.information.interestadjust.d;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;

public final class i implements Observer	// class@00273a
{
    public final d b;

    public void i(d p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       this.b.l.setText(p0);
    }
}
