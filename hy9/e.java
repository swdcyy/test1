package hy9.e;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.detail.common.information.interestadjust.d;
import java.lang.Object;
import java.lang.Boolean;
import android.animation.Animator;

public final class e implements Observer	// class@002736
{
    public final d b;

    public void e(d p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       e tb = this.b;
       p0 = tb.p;
       if (p0 != null && p0.isRunning()) {
          tb.p.cancel();
          tb.p.removeAllListeners();
       }
       return;
    }
}
