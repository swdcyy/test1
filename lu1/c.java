package lu1.c;
import lu1.q;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkLayoutViewType;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import hu1.c;
import du1.d;
import st1.a;
import ht1.a;
import mu1.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.LiveMultiPkRenderChildViewController;
import ut1.f;
import pu1.m;
import java.lang.Boolean;
import android.view.ViewGroup;
import mu1.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView;
import com.kuaishou.live.common.core.component.pk.combowin.LivePkComboWinNumberScrollView;
import java.util.Objects;
import jw1.b;
import android.animation.Animator;
import va1.n0;
import ekd.k1;
import ju1.a;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.LiveMultiPkRenderCellViewModel;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import ut1.j;
import android.view.View;
import android.view.ViewStub;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkSwitchManager;
import lu1.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.render.viewcontroller.participant.cell.a;
import ut1.b;
import java.lang.Number;
import java.lang.Integer;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.CharSequence;
import d61.f0;
import com.yxcorp.gifshow.image.KwaiImageView;
import cu1.d;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import android.widget.ImageView;
import qrd.l1;

public final class c extends q	// class@00303b
{
    public LiveMultiPkDuetContinuousWinView K;
    public ViewStub L;
    public ViewGroup M;
    public final d N;
    public final a O;
    public final a P;
    public final i Q;

