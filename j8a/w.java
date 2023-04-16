package j8a.w;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import uw9.o;
import java.lang.String;
import q87.c;

public final class w implements View$OnTouchListener	// class@00297d
{
    public final h b;

    public void w(h p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       w tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       o.C().w("SlidePlayLeftSlideGuide", "guide layout touch", objArray);
       tb.R8();
       return true;
    }
}
