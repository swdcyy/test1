package b8a.o2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.o2$a;
import b8a.o2$b;
import android.widget.TextView;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.app.Activity;
import android.view.View;
import m9a.k;
import androidx.appcompat.widget.AppCompatTextView;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import qrd.l1;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayPictureTagPresenter$initTagText$1$2;
import msd.q;
import com.yxcorp.gifshow.util.l;
import vy6.a;
import jta.c;
import r7a.f;
import b8a.o2$c;
import xx9.a;
import erd.g;
import crd.b;
import le5.f;
import bf5.q;
import b8a.o2$d;
import io.reactivex.internal.functions.Functions;
import brd.t;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import java.lang.Float;
import java.lang.Boolean;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class o2 extends PresenterV2	// class@0003d5
{
    public int A;
    public final a p;
    public final c q;
    public BaseFragment r;
    public QPhoto s;
    public f t;
    public a u;
    public SlidePlayViewModel v;
    public AppCompatTextView w;
    public TextView x;
    public q y;
    public boolean z;

    public void o2(){
       super();
       this.p = new o2$a(this);
       this.q = new o2$b(this);
    }
    public static final TextView P8(o2 p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mOpenAtlasButton");
       }
       return p0;
    }
    public void E8(){
       float f;
       o2 oo2 = o2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo2, "3")) {
          return;
       }
       o2 tr = this.r;
       String str = "mFragment";
       if (tr == null) {
          a.S(str);
       }
       this.v = SlidePlayViewModel.B0(tr.getParentFragment());
       if (!PatchProxy.applyVoid(objArray, this, oo2, "5") && this.w == null) {
          Activity activity = this.getActivity();
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          AppCompatTextView uAppCompatTe = k.a(activity, tr, R.id.picture_tag_text);
          this.w = uAppCompatTe;
          if (uAppCompatTe != null) {
             GradientDrawable gradientDraw = new GradientDrawable();
             gradientDraw.setColor(a1.a(R.color.arg_RES_7f061c03));
             int i = 0;
             gradientDraw.setShape(i);
             gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f07031b));
             uAppCompatTe.setPadding(this.R8(4), this.R8(i), this.R8(5), this.R8(i));
             uAppCompatTe.setBackground(gradientDraw);
             uAppCompatTe.getLayoutParams().height = a1.e(20.00f);
             uAppCompatTe.requestLayout();
             uAppCompatTe.setVisibility(i);
             l.b(uAppCompatTe, SlidePlayPictureTagPresenter$initTagText$1$2.INSTANCE);
          }
       }
    label_0094 :
       oo2 = this.v;
       if (oo2 != null) {
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          oo2.P(tr, this.p);
       }
       oo2 = this.t;
       if (oo2 == null) {
          a.S("mSidebarStatusHelper");
       }
       oo2.a(this.q);
       oo2 = this.x;
       String str1 = "mOpenAtlasButton";
       if (oo2 == null) {
          a.S(str1);
       }
       this.A = oo2.getVisibility();
       oo2 = this.u;
       if (oo2 == null) {
          a.S("mScreenCleanStatusCombination");
       }
       this.X7(a.j(oo2, new o2$c(this), objArray, 2, objArray));
       oo2 = this.x;
       if (oo2 == null) {
          a.S(str1);
       }
       if (!oo2.getVisibility()) {
          oo2 = this.x;
          if (oo2 == null) {
             a.S(str1);
          }
          o2 tv = this.v;
          f = (tv != null && tv.r() == true)? 0: 0x3f800000;
          oo2.setAlpha(f);
       }
       if (f.o()) {
          oo2 = this.y;
          String str2 = "mMilanoProfileSideEventBus";
          if (oo2 == null) {
             a.S(str2);
          }
          this.X8(oo2.i);
          oo2 = this.y;
          if (oo2 == null) {
             a.S(str2);
          }
          this.X7(oo2.D.subscribe(new o2$d(this), Functions.e));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o2.class, "9")) {
          return;
       }
       o2 tv = this.v;
       if (tv != null) {
          o2 tr = this.r;
          if (tr == null) {
             a.S("mFragment");
          }
          tv.D(tr, this.p);
       }
       tv = this.t;
       if (tv == null) {
          a.S("mSidebarStatusHelper");
       }
       tv.c(this.q);
       return;
    }
    public final int R8(int p0){
       o2 oo2 = o2.class;
       if (PatchProxy.isSupport(oo2)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oo2, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return a1.e((float)p0);
    }
    public final void S8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o2.class, "6")) {
          return;
       }
       o2 tw = this.w;
       if (tw != null) {
          tw.setCompoundDrawablePadding(this.R8(2));
          o2 ts = this.s;
          if (ts == null) {
             a.S("mPhoto");
          }
          if (ts.isLongPhotos()) {
             tw.setCompoundDrawablesRelativeWithIntrinsicBounds(a1.f(R.drawable.arg_RES_7f080a8d), objArray, objArray, objArray);
             tw.setText(a1.p(R.string.arg_RES_7f1030c7));
          }else {
             ts = this.s;
             if (ts == null) {
                a.S("mPhoto");
             }
             if (ts.isAtlasPhotos()) {
                tw.setCompoundDrawablesRelativeWithIntrinsicBounds(a1.f(R.drawable.arg_RES_7f080a6e), objArray, objArray, objArray);
                tw.setText(a1.p(R.string.arg_RES_7f104b99));
             }
          }
       }
       return;
    }
    public final void V8(float p0){
       o2 oo2 = o2.class;
       if (PatchProxy.isSupport(oo2) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oo2, "7")) {
          return;
       }
       oo2 = this.w;
       if (oo2 != null) {
          oo2.setAlpha(p0);
       }
       oo2 = this.x;
       String str = "mOpenAtlasButton";
       if (oo2 == null) {
          a.S(str);
       }
       if (!oo2.getVisibility()) {
          oo2 = this.x;
          if (oo2 == null) {
             a.S(str);
          }
          oo2.setAlpha(((float)1 - p0));
       }
       return;
    }
    public final boolean W8(){
       boolean b;
       o2 obj = PatchProxy.apply(null, this, o2.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.s;
       if (obj == null) {
          a.S("mPhoto");
       }
       if (!obj.isAtlasPhotos()) {
          obj = this.s;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (!obj.isLongPhotos()) {
             b = false;
          label_0034 :
             return b;
          }
       }
       b = true;
       goto label_0034 ;
    }
    public final void X8(int p0){
       o2 oo2 = o2.class;
       if (PatchProxy.isSupport(oo2) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oo2, "4")) {
          return;
       }
       oo2 = this.w;
       if (oo2 != null) {
          ViewGroup$LayoutParams layoutParams = oo2.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.bottomMargin = a1.d(0x7f070271) + p0;
          oo2.setLayoutParams(layoutParams);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o2.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.open_long_atlas);
       a.o(p0, "ViewBindUtils.bindWidget¡­ew, R.id.open_long_atlas\)");
       this.x = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o2.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.r = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.s = obj;
       obj = this.r8("NASA_SIDEBAR_STATUS");
       a.o(obj, "inject\(DetailAccessIds.NASA_SIDEBAR_STATUS\)");
       this.t = obj;
       obj = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.u = obj;
       obj = this.q8(q.class);
       a.o(obj, "inject\(MilanoProfileSideEventBus::class.java\)");
       this.y = obj;
       return;
    }
}
