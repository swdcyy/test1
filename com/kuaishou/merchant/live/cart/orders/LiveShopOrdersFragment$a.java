package com.kuaishou.merchant.live.cart.orders.LiveShopOrdersFragment$a;
import gka.h;
import com.kuaishou.merchant.live.cart.orders.LiveShopOrdersFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.widget.LiveEmptyView;
import android.view.View$OnClickListener;
import java.lang.Throwable;
import java.lang.Boolean;
import n54.a;

public class LiveShopOrdersFragment$a extends h	// class@0019c8
{
    public final LiveShopOrdersFragment a;

    public void LiveShopOrdersFragment$a(LiveShopOrdersFragment p0){
       this.a = p0;
       super();
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveShopOrdersFragment$a.class, "2")) {
          return;
       }
       this.a.H.setVisibility(8);
       return;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveShopOrdersFragment$a.class, "1")) {
          return;
       }
       this.a.H.setEmptyText(R.string.arg_RES_7f10284c);
       this.a.H.setEmptyImage(R.drawable.arg_RES_7f080ebf);
       this.a.H.setOnClickListener(objArray);
       this.a.H.setVisibility(0);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, LiveShopOrdersFragment$a.class, "4")) {
          return;
       }
       this.a.H.setVisibility(8);
       return;
    }
    public void k(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(LiveShopOrdersFragment$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LiveShopOrdersFragment$a.class, "3")) {
          return;
       }
       this.a.H.setEmptyText(R.string.arg_RES_7f102236);
       this.a.H.setEmptyImage(R.drawable.arg_RES_7f080d87);
       this.a.H.setVisibility(0);
       this.a.H.setOnClickListener(new a(this));
       return;
    }
}
