package at3.d;
import erd.r;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextStyle;
import java.lang.Object;
import java.lang.Integer;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingCombView;

public final class d implements r	// class@0002c0
{
    public final ShopItemMarketingComponentTextStyle b;

    public void d(ShopItemMarketingComponentTextStyle p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       boolean b = (this.b.getMSweepLightCount() > 0)? true: false;
       return b;
    }
}
