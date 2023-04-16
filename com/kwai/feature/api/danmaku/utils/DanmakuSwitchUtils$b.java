package com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils$b;
import erd.g;
import java.lang.Object;
import eda.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils$1;

public final class DanmakuSwitchUtils$b implements g	// class@000e8e
{
    public static final DanmakuSwitchUtils$b b;

    static {
       DanmakuSwitchUtils$b.b = new DanmakuSwitchUtils$b();
    }
    public void DanmakuSwitchUtils$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuSwitchUtils$b.class, "1")) {
       }else {
          DanmakuSwitchUtils$1.INSTANCE.invoke();
       }
       return;
    }
}
