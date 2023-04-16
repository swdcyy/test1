package com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil$enableBubbleDodgeTeenagerDialog$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class NasaSlidePlayExperimentUtil$enableBubbleDodgeTeenagerDialog$2 extends Lambda implements a	// class@000be1
{
    public static final NasaSlidePlayExperimentUtil$enableBubbleDodgeTeenagerDialog$2 INSTANCE;

    static {
       NasaSlidePlayExperimentUtil$enableBubbleDodgeTeenagerDialog$2.INSTANCE = new NasaSlidePlayExperimentUtil$enableBubbleDodgeTeenagerDialog$2();
    }
    public void NasaSlidePlayExperimentUtil$enableBubbleDodgeTeenagerDialog$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaSlidePlayExperimentUtil$enableBubbleDodgeTeenagerDialog$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("dodge_bubble");
    }
}
