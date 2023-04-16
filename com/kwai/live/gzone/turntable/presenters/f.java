package com.kwai.live.gzone.turntable.presenters.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n77.f;
import com.kwai.live.gzone.turntable.presenters.h;
import n77.f$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.live.gzone.turntable.presenters.i;
import com.kwai.live.gzone.turntable.widget.a$a;
import com.kwai.live.gzone.turntable.widget.LiveGzoneTurntableCoreView;
import java.util.Objects;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import y43.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import o77.l;
import erd.g;
import crd.b;
import com.kwai.live.gzone.turntable.presenters.f$a;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import com.kwai.live.gzone.turntable.presenters.f$b;
import com.kwai.live.gzone.turntable.presenters.f$c;
import com.kwai.live.gzone.turntable.presenters.g;
import n77.n;
import o77.u;
import o77.v;
import com.kwai.library.widget.popup.common.c;
import android.view.View;
import r67.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import boc.d0;
import ac.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lnc.a1;
import androidx.fragment.app.Fragment;
import com.kwai.live.gzone.widget.f$b;
import androidx.fragment.app.FragmentActivity;
import com.kwai.live.gzone.turntable.presenters.f$d;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.ScrollView;
import o77.k;
import android.view.View$OnClickListener;
import o77.r;
import o77.s;
import o77.n;
import o77.o;
import o77.p;
import com.kwai.live.gzone.widget.e;
import r67.a;
import mrd.c;

public class f extends PresenterV2	// class@000e66
{
    public RecyclerView A;
    public View B;
    public KwaiImageView C;
    public TextView D;
    public TextView E;
    public LiveGzoneTurntableCoreView F;
    public KwaiImageView G;
    public KwaiImageView H;
    public KwaiImageView I;
    public c J;
    public boolean K;
    public f L;
    public f M;
    public String N;
    public String O;
    public a p;
    public n q;
    public e r;
    public a s;
    public LiveGzoneTurntableLogger t;
    public c u;
    public c v;
    public c w;
    public t x;
    public View y;
    public ScrollView z;

