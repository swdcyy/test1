package com.yxcorp.gifshow.detail.fragments.milano.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.BitSet;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.c$a;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.c$b;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.c$c;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.c$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import le5.f;
import lnc.a1;
import v0a.p;
import android.view.View$OnClickListener;
import v0a.q;
import v0a.r;
import v0a.s;
import df5.b;
import hf5.b;
import jta.c;
import hf5.e;
import v0a.k;
import erd.g;
import crd.b;
import brd.t;
import v0a.m;
import hf5.g;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import v0a.l;
import v0a.n;
import com.yxcorp.gifshow.util.rx.RxBus;
import lm5.e;
import brd.z;
import io.reactivex.android.schedulers.a;
import v0a.o;
import lm5.g;
import v0a.j;
import v0a.i;
import qvb.q;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import f6a.c;
import com.yxcorp.utility.n;
import mm5.c;
import k2b.e0;
import lm5.f;
import androidx.fragment.app.Fragment;
import io.reactivex.subjects.PublishSubject;

public class c extends PresenterV2	// class@00151f
{
    public PublishSubject A;
    public View B;
    public ImageView C;
    public KwaiImageView D;
    public TextView E;
    public View F;
    public View G;
    public View H;
    public t I;
    public boolean J;
    public final int K;
    public SlidePlayViewModel L;
    public boolean M;
    public String N;
    public q O;
    public boolean P;
    public final q Q;
    public final c R;
    public final e S;
    public final b T;
    public final boolean p;
    public final boolean q;
    public MilanoContainerEventBus r;
    public QPhoto s;
    public b t;
    public g u;
    public e v;
    public ViewStubInflater2 w;
    public e0 x;
    public final BitSet y;
    public Boolean z;

    public void c(boolean p0,int p1){
       super(false, p0, p1);
    }
    public void c(boolean p0,boolean p1,int p2){
       super();
       this.y = new BitSet();
       this.z = Boolean.FALSE;
       this.J = false;
       this.M = false;
       this.N = "";
       this.P = false;
       this.Q = new c$a(this);
       this.R = new c$b(this);
       this.S = new c$c(this);
       this.T = new c$d(this);
       this.p = p0;
       this.q = p1;
       this.K = p2;
    }
    public void E8(){
       RxBus f;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       if (this.w == null || (this.K != -1 && !PatchProxy.applyVoid(objArray, this, uoc, "3"))) {
          if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
             this.w.d(this.m8());
             this.B = this.w.b(0x7f0a0499);
             this.C = this.w.b(0x7f0a3871);
             this.D = this.w.b(0x7f0a3691);
             this.E = this.w.b(0x7f0a3872);
             this.G = this.w.b(0x7f0a0eb0);
             this.H = this.w.b(0x7f0a0477);
             this.F = this.w.b(0x7f0a0cf1);
          }
          if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
             if (f.r()) {
                this.B.setBackgroundColor(a1.a(R.color.arg_RES_7f0606b3));
             }
             this.V8(this.R8());
          }
          if (!PatchProxy.applyVoid(objArray, this, uoc, "7")) {
             this.F.setOnClickListener(new p(this));
             this.C.setOnClickListener(new q(this, false, 500));
             this.B.setOnClickListener(new r(this));
             this.G.setOnClickListener(new s(this));
          }
          this.t.De(this.T);
          this.v.D0(this.R);
          uoc = this.I;
          if (uoc != null) {
             this.X7(uoc.subscribe(new k(this)));
          }
          this.X7(this.u.L2(new m(this)));
          this.X7(this.r.r.subscribe(new l(this)));
          this.X7(this.r.u.subscribe(new n(this)));
          f = RxBus.f;
          this.X7(f.f(e.class).observeOn(a.c()).subscribe(new o(this)));
          this.X7(f.f(g.class).subscribe(new j(this)));
          uoc = this.A;
          if (uoc != null) {
             this.X7(uoc.subscribe(new i(this)));
          }
          this.L.e(this.Q);
       }
    label_016b :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "13")) {
          return;
       }
       this.t.c3(this.T);
       this.v.w0(this.R);
       this.L.b(this.Q);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       this.N = "";
       this.E.setText("");
       this.D.setVisibility(8);
       this.G.setVisibility(8);
       return;
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return DanmakuSwitchUtils.h.f();
    }
    public void S8(int p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoc, "11")) {
          return;
       }
       this.y.set(p0, p1);
       boolean b = true;
       int i = 0;
       if (this.y.isEmpty() && c.f(this.s, this.K)) {
          n.Y(this.B, i, i);
          if (this.J == null) {
             c.a.e(this.x, this.s);
             this.J = b;
          }
          RxBus.f.c(new f(this.x.hashCode(), i, p0));
       }else {
          n.Y(this.B, 8, i);
          int i1 = 2;
          if (p1 && p0 == b) {
             RxBus.f.c(new f(this.x.hashCode(), i1, p0));
          }else if(!this.y.get(b) && !this.y.get(i1)){
             RxBus.f.c(new f(this.x.hashCode(), b, p0));
          }
       }
       return;
    }
    public final void V8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "10")) {
          return;
       }
       uoc = this.C;
       if (uoc != null) {
          uoc.setSelected(p0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.r = this.q8(MilanoContainerEventBus.class);
       this.t = this.q8(b.class);
       this.v = this.q8(e.class);
       this.u = this.q8(g.class);
       this.x = this.q8(e0.class);
       this.w = this.t8("NASA_BOTTOM_DANMAKU_VIEW_STUB");
       this.I = this.t8("NASA_BOTTOM_TAG_BAR_VIEW_SHOW_OBSERVABLE");
       this.L = SlidePlayViewModel.B0(this.x);
       this.A = this.t8("SERIAL_PAY_PANEL_SHOW");
       return;
    }
}
