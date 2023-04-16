package j8a.e;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;

public final class e implements View$OnTouchListener	// class@00294e
{
    public final b b;

    public void e(b p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       this.b.S8();
       return true;
    }
}
