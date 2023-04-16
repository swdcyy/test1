package com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$d;
import java.lang.Runnable;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter;
import java.lang.Object;
import com.kwai.library.wolverine.elements.battery.BatteryDataAdapter$d$a;

public final class BatteryDataAdapter$d implements Runnable	// class@000aa3
{
    public final BatteryDataAdapter b;

    public void BatteryDataAdapter$d(BatteryDataAdapter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       this.b.f(new BatteryDataAdapter$d$a(this));
    }
}
