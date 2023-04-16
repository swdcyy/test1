package cd9.k;
import com.yxcorp.gifshow.camera.record.h$b;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import bd9.d;
import cd9.k$a;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.app.Activity;
import android.widget.ImageView;
import tg9.b;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Runnable;

public class k extends d0 implements h$b	// class@0005ab
{
    public View o;
    public ImageView p;
    public d q;
    public Handler r;
    public int s;
    public Runnable t;

    public void k(CameraPageType p0,b p1,d p2){
       super(p0, p1);
       this.t = new k$a(this);
       this.q = p2;
       this.r = new Handler(Looper.getMainLooper());
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       this.q.k2(this.s);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.k(p0);
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a36da, 0x7f0a36d9);
       viewStubInfl.d(p0);
       this.o = viewStubInfl.b(0x7f0a36d8);
       this.p = this.e.findViewById(0x7f0a31e2);
       this.d.j().addView(this.o);
       this.d.j().addView(this.p);
       this.d.j().e1(this);
       return;
    }
    public void x(View p0,boolean p1,int p2,int p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, k.class, "3")) {
          return;
       }
       this.s = (p2 + 360) % 360;
       if (p0.getId() == 0x7f0a36d8) {
          this.r.removeCallbacks(this.t);
          this.r.postDelayed(this.t, 100);
       }
       return;
    }
}
