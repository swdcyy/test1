package com.kwai.live.gzone.guess.kshell.f0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import com.kwai.live.gzone.guess.kshell.f0$a;
import erd.g;
import crd.b;
import com.kwai.live.gzone.guess.kshell.f0$b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import c77.a$a;
import c77.a;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.kwai.live.gzone.guess.kshell.q;
import n57.c;
import com.kwai.live.gzone.guess.kshell.f0$c;
import com.kwai.robust.PatchProxyResult;
import y43.a;
import com.kwai.live.gzone.pendant.service.LiveGzoneAudienceFeatureEntranceItem;
import k67.g;
import n57.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import android.app.Activity;
import d61.w;
import q57.a;
import com.kwai.live.gzone.guess.kshell.e0;
import com.kwai.live.gzone.guess.kshell.j0;
import ekd.m1;
import com.kwai.library.widget.popup.common.c;
import k67.b;
import lp3.e;
import j47.c;

public class f0 extends PresenterV2	// class@000d37
{
    public a A;
    public PresenterV2 B;
    public PresenterV2 C;
    public boolean D;
    public FrameLayout p;
    public c q;
    public a r;
    public PagerSlidingTabStrip$d s;
    public a$a t;
    public b u;
    public g v;
    public b w;
    public b x;
    public e y;
    public c z;

    public void f0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "3")) {
          return;
       }
       this.X7(this.x.b().Vg().k().subscribe(new f0$a(this)));
       this.S8();
       if (this.r != null) {
          f0 ts = this.s;
          if (ts != null) {
             f0$b uob = new f0$b(this, ts.c());
             this.t = uob;
             this.r.e(uob);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "10")) {
          return;
       }
       this.V8();
       this.W8();
       this.D = false;
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "5")) {
          return;
       }
       if (this.B != null) {
          return;
       }
       this.p.removeAllViews();
       this.W8();
       View view = a.i(this.p, R.layout.arg_RES_7f0d0bc4);
       this.p.addView(view);
       PresenterV2 presenterV2 = new PresenterV2();
       this.B = presenterV2;
       presenterV2.U7(new q());
       this.B.U7(new c());
       this.B.f(view);
       Object[] objArray = new Object[]{this.R8()};
       this.B.i(objArray);
       return;
    }
    public final f0$c R8(){
       f0$c obj = PatchProxy.apply(null, this, f0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new f0$c();
       obj.b = this.s;
       obj.c = this.x;
       obj.d = this.y;
       obj.e = this.r;
       obj.f = this.w;
       obj.g = this.z;
       f0 tA = this.A;
       obj.h = tA.X;
       obj.i = tA;
       return obj;
    }
    public void S8(){
       f0 uof0 = f0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof0, "4")) {
          return;
       }
       f0 tv = this.v;
       if (tv == null || !tv.sa(LiveGzoneAudienceFeatureEntranceItem.GUESS.mEntranceId)) {
          tv = this.w;
          if (tv != null && !tv.a()) {
          label_0024 :
             this.P8();
          }else if(PatchProxy.applyVoid(objArray, this, uof0, "7")){
             a.i("SQUARE", this.x.a(), w.a(this.getActivity()));
             if (this.C == null) {
                this.p.removeAllViews();
                this.V8();
                View view = a.i(this.p, R.layout.arg_RES_7f0d0bc7);
                this.p.addView(view);
                PresenterV2 presenterV2 = new PresenterV2();
                this.C = presenterV2;
                presenterV2.U7(new e0());
                this.C.U7(new j0());
                this.C.f(view);
                objArray = new Object[]{this.R8()};
                this.C.i(objArray);
             }
          }
       }else {
          goto label_0024 ;
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "6")) {
          return;
       }
       f0 tB = this.B;
       if (tB != null) {
          tB.unbind();
          this.B = null;
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "8")) {
          return;
       }
       f0 tC = this.C;
       if (tC != null) {
          tC.unbind();
          this.C = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a1f26);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f0.class, "1")) {
          return;
       }
       this.r = this.s8(a.class);
       this.q = this.t8("GZONE_ACTIVITY_POPUP");
       this.u = this.s8(b.class);
       this.v = this.s8(g.class);
       this.w = this.s8(b.class);
       this.x = this.r8("LIVE_BASIC_CONTEXT");
       this.y = this.r8("LIVE_SERVICE_MANAGER");
       this.z = this.q8(c.class);
       this.A = this.q8(a.class);
       this.s = this.r8("LIVE_GZONE_TAB");
       return;
    }
}
