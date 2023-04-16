package yha.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.feedstaggercard.experiment.HomeCardExperimentUtil;
import android.app.Activity;
import tkd.b;
import tkd.d;
import hn5.n;
import android.content.Context;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.f;
import brd.t;
import t45.d;
import brd.z;
import yha.a$b;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.gifshow.follow.common.widget.wave.WaveView;
import wha.e;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.util.Objects;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import yha.a$a;
import android.view.View$OnClickListener;

public class a extends PresenterV2	// class@0049ed
{
    public KwaiImageView p;
    public TextView q;
    public View r;
    public View s;
    public View t;
    public WaveView u;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       this.X8();
       if (HomeCardExperimentUtil.h.a() && (this.getActivity() != null && (d.a(-1883158055).U3(this.getActivity()) && !FollowConfigUtil.i()))) {
          this.X7(RxBus.f.f(f.class).observeOn(d.a).subscribe(new a$b(this)));
       }
    label_0050 :
       return;
    }
    public void P8(){
    }
    public final KwaiImageView R8(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mAvatarView");
       }
       return obj;
    }
    public final TextView S8(){
       a obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("mLabelView");
       }
       return obj;
    }
    public final View V8(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mLiveLabelView");
       }
       return obj;
    }
    public final WaveView W8(){
       a obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj == null) {
          a.S("mWaveView");
       }
       return obj;
    }
    public final void X8(){
       Object obj = this;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uoa, "15")) {
          return;
       }
       if (!e.c.b(this.getActivity()) - 0x3f800000) {
          return;
       }
       Activity activity = this.getActivity();
       a t = obj.t;
       if (t == null) {
          a.S("mContainer");
       }
       int i = 0x7f07033d;
       e.d(activity, t, a1.d(i), a1.d(R.dimen.arg_RES_7f070348), 0, 0, 0, 0, 240, null);
       Activity activity1 = this.getActivity();
       a p = obj.p;
       String str = "mAvatarView";
       if (p == null) {
          a.S(str);
       }
       e.d(activity1, p, a1.d(R.dimen.arg_RES_7f07031f), a1.d(R.dimen.arg_RES_7f07031f), 0, 0, 0, 0, 240, null);
       t = obj.p;
       if (t == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = t.getLayoutParams();
       String str1 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
       Objects.requireNonNull(layoutParams, str1);
       layoutParams.topMargin = e.c(this.getActivity(), a1.d(0x7f07025d));
       a p1 = obj.p;
       if (p1 == null) {
          a.S(str);
       }
       p1.setLayoutParams(layoutParams);
       Activity activity2 = this.getActivity();
       a s = obj.s;
       if (s == null) {
          a.S("mLiveRingView");
       }
       e.d(activity2, s, a1.d(R.dimen.arg_RES_7f070325), a1.d(R.dimen.arg_RES_7f070325), 0, 0, 0, 0, 240, null);
       a q = obj.q;
       String str2 = "mLabelView";
       if (q == null) {
          a.S(str2);
       }
       q.setMaxWidth(e.c(this.getActivity(), a1.d(R.dimen.arg_RES_7f070335)));
       q = obj.q;
       if (q == null) {
          a.S(str2);
       }
       q.setTextSize(1, (float)e.c(this.getActivity(), 11));
       activity2 = this.getActivity();
       s = obj.r;
       str = "mLiveLabelView";
       if (s == null) {
          a.S(str);
       }
       e.d(activity2, s, a1.d(R.dimen.arg_RES_7f070307), a1.d(R.dimen.arg_RES_7f0702a4), 0, 0, 0, 0, 240, null);
       t = obj.r;
       if (t == null) {
          a.S(str);
       }
       layoutParams = t.getLayoutParams();
       Objects.requireNonNull(layoutParams, str1);
       layoutParams.bottomMargin = e.c(this.getActivity(), a1.d(0x7f07030a));
       a r = obj.r;
       if (r == null) {
          a.S(str);
       }
       r.setLayoutParams(layoutParams);
       if (!PatchProxy.applyVoid(objArray, obj, uoa, "16")) {
          activity = this.getActivity();
          t = obj.u;
          String str3 = "mWaveView";
          if (t == null) {
             a.S(str3);
          }
          e.d(activity, t, a1.d(i), a1.d(i), 0, 0, 0, 0, 240, null);
          a u = obj.u;
          if (u == null) {
             a.S(str3);
          }
          u.setCenterRadius((float)e.c(this.getActivity(), a1.e(29.00f)));
          u = obj.u;
          if (u == null) {
             a.S(str3);
          }
          u.setMaxWidth((float)e.c(this.getActivity(), a1.e(4.00f)));
          u = obj.u;
          if (u == null) {
             a.S(str3);
          }
          u.setWidth((float)e.c(this.getActivity(), a1.e(2.00f)));
          u = obj.u;
          if (u == null) {
             a.S(str3);
          }
          u.setMaxRadius((float)e.c(this.getActivity(), a1.e(38.00f)));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       View view = m1.f(p0, R.id.pymi_user_avatar);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.pymi_user_avatar\)");
       this.p = view;
       view = m1.f(p0, R.id.pymi_user_live_label);
       a.o(view, "ViewBindUtils.bindWidget¡­.id.pymi_user_live_label\)");
       this.r = view;
       view = m1.f(p0, R.id.pymi_user_label);
       a.o(view, "ViewBindUtils.bindWidget¡­ew, R.id.pymi_user_label\)");
       this.q = view;
       view = m1.f(p0, R.id.pymi_user_avatar_ring);
       a.o(view, "ViewBindUtils.bindWidget¡­id.pymi_user_avatar_ring\)");
       this.s = view;
       View view1 = m1.f(p0, R.id.pymi_user_container);
       a.o(view1, "ViewBindUtils.bindWidget¡­R.id.pymi_user_container\)");
       this.t = view1;
       view1 = m1.f(p0, R.id.pymi_wave_view);
       a.o(view1, "ViewBindUtils.bindWidget¡­iew, R.id.pymi_wave_view\)");
       this.u = view1;
       m1.a(p0, new a$a(this), R.id.pymi_user_container);
       return;
    }
}
