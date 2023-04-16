package com.yxcorp.gifshow.detail.slidev2.presenter.feature.l;
import com.yxcorp.gifshow.detail.slidev2.presenter.e0;
import lnc.a1;
import e8a.c1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import android.view.View;
import m9a.k;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import com.yxcorp.utility.n;
import uw9.a;
import android.widget.ImageView;
import com.kwai.slide.play.detail.rightactionbar.follow.element.h;
import lnc.c3$a;
import lnc.c3;
import android.animation.AnimatorSet;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.slide.play.detail.rightactionbar.follow.element.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import l27.g;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHelper;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import xzc.a;
import wzc.a;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import com.kuaishou.android.model.entity.DynamicEffectMarker;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import sf5.g;
import android.view.View$OnClickListener;
import e8a.b1;

public class l extends e0	// class@0019a9
{
    public CircleWithStrokeView U;
    public final Runnable V;
    public AvatarInfoResponse W;
    public static final float X;
    public static final float Y;
    public static final float Z;

    static {
       l.X = (float)a1.e(13.50f);
       l.Y = (float)a1.e(19.00f);
       l.Z = (float)a1.e(2.00f);
    }
    public void l(){
       super();
       this.V = new c1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       super.E8();
       if (this.U == null) {
          this.U = k.a(this.getActivity(), this.E, 0x7f0a2d73);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, l.class, "12")) {
          return;
       }
       this.R8();
       return;
    }
    public void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "11")) {
          return;
       }
       View[] viewArray = new View[]{this.U};
       n.Z(4, viewArray);
       e0 tI = this.I;
       if (tI != null && tI.a != null) {
          tI.a = false;
          tI = this.r;
          if (tI != null) {
             tI.clearAnimation();
          }
          c3.c(this.I.b, h.a);
          c3.c(this.I.c, h.a);
          a b = this.I.b;
          if (b != null) {
             b.removeAllListeners();
          }
          b = this.I.c;
          if (b != null) {
             b.removeAllListeners();
          }
          tI = this.I;
          tI.b = objArray;
          tI.c = objArray;
          k1.m(this.V);
          c3.c(this.U, i.a);
       }
       return;
    }
    public void X8(){
       boolean b;
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ol, "7")) {
          return;
       }
       l obj = PatchProxy.apply(objArray, this, ol, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          g og = FeedWolverinePerformanceHolder.c.c();
          WolverinePerformanceLevel wolverinePer = FeedWolverinePerformanceHelper.a("feed_wolverine_live_guide_anim_demotion_grade");
          if (og != null && wolverinePer != null) {
             WolverinePerformanceLevel wolverinePer1 = og.a();
             boolean b1 = wolverinePer1.isAtMost(wolverinePer);
             if (b1) {
                a.a("avatarLiveAnimation", wolverinePer1);
             }
             b = b1;
          }else {
             b = a.a();
          }
       }
       if (b) {
          this.R8();
          return;
       }else if(this.I.a == null){
          obj = this.W;
          if (obj != null && (obj.mType == true && this.r.isShown())) {
             AvatarInfoResponse mDynamicEffe = this.W.mDynamicEffectMarker;
             if (mDynamicEffe == null || mDynamicEffe.mIsBlocked == null) {
                this.I.a = true;
                if (!PatchProxy.applyVoid(objArray, this, ol, "8")) {
                   this.r.clearAnimation();
                   e0 tI = this.I;
                   if (tI.b == null) {
                      tI.b = new AnimatorSet();
                      this.I.b.setDuration(900);
                      this.I.b.setInterpolator(new LinearInterpolator());
                      Animator[] uAnimatorArr = new Animator[]{g.a(this.r, 0x3f59999a, 0x3f800000),g.a(this.t, 0x3f59999a, 0x3f800000)};
                      this.I.b.playTogether(uAnimatorArr);
                   }
                   this.I.b.start();
                }
                k1.r(this.V, 450);
             }
          }
       }
       return;
    }
    public void Z8(AvatarInfoResponse p0){
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "2")) {
          return;
       }
       super.Z8(p0);
       if (this.V8()) {
          return;
       }
       this.W = p0;
       e0 uoe0 = 1;
       if (p0.mType == uoe0) {
          AvatarInfoResponse mDynamicEffe = p0.mDynamicEffectMarker;
          if (mDynamicEffe == null || mDynamicEffe.mIsBlocked == null) {
          label_0026 :
             View$OnClickListener onClickListe = null;
             if (uoe0) {
                if (this.s instanceof ImageView) {
                   this.b9();
                }
                this.X8();
                Object obj = PatchProxy.applyOneRefs(p0, this, ol, "4");
                if (obj != PatchProxyResult.class) {
                   onClickListe = obj;
                }else if(p0.mPhoto == null){
                   onClickListe = new b1(this, p0);
                }
                this.D = onClickListe;
                return;
             }else {
                this.R8();
                this.D = onClickListe;
                this.t.setVisibility(8);
                return;
             }
          }
       }
       uoe0 = null;
       goto label_0026 ;
    }
    public AnimatorSet a9(){
       Object obj = PatchProxy.apply(null, this, l.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.b(this.U, l.X, l.Y, l.Z);
    }
    public void b9(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.s.setImageResource(R.drawable.arg_RES_7f081986);
       return;
    }
}
