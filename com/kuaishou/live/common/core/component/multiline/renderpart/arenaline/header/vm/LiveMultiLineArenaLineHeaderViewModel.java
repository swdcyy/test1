package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.vm.LiveMultiLineArenaLineHeaderViewModel;
import yh3.a;
import ar1.a;
import dr1.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import is1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.vm.LiveMultiLineArenaLineHeaderViewModel$countdownModel$1;
import msd.a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.vm.LiveMultiLineArenaLineHeaderViewModel$a;
import z0.a;
import androidx.lifecycle.Transformations;
import cu1.d;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.vm.LiveMultiLineArenaLineHeaderViewModel$c;
import androidx.lifecycle.Observer;
import java.lang.Boolean;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;

public final class LiveMultiLineArenaLineHeaderViewModel extends a	// class@00152d
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final a e;
    public final LiveData f;
    public final Observer g;
    public final a h;
    public final f i;

    public void LiveMultiLineArenaLineHeaderViewModel(boolean p0,a p1,f p2){
       a.p(p1, "arenaHeaderDelegate");
       a.p(p2, "arenaLineModel");
       super();
       this.h = p1;
       this.i = p2;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       MutableLiveData mutableLiveD1 = new MutableLiveData();
       this.o0(mutableLiveD1);
       this.c = mutableLiveD1;
       MutableLiveData mutableLiveD2 = new MutableLiveData();
       this.o0(mutableLiveD2);
       this.d = mutableLiveD2;
       a uoa = new a(LiveMultiLineArenaLineHeaderViewModel$countdownModel$1.INSTANCE, null);
       this.e = uoa;
       LiveData liveData = Transformations.map(uoa.a(), new LiveMultiLineArenaLineHeaderViewModel$a());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       liveData = Transformations.distinctUntilChanged(liveData);
       a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
       this.f = d.a(liveData);
       LiveMultiLineArenaLineHeaderViewModel$c uoc = new LiveMultiLineArenaLineHeaderViewModel$c(this);
       this.g = uoc;
       p2.e().observeForever(uoc);
       MutableLiveData mutableLiveD3 = this.r0(mutableLiveD1);
       mutableLiveD3.setValue(Boolean.FALSE);
       if (p0) {
          this.r0(mutableLiveD).setValue(a1.p(R.string.arg_RES_7f102934));
       }else {
          this.r0(mutableLiveD).setValue(a1.p(R.string.arg_RES_7f10281a));
       }
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveMultiLineArenaLineHeaderViewModel.class, "1")) {
          return;
       }
       super.onCleared();
       this.i.e().removeObserver(this.g);
       return;
    }
    public final a u0(){
       return this.e;
    }
    public final LiveData v0(){
       return this.c;
    }
    public final LiveData w0(){
       return this.a;
    }
    public final LiveData x0(){
       return this.d;
    }
}
