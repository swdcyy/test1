package com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.item.LiveHotSpotDetailNormalMediaPhotoItemViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import msd.p;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.item.LiveHotSpotDetailNormalMediaPhotoItemViewController$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.item.LiveHotSpotDetailNormalMediaPhotoItemViewController$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import nn1.n;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.item.LiveHotSpotDetailNormalMediaPhotoItemViewController$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import nn1.m;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import nn1.i;
import androidx.lifecycle.Observer;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import nn1.j;
import nn1.k;
import nn1.l;
import android.view.View$OnClickListener;
import nn1.a$a$b;
import nn1.a$a;
import nn1.a;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class LiveHotSpotDetailNormalMediaPhotoItemViewController extends ViewController	// class@0013ec
{
    public final p j;
    public final LiveData k;
    public final p l;
    public final k m;

    public void LiveHotSpotDetailNormalMediaPhotoItemViewController(LiveData p0,p p1,k p2){
       a.p(p0, "dataProvider");
       a.p(p1, "clickHandler");
       a.p(p2, "detailMainVCDelegate");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.j = new ViewModelLazy(m0.d(n.class), new LiveHotSpotDetailNormalMediaPhotoItemViewController$$special$$inlined$viewModels$2(new LiveHotSpotDetailNormalMediaPhotoItemViewController$$special$$inlined$viewModels$1(this)), new LiveHotSpotDetailNormalMediaPhotoItemViewController$viewModel$2(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailNormalMediaPhotoItemViewController.class, "2")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c23);
       m om = new m(this.P2(), this);
       n on = this.V2();
       if (!PatchProxy.applyVoidOneRefs(on, om, m.class, "1")) {
          a.p(on, "viewModel");
          on.g.observe(om.e, new i(om));
          LiveDataOperators.d(on.d, on.e, on.h).observe(om.e, new j(om));
          on.f.observe(om.e, new k(om));
          om.d.setOnClickListener(new l(om, on));
       }
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailNormalMediaPhotoItemViewController.class, "3")) {
          return;
       }
       this.V2().u0(a$a$b.a);
       return;
    }
    public final n V2(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailNormalMediaPhotoItemViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
