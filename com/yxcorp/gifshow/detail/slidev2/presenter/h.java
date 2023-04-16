package com.yxcorp.gifshow.detail.slidev2.presenter.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.a;
import java.lang.Float;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import com.yxcorp.gifshow.detail.slidev2.presenter.h$a;
import b8a.z;
import com.yxcorp.gifshow.detail.slidev2.presenter.h$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.nasa.NasaShootRefreshView;
import com.yxcorp.gifshow.nasa.NasaShootRefreshView$c;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.detail.slidev2.presenter.h$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.player.panel.config.SlidePlayerPanelConfig;
import com.yxcorp.gifshow.detail.player.panel.config.PlayerPanelConfigHelper;
import com.yxcorp.gifshow.entity.QPhoto;
import o56.f;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.widget.TextView;
import com.yxcorp.gifshow.detail.slidev2.presenter.h$d;
import com.yxcorp.gifshow.model.CDNUrl;
import p5a.b;
import ekd.j;
import p5a.e;
import de5.a;
import m9a.y;
import gc6.m;
import com.kwai.framework.player.core.b;
import b8a.x;
import le5.f;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import android.widget.ImageView;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.kwai.feature.api.pendant.viewmodel.PendantPlayerStateVM;
import b8a.y;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.detail.slidev2.presenter.h$e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.CharSequence;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.StringBuilder;
import i3a.b;
import android.view.ViewStub;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import w85.a;

public class h extends PresenterV2	// class@0019ba
{
    public SlidePlayViewModel A;
    public final a B;
    public a C;
    public a D;
    public PhotoDetailParam E;
    public PublishSubject F;
    public boolean G;
    public final List H;
    public final a I;
    public final m J;
    public final NasaShootRefreshView$c K;
    public View p;
    public View q;
    public View r;
    public TextView s;
    public ImageView t;
    public View u;
    public NasaShootRefreshView v;
    public PublishSubject w;
    public QPhoto x;
    public BaseFragment y;
    public NasaBizParam z;

