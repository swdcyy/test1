package bh9.f;
import java.lang.Runnable;
import bh9.r;
import com.yxcorp.gifshow.widget.ControlSpeedLayout;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import android.view.View;
import android.app.Activity;
import zb9.s;
import zb9.s$a;
import com.yxcorp.gifshow.camera.record.base.b;
import android.widget.FrameLayout;
import com.yxcorp.utility.n;
import java.lang.Integer;

public final class f implements Runnable	// class@00049b
{
    public final r b;
    public final ControlSpeedLayout c;

    public void f(r p0,ControlSpeedLayout p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       int y;
       f tb = this.b;
       f tc = this.c;
       View view = tb.e.findViewById(R.id.camera_scroll_snapshot_tab_container);
       View view1 = tb.e.findViewById(R.id.camera_time_tab_scroll_container);
       s os = tb.d.d(s.d.a());
       if (os.a()) {
          y = r.y;
       }else if(os.b != null){
          y = r.z;
       }else if(view != null && !view.getVisibility()){
          y = r.w;
       }else if(view1 != null && !view1.getVisibility()){
          y = r.w;
       }else if(tb.a2()){
          y = r.x;
       }else {
          y = 0;
       }
       float f = (float)y;
       if (tc.getTranslationY() - f) {
          tc.setTranslationY(f);
          tc.setTag(R.id.view_screen_top, Integer.valueOf((n.p(tc)[1] + y)));
       }
       return;
    }
}
