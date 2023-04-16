package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVM;
import yh3.a;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import wl1.j;
import wl1.h;
import com.kuaishou.live.common.core.component.gift.giftpanel.model.SelectGiftModelWrapper;
import wl1.c;
import ah1.c;
import java.lang.String;
import z1.k;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVM$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVM$2;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVM$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVM$a$a;
import java.lang.CharSequence;
import ul1.d;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVM$a$b;
import java.util.Objects;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import yg1.f;
import java.util.List;
import ch1.d;
import ch1.e;

public final class LiveGiftPanelPagerListVM extends a	// class@0012ea
{
    public final LiveData a;
    public final LiveData b;
    public final LifecycleOwner c;
    public final LiveGiftPanelConfig d;
    public final j e;
    public final h f;
    public final SelectGiftModelWrapper g;
    public final c h;
    public final c i;
    public final c j;
    public final c k;
    public String l;
    public final int m;
    public final k n;

    public void LiveGiftPanelPagerListVM(LifecycleOwner p0,LiveGiftPanelConfig p1,j p2,h p3,SelectGiftModelWrapper p4,c p5,c p6,c p7,c p8,String p9,int p10,k p11){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "panelConfig");
       a.p(p2, "tabListModel");
       a.p(p3, "selectTabModel");
       a.p(p4, "selectGiftModelWrapper");
       a.p(p5, "completeVisibleModelWrapper");
       a.p(p6, "showGiftModel");
       a.p(p7, "showPagerItemModel");
       a.p(p8, "refreshTriggerModel");
       a.p(p9, "defaultSelectTabId");
       a.p(p11, "currentUser");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       this.j = p7;
       this.k = p8;
       this.l = p9;
       this.m = p10;
       this.n = p11;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       p2.b(p0, new LiveGiftPanelPagerListVM$1(this));
       p3.b(p0, new LiveGiftPanelPagerListVM$2(this));
    }
    public final LiveData u0(){
       return this.a;
    }
    public final LiveData v0(){
       return this.b;
    }
    public final j w0(){
       return this.e;
    }
    public void x0(LiveGiftPanelPagerListVM$a p0){
       LiveGiftPanelPagerListVM liveGiftPane;
       d uod;
       LiveGiftPanelPagerListVM$a$b a;
       d uod1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelPagerListVM.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       if (p0 instanceof LiveGiftPanelPagerListVM$a$a) {
          liveGiftPane = (this.l.length() > 0)? 1: null;
          if (liveGiftPane) {
             liveGiftPane = this.l;
             this.l = "";
             uod = this.e.i(liveGiftPane);
          }else {
             uod = this.e.i("NormalGift");
          }
          this.f.e("[LiveGiftPanelPagerListVM][InitFinish]", uod);
       }else if(p0 instanceof LiveGiftPanelPagerListVM$a$b){
          LiveGiftPanelPagerListVM te = this.e;
          a = p0.a;
          Objects.requireNonNull(te);
          j oj = j.class;
          if (PatchProxy.isSupport(oj)) {
             uod1 = PatchProxy.applyOneRefs(Integer.valueOf(a), te, oj, "10");
             if (uod1 != PatchProxyResult.class) {
             label_0083 :
                this.f.e("[LiveGiftPanelPagerListVM][UpdateSelectPage]", uod1);
             }
          }
          f uof = te.a();
          if (uof != null) {
             List list = uof.c();
             if (list != null) {
                uod = list.get(a);
                if (uod != null) {
                   uod = e.a(uod);
                label_0082 :
                   uod1 = uod;
                   goto label_0083 ;
                }
             }
          }
          liveGiftPane = null;
          goto label_0082 ;
       }
       return;
    }
}
