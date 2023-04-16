package j2c.j;
import com.yxcorp.gifshow.fragment.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import s1c.r0;
import j2c.g;
import lnc.a1;
import g9c.d;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import i2b.a;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import qa6.a;
import lkd.b;
import qvb.i;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import cw9.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.text.method.MovementMethod;
import tyc.d2;
import android.graphics.Typeface;
import android.widget.FrameLayout;
import java.lang.Integer;
import zf6.j;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.profile.http.AccountCanceledException;
import com.yxcorp.gifshow.profile.http.BanException;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.n;
import j2c.h;
import android.view.View$OnClickListener;
import j2c.i;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment$c;
import r2c.j;
import com.kwai.library.widget.specific.misc.LoadingView;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Number;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.google.android.material.appbar.AppBarLayout;
import z5c.j0;
import java.lang.Math;
import android.view.ViewParent;

public abstract class j extends e	// class@002c26
{
    public r0 i;
    public RecyclerFragment j;
    public View k;
    public TextView l;
    public View m;
    public TextView n;
    public TextView o;
    public View p;
    public TextView q;
    public View r;
    public View$OnClickListener s;
    public int t;
    public float u;
    public b v;
    public b w;
    public int x;
    public View y;

    public void j(RecyclerFragment p0,r0 p1){
       super(p0);
       this.s = new g(this);
       this.t = a1.e(16.00f);
       this.i = p1;
       this.j = p0;
       d uod = p0.ia();
       this.c = uod;
       uod.l1(this.e);
       View view = a.i(this.j.h0(), R.layout.arg_RES_7f0d1619);
       this.k = view;
       TextView textView = view.findViewById(R.id.no_more_tv);
       this.l = textView;
       textView.setGravity(17);
       j tk = this.k;
       if (PatchProxy.applyVoidTwoRefs(tk, this.l, this, j.class, "1")) {
       }else {
          tk.setPadding(a1.e(12.00f), 0, a1.e(12.00f), 0);
       }
       return;
    }
    public CharSequence A(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       Object obj = PatchProxy.apply(null, this, oj, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, oj, "16");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          j ti = this.i;
          b = (ti != null && a.b(ti.b))? true: false;
       }
       if (b) {
          return a1.p(0x7f103fda);
       }else {
          return a1.p(0x7f103f97);
       }
    }
    public abstract CharSequence B();
    public abstract CharSequence C();
    public void D(b p0){
       this.v = p0;
    }
    public void E(int p0){
       this.t = p0;
    }
    public void d(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "7")) {
          return;
       }
       if (p0 && this.j.q().isEmpty()) {
          this.f();
          this.j();
          this.f.f(true, 0);
          this.f.getTitleView().setPadding(c.b(this.j.getResources(), R.dimen.arg_RES_7f070a7f), 0, 0, 0);
          if (!this.c.U0(this.f)) {
             this.y(this.f);
             this.c.P0(this.f);
          }
          this.f.setTitleDetailText(null);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       this.c.m1(this.p);
       this.j();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, j.class, "12")) {
          return;
       }
       this.k.setVisibility(8);
       this.c.l1(this.k);
       return;
    }
    public void i(){
       j oj = j.class;
       if (PatchProxy.applyVoid(null, this, oj, "3")) {
          return;
       }
       this.x();
       if (this.p == null) {
          RecyclerView recyclerView = this.j.h0();
          View view = PatchProxy.applyOneRefs(recyclerView, this, oj, "4");
          if (view != PatchProxyResult.class) {
          }else {
             view = a.i(recyclerView, R.layout.arg_RES_7f0d126f);
          }
          this.p = view;
          this.w(view);
       }
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.k(this.z());
       uoa.i(this.B());
       uoa.n(this.A());
       KwaiEmptyStateView kwaiEmptySta = uoa.a(this.p);
       j tv = this.v;
       CharSequence uCharSequenc = (tv != null && tv.get() != null)? this.v.get(): this.B();
       if (uCharSequenc != null) {
          TextView emptyDesc = kwaiEmptySta.getEmptyDesc();
          emptyDesc.setMovementMethod(d2.getInstance());
          j tu = this.u;
          if (tu) {
             emptyDesc.setLineSpacing(tu, 0x3f800000);
          }
          emptyDesc.setText(uCharSequenc);
          emptyDesc.setTypeface(Typeface.defaultFromStyle(1));
       }
       TextView textView = kwaiEmptySta.findViewById(R.id.tv_empty_minor);
       this.q = textView;
       if (textView != null) {
          textView.setMovementMethod(d2.getInstance());
          oj = this.w;
          if (oj != null) {
             tv = this.q;
             tv.setTextColor(j.d(tv, oj.get().intValue()));
          }
       }
       if (!this.c.U0(this.p)) {
          this.y(this.p);
          this.c.P0(this.p);
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, j.class, "6")) {
          return;
       }
       j tm = this.m;
       if (tm != null && this.c.U0(tm)) {
          this.c.m1(this.m);
       }
       return;
    }
    public void k(boolean p0,Throwable p1){
       int i;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oj, "13")) {
          return;
       }
       v0 = p1 instanceof KwaiException;
       if (oj && p1.mErrorCode == 13) {
          return;
       }
       this.f();
       KwaiException kwaiExceptio = null;
       if (oj) {
          kwaiExceptio = p1.mErrorMessage;
       }
       if (p0 && !this.c.W0().getItemCount()) {
          p0 = p1 instanceof AccountCanceledException;
          if (p0) {
             i = 0x7f0d1273;
          }else if(p1 instanceof BanException || !TextUtils.x(kwaiExceptio)){
             i = 0x7f0d1275;
          }else {
             i = 0x7f0d1277;
          }
          j tm = this.m;
          if (tm == null || this.x != i) {
             if (tm != null) {
                this.y(tm);
                if (this.c.U0(this.m)) {
                   this.c.m1(this.m);
                }
             }
             View view = a.i(this.a, i);
             this.m = view;
             this.n = view.findViewById(0x7f0a0a95);
             this.o = this.m.findViewById(0x7f0a35e0);
             this.r = this.m.findViewById(0x7f0a1561);
             this.x = i;
          }
          i = 1;
          View[] viewArray = new View[i];
          int i1 = 0;
          viewArray[i1] = this.r;
          n.Z(8, viewArray);
          if (p1 instanceof BanException) {
             this.n.setText(p1.mPromptText);
             BanException mBanText = p1.mBanText;
             BanException mBanDisallow = p1.mBanDisallowAppeal;
             j to = this.o;
             if (TextUtils.x(mBanText)) {
                i1 = 8;
             }
             to.setVisibility(i1);
             this.o.setText(TextUtils.k(mBanText));
             this.o.setEnabled((mBanDisallow ^ 0x01));
             this.o.setOnClickListener(new h(this, mBanText, mBanDisallow, p1.mVerifiedUrl));
          }else if(!TextUtils.x(kwaiExceptio)){
             this.n.setText(kwaiExceptio);
             this.o.setVisibility(i1);
             this.o.setOnClickListener(this.s);
          }else if(p0){
             this.o.setVisibility(i1);
             this.n.setVisibility(i1);
             this.o.setText(p1.mCanceledBtnText);
             this.o.setOnClickListener(i.b);
          }else {
             KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
             uoa.p(this.s);
             uoa.q(i);
             this.w(uoa.a(this.m));
          }
          if (!this.c.U0(this.m)) {
             this.y(this.m);
             this.c.P0(this.m);
          }
       }else {
          ExceptionHandler.handleException(a.a().a(), p1);
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, j.class, "11")) {
          return;
       }
       this.l.setMovementMethod(LinkMovementMethod.getInstance());
       this.l.setText(this.C());
       j tl = this.l;
       tl.setTextColor(j.d(tl, R.color.arg_RES_7f0601b9));
       ViewGroup$LayoutParams layoutParams = this.l.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$LayoutParams layoutParams1 = layoutParams;
          layoutParams1.setMargins(0, 0, 0, 0);
          if (this instanceof CollectionMusicFragment$c && j.c(this.j)) {
             layoutParams1.bottomMargin = a1.d(0x7f070bf1);
          }
       }
       this.l.setLayoutParams(layoutParams);
       this.l.setPadding(a1.e(3.00f), a1.e(16.00f), a1.e(3.00f), this.t);
       if (!this.c.T0(this.k)) {
          this.y(this.k);
          this.k.setVisibility(0);
          this.c.L0(this.k);
       }
       return;
    }
    public void u(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       LoadingView loadingView = new LoadingView(p0, 0x7f110210);
       this.f = loadingView;
       loadingView.setBackgroundColor(p0.getResources().getColor(0x106000d));
       this.f.setPadding(0, c.b(p0.getResources(), R.dimen.arg_RES_7f0702b8), 0, 0);
       this.f.setLayoutParams(new RecyclerView$LayoutParams(-1, a1.e(245.00f)));
       TextView titleView = this.f.getTitleView();
       titleView.setCompoundDrawablePadding(a1.e(12.00f));
       titleView.setTextSize(14.00f);
       return;
    }
    public void w(View p0){
       int i;
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oj, "15")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       layoutParams.width = -1;
       layoutParams.height = -2;
       p0.setLayoutParams(layoutParams);
       Object obj = PatchProxy.apply(null, this, oj, "10");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          oj = null;
          View view = this.j.getActivity().findViewById(R.id.app_bar_layout);
          this.y = view;
          if (view != null && view instanceof AppBarLayout) {
             i = j0.a(view, j.c(this.j));
          }
          i = Math.max((i - n.c(a.b(), 40.00f)), n.c(a.b(), 250.00f));
       }
       p0.setMinimumHeight(i);
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, j.class, "8")) {
          return;
       }
       this.c.m1(this.f);
       return;
    }
    public final void y(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "14")) {
          return;
       }
       if (p0 != null && p0.getParent() instanceof ViewGroup) {
          p0.getParent().removeView(p0);
       }
       return;
    }
    public abstract int z();
}
