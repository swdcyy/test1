package com.yxcorp.gifshow.designermagic.v2.c;
import com.yxcorp.gifshow.fragment.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import tw9.d;
import lnc.a1;
import g9c.d;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import i2b.a;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import qvb.i;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import cw9.c;
import java.lang.CharSequence;
import mkc.b;
import android.view.ViewGroup$LayoutParams;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.robust.PatchProxyResult;
import sw9.b;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import o56.c;
import android.app.Application;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Number;
import xa5.a;
import com.kwai.library.widget.specific.misc.LoadingView;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewParent;

public class c extends e	// class@001330
{
    public RecyclerFragment i;
    public View j;
    public TextView k;
    public View l;
    public View m;
    public View$OnClickListener n;
    public boolean o;
    public int p;

    public void c(RecyclerFragment p0){
       super(p0);
       this.n = new d(this);
       this.p = a1.e(16.00f);
       this.i = p0;
       d uod = p0.ia();
       this.c = uod;
       uod.l1(this.e);
       View view = a.i(this.i.h0(), R.layout.arg_RES_7f0d1619);
       this.j = view;
       TextView textView = view.findViewById(R.id.no_more_tv);
       this.k = textView;
       textView.setGravity(17);
       this.j.setPadding(a1.e(12.00f), 0, a1.e(12.00f), 0);
    }
    public void d(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "5")) {
          return;
       }
       if (p0 && this.i.q().isEmpty()) {
          this.f();
          this.j();
          this.f.f(true, 0);
          this.f.getTitleView().setPadding(c.b(this.i.getResources(), R.dimen.arg_RES_7f070a7f), 0, 0, 0);
          if (!this.c.U0(this.f)) {
             this.w(this.f);
             this.c.P0(this.f);
          }
          this.f.setTitleDetailText(null);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.c.m1(this.m);
       this.j();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       this.c.l1(this.j);
       return;
    }
    public void i(){
       int i;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       this.x();
       if (this.m == null) {
          View view = a.i(this.i.h0(), b.i.a);
          this.m = view;
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          layoutParams.width = -1;
          layoutParams.height = -2;
          this.m.setLayoutParams(layoutParams);
          this.m.setMinimumHeight(n.c(a.B, 245.00f));
          view = this.m.getChildAt(0);
          if (view != null) {
             FrameLayout$LayoutParams layoutParams1 = view.getLayoutParams();
             layoutParams1.gravity = 48;
             layoutParams1.topMargin = n.c(a.B, 25.00f);
             view.setLayoutParams(layoutParams1);
          }
       }
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.k(R.drawable.arg_RES_7f0805d7);
       String str = PatchProxy.apply(objArray, this, uoc, "13");
       if (str != PatchProxyResult.class) {
       }else if(b.a()){
          i = 0x7f1009fb;
       }else {
          i = 0x7f1009fa;
       }
       str = a1.p(i);
       uoa.i(str);
       uoa.a(this.m);
       if (!this.c.U0(this.m)) {
          this.w(this.m);
          this.c.P0(this.m);
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       c tl = this.l;
       if (tl != null && this.c.U0(tl)) {
          this.c.m1(this.l);
       }
       return;
    }
    public void k(boolean p0,Throwable p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "10")) {
          return;
       }
       if (p1 instanceof KwaiException && p1.mErrorCode == 13) {
          return;
       }
       this.f();
       if (p0 && !this.c.W0().getItemCount()) {
          if (this.l == null) {
             this.l = a.i(this.a, 0x7f0d1276);
          }
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.p(this.n);
          uoa.q(1);
          uoa.a(this.l).setLayoutParams(new ViewGroup$LayoutParams(-1, a1.d(R.dimen.arg_RES_7f070d45)));
          if (!this.c.U0(this.l)) {
             this.w(this.l);
             this.c.P0(this.l);
          }
       }else {
          ExceptionHandler.handleException(a.a().a(), p1);
       }
       return;
    }
    public void p(){
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "8")) {
          return;
       }
       this.k.setMovementMethod(LinkMovementMethod.getInstance());
       c tk = this.k;
       String str = PatchProxy.apply(objArray, this, uoc, "14");
       if (str != patchProxyRe) {
       }else if(b.a()){
          i1 = 0x7f1009fd;
       }else {
          i1 = 0x7f1009fc;
       }
       str = a1.p(i1);
       tk.setText(str);
       ViewGroup$LayoutParams layoutParams = this.k.getLayoutParams();
       int i = 0;
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.setMargins(i, i, i, i);
       }
       this.k.setLayoutParams(layoutParams);
       this.k.setPadding(a1.e(3.00f), a1.e(16.00f), a1.e(3.00f), this.p);
       Object obj = PatchProxy.apply(objArray, this, uoc, "7");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else if(this.o == null && a.g(this.i)){
          i = a1.d(R.dimen.arg_RES_7f070bf1);
       }
       if (this.j.getPaddingBottom() != i) {
          c tj = this.j;
          tj.setPadding(tj.getPaddingLeft(), this.j.getPaddingTop(), this.j.getPaddingRight(), i);
       }
       if (!this.c.T0(this.j)) {
          this.w(this.j);
          this.c.L0(this.j);
       }
       return;
    }
    public void u(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       LoadingView loadingView = new LoadingView(p0, 0x7f110210);
       this.f = loadingView;
       loadingView.setBackgroundColor(p0.getResources().getColor(0x106000d));
       this.f.setPadding(0, c.b(p0.getResources(), R.dimen.arg_RES_7f0702b8), 0, 0);
       this.f.setLayoutParams(new RecyclerView$LayoutParams(-1, -2));
       TextView titleView = this.f.getTitleView();
       titleView.setCompoundDrawablePadding(a1.e(12.00f));
       titleView.setTextSize(14.00f);
       return;
    }
    public final void w(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "12")) {
          return;
       }
       if (p0 != null && p0.getParent() instanceof ViewGroup) {
          p0.getParent().removeView(p0);
       }
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       this.c.m1(this.f);
       return;
    }
}
