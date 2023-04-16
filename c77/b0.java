package c77.b0;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$b;
import c77.c0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.live.gzone.tab.page.a;
import android.view.ViewGroup;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;

public class b0 implements KwaiYodaWebView$b	// class@0004f5
{
    public final c0 a;

    public void b0(c0 p0){
       this.a = p0;
       super();
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(b0.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, b0.class, "2")) {
          return;
       }
       b0 ta = this.a;
       if (ta.E == 2 && (ta.x != null && ta.K0())) {
          ta = this.a;
          ta.C = p3;
          ta.D = p2;
          ta.v.setEnabled(p3);
          ta = this.a;
          ta.C(p2, ta.B);
       }
    label_0047 :
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       b0 obj = PatchProxy.applyOneRefs(p0, this, b0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int actionMasked = p0.getActionMasked();
       obj = this.a;
       obj.E = actionMasked;
       if (!actionMasked) {
          obj.D = false;
          obj.C = false;
          obj.v.setEnabled(false);
          b0 ta = this.a;
          ta.C(ta.D, ta.B);
          this.a.w.requestDisallowInterceptTouchEvent(true);
       }
       return false;
    }
}