    public void f(){
       super();
    }
    public void E8(){
       f tp;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "3")) {
          return;
       }
       boolean b = true;
       this.K = b;
       if (!PatchProxy.applyVoid(objArray, this, uof, "9")) {
          f uof1 = new f(new h(this));
          this.M = uof1;
          this.A.setAdapter(uof1);
          this.A.setLayoutManager(new LinearLayoutManager(this.getContext(), b, false));
          this.W8();
          this.F.setListener(new i(this));
          tp = this.t;
          Objects.requireNonNull(tp);
          if (!PatchProxy.applyVoid(objArray, tp, LiveGzoneTurntableLogger.class, "44")) {
             tp.j("SHOW_LIVE_TURNTABLE_TASK_ARROW");
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "5")) {
          this.X7(this.p.m.b().m().subscribe(new l(this)));
       }
       tp = this.p;
       if (tp.s != null) {
          tp.K.P4(new f$a(this));
       }
       this.X7(this.v.subscribe(new f$b(this)));
       this.X7(this.x.subscribe(new f$c(this)));
       if (!PatchProxy.applyVoid(objArray, this, uof, "4")) {
          uof = this.w;
          if (uof == null) {
             this.F.d();
          }else {
             this.X7(uof.subscribe(new g(this)));
          }
       }
       this.X7(this.q.l.subscribe(new u(this)));
       this.X7(this.q.m.subscribe(new v(this)));
       return;
    }
    public void J8(){
       f uof = f.class;
       if (PatchProxy.applyVoid(null, this, uof, "7")) {
          return;
       }
       this.K = false;
       f tF = this.F;
       if (tF != null) {
          tF.release();
       }
       this.S8();
       if (!PatchProxy.applyVoid(null, this, uof, "23")) {
          uof = this.L;
          if (uof != null && uof.K()) {
             this.L.q(false);
          }
          this.L = null;
       }
       return;
    }
    public final void P8(View p0){
       f tt;
       LiveGzoneTurntableLogger liveGzoneTur = LiveGzoneTurntableLogger.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "21")) {
          return;
       }
       this.V8();
       if (p0.getId() == 0x7f0a40c9) {
          tt = this.t;
          Objects.requireNonNull(tt);
          if (!PatchProxy.applyVoid(null, tt, liveGzoneTur, "11")) {
             tt.i("LIVE_TURNTABLE_RECORD_BUTTON");
          }
          this.Y8(this.O);
       }else if(p0.getId() == 0x7f0a40cb){
          tt = this.t;
          Objects.requireNonNull(tt);
          if (!PatchProxy.applyVoid(null, tt, liveGzoneTur, "10")) {
             tt.i("LIVE_TURNTABLE_GAME_RULE_BUTTON");
          }
          this.Y8(this.N);
       }
       return;
    }
    public final void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "24")) {
          return;
       }
       this.V8();
       this.s.j7();
       f tt = this.t;
       Objects.requireNonNull(tt);
       if (!PatchProxy.applyVoid(objArray, tt, LiveGzoneTurntableLogger.class, "43")) {
          tt.i("CLICK_LIVE_TURNTABLE_TASK_ARROW");
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       f tJ = this.J;
       if (tJ != null && tJ.K()) {
          this.J.q(1);
          this.J = null;
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, f.class, "20")) {
          return;
       }
       if (this.B.getVisibility() == 8) {
          return;
       }
       this.B.setVisibility(8);
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, f.class, "10")) {
          return;
       }
       d0.c(this.G, "https://static.yximgs.com/udata/pkg/kwai-client-image/live_gzone_audience_turntable_panel_background.3ccfca67.png", false);
       d0.c(this.H, "https://static.yximgs.com/udata/pkg/kwai-client-image/live_gzone_audience_turntable_operate_background.webp", false);
       d0.c(this.I, "https://static.yximgs.com/udata/pkg/kwai-client-image/live_gzone_audience_turntable_prizes_background.png", false);
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, f.class, "11")) {
          return;
       }
       this.G.setController(null);
       this.H.setController(null);
       this.I.setController(null);
       return;
    }
    public final void Y8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "22")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       if (a1.i(activity) && this.p.m.b().isAdded()) {
          f$b uob = new f$b(activity);
          uob.g0(p0);
          f$d uod = new f$d(this, uob);
          this.L = uod;
          uod.Z();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.G = m1.f(p0, 0x7f0a26f7);
       this.H = m1.f(p0, 0x7f0a1e5e);
       this.I = m1.f(p0, 0x7f0a1e5f);
       this.A = m1.f(p0, 0x7f0a1e81);
       this.B = m1.f(p0, 0x7f0a40c7);
       this.F = m1.f(p0, 0x7f0a1e72);
       this.E = m1.f(p0, 0x7f0a40c5);
       this.D = m1.f(p0, 0x7f0a40c8);
       this.z = m1.f(p0, 0x7f0a40cc);
       this.y = m1.f(p0, 0x7f0a40c9);
       this.C = m1.f(p0, 0x7f0a40c6);
       m1.a(p0, new k(this), R.id.turntable_prize_tips_close);
       m1.a(p0, new r(this), R.id.turntable_record);
       m1.a(p0, new s(this), R.id.turntable_rule);
       m1.a(p0, new n(this), R.id.turntable_obtain_opportunity);
       m1.a(p0, new o(this), R.id.live_turntable_task_guid_arrow_view);
       m1.a(p0, new p(this), R.id.live_gzone_audience_turntable_content_layout);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.q8(n.class);
       this.r = this.t8("LIVE_TURNTABLE_MAIN_POPUP");
       this.s = this.r8("LIVE_TURNTABLE_PRIZE_SERVICE");
       this.t = this.r8("LIVE_TURNTABLE_LOGGER");
       this.u = this.r8("LIVE_TURNTABLE_DISMISS_SUBJECT");
       this.v = this.r8("LIVE_TURNTABLE_OPPORTUNITY_COUNT_SUBJECT");
       this.w = this.t8("LIVE_GZONE_TURNTABLE_TAB_SELECTED_SUBJECT");
       this.x = this.r8("LIVE_GZONE_TURNTABLE_REFRESH_SUBJECT");
       return;
    }
}
