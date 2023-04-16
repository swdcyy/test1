package com.yxcorp.gifshow.profile.presenter.profile.header.operation.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.p$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.o;
import erd.g;
import z5c.l0;
import crd.b;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import s4c.a1;
import lnc.b9;
import java.lang.Boolean;
import a3c.e;
import android.widget.ImageView;
import lnc.a1;
import java.lang.CharSequence;
import android.animation.Animator;
import android.view.View;
import ekd.m1;
import s1c.j1;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import xl8.b;
import java.lang.Integer;

public class p extends PresenterV2	// class@001515
{
    public Animator A;
    public boolean B;
    public b C;
    public b D;
    public boolean E;
    public final d F;
    public boolean p;
    public View q;
    public View r;
    public ImageView s;
    public ImageView t;
    public j1 u;
    public User v;
    public ProfileParam w;
    public c x;
    public RxPageBus y;
    public int z;
    public static final float[] G;
    public static final float[] H;
    public static final float[] I;

    static {
       p.G = new float[2]{0x3f000000,0x40000000};
       p.H = new float[3]{0x40000000,0x3fe66666,0x3ecccccd};
       p.I = new float[3]{0x3f800000,0x3f99999a,0x3f800000};
    }
    public void p(){
       super();
       this.p = false;
       this.F = new p$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       this.X7(this.x.e().subscribe(new o(this), l0.a("UserProfileMissUPresenter")));
       this.X7(this.y.f("PROFILE_EMPTY_PHOTO_MISSU_SHOW").subscribe(new a1(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "4")) {
          return;
       }
       b9.a(this.C);
       return;
    }
    public void P8(boolean p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, op, "5")) {
          return;
       }
       this.p = p0;
       int i = (e.a(this.z))? 0x7f0822b1: 0x7f082307;
       int i1 = (e.a(this.z))? 0x7f0822b0: 0x7f082303;
       p tt = this.t;
       if (!p0) {
          i = i1;
       }
       tt.setImageResource(i);
       op = this.t;
       int i2 = (p0)? 0x7f10364f: 0x7f103638;
       op.setContentDescription(a1.p(i2));
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, p.class, "9")) {
          return;
       }
       p tA = this.A;
       if (tA != null) {
          if (tA.isRunning()) {
             this.A.cancel();
          }
          this.A = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3255);
       this.s = m1.f(p0, 0x7f0a2b92);
       this.q = m1.f(p0, 0x7f0a435e);
       this.t = m1.f(p0, 0x7f0a3292);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       this.u = this.q8(j1.class);
       this.v = this.q8(User.class);
       this.w = this.q8(ProfileParam.class);
       this.x = this.r8("PROFILE_LOAD_STATE");
       this.D = this.r8("PROFILE_OPERATION_BTN_SCROLL_TO_TOP");
       this.y = this.r8("PROFILE_PAGE_RXBUS");
       this.z = this.r8("PROFILE_STYLE").intValue();
       return;
    }
}
