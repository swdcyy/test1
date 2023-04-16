package j8a.m0;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;

public final class m0 implements View$OnTouchListener	// class@002965
{
    public final k b;

    public void m0(k p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       this.b.V8();
       return true;
    }
}
