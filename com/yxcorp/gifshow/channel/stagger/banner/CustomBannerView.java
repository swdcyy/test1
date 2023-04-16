package com.yxcorp.gifshow.channel.stagger.banner.CustomBannerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Integer;
import android.view.View;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.channel.stagger.banner.CustomBannerView$a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import ij9.b;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;
import ij9.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.z;
import java.util.Objects;
import g9c.a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.channel.stagger.banner.CustomLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import ij9.c;

public class CustomBannerView extends RecyclerView	// class@001061
{
    public ScheduledExecutorService b;
    public ScheduledFuture c;
    public boolean d;
    public int e;
    public g f;
    public LinearLayoutManager g;
    public List h;
    public int i;
    public CustomBannerView$a j;

    public void CustomBannerView(Context p0){
       super(p0);
       this.d = false;
       this.x();
    }
    public void CustomBannerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = false;
       this.x();
    }
    public void CustomBannerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = false;
       this.x();
    }
    public int getCurrentIndex(){
       return this.i;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, CustomBannerView.class, "10")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.b == null || (this.d != null && !PatchProxy.applyVoid(null, this, CustomBannerView.class, "7"))) {
          this.scrollToPosition(this.g.i0());
       }
    label_002b :
       this.z();
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(CustomBannerView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, CustomBannerView.class, "9")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       if (this.j != null) {
          float f = ((float)this.computeHorizontalScrollOffset() * 0x3f800000) / (float)(this.computeHorizontalScrollRange() - this.computeHorizontalScrollExtent());
          CustomBannerView uCustomBanne = null;
          if (!q.f(this.h)) {
             uCustomBanne = ((this.g.i0() + this.g.c()) / 2) % this.h.size();
          }
          this.j.b(f, uCustomBanne);
       }
       return;
    }
    public void onScrollStateChanged(int p0){
       CustomBannerView uCustomBanne;
       if (PatchProxy.isSupport(CustomBannerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CustomBannerView.class, "11")) {
          return;
       }
       super.onScrollStateChanged(p0);
       if (!p0) {
          uCustomBanne = null;
          if (!q.f(this.h)) {
             uCustomBanne = ((this.g.i0() + this.g.c()) / 2) % this.h.size();
          }
          if (uCustomBanne != this.i) {
             this.i = uCustomBanne;
             CustomBannerView tj = this.j;
             if (tj != null) {
                tj.a(uCustomBanne);
             }
          }
          this.z();
       }else {
          this.y();
       }
       uCustomBanne = this.j;
       if (uCustomBanne != null) {
          uCustomBanne.onScrollStateChanged(p0);
       }
       return;
    }
    public void setAutoScroll(int p0){
       if (PatchProxy.isSupport(CustomBannerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CustomBannerView.class, "4")) {
          return;
       }
       CustomBannerView th = this.h;
       if (th != null && th.size() >= 2) {
          if (this.b == null) {
             this.b = Executors.newSingleThreadScheduledExecutor();
          }
          this.e = p0;
          long l = (long)p0;
          this.c = this.b.scheduleAtFixedRate(new b(this), l, l, TimeUnit.MILLISECONDS);
       }
       return;
    }
    public void setBannerAdapter(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomBannerView.class, "2")) {
          return;
       }
       this.f = p0;
       this.setAdapter(p0);
       new t().b(this);
       return;
    }
    public void setList(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CustomBannerView.class, "3")) {
          return;
       }
       CustomBannerView tf = this.f;
       Objects.requireNonNull(tf, "Adapter shouldn\'t be null");
       this.h = p0;
       tf.W0(p0);
       this.f.k0();
       this.scrollToPosition((p0.size() * 3));
       return;
    }
    public void setOnBannerStateListener(CustomBannerView$a p0){
       this.j = p0;
    }
    public final void x(){
       if (PatchProxy.applyVoid(null, this, CustomBannerView.class, "1")) {
          return;
       }
       this.setOverScrollMode(2);
       CustomLinearLayoutManager uCustomLinea = new CustomLinearLayoutManager(this.getContext(), 0, 0);
       this.g = uCustomLinea;
       this.setLayoutManager(uCustomLinea);
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, CustomBannerView.class, "5")) {
          return;
       }
       CustomBannerView tc = this.c;
       if (tc != null) {
          tc.cancel(false);
          this.c = null;
       }
       this.d = true;
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, CustomBannerView.class, "6")) {
          return;
       }
       CustomBannerView tb = this.b;
       if (tb != null && this.d != null) {
          CustomBannerView te = this.e;
          this.c = tb.scheduleAtFixedRate(new c(this), (long)te, (long)te, TimeUnit.MILLISECONDS);
       }
       this.d = false;
       return;
    }
}
