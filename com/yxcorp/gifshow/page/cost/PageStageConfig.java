package com.yxcorp.gifshow.page.cost.PageStageConfig;
import com.yxcorp.gifshow.page.cost.PageStageConfig$socialNearbyUseV2StageTrace$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class PageStageConfig	// class@000e15
{
    public static final p a;
    public static final PageStageConfig b;

    static {
       PageStageConfig.b = new PageStageConfig();
       PageStageConfig.a = s.c(PageStageConfig$socialNearbyUseV2StageTrace$2.INSTANCE);
    }
    public void PageStageConfig(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, PageStageConfig.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = PageStageConfig.a.getValue();
       }
       return obj.booleanValue();
    }
}
