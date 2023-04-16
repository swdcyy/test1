package bh9.r;
import ui9.b;
import in6.b;
import oc9.d0;
import lnc.a1;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import ed9.f;
import com.yxcorp.gifshow.camera.record.base.d;
import java.util.BitSet;
import zg9.c;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import bh9.s;
import bh9.k;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import bh9.j;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.b0;
import oc9.a0;
import in6.a;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import java.lang.Boolean;
import java.lang.Integer;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.gifshow.widget.ControlSpeedLayout;
import bh9.f;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import bh9.h;
import java.util.Objects;
import android.widget.FrameLayout;
import android.view.ViewPropertyAnimator;
import tyc.f0;
import android.animation.Animator$AnimatorListener;
import android.widget.TextView;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import e17.i;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import com.yxcorp.gifshow.camera.record.sidebar.AbsRecordSideBarViewBinder;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import qxc.b;
import lnc.s6;
import android.graphics.drawable.Drawable;
import pi9.i;
import bh9.a;
import com.kuaishou.viewbinder.IViewBinder;
import android.view.View$OnClickListener;
import c35.p;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import bh9.p;
import erd.g;
import crd.b;
import eoc.f;
import com.yxcorp.gifshow.widget.ControlSpeedLayout$c;
import bh9.q;
import bh9.i;
import bh9.e;
import bh9.d;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import bh9.g;
import yb9.b;
import yb9.b$a;
import bh9.u;
import com.yxcorp.utility.n;
import android.content.Intent;
import ekd.j0;
import kd9.e0;
import bh9.m;
import xg9.k;
import bh9.l;
import zb9.q;
import bh9.n;
import zb9.t;
import bh9.o;

public class r extends d0 implements b, b	// class@0004a7
{
    public TextImageView o;
    public ViewStubInflater2 p;
    public final f q;
    public float r;
    public j s;
    public final BitSet t;
    public boolean u;
    public int v;
    public static final int w;
    public static final int x;
    public static final int y;
    public static final int z;

