package com.kuaishou.live.common.core.basic.arya.AryaInitializer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.arya.LiveSnowManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.basic.arya.b;

public class AryaInitializer	// class@000e6e
{

    public void AryaInitializer(){
       super();
    }
    public static void initialize(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, AryaInitializer.class, "1")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, objArray, LiveSnowManager.class, "9");
       if (obj != PatchProxyResult.class) {
          obj.booleanValue();
       }else {
          b.b().g();
       }
       return;
    }
}
