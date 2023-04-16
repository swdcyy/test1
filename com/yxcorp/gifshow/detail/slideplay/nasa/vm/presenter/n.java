package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.n;
import ze5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Random;
import brd.t;
import brd.a0;
import java.lang.Object;
import java.util.List;
import java.util.LinkedList;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.n$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.n$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import y6a.r0;
import erd.g;
import crd.b;
import vy6.a;
import android.content.res.Resources;
import cw9.c;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.n$c;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import ekd.m1;
import android.widget.RelativeLayout;
import de5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import com.kuaishou.android.model.mix.PhotoMeta;
import e1a.e;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserStatus;
import tkd.b;
import tkd.d;
import gx5.e;
import oe6.a;
import android.app.Activity;
import android.content.Context;
import com.airbnb.lottie.RenderMode;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import t9a.b;
import wkd.b;
import com.kwai.component.bifrost.BifrostActivityManager;
import com.yxcorp.gifshow.util.cdnresource.a;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import y6a.s0;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.cdnresource.f;

public class n extends PresenterV2 implements a	// class@001828
{
    public f A;
    public PhotoMeta B;
    public e C;
    public int D;
    public PublishSubject E;
    public List F;
    public List G;
    public PublishSubject H;
    public SlidePlayViewModel I;
    public int J;
    public final LinkedList K;
    public int L;
    public boolean M;
    public final h N;
    public final a O;
    public final Random p;
    public List q;
    public RelativeLayout r;
    public View s;
    public View t;
    public ViewGroup[] u;
    public a v;
    public QPhoto w;
    public PhotoDetailParam x;
    public PublishSubject y;
    public BaseFragment z;

