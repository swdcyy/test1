package ced.d0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ced.d0$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.i;
import android.app.Activity;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import lnc.a1;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yxcorp.plugin.search.result.widget.BottomSheetCoordinatorLayout;
import lnc.d2;
import ced.d0$b;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import ded.m;
import java.lang.Float;
import usd.q;
import io.reactivex.subjects.PublishSubject;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class d0 extends PresenterV2	// class@000548
{
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public BottomSheetCoordinatorLayout p;
    public View q;
    public View r;
    public View s;
    public View t;
    public View u;
    public View v;
    public View w;
    public BaseFragment x;
    public PublishSubject y;
    public QPhoto z;
    public static final d0$a F;

    static {
       d0.F = new d0$a(null);
    }
    public void d0(){
       super();
       this.E = 4;
    }
    public void E8(){
       boolean i;
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.applyVoid(null, this, d0.class, "3")) {
          return;
       }
       if (this.A == null) {
          return;
       }
       boolean b = false;
       if (i.c()) {
          Activity activity = this.getActivity();
          a.m(activity);
          i = n.A(activity);
       }else {
          i = 0;
       }
       d0 tv = this.v;
       if (tv != null) {
          layoutParams = tv.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = i;
          }
       }
       this.V8(0);
       d0 tq = this.q;
       String str = "mActionBar";
       if (tq == null) {
          a.S(str);
       }
       tq.getLayoutParams().height = a1.d(0x7f070fdf) + a1.e(12.00f);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       d0 tq1 = this.q;
       if (tq1 == null) {
          a.S(str);
       }
       int paddingLeft = tq1.getPaddingLeft();
       int i1 = a1.e(12.00f);
       d0 tq2 = this.q;
       if (tq2 == null) {
          a.S(str);
       }
       int paddingRight = tq2.getPaddingRight();
       d0 tq3 = this.q;
       if (tq3 == null) {
          a.S(str);
       }
       tq.setPadding(paddingLeft, i1, paddingRight, tq3.getPaddingBottom());
       tq = this.r;
       String str1 = "mAppbarLayout";
       if (tq == null) {
          a.S(str1);
       }
       d0 tr = this.r;
       if (tr == null) {
          a.S(str1);
       }
       i1 = tr.getPaddingLeft();
       tq2 = this.q;
       if (tq2 == null) {
          a.S(str);
       }
       layoutParams = tq2.getLayoutParams().height;
       tq2 = this.r;
       if (tq2 == null) {
          a.S(str1);
       }
       paddingRight = tq2.getPaddingRight();
       tq3 = this.r;
       if (tq3 == null) {
          a.S(str1);
       }
       tq.setPadding(i1, layoutParams, paddingRight, tq3.getPaddingBottom());
       tq = this.w;
       if (tq == null) {
          a.S("mOuterCoordinatorLayout");
       }
       ViewGroup$LayoutParams layoutParams1 = tq.getLayoutParams();
       Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams1.topMargin = - a1.e(12.00f);
       i = true;
       this.S8(i);
       tv = this.s;
       if (tv == null) {
          a.S("mCameraBtn");
       }
       this.B = tv.getVisibility();
       tv = this.t;
       if (tv == null) {
          a.S("mCameraGroup");
       }
       this.C = tv.getVisibility();
       tv = this.u;
       if (tv == null) {
          a.S("mMomentGroup");
       }
       this.D = tv.getVisibility();
       tv = this.p;
       if (tv != null) {
          BottomSheetBehavior behavior = tv.getBehavior();
          if (behavior != null) {
             behavior.setState(4);
             behavior.setSkipCollapsed(b);
             behavior.setHideable(i);
             behavior.setPeekHeight((int)((float)d2.e() * 0x3f400000));
             behavior.setBottomSheetCallback(new d0$b(this));
          }
       }
       return;
    }
    public final void P8(boolean p0){
       ClientContent$PhotoPackage photoPackage;
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod0, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "HALF_SCREEN_CHANGE";
       i3 oi3 = i3.f();
       String str = (p0)? "HALF_SCREEN": "FULL_SCREEN";
       oi3.d("click_type", str);
       uElementPack.params = oi3.e();
       d0 tz = this.z;
       if (tz != null) {
          BaseFeed entity = tz.getEntity();
          if (entity != null) {
             photoPackage = w1.f(entity);
          label_0044 :
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = photoPackage;
             d0 tx = this.x;
             if (tx == null) {
                a.S("mBaseFragment");
             }
             u1.M("", tx, 0, uElementPack, uContentPack, null);
             return;
          }
       }
       photoPackage = null;
       goto label_0044 ;
    }
    public final void R8(boolean p0){
       d0 ts;
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod0, "5")) {
          return;
       }
       String str = "mMomentGroup";
       String str1 = "mCameraGroup";
       String str2 = "mCameraBtn";
       if (p0) {
          if (this.B == null) {
             ts = this.s;
             if (ts == null) {
                a.S(str2);
             }
             n.Y(ts, this.B, true);
          }
          if (this.C == null) {
             ts = this.t;
             if (ts == null) {
                a.S(str1);
             }
             n.Y(ts, this.C, true);
          }
          if (this.D == null) {
             ts = this.u;
             if (ts == null) {
                a.S(str);
             }
             n.Y(ts, this.D, true);
          }
       }else {
          ts = this.s;
          if (ts == null) {
             a.S(str2);
          }
          n.Y(ts, 8, true);
          ts = this.t;
          if (ts == null) {
             a.S(str1);
          }
          n.Y(ts, 8, true);
          ts = this.u;
          if (ts == null) {
             a.S(str);
          }
          n.Y(ts, 8, true);
       }
       return;
    }
    public final void S8(boolean p0){
       d0 tq;
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod0, "4")) {
          return;
       }
       String str = "mActionBar";
       if (p0) {
          m.b(this.p, a1.e(16.00f));
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          m.b(tq, a1.e(16.00f));
       }else {
          m.b(this.p, 0);
          tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          m.b(tq, 0);
       }
       return;
    }
    public final void V8(float p0){
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(uod0) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod0, "6")) {
          return;
       }
       int i = 0;
       float f = (float)i;
       if (p0 - f >= 0) {
          p0 = q.m(0, ((p0 * 2.00f) - (float)1));
          d0 tv = this.v;
          if (tv != null) {
             tv.setAlpha(p0);
          }
          tv = this.y;
          if (tv == null) {
             a.S("mStatusBarBlackTextSubject");
          }
          if (p0 - f > 0) {
             i = true;
          }
          tv.onNext(Boolean.valueOf(i));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3d25);
       View view = m1.f(p0, R.id.title_root);
       a.o(view, "bindWidget\(rootView, R.id.title_root\)");
       this.q = view;
       view = m1.f(p0, R.id.app_bar_layout);
       a.o(view, "bindWidget\(rootView, R.id.app_bar_layout\)");
       this.r = view;
       view = m1.f(p0, R.id.float_camera_btn);
       a.o(view, "bindWidget\(rootView, R.id.float_camera_btn\)");
       this.s = view;
       view = m1.f(p0, R.id.float_camera_group);
       a.o(view, "bindWidget\(rootView, R.id.float_camera_group\)");
       this.t = view;
       view = m1.f(p0, R.id.float_forward_moment_group);
       a.o(view, "bindWidget\(rootView, R.i¡­oat_forward_moment_group\)");
       this.u = view;
       this.v = m1.f(p0, 0x7f0a4008);
       p0 = m1.f(p0, R.id.tag_page_root);
       a.o(p0, "bindWidget\(rootView, R.id.tag_page_root\)");
       this.w = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "2")) {
          return;
       }
       this.z = this.t8("photo");
       Object obj = this.r8("KEY_ENABLE_HALF_PAGE");
       a.o(obj, "inject\(TagPageConst.KEY_ENABLE_HALF_PAGE\)");
       this.A = obj.booleanValue();
       obj = this.r8("PageFragment");
       a.o(obj, "inject\(TagPageConst.PAGE_FRAGMENT\)");
       this.x = obj;
       obj = this.r8("KEY_STATUS_BAR_BLACK_TEXT");
       a.o(obj, "inject\(TagPageConst.KEY_STATUS_BAR_BLACK_TEXT\)");
       this.y = obj;
       return;
    }
}
