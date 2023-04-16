package com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils$d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mm5.a;
import com.yxcorp.gifshow.entity.QPhoto;

public final class DanmakuSwitchUtils$d implements g	// class@000e90
{
    public static final DanmakuSwitchUtils$d b;

    static {
       DanmakuSwitchUtils$d.b = new DanmakuSwitchUtils$d();
    }
    public void DanmakuSwitchUtils$d(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuSwitchUtils$d.class, "1")) {
       }else {
          a a = a.a;
          p0 = p0.getMessage();
          if (p0 == null) {
             p0 = "updateDanmakuSwitch error";
          }
          Object[] objArray = new Object[0];
          a.e(a, "DanmakuSwitchUtils", p0, null, null, "syncSwitch", objArray, 12, null);
       }
       return;
    }
}