    public void n(){
       super();
       this.p = new Random();
       this.q = t.range(-10, 20).toList().e();
       this.K = new LinkedList();
       this.M = true;
       this.N = new n$a(this);
       this.O = new n$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, n.class, "4")) {
          return;
       }
       this.I = SlidePlayViewModel.B0(this.z.getParentFragment());
       this.G.remove(this);
       this.G.add(this);
       this.X7(this.H.subscribe(new r0(this)));
       this.I.P(this.z, this.O);
       this.F.add(this.N);
       PatchProxy.onMethodExit(n.class, "4");
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoidWithListener(null, this, n.class, "3")) {
          return;
       }
       this.J = c.b(this.l8(), 0x7f070ea1);
       PatchProxy.onMethodExit(n.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, n.class, "5")) {
          return;
       }
       this.I.D(this.z, this.O);
       this.F.remove(this.N);
       this.G.remove(this);
       PatchProxy.onMethodExit(n.class, "5");
       return;
    }
    public boolean K(float p0,float p1){
       if (PatchProxy.isSupport2(n.class, "9")) {
          Object obj = PatchProxy.applyTwoRefsWithListener(Float.valueOf(p0), Float.valueOf(p1), this, n.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       PatchProxy.onMethodExit(n.class, "9");
       return this.o0(p0, p1);
    }
    public ViewGroup P8(){
       n tu = this.u;
       object oobject = (tu[0] != null)? tu[0]: this.r;
       return oobject;
    }
    public final void R8(LottieAnimationView p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, n.class, "8")) {
          return;
       }
       p0.setSpeed(0x3fa66666);
       p0.a(new n$c(this, p0));
       p0.s();
       PatchProxy.onMethodExit(n.class, "8");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, n.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a39f7);
       this.t = m1.f(p0, 0x7f0a2ec7);
       this.s = m1.f(p0, 0x7f0a39ab);
       PatchProxy.onMethodExit(n.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, n.class, "1")) {
          return;
       }
       this.u = this.r8("DETAIL_CHANGE_LIKE_CONTAINER");
       this.v = this.q8(a.class);
       this.w = this.q8(QPhoto.class);
       this.x = this.q8(PhotoDetailParam.class);
       this.y = this.r8("DETAIL_ADJUST_EVENT");
       this.z = this.r8("DETAIL_FRAGMENT");
       this.A = this.x8("LOG_LISTENER");
       this.B = this.q8(PhotoMeta.class);
       this.C = this.r8("DETAIL_GESTURE_CONFLICT_HELPER");
       this.D = this.r8("DETAIL_PHOTO_INDEX").intValue();
       this.E = this.r8("SLIDE_DETAIL_PAGE_CENTER_LIKE_ANIM");
       this.F = this.r8("DETAIL_TAP_CLICK_ADAPTER");
       this.G = this.r8("DETAIL_CLICK_LIKE_LISTENERS");
       this.H = this.r8("DETAIL_IMAGE_SINGLE_TAP_UP");
       PatchProxy.onMethodExit(n.class, "1");
       return;
    }
    public boolean o0(float p0,float p1){
       n obj1;
       Object obj = this;
       n on = n.class;
       if (PatchProxy.isSupport2(on, "10")) {
          obj1 = PatchProxy.applyTwoRefsWithListener(Float.valueOf(p0), Float.valueOf(p1), obj, on, "10");
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       obj1 = obj.C;
       Objects.requireNonNull(obj1);
       boolean b = true;
       obj1.c(0, b);
       if (obj.M != null || QCurrentUser.ME.isLogined()) {
          UserStatus userStatus = obj.w.getUserStatus();
          if (userStatus != null && userStatus.mIsLiked == null) {
             d.a(0xcb98120).ty(userStatus);
          }
       }
       if (a.B()) {
          a.c0(0);
       }
       if (!PatchProxy.isSupport2(on, "6") || !PatchProxy.applyVoidTwoRefsWithListener(Float.valueOf(p0), Float.valueOf(p1), obj, on, "6")) {
          boolean i = 0xbf800000;
          i = (p0 - i > 0 && p1 - i > 0)? true: false;
          n j = obj.J;
          if (!i) {
             j = (int)((float)j * 0x3f99999a);
          }
          n on1 = j;
          LottieAnimationView lottieAnimat = obj.K.pollFirst();
          ViewGroup viewGroup = this.P8();
          if (lottieAnimat == null) {
             lottieAnimat = new LottieAnimationView(this.getActivity());
             lottieAnimat.setRenderMode(RenderMode.HARDWARE);
             lottieAnimat.k(b);
             viewGroup.addView(lottieAnimat, new RelativeLayout$LayoutParams(obj.J, obj.J));
          }
          ViewGroup$LayoutParams layoutParams = lottieAnimat.getLayoutParams();
          layoutParams.width = on1;
          layoutParams.height = on1;
          int i1 = 13;
          float f = 2.00f;
          if (i) {
             float f1 = (float)on1;
             f = f1 / f;
             float f2 = p0 - f;
             lottieAnimat.setTranslationX(f2);
             lottieAnimat.setTranslationY(((p1 - f) - ((float)obj.J / 3.00f)));
             n q = obj.q;
             lottieAnimat.setRotation((float)q.get(obj.p.nextInt(q.size())).intValue());
             layoutParams.addRule(i1, 0);
             if (!r1.s2(obj.w.mEntity)) {
                b.d((int)f2, (int)(p1 - (f1 * 0.30f)), on1, on1, viewGroup, obj.w.getLikeActivityResourceId(), obj.w);
             }
          }else {
             lottieAnimat.setTranslationX(0);
             lottieAnimat.setTranslationY(0);
             lottieAnimat.setRotation(0);
             layoutParams.addRule(i1, -1);
             if (!r1.s2(obj.w.mEntity)) {
                float f3 = (float)on1;
                b.d((int)(((float)viewGroup.getWidth() / f) - (f3 / f)), (int)(((float)viewGroup.getHeight() / f) - (f3 * 0.30f)), on1, on1, viewGroup, obj.w.getLikeActivityResourceId(), obj.w);
             }
          }
          lottieAnimat.setLayoutParams(layoutParams);
          if (!PatchProxy.isSupport2(on, "7") || !PatchProxy.applyVoidTwoRefsWithListener(lottieAnimat, Boolean.valueOf(i), obj, on, "7")) {
             lottieAnimat.f();
             lottieAnimat.setVisibility(4);
             if (i) {
                String str = b.a(-1568263472).c("PHOTO_LIKE_ANIMATION", obj.w);
                boolean b1 = a.a("PHOTO_LIKE_ANIMATION", str);
                if (!b1) {
                   str = "ACTIVITY_RESOURCE";
                }
                f.g(str, lottieAnimat, CdnResource$ResourceKey.bt_detail_center_like, R.raw.arg_RES_7f0f000e, new s0(obj, lottieAnimat), b1);
             }else {
                lottieAnimat.setAnimation(R.raw.arg_RES_7f0f000e);
                obj.R8(lottieAnimat);
             }
             PatchProxy.onMethodExit(on, "7");
          }
          PatchProxy.onMethodExit(on, "6");
       }
       obj.M = false;
       PatchProxy.onMethodExit(on, "10");
       return true;
    }
}
