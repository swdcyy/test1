package com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper;
import e8a.e1;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper$lifecycleObserver$1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import vy6.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Runnable;
import ekd.k1;

public final class OppoPreventBurnInHelper	// class@001925
{
    public boolean a;
    public boolean b;
    public final Runnable c;
    public final LifecycleObserver d;
    public final a e;
    public final e1 f;
    public final SlidePageConfig g;
    public final BaseFragment h;
    public final SlidePlayViewModel i;

    public void OppoPreventBurnInHelper(e1 p0,SlidePageConfig p1,BaseFragment p2,SlidePlayViewModel p3){
       a.p(p0, "listener");
       a.p(p1, "pageConfig");
       a.p(p2, "mFragment");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.a = true;
       this.c = new OppoPreventBurnInHelper$b(this);
       this.d = new OppoPreventBurnInHelper$lifecycleObserver$1(this);
       this.e = new OppoPreventBurnInHelper$a(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInHelper.class, "1")) {
          return;
       }
       OppoPreventBurnInHelper ti = this.i;
       if (ti != null) {
          ti.P(this.h, this.e);
       }
       this.h.getLifecycle().addObserver(this.d);
       return;
    }
    public final boolean b(){
       return this.a;
    }
    public final SlidePageConfig c(){
       return this.g;
    }
    public final Runnable d(){
       return this.c;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInHelper.class, "2")) {
          return;
       }
       OppoPreventBurnInHelper ti = this.i;
       if (ti != null) {
          ti.D(this.h, this.e);
       }
       k1.m(this.c);
       this.h.getLifecycle().removeObserver(this.d);
       this.b = false;
       return;
    }
    public final void f(boolean p0){
       this.b = p0;
    }
}
