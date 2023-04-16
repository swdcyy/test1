package com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingFlipperView$c;
import xz6.a;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingFlipperView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.lang.Integer;
import android.view.View;
import android.view.ViewGroup;
import com.kuaishou.merchant.api.core.model.live.shop.LiveShopComponentModel;
import zs3.i;
import at3.b;
import com.kuaishou.merchant.base.rmc.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.AdapterViewFlipper;

public class ShopItemMarketingFlipperView$c extends a	// class@001592
{
    public List b;
    public final ShopItemMarketingFlipperView c;

    public void ShopItemMarketingFlipperView$c(ShopItemMarketingFlipperView p0){
       this.c = p0;
       super();
    }
    public int getCount(){
       ShopItemMarketingFlipperView$c obj = PatchProxy.apply(null, this, ShopItemMarketingFlipperView$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       int i = (obj == null)? 0: obj.size();
       return i;
    }
    public Object getItem(int p0){
       if (PatchProxy.isSupport(ShopItemMarketingFlipperView$c.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ShopItemMarketingFlipperView$c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object obj1 = (p0 < 0 || p0 >= this.getCount())? null: this.b.get(p0);
       return obj1;
    }
    public long getItemId(int p0){
       return (long)p0;
    }
    public View getView(int p0,View p1,ViewGroup p2){
       FrameLayout uFrameLayout;
       if (PatchProxy.isSupport(ShopItemMarketingFlipperView$c.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, ShopItemMarketingFlipperView$c.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null) {
          LiveShopComponentModel item = this.getItem(p0);
          if (item != null) {
             b uob = this.c.c.k(item, new i());
             if (uob instanceof View) {
                uFrameLayout = new FrameLayout(p2.getContext());
                uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
                ViewGroup$LayoutParams layoutParams = uob.getLayoutParams();
                if (layoutParams == null) {
                   layoutParams = new FrameLayout$LayoutParams(-2, -2);
                   layoutParams.gravity = 16;
                }else {
                   layoutParams.width = -2;
                   layoutParams.height = -2;
                }
                uob.setLayoutParams(layoutParams);
                uFrameLayout.addView(uob);
             }
          }
       }
       if (uFrameLayout != null) {
          uFrameLayout.measure(0, 0);
          ViewGroup$LayoutParams layoutParams1 = this.c.b.getLayoutParams();
          layoutParams1.height = uFrameLayout.getMeasuredHeight();
          this.c.b.setLayoutParams(layoutParams1);
       }
       return uFrameLayout;
    }
}
