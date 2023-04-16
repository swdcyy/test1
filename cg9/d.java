package cg9.d;
import oc9.e0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import zg9.c;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import dg9.f;
import oc9.t;
import eg9.c;
import eg9.j;
import eg9.b;
import cg9.b;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wd9.a;
import we9.a;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.sidebar.SideBarViewBinder;
import android.view.ViewGroup;
import qxc.b;
import android.widget.ImageView;
import tg9.b;
import cg9.a;
import android.view.View$OnClickListener;
import android.view.ViewTreeObserver;
import cg9.d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import cg9.c;
import erd.g;
import crd.b;
import eoc.f;
import lnc.s6;

public class d extends e0	// class@0005e6
{
    public View q;
    public ImageView r;
    public View s;
    public ViewGroup t;
    public j u;
    public f v;
    public boolean w;

    public void d(CameraPageType p0,b p1){
       super(p0, p1);
       this.w = false;
       d tf = this.f;
       if (tf instanceof c) {
          this.u = tf.E6();
       }
       f uof = new f(p0, p1);
       this.v = uof;
       this.L0(uof);
       if (p0 == CameraPageType.VIDEO) {
          this.L0(new c(p0, p1));
       }else {
          this.L0(new j(p0, p1));
       }
       this.d.n(b.class, new b(this));
       return;
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       super.A0();
       this.h2();
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       super.I7();
       this.g2();
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       super.P1();
       a uoa = this.d.d(a.i);
       if (this.d.d(a.b).a == null && (uoa.a == null || uoa.b != null)) {
          this.h2();
       }
       return;
    }
    public void g2(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       d tt = this.t;
       if (tt == null) {
          return;
       }
       n.Y(tt, 4, true);
       return;
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       d tt = this.t;
       if (tt == null) {
          return;
       }
       n.Y(tt, 0, true);
       return;
    }
    public void k(View p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "1")) {
          return;
       }
       super.k(p0);
       d tu = this.u;
       SideBarViewBinder sideBarViewB = (tu != null && tu.r2() != null)? this.u.r2(): null;
       View view = (sideBarViewB == null)? null: sideBarViewB.C();
       this.q = b.a(view, p0, 0x7f0a0635);
       this.r = p0.findViewById(0x7f0a05b3);
       this.s = p0.findViewById(0x7f0a0614);
       this.t = p0.findViewById(0x7f0a0612);
       this.d.j().addView(this.r);
       this.r.setOnClickListener(new a(this));
       CameraPageType lIVE_COVER = CameraPageType.LIVE_COVER;
       if (this.c == lIVE_COVER) {
          this.r.setImageResource(R.drawable.arg_RES_7f081bdf);
       }
       d tq = this.q;
       if (tq != null && this.t != null) {
          tq.getViewTreeObserver().addOnGlobalLayoutListener(new d$a(this));
          if (PostExperimentUtils.n()) {
             this.Y1(f.a(PanelShowEvent.class, new c(this)));
          }
          if (!PatchProxy.applyVoid(null, this, uod, "2") && s6.m()) {
             if (this.c == lIVE_COVER) {
                this.r.setImageResource(R.drawable.arg_RES_7f081be0);
             }else {
                this.r.setImageResource(R.drawable.arg_RES_7f081be8);
             }
          }
       }
    label_00c1 :
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       super.onDestroyView();
       return;
    }
    public void q1(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       super.q1();
       this.g2();
       return;
    }
}
