package j8a.r;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.e$b;
import android.view.View;
import java.lang.Object;
import android.view.MotionEvent;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.e;

public final class r implements View$OnTouchListener	// class@002973
{
    public final e$b b;
    public final View c;

    public void r(e$b p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       this.b.b.P8();
       this.c.setOnTouchListener(null);
       return true;
    }
}
