package hy9.f;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.detail.common.information.interestadjust.d;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.Button;

public final class f implements Observer	// class@002737
{
    public final d b;

    public void f(d p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       this.b.n.setText(p0);
    }
}
