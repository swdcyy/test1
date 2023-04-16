package com.kuaishou.merchant.live.cart.onsale.audience.area.tab.LiveAudienceCommodityFragment$a;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.kuaishou.merchant.live.cart.onsale.audience.area.tab.LiveAudienceCommodityFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.a;
import com.kuaishou.merchant.live.cart.onsale.audience.model.ComponentInfo;

public class LiveAudienceCommodityFragment$a extends GridLayoutManager$b	// class@001923
{
    public final LiveAudienceCommodityFragment e;

    public void LiveAudienceCommodityFragment$a(LiveAudienceCommodityFragment p0){
       this.e = p0;
       super();
    }
    public int f(int p0){
       LiveAudienceCommodityFragment$a uoa = LiveAudienceCommodityFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Object obj1 = this.e.g7().N0(p0);
       if (obj1 instanceof ComponentInfo && obj1.getSpan() == 1) {
          return 2;
       }else {
          return 1;
       }
    }
}
