package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.c;
import rk0.b;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import java.lang.Throwable;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import yk4.h;
import android.view.View$OnClickListener;
import mkc.c;
import com.kuaishou.ksmvvm.command.KSCommand$Status;
import mkc.b;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.c$a;
import java.lang.Enum;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import gl4.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.utility.n;
import android.view.animation.TranslateAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import ekd.m1;

public abstract class c extends b	// class@000868
{
    public View s;
    public ViewStub t;
    public RecyclerView u;
    public View v;
    public boolean w;

    public void c(Fragment p0){
       super(p0);
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.J8();
       this.S8();
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       if (this.u != null && this.w != null) {
          this.w = false;
          this.v.clearAnimation();
          this.v.setVisibility(8);
          this.u.setVisibility(8);
       }
       return;
    }
    public void V8(Throwable p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "4")) {
          return;
       }
       a.l(MerchantTransactionLogBiz.ORDER, this.getTag(), "request order list info", p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "6")) {
          this.s.setVisibility(0);
          int i = 8;
          this.v.setVisibility(i);
          uoc = this.u;
          if (uoc != null) {
             uoc.setVisibility(i);
          }
          c.g(this.s, p0, new h(this));
       }
       return;
    }
    public void W8(KSCommand$Status p0){
       c tt;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "3")) {
          return;
       }
       boolean b = false;
       if (p0 != KSCommand$Status.FAILURE && !PatchProxy.applyVoid(null, this, uoc, "7")) {
          b[] uobArray = new b[true];
          uobArray[b] = b.g;
          c.d(this.s, uobArray);
          this.s.setVisibility(8);
       }
       int i = c$a.a[p0.ordinal()];
       if (i != 1) {
          if (i == 2 || i == 3) {
             this.S8();
          }
       }else if(PatchProxy.applyVoid(null, this, uoc, "5") || this.w != null){
          this.w = true;
          if (this.u == null) {
             tt = this.t;
             if (tt != null && tt.getParent() != null) {
                RecyclerView recyclerView = this.t.inflate();
                this.u = recyclerView;
                recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), true, b));
                this.u.setAdapter(new a());
             }else {
                this.u = this.m8().findViewById(0x7f0a2f2a);
             }
          }
          tt = this.u;
          if (tt != null) {
             tt.setVisibility(b);
             this.v.setVisibility(b);
             i = n.z(this.P8());
             TranslateAnimation translateAni = new TranslateAnimation((float)(- i), (float)i, 0, 0);
             translateAni.setDuration(800);
             translateAni.setRepeatCount(-1);
             translateAni.setInterpolator(new LinearInterpolator());
             this.v.startAnimation(translateAni);
          }
       }
       return;
    }
    public abstract void a();
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a2f2d);
       this.t = m1.f(p0, 0x7f0a2f2b);
       this.v = m1.f(p0, 0x7f0a2f2c);
       return;
    }
    public abstract String getTag();
}
