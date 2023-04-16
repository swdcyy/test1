package com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.LiveGiftPanelNormalItemVM;
import yh3.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.gift.giftpanel.model.SelectGiftModelWrapper;
import ah1.c;
import wl1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.LiveGiftPanelNormalItemVM$selectModelObserver$1;
import com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.LiveGiftPanelNormalItemVM$visibleModelObserver$1;
import com.kuaishou.live.common.core.component.gift.giftpanel.giftitem.LiveGiftPanelNormalItemVM$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.giftpanel.model.CompleteVisibleModelWrapper$observer$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import ul1.a;
import ch1.c;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Integer;
import wl1.g;
import java.lang.Boolean;
import ch1.f;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIMarkLabel;

public final class LiveGiftPanelNormalItemVM extends a	// class@0012d6
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;
    public final LiveData g;
    public final LiveData h;
    public final LiveData i;
    public final LiveData j;
    public final LiveGiftPanelNormalItemVM$selectModelObserver$1 k;
    public final LiveGiftPanelNormalItemVM$visibleModelObserver$1 l;
    public final Observer m;
    public final LifecycleOwner n;
    public final LiveData o;
    public final SelectGiftModelWrapper p;
    public final c q;
    public final c r;
    public final c s;

    public void LiveGiftPanelNormalItemVM(LifecycleOwner p0,LiveData p1,SelectGiftModelWrapper p2,c p3,c p4,c p5){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "dataProvider");
       a.p(p2, "selectGiftModelWrapper");
       a.p(p3, "showGiftModel");
       a.p(p4, "showPagerItemModel");
       a.p(p5, "completeVisibleModelWrapper");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
       this.r = p4;
       this.s = p5;
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
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.e = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.f = mutableLiveD;
       mutableLiveD = new MutableLiveData(null);
       this.o0(mutableLiveD);
       this.g = mutableLiveD;
       mutableLiveD = new MutableLiveData(null);
       this.o0(mutableLiveD);
       this.h = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.i = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.j = mutableLiveD;
       LiveGiftPanelNormalItemVM$selectModelObserver$1 oselectModel = new LiveGiftPanelNormalItemVM$selectModelObserver$1(this);
       this.k = oselectModel;
       LiveGiftPanelNormalItemVM$visibleModelObserver$1 ovisibleMode = new LiveGiftPanelNormalItemVM$visibleModelObserver$1(this);
       this.l = ovisibleMode;
       LiveGiftPanelNormalItemVM$b uob = new LiveGiftPanelNormalItemVM$b(this);
       this.m = uob;
       p1.observe(p0, uob);
       p2.b(p0, oselectModel);
       Objects.requireNonNull(p5);
       if (PatchProxy.applyVoidTwoRefs(p0, ovisibleMode, p5, c.class, "3")) {
       }else {
          a.p(p0, "owner");
          a.p(ovisibleMode, "observer");
          p5.a.b(p0, new CompleteVisibleModelWrapper$observer$1(p0, ovisibleMode));
       }
       return;
    }
    public final LiveData u0(){
       return this.g;
    }
    public final LiveData v0(){
       return this.i;
    }
    public final LiveData w0(){
       return this.h;
    }
    public final LiveData x0(){
       return this.f;
    }
    public final LiveData y0(){
       return this.j;
    }
    public final void z0(a p0){
       Object obj1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelNormalItemVM.class, "2")) {
          return;
       }
       MutableLiveData mutableLiveD = this.r0(this.i);
       Gift gift = p0.b().b();
       Object obj = null;
       Integer integer = (gift != null)? Integer.valueOf(gift.mId): obj;
       mutableLiveD.setValue(integer);
       g og = this.p.a(p0.d());
       a uoa = (og != null)? og.a(): obj;
       boolean b = a.g(uoa, p0);
       this.r0(this.f).setValue(Boolean.valueOf(b));
       f markLabelLis = p0.b().g().markLabelList;
       if (markLabelLis != null) {
          MutableLiveData mutableLiveD1 = this.r0(this.g);
          Iterator iterator = markLabelLis.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj1 = iterator.next();
                Object obj2 = (obj1.e() == 1)? 1: null;
                if (!obj2) {
                   continue ;
                }
             }else {
                obj1 = obj;
             }
             mutableLiveD1.setValue(obj1);
             mutableLiveD1 = this.r0(this.h);
             Iterator iterator1 = markLabelLis.iterator();
             while (iterator1.hasNext()) {
                Object obj3 = iterator1.next();
                obj1 = (obj3.e() == 2)? 1: null;
                if (obj1) {
                   obj = obj3;
                }else {
                   continue ;
                }
             }
             mutableLiveD1.setValue(obj);
          }
       }else {
          this.r0(this.g).setValue(obj);
          this.r0(this.h).setValue(obj);
       }
       if (b) {
          this.r0(this.a).setValue(p0.b().g().selectedGiftIcon);
          this.r0(this.b).setValue(p0.b().g().selectedBackground);
          this.r0(this.c).setValue(p0.b().g().selectedTextLine1);
          this.r0(this.d).setValue(p0.b().g().selectedTextLine2);
          this.r0(this.e).setValue(p0.b().g().selectedBorder);
       }else {
          this.r0(this.a).setValue(p0.b().g().unselectedGiftIcon);
          this.r0(this.b).setValue(p0.b().g().unselectedBackground);
          this.r0(this.c).setValue(p0.b().g().unselectedTextLine1);
          this.r0(this.d).setValue(p0.b().g().unSelectedTextLine2);
          this.r0(this.e).setValue(p0.b().g().unselectedBorder);
       }
       return;
    }
}
