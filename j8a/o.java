package j8a.o;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.d;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;

public final class o implements View$OnTouchListener	// class@00296d
{
    public final d b;

    public void o(d p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       this.b.R8();
       return true;
    }
}
