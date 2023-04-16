package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.p;
import ze5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Random;
import brd.t;
import brd.a0;
import java.lang.Object;
import java.util.List;
import java.util.LinkedList;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.p$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.p$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import y6a.x0;
import erd.g;
import crd.b;
import vy6.a;
import android.content.res.Resources;
import cw9.c;
import lnc.b9;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.p$c;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import ekd.m1;
import android.widget.RelativeLayout;
import de5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import com.kuaishou.android.model.mix.PhotoMeta;
import e1a.e;
import java.lang.Integer;
import xx9.a;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import java.util.Objects;
import uf5.b$a;
import p1a.a$a;
import com.kuaishou.android.model.music.Music;
import lnc.i3;
import p5a.e;
import com.kwai.framework.player.core.b;
import java.lang.Long;
import java.lang.Number;
import up.a;
import com.kuaishou.android.model.actionreport.PhotoActionReportParams;
import p1a.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import uf5.x;
import java.lang.StringBuilder;
import android.app.Activity;
import oe6.a;
import android.content.Context;
import com.airbnb.lottie.RenderMode;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import t9a.b;
import wkd.b;
import com.kwai.component.bifrost.BifrostActivityManager;
import com.yxcorp.gifshow.util.cdnresource.a;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import y6a.y0;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.cdnresource.f;

public class p extends PresenterV2 implements a	// class@00182f
{
    public BaseFragment A;
    public f B;
    public PhotoMeta C;
    public e D;
    public a E;
    public int F;
    public PublishSubject G;
    public PublishSubject H;
    public List I;
    public List J;
    public PublishSubject K;
    public SlidePlayViewModel L;
    public b M;
    public int N;
    public final LinkedList O;
    public int P;
    public boolean Q;
    public final h R;
    public final a S;
    public final Random p;
    public List q;
    public RelativeLayout r;
    public View s;
    public View t;
    public ViewGroup[] u;
    public a v;
    public QPhoto w;
    public PhotoDetailParam x;
    public NasaBizParam y;
    public PublishSubject z;

