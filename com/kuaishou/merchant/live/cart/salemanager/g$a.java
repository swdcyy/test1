package com.kuaishou.merchant.live.cart.salemanager.g$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.merchant.live.cart.salemanager.g;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import com.yxcorp.gifshow.fragment.f;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;

public class g$a extends RecyclerView$r	// class@0019dc
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(g$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g$a.class, "1")) {
          return;
       }
       View view = this.a.v();
       p1 = (this.a.g.h0().canScrollVertically(-1))? 0: 8;
       view.setVisibility(p1);
       return;
    }
}
