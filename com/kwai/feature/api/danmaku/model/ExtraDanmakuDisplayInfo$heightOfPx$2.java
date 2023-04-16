package com.kwai.feature.api.danmaku.model.ExtraDanmakuDisplayInfo$heightOfPx$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.feature.api.danmaku.model.ExtraDanmakuDisplayInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Integer;

public final class ExtraDanmakuDisplayInfo$heightOfPx$2 extends Lambda implements a	// class@000e83
{
    public final ExtraDanmakuDisplayInfo this$0;

    public void ExtraDanmakuDisplayInfo$heightOfPx$2(ExtraDanmakuDisplayInfo p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, ExtraDanmakuDisplayInfo$heightOfPx$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.c(a.b(), this.this$0.getHeight());
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
