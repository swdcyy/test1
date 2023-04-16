package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$tryInitGiftManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import or5.d;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$tryInitGiftManager$2$a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$a;
import w51.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ScrollMode;
import z1.k;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;

public final class LiveLiteGiftPresenter$tryInitGiftManager$2 extends Lambda implements a	// class@001db4
{
    public final LiveLiteGiftPresenter this$0;

    public void LiveLiteGiftPresenter$tryInitGiftManager$2(LiveLiteGiftPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveGiftBoxConfig invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveGiftBoxConfig$a obj = PatchProxy.apply(objArray, this, LiveLiteGiftPresenter$tryInitGiftManager$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = LiveGiftBoxConfig.m;
       LiveStreamFeed liveStreamFe = LiveLiteGiftPresenter.c9(this.this$0).j0();
       LiveLiteGiftPresenter$tryInitGiftManager$2$a otryInitGift = new LiveLiteGiftPresenter$tryInitGiftManager$2$a(this);
       Objects.requireNonNull(obj);
       LiveGiftBoxConfig liveGiftBoxC = PatchProxy.applyTwoRefs(liveStreamFe, otryInitGift, obj, LiveGiftBoxConfig$a.class, "2");
       if (liveGiftBoxC != patchProxyRe) {
       }else if(a.d()){
          liveGiftBoxC = new LiveGiftBoxConfig(LiveGiftBoxConfig$ScrollMode.LIST_VERTICAL, a.c(), otryInitGift);
       }else if(liveStreamFe != null){
          objArray = liveStreamFe.mLiveLiteElementsSwitch;
       }
       if (objArray != null) {
          LiveGiftBoxConfig$ScrollMode lIST_VERTICA = (objArray.mEnableGiftPanelScroll != null)? LiveGiftBoxConfig$ScrollMode.LIST_VERTICAL: LiveGiftBoxConfig$ScrollMode.PAGER_HORIZONTAL;
          liveGiftBoxC = new LiveGiftBoxConfig(lIST_VERTICA, objArray.mEnableGiftPanelSort, otryInitGift);
       }else {
          liveGiftBoxC = new LiveGiftBoxConfig(LiveGiftBoxConfig$ScrollMode.PAGER_HORIZONTAL, false, otryInitGift);
       }
       return liveGiftBoxC;
    }
    public Object invoke(){
       return this.invoke();
    }
}
