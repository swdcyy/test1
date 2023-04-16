package com.yxcorp.gifshow.powermode.PowerModeHelper$a;
import android.os.PowerManager$OnThermalStatusChangedListener;
import com.yxcorp.gifshow.powermode.PowerModeHelper;
import java.lang.Object;
import com.yxcorp.gifshow.powermode.PowerModeHelper$KSDeviceThermalState;

public class PowerModeHelper$a implements PowerManager$OnThermalStatusChangedListener	// class@0012d6
{
    public final PowerModeHelper a;

    public void PowerModeHelper$a(PowerModeHelper p0){
       this.a = p0;
       super();
    }
    public void onThermalStatusChanged(int p0){
       switch (p0){
           case 1:
             p0.a = PowerModeHelper$KSDeviceThermalState.FAIR;
             break;
           case 2:
             p0.a = PowerModeHelper$KSDeviceThermalState.MODERATE;
             break;
           case 3:
             p0.a = PowerModeHelper$KSDeviceThermalState.SERIOUS;
             break;
           case 4:
             p0.a = PowerModeHelper$KSDeviceThermalState.CRITICAL;
             break;
           case 5:
             p0.a = PowerModeHelper$KSDeviceThermalState.EMERGENCY;
             break;
           case 6:
             p0.a = PowerModeHelper$KSDeviceThermalState.SHUTDOWN;
             break;
           default:
             p0.a = PowerModeHelper$KSDeviceThermalState.NOMINAL;
       }
       return;
    }
}
