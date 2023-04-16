package com.kwai.feature.api.danmaku.model.ExtraDanmakuDisplayInfo$resPath$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.danmaku.model.ExtraDanmakuDisplayInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ExtraDanmakuDisplayInfo$resPath$2 extends Lambda implements a	// class@000e84
{
    public final ExtraDanmakuDisplayInfo this$0;

    public void ExtraDanmakuDisplayInfo$resPath$2(ExtraDanmakuDisplayInfo p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ExtraDanmakuDisplayInfo$resPath$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.this$0.isValidCDNUrl()) {
          objArray = this.this$0.getWarmResPath();
       }
       return objArray;
    }
}
