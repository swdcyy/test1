package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingFlipperView$b;
import com.kuaishou.merchant.basic.widget.AdapterViewFlipper$a;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingFlipperView;
import com.kuaishou.merchant.api.core.model.live.shop.ItemMarketingComplexInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class ShopItemMarketingFlipperView$b implements AdapterViewFlipper$a	// class@001591
{
    public final ItemMarketingComplexInfo a;
    public final ShopItemMarketingFlipperView b;

    public void ShopItemMarketingFlipperView$b(ShopItemMarketingFlipperView p0,ItemMarketingComplexInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingFlipperView$b.class, "1")) {
          return;
       }
       this.b.a(this.a);
       return;
    }
    public void b(){
    }
}
