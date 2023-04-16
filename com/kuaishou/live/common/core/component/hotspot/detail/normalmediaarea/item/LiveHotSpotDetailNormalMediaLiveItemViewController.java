package com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.item.LiveHotSpotDetailNormalMediaLiveItemViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import msd.p;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.item.LiveHotSpotDetailNormalMediaLiveItemViewController$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.item.LiveHotSpotDetailNormalMediaLiveItemViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import nn1.h;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.item.LiveHotSpotDetailNormalMediaLiveItemViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import nn1.g;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import nn1.b;
import androidx.lifecycle.Observer;
import nn1.c;
import nn1.d;
import nn1.e;
import nn1.f;
import android.view.View$OnClickListener;
import nn1.a$a$b;
import nn1.a$a;
import nn1.a;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class LiveHotSpotDetailNormalMediaLiveItemViewController extends ViewController	// class@0013e6
{
    public final p j;
    public final LiveData k;
    public final p l;
    public final k m;

    public void LiveHotSpotDetailNormalMediaLiveItemViewController(LiveData p0,p p1,k p2){
       a.p(p0, "dataProvider");
       a.p(p1, "clickHandler");
       a.p(p2, "detailMainVCDelegate");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.j = new ViewModelLazy(m0.d(h.class), new LiveHotSpotDetailNormalMediaLiveItemViewController$$special$$inlined$viewModels$2(new LiveHotSpotDetailNormalMediaLiveItemViewController$$special$$inlined$viewModels$1(this)), new LiveHotSpotDetailNormalMediaLiveItemViewController$viewModel$2(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailNormalMediaLiveItemViewController.class, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c22);
       g og = new g(this.P2(), this);
       h oh = this.V2();
       if (!PatchProxy.applyVoidOneRefs(oh, og, g.class, "1")) {
          a.p(oh, "viewModel");
          oh.f.observe(og.f, new b(og));
          oh.e.observe(og.f, new c(og));
          oh.g.observe(og.f, new d(og));
          oh.d.observe(og.f, new e(og));
          og.e.setOnClickListener(new f(og, oh));
       }
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailNormalMediaLiveItemViewController.class, "3")) {
          return;
       }
       this.V2().u0(a$a$b.a);
       return;
    }
    public final h V2(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailNormalMediaLiveItemViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
