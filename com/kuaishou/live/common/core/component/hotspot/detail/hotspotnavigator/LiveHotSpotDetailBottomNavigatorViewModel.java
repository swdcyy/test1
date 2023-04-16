package com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewModel;
import yh3.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewModel$spHasNextClick$2;
import msd.a;
import qrd.p;
import qrd.s;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import zh3.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import d61.l0;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewModel$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kn1.i;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import crd.b;
import com.kwai.robust.PatchProxyResult;

public final class LiveHotSpotDetailBottomNavigatorViewModel extends a	// class@0013bd
{
    public final p a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveEvent f;
    public int g;
    public b h;
    public final LifecycleOwner i;
    public final LiveData j;
    public final k k;

    public void LiveHotSpotDetailBottomNavigatorViewModel(LifecycleOwner p0,LiveData p1,k p2){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "navigatorLiveData");
       a.p(p2, "mainVCDelegate");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.a = s.c(LiveHotSpotDetailBottomNavigatorViewModel$spHasNextClick$2.INSTANCE);
       Boolean fALSE = Boolean.FALSE;
       MutableLiveData mutableLiveD = new MutableLiveData(fALSE);
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.d = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.e = mutableLiveD;
       c uoc = new c();
       this.p0(uoc);
       this.f = uoc;
       fALSE = this.x0().b(fALSE);
       a.o(fALSE, "hasClick");
       this.r0(mutableLiveD).setValue(new LiveHotSpotDetailBottomNavigatorViewModel$b(fALSE.booleanValue(), false));
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailBottomNavigatorViewModel.class, "2")) {
       }else {
          p1.observe(p0, new i(this));
       }
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailBottomNavigatorViewModel.class, "5")) {
          return;
       }
       super.onCleared();
       LiveHotSpotDetailBottomNavigatorViewModel th = this.h;
       if (th != null) {
          th.dispose();
       }
       return;
    }
    public final LiveData u0(){
       return this.b;
    }
    public final LiveData v0(){
       return this.c;
    }
    public final LiveEvent w0(){
       return this.f;
    }
    public final l0 x0(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailBottomNavigatorViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
}
