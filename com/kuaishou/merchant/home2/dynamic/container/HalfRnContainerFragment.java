package com.kuaishou.merchant.home2.dynamic.container.HalfRnContainerFragment;
import zt3.e;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import com.kuaishou.merchant.container.halfcontainer.model.HalfContainerParams;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import com.kuaishou.krn.model.LaunchModel;
import zt3.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.widget.FrameLayout;
import com.kuaishou.merchant.container.halfcontainer.widget.RoundCornerViewLayout;
import lnc.a1;
import java.lang.Integer;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import cu3.a;
import cu3.a$a;
import android.content.Context;
import mx3.c;
import android.view.View$OnClickListener;
import android.graphics.drawable.ColorDrawable;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.kuaishou.merchant.home2.dynamic.container.RnBottomSheetBehavior;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import mx3.d;
import com.kuaishou.merchant.container.halfcontainer.widget.ContainerBottomSheetBehavior$c;
import mx3.b;
import o07.d$a;
import o07.d;
import android.os.Parcelable;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;

public class HalfRnContainerFragment extends DialogContainerFragment implements e	// class@00173f
{
    public RnBottomSheetBehavior H;
    public HalfContainerParams I;
    public ColorDrawable J;
    public int K;
    public d$a L;
    public Handler M;
    public String N;
    public static final int O;

    public void HalfRnContainerFragment(){
       super();
       this.I = new HalfContainerParams();
       this.K = 4;
       this.uh(R.style.arg_RES_7f11035a);
    }
    public void Ha(LaunchModel p0){
       d.d(this, p0);
    }
    public void Nh(float p0){
       if (PatchProxy.isSupport(HalfRnContainerFragment.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, HalfRnContainerFragment.class, "11")) {
          return;
       }
       if (this.getView() != null) {
          FrameLayout uFrameLayout = this.getView().findViewById(R.id.content_fragment);
          if (uFrameLayout instanceof RoundCornerViewLayout) {
             int i = (p0 - 0x3f800000 < 0)? a1.e((float)this.I.f): 0;
             uFrameLayout.setTopRadius(i);
          }
       }
       return;
    }
    public void Oh(int p0){
       if (PatchProxy.isSupport(HalfRnContainerFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, HalfRnContainerFragment.class, "6")) {
          return;
       }
       if (this.getView() != null && p0 >= 0) {
          View view = this.getView().findViewById(R.id.container);
          if (view == null) {
             return;
          }else {
             view.setPadding(0, 0, 0, p0);
          }
       }
       return;
    }
    public KwaiRnFragment U2(){
       return d.b(this);
    }
    public void d8(LaunchModel p0){
       d.e(this, p0);
    }
    public String f(){
       return this.N;
    }
    public Activity getActivity(){
       return super.getActivity();
    }
    public int getLayoutResId(){
       return 0x7f0d132a;
    }
    public String getUrl(){
       return d.c(this);
    }
    public void nf(){
       if (PatchProxy.applyVoid(null, this, HalfRnContainerFragment.class, "13")) {
          return;
       }
       this.dismissAllowingStateLoss();
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HalfRnContainerFragment.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, HalfRnContainerFragment.class, "7") && (this.I.i == null && (this.getDialog() != null && this.getDialog().getWindow() != null))) {
          a.a.a(this.getDialog().getWindow());
       }
    label_003a :
       super.onActivityCreated(p0);
       if (PatchProxy.applyVoid(null, this, HalfRnContainerFragment.class, "8") || (this.getDialog() != null && this.getDialog().getWindow() != null)) {
          int i1 = -1;
          if (this.I.i == null) {
             a.a.b(this.getDialog().getWindow());
          }else {
             this.getDialog().getWindow().clearFlags(2);
             this.getDialog().getWindow().setLayout(i1, -2);
          }
          if (this.I.h == null) {
             this.getDialog().getWindow().setLayout(i1, (int)this.I.b(this.getContext()));
          }else {
             this.getDialog().getWindow().setLayout(i1, (int)this.I.a(this.getContext()));
          }
       }
    label_00b9 :
       if (!PatchProxy.applyVoid(null, this, HalfRnContainerFragment.class, "9") && this.getView() != null) {
          View view = this.getView().findViewById(R.id.container_coordinator_layout);
          view.setOnClickListener(new c(this));
          if (this.I.h != null) {
             ColorDrawable uColorDrawab = new ColorDrawable(this.getContext().getResources().getColor(0x7f062046));
             this.J = uColorDrawab;
             int i = 0;
             uColorDrawab.setAlpha(i);
             view.setBackground(this.J);
             FrameLayout uFrameLayout = this.getView().findViewById(R.id.content_fragment);
             if (uFrameLayout != null) {
                uFrameLayout.setBackgroundColor(i);
                RnBottomSheetBehavior rnBottomShee = new RnBottomSheetBehavior();
                this.H = rnBottomShee;
                rnBottomShee.setHideable(true);
                this.H.e(0x3f4ccccd);
                this.H.setPeekHeight((int)this.I.b(this.getContext()));
                uFrameLayout.getLayoutParams().o(this.H);
                this.H.c(new d(this));
             }
          }
          this.Nh(0);
          this.Ih((this.I.g ^ true));
       }
       if (PatchProxy.applyVoid(null, this, HalfRnContainerFragment.class, "5") || (this.getDialog() != null && this.getDialog().getWindow() != null)) {
          this.getDialog().getWindow().setSoftInputMode(18);
          this.L = new b(this);
          d.b(this.getDialog().getWindow(), this.L);
       }
    label_0196 :
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HalfRnContainerFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.I = this.getArguments().getParcelable("containerParams");
       }
       this.Mh(this.I.e);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, HalfRnContainerFragment.class, "12")) {
          return;
       }
       super.onDestroy();
       if (this.L != null && (this.getDialog() != null && this.getDialog().getWindow() != null)) {
          d.c(this.getDialog().getWindow(), this.L);
          this.L = null;
       }
    label_0032 :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HalfRnContainerFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       return;
    }
    public String te(LaunchModel p0){
       return d.a(this, p0);
    }
}
