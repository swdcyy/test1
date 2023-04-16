package hy9.g;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.detail.common.information.interestadjust.d;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.Button;

public final class g implements Observer	// class@002738
{
    public final d b;

    public void g(d p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       this.b.m.setText(p0);
    }
}
