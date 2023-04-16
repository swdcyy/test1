package com.kwai.feature.api.danmaku.DanmakuUtil$maxDanmakuBodyLength$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.corona.startup.model.CoronaBarrageSetting;
import java.lang.reflect.Type;
import ni5.d;
import java.lang.Integer;

public final class DanmakuUtil$maxDanmakuBodyLength$2 extends Lambda implements a	// class@000e70
{
    public static final DanmakuUtil$maxDanmakuBodyLength$2 INSTANCE;

    static {
       DanmakuUtil$maxDanmakuBodyLength$2.INSTANCE = new DanmakuUtil$maxDanmakuBodyLength$2();
    }
    public void DanmakuUtil$maxDanmakuBodyLength$2(){
       super(0);
    }
    public final int invoke(){
       CoronaBarrageSetting obj = PatchProxy.apply(null, this, DanmakuUtil$maxDanmakuBodyLength$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = d.a(CoronaBarrageSetting.class);
       int i = 25;
       if (obj != null) {
          obj = obj.mMaxDanmakuBodyLength;
          if (obj > null) {
             i = obj;
          }
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
