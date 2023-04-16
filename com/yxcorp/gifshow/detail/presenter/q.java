package com.yxcorp.gifshow.detail.presenter.q;
import od5.f;
import com.yxcorp.gifshow.detail.presenter.p;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.detail.presenter.q$a;
import y4a.h0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uc6.c;
import sd5.d;
import uy6.h;
import uy6.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import vy6.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import y4a.i0;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.gifshow.detail.PhotoDetailActivity;
import hn5.n;
import hn5.m;
import android.content.Context;
import tkd.b;
import tkd.d;
import ilc.i;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import sd5.c;
import im8.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class q extends f	// class@0016f9
{
    public KwaiImageView C;
    public d D;
    public c E;
    public View F;
    public SlidePlayViewModel G;
    public BaseFragment H;
    public a I;
    public t J;
    public boolean K;
    public final a L;
    public final IMediaPlayer$OnInfoListener M;
    public static final x N;

    static {
       q.N = Suppliers.a(p.b);
    }
    public void q(){
       super();
       this.L = new q$a(this);
       this.M = new h0(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q.class, "7")) {
          return;
       }
       this.E = this.D.N();
       int i = 0;
       if (h.a.v != null) {
          this.P8().getHierarchy().x(i);
       }
       if (!this.X8()) {
          return;
       }else {
          this.Y8((this.I.getPlayer().isPrepared() ^ 0x01));
          this.C.setVisibility(8);
          this.K = i;
          super.E8();
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.H.getParentFragment());
          this.G = slidePlayVie;
          if (slidePlayVie != null) {
             if (SlidePerformanceExp.c()) {
                this.G.r0(this.H, this.L);
             }else {
                this.G.P(this.H, this.L);
             }
          }
          this.I.getPlayer().addOnInfoListener(this.M);
          this.X7(this.J.subscribe(new i0(this)));
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q.class, "8")) {
          return;
       }
       if (!this.X8()) {
          return;
       }
       q tG = this.G;
       if (tG != null) {
          tG.q0(this.H, this.L);
       }
       this.I.getPlayer().removeOnInfoListener(this.M);
       return;
    }
    public KwaiImageView P8(){
       Object obj = PatchProxy.apply(null, this, q.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.getCover();
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, q.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getActivity() instanceof PhotoDetailActivity;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, q.class, "4")) {
          return;
       }
       super.S8();
       this.K = true;
       this.Y8(false);
       return;
    }
    public boolean W8(){
       Object obj = PatchProxy.apply(null, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!m.a().U3(this.getActivity()) && (d.a(0x681d4627).r1(this.q) || r1.d3(this.q.getEntity())))? true: false;
       return b;
    }
    public final boolean X8(){
       Object obj = PatchProxy.apply(null, this, q.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.q.isVideoType();
    }
    public void Y8(boolean p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oq, "11")) {
          return;
       }
       oq = this.F;
       if (oq != null) {
          int i = (p0)? 0: 8;
          oq.setVisibility(i);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.C = m1.f(p0, 0x7f0a319f);
       this.F = m1.f(p0, 0x7f0a302f);
       d uod = c.a(m1.f(p0, R.id.texture_view_frame));
       this.D = uod;
       this.W7(uod);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       super.j8();
       this.H = this.r8("DETAIL_FRAGMENT");
       this.I = this.q8(a.class);
       this.J = this.r8("DETAIL_POSTER_EVENT");
       return;
    }
}
