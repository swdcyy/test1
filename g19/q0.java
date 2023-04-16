package g19.q0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g19.q0$a;
import nsd.u;
import java.util.ArrayList;
import g19.q0$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import jta.c;
import g19.l;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import java.lang.Float;
import java.util.Iterator;
import java.lang.Iterable;
import android.view.View;
import im8.f;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController;
import msd.a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController$DefaultImpls;
import ekd.m1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import n49.o;

public final class q0 extends PresenterV2	// class@0023d8
{
    public View A;
    public View B;
    public final List C;
    public boolean D;
    public final c E;
    public QPhoto p;
    public BaseFragment q;
    public SlidePlayViewModel r;
    public l s;
    public f t;
    public o u;
    public View v;
    public View w;
    public View x;
    public View y;
    public View z;
    public static final q0$a F;

    static {
       q0.F = new q0$a(null);
    }
    public void q0(){
       super();
       this.C = new ArrayList();
       this.D = true;
       this.E = new q0$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "3")) {
          return;
       }
       q0 ts = this.s;
       if (ts == null) {
          a.S("mSidebarStatusHelper");
       }
       ts.a(this.E);
       ts = this.q;
       if (ts == null) {
          a.S("mFragment");
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(ts.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
       this.r = slidePlayVie;
       ts = this.C;
       ts.add(this.v);
       ts.add(this.w);
       ts.add(this.x);
       ts.add(this.y);
       ts.add(this.z);
       ts.add(this.A);
       ts.add(this.B);
       ts = this.r;
       if (ts == null) {
          a.S("mSlidePlayViewModel");
       }
       if (ts.r()) {
          this.P8(0);
       }else {
          this.P8(0x3f800000);
       }
       return;
    }
    public void J8(){
       q0 oq0 = q0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq0, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oq0, "7")) {
          this.P8(0x3f800000);
          this.D = true;
       }
       this.C.clear();
       oq0 = this.s;
       if (oq0 == null) {
          a.S("mSidebarStatusHelper");
       }
       oq0.c(this.E);
       return;
    }
    public final void P8(float p0){
       q0 tt;
       q0 oq0 = q0.class;
       if (PatchProxy.isSupport(oq0) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oq0, "5")) {
          return;
       }
       if (!PatchProxy.isSupport(oq0) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oq0, "6")) {
          Iterator iterator = this.C.iterator();
          while (iterator.hasNext()) {
             View view = iterator.next();
             if (view != null) {
                view.setAlpha(p0);
             }
          }
          String str = "mSideWindowCleanController";
          if (!p0) {
             if (this.D != null) {
                tt = this.t;
                if (tt == null) {
                   a.S(str);
                }
                Object obj = tt.get();
                if (obj != null) {
                   ScreenCleanController$DefaultImpls.a(obj, false, 4, null, 4, null);
                }
                this.D = false;
             }
          }else if(this.D == null){
             tt = this.t;
             if (tt == null) {
                a.S(str);
             }
             ScreenCleanController screenCleanC = tt.get();
             if (screenCleanC != null) {
                ScreenCleanController$DefaultImpls.b(screenCleanC, false, null, 2, null);
             }
             this.D = true;
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a111f);
       this.w = m1.f(p0, 0x7f0a016a);
       this.x = m1.f(p0, 0x7f0a0175);
       this.y = m1.f(p0, 0x7f0a3a09);
       this.z = m1.f(p0, 0x7f0a3ea3);
       this.A = m1.f(p0, 0x7f0a3ea7);
       this.B = m1.f(p0, 0x7f0a39c5);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.r8("NASA_SIDEBAR_STATUS");
       a.o(obj, "inject\(AccessIds.NASA_SIDEBAR_STATUS\)");
       this.s = obj;
       obj = this.x8("thanos_side_window_clean_controller");
       a.o(obj, "injectRef\(AccessIds.THAN¡­_WINDOW_CLEAN_CONTROLLER\)");
       this.t = obj;
       Object obj1 = this.q8(o.class);
       a.o(obj1, "inject\(PhotoAdActionBarClickProcessor::class.java\)");
       this.u = obj1;
       return;
    }
}
