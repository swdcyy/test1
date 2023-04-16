package com.kwai.nearby.local.presenter.w$c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.nearby.local.presenter.w;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.nearby.model.NearbyPendantInfo$NearbyPendantConfig;
import com.kwai.nearby.model.AdsorptionStateConfig;

public final class w$c extends RecyclerView$r	// class@000fdc
{
    public int a;
    public final w b;

    public void w$c(w p0,int p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(w$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, w$c.class, "1")) {
          return;
       }
       w$c tb = this.b;
       p1 = tb.v + p2;
       tb.v = p1;
       if (p1 > this.a && tb.s == null) {
          tb.W8(tb.A.mAdsorptionStateConfig);
       }
       return;
    }
}
