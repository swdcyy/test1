package com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaItemType$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaItemType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;

public final class LiveLiteQuickInteractiveAreaItemType$a	// class@000ac3
{

    public void LiveLiteQuickInteractiveAreaItemType$a(){
       super();
    }
    public void LiveLiteQuickInteractiveAreaItemType$a(u p0){
       super();
    }
    public final LiveLiteQuickInteractiveAreaItemType a(int p0){
       LiveLiteQuickInteractiveAreaItemType$a uoa = LiveLiteQuickInteractiveAreaItemType$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return LiveLiteQuickInteractiveAreaItemType.mapping.get(Integer.valueOf(p0));
    }
}
