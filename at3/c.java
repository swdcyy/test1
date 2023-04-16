package at3.c;
import erd.g;
import com.kuaishou.merchant.base.rmc.widget.ShopItemMarketingCombView;
import com.kuaishou.merchant.api.core.model.live.shop.ShopItemMarketingComponentTextStyle;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import com.kuaishou.live.widget.LivePkShimmerLayout;

public final class c implements g	// class@0002bf
{
    public final ShopItemMarketingCombView b;
    public final ShopItemMarketingComponentTextStyle c;

    public void c(ShopItemMarketingCombView p0,ShopItemMarketingComponentTextStyle p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       tc.setMSweepLightCount((tc.getMSweepLightCount() - 1));
       long sweepLightDu = tc.getSweepLightDurationMillis();
       if (!sweepLightDu) {
          sweepLightDu = 1500;
       }
       tb.m(sweepLightDu);
       return;
    }
}
