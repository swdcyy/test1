package ar7.j;
import qp7.d;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.CoCreateInvitationInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import qp7.x0;
import ar7.l;
import ar7.e;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import ar7.f;
import ar7.g;
import android.view.View$OnClickListener;
import kotlin.jvm.internal.Ref$ObjectRef;
import android.text.SpannableStringBuilder;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils;
import ar7.h;
import ar7.i;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import ar7.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import bt7.c;
import android.animation.TimeInterpolator;
import ar7.b;
import com.yxcorp.utility.n;
import java.lang.Integer;
import android.view.animation.AccelerateDecelerateInterpolator;
import ar7.c;
import eh5.a;
import ar7.d;
import android.animation.Animator$AnimatorListener;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import qrd.l1;

public final class j extends d	// class@000351
{
    public TextView l;
    public View m;
    public TextView n;
    public CoCreateInvitationInfo o;
    public View p;
    public AnimatorSet q;
    public a r;
    public HashMap s;

    public void j(){
       super();
    }
    public static final TextView v(j p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("mAcceptInvite");
       }
       return p0;
    }
    public static final CoCreateInvitationInfo w(j p0){
       p0 = p0.o;
       if (p0 == null) {
          a.S("mCreateInvitationInfo");
       }
       return p0;
    }
    public static final TextView x(j p0){
       p0 = p0.n;
       if (p0 == null) {
          a.S("mRejectedInviteText");
       }
       return p0;
    }
    public View i(){
       View obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c(LayoutInflater.from(this.k()), R.layout.arg_RES_7f0d038a, this.m(), false);
       a.o(obj, "LayoutInflater.from\(cont¡­       parentView, false\)");
       return obj;
    }
    public void q(x0 p0){
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
       }else {
          a.p(p0, "viewModel");
          e uoe = new e(this);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uoe, p0, ol, "4")) {
             a.p(uoe, "observer");
             p0.e.d(p0.c(), uoe);
          }
          f uof = new f(this);
          if (!PatchProxy.applyVoidOneRefs(uof, p0, ol, "8")) {
             a.p(uof, "observer");
             p0.g.d(p0.c(), uof);
          }
          j tl = this.l;
          if (tl == null) {
             a.S("mAcceptInvite");
          }
          tl.setOnClickListener(new g(this, p0));
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          SpannableStringBuilder spannableStr = new SpannableStringBuilder(a1.p(0x7f10067b));
          objectRef.element = spannableStr;
          SpannableStringBuilderUtils.k(spannableStr, a1.a(R.color.arg_RES_7f060751), a1.p(R.string.arg_RES_7f10067b));
          j tm = this.m;
          if (tm == null) {
             a.S("mRejectedInvite");
          }
          tm.setOnClickListener(new h(this, objectRef, p0));
          i oi = new i(this);
          if (!PatchProxy.applyVoidOneRefs(oi, p0, ol, "6")) {
             a.p(oi, "observer");
             p0.f.d(p0.c(), oi);
          }
       }
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, j.class, "7")) {
          return;
       }
       View view = this.p().findViewById(R.id.co_create_accept_invitation_btn);
       a.o(view, "view.findViewById\(R.id.c¡­te_accept_invitation_btn\)");
       this.l = view;
       view = this.p().findViewById(R.id.co_create_reject_invitation_btn);
       a.o(view, "view.findViewById\(R.id.c¡­te_reject_invitation_btn\)");
       this.m = view;
       view = this.p().findViewById(R.id.co_create_reject_invitation_text);
       a.o(view, "view.findViewById\(R.id.c¡­e_reject_invitation_text\)");
       this.n = view;
       view = this.p().findViewById(R.id.co_create_invitation_container);
       a.o(view, "view.findViewById\(R.id.c¡­ate_invitation_container\)");
       this.p = view;
       return;
    }
    public final void y(View p0,TextView p1){
       Object obj = this;
       ValueAnimator obj1 = p0;
       ValueAnimator[] obj2 = p1;
       j oj = j.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, oj, "3")) {
          return;
       }
       j q = obj.q;
       if (q != null) {
          q.cancel();
       }
       AnimatorSet uAnimatorSet = PatchProxy.applyTwoRefs(obj1, obj2, obj, oj, "4");
       if (uAnimatorSet != PatchProxyResult.class) {
       }else {
          obj2.setText("");
          int width = p0.getWidth();
          q = obj.p;
          if (q == null) {
             a.S("mInvitationContainer");
          }
          AnimatorSet uAnimatorSet1 = new AnimatorSet();
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          valueAnimato.addUpdateListener(new a(obj1, q.getWidth(), width));
          a.o(valueAnimato, "translateX");
          long l = 280;
          valueAnimato.setDuration(l);
          valueAnimato.setInterpolator(new c(0x3f000000, 0, 0.30f, 0x3f800000));
          ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          valueAnimato1.addUpdateListener(new b(obj1));
          a.o(valueAnimato1, "alpha");
          valueAnimato1.setDuration(150);
          valueAnimato1.setStartDelay(l);
          int i = n.c(this.k(), 40.00f);
          j r = obj.r;
          int i1 = 0;
          if (PatchProxy.isSupport(oj)) {
             obj1 = PatchProxy.applyThreeRefs(Integer.valueOf(i), Integer.valueOf(i1), r, this, j.class, "5");
             if (obj1 != PatchProxyResult.class) {
             label_00e8 :
                obj1.setStartDelay(280);
                obj2 = new ValueAnimator[]{valueAnimato,obj1,valueAnimato1};
                uAnimatorSet1.playTogether(CollectionsKt__CollectionsKt.P(obj2));
                uAnimatorSet = uAnimatorSet1;
             }
          }else {
             int i2 = 0;
          }
          int[] ointArray = new int[]{i,0};
          obj1 = ValueAnimator.ofInt(ointArray);
          obj1.setDuration(250);
          obj1.setInterpolator(new AccelerateDecelerateInterpolator());
          obj1.addUpdateListener(new c(obj, i, 0, r));
          obj1.addListener(new d(obj, i, 0, r));
          a.o(obj1, "ValueAnimator.ofInt\(star¡­\n        }\n      }\)\n    }");
          goto label_00e8 ;
       }
       obj.q = uAnimatorSet;
       if (uAnimatorSet != null) {
          uAnimatorSet.start();
       }
       return;
    }
    public final void z(int p0,float p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, oj, "6")) {
          return;
       }
       View tag = this.p().getTag(R.id.category_bottom_margin);
       Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Int");
       int i = n.c(this.k(), (float)tag.intValue());
       tag = this.p();
       ViewGroup$LayoutParams layoutParams = this.p().getLayoutParams();
       layoutParams.height = p0;
       ViewGroup$MarginLayoutParams marginLayout = (!layoutParams instanceof ViewGroup$MarginLayoutParams)? null: layoutParams;
       if (marginLayout != null) {
          marginLayout.setMargins(marginLayout.leftMargin, marginLayout.topMargin, marginLayout.rightMargin, (int)(p1 * (float)i));
       }
       tag.setLayoutParams(layoutParams);
       return;
    }
}
