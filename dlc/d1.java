package dlc.d1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dlc.b1;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import dlc.c1;
import erd.g;
import crd.b;
import brd.t;
import ekd.m1;

public class d1 extends PresenterV2	// class@00223f
{
    public View p;
    public View q;
    public MilanoContainerEventBus r;

    public void d1(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d1.class, "3")) {
          return;
       }
       this.p.setOnClickListener(new b1(this));
       this.X7(this.r.j.subscribe(new c1(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3023);
       this.q = m1.f(p0, 0x7f0a407e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d1.class, "1")) {
          return;
       }
       this.r = this.q8(MilanoContainerEventBus.class);
       return;
    }
}
