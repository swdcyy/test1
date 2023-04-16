package com.kuaishou.live.common.core.component.hotspot.ranklist.item.LiveHotSpotRankListItemViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import yn1.i;
import yn1.h;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.ranklist.item.LiveHotSpotRankListItemViewController$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.ranklist.item.LiveHotSpotRankListItemViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import zn1.k;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.ranklist.item.LiveHotSpotRankListItemViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import zn1.a;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import zn1.b;
import androidx.lifecycle.Observer;
import zn1.c;
import zn1.d;
import zn1.e;
import zn1.f;
import zn1.g;
import zn1.h;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.common.core.component.hotspot.ranklist.item.LiveHotSpotRankListItemDataBinding$bindViewModel$8;
import androidx.lifecycle.LifecycleObserver;
import zn1.i;
import android.view.View$OnClickListener;
import zn1.k$h$b;
import zn1.k$h;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class LiveHotSpotRankListItemViewController extends ViewController	// class@001442
{
    public final p j;
    public final LiveData k;
    public final i l;
    public final h m;
    public final l n;

    public void LiveHotSpotRankListItemViewController(LiveData p0,i p1,h p2,l p3){
       a.p(p0, "dataProvider");
       a.p(p1, "logger");
       a.p(p2, "delegate");
       a.p(p3, "checker");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.j = new ViewModelLazy(m0.d(k.class), new LiveHotSpotRankListItemViewController$$special$$inlined$viewModels$2(new LiveHotSpotRankListItemViewController$$special$$inlined$viewModels$1(this)), new LiveHotSpotRankListItemViewController$viewModel$2(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotRankListItemViewController.class, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c28);
       a uoa = new a(this.P2(), this);
       k ok = this.V2();
       if (!PatchProxy.applyVoidOneRefs(ok, uoa, a.class, "1")) {
          a.p(ok, "viewModel");
          ok.a.observe(uoa.i, new b(uoa));
          ok.b.observe(uoa.i, new c(uoa));
          ok.e.observe(uoa.i, new d(uoa));
          ok.f.observe(uoa.i, new e(uoa));
          ok.c.observe(uoa.i, new f(uoa));
          ok.d.observe(uoa.i, new g(uoa));
          ok.g.observe(uoa.i, new h(uoa));
          uoa.i.getLifecycle().addObserver(new LiveHotSpotRankListItemDataBinding$bindViewModel$8(uoa));
          uoa.h.setOnClickListener(new i(ok));
       }
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotRankListItemViewController.class, "3")) {
          return;
       }
       this.V2().u0(k$h$b.a);
       return;
    }
    public final k V2(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotRankListItemViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
