package j8a.f;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Boolean;
import im8.f;

public final class f implements View$OnTouchListener	// class@002952
{
    public final b b;

    public void f(b p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       f tb = this.b;
       tb.B = true;
       tb.u.set(Boolean.FALSE);
       tb.v.set(Boolean.TRUE);
       tb.C = false;
       return false;
    }
}
