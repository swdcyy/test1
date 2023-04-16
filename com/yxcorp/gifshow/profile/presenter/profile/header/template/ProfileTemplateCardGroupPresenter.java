package com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter$a;
import nsd.u;
import ekd.k1;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter$mKrnEventListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import brd.t;
import j5c.c;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter$c;
import erd.r;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter$d;
import erd.g;
import z5c.l0;
import crd.b;
import com.kwai.framework.model.user.User;
import z5c.d3;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.b;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter$e;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter$f;
import com.yxcorp.gifshow.profile.adapter.ProfileTemplateCardAdapter;
import t3c.f;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.presenter.profile.header.template.ProfileTemplateCardGroupPresenter$b;
import java.lang.Long;
import java.lang.Runnable;
import android.view.View;
import ekd.m1;
import android.view.ViewStub;
import java.lang.Number;

public final class ProfileTemplateCardGroupPresenter extends PresenterV2	// class@001541
{
    public float A;
    public int B;
    public int C;
    public final p D;
    public BaseFragment p;
    public c q;
    public User r;
    public ViewStub s;
    public int t;
    public final long u;
    public RecyclerView v;
    public ProfileTemplateCardAdapter w;
    public c3 x;
    public boolean y;
    public final int z;
    public static final ProfileTemplateCardGroupPresenter$a E;

    static {
       ProfileTemplateCardGroupPresenter.E = new ProfileTemplateCardGroupPresenter$a(null);
    }
    public void ProfileTemplateCardGroupPresenter(){
       super();
       this.t = 5;
       this.u = k1.i();
       this.z = 0x7f0702ab;
       this.A = 24.00f;
       this.B = 0x7f0702df;
       this.C = 0x7f0702b8;
       this.D = s.c(new ProfileTemplateCardGroupPresenter$mKrnEventListener$2(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, ProfileTemplateCardGroupPresenter.class, "4")) {
          return;
       }
       ProfileTemplateCardGroupPresenter tq = this.q;
       if (tq == null) {
          a.S("mLoadState");
       }
       String str = "ProfileTemplateCardGroupPresenter";
       this.X7(tq.d().filter(ProfileTemplateCardGroupPresenter$c.b).subscribe(new ProfileTemplateCardGroupPresenter$d(this), l0.a(str)));
       tq = this.r;
       if (tq == null) {
          a.S("mUser");
       }
       if (d3.a(tq)) {
          this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new ProfileTemplateCardGroupPresenter$e(this), l0.a(str)));
          a.b().a("KSUserProfileDidChange", this.P8());
       }
       tq = this.p;
       if (tq == null) {
          a.S("mFragment");
       }
       this.X7(tq.Vg().g().subscribe(new ProfileTemplateCardGroupPresenter$f(this), l0.a));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, ProfileTemplateCardGroupPresenter.class, "6")) {
          return;
       }
       ProfileTemplateCardGroupPresenter tw = this.w;
       if (tw != null) {
          tw.onDestroy();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ProfileTemplateCardGroupPresenter.class, "5")) {
          return;
       }
       ProfileTemplateCardGroupPresenter tx = this.x;
       if (tx != null) {
          tx.e();
       }
       a.b().c("KSUserProfileDidChange", this.P8());
       return;
    }
    public final a P8(){
       Object obj = PatchProxy.apply(null, this, ProfileTemplateCardGroupPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.getValue();
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, ProfileTemplateCardGroupPresenter.class, "9")) {
          return;
       }
       k1.p(new ProfileTemplateCardGroupPresenter$b(this), Long.valueOf(500));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileTemplateCardGroupPresenter.class, "3")) {
          return;
       }
       a.p(p0, "view");
       p0 = m1.f(p0, R.id.template_cards);
       a.o(p0, "ViewBindUtils.bindWidget¡­iew, R.id.template_cards\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ProfileTemplateCardGroupPresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("PROFILE_FRAGMENT");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_FRAGMENT\)");
       this.p = obj;
       obj = this.q8(User.class);
       a.o(obj, "inject\(User::class.java\)");
       this.r = obj;
       obj = this.r8("PROFILE_LOAD_STATE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_LOAD_STATE\)");
       this.q = obj;
       obj = this.r8("PROFILE_STYLE");
       a.o(obj, "inject\(ProfileCommonAccessIds.PROFILE_STYLE\)");
       this.t = obj.intValue();
       return;
    }
}
