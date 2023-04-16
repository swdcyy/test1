package dl9.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.model.mix.QComment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.CommentConfig;
import nx9.c;
import dl9.t$a;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import t45.d;
import brd.z;
import dl9.t$b;
import dl9.t$c;
import android.view.View;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.comment.utils.c;
import dl9.t$d;
import android.view.View$OnLongClickListener;
import android.animation.AnimatorSet;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.CommentMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.content.Context;
import android.view.View$MeasureSpec;
import android.widget.ImageView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewStub;
import android.view.ViewParent;
import hl9.t;
import android.content.res.ColorStateList;
import lnc.a1;
import th0.i;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.animation.ObjectAnimator;
import dl9.q;
import android.animation.Animator$AnimatorListener;
import dl9.r;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import android.animation.ValueAnimator;
import dl9.s;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import th0.p;
import dl9.t$e;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import android.view.Window;
import java.util.Objects;
import android.view.ViewGroup;
import dl9.t$f;
import dl9.t$g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import dl9.t$h;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import zf6.k;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.kwai.library.widget.popup.bubble.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import mrd.c;

public final class t extends PresenterV2	// class@001fa9
{
    public View A;
    public View B;
    public ImageView C;
    public AnimatorSet D;
    public View E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public int J;
    public int K;
    public QComment p;
    public CommentConfig q;
    public CommentsFragment r;
    public BaseFragment s;
    public QPhoto t;
    public c u;
    public c v;
    public a w;
    public View x;
    public KwaiImageView y;
    public ViewStub z;

