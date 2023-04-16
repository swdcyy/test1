package com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter;
import im8.g;
import k51.c;
import io.reactivex.subjects.PublishSubject;
import z31.g;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter$a;
import z31.f;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sr5.a;
import u53.b;
import t02.a0;
import lnc.a1;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import k67.e;
import ekd.m1;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import android.app.Activity;
import va1.i0;
import com.kuaishou.live.audience.gzone.v2.pendant.b;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter$c;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter$d;
import lv1.d;
import z31.i;
import p91.m;
import o02.f;
import o02.e;
import brd.t;
import ekd.k1;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.audience.gzone.v2.pendant.c;
import erd.g;
import crd.b;
import kq5.b;
import androidx.fragment.app.c$b;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import k67.m;
import k67.c;
import java.util.List;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzoneActivityPendantView;
import com.kwai.robust.PatchProxyResult;
import z31.n;
import java.util.Map;
import java.util.HashMap;
import pq5.c;

public class LiveGzonePendantViewPagerPresenter extends c implements g	// class@000c3a
{
    public c A;
    public String B;
    public final m C;
    public c$b D;
    public b E;
    public a F;
    public boolean p;
    public int q;
    public ViewPager r;
    public LinearLayout s;
    public View t;
    public PublishSubject u;
    public b v;
    public List w;
    public View x;
    public m y;
    public a0 z;
    public static String sLivePresenterClassName = "LiveGzonePendantViewPagerPresenter";

    public void LiveGzonePendantViewPagerPresenter(){
       super();
       this.u = PublishSubject.g();
       this.B = "";
       this.C = new g(this);
       this.D = new LiveGzonePendantViewPagerPresenter$a(this);
       this.E = new f(this);
       this.F = new LiveGzonePendantViewPagerPresenter$b(this);
    }
    public void E8(){
       View view;
       LiveGzonePendantViewPagerPresenter liveGzonePen = LiveGzonePendantViewPagerPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveGzonePen, "4")) {
          return;
       }
       boolean b = b.g(this.z);
       int i = 1;
       boolean b1 = (this.z.R1 != null)? true: false;
       this.p = b1;
       if (!PatchProxy.applyVoid(objArray, this, liveGzonePen, "5")) {
          this.q = a1.e(2.00f);
          if (this.t == null) {
             if (this.p != null) {
                view = a.a(this.getContext(), R.layout.arg_RES_7f0d0bd4);
                this.t = view;
                view.setLayoutParams(new ViewGroup$LayoutParams(e.c, e.b));
             }else {
                view = a.a(this.getContext(), R.layout.arg_RES_7f0d0bd6);
                this.t = view;
                view.setLayoutParams(new ViewGroup$LayoutParams(e.a, -2));
             }
             this.s = m1.f(this.t, 0x7f0a224e);
             this.r = m1.f(this.t, 0x7f0a224d);
          }
       }
       i0.b(this.getActivity(), this.t);
       Context context = this.getContext();
       LiveGzonePendantViewPagerPresenter tr = this.r;
       LiveGzonePendantViewPagerPresenter ts = this.s;
       LiveGzonePendantViewPagerPresenter tt = this.t;
       boolean b2 = (this.z != null && b)? true: false;
       b uob = new b(context, tr, ts, tt, b2, this.p);
       this.v = b1;
       b1.k = new LiveGzonePendantViewPagerPresenter$c(this, b);
       b1.f = new LiveGzonePendantViewPagerPresenter$d(this);
       if (!PatchProxy.applyVoid(objArray, this, liveGzonePen, "12")) {
          this.y.b = new i(this);
       }
       if (!PatchProxy.applyVoid(objArray, this, liveGzonePen, "6")) {
          this.X7(t.timer(k1.k(2000), TimeUnit.MILLISECONDS).subscribe(new c(this, e.a().D(this.y.getLiveStreamId(), this.y.h("")))));
       }
       this.y.k().c(this.D);
       liveGzonePen = this.z;
       if (liveGzonePen != null) {
          a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.GUEST_ACTIVITY,AudienceBizRelation.GAME_INTERACTIVE};
          liveGzonePen.N().u5(this.E, uoaArray);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveGzonePendantViewPagerPresenter.class, "14")) {
          return;
       }
       LiveGzonePendantViewPagerPresenter tv = this.v;
       if (tv != null) {
          tv.b();
          this.R8();
       }
       a0 s1 = this.z.S1;
       if (s1 != null) {
          s1.N0(this.C);
       }
       i0.e(this.getActivity(), this.t);
       this.y.k().a(this.D);
       tv = this.z;
       if (tv != null) {
          a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY,AudienceBizRelation.GUEST_ACTIVITY,AudienceBizRelation.GAME_INTERACTIVE};
          tv.N().G5(this.E, uoaArray);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, LiveGzonePendantViewPagerPresenter.class, "8")) {
          return;
       }
       if (this.p != null) {
          this.z.S1.O0(this.C);
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, LiveGzonePendantViewPagerPresenter.class, "13")) {
          return;
       }
       if (this.w == null) {
          return;
       }
       for (int i = 0; i < this.w.size(); i = i + 1) {
          this.w.get(i).b();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzonePendantViewPagerPresenter.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a224e);
       this.r = m1.f(p0, 0x7f0a224d);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzonePendantViewPagerPresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveGzonePendantViewPagerPresenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveGzonePendantViewPagerPresenter.class, new n());
       }else {
          obj.put(LiveGzonePendantViewPagerPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveGzonePendantViewPagerPresenter.class, "1")) {
          return;
       }
       this.y = this.r8("LIVE_BASIC_CONTEXT");
       this.z = this.s8(a0.class);
       this.A = this.q8(c.class);
       return;
    }
}