    public void p(){
       super();
       this.p = new Random();
       this.q = t.range(-10, 20).toList().e();
       this.O = new LinkedList();
       this.Q = true;
       this.R = new p$a(this);
       this.S = new p$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, p.class, "4")) {
          return;
       }
       this.L = SlidePlayViewModel.B0(this.A.getParentFragment());
       this.J.remove(this);
       this.J.add(this);
       this.X7(this.K.subscribe(new x0(this)));
       this.L.P(this.A, this.S);
       this.I.add(this.R);
       this.P = 0;
       PatchProxy.onMethodExit(p.class, "4");
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoidWithListener(null, this, p.class, "3")) {
          return;
       }
       this.N = c.b(this.l8(), 0x7f070ea1);
       PatchProxy.onMethodExit(p.class, "3");
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoidWithListener(null, this, p.class, "6")) {
          return;
       }
       b9.a(this.M);
       PatchProxy.onMethodExit(p.class, "6");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, p.class, "5")) {
          return;
       }
       this.L.D(this.A, this.S);
       this.I.remove(this.R);
       this.J.remove(this);
       PatchProxy.onMethodExit(p.class, "5");
       return;
    }
    public boolean K(float p0,float p1){
       if (PatchProxy.isSupport2(p.class, "12")) {
          Object obj = PatchProxy.applyTwoRefsWithListener(Float.valueOf(p0), Float.valueOf(p1), this, p.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       PatchProxy.onMethodExit(p.class, "12");
       return this.o0(p0, p1);
    }
    public final boolean P8(){
       p op = p.class;
       Object obj = PatchProxy.applyWithListener(null, this, op, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(op, "9");
       return (r1.s2(this.w.mEntity) ^ 0x01);
    }
    public ViewGroup R8(){
       p tu = this.u;
       object oobject = (tu[0] != null)? tu[0]: this.r;
       return oobject;
    }
    public final void S8(LottieAnimationView p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p.class, "11")) {
          return;
       }
       p0.setSpeed(0x3fa66666);
       p0.a(new p$c(this, p0));
       p0.s();
       this.P = this.P + 1;
       PatchProxy.onMethodExit(p.class, "11");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, p.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a39f7);
       this.t = m1.f(p0, 0x7f0a2ec7);
       this.s = m1.f(p0, 0x7f0a39ab);
       PatchProxy.onMethodExit(p.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, p.class, "1")) {
          return;
       }
       this.u = this.r8("DETAIL_CHANGE_LIKE_CONTAINER");
       this.v = this.q8(a.class);
       this.w = this.q8(QPhoto.class);
       this.x = this.q8(PhotoDetailParam.class);
       this.y = this.q8(NasaBizParam.class);
       this.z = this.r8("DETAIL_ADJUST_EVENT");
       this.A = this.r8("DETAIL_FRAGMENT");
       this.B = this.x8("LOG_LISTENER");
       this.C = this.q8(PhotoMeta.class);
       this.D = this.r8("DETAIL_GESTURE_CONFLICT_HELPER");
       this.F = this.r8("DETAIL_PHOTO_INDEX").intValue();
       this.G = this.r8("SLIDE_DETAIL_PAGE_CENTER_LIKE_ANIM");
       this.H = this.r8("SLIDE_DETAIL_RIGHT_ACTION_BAR_LIKE_ANIM");
       this.I = this.r8("DETAIL_TAP_CLICK_ADAPTER");
       this.J = this.r8("DETAIL_CLICK_LIKE_LISTENERS");
       this.K = this.r8("DETAIL_IMAGE_SINGLE_TAP_UP");
       this.E = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       PatchProxy.onMethodExit(p.class, "1");
       return;
    }
    public boolean o0(float p0,float p1){
       p obj1;
       String str2;
       Object obj = this;
       p op = p.class;
       if (PatchProxy.isSupport2(op, "13")) {
          obj1 = PatchProxy.applyTwoRefsWithListener(Float.valueOf(p0), Float.valueOf(p1), obj, op, "13");
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       if (VisitorModeManager.g(10)) {
          PatchProxy.onMethodExit(op, "13");
          return false;
       }else {
          obj1 = obj.D;
          Objects.requireNonNull(obj1);
          boolean b = true;
          obj1.c(false, b);
          obj.w.isLiked();
          boolean i = 2;
          if (!obj.w.isLiked()) {
             Boolean tRUE = Boolean.TRUE;
             obj.H.onNext(tRUE);
             String str = "7";
             if (!PatchProxy.isSupport2(op, str) || !PatchProxy.applyVoidOneRefsWithListener(tRUE, obj, op, str)) {
                if (!b$a.c()) {
                   PatchProxy.onMethodExit(op, str);
                }else {
                   a$a uoa = new a$a(i, 306, "like_photo");
                   uoa.r(b);
                   i3 oi3 = null;
                   if (obj.w.getVideoDuration() > 0 || obj.w.getMusic() != null) {
                      oi3 = i3.f();
                      oi3.c("like_photo_duration", Long.valueOf(obj.v.getPlayer().getCurrentPosition()));
                      oi3.c("is_simplify_screen", Integer.valueOf(obj.E.c()));
                   }
                   if (obj.w.getActionReportFetcher() != null && obj.w.getActionReportFetcher().a() != null) {
                      if (oi3 == null) {
                         oi3 = i3.f();
                      }
                      oi3.c("play_cnt", Integer.valueOf(obj.w.getActionReportFetcher().a().mPlayCnt));
                      oi3.c("play_time", Long.valueOf(obj.w.getActionReportFetcher().a().mActionRelativeTime));
                   }
                   if (oi3 != null) {
                      uoa.m(oi3.e());
                   }
                   obj.B.get().a(uoa);
                   PatchProxy.onMethodExit(op, str);
                }
             }
          }
          if (obj.Q != null || QCurrentUser.ME.isLogined()) {
             Object[] objArray = new Object[i];
             String str1 = "_";
             str2 = (obj.x.getDetailCommonParam().getPreUserId() == null)? str1: obj.x.getDetailCommonParam().getPreUserId();
             objArray[0] = str2;
             if (obj.x.getDetailCommonParam().getPrePhotoId() != null) {
                str1 = obj.x.getDetailCommonParam().getPrePhotoId();
             }
             objArray[b] = str1;
             new x(obj.w, this.getActivity().getUrl()+"#doublelike", obj.x.getDetailCommonParam().getPreExpTag(), String.format("%s/%s", objArray)).b(this.getActivity(), true, obj.v.c(), obj.v.getPlayer().getCurrentPosition());
          }
          if (a.B()) {
             a.c0(false);
          }
          if (!PatchProxy.isSupport2(op, "8") || !PatchProxy.applyVoidTwoRefsWithListener(Float.valueOf(p0), Float.valueOf(p1), obj, op, "8")) {
             str2 = 0xbf800000;
             i = (p0 - str2 > 0 && p1 - str2 > 0)? true: false;
             p n = obj.N;
             if (!i) {
                n = (int)((float)n * 0x3f99999a);
             }
             p op1 = n;
             LottieAnimationView lottieAnimat = obj.O.pollFirst();
             ViewGroup viewGroup = this.R8();
             if (lottieAnimat == null) {
                lottieAnimat = new LottieAnimationView(this.getActivity());
                lottieAnimat.setRenderMode(RenderMode.HARDWARE);
                lottieAnimat.k(b);
                viewGroup.addView(lottieAnimat, new RelativeLayout$LayoutParams(obj.N, obj.N));
             }
             ViewGroup$LayoutParams layoutParams = lottieAnimat.getLayoutParams();
             layoutParams.width = op1;
             layoutParams.height = op1;
             int i1 = 13;
             float f = 2.00f;
             if (i) {
                float f1 = (float)op1;
                f = f1 / f;
                float f2 = p0 - f;
                lottieAnimat.setTranslationX(f2);
                lottieAnimat.setTranslationY(((p1 - f) - ((float)obj.N / 3.00f)));
                p q = obj.q;
                lottieAnimat.setRotation((float)q.get(obj.p.nextInt(q.size())).intValue());
                layoutParams.addRule(i1, false);
                if (this.P8()) {
                   b.d((int)f2, (int)(p1 - (f1 * 0.30f)), op1, op1, viewGroup, obj.w.getLikeActivityResourceId(), obj.w);
                }
             }else {
                lottieAnimat.setTranslationX(0);
                lottieAnimat.setTranslationY(0);
                lottieAnimat.setRotation(0);
                layoutParams.addRule(i1, -1);
                if (this.P8()) {
                   float f3 = (float)op1;
                   b.d((int)(((float)viewGroup.getWidth() / f) - (f3 / f)), (int)(((float)viewGroup.getHeight() / f) - (f3 * 0.30f)), op1, op1, viewGroup, obj.w.getLikeActivityResourceId(), obj.w);
                }
             }
             lottieAnimat.setLayoutParams(layoutParams);
             if (!PatchProxy.isSupport2(op, "10") || !PatchProxy.applyVoidTwoRefsWithListener(lottieAnimat, Boolean.valueOf(i), obj, op, "10")) {
                lottieAnimat.f();
                lottieAnimat.setVisibility(4);
                String str3 = b.a(-1568263472).c("PHOTO_LIKE_ANIMATION", obj.w);
                boolean b1 = a.a("PHOTO_LIKE_ANIMATION", str3);
                if (!b1) {
                   str3 = obj.w.getLikeActivityResourceId();
                }
                String str4 = str3;
                if (i) {
                   f.g(str4, lottieAnimat, CdnResource$ResourceKey.bt_detail_center_like, R.raw.arg_RES_7f0f000e, new y0(obj, lottieAnimat), b1);
                }else {
                   lottieAnimat.setAnimation(R.raw.arg_RES_7f0f000e);
                   obj.S8(lottieAnimat);
                }
                PatchProxy.onMethodExit(op, "10");
             }
             PatchProxy.onMethodExit(op, "8");
          }
          obj.Q = false;
          PatchProxy.onMethodExit(op, "13");
          return true;
       }
    }
}
