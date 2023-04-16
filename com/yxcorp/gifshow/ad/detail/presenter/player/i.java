package com.yxcorp.gifshow.ad.detail.presenter.player.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.player.i$a;
import com.yxcorp.gifshow.ad.detail.presenter.player.i$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d19.j;
import im8.f;
import xl8.b;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import android.widget.FrameLayout;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import sc6.b;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import brd.t;
import d19.k;
import com.yxcorp.gifshow.ad.detail.presenter.player.h;
import erd.g;
import crd.b;
import java.lang.StringBuilder;
import android.app.Activity;
import yx.j0;
import android.view.View;
import ekd.m1;
import sc6.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class i extends PresenterV2	// class@001682
{
    public final b A;
    public final a B;
    public KwaiContentFrame p;
    public c q;
    public f r;
    public PhotoDetailParam s;
    public a t;
    public List u;
    public BaseFragment v;
    public b w;
    public QPhoto x;
    public SlidePlayViewModel y;
    public boolean z;

    public void i(){
       super();
       this.A = new i$a(this);
       this.B = new i$b(this);
    }
    public void E8(){
       int i;
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       i tr = this.r;
       if (tr != null) {
          tr.set(new j(this));
       }
       i = this.w.a().intValue();
       int i1 = 2;
       if (i == i1 || i == 3) {
          this.P8("page is about finish abort init ");
          return;
       }else if(this.x.isVideoType()){
          this.p.setVisibility(0);
       }else {
          this.p.setVisibility(8);
       }
       if (this.s.getDetailPlayConfig().isUseSurfaceView()) {
          this.p.setSurfaceType(i1);
       }else {
          this.p.setSurfaceType(0);
       }
       this.R8(i);
       this.p.setPlayer(this.t.getPlayer());
       this.p.b(this.A);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.v.getParentFragment());
       this.y = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.v, this.B);
       }else {
          tr = this.u;
          if (tr != null) {
             tr.add(this.B);
          }
       }
       this.X7(this.w.b().subscribe(new k(this), h.b));
       this.p.setEnableUseCoverWhenPause(0);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       this.p.x();
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "4")) {
          return;
       }
       this.p.z(this.A);
       this.p.setPlayer(objArray);
       i ty = this.y;
       if (ty != null) {
          ty.D(this.v, this.B);
       }else {
          ty = this.u;
          if (ty == null) {
             ty.remove(this.B);
          }
       }
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "8")) {
          return;
       }
       i tx = this.x;
       String userName = (tx != null)? tx.getUserName(): "";
       Object[] objArray = new Object[0];
       j0.f("SlideSurfaceFramePresen", userName+" "+this.getActivity()+" "+p0, objArray);
       return;
    }
    public void R8(int p0){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "7")) {
          return;
       }
       this.P8("NonAttachSwipe "+p0);
       i = 1;
       if (p0 == i) {
          this.p.u();
          this.p.setDisableFrame(i);
       }else if(p0 == 5){
          this.p.setDisableFrame(false);
          this.p.A();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3120);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.q = this.r8("DETAIL_SURFACE_LISTENERS");
       this.s = this.q8(PhotoDetailParam.class);
       this.t = this.q8(a.class);
       this.u = this.r8("DETAIL_ATTACH_LISTENERS");
       this.v = this.r8("DETAIL_FRAGMENT");
       this.w = this.r8("SLIDE_SWIPE_EXIT_STATE");
       this.x = this.q8(QPhoto.class);
       this.r = this.w8("DETAIL_FOLLOW_CARD_BITMAP");
       return;
    }
}
