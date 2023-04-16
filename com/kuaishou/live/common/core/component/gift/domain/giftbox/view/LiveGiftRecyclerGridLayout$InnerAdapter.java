package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftRecyclerGridLayout$InnerAdapter;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.pager.LiveGiftPanelItemListAdapter;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.ViewGroup;

public final class LiveGiftRecyclerGridLayout$InnerAdapter extends LifecycleRecyclerAdapter	// class@001227
{
    public int j;
    public final LiveGiftPanelItemListAdapter k;

    public void LiveGiftRecyclerGridLayout$InnerAdapter(LiveGiftPanelItemListAdapter p0){
       a.p(p0, "outerAdapter");
       super(p0.j);
       this.k = p0;
    }
    public boolean A0(RecyclerView$ViewHolder p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftRecyclerGridLayout$InnerAdapter.class, "9");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "holder");
          Objects.requireNonNull(this.k);
          b = false;
       }
       return b;
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.N0(p0);
    }
    public void D0(RecyclerView$ViewHolder p0){
       this.O0(p0);
    }
    public void E0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftRecyclerGridLayout$InnerAdapter.class, "11")) {
       }else {
          a.p(p0, "holder");
          Objects.requireNonNull(this.k);
       }
       return;
    }
    public void M0(LifecycleRecyclerAdapter$b p0,int p1){
       LiveGiftRecyclerGridLayout$InnerAdapter innerAdapter = LiveGiftRecyclerGridLayout$InnerAdapter.class;
       if (PatchProxy.isSupport(innerAdapter) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, innerAdapter, "5")) {
          return;
       }
       a.p(p0, "holder");
       this.k.M0(p0, ((this.j * 8) + p1));
       return;
    }
    public void N0(LifecycleRecyclerAdapter$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftRecyclerGridLayout$InnerAdapter.class, "4")) {
          return;
       }
       a.p(p0, "holder");
       this.k.N0(p0);
       return;
    }
    public void O0(LifecycleRecyclerAdapter$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftRecyclerGridLayout$InnerAdapter.class, "7")) {
          return;
       }
       a.p(p0, "holder");
       this.k.O0(p0);
       return;
    }
    public void i(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftRecyclerGridLayout$InnerAdapter.class, "10")) {
          return;
       }
       a.p(p0, "viewHolder");
       this.k.i(p0);
       return;
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftRecyclerGridLayout$InnerAdapter.class, "3")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.k.u0(p0);
       return;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.M0(p0, p1);
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       if (!PatchProxy.isSupport(LiveGiftRecyclerGridLayout$InnerAdapter.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LiveGiftRecyclerGridLayout$InnerAdapter.class, "6")) {
          a.p(p0, "holder");
          a.p(p2, "payloads");
          this.k.x0(p0, ((this.j * 8) + p1), p2);
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LifecycleRecyclerAdapter$b uob;
       LiveGiftRecyclerGridLayout$InnerAdapter innerAdapter = LiveGiftRecyclerGridLayout$InnerAdapter.class;
       if (PatchProxy.isSupport(innerAdapter)) {
          uob = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, innerAdapter, "2");
          if (uob != PatchProxyResult.class) {
          label_0024 :
             return uob;
          }
       }
       a.p(p0, "parent");
       uob = this.k.Q0(p0, p1);
       goto label_0024 ;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftRecyclerGridLayout$InnerAdapter.class, "8")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.k.z0(p0);
       return;
    }
}
