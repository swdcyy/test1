package com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView$a;
import androidx.recyclerview.widget.RecyclerView$i;
import com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class LiveMerchantScaleRecyclerView$a extends RecyclerView$i	// class@001af6
{
    public final LiveMerchantScaleRecyclerView a;

    public void LiveMerchantScaleRecyclerView$a(LiveMerchantScaleRecyclerView p0){
       this.a = p0;
       super();
    }
    public void h(int p0,int p1){
       if (PatchProxy.isSupport(LiveMerchantScaleRecyclerView$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveMerchantScaleRecyclerView$a.class, "1")) {
          return;
       }
       LiveMerchantScaleRecyclerView$a ta = this.a;
       ta.post(ta.g);
       return;
    }
}
