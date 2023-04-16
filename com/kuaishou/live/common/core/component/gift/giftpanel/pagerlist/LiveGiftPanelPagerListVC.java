package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVC;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import wl1.j;
import wl1.h;
import com.kuaishou.live.common.core.component.gift.giftpanel.model.SelectGiftModelWrapper;
import wl1.c;
import ah1.c;
import java.lang.String;
import z1.k;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ScrollMode;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVC$viewModel$2;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVC$$special$$inlined$viewModels$1;
import androidx.lifecycle.ViewModelLazy;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVM;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVC$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import xl1.d;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import androidx.viewpager2.widget.ViewPager2;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.lifecycle.LiveData;
import xl1.a;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import xl1.b;
import xl1.c;
import androidx.viewpager2.widget.ViewPager2$h;

public final class LiveGiftPanelPagerListVC extends ViewController	// class@0012e4
{
    public final p j;
    public final LiveGiftPanelConfig k;
    public final j l;
    public final h m;
    public final SelectGiftModelWrapper n;
    public final c o;
    public final c p;
    public final c q;
    public final c r;
    public final String s;
    public final int t;
    public final k u;
    public final LiveGiftBoxConfig$ScrollMode v;

    public void LiveGiftPanelPagerListVC(LiveGiftPanelConfig p0,j p1,h p2,SelectGiftModelWrapper p3,c p4,c p5,c p6,c p7,String p8,int p9,k p10,LiveGiftBoxConfig$ScrollMode p11){
       a.p(p0, "panelConfig");
       a.p(p1, "tabListModel");
       a.p(p2, "selectTabModel");
       a.p(p3, "selectGiftModelWrapper");
       a.p(p4, "completeVisibleModelWrapper");
       a.p(p5, "showGiftModel");
       a.p(p6, "showPagerItemModel");
       a.p(p7, "refreshTriggerModel");
       a.p(p8, "defaultSelectTabId");
       a.p(p10, "currentUser");
       a.p(p11, "scrollMode");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.q = p6;
       this.r = p7;
       this.s = p8;
       this.t = p9;
       this.u = p10;
       this.v = p11;
       this.j = new ViewModelLazy(m0.d(LiveGiftPanelPagerListVM.class), new LiveGiftPanelPagerListVC$$special$$inlined$viewModels$2(new LiveGiftPanelPagerListVC$$special$$inlined$viewModels$1(this)), new LiveGiftPanelPagerListVC$viewModel$2(this));
    }
    public void F2(){
       d a;
       Object obj = this;
       LiveGiftPanelPagerListVC liveGiftPane = LiveGiftPanelPagerListVC.class;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, obj, liveGiftPane, str)) {
          return;
       }
       obj.Q2(R.layout.arg_RES_7f0d0b25);
       d uod = new d(this.P2(), obj.v);
       LiveGiftPanelPagerListVM liveGiftPane1 = PatchProxy.apply(objArray, obj, liveGiftPane, "1");
       if (liveGiftPane1 == PatchProxyResult.class) {
          liveGiftPane1 = obj.j.getValue();
       }
       Object obj1 = liveGiftPane1;
       if (!PatchProxy.applyVoidTwoRefs(obj, obj1, uod, d.class, str)) {
          a.p(obj, "lifecycleOwner");
          a.p(obj1, "viewModel");
          a = uod.a;
          int i = 0;
          boolean b = (uod.b != LiveGiftBoxConfig$ScrollMode.PAGER_HORIZONTAL)? true: false;
          a.setUserInputEnabled(b);
          View childAt = uod.a.getChildAt(i);
          if (childAt instanceof RecyclerView) {
             RecyclerView$LayoutManager layoutManage = childAt.getLayoutManager();
             if (layoutManage != null) {
                layoutManage.setItemPrefetchEnabled(i);
             }
          }
          LiveGiftPanelPagerListAdapter liveGiftPane2 = new LiveGiftPanelPagerListAdapter(this, obj1.d, obj1.g, obj1.h, obj1.i, obj1.j, obj1.k, obj1.m, obj1.n, obj1.w0(), uod.b);
          uod.a.setAdapter(v15);
          obj1.u0().observe(obj, super(v15, obj1));
          LiveData liveData = Transformations.distinctUntilChanged(obj1.v0());
          a.h(liveData, "Transformations.distinctUntilChanged\(this\)");
          liveData.observe(obj, new b(uod, v15));
          uod.a.j(new c(obj1));
       }
       return;
    }
}