    public void t(){
       super();
       this.F = 300;
       this.G = 200;
       this.H = 200;
       this.I = 240;
    }
    public static final QComment P8(t p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mComment");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       t tq = this.q;
       if (tq == null) {
          a.S("mCommentConfig");
       }
       if (tq.mEnableNewLikeDislikeUi == null) {
          return;
       }else if(c.f()){
          this.V8();
       }
       tq = this.v;
       if (tq == null) {
          a.S("mDisLikeBubbleSubject");
       }
       this.X7(tq.subscribe(new t$a(this)));
       tq = this.p;
       if (tq == null) {
          a.S("mComment");
       }
       this.X7(tq.observable().subscribeOn(d.a).subscribe(new t$b(this)));
       this.X7(c.a(this.x, new t$c(this)));
       this.X7(c.b(this.x, t$d.b));
       if (this.R8()) {
          tq = this.p;
          if (tq == null) {
             a.S("mComment");
          }
          if (tq.mRefreshFirstShowComment != null) {
             this.Z8(false);
             tq = this.p;
             if (tq == null) {
                a.S("mComment");
             }
             tq.mRefreshFirstShowComment = false;
          }else {
             tq = this.p;
             if (tq == null) {
                a.S("mComment");
             }
             if (tq.mDisliked != null) {
                tq = this.p;
                if (tq == null) {
                   a.S("mComment");
                }
                if (tq.mIsDislikeHideComment != null) {
                   this.S8(false);
                }
             }
             this.Z8(false);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, t.class, "6")) {
          return;
       }
       t tD = this.D;
       if (tD != null && tD.isRunning() == true) {
          tD = this.D;
          if (tD != null) {
             tD.cancel();
          }
       }
       return;
    }
    public final boolean R8(){
       boolean b;
       t obj = PatchProxy.apply(null, this, t.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q;
       if (obj == null) {
          a.S("mCommentConfig");
       }
       if (obj.mEnableNewLikeDislikeUi != null) {
          obj = this.t;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (obj.getCommentMeta() != null) {
             obj = this.t;
             if (obj == null) {
                a.S("mPhoto");
             }
             CommentMeta commentMeta = obj.getCommentMeta();
             a.m(commentMeta);
             if (commentMeta.mDisableCommentDislike != null) {
             label_0044 :
                b = false;
             label_0045 :
                return b;
             }
          }
          b = true;
          goto label_0045 ;
       }else {
          goto label_0044 ;
       }
    }
    public final void S8(boolean p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ot, "7")) {
          return;
       }
       if (p0) {
          this.W8(true);
       }else {
          t tA = this.A;
          if (tA != null && !tA.getVisibility()) {
             tA = this.E;
             ViewGroup$MarginLayoutParams marginLayout = null;
             ViewGroup$LayoutParams layoutParams = (tA != null)? tA.getLayoutParams(): marginLayout;
             if (layoutParams instanceof ConstraintLayout$LayoutParams) {
                marginLayout = layoutParams;
             }
             if (marginLayout != null) {
                this.J = marginLayout.topMargin;
             }
             tA = this.p;
             if (tA == null) {
                a.S("mComment");
             }
             float f = (tA.isSub())? 87.00f: 63.00f;
             Activity activity = this.getActivity();
             a.m(activity);
             int i = n.k(activity) - n.c(this.getActivity(), f);
             int i1 = 0;
             if (this.getActivity() != null) {
                int i2 = View$MeasureSpec.makeMeasureSpec(i1, i1);
                i = View$MeasureSpec.makeMeasureSpec(i, 0x40000000);
                t tA1 = this.A;
                if (tA1 != null) {
                   tA1.measure(i, i2);
                }
                tA = this.A;
                i2 = (tA != null)? tA.getMeasuredHeight(): 0;
                this.K = i2;
             }
             tA = this.y;
             if (tA != null) {
                tA.setAlpha(0);
             }
             tA = this.B;
             if (tA != null) {
                tA.setVisibility(8);
             }
             tA = this.x;
             if (tA != null) {
                tA.setVisibility(i1);
             }
             tA = this.x;
             if (tA != null) {
                tA.setAlpha(0x3f800000);
             }
             tA = this.A;
             if (tA != null) {
                tA.setVisibility(8);
             }
             this.a9(true);
             this.Y8();
          }
       }
       return;
    }
    public final void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, t.class, "3")) {
          return;
       }
       this.x = m1.f(this.m8(), 0x7f0a40d2);
       int i = 0x7f0a3b20;
       this.y = m1.f(this.m8(), i);
       this.z = m1.f(this.m8(), 0x7f0a3b21);
       this.A = m1.f(this.m8(), 0x7f0a16d5);
       this.B = m1.f(this.m8(), 0x7f0a16cf);
       this.C = m1.f(this.m8(), 0x7f0a150f);
       t tz = this.z;
       ViewParent parent = (tz != null)? tz.getParent(): objArray;
       if (parent != null) {
          tz = this.z;
          View view = (tz != null)? tz.inflate(): objArray;
          if (view != null) {
             objArray = view.findViewById(i);
          }
          this.y = objArray;
       }else if(this.y == null){
          this.y = this.m8().findViewById(i);
       }
       this.E = m1.f(this.m8(), 0x7f0a16d4);
       if (c.c() || c.d()) {
          t.e9(this.x, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081d, 0x7f0601fb)));
       }else {
          t.e9(this.x, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f060817, 0x7f0601d9)));
       }
       tz = this.x;
       if (tz != null && !tz.getVisibility()) {
          tz = this.x;
          if (tz != null) {
             tz.setVisibility(8);
          }
       }
       return;
    }
    public final void W8(boolean p0){
       AnimatorSet uAnimatorSet;
       AnimatorSet uAnimatorSet1;
       Animator uAnimator;
       t tD1;
       AnimatorSet$Builder uBuilder;
       ObjectAnimator objectAnimat;
       int[] ointArray;
       ValueAnimator valueAnimato;
       ObjectAnimator objectAnimat1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ot, "11")) {
          return;
       }
       t tD = this.D;
       if (tD != null) {
          tD.removeAllListeners();
       }
       tD = this.D;
       if (tD != null) {
          tD.cancel();
       }
       this.D = new AnimatorSet();
       int i = 2;
       if (PatchProxy.isSupport(ot)) {
          uAnimatorSet = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ot, "14");
          if (uAnimatorSet != patchProxyRe) {
          label_00c8 :
             if (PatchProxy.isSupport(ot)) {
                uAnimatorSet1 = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ot, "12");
                if (uAnimatorSet1 != patchProxyRe) {
                label_0167 :
                   if (this.y != null) {
                      if (PatchProxy.isSupport(ot)) {
                         uAnimator = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ot, "13");
                         if (uAnimator != patchProxyRe) {
                         }else {
                         label_0180 :
                            tD1 = this.y;
                            if (tD1 == null) {
                               uAnimator = null;
                            }else if(p0){
                               objectAnimat = ObjectAnimator.ofFloat(tD1, View.ALPHA, new float[i]{0x3f800000,0});
                            }else {
                               objectAnimat = ObjectAnimator.ofFloat(tD1, View.ALPHA, new float[i]{0,0x3f800000});
                            }
                            uAnimator = objectAnimat;
                            if (uAnimator != null) {
                               uAnimator.setDuration(this.H);
                            }
                            if (!p0 && uAnimator != null) {
                               uAnimator.setStartDelay((this.F - this.H));
                            }
                            if (uAnimator != null) {
                               uAnimator.setInterpolator(new i());
                            }
                         }
                      }else {
                         goto label_0180 ;
                      }
                      tD1 = this.D;
                      if (tD1 != null) {
                         uBuilder = tD1.play(uAnimatorSet1);
                         if (uBuilder != null) {
                            uBuilder = uBuilder.with(uAnimatorSet);
                            if (uBuilder != null) {
                               uBuilder.with(uAnimator);
                            }
                         }
                      }
                   }else {
                      tD1 = this.D;
                      if (tD1 != null) {
                         uBuilder = tD1.play(uAnimatorSet1);
                         if (uBuilder != null) {
                            uBuilder.with(uAnimatorSet);
                         }
                      }
                   }
                   tD1 = this.D;
                   if (tD1 != null) {
                      tD1.addListener(new t$e(this, p0));
                   }
                   t tD2 = this.D;
                   if (tD2 != null) {
                      tD2.start();
                   }
                   return;
                }
             }
             int i1 = 1;
             int i2 = 0;
             if (p0) {
                t tA = this.A;
                if (tA != null) {
                   int height = tA.getHeight();
                   if (height > 0) {
                      this.K = height;
                   }
                }
                ointArray = new int[i];
                ointArray[i2] = this.K;
                ointArray[i1] = i2;
                valueAnimato = ValueAnimator.ofInt(ointArray);
             }else {
                ointArray = new int[i];
                ointArray[i2] = i1;
                ointArray[i1] = this.K;
                valueAnimato = ValueAnimator.ofInt(ointArray);
             }
             valueAnimato.addUpdateListener(new s(this));
             a.o(valueAnimato, "commentContentAnimatorTrans");
             valueAnimato.setDuration(this.F);
             valueAnimato.setInterpolator(new p());
             objectAnimat1 = (p0)? ObjectAnimator.ofFloat(this.A, View.ALPHA, new float[i]{0x3f800000,0}): ObjectAnimator.ofFloat(this.A, View.ALPHA, new float[i]{0,0x3f800000});
             a.o(objectAnimat1, "animatorAlpha");
             objectAnimat1.setDuration(this.G);
             if (!p0) {
                objectAnimat1.setStartDelay((this.F - this.G));
             }
             objectAnimat1.setInterpolator(new i());
             AnimatorSet uAnimatorSet2 = new AnimatorSet();
             uAnimatorSet2.play(valueAnimato).with(objectAnimat1);
             uAnimatorSet1 = uAnimatorSet2;
             goto label_0167 ;
          }
       }
       uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setInterpolator(new i());
       ObjectAnimator objectAnimat2 = (p0)? ObjectAnimator.ofFloat(this.B, View.ALPHA, new float[i]{0x3f800000,0}): ObjectAnimator.ofFloat(this.B, View.ALPHA, new float[i]{0,0x3f800000});
       objectAnimat1 = (p0)? ObjectAnimator.ofFloat(this.x, View.ALPHA, new float[i]{0,0x3f800000}): ObjectAnimator.ofFloat(this.x, View.ALPHA, new float[i]{0x3f800000,0});
       a.o(objectAnimat2, "leftAlpha");
       objectAnimat2.setDuration(this.H);
       a.o(objectAnimat1, "tvHideAlpha");
       objectAnimat1.setDuration(this.I);
       if (p0) {
          objectAnimat1.setStartDelay((this.F - this.I));
       }else {
          objectAnimat2.setStartDelay((this.F - this.H));
       }
       objectAnimat1.addListener(new q(this, p0));
       objectAnimat2.addListener(new r(this, p0));
       uAnimatorSet.play(objectAnimat2).with(objectAnimat1);
       goto label_00c8 ;
    }
    public final void X8(View p0){
       boolean b1;
       t ot = t.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ot, "16")) {
          return;
       }
       if (this.getActivity() != null) {
          Activity activity = this.getActivity();
          a.m(activity);
          a uoa = new a(activity);
          uoa.K0(KwaiBubbleOption.e);
          uoa.v0(a1.d(R.dimen.arg_RES_7f0702e3));
          uoa.o0(p0);
          boolean b = true;
          uoa.q0(b);
          uoa.F0(a1.p(R.string.arg_RES_7f1004b9));
          uoa.T(3000);
          uoa.z(b);
          activity = this.getActivity();
          a.m(activity);
          a.o(activity, "activity!!");
          Window window = activity.getWindow();
          a.o(window, "activity!!.window");
          View decorView = window.getDecorView();
          Objects.requireNonNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
          uoa.C(decorView);
          uoa.P(b);
          uoa.K(new t$f(this));
          uoa.M(new t$g(this));
          uoa.O(new t$h(this));
          Object obj = PatchProxy.apply(null, this, ot, "18");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(k.d()){
             if (k.e()) {
                Object obj1 = PatchProxy.apply(null, this, ot, "19");
                if (obj1 != PatchProxyResult.class) {
                   b1 = obj1.booleanValue();
                }else {
                   ot = this.r;
                   b1 = (ot != null && ot.Nh() == b)? true: false;
                }
                if (!b1) {
                label_00c1 :
                   b = false;
                }
             }else {
                goto label_00c1 ;
             }
          }
          if (b) {
             uoa.p();
          }else {
             uoa.o();
          }
          this.w = a.b0(0x7f11060f, uoa);
       }
       return;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, t.class, "8")) {
          return;
       }
       t tp = this.p;
       if (tp == null) {
          a.S("mComment");
       }
       tp.mUpdateLikeType = 0;
       return;
    }
    public final void Z8(boolean p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ot, "10")) {
          return;
       }
       if (p0) {
          this.W8(false);
       }else {
          t tA = this.A;
          if (tA != null && !tA.getVisibility()) {
             return;
          }else {
             tA = this.B;
             if (tA != null) {
                tA.setVisibility(false);
             }
             tA = this.B;
             if (tA != null) {
                tA.setAlpha(0x3f800000);
             }
             tA = this.x;
             if (tA != null) {
                tA.setVisibility(8);
             }
             tA = this.A;
             if (tA != null) {
                tA.setVisibility(false);
             }
             tA = this.A;
             if (tA != null) {
                tA.setAlpha(0x3f800000);
             }
             tA = this.y;
             if (tA != null) {
                tA.setAlpha(0x3f800000);
             }
             this.a9(false);
             this.Y8();
          }
       }
       return;
    }
    public final void a9(boolean p0){
       t ot = t.class;
       if (PatchProxy.isSupport(ot) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ot, "9")) {
          return;
       }
       ot = this.p;
       if (ot == null) {
          a.S("mComment");
       }
       ot.mIsDislikeHideComment = p0;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       a.p(p0, "view");
       if (!c.f()) {
          this.V8();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       Object obj = this.q8(QComment.class);
       a.o(obj, "inject\(QComment::class.java\)");
       this.p = obj;
       obj = this.q8(CommentConfig.class);
       a.o(obj, "inject\(CommentConfig::class.java\)");
       this.q = obj;
       this.r = this.t8("FRAGMENT");
       this.s = this.t8("DETAIL_FRAGMENT");
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       obj = this.r8("COMMENT_CANCEL_DISLIKED_SUBJECT");
       a.o(obj, "inject\(CommentAccessIds.бн_CANCEL_DISLIKED_SUBJECT\)");
       this.u = obj;
       obj = this.r8("COMMENT_DISLIKE_BUBBLE_SUBJECT");
       a.o(obj, "inject\(CommentAccessIds.бнT_DISLIKE_BUBBLE_SUBJECT\)");
       this.v = obj;
       return;
    }
}
