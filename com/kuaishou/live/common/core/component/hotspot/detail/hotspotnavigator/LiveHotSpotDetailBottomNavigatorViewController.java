package com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.LiveData;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorDataBinding;
import android.view.View;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewController$onCreate$viewModel$2;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewController$onCreate$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewModel;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewController$onCreate$$inlined$viewModels$2;
import msd.a;
import qrd.p;
import kn1.a;
import androidx.lifecycle.Observer;
import kn1.b;
import android.view.View$OnClickListener;
import kn1.c;
import kn1.d;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import kn1.e;
import kn1.f;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewController$a;

public final class LiveHotSpotDetailBottomNavigatorViewController extends ViewController	// class@0013b8
{
    public boolean j;
    public final LiveData k;
    public final k l;

    public void LiveHotSpotDetailBottomNavigatorViewController(LiveData p0,k p1){
       a.p(p0, "navigatorLiveData");
       a.p(p1, "mainVCDelegate");
       super();
       this.k = p0;
       this.l = p1;
    }
    public void F2(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailBottomNavigatorViewController.class, str)) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c15);
       LiveHotSpotDetailBottomNavigatorDataBinding liveHotSpotD = new LiveHotSpotDetailBottomNavigatorDataBinding(this, this.P2(), this.B2(), this.l);
       LiveHotSpotDetailBottomNavigatorViewModel value = new ViewModelLazy(m0.d(LiveHotSpotDetailBottomNavigatorViewModel.class), new LiveHotSpotDetailBottomNavigatorViewController$onCreate$$inlined$viewModels$2(new LiveHotSpotDetailBottomNavigatorViewController$onCreate$$inlined$viewModels$1(this)), new LiveHotSpotDetailBottomNavigatorViewController$onCreate$viewModel$2(this)).getValue();
       if (!PatchProxy.applyVoidOneRefs(value, liveHotSpotD, LiveHotSpotDetailBottomNavigatorDataBinding.class, str)) {
          a.p(value, "viewModel");
          value.u0().observe(liveHotSpotD.g, new a(liveHotSpotD));
          liveHotSpotD.a.setOnClickListener(new b(liveHotSpotD));
          liveHotSpotD.b.setOnClickListener(new c(liveHotSpotD, value));
          value.v0().observe(liveHotSpotD.g, new d(liveHotSpotD));
          value.w0().observe(liveHotSpotD.g, new e(liveHotSpotD));
          value.e.observe(liveHotSpotD.g, new f(liveHotSpotD));
       }
       this.k.observe(this, new LiveHotSpotDetailBottomNavigatorViewController$a(this));
       return;
    }
}
