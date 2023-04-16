package com.kwai.live.gzone.turntable.presenters.LiveGzoneAudienceTurntableWelfareTaskPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.live.gzone.turntable.presenters.d;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import boc.d0;
import com.kwai.live.gzone.turntable.b;
import o77.j;
import y43.a;
import com.kwai.live.gzone.turntable.b$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import z8c.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneAudienceTurntableWelfareTaskPresenter$1;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import o77.i;
import android.view.ViewTreeObserver;
import com.kwai.live.gzone.turntable.presenters.LiveGzoneAudienceTurntableWelfareTaskPresenter$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.live.gzone.widget.e;
import com.kwai.live.gzone.turntable.LiveGzoneTurntableLogger;
import mrd.c;

public class LiveGzoneAudienceTurntableWelfareTaskPresenter extends PresenterV2	// class@000e4d
{
    public KwaiImageView A;
    public View B;
    public b C;
    public a D;
    public a p;
    public e q;
    public LiveGzoneTurntableLogger r;
    public c s;
    public c t;
    public c u;
    public c v;
    public t w;
    public View x;
    public RecyclerView y;
    public View z;

    public void LiveGzoneAudienceTurntableWelfareTaskPresenter(){
       super();
    }
    public void E8(){
       LiveGzoneAudienceTurntableWelfareTaskPresenter liveGzoneAud = LiveGzoneAudienceTurntableWelfareTaskPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveGzoneAud, "3")) {
          return;
       }
       this.B = this.m8();
       if (!PatchProxy.applyVoid(objArray, this, liveGzoneAud, "7")) {
          this.X7(this.t.subscribe(new d(this)));
       }
       d0.c(this.A, "https://static.yximgs.com/udata/pkg/kwai-client-image/live_gzone_audience_turntable_task_title_background.webp", true);
       if (!PatchProxy.applyVoid(objArray, this, liveGzoneAud, "4")) {
          b uob = new b(this.p, new j(this));
          this.C = uob;
          this.y.setAdapter(uob);
       }
       LiveGzoneAudienceTurntableWelfareTaskPresenter tD = this.D;
       if (tD != null) {
          this.y.removeItemDecoration(tD);
       }
       a uoa = new a(true, false, false);
       this.D = uoa;
       uoa.o(a1.f(R.drawable.arg_RES_7f08123f));
       this.y.addItemDecoration(this.D);
       this.y.setLayoutManager(new LiveGzoneAudienceTurntableWelfareTaskPresenter$1(this, this.getContext(), true, false));
       this.y.setNestedScrollingEnabled(false);
       this.y.setHasFixedSize(true);
       if (!PatchProxy.applyVoid(objArray, this, liveGzoneAud, "5")) {
          liveGzoneAud = this.s;
          if (liveGzoneAud != null) {
             this.X7(liveGzoneAud.subscribe(new i(this)));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceTurntableWelfareTaskPresenter.class, "6")) {
          return;
       }
       this.y.setAdapter(null);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceTurntableWelfareTaskPresenter.class, "9")) {
          return;
       }
       this.z.getViewTreeObserver().addOnGlobalLayoutListener(new LiveGzoneAudienceTurntableWelfareTaskPresenter$a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAudienceTurntableWelfareTaskPresenter.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a1e88);
       this.y = m1.f(p0, 0x7f0a1e89);
       this.z = m1.f(p0, 0x7f0a1e8a);
       this.A = m1.f(p0, 0x7f0a1e8b);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAudienceTurntableWelfareTaskPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.t8("LIVE_TURNTABLE_MAIN_POPUP");
       this.r = this.r8("LIVE_TURNTABLE_LOGGER");
       this.s = this.t8("LIVE_GZONE_TURNTABLE_WELFARE_TASK_SUBJECT");
       this.t = this.r8("LIVE_GZONE_TURNTABLE_SCROLLVIEW_SCROLL_SUBJECT");
       this.u = this.r8("LIVE_GZONE_TURNTABLE_WELFARE_TASK_NEED_REFRESH_ON_RESUME_SUBJECT");
       this.v = this.t8("LIVE_GZONE_TURNTABLE_TAB_SELECTED_SUBJECT");
       this.w = this.t8("LIVE_GZONE_TURNTABLE_TASK_REFRESH_SUBJECT");
       return;
    }
}
