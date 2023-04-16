package com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import lnc.a1;
import com.yxcorp.utility.n;
import com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView$b;
import com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView$c;
import com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView$a;
import androidx.recyclerview.widget.RecyclerView$r;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$i;
import android.graphics.Canvas;
import e84.a;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$a;
import java.util.Iterator;
import android.view.View;
import java.lang.Math;

public final class LiveMerchantScaleRecyclerView extends RecyclerView	// class@001af9
{
    public final float b;
    public final float c;
    public final int d;
    public final int e;
    public int f;
    public Runnable g;
    public LiveMerchantScaleRecyclerView$c h;
    public LiveMerchantScaleRecyclerView$a i;
    public a j;
    public boolean k;
    public HashMap l;

    public void LiveMerchantScaleRecyclerView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMerchantScaleRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMerchantScaleRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0x3f4ccccd;
       this.c = 0x3f800000;
       this.d = a1.d(0x7f070295);
       this.e = n.z(p0) / 2;
       this.g = new LiveMerchantScaleRecyclerView$b(this);
       this.h = new LiveMerchantScaleRecyclerView$c(this);
       this.i = new LiveMerchantScaleRecyclerView$a(this);
       this.addOnScrollListener(this.h);
    }
    public void LiveMerchantScaleRecyclerView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final int getCurrentScrollX(){
       return this.f;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantScaleRecyclerView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeCallbacks(this.g);
       RecyclerView$Adapter adapter = this.getAdapter();
       if (adapter != null) {
          adapter.I0(this.i);
       }
       this.setAdapter(null);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantScaleRecyclerView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       if (this.getChildCount() > 0 && this.k == null) {
          this.k = true;
          LiveMerchantScaleRecyclerView tj = this.j;
          if (tj != null) {
             tj.a();
          }
       }
       return;
    }
    public void setAdapter(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantScaleRecyclerView.class, "2")) {
          return;
       }
       super.setAdapter(p0);
       if (p0 != null) {
          p0.F0(this.i);
       }
       return;
    }
    public final void setOnDrawCallback(a p0){
       this.j = p0;
    }
    public final void x(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantScaleRecyclerView.class, "1")) {
          return;
       }
       Iterator iterator = ViewGroupKt.b(p0).iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          int i = view.getLeft() + view.getRight();
          i = i / 2;
          int i1 = this.e - i;
          i = Math.abs(i1);
          LiveMerchantScaleRecyclerView tc = this.c;
          float f = tc - this.b;
          float f1 = (float)i * f;
          int i2 = this.d + view.getWidth();
          f1 = f1 / (float)i2;
          float f2 = tc - f1;
          LiveMerchantScaleRecyclerView tb = this.b;
          if (f2 - tb <= 0) {
             f2 = tb;
          }
          tb = this.c;
          if (f2 - tb >= 0) {
             f2 = tb;
          }
          view.setScaleX(f2);
          view.setScaleY(f2);
       }
       return;
    }
}
