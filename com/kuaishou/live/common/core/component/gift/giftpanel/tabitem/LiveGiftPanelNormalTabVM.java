package com.kuaishou.live.common.core.component.gift.giftpanel.tabitem.LiveGiftPanelNormalTabVM;
import yh3.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import wl1.h;
import ah1.c;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.common.core.component.gift.giftpanel.tabitem.LiveGiftPanelNormalTabVM$selectModelObserver$1;
import com.kuaishou.live.common.core.component.gift.giftpanel.tabitem.LiveGiftPanelNormalTabVM$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ul1.d;
import ch1.d;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIGiftPanelTab;

public final class LiveGiftPanelNormalTabVM extends a	// class@001300
{
    public boolean a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;
    public final LiveGiftPanelNormalTabVM$selectModelObserver$1 g;
    public final Observer h;
    public final LiveData i;
    public final h j;
    public final c k;
    public final l l;

    public void LiveGiftPanelNormalTabVM(LifecycleOwner p0,LiveData p1,h p2,c p3,l p4){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "dataProvider");
       a.p(p2, "selectTabModel");
       a.p(p3, "tabShowModel");
       a.p(p4, "sortTypeModelSupplier");
       super();
       this.i = p1;
       this.j = p2;
       this.k = p3;
       this.l = p4;
       MutableLiveData mutableLiveD = new MutableLiveData();
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
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.f = mutableLiveD;
       LiveGiftPanelNormalTabVM$selectModelObserver$1 oselectModel = new LiveGiftPanelNormalTabVM$selectModelObserver$1(this);
       this.g = oselectModel;
       LiveGiftPanelNormalTabVM$b uob = new LiveGiftPanelNormalTabVM$b(this);
       this.h = uob;
       p1.observe(p0, uob);
       p2.b(p0, oselectModel);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveGiftPanelNormalTabVM.class, "1")) {
          return;
       }
       this.i.removeObserver(this.h);
       return;
    }
    public final LiveData u0(){
       return this.f;
    }
    public final LiveData v0(){
       return this.b;
    }
    public final boolean w0(){
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, LiveGiftPanelNormalTabVM.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j.a();
       String str = (obj != null)? obj.a(): objArray;
       d value = this.i.getValue();
       if (value != null) {
          objArray = value.a();
       }
       return a.g(str, objArray);
    }
    public final void x0(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelNormalTabVM.class, "7")) {
          return;
       }
       if (a.g(this.j.a(), p0)) {
          this.r0(this.c).setValue(p0.b().b().selectedText);
          this.r0(this.d).setValue(p0.b().b().selectedBackground);
       }else {
          this.r0(this.c).setValue(p0.b().b().unselectedText);
          this.r0(this.d).setValue(p0.b().b().unselectedBackground);
       }
       return;
    }
}
