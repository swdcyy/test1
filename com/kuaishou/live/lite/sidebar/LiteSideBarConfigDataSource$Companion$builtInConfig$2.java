package com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource$Companion$builtInConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.show.startup.LiveLiteSideBarConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fd3.a;
import java.util.Objects;
import fg6.a;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;

public final class LiteSideBarConfigDataSource$Companion$builtInConfig$2 extends Lambda implements a	// class@000b1d
{
    public static final LiteSideBarConfigDataSource$Companion$builtInConfig$2 INSTANCE;

    static {
       LiteSideBarConfigDataSource$Companion$builtInConfig$2.INSTANCE = new LiteSideBarConfigDataSource$Companion$builtInConfig$2();
    }
    public void LiteSideBarConfigDataSource$Companion$builtInConfig$2(){
       super(0);
    }
    public final LiveLiteSideBarConfig invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, LiteSideBarConfigDataSource$Companion$builtInConfig$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = a.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, a.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          Object obj2 = a.a.h("{\"liteSidebarItemTypeConfig\":{\"0\":\"UNKNOWN_LITE_SIDEBAR_ITEM\",\"1\":\"LITE_SIDEBAR_AVATAR\",\"2\":\"LITE_SIDEBAR_LIKE\",\"3\":\"LITE_SIDEBAR_GIFT\",\"4\":\"LITE_SIDEBAR_SHARE\",\"5\":\"LITE_SIDEBAR_ENTER\",\"6\":\"LITE_SIDEBAR_QUICK_GIFT\",\"7\":\"LITE_SIDEBAR_SHOP_CAR\"},\"orderList\":[\"1\",\"2\",\"6\",\"3\",\"4\",\"5\"],\"shopLiveOrderList\":[\"1\",\"2\",\"6\",\"7\",\"3\",\"4\",\"5\"],\"liteSidebarItemConfig\":{\"1\":{\"text\":\"\",\"backgroundColor\":null,\"bottomBackgroundColor\":null,\"iconUrl\":null,\"bottomIconUrl\":null,\"selectedIconUrl\":null,\"lottieAnimationUrl\":null,\"lottieAnimationBottomUrl\":null,\"lockIconUrl\":null,\"lockBottomIconUrl\":null},\"2\":{\"text\":\"点赞\",\"backgroundColor\":null,\"bottomBackgroundColor\":null,\"iconUrl\":[{\"cdn\":\"https://p1-live.a.yximgs.com\",\"url\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/zan.png\"}],\"bottomIconUrl\":null,\"selectedIconUrl\":[{\"cdn\":\"https://p1-live.a.yximgs.com\",\"url\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/selectedZan.png\"}],\"lottieAnimationUrl\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/zanLottieV2.json\",\"lottieAnimationBottomUrl\":null,\"lockIconUrl\":null,\"lockBottomIconUrl\":null},\"3\":{\"text\":\"去送礼\",\"backgroundColor\":null,\"bottomBackgroundColor\":\"#1AFFFFFF\",\"iconUrl\":[{\"cdn\":\"https://p1-live.a.yximgs.com\",\"url\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/gift.png\"}],\"bottomIconUrl\":[{\"cdn\":\"https://p1-live.a.yximgs.com\",\"url\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/giftBottomBar.png\"}],\"selectedIconUrl\":null,\"lottieAnimationUrl\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/giftEntranceLottieWhite.json\",\"lottieAnimationBottomUrl\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/bottomGiftEntranceLottie.json\",\"lockIconUrl\":[{\"cdn\":\"https://p1-live.a.yximgs.com\",\"url\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/childLock.png\"}]
    ,\"lockBottomIconUrl\":[{\"cdn\":\"https://p1-live.a.yximgs.com\",\"url\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/childLockBottom.png\"}]},\"4\":{\"text\":\"分享\",\"backgroundColor\":null,\"bottomBackgroundColor\":\"#1AFFFFFF\",\"iconUrl\":[{\"cdn\":\"https://p1-live.a.yximgs.com\",\"url\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/share.png\"}],\"bottomIconUrl\":[{\"cdn\":\"https://p1-live.a.yximgs.com\",\"url\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/shareBottomBar.png\"}],\"selectedIconUrl\":null,\"lottieAnimationUrl\":null,\"lottieAnimationBottomUrl\":null,\"lockIconUrl\":null,\"lockBottomIconUrl\":null},\"5\":{\"text\":\"进入\",\"backgroundColor\":null,\"bottomBackgroundColor\":\"#1AFFFFFF\",\"iconUrl\":[{\"cdn\":\"https://p1-live.a.yximgs.com\",\"url\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/enter.png\"}],\"bottomIconUrl\":[{\"cdn\":\"https://p1-live.a.yximgs.com\",\"url\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/enterBottomBar.png\"}],\"selectedIconUrl\":null,\"lottieAnimationUrl\":null,\"lottieAnimationBottomUrl\":null,\"lockIconUrl\":null,\"lockBottomIconUrl\":null},\"6\":{\"text\":\"支持ta\",\"backgroundColor\":\"#E5FFFFFF\",\"bottomBackgroundColor\":\"#E5FFFFFF\",\"iconUrl\":null,\"bottomIconUrl\":null,\"selectedIconUrl\":null,\"lottieAnimationUrl\":null,\"lottieAnimationBottomUrl\":null,\"lockIconUrl\":null,\"lockBottomIconUrl\":null},\"7\":{\"text\":\"购物\",\"backgroundColor\":null,\"bottomBackgroundColor\":null,\"iconUrl\":null,\"bottomIconUrl\":null,\"selectedIconUrl\":null,\"lottieAnimationUrl\":\"https://p1-live.a.yximgs.com/kos/nlav10954/lite/sidebar/slideBarShopCar.json\",\"lottieAnimationBottomUrl\":null,\"lockIconUrl\":null,\"lockBottomIconUrl\":null},\"8\":{\"iconPath\":\"\",\"text\":\"鼓励ta\",\"backgroundColor\":\"#E5FFFFFF\",\"bottomBackgroundColor\":\"#E5FFFFFF\"},\"9\":{\"iconPath\":\"\",\"text\":\"加人气\",\"backgroundColor\":\"#E5FFFFFF\",\"bottomBackgroundColor\":\"#E5FFFFFF\"}}}"
    , LiveLiteSideBarConfig.class);
          a.o(obj2, "Gsons.KWAI_GSON.fromJson…ideBarConfig::class.java\)");
          obj1 = obj2;
       }
       return obj1;
    }
    public Object invoke(){
       return this.invoke();
    }
}
