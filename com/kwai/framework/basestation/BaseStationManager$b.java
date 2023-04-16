package com.kwai.framework.basestation.BaseStationManager$b;
import android.telephony.PhoneStateListener;
import com.kwai.framework.basestation.BaseStationManager$a;
import android.telephony.SignalStrength;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.lang.Math;
import com.kwai.framework.basestation.BaseStationManager$c;
import java.util.Objects;
import com.kwai.framework.basestation.BaseStationManager;
import r56.a;
import java.lang.Runnable;
import t45.c;

public class BaseStationManager$b extends PhoneStateListener	// class@0014d8
{
    public long a;

    public void BaseStationManager$b(){
       super();
       this.a = 0;
    }
    public void BaseStationManager$b(BaseStationManager$a p0){
       super();
       this.a = 0;
    }
    public void onSignalStrengthsChanged(SignalStrength p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseStationManager$b.class, "1")) {
          return;
       }
       long l = System.currentTimeMillis();
       if (Math.abs((l - this.a)) - 0x3a98 < 0) {
          return;
       }
       super.onSignalStrengthsChanged(p0);
       BaseStationManager a = BaseStationManager$c.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(p0, a, BaseStationManager.class, "3")) {
          c.a(new a(a, p0));
       }
       this.a = l;
       return;
    }
}
