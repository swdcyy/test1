package gh9.f;
import oc9.d0;
import gh9.f$b;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ed9.f;
import gh9.g;
import gh9.f$a;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import java.lang.Integer;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import android.widget.FrameLayout;
import gh9.d;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroupV2;
import yb9.b;
import th0.e;
import th0.n;
import android.view.View;
import android.view.animation.Interpolator;
import yb9.b$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.yxcorp.gifshow.camera.record.magic.a;
import com.yxcorp.gifshow.camera.record.magic.a$a;
import zb9.s;
import zb9.s$a;
import jg9.a1;
import jg9.a1$a;
import vb9.m;
import android.app.Activity;
import android.view.ViewGroup;
import a2.i0;
import gh9.f$c;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import gh9.f$d;
import erd.g;
import crd.b;
import eoc.f;
import gh9.h;
import gh9.f$e;
import gh9.e;
import gh9.f$f;
import zb9.j;
import gh9.f$g;
import zb9.t;
import gh9.f$h;
import gh9.f$i;
import java.lang.Long;
import com.yxcorp.utility.n;
import android.animation.Animator$AnimatorListener;
import pi9.n;

public final class f extends d0	// class@00249d
{
    public ViewGroup o;
    public CameraScrollTabViewGroupV2 p;
    public final f q;
    public int r;
    public boolean s;
    public static final f$b t;

    static {
       f.t = new f$b(null);
    }
    public void f(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.q = new f(CameraPageType.VIDEO);
       this.r = Integer.MIN_VALUE;
       p1.n(g.class, new f$a(this));
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       if (!this.a2()) {
          this.k2(true, true);
       }
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       this.k2(false, false);
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       this.k2(true, true);
       return;
    }
    public void d5(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "9")) {
          return;
       }
       super.d5(p0);
       d td = this.d;
       a.o(td, "mCallerContext");
       BaseFragment uBaseFragmen = td.f();
       a.o(uBaseFragmen, "mCallerContext.fragment");
       if (!uBaseFragmen.isVisible()) {
          return;
       }
       boolean b = this.i2();
       boolean b1 = true;
       if (b) {
          this.h2();
          f tp = this.p;
          if (tp != null) {
             tp.setEnabled(b1);
          }
       }
       d b2 = this.d.d(d.c).b;
       if (b) {
          f tp1 = this.p;
          if (tp1 != null) {
             a.m(tp1);
             if (tp1.getItemCount() > b1 || b2 != null) {
             label_005f :
                if (b1) {
                   td = this.d;
                   a.o(td, "mCallerContext");
                   td.h().d(this.o, 0, new e(), new n(), null);
                }else {
                   td = this.d;
                   a.o(td, "mCallerContext");
                   td.h().d(this.o, 8, new e(), new n(), null);
                }
                return;
             }
          }
       }
       b1 = false;
       goto label_005f ;
    }
    public final boolean g2(){
       f obj = PatchProxy.apply(null, this, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!this.f2() || (!this.a2() && !CameraLogger.d(this.d))) {
          obj = this.p;
          if (obj != null) {
             a.m(obj);
             if (obj.getItemCount() > b || (this.d.d(d.c).b != null && (this.s == null && (!this.d.d(a.d.a()).b() && !this.d.d(s.d.a()).a())))) {
                a1$a j = a1.j;
                if (this.d.d(j.a()).e != null && !this.d.d(j.a()).a()) {
                   Object obj1 = this.d.d(m.d);
                   a.o(obj1, "mCallerContext.getData\(A¡­lideUpData.sDefaultValue\)");
                   if (!obj1.a()) {
                   label_00ab :
                      return b;
                   }
                }
             }
          }
       }
       b = false;
       goto label_00ab ;
    }
    public final void h2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "2")) {
          return;
       }
       ViewGroup viewGroup = this.e.findViewById(R.id.camera_scroll_snapshot_tab_container);
       this.o = viewGroup;
       if (viewGroup != null) {
          objArray = viewGroup.findViewById(0x7f0a0640);
       }
       this.p = objArray;
       f to = this.o;
       if (to != null && !i0.Y(to)) {
          f.G(to, new f$c(to, this));
       }
       return;
    }
    public final boolean i2(){
       Object obj = PatchProxy.apply(null, this, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d.d(d.c).a;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.k(p0);
       this.Y1(f.a(PanelShowEvent.class, new f$d(this)));
       this.Y1(f.a(h.class, new f$e(this)));
       this.Y1(f.a(e.class, new f$f(this)));
       this.Y1(this.d.l(j.class, new f$g(this)));
       this.Y1(this.d.l(t.class, new f$h(this)));
       this.b2(new f$i(this));
       return;
    }
    public final void k2(boolean p0,boolean p1){
       f to;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uof, "12")) {
          return;
       }
       long l = 0;
       long l1 = (p1)? 300: l;
       if (!PatchProxy.isSupport(uof) || (PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Long.valueOf(l1), this, uof, "11") || (this.o != null && this.i2()))) {
          if (p0) {
             to = this.o;
             if (to != null) {
                to.setAlpha(0x3f800000);
             }
             to = this.o;
             if (to != null) {
                to.setTranslationY(0);
             }
          }
          to = 0;
          f uof1 = (p0 && this.g2())? 1: null;
          int i = (uof1)? 0: 8;
          f to1 = this.o;
          a.m(to1);
          if (to1.getVisibility() != i) {
             to = 1;
          }
          to1 = this.o;
          if (to) {
             l = l1;
          }
          n.W(to1, i, l);
          if (uof1) {
             uof1 = this.p;
             if (uof1 != null) {
                uof1.setEnabled(true);
             }
          }
       }
    label_0086 :
       return;
    }
    public final void l2(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "10")) {
          return;
       }
       if (this.o != null && this.i2()) {
          p0 = (p0 && this.g2())? true: false;
          if (p0) {
             uof = this.o;
             a.m(uof);
             if (!uof.getVisibility()) {
             label_0045 :
                return;
             }
          }
          if (!p0) {
             uof = this.o;
             a.m(uof);
             if (uof.getVisibility()) {
                goto label_0045 ;
             }
          }
          n.a(this.o, p0, this.r, null);
       }
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       this.k2(false, false);
       return;
    }
}
