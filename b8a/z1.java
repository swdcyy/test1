package b8a.z1;
import r7a.g$d;
import com.yxcorp.gifshow.detail.slidev2.presenter.b0;
import java.lang.Object;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.List;
import r7a.h;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;

public final class z1 implements g$d	// class@00041e
{
    public final b0 a;

    public void z1(b0 p0){
       this.a = p0;
    }
    public final void onLongPress(MotionEvent p0){
       z1 ta = this.a;
       Iterator iterator = ta.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       InvalidGestureChecker.a(ta.getContext(), AnswerType.SCALE_GESTURE);
       return;
    }
}
