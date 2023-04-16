package com.yxcorp.plugin.search.utils.i0;
import nfd.f;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import com.yxcorp.utility.NetworkUtilsCached;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.search.result.fragment.SearchResultTabFragment;
import com.yxcorp.plugin.search.b;
import com.yxcorp.plugin.search.SearchPage;
import com.yxcorp.plugin.search.result.SearchKeywordContext;
import com.yxcorp.plugin.search.SearchSource;
import w7d.e;
import nfd.r3;
import nfd.t;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import e7d.a;
import qvb.i;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import i2b.a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.yxcorp.utility.TextUtils;
import nfd.l3;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import g9c.d;
import java.lang.Throwable;
import com.kwai.framework.network.exception.AntispamException;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.RuntimeException;
import sy5.a;
import com.yxcorp.utility.Log;
import ecd.b;
import com.google.gson.JsonObject;
import ecd.d;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import mkc.b;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout;
import com.kwai.library.widget.refresh.KwaiLoadingView;

public class i0 extends f implements f	// class@0007a0
{
    public View l;
    public KwaiEmptyStateView m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public String r;
    public LinearLayout s;

    public void i0(RecyclerFragment p0){
       super(p0);
       this.n = true;
       this.o = false;
       this.p = 0x7f0805fc;
       this.q = 0x7f104489;
    }
    public static void v(i0 p0,View p1){
       p0.y(p1);
    }
    private void y(View p0){
       if (!NetworkUtilsCached.k()) {
          i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f104dbe));
          return;
       }else {
          boolean b = false;
          if (this.g.getParentFragment() instanceof SearchResultTabFragment && this.o == null) {
             b uob = this.g.getParentFragment().f3();
             t.a(this.g, r3.x(uob.b, uob.r, "", uob.a(), b));
          }else {
             f tg = this.g;
             if (tg instanceof SearchResultFragment) {
                SearchPage cOMMODITY = SearchPage.COMMODITY;
                if (tg.kc() == cOMMODITY) {
                   tg = this.g;
                   SearchResultFragment b1 = tg.b1;
                   SearchKeywordContext searchKeywor = b1.f();
                   t.a(tg, r3.x(searchKeywor, b1.m(), "", cOMMODITY, b));
                }
             }
             this.g.q().a();
          }
          return;
       }
    }
    public void A(boolean p0){
       this.n = p0;
    }
    public void B(boolean p0){
       this.o = p0;
    }
    public View J0(){
       Object[] objArray = null;
       KwaiEmptyStateView$a obj = PatchProxy.apply(objArray, this, i0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.i == null) {
          this.i = a.i(this.a, 0x7f0d13a1);
          obj = KwaiEmptyStateView.e();
          obj.k(this.p);
          obj.h(this.q);
          obj.a(this.i);
       }
       if (this.i instanceof KwaiEmptyStateView) {
          String str = a1.p(this.q);
          if (!TextUtils.x(this.r)) {
             str = this.r;
             this.r = objArray;
          }
          this.i.h(str);
       }
       return this.i;
    }
    public KwaiEmptyStateView$a c(String p0){
       KwaiEmptyStateView$a obj = PatchProxy.applyOneRefs(p0, this, i0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KwaiEmptyStateView.e();
       obj.i(p0);
       obj.p(new l3(this));
       return obj;
    }
    public void d(boolean p0){
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi0, "3")) {
          return;
       }
       this.j();
       this.f();
       super.d(p0);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, i0.class, "2")) {
          return;
       }
       if (this.n == null) {
          return;
       }
       if (this.l != null) {
          this.g.ia().l1(this.l);
       }
       return;
    }
    public void k(boolean p0,Throwable p1){
       int i;
       a uoa1;
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oi0, "7")) {
          return;
       }
       if (!p0 && p1 instanceof AntispamException) {
          i.a(R.style.arg_RES_7f110668, 0x7f104fc9);
       }else {
          v0 = p1 instanceof KwaiException;
          if (oi0 && p1.mErrorCode == 13) {
             return;
          }else {
             this.f();
             this.x();
             String str = a1.p(R.string.arg_RES_7f104469);
             if (p0 && this.g.q().isEmpty()) {
                if (!NetworkUtilsCached.k()) {
                   str = a1.p(R.string.arg_RES_7f100d25);
                   i = 0;
                }else if(p1 instanceof RuntimeException){
                   uoa1 = a.k();
                   uoa1.e("stacktrace", Log.f(p1));
                   f tg = this.g;
                   if (tg instanceof b) {
                      d.b(tg, "search tips error", uoa1.j());
                   }else {
                      d.d("none", "search tips error", "", uoa1.j());
                   }
                   Log.e("TipsHelperShowError", "RuntimeException", p1);
                }else if(oi0){
                   str = p1.mErrorMessage;
                }
                uoa1 = 1;
                KwaiEmptyStateView$a uoa = this.c(str);
                if (this.m == null) {
                   this.n();
                }
                if (i) {
                   uoa.k(R.drawable.arg_RES_7f081f22);
                   uoa.j(2);
                }else {
                   uoa.k(R.drawable.arg_RES_7f0805f4);
                   uoa.j(1);
                }
                uoa.a(this.m);
                this.a.K(this.m);
                ExceptionHandler.handleUserNotLoginFirstTimeAlert(p1, this.m);
             }
          }
       }
       return;
    }
    public View n(){
       KwaiEmptyStateView obj = PatchProxy.apply(null, this, i0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.i(this.a, b.g.a);
       this.m = obj;
       return obj;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, i0.class, "1")) {
          return;
       }
       if (this.n == null) {
          return;
       }
       if (this.l == null) {
          View view = a.i(this.g.h0(), this.w());
          this.l = view;
          this.s = view.findViewById(0x7f0a37b7);
       }
       this.g.ia().L0(this.l);
       return;
    }
    public int w(){
       return 0x7f0d13d6;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, i0.class, "4")) {
          return;
       }
       super.x();
       this.f.setVisibility(8);
       return;
    }
    public void z(int p0){
       this.q = p0;
    }
}
