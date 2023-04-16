package com.yxcorp.gifshow.fragment.e;
import y8c.t;
import androidx.recyclerview.widget.RecyclerView;
import g9c.d;
import java.lang.Object;
import android.content.Context;
import android.view.ViewGroup;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import hka.l;
import y8c.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import mkc.b;
import android.view.View;
import mkc.c;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import o56.c;
import o56.a;
import android.app.Application;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.robust.PatchProxyResult;
import gka.a0;
import android.view.View$OnClickListener;
import java.lang.Integer;
import java.lang.CharSequence;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;

public class e implements t	// class@001276
{
    public final RecyclerView a;
    public final boolean b;
    public d c;
    public RecyclerFragment d;
    public LinearLayout e;
    public KwaiLoadingView f;
    public l g;
    public View h;

    public void e(RecyclerView p0,boolean p1,d p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.u(p0.getContext());
    }
    public void e(RecyclerFragment p0){
       super(p0.h0(), p0.S1(), p0.ia());
       this.d = p0;
    }
    public void e(q p0){
       l ol = p0;
       super(p0.h0(), ol.S1(), p0.ia());
       if (this.g instanceof q) {
          this.g = ol;
       }
       return;
    }
    public void d(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "7")) {
          return;
       }
       this.f();
       this.j();
       if (p0) {
          if (this.b == null) {
             c.h(this.a, b.d);
          }
          return;
       }else {
          this.f.setVisibility(0);
          return;
       }
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       b[] uobArray = new b[]{b.i};
       c.d(this.a, uobArray);
       return;
    }
    public void g(){
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       this.x();
       this.h = c.e(this.a, b.i, this.s());
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, e.class, "13")) {
          return;
       }
       b[] uobArray = new b[]{b.g};
       c.d(this.a, uobArray);
       return;
    }
    public void k(boolean p0,Throwable p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoe, "9")) {
          return;
       }
       v0 = p1 instanceof KwaiException;
       if (uoe && p1.mErrorCode == 13) {
          return;
       }
       this.f();
       KwaiException kwaiExceptio = null;
       if (uoe) {
          kwaiExceptio = p1.mErrorMessage;
       }
       if (p0 && !this.c.W0().getItemCount()) {
          View view = c.h(this.a, b.g);
          this.h = view;
          this.r(p1, view, kwaiExceptio);
          ExceptionHandler.handleUserNotLoginFirstTimeAlert(p1, view);
          return;
       }else {
          ExceptionHandler.handleException(a.a().a(), p1);
          return;
       }
    }
    public void p(){
    }
    public void r(Throwable p0,View p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e.class, "10")) {
          return;
       }
       this.t(p2).a(p1);
       return;
    }
    public KwaiEmptyStateView$a s(){
       Object obj = PatchProxy.apply(null, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiEmptyStateView.e();
    }
    public KwaiEmptyStateView$a t(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, e.class, "12");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.h(R.string.arg_RES_7f100158);
       uoa.p(new a0(this));
       return uoa;
    }
    public void u(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.v(p0, R.style.arg_RES_7f110210);
       return;
    }
    public void v(Context p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2")) {
          return;
       }
       KwaiLoadingView kwaiLoadingV = new KwaiLoadingView(this.a.getContext(), p1);
       this.f = kwaiLoadingV;
       kwaiLoadingV.g(true, null);
       this.f.setVisibility(4);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, -2);
       layoutParams.gravity = 17;
       LinearLayout linearLayout = new LinearLayout(p0);
       this.e = linearLayout;
       linearLayout.addView(this.f, layoutParams);
       this.c.L0(this.e);
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       b[] uobArray = new b[]{b.d};
       c.d(this.a, uobArray);
       this.f.setVisibility(8);
       return;
    }
}
