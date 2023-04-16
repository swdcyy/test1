package j8a.w0;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.m;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;

public final class w0 implements View$OnTouchListener	// class@00297c
{
    public final m b;

    public void w0(m p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       this.b.R8();
       return true;
    }
}
