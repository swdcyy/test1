package com.yxcorp.gifshow.fragment.f;
import y8c.t;
import com.kwai.library.widget.refresh.RefreshLayout;
import g9c.d;
import qvb.i;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import y8c.g;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import hka.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mkc.b;
import i2b.a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.lang.Throwable;
import java.lang.CharSequence;
import gka.b0;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import com.yxcorp.retrofit.model.KwaiException;
import e17.i;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.RuntimeException;
import com.yxcorp.utility.Log;
import o56.c;
import o56.a;
import android.app.Application;
import g9c.a;
import java.lang.Float;

public class f implements t	// class@001277
{
    public RefreshLayout a;
    public final boolean b;
    public i c;
    public float d;
    public LinearLayout e;
    public KwaiLoadingView f;
    public RecyclerFragment g;
    public g h;
    public View i;
    public boolean j;
    public View k;

    public void f(RefreshLayout p0,d p1,i p2,boolean p3){
       super(p0, p1, p2, p3, 0x7f110210);
    }
    public void f(RefreshLayout p0,d p1,i p2,boolean p3,int p4){
       super();
       this.d = 0;
       this.j = false;
       this.a = p0;
       this.b = p3;
       this.c = p2;
       this.h = p1.W0();
       KwaiLoadingView kwaiLoadingV = new KwaiLoadingView(this.a.getContext(), p4);
       kwaiLoadingV.setVisibility(4);
       this.f = kwaiLoadingV;
       LinearLayout linearLayout = new LinearLayout(this.a.getContext());
       this.e = linearLayout;
       linearLayout.addView(this.f, -1, -2);
       p1.L0(this.e);
    }
    public void f(RecyclerFragment p0){
       super(p0.Ac(), p0.ia(), p0.q(), p0.S1(), 0x7f110210);
       this.g = p0;
    }
    public View J0(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i == null) {
          this.i = a.i(this.a, b.i.a);
       }
       this.a().a(this.i);
       return this.i;
    }
    public KwaiEmptyStateView$a a(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KwaiEmptyStateView.e();
    }
    public KwaiEmptyStateView b(Throwable p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e(p0, p1).a(this.n());
    }
    public KwaiEmptyStateView$a c(String p0){
       KwaiEmptyStateView$a obj = PatchProxy.applyOneRefs(p0, this, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KwaiEmptyStateView.e();
       obj.i(p0);
       obj.p(new b0(this));
       return obj;
    }
    public void d(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "6")) {
          return;
       }
       this.a.s();
       if (p0) {
          if (this.b == null && this.s()) {
             f ta = this.a;
             ta.K(a.i(ta, this.r().a));
          }
          return;
       }else {
          this.f.g(true, null);
          return;
       }
    }
    public KwaiEmptyStateView$a e(Throwable p0,String p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "12");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.c(p1);
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.a.s();
       return;
    }
    public void g(){
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.x();
       this.a.K(this.J0());
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, f.class, "14")) {
          return;
       }
       this.k = null;
       this.a.s();
       return;
    }
    public void k(boolean p0,Throwable p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uof, "10")) {
          return;
       }
       v0 = p1 instanceof KwaiException;
       if (uof && p1.mErrorCode == 13) {
          return;
       }
       this.f();
       this.x();
       KwaiException kwaiExceptio = null;
       if (uof) {
          kwaiExceptio = p1.mErrorMessage;
       }
       if (this.t()) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       }
       if (p0 && this.c.isEmpty()) {
          KwaiEmptyStateView kwaiEmptySta = this.b(p1, kwaiExceptio);
          this.k = kwaiEmptySta;
          kwaiEmptySta.setTranslationY(this.d);
          this.e(p1, kwaiExceptio).a(kwaiEmptySta);
          this.a.K(kwaiEmptySta);
          ExceptionHandler.handleUserNotLoginFirstTimeAlert(p1, kwaiEmptySta);
          if (p1 instanceof RuntimeException && !p1.getCause() instanceof KwaiException) {
             Log.e("TipsHelperShowError", "RuntimeException", p1);
          }
          return;
       }else {
          ExceptionHandler.handleException(a.a().a(), p1);
          return;
       }
    }
    public View n(){
       Object obj = PatchProxy.apply(null, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.i(this.a, b.g.a);
    }
    public void p(){
    }
    public b r(){
       return b.d;
    }
    public boolean s(){
       f obj = PatchProxy.apply(null, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       if (obj != null) {
          return obj.g7().R0();
       }
       obj = this.h;
       if (obj != null) {
          return obj.R0();
       }
       return false;
    }
    public boolean t(){
       return false;
    }
    public void u(float p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uof, "1")) {
          return;
       }
       this.d = p0;
       uof = this.k;
       if (uof != null) {
          uof.setTranslationY(p0);
       }
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       this.a.s();
       this.f.setVisibility(4);
       return;
    }
}
