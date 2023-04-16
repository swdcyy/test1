package com.yxcorp.gifshow.pymk.element.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.pymk.element.c;
import erd.o;
import t45.d;
import brd.z;
import b7c.k;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import a7c.h;
import wkd.b;
import qra.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import sra.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import b7c.l;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.kwai.framework.model.user.User$FollowStatus;
import java.util.Objects;
import java.lang.Boolean;
import ok.x;
import com.kwai.framework.model.user.RecoUser;
import f7c.c;
import com.yxcorp.utility.n;
import android.text.TextPaint;
import android.widget.TextView;
import com.yxcorp.gifshow.pymk.b;
import y6c.f;
import y8c.g;
import y6c.a;
import ekd.m1;
import b7c.h;
import android.view.View$OnClickListener;
import b7c.j;
import b7c.i;

public class d extends PresenterV2	// class@0016bf
{
    public View A;
    public TextView B;
    public View C;
    public boolean D;
    public User p;
    public h q;
    public RecoUser r;
    public c s;
    public g t;
    public b u;
    public View v;
    public TextView w;
    public TextView x;
    public View y;
    public View z;

    public void d(){
       super(false);
    }
    public void d(boolean p0){
       super();
       this.D = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.P8(this.p);
       this.X7(this.p.observable().distinctUntilChanged(c.b).observeOn(d.a).subscribe(new k(this), Functions.d()));
       d tq = this.q;
       if (tq != null && (tq.a() && b.a(0x36dab11a).d(this.p))) {
          this.u = RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new l(this));
       }
    label_0063 :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       b9.a(this.u);
       return;
    }
    public final void P8(User p0){
       d tq;
       boolean b;
       boolean b1;
       d tB;
       h n;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "7")) {
          return;
       }
       if (!p0.isFollowingOrFollowRequesting()) {
          tq = this.q;
          if (tq != null && tq.y()) {
             this.y.setVisibility(8);
          }else {
             this.y.setVisibility(0);
          }
          this.z.setVisibility(8);
       }else {
          tq = this.q;
          if (tq != null && (tq.a() && (p0.getFollowStatus() == User$FollowStatus.FOLLOWING && b.a(0x36dab11a).d(p0)))) {
             this.y.setVisibility(0);
             this.z.setVisibility(8);
          }else {
             tq = this.q;
             if (tq != null && (tq.w() && (p0.getFollowStatus() == User$FollowStatus.FOLLOWING && p0.mVisitorBeFollowed != null))) {
                this.y.setVisibility(0);
                this.z.setVisibility(8);
             }else {
                tq = this.q;
                if (tq != null && (tq.d() && this.p.mFavorited == null)) {
                   this.y.setVisibility(0);
                   this.z.setVisibility(8);
                }else {
                   this.y.setVisibility(8);
                   tq = this.q;
                   if (tq != null && tq.f()) {
                      this.z.setVisibility(8);
                      if (this.D != null) {
                         this.y.setVisibility(0);
                      }
                   }else {
                      this.z.setVisibility(0);
                   }
                }
             }
          }
       }
       if (this.C != null) {
          tq = this.q;
          if (tq != null) {
             Objects.requireNonNull(tq);
             Object obj = PatchProxy.apply(null, tq, h.class, "8");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                n = tq.n;
                b = (n != null)? n.get().booleanValue(): true;
             }
             if (b) {
                this.C.setVisibility(0);
             }
          }
          this.C.setVisibility(8);
       }
       tq = this.s;
       if (tq != null) {
          tq.Z3(this.r, this.q, this.v);
       }
       Object obj1 = PatchProxy.apply(null, this, uod, "8");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          tB = this.q;
          b1 = (tB != null && tB.g())? true: false;
       }
       if (b1) {
          View[] viewArray = new View[]{this.y,this.z};
          n.Z(8, viewArray);
          tB = this.B;
          if (tB != null) {
             tB.getPaint().setFakeBoldText(1);
             this.B.setText(b.f());
          }
          tB = this.A;
          if (tB != null) {
             tB.setBackgroundResource(R.drawable.arg_RES_7f081dcd);
          }
          int i = (p0.isFollowingOrFollowRequesting())? 4: 0;
          viewArray = new View[]{this.A};
          n.Z(i, viewArray);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       d tq = this.q;
       f uof = (tq != null && tq.d())? new f(this.r, this.s, this.t): new a(this.r, this.s, this.t);
       uof.a();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a2d10);
       this.x = m1.f(p0, 0x7f0a3deb);
       this.y = m1.f(p0, 0x7f0a0782);
       this.A = m1.f(p0, 0x7f0a0788);
       this.B = m1.f(p0, 0x7f0a079d);
       this.z = m1.f(p0, 0x7f0a3635);
       this.C = m1.f(p0, 0x7f0a0be0);
       this.v = m1.f(p0, 0x7f0a0fb1);
       m1.a(p0, new h(this), R.id.close);
       m1.a(p0, new j(this), R.id.follower_layout);
       if (this.A != null) {
          m1.a(p0, new i(this), R.id.close_button_container);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(User.class);
       this.q = this.t8("PYMK_ACCESS_IDSPYMK_PARAMS");
       this.r = this.q8(RecoUser.class);
       this.s = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       this.t = this.r8("PYMK_ADAPTER");
       return;
    }
}
