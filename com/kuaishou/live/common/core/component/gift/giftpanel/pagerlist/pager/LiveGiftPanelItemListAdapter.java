package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelItemListAdapter;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ScrollMode;
import com.kuaishou.live.common.core.component.gift.giftpanel.model.SelectGiftModelWrapper;
import wl1.c;
import ah1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import yl1.a;
import java.util.Objects;
import yl1.a$a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$b;
import java.util.concurrent.ConcurrentHashMap;
import vl1.q;
import java.lang.Number;
import java.util.List;
import ul1.a;
import ch1.c;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class LiveGiftPanelItemListAdapter extends LifecycleRecyclerAdapter	// class@0012eb
{
    public final LifecycleOwner j;
    public final LiveGiftPanelConfig k;
    public final LiveGiftBoxConfig$ScrollMode l;
    public final SelectGiftModelWrapper m;
    public final c n;
    public final c o;
    public final c p;

    public void LiveGiftPanelItemListAdapter(LifecycleOwner p0,LiveGiftPanelConfig p1,LiveGiftBoxConfig$ScrollMode p2,SelectGiftModelWrapper p3,c p4,c p5,c p6){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "panelConfig");
       a.p(p2, "scrollMode");
       a.p(p3, "selectGiftModelWrapper");
       a.p(p4, "completeVisibleModelWrapper");
       a.p(p5, "showGiftModel");
       a.p(p6, "showPagerItemModel");
       super(p0);
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.n = p4;
       this.o = p5;
       this.p = p6;
    }
    public LifecycleRecyclerAdapter$b Q0(ViewGroup p0,int p1){
       String obj2;
       a$a a;
       String obj3;
       LiveGiftPanelConfig$b uob;
       View obj = this;
       LiveGiftPanelConfig obj1 = p0;
       LiveGiftPanelItemListAdapter liveGiftPane = LiveGiftPanelItemListAdapter.class;
       if (PatchProxy.isSupport(liveGiftPane)) {
          obj2 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(p1), obj, liveGiftPane, "1");
          if (obj2 != PatchProxyResult.class) {
             return obj2;
          }
       }
       obj2 = "parent";
       a.p(obj1, obj2);
       a = a.a;
       LiveGiftPanelItemListAdapter j = obj.j;
       LiveGiftPanelItemListAdapter k = obj.k;
       LiveGiftPanelItemListAdapter m = obj.m;
       LiveGiftPanelItemListAdapter n = obj.n;
       LiveGiftPanelItemListAdapter o = obj.o;
       LiveGiftPanelItemListAdapter p = obj.p;
       LiveGiftPanelItemListAdapter l = obj.l;
       Objects.requireNonNull(a);
       a$a uoa = a$a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[9];
          objArray[i] = obj1;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = j;
          objArray[3] = k;
          objArray[4] = m;
          objArray[5] = n;
          objArray[6] = o;
          objArray[7] = p;
          objArray[8] = l;
          obj3 = PatchProxy.apply(objArray, a, uoa, "1");
          if (obj3 != PatchProxyResult.class) {
          label_0148 :
             return obj3;
          }
       }
       a.p(obj1, obj2);
       a.p(j, "lifecycleOwner");
       a.p(k, "panelConfig");
       obj3 = "selectGiftModelWrapper";
       a.p(m, obj3);
       a.p(n, "completeVisibleModelWrapper");
       a.p(o, "showGiftModel");
       a.p(p, "showPagerItemModel");
       a.p(l, "scrollMode");
       String str = "showPagerItemModel";
       String str1 = "showGiftModel";
       obj = a.g(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d0b3a, obj1, false);
       a.o(obj, "itemView");
       obj.getLayoutParams().width = p0.getWidth() / 4;
       obj.getLayoutParams().height = (l == LiveGiftBoxConfig$ScrollMode.LIST_VERTICAL)? a1.d(0x7f07026c): p0.getHeight() / 2;
       Objects.requireNonNull(k);
       obj1 = LiveGiftPanelConfig.class;
       if (PatchProxy.isSupport(obj1)) {
          uob = PatchProxy.applyOneRefs(Integer.valueOf(p1), k, obj1, "7");
          if (uob != PatchProxyResult.class) {
          }else {
          label_00f5 :
             uob = k.b.get(Integer.valueOf(p1));
             if (uob == null) {
                uob = k.t;
             }
          }
       }else {
          goto label_00f5 ;
       }
       Objects.requireNonNull(uob);
       LiveGiftPanelConfig$b uob1 = LiveGiftPanelConfig$b.class;
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray1 = new Object[]{j,obj,m,n,o,p};
          q oq = PatchProxy.apply(objArray1, uob, uob1, "1");
          if (oq != PatchProxyResult.class) {
          label_0147 :
             obj3 = oq;
             goto label_0148 ;
          }
       }
       a.p(j, "lifecycleOwner");
       a.p(obj, "itemView");
       a.p(m, obj3);
       a.p(n, "completeVisibleModelWrapper");
       a.p(o, str1);
       a.p(p, str);
       q oq1 = new q(j, obj, n, m, o, p);
       goto label_0147 ;
    }
    public int f0(int p0){
       LiveGiftPanelItemListAdapter liveGiftPane = LiveGiftPanelItemListAdapter.class;
       if (PatchProxy.isSupport(liveGiftPane)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveGiftPane, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.J0().get(p0).b().d;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       return this.Q0(p0, p1);
    }
}
