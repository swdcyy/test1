package com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils$a;
import erd.g;
import java.lang.Object;
import eda.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils$1;

public final class DanmakuSwitchUtils$a implements g	// class@000e8d
{
    public static final DanmakuSwitchUtils$a b;

    static {
       DanmakuSwitchUtils$a.b = new DanmakuSwitchUtils$a();
    }
    public void DanmakuSwitchUtils$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuSwitchUtils$a.class, "1")) {
       }else {
          DanmakuSwitchUtils$1.INSTANCE.invoke();
       }
       return;
    }
}
