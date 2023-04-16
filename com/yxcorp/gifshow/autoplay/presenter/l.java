package com.yxcorp.gifshow.autoplay.presenter.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import com.yxcorp.gifshow.autoplay.presenter.f;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.autoplay.state.f;
import x99.m0;
import x99.p0;
import w99.d$a;
import w99.d;
import x99.o0;
import com.yxcorp.gifshow.util.rx.RxBus;
import ujc.e;
import brd.z;
import io.reactivex.android.schedulers.a;
import x99.l0;
import u99.d;
import com.yxcorp.gifshow.autoplay.presenter.j;
import x99.q0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import z99.c;
import java.util.List;
import java.util.Arrays;
import o56.c;
import o56.a;
import x99.n0;
import java.lang.Runnable;
import ekd.k1;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.autoplay.state.e;
import y99.i;
import io.reactivex.subjects.PublishSubject;
import im8.f;
import com.yxcorp.gifshow.autoplay.presenter.k;

public class l extends PresenterV2	// class@001c34
{
    public RecyclerFragment p;
    public d q;
    public e r;
    public i s;
    public f t;
    public PublishSubject u;
    public f v;
    public String w;
    public c$a x;

    public void l(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.X7(this.p.Vg().g().subscribe(new f(this)));
       this.X7(this.t.d().subscribe(new m0(this)));
       this.q.a(new p0(this));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       this.x = new o0(this);
       this.X7(RxBus.f.f(e.class).observeOn(a.c()).subscribe(new l0(this)));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, l.class, "7")) {
          return;
       }
       d.d("AutoPlayCardPlayPresenter", "onDestroy");
       this.q.a(j.a);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "5")) {
          return;
       }
       this.q.a(new q0(this));
       this.t.a();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       if (TextUtils.x(this.w) && c.g(this.p.o())) {
          String str = Arrays.toString(c.e(this.p.o()).toArray());
          if (a.a().c()) {
             k1.o(new n0(this, str));
          }
          HashMap hashMap = new HashMap();
          hashMap.put("feedId", str);
          hashMap.put("page2", this.p.o());
          d.h("AutoPlayCardPlayPresenter", "onAutoPlayLeak", hashMap);
          c.b(this.p.o());
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("AUTO_PLAY_MANAGER_WRAPPER");
       this.r = this.r8("HOST_PLAY_STATE_RESUME");
       this.s = this.r8("HOST_PLAY_STATE_SELECT");
       this.t = this.r8("HOST_PLAY_STATE_MENU_SLIDE");
       this.u = this.r8("PLAY_PLAYER_INTERCEPT");
       this.v = this.w8("AUTO_PLAY_PAUSE_RELEASE_PLAYER");
       this.w = this.t8("PLAYER_REUSE_SESSION_ID");
       return;
    }
    public void onEventMainThread(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "6")) {
          return;
       }
       if (p0.a == 4) {
          this.q.a(k.a);
       }
       return;
    }
}
