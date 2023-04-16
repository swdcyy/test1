package com.kuaishou.merchant.live.cart.onsale.audience.widget.RecyclerLinearLayout;
import android.widget.LinearLayout;
import android.content.Context;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.RecyclerLinearLayout$b;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.RecyclerLinearLayout$a;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$i;
import com.kuaishou.merchant.live.cart.MerchantCartLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerLinearLayout extends LinearLayout	// class@0019a7
{
    public RecyclerView$Adapter b;
    public final RecyclerLinearLayout$b c;

    public void RecyclerLinearLayout(Context p0){
       super(p0);
       this.c = new RecyclerLinearLayout$b(this, null);
    }
    public void RecyclerLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = new RecyclerLinearLayout$b(this, null);
    }
    public void RecyclerLinearLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = new RecyclerLinearLayout$b(this, null);
    }
    public final RecyclerView$ViewHolder a(int p0){
       RecyclerLinearLayout obj;
       if (PatchProxy.isSupport(RecyclerLinearLayout.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, RecyclerLinearLayout.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.b;
       if (obj == null) {
          return null;
       }else {
          RecyclerView$ViewHolder viewHolder = obj.b0(this, obj.f0(p0));
          viewHolder.itemView.setTag(R.id.live_merchant_recycler_linear_layout_tag, viewHolder);
          return viewHolder;
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, RecyclerLinearLayout.class, "4")) {
          return;
       }
       RecyclerLinearLayout tb = this.b;
       if (tb != null && tb.i0()) {
          try{
             this.b.I0(this.c);
          }catch(java.lang.Exception e0){
             a.l(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "RecyclerLinearLayout", "unregisterAdapterDataObserver", e0);
          }
       }
    }
    public void c(int p0,int p1){
       if (PatchProxy.isSupport(RecyclerLinearLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RecyclerLinearLayout.class, "7")) {
          return;
       }
       if (this.b == null) {
          return;
       }
       int i = p0;
       int i1 = p0 + p1;
       while (i < i1) {
          View childAt = this.getChildAt(i);
          Object obj = null;
          Object obj1 = PatchProxy.applyOneRefs(childAt, obj, RecyclerLinearLayout.class, "10");
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else if(childAt == null){
             obj = childAt.getTag(0x7f0a217e);
          }
          this.b.Z(obj, i);
          i = i + 1;
       }
       return;
    }
    public RecyclerView$Adapter getAdapter(){
       return this.b;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RecyclerLinearLayout.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       this.b();
       RecyclerLinearLayout tb = this.b;
       if (tb != null) {
          tb.z0(null);
       }
       return;
    }
    public void setAdapter(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerLinearLayout.class, "1")) {
          return;
       }
       RecyclerLinearLayout tb = this.b;
       if (tb != p0 && tb != null) {
          this.b();
       }
       this.b = p0;
       if (!PatchProxy.applyVoid(null, this, RecyclerLinearLayout.class, "3")) {
          RecyclerLinearLayout tb1 = this.b;
          if (tb1 != null) {
             try{
                tb1.F0(this.c);
             }catch(java.lang.Exception e4){
                a.l(MerchantCartLogBiz.LIVE_AUDIENCE_ON_SALE, "RecyclerLinearLayout", "registerAdapterDataObserver", e4);
             }
          }
       }
    }
}
