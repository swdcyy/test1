package com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mrd.a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import r67.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import boc.d0;
import com.kwai.live.gzone.turntable.presenters.k;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.live.gzone.turntable.b;
import o77.a0;
import y43.a;
import com.kwai.live.gzone.turntable.b$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import z8c.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter$1;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import o77.w;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter$a;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter$b;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter$c;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import o77.x;
import mkc.b;
import mkc.c;
import u37.h;
import u37.e;
import cjd.e;
import erd.o;
import o77.z;
import o77.y;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneTurntableTaskPresenter$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;
import o77.f0;
import java.util.Map;
import java.util.HashMap;
import com.kwai.live.gzone.widget.e;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import mrd.c;

public class LiveGzoneTurntableTaskPresenter extends PresenterV2 implements g	// class@000e53
{
    public View A;
    public TextView B;
    public KwaiImageView C;
    public View D;
    public b E;
    public a F;
    public boolean G;
    public a p;
    public a q;
    public e r;
    public LiveGzoneTurntableLogger s;
    public c t;
    public t u;
    public t v;
    public c w;
    public c x;
    public c y;
    public RecyclerView z;

    public void LiveGzoneTurntableTaskPresenter(){
       super();
       this.w = a.g();
       this.x = PublishSubject.g();
    }
    public void E8(){
       LiveGzoneTurntableTaskPresenter liveGzoneTur = LiveGzoneTurntableTaskPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveGzoneTur, "3")) {
          return;
       }
       this.D = this.m8();
       this.q.setOpportunityCount(0);
       d0.c(this.C, "https://static.yximgs.com/udata/pkg/kwai-client-image/live_gzone_audience_turntable_task_title_background.webp", true);
       if (!PatchProxy.applyVoid(objArray, this, liveGzoneTur, "10")) {
          this.X7(this.y.subscribe(new k(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, liveGzoneTur, "4")) {
          b uob = new b(this.p, new a0(this));
          this.E = uob;
          this.z.setAdapter(uob);
       }
       LiveGzoneTurntableTaskPresenter tF = this.F;
       if (tF != null) {
          this.z.removeItemDecoration(tF);
       }
       a uoa = new a(true, 0, true);
       this.F = uoa;
       uoa.o(a1.f(R.drawable.arg_RES_7f08123f));
       this.z.addItemDecoration(this.F);
       this.z.setLayoutManager(new LiveGzoneTurntableTaskPresenter$1(this, this.getContext(), true, 0));
       this.z.setNestedScrollingEnabled(0);
       this.z.setHasFixedSize(true);
       this.P8();
       if (!PatchProxy.applyVoid(objArray, this, liveGzoneTur, "5")) {
          this.X7(this.p.m.b().m().subscribe(new w(this)));
       }
       liveGzoneTur = this.u;
       if (liveGzoneTur != null) {
          this.X7(liveGzoneTur.subscribe(new LiveGzoneTurntableTaskPresenter$a(this)));
       }
       liveGzoneTur = this.v;
       if (liveGzoneTur != null) {
          this.X7(liveGzoneTur.subscribe(new LiveGzoneTurntableTaskPresenter$b(this)));
       }
       this.X7(this.x.subscribe(new LiveGzoneTurntableTaskPresenter$c(this)));
       this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new x(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableTaskPresenter.class, "7")) {
          return;
       }
       this.G = false;
       this.z.setAdapter(null);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableTaskPresenter.class, "9")) {
          return;
       }
       b[] uobArray = new b[]{b.g};
       c.d(this.A, uobArray);
       c.h(this.A, b.d);
       this.X7(e.d().g(this.p.m.getLiveStreamId()).map(new e()).subscribe(new z(this), new y(this)));
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableTaskPresenter.class, "12")) {
          return;
       }
       this.B.getViewTreeObserver().addOnGlobalLayoutListener(new LiveGzoneTurntableTaskPresenter$d(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneTurntableTaskPresenter.class, "2")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a40cd);
       this.B = m1.f(p0, 0x7f0a3d61);
       this.A = m1.f(p0, 0x7f0a26fc);
       this.C = m1.f(p0, 0x7f0a1e83);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneTurntableTaskPresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneTurntableTaskPresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveGzoneTurntableTaskPresenter.class, new f0());
       }else {
          obj.put(LiveGzoneTurntableTaskPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneTurntableTaskPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.r8("LIVE_TURNTABLE_PRIZE_SERVICE");
       this.r = this.t8("LIVE_TURNTABLE_MAIN_POPUP");
       this.s = this.r8("LIVE_TURNTABLE_LOGGER");
       this.t = this.t8("LIVE_GZONE_TURNTABLE_TAB_SELECTED_SUBJECT");
       this.u = this.t8("LIVE_GZONE_TURNTABLE_REFRESH_SUBJECT");
       this.v = this.t8("LIVE_GZONE_TURNTABLE_TASK_REFRESH_SUBJECT");
       this.y = this.r8("LIVE_GZONE_TURNTABLE_SCROLLVIEW_SCROLL_SUBJECT");
       return;
    }
}
