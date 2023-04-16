package com.kuaishou.live.materialresource.MaterialResourceManagerUpdateStrategyKt$updatingStrategy$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import android.os.SystemClock;
import com.kuaishou.live.materialresource.MaterialResourceManagerUpdateStrategyKt;

public final class MaterialResourceManagerUpdateStrategyKt$updatingStrategy$1 extends Lambda implements a	// class@000c92
{
    public static final MaterialResourceManagerUpdateStrategyKt$updatingStrategy$1 INSTANCE;

    static {
       MaterialResourceManagerUpdateStrategyKt$updatingStrategy$1.INSTANCE = new MaterialResourceManagerUpdateStrategyKt$updatingStrategy$1();
    }
    public void MaterialResourceManagerUpdateStrategyKt$updatingStrategy$1(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       long a;
       boolean b;
       Object obj = PatchProxy.apply(null, this, MaterialResourceManagerUpdateStrategyKt$updatingStrategy$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = a.t().b("liveRichTextIconResourceUpdateInterval", 0x6ddd00);
       long l1 = SystemClock.elapsedRealtime();
       a = MaterialResourceManagerUpdateStrategyKt.a;
       if (!a || (l1 - a) - l >= 0) {
          MaterialResourceManagerUpdateStrategyKt.a = l1;
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
