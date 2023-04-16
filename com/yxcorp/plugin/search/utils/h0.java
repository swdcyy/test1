package com.yxcorp.plugin.search.utils.h0;
import com.yxcorp.plugin.search.utils.i0;
import nfd.t0;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.fragment.f;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewTreeObserver;
import com.yxcorp.plugin.search.utils.h0$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import i2b.a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nfd.j3;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import g9c.d;
import java.lang.Throwable;
import com.kwai.framework.network.exception.AntispamException;
import e17.i;
import java.lang.RuntimeException;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import mkc.b;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import android.widget.TextView;
import zf6.j;

public class h0 extends i0	// class@00079e
{
    public LinearLayout A;
    public KwaiEmptyStateView$a B;
    public View t;
    public View u;
    public View v;
    public boolean w;
    public int x;
    public int y;
    public String z;
    public static final float C;

    static {
       h0.C = (float)t0.Y;
    }
    public void h0(RecyclerFragment p0){
       super(p0);
       this.x = 0x7f0805fc;
       this.y = 0x7f104489;
       this.t = this.g.getView();
    }
    public void h0(RecyclerFragment p0,boolean p1){
       super(p0);
       this.x = 0x7f0805fc;
       this.y = 0x7f104489;
       this.w = p1;
       this.t = this.g.getView();
    }
    public void C(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "12")) {
          return;
       }
       f tg = this.g;
       if (tg != null && tg.getView() != null) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          layoutParams.height = -2;
          p0.setLayoutParams(layoutParams);
          int[] ointArray = new int[2];
          p0.getViewTreeObserver().addOnPreDrawListener(new h0$a(this, p0, ointArray, n.u(this.t.getContext())));
       }
       return;
    }
    public View J0(){
       Object[] objArray = null;
       KwaiEmptyStateView$a obj = PatchProxy.apply(objArray, this, h0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i == null) {
          this.i = a.i(this.a, 0x7f0d13a1);
          obj = KwaiEmptyStateView.e();
          if (this.w != null) {
             obj.b();
          }
          obj.k(this.x);
          obj.h(this.y);
          obj.a(this.i);
       }
       if (this.i instanceof KwaiEmptyStateView) {
          String str = a1.p(this.y);
          if (!TextUtils.x(this.z)) {
             str = this.z;
             this.z = objArray;
          }
          this.i.h(str);
       }
       this.C(this.i);
       return this.i;
    }
    public KwaiEmptyStateView$a a(){
       Object obj = PatchProxy.apply(null, this, h0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B == null) {
          this.B = KwaiEmptyStateView.e();
       }
       return this.B;
    }
    public KwaiEmptyStateView$a c(String p0){
       KwaiEmptyStateView$a obj = PatchProxy.applyOneRefs(p0, this, h0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KwaiEmptyStateView.e();
       obj.i(p0);
       obj.p(new j3(this));
       return obj;
    }
    public void d(boolean p0){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oh0, "2")) {
          return;
       }
       this.j();
       this.f();
       if (!p0) {
          this.f.g(true, null);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, h0.class, "5")) {
          return;
       }
       this.g.getView().removeView(this.J0());
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, h0.class, "3")) {
          return;
       }
       if (this.u != null) {
          this.g.ia().l1(this.u);
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, h0.class, "4")) {
          return;
       }
       this.x();
       this.g.getView().removeView(this.J0());
       this.g.getView().addView(this.J0());
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, h0.class, "9")) {
          return;
       }
       this.g.getView().removeView(this.v);
       return;
    }
    public void k(boolean p0,Throwable p1){
       h0 oh0 = h0.class;
       if (PatchProxy.isSupport(oh0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oh0, "8")) {
          return;
       }
       if (!p0 && p1 instanceof AntispamException) {
          i.a(R.style.arg_RES_7f110668, 0x7f104fc9);
       }else if(p1 instanceof RuntimeException && !p1.getCause() instanceof KwaiException){
          ExceptionHandler.handleCaughtException(p1);
       }
       this.f();
       this.x();
       String str = null;
       if (p1 instanceof KwaiException) {
          str = p1.mErrorMessage;
       }
       if (p0) {
          KwaiEmptyStateView kwaiEmptySta = this.b(p1, str);
          this.v = kwaiEmptySta;
          this.C(kwaiEmptySta);
          if (this.w != null) {
             this.e(p1, str).b();
          }
          this.e(p1, str).a(kwaiEmptySta);
          this.g.getView().removeView(this.v);
          this.g.getView().addView(this.v);
       }
       return;
    }
    public View n(){
       View obj = PatchProxy.apply(null, this, h0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.i(this.a, b.g.a);
       this.v = obj;
       return obj;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, h0.class, "1")) {
          return;
       }
       if (this.u == null) {
          View view = a.i(this.g.h0(), R.layout.arg_RES_7f0d13d6);
          this.u = view;
          LinearLayout linearLayout = view.findViewById(R.id.search_no_more_container);
          this.A = linearLayout;
          linearLayout.setPadding(0, t0.u, 0, t0.p0);
          f tg = this.g;
          if (tg instanceof SearchResultFragment && tg.Z != null) {
             int i = 0x7f062039;
             this.A.findViewById(R.id.left_line).setBackgroundResource(i);
             TextView textView = this.A.findViewById(R.id.footer_text_view);
             textView.setTextColor(j.d(textView, R.color.arg_RES_7f062041));
             this.A.findViewById(R.id.right_line).setBackgroundResource(i);
          }
       }
       this.g.ia().L0(this.u);
       return;
    }
}