    static {
       r.w = - a1.e(51.00f);
       r.x = - a1.e(47.00f);
       r.y = - a1.e(101.00f);
       r.z = - a1.e(80.00f);
    }
    public void r(CameraPageType p0,b p1){
       super(p0, p1);
       this.q = new f(this.c);
       this.r = 0x3f800000;
       this.t = new BitSet();
       this.u = false;
       d tf = this.f;
       if (tf instanceof c) {
          this.s = tf.E6();
       }
       this.d.n(s.class, new k(this));
       this.d.n(b.class, new j(this));
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, r.class, "12")) {
          return;
       }
       a0.j(this);
       this.k2(false);
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, r.class, "11")) {
          return;
       }
       a0.i(this);
       this.k2(true);
       return;
    }
    public int O0(){
       return a.c(this);
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, r.class, "13")) {
          return;
       }
       a0.h(this);
       this.k2(false);
       return;
    }
    public int R(){
       return 0x7f0d1562;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public int T(){
       return a.a(this);
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(r.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, r.class, "4")) {
          return;
       }
       this.m2();
       return;
    }
    public int Y0(){
       return 1;
    }
    public int a1(){
       return a.b(this);
    }
    public void d5(int p0){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, or, "16")) {
          return;
       }
       super.d5(p0);
       this.m2();
       return;
    }
    public void e2(){
       if (PatchProxy.applyVoid(null, this, r.class, "14")) {
          return;
       }
       a0.f(this);
       this.k2(false);
       return;
    }
    public final void g2(){
       if (PatchProxy.applyVoid(null, this, r.class, "19")) {
          return;
       }
       if (this.p.a() == null) {
          return;
       }
       ControlSpeedLayout uControlSpee = this.p.b(R.id.control_speed_layout);
       f.G(uControlSpee, new f(this, uControlSpee));
       return;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public final void h2(boolean p0){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, or, "21")) {
          return;
       }
       if (this.o != null && this.p.a() != null) {
          int i = 0x7f0a0970;
          if (this.p.b(i).getVisibility()) {
             return;
          }else {
             ControlSpeedLayout uControlSpee = this.p.b(i);
             h b = h.b;
             Objects.requireNonNull(uControlSpee);
             if (!PatchProxy.isSupport(ControlSpeedLayout.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), b, uControlSpee, ControlSpeedLayout.class, "23")) {
                uControlSpee.setTag(R.id.speed_layout_shown, Boolean.FALSE);
                uControlSpee.clearAnimation();
                uControlSpee.animate().alpha(0).scaleX(0x3f47ae14).scaleY(0x3f47ae14).setDuration(200).setListener(new f0(uControlSpee, p0, b)).start();
             }
          }
       }
       return;
    }
    public final void i2(){
       if (PatchProxy.applyVoid(null, this, r.class, "10")) {
          return;
       }
       r to = this.o;
       if (to == null) {
          return;
       }
       if (!to.isEnabled()) {
          int i = (PostExperimentUtils.p())? 0x7f1040e0: 0x7f1040df;
          i.a(R.style.arg_RES_7f11066a, i);
          return;
       }else {
          int i1 = this.o.isSelected() ^ 0x01;
          CameraLogger.y(406, "toggle_rate_slider");
          this.o.setSelected(i1);
          if (i1) {
             this.l2();
          }else {
             this.h2(false);
          }
          return;
       }
    }
    public void k(View p0){
       TextImageView textImageVie;
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       super.k(p0);
       r ts = this.s;
       View view = null;
       AbsRecordSideBarViewBinder uAbsRecordSi = (ts != null && ts.r2() instanceof AbsRecordSideBarViewBinder)? this.s.r2(): view;
       if (uAbsRecordSi != null) {
          textImageVie = uAbsRecordSi.O();
       }
       textImageVie = b.a(view, p0, R.id.button_speed);
       this.o = textImageVie;
       if (textImageVie != null && s6.m()) {
          this.o.b(a1.f(R.drawable.arg_RES_7f08044c), a1.d(R.dimen.arg_RES_7f07030d), a1.d(R.dimen.arg_RES_7f07030d));
          i.b(this.o);
       }
       p.a(uAbsRecordSi, this.o, new a(this));
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a0971, 0x7f0a0970);
       this.p = viewStubInfl;
       viewStubInfl.d(p0);
       this.Y1(f.a(PanelShowEvent.class, new p(this)));
       this.Y1(f.a(ControlSpeedLayout$c.class, new q(this)));
       r to = this.o;
       if (to != null) {
          to.setClickListenerWithoutEnabled(new i(this));
       }
       this.b2(new e(this));
       return;
    }
    public final void k2(boolean p0){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, or, "22")) {
          return;
       }
       if (p0) {
          this.t.set(1);
          this.h2(1);
       }else {
          d tl = this.l;
          if (tl != null) {
             tl.postDelayed(new d(this), 10);
          }
       }
       return;
    }
    public final void l2(){
       if (PatchProxy.applyVoid(null, this, r.class, "18")) {
          return;
       }
       r to = this.o;
       if (to != null && to.isEnabled()) {
          if (!this.o.isSelected()) {
             return;
          }else if(!this.t.isEmpty()){
             this.g2();
             return;
          }else {
             int i = 0x7f0a0970;
             if (!this.p.b(i).getVisibility()) {
                this.g2();
                return;
             }else {
                ControlSpeedLayout uControlSpee = this.p.b(i);
                r tr = this.r;
                Objects.requireNonNull(uControlSpee);
                if (PatchProxy.isSupport(ControlSpeedLayout.class)) {
                   Object obj = PatchProxy.applyOneRefs(Float.valueOf(tr), uControlSpee, ControlSpeedLayout.class, "20");
                   if (obj != PatchProxyResult.class) {
                      uControlSpee = obj;
                   }else if(!uControlSpee.w - tr){
                      uControlSpee.w = tr;
                      uControlSpee.a(uControlSpee.m.get(uControlSpee.getCurrentSpeedRatioIndex()), false);
                   }
                }else {
                   goto label_006b ;
                }
                f.G(uControlSpee, new g(this, uControlSpee));
             }
          }
       }
       return;
    }
    public final void m2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, r.class, "23")) {
          return;
       }
       if (this.o == null) {
          return;
       }
       boolean b = true;
       int i = 5;
       if (this.n == i) {
          this.t.set(i);
          this.h2(b);
          this.d.h().e(this.o, 8, objArray);
       }else {
          this.t.clear(i);
          this.d.h().e(this.o, 0, objArray);
          if (this.d.d(u.c).b != null) {
             this.o.setEnabled(b);
             this.l2();
          }else {
             this.o.setEnabled(0);
             this.h2(0);
          }
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       super.onDestroyView();
       r to = this.o;
       if (to != null) {
          this.u = to.isSelected();
       }
       this.o = null;
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, r.class, "15")) {
          return;
       }
       a0.g(this);
       if (this.p.a() != null) {
          View view = this.p.a();
          if (view != null && !view.getVisibility()) {
             n.Y(view, 4, true);
          }
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       super.w1(p0);
       String str = "key_speed_rate";
       if (j0.g(p0, str)) {
          float floatExtra = p0.getFloatExtra(str, 0xbf800000);
          if (floatExtra > 0) {
             this.r = floatExtra;
          }
       }
       this.d.l(e0.class, new m(this));
       this.d.l(k.class, new l(this));
       this.d.l(q.class, new n(this));
       this.d.l(t.class, new o(this));
       return;
    }
}
