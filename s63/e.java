package s63.e;
import jz6.a;
import android.content.Context;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.app.Dialog;
import android.view.Window;
import android.view.View;

public class e extends a	// class@0040f0
{
    public a b;

    public void e(Context p0,int p1,a p2){
       a.p(p0, "context");
       super(p0, p1);
       this.b = p2;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "event");
       if (this.isShowing()) {
          if (p0.getAction() == 1) {
             obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                b = (int)p0.getX();
                int i = (int)p0.getY();
                Window window = this.getWindow();
                if (window != null) {
                   View decorView = window.getDecorView();
                   if (decorView != null) {
                      a.o(decorView, "window?.decorView ?: return false");
                      if (b >= 0 && (i >= 0 && (b > decorView.getWidth() || i > decorView.getHeight()))) {
                         b = true;
                      }
                   }
                }
                b = false;
             }
             if (b) {
             label_006e :
                e tb = this.b;
                if (tb != null && tb.invoke().booleanValue() == true) {
                   return true;
                }
             }
          }
          if (p0.getAction() == 4) {
             goto label_006e ;
          }
       }
    label_007f :
       return super.onTouchEvent(p0);
    }
}
