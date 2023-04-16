package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingFlipperView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingFlipperView;
import com.kuaishou.merchant.api.core.model.live.shop.ItemMarketingComplexInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.AdapterViewFlipper;

public class ShopItemMarketingFlipperView$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@001590
{
    public final ItemMarketingComplexInfo b;
    public final ShopItemMarketingFlipperView c;

    public void ShopItemMarketingFlipperView$a(ShopItemMarketingFlipperView p0,ItemMarketingComplexInfo p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, ShopItemMarketingFlipperView$a.class, "1")) {
          return;
       }
       this.c.a(this.b);
       this.c.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
