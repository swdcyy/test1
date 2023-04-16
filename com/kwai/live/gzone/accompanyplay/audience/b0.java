package com.kwai.live.gzone.accompanyplay.audience.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k37.r;
import android.view.ViewOutlineProvider;
import android.view.View;
import com.kwai.live.gzone.accompanyplay.audience.b0$d;
import com.kwai.live.gzone.accompanyplay.audience.b0$a;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.live.gzone.accompanyplay.audience.b0$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import brd.t;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import k37.q;
import com.kwai.live.gzone.accompanyplay.audience.a0;
import erd.g;
import crd.b;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import l0d.d;
import xb.t$b;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAccompanyTabHostFragment$e;

public class b0 extends PresenterV2	// class@000b6d
{
    public KwaiBindableImageView A;
    public KwaiBindableImageView B;
    public KwaiBindableImageView C;
    public View D;
    public TextView E;
    public View F;
    public k0$g p;
    public LiveGzoneAccompanyTabHostFragment$e q;
    public TextView r;
    public TextView s;
    public TextView t;
    public TextView u;
    public RecyclerView v;
    public b0$d w;
    public KwaiImageView x;
    public KwaiImageView y;
    public RecyclerView$n z;

    public void b0(){
       super();
    }
    public void E8(){
       b0 uob0 = b0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob0, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob0, "4")) {
          this.D.setOutlineProvider(new r(this));
       }
       b0$d uod = new b0$d(objArray);
       this.w = uod;
       uod.e = new b0$a(this);
       uob0 = this.z;
       if (uob0 != null) {
          this.v.removeItemDecoration(uob0);
       }
       b0$b uob = new b0$b(this);
       this.z = uob;
       this.v.addItemDecoration(uob);
       this.w.h = this.p;
       this.v.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
       this.v.setAdapter(this.w);
       this.X7(this.p.n().subscribe(new q(this), a0.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "8")) {
          return;
       }
       this.v.setAdapter(null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "2")) {
          return;
       }
       this.D = m1.f(p0, 0x7f0a11cb);
       this.r = m1.f(p0, 0x7f0a11e8);
       this.E = m1.f(p0, 0x7f0a11fd);
       this.s = m1.f(p0, 0x7f0a11ca);
       this.t = m1.f(p0, 0x7f0a11d4);
       this.v = m1.f(p0, 0x7f0a11df);
       this.x = m1.f(p0, 0x7f0a11c4);
       this.F = m1.f(p0, 0x7f0a11ff);
       this.y = m1.f(p0, 0x7f0a11c5);
       this.u = m1.f(p0, 0x7f0a11e0);
       this.A = m1.f(p0, 0x7f0a0f05);
       this.B = m1.f(p0, 0x7f0a0f06);
       this.C = m1.f(p0, 0x7f0a0f07);
       this.x.getHierarchy().u(new d());
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       this.q = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_TAB_HOST_SERVICE");
       return;
    }
}
