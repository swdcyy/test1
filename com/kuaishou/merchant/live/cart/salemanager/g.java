package com.kuaishou.merchant.live.cart.salemanager.g;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.merchant.live.cart.salemanager.LiveAnchorShopFragment$b;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.merchant.live.cart.salemanager.g$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.library.widget.specific.misc.LoadingView;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import g9c.d;
import java.lang.Throwable;
import com.kuaishou.merchant.live.basic.model.ShopPunishException;
import com.kuaishou.merchant.live.cart.salemanager.widget.ErrorView;
import com.kuaishou.merchant.live.basic.model.punish.PunishInfo;
import o54.q;
import android.view.View$OnClickListener;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import xm4.a;
import android.widget.TextView;
import java.lang.CharSequence;

public class g extends f	// class@0019dd
{
    public ErrorView l;
    public LoadingView m;
    public View n;
    public LiveAnchorShopFragment$b o;

    public void g(RecyclerFragment p0,LiveAnchorShopFragment$b p1){
       super(p0);
       this.o = p1;
       this.g.h0().addOnScrollListener(new g$a(this));
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.h(R.string.arg_RES_7f102ae3);
       obj.k(R.drawable.arg_RES_7f0805e9);
       return obj;
    }
    public void d(boolean p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, og, "3")) {
          return;
       }
       this.a.s();
       if (p0) {
          if (!this.s()) {
             this.g.h0().setVisibility(8);
          }
          f ta = this.a;
          og = PatchProxy.apply(null, this, og, "1");
          if (og != PatchProxyResult.class) {
          }else if(this.m == null){
             LoadingView loadingView = new LoadingView(this.g.getContext());
             this.m = loadingView;
             loadingView.f(true, R.string.loading);
          }
          og = this.m;
          ta.K(og);
          return;
       }else {
          super.d(p0);
          return;
       }
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, g.class, "7")) {
          return;
       }
       if (this.g.ia().T0(this.J0())) {
          this.g.ia().l1(this.J0());
       }else if(this.g.ia().T0(this.v())){
          this.g.ia().l1(this.v());
       }
       return;
    }
    public void k(boolean p0,Throwable p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, og, "8")) {
          return;
       }
       if (p0 && p1 instanceof ShopPunishException) {
          ShopPunishException mPunishInfo = p1.mPunishInfo;
          if (!PatchProxy.applyVoidOneRefs(mPunishInfo, this, og, "9")) {
             this.f();
             this.x();
             if (this.l == null) {
                this.l = new ErrorView(this.g.getContext());
             }
             this.l.setImage(R.drawable.arg_RES_7f080eb5);
             this.l.setActionName(R.string.arg_RES_7f105075);
             this.l.setDescription(mPunishInfo.mDescription);
             this.l.setActionOnClickListener(new q(this, mPunishInfo));
             this.a.K(this.l);
          }
          return;
       }else {
          super.k(p0, p1);
          return;
       }
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       if (q.f(this.o.b)) {
          RecyclerView$LayoutParams layoutParams = new RecyclerView$LayoutParams(-2, -2);
          layoutParams.topMargin = a1.d(0x7f070254);
          layoutParams.bottomMargin = a1.d(0x7f070254);
          this.g.ia().o1(false);
          this.g.ia().M0(this.J0(), layoutParams);
          return;
       }else {
          this.v().setVisibility(8);
          this.g.ia().L0(this.v());
          return;
       }
    }
    public View v(){
       View obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.n == null) {
          obj = a.e(this.a, R.layout.arg_RES_7f0d0ef2);
          this.n = obj;
          Object[] objArray = new Object[]{a1.p(0x7f100f22)};
          obj.findViewById(R.id.no_more_tv).setText(String.format("- %s -", objArray));
       }
       return this.n;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       super.x();
       this.g.h0().setVisibility(0);
       return;
    }
}
