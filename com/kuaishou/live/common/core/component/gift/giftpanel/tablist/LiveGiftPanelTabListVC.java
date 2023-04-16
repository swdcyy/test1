package com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListVC;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import wl1.j;
import wl1.h;
import ah1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListVC$viewModel$2;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import am1.d;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListVC$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import am1.b;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;
import am1.c;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListDataBinding$bindViewModel$diffCallbackFactory$1;
import androidx.lifecycle.LiveData;
import am1.a;
import androidx.lifecycle.Observer;
import am1.d$a$a;
import java.util.Objects;
import am1.e;
import ih1.f;
import yg1.e;
import eh1.e;
import z1.k;
import wl1.i;
import yg1.a;
import ih1.k;
import yg1.f;
import gh1.a;
import com.kwai.robust.PatchProxyResult;
import ch1.d;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIGiftPanelTab;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$a;
import java.util.List;
import trd.t;
import ih1.k$a;
import hh1.h;
import qrd.p;

public final class LiveGiftPanelTabListVC extends ViewController	// class@001309
{
    public final p j;
    public final LiveGiftPanelConfig k;
    public final j l;
    public final h m;
    public final c n;

    public void LiveGiftPanelTabListVC(LiveGiftPanelConfig p0,j p1,h p2,c p3){
       a.p(p0, "panelConfig");
       a.p(p1, "tabListModel");
       a.p(p2, "selectTabModel");
       a.p(p3, "showTabModel");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.j = new ViewModelLazy(m0.d(d.class), new LiveGiftPanelTabListVC$$special$$inlined$viewModels$2(new LiveGiftPanelTabListVC$$special$$inlined$viewModels$1(this)), new LiveGiftPanelTabListVC$viewModel$2(this));
    }
    public void F2(){
       d$a$a a;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, LiveGiftPanelTabListVC.class, "2")) {
          return;
       }
       obj.Q2(R.layout.arg_RES_7f0d0b26);
       b uob = new b(this.P2());
       d uod = this.V2();
       String str = "1";
       if (!PatchProxy.applyVoidTwoRefs(obj, uod, uob, b.class, str)) {
          a.p(obj, "lifecycleOwner");
          a.p(uod, "viewModel");
          LiveGiftPanelTabListAdapter liveGiftPane = new LiveGiftPanelTabListAdapter(this, uod.b, uod.d, uod.e, uod.c);
          uob.a.setAdapter(v12);
          b a2 = uob.a;
          a2.setLayoutManager(super(a2.getContext(), 0, 0));
          uob.a.setItemAnimator(null);
          uod.u0().observe(obj, new a(v12, new c(new LiveGiftPanelTabListDataBinding$bindViewModel$diffCallbackFactory$1(v12))));
       }
       d uod1 = this.V2();
       a = d$a$a.a;
       Objects.requireNonNull(uod1);
       if (!PatchProxy.applyVoidOneRefs(a, uod1, d.class, str)) {
          a.p(a, "intent");
          d c = uod1.c;
          e uoe = new e(uod1);
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidTwoRefs("[LiveGiftPanelTabListVM][handleIntent]", uoe, c, j.class, str)) {
             String str1 = "source";
             a.p("[LiveGiftPanelTabListVM][handleIntent]", str1);
             String str2 = "callback";
             a.p(uoe, str2);
             f a1 = c.n.a;
             d obj1 = c.o.get();
             a.o(obj1, "liveStreamId.get\(\)");
             Object obj2 = c.p.get();
             a.o(obj2, "giftApiRequestPathSuffix.get\(\)");
             e uoe1 = new e(new e(obj1, obj2));
             i oi = new i(c, uoe);
             Objects.requireNonNull(a1);
             if (!PatchProxy.applyVoidThreeRefs("[LiveGiftPanelTabListVM][handleIntent]", uoe1, oi, a1, k.class, "1")) {
                a.p("[LiveGiftPanelTabListVM][handleIntent]", str1);
                String str3 = "request";
                a.p(uoe1, str3);
                a.p(oi, str2);
                k c1 = a1.c;
                if (c1 != null && c1.e()) {
                   oi.a("[LiveGiftPanelTabListVM][handleIntent]", c1);
                }else {
                   c1 = a1.b;
                   Objects.requireNonNull(c1);
                   if (!PatchProxy.applyVoidThreeRefs("[LiveGiftPanelTabListVM][handleIntent]", uoe1, oi, c1, a.class, "1")) {
                      a.p("[LiveGiftPanelTabListVM][handleIntent]", str1);
                      a.p(uoe1, str3);
                      a.p(oi, str2);
                      f uof = PatchProxy.apply(null, c1, a.class, "2");
                      if (uof != PatchProxyResult.class) {
                      }else {
                         obj1 = new d("NormalGift", 0, 0, "", LiveGiftPanelConfig.z.a());
                         uof = new f(1, "", t.k(uof));
                      }
                      oi.a("[LiveGiftPanelTabListVM][handleIntent]", uof);
                   }
                   a1.a.a("[LiveGiftPanelTabListVM][handleIntent]", uoe1, new k$a(a1));
                }
             }
          }
       }
       return;
    }
    public final d V2(){
       Object obj = PatchProxy.apply(null, this, LiveGiftPanelTabListVC.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
}
