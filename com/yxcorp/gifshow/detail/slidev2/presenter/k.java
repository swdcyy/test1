package com.yxcorp.gifshow.detail.slidev2.presenter.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.k$a;
import b8a.i0;
import b8a.h0;
import rd5.j;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import d0a.o;
import java.lang.Object;
import brd.y;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import tkd.b;
import tkd.d;
import vt5.e;
import android.app.Activity;
import st5.b$j;
import st5.b;
import kzc.c;
import cg6.b;
import com.yxcorp.gifshow.widget.popup.c;
import java.util.List;
import java.util.Iterator;
import com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.j;
import erd.g;
import crd.b;
import brd.t;
import b8a.j0;
import xx9.a;
import b8a.l0;
import b8a.m0;
import b8a.k0;
import p5a.e;
import de5.a;
import gc6.m;
import com.kwai.framework.player.core.b;
import r7a.b;
import android.content.Context;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import java.lang.Float;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Boolean;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class k extends PresenterV2	// class@0019c1
{
    public f A;
    public b B;
    public t C;
    public y D;
    public t E;
    public boolean F;
    public final a G;
    public float H;
    public float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final b$a M;
    public final m N;
    public BaseFragment p;
    public ScaleHelpView q;
    public QPhoto r;
    public a s;
    public y t;
    public t u;
    public y v;
    public t w;
    public y x;
    public a y;
    public SlidePlayViewModel z;

    public void k(){
       super();
       this.G = new k$a(this);
       this.M = new i0(this);
       this.N = new h0(this);
    }
    public static void P8(k p0,j p1){
       p0.S8(p1);
    }
    private void S8(j p0){
       if (p0.a == ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN && this.F != null) {
          int i = -1094279325;
          if (p0.b != null) {
             this.v.onNext(new o(0));
             this.A.get().logExitCleanScreen();
             d.a(i).zb(this.getActivity(), b$j.b);
             b.a().v(6);
          }else {
             this.A.get().logEnterCleanScreen();
             d.a(i).j40(this.getActivity(), b$j.b);
             List list = b.a().l(this.getActivity());
             if (list != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   if (uoa.K()) {
                      uoa.o();
                   }
                }
             }
             b.a().u(6);
          }
       }
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p.getParentFragment());
       this.z = slidePlayVie;
       slidePlayVie.P(this.p, this.G);
       this.X7(this.u.subscribe(new j(this)));
       this.X7(this.s.h(new j0(this)));
       this.X7(this.w.subscribe(new l0(this)));
       this.X7(this.E.subscribe(new m0(this)));
       k tC = this.C;
       if (tC != null) {
          this.X7(tC.subscribe(new k0(this)));
       }
       this.y.getPlayer().X(this.N);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       b uob = new b(this.getContext(), new GestureDetector$SimpleOnGestureListener());
       this.B = uob;
       uob.a = this.M;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "5")) {
          return;
       }
       this.z.D(this.p, this.G);
       this.q.j(this.B);
       this.y.getPlayer().M(this.N);
       return;
    }
    public final void R8(float p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ok, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MULTIPLE_SPEED_CHOICE_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("click_duraiton", Long.valueOf(this.y.getPlayer().getCurrentPosition()));
       if (this.y.getPlayer().getIKwaiMediaPlayer() != null) {
          oi3.c("fomer_speed_num", Float.valueOf(this.y.getPlayer().getIKwaiMediaPlayer().getSpeed(0x3f800000)));
       }
       oi3.c("photo_duration", Long.valueOf(this.r.getVideoDuration()));
       oi3.d("show_pos", "PORTRAIT");
       oi3.c("speed_num", Float.valueOf(p0));
       oi3.c("is_simplify_screen", Integer.valueOf(1));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.r.getEntity());
       u1.M("", this.p, 1, uElementPack, uContentPack, null);
       return;
    }
    public final void V8(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SIMPLIFY_SCREEN";
       i3 oi3 = i3.f();
       oi3.d("status", "OFF");
       String str = (p0)? "CLICK": "SLIDE";
       oi3.d("hand_gesture", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.r.getEntity());
       u1.M("", this.p, 1, uElementPack, uContentPack, null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2a96);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.p = this.r8("DETAIL_FRAGMENT");
       this.r = this.q8(QPhoto.class);
       this.u = this.r8("NASA_SCALE_CLEAN_CONTROLLER_EVENT_OBSERVABLE");
       this.s = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.x = this.r8("NASA_DETAIL_PLAY_PAUSE_OBSERVER");
       this.y = this.q8(a.class);
       this.v = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVER");
       this.A = this.x8("DETAIL_LOGGER");
       this.w = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVABLE");
       this.C = this.t8("MORE_OPERATION_PANEL_SHOW_OBSERVABLE");
       this.D = this.r8("NASA_SCALE_CLEAN_SPEED_CHANGED_OBSERVER");
       this.t = this.r8("NASA_SCALE_CLEAN_CONTROLLER_EVENT_OBSERVER");
       this.E = this.r8("PREPARE_PICTURE_IN_PICTURE_MODE_OBSERVABLE");
       return;
    }
}
