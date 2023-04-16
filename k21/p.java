package k21.p;
import k51.c;
import k21.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import p91.m;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import z12.c;
import android.content.res.Configuration;
import jv1.a;
import oq5.c;
import jv1.b;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import cc1.a;

public class p extends c	// class@002c75
{
    public k p;
    public View q;
    public View r;
    public View s;
    public ViewGroup t;
    public View u;
    public a0 v;
    public a w;
    public b x;
    public final c y;
    public static String sLivePresenterClassName = "LiveAudienceScreenOrientationBizPresenter";

    public void p(){
       super();
       this.y = new o(this);
    }
    public void E8(){
       p op = p.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op, "3")) {
          return;
       }
       this.p = this.v.a2;
       if (!PatchProxy.applyVoid(objArray, this, op, "5")) {
          String str = this.v.Z2.d();
          if (y.d(this.getActivity()) && !c.a(str)) {
             Configuration uConfigurati = new Configuration();
             uConfigurati.orientation = 2;
             this.w.a(uConfigurati);
          }
       }
       this.x.W0(this.y, true);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "4")) {
          return;
       }
       this.x.Q0(this.y);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0841);
       this.q = m1.f(p0, 0x7f0a208d);
       this.s = m1.f(p0, 0x7f0a0c44);
       this.u = m1.f(p0, 0x7f0a19ca);
       this.t = a.a(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.v = this.q8(a0.class);
       this.w = this.r8("LIVE_SLIDE_SCREEN_ORIENTATION_SERVICE");
       this.x = this.q8(b.class);
       return;
    }
}
