package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$tryInitGiftManager$2$a;
import z1.k;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$tryInitGiftManager$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.model.LiveGiftPanelRefreshConfig;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.userstatus.LiveLiteTimeConsumingUserStatusResponse;
import td3.o;

public final class LiveLiteGiftPresenter$tryInitGiftManager$2$a implements k	// class@001db3
{
    public final LiveLiteGiftPresenter$tryInitGiftManager$2 b;

    public void LiveLiteGiftPresenter$tryInitGiftManager$2$a(LiveLiteGiftPresenter$tryInitGiftManager$2 p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, LiveLiteGiftPresenter$tryInitGiftManager$2$a.class, "1");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          LiveLiteGiftPresenter i = this.b.this$0.I;
          if (i == null) {
             a.S("liteUserStatusManager");
          }
          LiveLiteTimeConsumingUserStatusResponse liveLiteTime = i.d0();
          if (liveLiteTime != null) {
             objArray = liveLiteTime.mLiveGiftPanelRefresh;
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
}