    public void h(){
       super();
       this.B = new a();
       Float[] uFloatArray = new Float[]{Float.valueOf(0x3f000000),Float.valueOf(0x3f400000),Float.valueOf(0x3f800000),Float.valueOf(0x3fa00000),Float.valueOf(0x3fc00000),Float.valueOf(2.00f)};
       this.H = Arrays.asList(uFloatArray);
       this.I = new h$a(this);
       this.J = new z(this);
       this.K = new h$b(this);
    }
    public void E8(){
       int i;
       boolean b;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.y.getParentFragment());
       this.A = slidePlayVie;
       slidePlayVie.P(this.y, this.I);
       if (this.y.getParentFragment() == null) {
          return;
       }
       View view = this.y.getParentFragment().getView();
       if (view == null) {
          return;
       }
       this.G = false;
       NasaShootRefreshView nasaShootRef = m1.f(view, R.id.slide_shoot_refresh_view);
       this.v = nasaShootRef;
       if (nasaShootRef != null) {
          nasaShootRef.a(this.K);
       }
       this.p.setVisibility(8);
       if (i.c()) {
          ViewGroup$MarginLayoutParams layoutParams = this.p.getLayoutParams();
          layoutParams.topMargin = n.A(this.getContext());
          this.p.setLayoutParams(layoutParams);
       }
       this.q.setOnClickListener(new h$c(this));
       this.u.setVisibility(false);
       i = 1;
       if (NasaExperimentUtils.R() == i) {
          Object obj = PatchProxy.apply(objArray, this, oh, "10");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(PlayerPanelConfigHelper.a().isSmallWindowEnable() && (this.x.isVideoType() && (!this.x.isAd() && (!this.x.isLiveStream() && NasaExperimentUtils.X())))){
             obj = PatchProxy.apply(objArray, this, oh, "11");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(!f.b(this.getContext()) && (NasaExperimentUtils.w() || this.z.getNasaSlideParam().isHomeFeatureStyle())){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                b = true;
             }
          }
       label_00f1 :
          b = false;
          if (b) {
             this.r.setVisibility(false);
             this.s.setVisibility(4);
             this.r.setOnClickListener(new h$d(this));
          }else if(NasaExperimentUtils.R() == 2){
             Object obj1 = PatchProxy.apply(objArray, this, oh, "5");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(this.x.isSinglePhoto() && j.h(b.b(this.x))){
                i = 0;
             }
             b1 = i;
             if (!b1) {
                this.s.setVisibility(false);
                this.r.setVisibility(4);
                if (this.C.getPlayer() != null) {
                   this.W8(y.d(this.C.getPlayer()));
                   this.C.getPlayer().X(this.J);
                }
                this.s.setOnClickListener(new x(this));
             }
          }
          this.u.setVisibility(8);
       }else {
          goto label_0109 ;
       }
       if (NasaExperimentUtils.x() && (f.g() || f.m(this.E))) {
          this.t.setVisibility(false);
          this.V8();
          FragmentActivity activity = this.getActivity();
          PendantPlayerStateVM.getInstance(activity).observerAutoPlayerState(activity, new y(this));
          this.t.setOnClickListener(new h$e(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "12")) {
          return;
       }
       this.A.D(this.y, this.I);
       if (this.C.getPlayer() != null) {
          this.C.getPlayer().M(this.J);
       }
       h tv = this.v;
       if (tv != null) {
          tv.e(this.K);
       }
       return;
    }
    public void P8(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh, "9")) {
          return;
       }
       if (p0 && this.G == null) {
          this.p.setVisibility(0);
          if (!PatchProxy.applyVoid(null, this, oh, "13")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PAUSE_FEATURE_BUTTON";
             i3 oi3 = i3.f();
             if (!this.s.getVisibility()) {
                oi3.d("accelerated_playback", this.s.getText().toString());
             }
             String str = "true";
             String str1 = "false";
             String str2 = (!this.r.getVisibility())? str: str1;
             oi3.d("small_window_feature", str2);
             if (this.t.getVisibility()) {
                str = str1;
             }
             oi3.d("auto_play_feature", str);
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(this.x.getEntity());
             u1.D0("", this.y, 0, uElementPack, uContentPack, null);
          }
       }else {
          this.p.setVisibility(8);
       }
       return;
    }
    public final String R8(float p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, oh, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = (int)p0;
       String str = (!((float)i - p0))? i+"x": p0+"x";
       return str;
    }
    public void S8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "14")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "PAUSE_FEATURE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("click_area", p0);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.x.getEntity());
       u1.M("", this.y, 1, uElementPack, uContentPack, null);
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       if (b.f()) {
          this.t.setImageResource(R.drawable.arg_RES_7f080a7f);
       }else {
          this.t.setImageResource(R.drawable.arg_RES_7f080a7e);
       }
       return;
    }
    public final void W8(float p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oh, "7")) {
          return;
       }
       this.s.setText(this.R8(p0));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       p0 = m1.f(p0, R.id.pause_broadcast_view_stub).inflate();
       this.p = p0;
       this.q = m1.f(p0, 0x7f0a2f93);
       this.r = m1.f(this.p, 0x7f0a2f94);
       this.s = m1.f(this.p, 0x7f0a2f95);
       this.t = m1.f(this.p, 0x7f0a2f92);
       this.u = m1.f(this.p, 0x7f0a2f91);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.y = this.r8("DETAIL_FRAGMENT");
       this.x = this.q8(QPhoto.class);
       this.z = this.q8(NasaBizParam.class);
       this.w = this.r8("NASA_PAUSE_BROADCAST_EVENT");
       this.C = this.q8(a.class);
       this.E = this.q8(PhotoDetailParam.class);
       this.D = this.q8(a.class);
       this.F = this.r8("show_more_operation_panel_action");
       return;
    }
}
