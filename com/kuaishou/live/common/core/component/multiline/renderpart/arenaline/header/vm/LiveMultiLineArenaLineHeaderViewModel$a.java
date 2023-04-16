package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.header.vm.LiveMultiLineArenaLineHeaderViewModel$a;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.util.DateUtils;

public final class LiveMultiLineArenaLineHeaderViewModel$a implements a	// class@001528
{

    public void LiveMultiLineArenaLineHeaderViewModel$a(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiLineArenaLineHeaderViewModel$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DateUtils.v(p0.longValue());
    }
}
