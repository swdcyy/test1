package com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVM;
import yh3.a;
import androidx.lifecycle.LifecycleOwner;
import rl1.a;
import rl1.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVM$FlipperPosition;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVM$observer$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rl1.h;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVM$a;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVM$a$b;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import ah1.a;
import com.kuaishou.live.common.core.component.gift.giftNaming.LiveGiftNamingNavigationVM$a$a;
import sl1.a;

public final class LiveGiftNamingNavigationVM extends a	// class@0012c0
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public Gift d;
    public final Model$a e;
    public final LifecycleOwner f;
    public final a g;
    public final g h;

    public void LiveGiftNamingNavigationVM(LifecycleOwner p0,a p1,g p2){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "giftNamingModel");
       a.p(p2, "listener");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData(LiveGiftNamingNavigationVM$FlipperPosition.FIRST);
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       this.e = new LiveGiftNamingNavigationVM$observer$1(this);
    }
    public final LiveData u0(LiveGiftNamingNavigationVM$FlipperPosition p0){
       LiveGiftNamingNavigationVM tb;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftNamingNavigationVM.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = h.a[p0.ordinal()];
       if (i != 1) {
          if (i == 2) {
             tb = this.b;
          }else {
             throw new NoWhenBranchMatchedException();
          }
       }else {
          tb = this.a;
       }
       return tb;
    }
    public final LiveGiftNamingNavigationVM$FlipperPosition v0(){
       LiveGiftNamingNavigationVM$FlipperPosition obj = PatchProxy.apply(null, this, LiveGiftNamingNavigationVM.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.getValue();
       if (obj == null) {
          obj = LiveGiftNamingNavigationVM$FlipperPosition.FIRST;
       }
       return obj;
    }
    public void w0(LiveGiftNamingNavigationVM$a p0){
       LiveGiftNamingNavigationVM$a$b a;
       LiveGiftNamingNavigationVM liveGiftNami = LiveGiftNamingNavigationVM.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveGiftNami, "1")) {
          return;
       }
       a.p(p0, "intent");
       if (p0 instanceof LiveGiftNamingNavigationVM$a$b) {
          a = p0.a;
          if (!PatchProxy.applyVoidOneRefs(a, this, liveGiftNami, "2")) {
             liveGiftNami = this.d;
             if (liveGiftNami != null) {
                this.g.d(Integer.valueOf(liveGiftNami.mId), this.e);
             }
             this.d = a;
             if (a != null) {
                this.g.b(this.f, Integer.valueOf(a.mId), this.e);
             }
          }
       }else if(a.g(p0, LiveGiftNamingNavigationVM$a$a.a)){
          a value = this.u0(this.v0()).getValue();
          if (value != null) {
             a.o(value, "it");
             this.h.a(value);
          }
       }
       return;
    }
}
