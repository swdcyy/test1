package com.kuaishou.live.lite.sidebar.LiveLiteSideBarPresenter$dataSource$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarPresenter;
import com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource;
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
import com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource$a;
import java.lang.Boolean;
import com.kuaishou.live.core.show.startup.LiveLiteSideBarConfig;
import java.util.Map;
import nsd.u;

public final class LiveLiteSideBarPresenter$dataSource$2 extends Lambda implements a	// class@000b37
{
    public final LiveLiteSideBarPresenter this$0;

    public void LiveLiteSideBarPresenter$dataSource$2(LiveLiteSideBarPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiteSideBarConfigDataSource invoke(){
       boolean b1;
       LiteSideBarConfigDataSource$a obj = PatchProxy.apply(null, this, LiveLiteSideBarPresenter$dataSource$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiteSideBarConfigDataSource.g;
       LiveLiteSideBarPresenter z = this.this$0.z;
       if (z == null) {
          a.S("infoService");
       }
       LiveStreamFeed liveStreamFe = z.j0();
       boolean b = true;
       if (liveStreamFe != null) {
          liveStreamFe = liveStreamFe.mMerchantData;
          if (liveStreamFe != null && liveStreamFe.isShopLive() == b) {
             b1 = true;
          label_0032 :
             Objects.requireNonNull(obj);
             LiteSideBarConfigDataSource$a uoa = LiteSideBarConfigDataSource$a.class;
             if (PatchProxy.isSupport(uoa)) {
                LiteSideBarConfigDataSource liteSideBarC = PatchProxy.applyOneRefs(Boolean.valueOf(b1), obj, uoa, "3");
                if (liteSideBarC != PatchProxyResult.class) {
                label_005c :
                   return liteSideBarC;
                }
             }
             LiteSideBarConfigDataSource liteSideBarC1 = new LiteSideBarConfigDataSource(b1, LiteSideBarConfigDataSource.f, obj.a(), null, 8, null);
             goto label_005c ;
          }
       }
       b1 = false;
       goto label_0032 ;
    }
    public Object invoke(){
       return this.invoke();
    }
}
