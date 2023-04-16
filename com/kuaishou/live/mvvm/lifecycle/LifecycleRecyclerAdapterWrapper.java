package com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapterWrapper;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.mvvm.lifecycle.LifecycleRecyclerAdapter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Integer;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import android.view.ViewGroup;

public final class LifecycleRecyclerAdapterWrapper extends LifecycleRecyclerAdapter	// class@000d0c
{
    public final RecyclerView$Adapter j;

    public boolean A0(RecyclerView$ViewHolder p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, LifecycleRecyclerAdapterWrapper.class, "11");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "holder");
          b = this.j.A0(p0);
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
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleRecyclerAdapterWrapper.class, "10")) {
       }else {
          a.p(p0, "holder");
          this.j.E0(p0);
       }
       return;
    }
    public void N0(LifecycleRecyclerAdapter$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleRecyclerAdapterWrapper.class, "8")) {
          return;
       }
       a.p(p0, "holder");
       super.N0(p0);
       this.j.B0(p0);
       return;
    }
    public void O0(LifecycleRecyclerAdapter$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleRecyclerAdapterWrapper.class, "9")) {
          return;
       }
       a.p(p0, "holder");
       super.O0(p0);
       this.j.D0(p0);
       return;
    }
    public long d0(int p0){
       LifecycleRecyclerAdapterWrapper lifecycleRec = LifecycleRecyclerAdapterWrapper.class;
       if (PatchProxy.isSupport(lifecycleRec)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, lifecycleRec, "5");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return this.j.d0(p0);
    }
    public int f0(int p0){
       LifecycleRecyclerAdapterWrapper lifecycleRec = LifecycleRecyclerAdapterWrapper.class;
       if (PatchProxy.isSupport(lifecycleRec)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, lifecycleRec, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.j.f0(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, LifecycleRecyclerAdapterWrapper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.j.getItemCount();
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleRecyclerAdapterWrapper.class, "6")) {
          return;
       }
       a.p(p0, "recyclerView");
       super.u0(p0);
       this.j.u0(p0);
       return;
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       if (!PatchProxy.isSupport(LifecycleRecyclerAdapterWrapper.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, LifecycleRecyclerAdapterWrapper.class, "2")) {
          a.p(p0, "holder");
          a.p(p2, "payloads");
          super.x0(p0, p1, p2);
          this.j.x0(p0, p1, p2);
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       RecyclerView$ViewHolder viewHolder;
       LifecycleRecyclerAdapterWrapper lifecycleRec = LifecycleRecyclerAdapterWrapper.class;
       if (PatchProxy.isSupport(lifecycleRec)) {
          viewHolder = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, lifecycleRec, "1");
          if (viewHolder != PatchProxyResult.class) {
          label_002c :
             return viewHolder;
          }
       }
       a.p(p0, "parent");
       RecyclerView$ViewHolder viewHolder1 = this.j.y0(p0, p1);
       a.o(viewHolder1, "adapter.onCreateViewHolder\(parent, viewType\)");
       viewHolder = viewHolder1;
       goto label_002c ;
    }
    public void z0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifecycleRecyclerAdapterWrapper.class, "7")) {
          return;
       }
       a.p(p0, "recyclerView");
       this.destroy();
       this.j.z0(p0);
       return;
    }
}
