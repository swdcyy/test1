package com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import un1.d;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoDataBinding;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoViewController$onCreate$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoViewController$onCreate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import gn1.g;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoViewController$onCreate$$inlined$viewModels$2;
import msd.a;
import qrd.p;
import gn1.a;
import androidx.lifecycle.Observer;
import gn1.b;
import gn1.c;
import gn1.d;
import gn1.e;
import gn1.f;

public final class LiveHotSpotDetailBaseInfoViewController extends ViewController	// class@001374
{
    public final LiveData j;
    public final d k;
    public final k l;

    public void LiveHotSpotDetailBaseInfoViewController(LiveData p0,d p1,k p2){
       a.p(p0, "dataProvider");
       a.p(p1, "contentVCDelegate");
       a.p(p2, "detailMainVCDelegate");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
    }
    public void F2(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailBaseInfoViewController.class, str)) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c14);
       LiveHotSpotDetailBaseInfoDataBinding liveHotSpotD = new LiveHotSpotDetailBaseInfoDataBinding(this, this.P2(), this.k, this.l);
       g value = new ViewModelLazy(m0.d(g.class), new LiveHotSpotDetailBaseInfoViewController$onCreate$$inlined$viewModels$2(new LiveHotSpotDetailBaseInfoViewController$onCreate$$inlined$viewModels$1(this)), new LiveHotSpotDetailBaseInfoViewController$onCreate$viewModel$2(this)).getValue();
       if (!PatchProxy.applyVoidOneRefs(value, liveHotSpotD, LiveHotSpotDetailBaseInfoDataBinding.class, str)) {
          a.p(value, "viewModel");
          value.c.observe(liveHotSpotD.c, new a(liveHotSpotD));
          value.b.observe(liveHotSpotD.c, new b(liveHotSpotD));
          value.d.observe(liveHotSpotD.c, new c(liveHotSpotD));
          value.e.observe(liveHotSpotD.c, new d(liveHotSpotD));
          value.f.observe(liveHotSpotD.c, new e(liveHotSpotD));
          value.g.observe(liveHotSpotD.c, new f(liveHotSpotD));
       }
       return;
    }
}
