package dlc.x;
import android.view.View$OnTouchListener;
import dlc.z;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Runnable;
import android.os.Handler;

public final class x implements View$OnTouchListener	// class@00227b
{
    public final z b;

    public void x(z p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       x tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == null || (tb.getActivity() != null && !tb.getActivity().isFinishing())) {
          tb.y.removeCallbacks(tb.x);
          tb.P8();
       }
    label_0022 :
       return false;
    }
}
