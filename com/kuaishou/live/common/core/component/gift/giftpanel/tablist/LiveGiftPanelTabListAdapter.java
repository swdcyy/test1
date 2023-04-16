package com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListAdapter;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import wl1.h;
import ah1.c;
import wl1.j;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import ul1.d;
import ch1.d;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import am1.f;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListAdapter$onCreateViewHolder$1;
import java.util.Objects;
import am1.f$a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import i2b.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig$c;
import java.util.concurrent.ConcurrentHashMap;
import zl1.g;
import msd.l;

public final class LiveGiftPanelTabListAdapter extends LifecycleRecyclerAdapter	// class@001302
{
    public final LiveGiftPanelConfig j;
    public final h k;
    public final c l;
    public final j m;

    public void LiveGiftPanelTabListAdapter(LifecycleOwner p0,LiveGiftPanelConfig p1,h p2,c p3,j p4){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "panelConfig");
       a.p(p2, "selectTabModel");
       a.p(p3, "showTabModel");
       a.p(p4, "tabListModel");
       super(p0);
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.m = p4;
    }
    public int f0(int p0){
       LiveGiftPanelTabListAdapter liveGiftPane = LiveGiftPanelTabListAdapter.class;
       if (PatchProxy.isSupport(liveGiftPane)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveGiftPane, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.J0().get(p0).b().tabType;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       String obj2;
       f$a a;
       LiveGiftPanelConfig$c uoc;
       Object obj = this;
       View obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveGiftPanelTabListAdapter liveGiftPane = LiveGiftPanelTabListAdapter.class;
       String str = "1";
       if (PatchProxy.isSupport(liveGiftPane)) {
          obj2 = PatchProxy.applyTwoRefs(obj1, Integer.valueOf(p1), obj, liveGiftPane, str);
          if (obj2 != patchProxyRe) {
          }else {
          label_001e :
             obj2 = "parent";
             a.p(obj1, obj2);
             a = f.a;
             LifecycleOwner lifecycleOwn = this.L0();
             LiveGiftPanelTabListAdapter j = obj.j;
             LiveGiftPanelTabListAdapter k = obj.k;
             LiveGiftPanelTabListAdapter l = obj.l;
             LiveGiftPanelTabListAdapter$onCreateViewHolder$1 oonCreateVie = new LiveGiftPanelTabListAdapter$onCreateViewHolder$1(obj);
             Objects.requireNonNull(a);
             f$a uoa = f$a.class;
             int i = 2;
             int i1 = 3;
             int i2 = 1;
             int i3 = 0;
             if (PatchProxy.isSupport(uoa)) {
                Object[] objArray = new Object[]{obj1,Integer.valueOf(p1),lifecycleOwn,j,k,l,oonCreateVie};
                Object obj3 = PatchProxy.apply(objArray, a, uoa, str);
                if (obj3 != patchProxyRe) {
                   obj2 = obj3;
                }
             }
             a.p(obj1, obj2);
             obj2 = "lifecycleOwner";
             a.p(lifecycleOwn, obj2);
             a.p(j, "panelConfig");
             a.p(k, "selectTabModel");
             String str1 = "showTabModel";
             a.p(l, str1);
             a.p(oonCreateVie, "sortTypeModelSupplier");
             obj1 = a.g(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d0b3c, obj1, i3);
             Objects.requireNonNull(j);
             LiveGiftPanelConfig liveGiftPane1 = LiveGiftPanelConfig.class;
             if (PatchProxy.isSupport(liveGiftPane1)) {
                uoc = PatchProxy.applyOneRefs(Integer.valueOf(p1), j, liveGiftPane1, "5");
                if (uoc != patchProxyRe) {
                }else {
                label_00af :
                   uoc = j.a.get(Integer.valueOf(p1));
                   if (uoc == null) {
                      uoc = j.s;
                   }
                }
             }else {
                goto label_00af ;
             }
             String str2 = "itemView";
             a.o(obj1, str2);
             Objects.requireNonNull(uoc);
             if (PatchProxy.isSupport(LiveGiftPanelConfig$c.class)) {
                Object[] objArray1 = new Object[]{lifecycleOwn,obj1,k,l,oonCreateVie};
                Object obj4 = PatchProxy.apply(objArray1, uoc, LiveGiftPanelConfig$c.class, str);
                if (obj4 != patchProxyRe) {
                   obj2 = obj4;
                }
             }
             a.p(lifecycleOwn, obj2);
             a.p(obj1, str2);
             a.p(k, "selectTabModel");
             a.p(l, str1);
             a.p(oonCreateVie, "sortTypeModelSupplier");
             g og = new g(lifecycleOwn, obj1, k, l, oonCreateVie);
             obj2 = patchProxyRe;
          }
       }else {
          goto label_001e ;
       }
       return obj2;
    }
}
