package b8a.y1;
import r7a.g$c;
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

public final class y1 implements g$c	// class@00041a
{
    public final b0 a;

    public void y1(b0 p0){
       this.a = p0;
    }
    public final void a(MotionEvent p0,boolean p1,int p2){
       y1 ta = this.a;
       Iterator iterator = ta.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1, p2);
       }
       InvalidGestureChecker.a(ta.getContext(), AnswerType.SCALE_GESTURE);
       return;
    }
}
