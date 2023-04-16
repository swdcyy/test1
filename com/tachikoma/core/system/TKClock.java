package com.tachikoma.core.system.TKClock;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import android.os.SystemClock;

public class TKClock extends TKBaseNativeModule	// class@000dce
{

    public void TKClock(f p0){
       super(p0);
    }
    public String currentTimeMillis(){
       Object obj = PatchProxy.apply(null, this, TKClock.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(System.currentTimeMillis());
    }
    public String elapsedRealtime(){
       Object obj = PatchProxy.apply(null, this, TKClock.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(SystemClock.elapsedRealtime());
    }
}
