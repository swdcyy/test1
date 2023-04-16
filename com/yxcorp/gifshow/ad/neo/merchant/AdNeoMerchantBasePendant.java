package com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mAdNeoShowToastLeastAmount$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mUpdateCountDown$1;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mPendantVisibility$1;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mShowBubble$1;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mStartSuccessAnimation$1;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$mLifecycleObserver$1;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import wkd.b;
import ql9.f;
import msd.p;
import msd.l;
import ekd.k1;
import android.widget.FrameLayout;
import com.yxcorp.utility.n;
import android.content.Context;
import android.view.ViewGroup;
import i2b.a;
import java.util.Objects;
import com.yxcorp.gifshow.ad.neo.widget.AdRewardPendant;
import com.yxcorp.gifshow.ad.neo.merchant.AdNeoMerchantBasePendant$a;
import android.view.View$OnClickListener;

public abstract class AdNeoMerchantBasePendant	// class@00179d
{
    public AdRewardPendant a;
    public final p b;
    public final p c;
    public final l d;
    public final l e;
    public final p f;
    public final LifecycleObserver g;
    public boolean h;
    public final Activity i;

    public void AdNeoMerchantBasePendant(Activity p0){
       a.p(p0, "activity");
       super();
       this.i = p0;
       this.b = s.c(AdNeoMerchantBasePendant$mAdNeoShowToastLeastAmount$2.INSTANCE);
       this.c = new AdNeoMerchantBasePendant$mUpdateCountDown$1(this);
       this.d = new AdNeoMerchantBasePendant$mPendantVisibility$1(this);
       this.e = new AdNeoMerchantBasePendant$mShowBubble$1(this);
       this.f = new AdNeoMerchantBasePendant$mStartSuccessAnimation$1(this);
       this.g = new AdNeoMerchantBasePendant$mLifecycleObserver$1(this);
    }
    public abstract void a(View p0);
    public final Activity b(){
       return this.i;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdNeoMerchantBasePendant.class, "4")) {
          return;
       }
       AdNeoMerchantBasePendant ti = this.i;
       if (ti instanceof GifshowActivity) {
          objArray = ti;
       }
       if (objArray != null) {
          Lifecycle lifecycle = objArray.getLifecycle();
          if (lifecycle != null) {
             lifecycle.addObserver(this.g);
          }
       }
       b.a(-618875779).h();
       b.a(-618875779).k(this.c, this.d, this.e, this.f);
       return;
    }
    public void d(long p0,boolean p1){
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, AdNeoMerchantBasePendant.class, "6")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.h = true;
       k1.n(this);
       AdNeoMerchantBasePendant ti = this.i;
       if (!ti instanceof GifshowActivity) {
          ti = null;
       }
       if (ti != null) {
          Lifecycle lifecycle = ti.getLifecycle();
          if (lifecycle != null) {
             lifecycle.removeObserver(this.g);
          }
       }
       b.a(-618875779).b(this.c, this.d, this.e, this.f);
       b.a(-618875779).f();
       ti = this.a;
       if (ti != null) {
          ti.setVisibility(8);
          n.Q(ti);
       }
       this.a = null;
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, AdNeoMerchantBasePendant.class, "5")) {
          return;
       }
       AdNeoMerchantBasePendant ta = this.a;
       if (ta != null) {
          ta.setVisibility(0);
       }
       return;
    }
    public final void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdNeoMerchantBasePendant.class, "7")) {
          return;
       }
       if (this.a == null) {
          View view = a.d(this.i, R.layout.arg_RES_7f0d0071, objArray, false);
          Objects.requireNonNull(view, "null cannot be cast to non-null type com.yxcorp.gifshow.ad.neo.widget.AdRewardPendant");
          this.a = view;
          a.m(view);
          this.a(view);
          AdNeoMerchantBasePendant ta = this.a;
          if (ta != null) {
             ta.setVisibility(8);
          }
          ta = this.a;
          if (ta != null) {
             ta.setOnClickListener(new AdNeoMerchantBasePendant$a(this));
          }
       }
       return;
    }
}
