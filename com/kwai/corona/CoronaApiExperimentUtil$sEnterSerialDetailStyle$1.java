package com.kwai.corona.CoronaApiExperimentUtil$sEnterSerialDetailStyle$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xf6.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class CoronaApiExperimentUtil$sEnterSerialDetailStyle$1 extends Lambda implements a	// class@000ce1
{
    public static final CoronaApiExperimentUtil$sEnterSerialDetailStyle$1 INSTANCE;

    static {
       CoronaApiExperimentUtil$sEnterSerialDetailStyle$1.INSTANCE = new CoronaApiExperimentUtil$sEnterSerialDetailStyle$1();
    }
    public void CoronaApiExperimentUtil$sEnterSerialDetailStyle$1(){
       super(0);
    }
    public final int invoke(){
       String obj = PatchProxy.apply(null, this, CoronaApiExperimentUtil$sEnterSerialDetailStyle$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = "enterAudioPlayerSerial";
       int i = b.b(obj);
       int i1 = 1;
       if (i == i1) {
          return 0;
       }
       if (i == 2) {
          return i1;
       }
       if (i != 3) {
          return a.t().a(obj, 0);
       }
       return 2;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
