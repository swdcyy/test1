package com.kuaishou.live.liteend.baseinfo.c;
import com.kuaishou.live.viewcontroller.ViewController;
import or5.d;
import id3.h;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;
import java.lang.Runnable;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.kuaishou.live.liteend.baseinfo.g;
import com.kuaishou.live.liteend.baseinfo.b;
import java.lang.Class;
import ok.x;
import va1.g0;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.content.Context;
import android.view.View;
import i2b.a;
import com.kuaishou.live.liteend.baseinfo.d;
import androidx.lifecycle.ViewModel;
import ae3.d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import ae3.e;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import ae3.c;
import android.view.View$OnClickListener;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import zc3.h;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import xc3.e;
import z1.k;

public class c extends ViewController	// class@000bbe
{
    public final ViewModelProvider j;
    public final d k;
    public final h l;
    public final LiveLiteRecommendSideBarService m;
    public final long n;
    public final Runnable o;

    public void c(d p0,h p1,LiveLiteRecommendSideBarService p2,Runnable p3){
       super();
       this.j = new ViewModelProvider(this.getViewModelStore(), g0.a(g.class, new b(this)));
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.o = p3;
       this.n = (long)a.t().u("SOURCE_LIVE").a("liteLiveEndCountDownSeconds", 6);
    }
    public void F2(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, c.class, str)) {
          return;
       }
       b.Z(LiveLiteLogTag.LIVE_LITE_END, "controller-onCreate");
       View view = a.a(this.D2(), R.layout.arg_RES_7f0d0c5a);
       this.R2(view);
       d uod = new d(view);
       g og = this.j.get(g.class);
       if (!PatchProxy.applyVoidTwoRefs(this, og, uod, d.class, str)) {
          og.a.observe(this, new d(uod));
          og.b.observe(this, new e(uod));
          uod.a.setOnClickListener(new c(og));
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.m.G2(k0.a(this.k.j0(), h.a).orNull());
       b.Z(LiveLiteLogTag.LIVE_LITE_END, "controller-onDestroy");
       return;
    }
    public void L2(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       if (this.k.j0() != null) {
          this.m.F5(new e(this.k.j0(), null));
       }
       return;
    }
}
