package b8a.i0;
import r7a.b$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.k;
import java.lang.Object;
import android.view.MotionEvent;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import android.view.View;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import java.lang.Math;
import xx9.a;
import uw9.o;
import java.lang.String;
import q87.c;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import com.yxcorp.gifshow.entity.QPhoto;

public final class i0 implements b$a	// class@0003ae
{
    public final k a;

    public void i0(k p0){
       this.a = p0;
    }
    public final boolean onTouchEvent(MotionEvent p0){
       i0 ta = this.a;
       InvalidGestureChecker.a(ta.getContext(), AnswerType.SCALE_GESTURE);
       String str = 1;
       if (p0.getPointerCount() != str || (ta.L != null || (ta.q.getScaleView() != null && !ta.q.getScaleView().getScaleX() - 0x3f800000))) {
          int action = p0.getAction();
          if (action) {
             if (action != str) {
                if (action != 2) {
                   if (action == 3) {
                   label_0069 :
                      if (ta.J != null && ta.s.c()) {
                         Object[] objArray = new Object[false];
                         o.C().w("NasaScaleClean", "手指滑动退出清屏", objArray);
                         ta.s.d(new ChangeScreenVisibleEvent(ta.r, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
                         ta.V8(false);
                      }
                      ta.K = false;
                      ta.J = false;
                   }
                }else if(ta.K != null){
                   if (Math.abs((p0.getX() - ta.H)) - 0x42c80000 <= 0 && Math.abs((p0.getY() - ta.I)) - 0x42c80000 <= 0) {
                      str = false;
                   }
                   ta.J = str;
                }
             }else {
                goto label_0069 ;
             }
          }else {
             ta.J = false;
             ta.K = str;
             ta.H = p0.getX();
             ta.I = p0.getY();
          }
       }
    label_00a8 :
       return false;
    }
}
