package com.kuaishou.live.lite.bottombar.LiveLiteBottomBarPresenter$bottomBarDataSource$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarPresenter;
import com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.model.mix.LiveMerchantFeedData;
import java.util.Objects;
import com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource$a;
import java.lang.Boolean;
import qrd.p;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiteBottomBarConfig;
import java.util.Map;
import nsd.u;

public final class LiveLiteBottomBarPresenter$bottomBarDataSource$2 extends Lambda implements a	// class@001eab
{
    public final LiveLiteBottomBarPresenter this$0;

    public void LiveLiteBottomBarPresenter$bottomBarDataSource$2(LiveLiteBottomBarPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiteBottomBarDataSource invoke(){
       boolean b;
       LiteBottomBarDataSource liteBottomBa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteBottomBarPresenter obj = PatchProxy.apply(null, this, LiveLiteBottomBarPresenter$bottomBarDataSource$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0.x;
       if (obj == null) {
          a.S("audienceInfoManager");
       }
       LiteBottomBarDataSource$a uoa = 1;
       if (obj != null) {
          LiveStreamFeed liveStreamFe = obj.j0();
          if (liveStreamFe != null) {
             liveStreamFe = liveStreamFe.mMerchantData;
             if (liveStreamFe != null && liveStreamFe.isShopLive() == uoa) {
                b = true;
             label_0032 :
                LiteBottomBarDataSource$a g = LiteBottomBarDataSource.g;
                Objects.requireNonNull(g);
                if (PatchProxy.isSupport(LiteBottomBarDataSource$a.class)) {
                   liteBottomBa = PatchProxy.applyOneRefs(Boolean.valueOf(b), g, LiteBottomBarDataSource$a.class, "3");
                   if (liteBottomBa != patchProxyRe) {
                   label_007d :
                      return liteBottomBa;
                   }
                }
                Object obj1 = PatchProxy.apply(null, g, LiteBottomBarDataSource$a.class, "2");
                if (obj1 == patchProxyRe) {
                   obj1 = LiteBottomBarDataSource.f.getValue();
                }
                Object obj2 = obj1;
                Object obj3 = PatchProxy.apply(null, g, LiteBottomBarDataSource$a.class, "1");
                LiveConfigStartupResponse$LiteBottomBarConfig liteBottomBa1 = (obj3 != patchProxyRe)? obj3: LiteBottomBarDataSource.e.getValue();
                liteBottomBa = new LiteBottomBarDataSource(obj2, liteBottomBa1, b, null, 8, null);
                goto label_007d ;
             }
          }
       }
       b = false;
       goto label_0032 ;
    }
    public Object invoke(){
       return this.invoke();
    }
}
