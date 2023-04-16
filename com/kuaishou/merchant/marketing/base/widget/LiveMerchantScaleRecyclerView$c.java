package com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView$c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public final class LiveMerchantScaleRecyclerView$c extends RecyclerView$r	// class@001af8
{
    public final LiveMerchantScaleRecyclerView a;

    public void LiveMerchantScaleRecyclerView$c(LiveMerchantScaleRecyclerView p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveMerchantScaleRecyclerView$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveMerchantScaleRecyclerView$c.class, "1")) {
          return;
       }
       this.a.x(p0);
       LiveMerchantScaleRecyclerView$c ta = this.a;
       ta.f = ta.f + p1;
       return;
    }
}
