package dlc.z;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dlc.z$a;
import dlc.y;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import vy6.a;
import sy6.a;
import android.text.TextPaint;
import android.widget.TextView;
import java.lang.Runnable;
import ekd.m1;
import java.lang.Boolean;

public class z extends PresenterV2	// class@002280
{
    public ViewGroup p;
    public View q;
    public TextView r;
    public View s;
    public View t;
    public a u;
    public boolean v;
    public final a w;
    public Runnable x;
    public Handler y;

    public void z(){
       super();
       this.w = new z$a(this);
       this.x = new y(this);
       this.y = new Handler(Looper.getMainLooper());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, z.class, "3")) {
          return;
       }
       this.p = this.getActivity().findViewById(0x1020002);
       this.u.E(this.w);
       this.r.getPaint().setFakeBoldText(true);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, z.class, "4")) {
          return;
       }
       this.u.g0(this.w);
       this.y.removeCallbacks(this.x);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, z.class, "5")) {
          return;
       }
       this.q.setVisibility(8);
       z tt = this.t;
       if (tt != null) {
          this.p.removeView(tt);
          this.t = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a406f);
       this.r = m1.f(p0, 0x7f0a4071);
       this.s = m1.f(p0, 0x7f0a4070);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       this.v = this.r8("USE_BLACK_TIP_GUIDE").booleanValue();
       this.u = this.q8(a.class);
       return;
    }
}
