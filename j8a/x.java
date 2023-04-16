package j8a.x;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import uw9.o;
import java.lang.String;
import q87.c;
import java.lang.Boolean;
import im8.f;

public final class x implements View$OnTouchListener	// class@00297f
{
    public final h b;

    public void x(h p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       x tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       o.C().w("SlidePlayLeftSlideGuide", "guide mask layout touch", objArray);
       tb.E = true;
       tb.t.set(Boolean.FALSE);
       tb.u.set(Boolean.TRUE);
       tb.F = false;
       return 0;
    }
}
