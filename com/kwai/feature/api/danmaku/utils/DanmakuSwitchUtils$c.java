package com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils$c;
import erd.g;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.corona.startup.model.CoronaBarrageSetting;
import java.lang.reflect.Type;
import ni5.d;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import mm5.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Throwable;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;

public final class DanmakuSwitchUtils$c implements g	// class@000e8f
{
    public static final DanmakuSwitchUtils$c b;

    static {
       DanmakuSwitchUtils$c.b = new DanmakuSwitchUtils$c();
    }
    public void DanmakuSwitchUtils$c(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DanmakuSwitchUtils$c.class, "1")) {
       }else {
          p0 = d.a(CoronaBarrageSetting.class);
          if (p0 != null) {
             DanmakuSwitchUtils h = DanmakuSwitchUtils.h;
             boolean b = h.e();
             a.i(a.a, "DanmakuSwitchUtils", "isOpen: "+b+", danmakuSwitchNew: "+p0.mDanmakuSwitch+". "+"enableDanmakuSwitch: "+p0.mEnableDanmakuSwitch, null, null, "SyncSwitchDisposable", null, 44, null);
             if (a.g(p0.mDanmakuSwitch, Boolean.valueOf(b)) ^ 0x01) {
                int i = (!DanmakuSwitchUtils.a.getInt("Danmaku_SWITCH"+DanmakuSwitchUtils.d, 0))? 3: 2;
                h.k(b, i);
             }
          }else {
             Object[] objArray = new Object[0];
             a.e(a.a, "DanmakuSwitchUtils", "CoronaBarrageSetting is null.", null, null, "SyncSwitchDisposable", objArray, 12, null);
          }
       }
       return;
    }
}
