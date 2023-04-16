package com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM;
import yh3.a;
import androidx.lifecycle.LifecycleOwner;
import ah1.c;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import oh1.c;
import com.yxcorp.gifshow.models.Gift;
import lj1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$giftSendModelObserver$1;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$comboVisibleModelObserver$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import io.reactivex.BackpressureStrategy;
import brd.h;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$a;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import java.lang.Boolean;
import androidx.lifecycle.ViewModel;
import com.kuaishou.live.external.invoke.deserializer.gift.PacketGift;
import usd.q;
import jj1.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$b;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$b$e;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$b$b;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$b$c;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$b$a;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$b$g;
import brd.y;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$b$d;
import com.kuaishou.live.common.core.component.gift.domain.combo.vc.LiveComboVM$b$f;

public final class LiveComboVM extends a	// class@00118c
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public b e;
    public final c f;
    public final Object g;
    public final LiveData h;
    public final LiveComboVM$giftSendModelObserver$1 i;
    public final LiveComboVM$comboVisibleModelObserver$1 j;
    public final LifecycleOwner k;
    public final c l;
    public final LiveGiftSendModel m;
    public final c n;
    public final Gift o;
    public final b p;

    public void LiveComboVM(LifecycleOwner p0,c p1,LiveGiftSendModel p2,c p3,Gift p4,b p5){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "comboVisibleModel");
       a.p(p2, "giftSendModel");
       a.p(p3, "comboButtonListener");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.c = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.d = mutableLiveD;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.f = publishSubje;
       this.g = new Object();
       MutableLiveData mutableLiveD1 = new MutableLiveData(Integer.valueOf(0));
       this.o0(mutableLiveD1);
       this.h = mutableLiveD1;
       LiveComboVM$giftSendModelObserver$1 ogiftSendMod = new LiveComboVM$giftSendModelObserver$1(this);
       this.i = ogiftSendMod;
       LiveComboVM$comboVisibleModelObserver$1 uocomboVisib = new LiveComboVM$comboVisibleModelObserver$1(this);
       this.j = uocomboVisib;
       if (PatchProxy.applyVoid(null, this, LiveComboVM.class, "1")) {
       }else {
          p1.b(p0, uocomboVisib);
          p2.b(p0, ogiftSendMod);
       }
       this.e = publishSubje.toFlowable(BackpressureStrategy.DROP).t(d.c).A(LiveComboVM$a.b, Functions.e);
       return;
    }
    public final void A0(){
       if (PatchProxy.applyVoid(null, this, LiveComboVM.class, "5")) {
          return;
       }
       Boolean fALSE = Boolean.FALSE;
       this.l.e("[LiveComboVM][reset]", fALSE);
       this.r0(this.d).setValue(fALSE);
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveComboVM.class, "6")) {
          return;
       }
       super.onCleared();
       this.r0(this.h).setValue(Integer.valueOf(0));
       LiveComboVM te = this.e;
       if (te != null) {
          te.dispose();
       }
       this.A0();
       return;
    }
    public final void u0(boolean p0){
       LiveComboVM liveComboVM = LiveComboVM.class;
       if (PatchProxy.isSupport(liveComboVM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveComboVM, "4")) {
          return;
       }
       LiveComboVM to = this.o;
       if (to == null || this.p == null) {
          b.d0(LiveGiftTag.COMBO, "[doSendComboGift]", "gift", to, "giftSendParams", this.p);
          return;
       }else if(!to instanceof PacketGift){
          to = null;
       }
       PacketGift mCount = (to != null)? to.mCount: Integer.MAX_VALUE;
       Integer value = this.h.getValue();
       if (value == null) {
          value = Integer.valueOf(0);
       }
       a.o(value, "holdingContinuousSendGiftsCount.value ?: 0");
       int i = value.intValue();
       if (p0) {
          i = i + 1;
       }
       this.r0(this.h).setValue(Integer.valueOf(q.u(mCount, i)));
       LiveGiftSendModel.g(this.m, this.p, null, 2, null);
       b.d0(LiveGiftTag.COMBO, "[doSendComboGift] sendGift", "gift", this.o, "giftSendParams", this.p);
       return;
    }
    public final LiveData v0(){
       return this.c;
    }
    public final LiveData w0(){
       return this.b;
    }
    public final LiveData x0(){
       return this.a;
    }
    public final LiveData y0(){
       return this.d;
    }
    public void z0(LiveComboVM$b p0){
       LiveComboVM tn;
       LiveComboVM liveComboVM = LiveComboVM.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveComboVM, "2")) {
          return;
       }
       a.p(p0, "intent");
       Gift gift = -1;
       if (a.g(p0, LiveComboVM$b$e.a)) {
          this.u0(false);
          tn = this.n;
          liveComboVM = this.o;
          if (liveComboVM != null) {
             gift = liveComboVM.mId;
          }
          tn.e(gift, this.p);
       }else if(a.g(p0, LiveComboVM$b$b.a)){
          this.r0(this.d).setValue(Boolean.TRUE);
          this.n.c();
       }else if(a.g(p0, LiveComboVM$b$c.a)){
          if (!PatchProxy.applyVoid(null, this, liveComboVM, "3")) {
             Integer value = this.h.getValue();
             String str = 1;
             if (value != null && !value.intValue()) {
                this.u0(str);
                tn = this.n;
                liveComboVM = this.o;
                if (liveComboVM != null) {
                   gift = liveComboVM.mId;
                }
                tn.e(gift, this.p);
             }else {
                tn = this.n;
                Integer value1 = this.h.getValue();
                if (value1 == null) {
                   value1 = Integer.valueOf(str);
                }
                a.o(value1, "holdingContinuousSendGiftsCount.value ?: 1");
                tn.f(value1.intValue(), this.p);
             }
             this.r0(this.d).setValue(Boolean.FALSE);
             this.r0(this.h).setValue(Integer.valueOf(false));
          }
       }else if(a.g(p0, LiveComboVM$b$a.a)){
          this.r0(this.d).setValue(Boolean.FALSE);
          this.r0(this.h).setValue(Integer.valueOf(false));
       }else if(a.g(p0, LiveComboVM$b$g.a)){
          this.f.onNext(this.g);
          this.n.g();
       }else if(a.g(p0, LiveComboVM$b$d.a)){
          this.A0();
          this.n.a();
       }else if(p0 instanceof LiveComboVM$b$f){
          this.u0(p0.a);
       }
       return;
    }
}
