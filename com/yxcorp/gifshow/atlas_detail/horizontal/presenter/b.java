package com.yxcorp.gifshow.atlas_detail.horizontal.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPreInfo;
import java.lang.String;
import java.util.Random;
import r1a.k;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.b$a;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import k99.h;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Set;
import lnc.u1;
import android.content.res.Resources;
import cw9.c;
import wh5.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator$AnimatorListener;
import android.widget.ImageView;
import java.util.Queue;
import java.util.Objects;
import e1a.e;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import k99.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.util.cdnresource.f;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import com.kuaishou.android.model.mix.PhotoMeta;
import mrd.c;
import de5.a;
import java.lang.Float;
import java.lang.Boolean;
import com.google.common.base.Optional;
import uf5.x;
import java.lang.StringBuilder;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p5a.e;
import com.kwai.framework.player.core.b;
import android.content.Context;
import com.airbnb.lottie.RenderMode;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import t9a.b;
import mvb.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.model.survey.ActionSurveyType;
import java.util.List;
import com.yxcorp.gifshow.detail.helper.a;
import java.util.Collection;
import ekd.q;

public class b extends PresenterV2	// class@001bc0
{
    public boolean A;
    public int B;
    public int C;
    public final Random D;
    public final k E;
    public e F;
    public int G;
    public final c H;
    public final Queue I;
    public ViewGroup p;
    public PhotoMeta q;
    public c r;
    public QPhoto s;
    public Set t;
    public a u;
    public QPreInfo v;
    public String w;
    public String x;
    public boolean y;
    public long z;

    public void b(QPreInfo p0,String p1,String p2){
       super();
       this.D = new Random();
       this.E = new k();
       this.H = new b$a(this);
       this.I = new LinkedList();
       this.v = p0;
       this.w = p1;
       this.x = p2;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new h(this)));
       if (this.s.isLongPhotos() || this.s.isAtlasPhotos()) {
          this.t.add(this.H);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       u1.a(this);
       this.B = c.b(this.l8(), 0x7f070149);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, b.class, "17")) {
          return;
       }
       u1.b(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       if (this.s.isLongPhotos() || this.s.isAtlasPhotos()) {
          this.t.remove(this.H);
       }
       if (c.h()) {
          this.E.b(this.s.getPhotoId());
       }
       return;
    }
    public final int P8(){
       Object obj = PatchProxy.apply(null, this, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.D.nextInt(53) - 26);
    }
    public void R8(LottieAnimationView p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "15")) {
          return;
       }
       p0.v(p1);
       p0.setVisibility(4);
       this.I.offer(p0);
       int i = this.G - 1;
       this.G = i;
       if (!i) {
          b tF = this.F;
          Objects.requireNonNull(tF);
          tF.c(0, 0);
       }
       return;
    }
    public final void S8(LottieAnimationView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "14")) {
          return;
       }
       p0.t();
       p0.f();
       p0.setVisibility(4);
       f.d(this.s.getLikeActivityResourceId(), p0, CdnResource$ResourceKey.detail_center_like_b, R.raw.arg_RES_7f0f000e, new i(this, p0));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a13f5);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(PhotoMeta.class);
       this.r = this.t8("DETAIL_ADJUST_EVENT");
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("DETAIL_DOUBLE_CLICK_LISTENERS");
       this.u = this.q8(a.class);
       this.F = this.r8("DETAIL_INNER_ATLAS_GESTURE_CONFLICT_HELPER");
       return;
    }
    public boolean o0(float p0,float p1){
       FrameLayout$LayoutParams obj;
       b tB;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uob, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.q.isLiked();
       float f = 0;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, uob, "16")) {
          Object[] objArray = new Object[]{Optional.fromNullable(this.w).or("_"),Optional.fromNullable(this.x).or("_")};
          String str = String.format("%s/%s", objArray);
          b ts = this.s;
          String str1 = this.getActivity().getUrl()+"#doublelike";
          tB = this.v;
          QPreInfo mPreExpTag = (tB != null)? tB.mPreExpTag: null;
          new x(ts, str1, mPreExpTag, str).b(this.getActivity(), true, this.u.c(), this.u.getPlayer().getCurrentPosition());
       }
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uob, "12")) {
          uob = 0xbf800000;
          if (p0 - uob > 0 && p1 - uob > 0) {
             f = Float.MIN_VALUE;
          }
          tB = this.B;
          LottieAnimationView lottieAnimat = this.I.poll();
          if (lottieAnimat == null) {
             if (this.C != 16) {
                lottieAnimat = new LottieAnimationView(this.getActivity());
                lottieAnimat.setRenderMode(RenderMode.HARDWARE);
                lottieAnimat.k(true);
                this.p.addView(lottieAnimat, new FrameLayout$LayoutParams(this.B, this.B));
                this.C = this.C + true;
             }
          }
          obj = lottieAnimat.getLayoutParams();
          obj.width = tB;
          obj.height = tB;
          float f1 = 2.00f;
          if (f) {
             f = (float)tB;
             lottieAnimat.setTranslationX((p0 - (f / f1)));
             lottieAnimat.setTranslationY((p1 - (f * 0x3f2e147b)));
             lottieAnimat.setRotation((float)this.P8());
             obj.gravity = -1;
          }else {
             lottieAnimat.setTranslationX(0);
             lottieAnimat.setTranslationY(0);
             lottieAnimat.setRotation(0);
             obj.gravity = 17;
          }
          lottieAnimat.setLayoutParams(obj);
          this.S8(lottieAnimat);
          if (!r1.s2(this.s.mEntity)) {
             float f2 = (float)tB;
             b.b((int)(p0 - (f2 / f1)), (int)(p1 - (f2 * 0.30f)), tB, tB, 0xbf800000, this.p, this.s.getLikeActivityResourceId(), this.s);
          }
       }
    label_0160 :
       return true;
    }
    public void onEventMainThread(c p0){
       boolean b;
       String str;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "18")) {
          return;
       }
       if (p0.a != null && TextUtils.equals(this.s.getPhotoId(), p0.a.getPhotoId())) {
          b = p0.a.isLiked();
          if (PatchProxy.isSupport(uob)) {
             str = PatchProxy.applyOneRefs(Boolean.valueOf(b), this, uob, "20");
             if (str != PatchProxyResult.class) {
             }else {
             label_003e :
                List list = a.a(ActionSurveyType.LIKE);
                String str1 = (b)? "LIKE": "CANCEL_LIKE";
                if (q.f(list) || !list.contains(str1)) {
                   str = null;
                }else {
                   str = str1;
                }
             }
          }else {
             goto label_003e ;
          }
          a.b(this.s, ActionSurveyType.LIKE, str);
       }
       return;
    }
}