    public void c(LiveMultiPkLayoutViewType p0,LiveMultiPkViewStyle p1,c p2,d p3,a p4,a p5,i p6){
       a.p(p0, "viewType");
       a.p(p1, "viewStyle");
       a.p(p2, "renderModel");
       a.p(p3, "renderDelegate");
       a.p(p4, "logDelegate");
       a.p(p5, "skinManager");
       super(p0, p1, p2, p3, p4);
       this.N = p3;
       this.O = p4;
       this.P = p5;
       this.Q = p6;
    }
    public void F2(){
       boolean b;
       c tM1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "9")) {
          return;
       }
       super.F2();
       f value = this.Y2().getValue();
       Object obj = PatchProxy.applyOneRefs(value, objArray, m.class, "25");
       int i = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(value != null && value.g() == 2){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          c tM = this.M;
          if (tM == null) {
             a.S("mWishListContainer");
          }
          tM.setVisibility(i);
          Object obj1 = PatchProxy.apply(objArray, this, uoc, "11");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             c tQ = this.Q;
             if (tQ != null) {
                a uoa = new a(this.N, this.H, tQ, this.b3(), this.b3(), this.q3());
             }
          }
          if (objArray != null) {
             tM1 = this.M;
             if (tM1 == null) {
                a.S("mWishListContainer");
             }
             this.y2(tM1, objArray);
          }
       }else {
          tM1 = this.M;
          if (tM1 == null) {
             a.S("mWishListContainer");
          }
          tM1.setVisibility(8);
       }
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "10")) {
          return;
       }
       super.J2();
       c tK = this.K;
       if (tK != null && !PatchProxy.applyVoid(objArray, tK, LiveMultiPkDuetContinuousWinView.class, "4")) {
          tK.setVisibility(8);
          tK.D.N();
          tK.H.N();
          LiveMultiPkDuetContinuousWinView b = tK.B;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(objArray, b, b.class, "2")) {
             n0.m(b.a);
             k1.n(b);
          }
          tK.N = -1;
       }
       return;
    }
    public boolean S(){
       return false;
    }
    public void V2(a p0){
       this.f3(p0);
    }
    public void d3(ViewGroup p0){
       View view;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "1")) {
          return;
       }
       a.p(p0, "root");
       super.d3(p0);
       Object[] objArray = null;
       int i = 0x7f0708ef;
       if (!PatchProxy.applyVoid(objArray, this, uoc, "13")) {
          ViewGroup$LayoutParams layoutParams1 = this.m3().getLayoutParams();
          Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams1.bottomMargin = a1.d(0x7f07084a);
          if (this.a3().f()) {
             layoutParams1.bottomMargin = layoutParams1.bottomMargin + a1.d(i);
          }
          layoutParams1.rightMargin = a1.d(0x7f07084a);
          this.m3().setLayoutParams(layoutParams1);
       }
       view = this.l3().findViewById(R.id.live_multi_pk_duet_continuous_win_view_stub);
       a.o(view, "pkCellView.findViewById\(¡­continuous_win_view_stub\)");
       this.L = view;
       view = this.l3().findViewById(R.id.live_wish_list_item_container);
       a.o(view, "pkCellView.findViewById\(¡­wish_list_item_container\)");
       this.M = view;
       if (!LiveMultiPkSwitchManager.d.a()) {
          this.y3();
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "16")) {
          c tM = this.M;
          if (tM == null) {
             a.S("mWishListContainer");
          }
          ViewGroup$LayoutParams layoutParams = tM.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.bottomMargin = a1.d(0x7f07084a);
          if (this.a3().f()) {
             layoutParams.bottomMargin = layoutParams.bottomMargin + a1.d(i);
          }
          layoutParams.leftMargin = a1.d(0x7f07084a);
          c tM1 = this.M;
          if (tM1 == null) {
             a.S("mWishListContainer");
          }
          tM1.setLayoutParams(layoutParams);
       }
       return;
    }
    public void f3(LiveMultiPkRenderCellViewModel p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "8")) {
          return;
       }
       a.p(p0, "viewModel");
       super.f3(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "12")) {
          p0.z0().observe(this, new a(this));
          p0.y.observe(this, new a(this, p0));
       }
       return;
    }
    public b g3(){
       Object obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.N.h1(true, this.q3());
    }
    public int n3(){
       return 0x7f0d0cbf;
    }
    public int o3(){
       Object obj = PatchProxy.apply(null, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f07084a);
    }
    public int p3(){
       Object obj = PatchProxy.apply(null, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.d(0x7f07084a);
    }
    public void t3(int p0,boolean p1,boolean p2){
       Object[] objArray;
       LiveLottieAnimationView liveLottieAn;
       q oq = this;
       int i = p0;
       int b = p1;
       boolean b1 = p2;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, c.class, "3")) {
          return;
       }
       int i1 = (((this.l3().getMeasuredWidth() - i) - this.o3()) - this.p3()) - a1.e(6.00f);
       TextPaint paint = this.k3().getPaint();
       CharSequence text = this.k3().getText();
       String str = (text != null)? text.toString(): null;
       int i2 = (int)paint.measureText(f0.b(str, oq.D));
       int i3 = d.k(this.j3());
       int i4 = d.k(this.h3());
       int i5 = ((i3 + i4) + i2) + d.j(this.k3());
       b.P(LiveCommonLogTag.MULTI_PK.appendTag("LiveMultiPkDuetCellController"), " [resizeUserInfoViews] leftAreaWidth = "+i+" isMuteIconShowing = "+b+" isFollowIconShowing = "+b1+" maxDisplayWidth = "+i1+" usernameTextMinWidth = "+i2+" muteWidth = "+i3+" followWidth = "+i4+" displayAllElementsMinWidth = "+i5);
       int i6 = 4;
       int i7 = 3;
       int i8 = 2;
       int i9 = 1;
       int i10 = 5;
       if (oq.N.e()) {
          if (PatchProxy.isSupport(c.class)) {
             objArray = new Object[i10];
             objArray[0] = Integer.valueOf(i1);
             objArray[i9] = Integer.valueOf(i5);
             objArray[i8] = Boolean.valueOf(p2);
             objArray[i7] = Integer.valueOf(i3);
             objArray[i6] = Integer.valueOf(i4);
             if (!PatchProxy.applyVoid(objArray, oq, c.class, "4")) {
             }
          }else if(b1){
             liveLottieAn = this.h3();
             if (liveLottieAn != null) {
                b = (i1 < i5)? 8: 0;
                liveLottieAn.setVisibility(b);
             }
          }
          i5 = i5 - i3;
          liveLottieAn = this.h3();
          if (liveLottieAn != null && !liveLottieAn.getVisibility()) {
             i5 = i5 - i4;
          }
          TextView textView = this.k3();
          i5 = (i1 < i5)? 8: 0;
          textView.setVisibility(i5);
       }else if(PatchProxy.isSupport(c.class)){
          objArray = new Object[i10];
          objArray[0] = Integer.valueOf(i1);
          objArray[i9] = Integer.valueOf(i5);
          objArray[i8] = Boolean.valueOf(p1);
          objArray[i7] = Boolean.valueOf(p2);
          objArray[i6] = Integer.valueOf(i3);
          if (!PatchProxy.applyVoid(objArray, oq, c.class, "5")) {
          }
       }else if(b){
          KwaiImageView kwaiImageVie = this.j3();
          b = (i1 < i5)? 8: 0;
          kwaiImageVie.setVisibility(b);
       }
       if (b1) {
          i5 = i5 - i3;
          liveLottieAn = this.h3();
          if (liveLottieAn != null) {
             i5 = (i1 < i5)? 8: 0;
             liveLottieAn.setVisibility(i5);
          }
       }
    label_0195 :
       if (!PatchProxy.applyVoid(null, oq, c.class, "6")) {
          i5 = (!this.k3().getVisibility())? 0x7f07084b: 0x7f0702e3;
          ViewGroup$LayoutParams layoutParams = this.j3().getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.rightMargin = a1.d(i5);
       }
       oq.u3(i1, i2, i3, i4);
       q oq1 = PatchProxy.apply(null, oq, q.class, "7");
       if (oq1 != PatchProxyResult.class) {
       }else {
          oq1 = oq.u;
          if (oq1 == null) {
             a.S("multiPkCellInfoLayout");
          }
       }
       oq1.requestLayout();
       return;
    }
    public boolean v3(){
       return false;
    }
    public final d x3(){
       return this.N;
    }
    public final void y3(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       if (this.K == null) {
          c tL = this.L;
          if (tL == null) {
             a.S("continuousWinViewStub");
          }
          View view = tL.inflate();
          Objects.requireNonNull(view, "null cannot be cast to non-null type com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView");
          int i = (a.g(this.b3(), this.N.d()))? 1: 2;
          view.setContinuousWinPosition(i);
          view.setVisibility(8);
          view.setSkinManager(this.P);
          this.K = view;
       }
       return;
    }
}
