package j8a.h1;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.o;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;

public final class h1 implements View$OnTouchListener	// class@002957
{
    public final o b;

    public void h1(o p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       this.b.R8();
       return true;
    }
}
