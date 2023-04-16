package com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListAdapter;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import com.kuaishou.live.common.core.component.gift.giftpanel.model.SelectGiftModelWrapper;
import wl1.c;
import ah1.c;
import z1.k;
import wl1.j;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ScrollMode;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import i2b.a;
import yl1.m;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListAdapter$onCreateViewHolder$1;
import msd.l;

public final class LiveGiftPanelPagerListAdapter extends LifecycleRecyclerAdapter	// class@0012de
{
    public final LifecycleOwner j;
    public final LiveGiftPanelConfig k;
    public final SelectGiftModelWrapper l;
    public final c m;
    public final c n;
    public final c o;
    public final c p;
    public final int q;
    public final k r;
    public final j s;
    public final LiveGiftBoxConfig$ScrollMode t;

    public void LiveGiftPanelPagerListAdapter(LifecycleOwner p0,LiveGiftPanelConfig p1,SelectGiftModelWrapper p2,c p3,c p4,c p5,c p6,int p7,k p8,j p9,LiveGiftBoxConfig$ScrollMode p10){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "panelConfig");
       a.p(p2, "selectGiftModelWrapper");
       a.p(p3, "completeVisibleModelWrapper");
       a.p(p4, "showGiftModel");
       a.p(p5, "showPagerItemModel");
       a.p(p6, "refreshTriggerModel");
       a.p(p8, "currentUser");
       a.p(p9, "tabListModel");
       a.p(p10, "scrollMode");
       super(p0);
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.n = p4;
       this.o = p5;
       this.p = p6;
       this.q = p7;
       this.r = p8;
       this.s = p9;
       this.t = p10;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       Object obj = this;
       Object obj1 = p0;
       LiveGiftPanelPagerListAdapter liveGiftPane = LiveGiftPanelPagerListAdapter.class;
       if (PatchProxy.isSupport(liveGiftPane)) {
          m om = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(p1), obj, liveGiftPane, "1");
          if (om != PatchProxyResult.class) {
          label_005a :
             return om;
          }
       }
       a.p(obj1, "parent");
       View view = a.g(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d0b3b, obj1, false);
       a.o(view, "itemView");
       m om1 = new m(obj.j, obj.k, view, obj.l, obj.m, obj.n, obj.o, obj.p, obj.q, obj.r, new LiveGiftPanelPagerListAdapter$onCreateViewHolder$1(obj), obj.t);
       goto label_005a ;
    }
}
