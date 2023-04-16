package com.loc.h$1;
import android.location.GnssStatus$Callback;
import com.loc.h;
import android.location.GnssStatus;

public final class h$1 extends GnssStatus$Callback	// class@00143f
{
    public final h a;

    public void h$1(h p0){
       this.a = p0;
       super();
    }
    public final void onFirstFix(int p0){
       h.h();
    }
    public final void onSatelliteStatusChanged(GnssStatus p0){
       h.a(this.a, p0);
    }
    public final void onStarted(){
       h.g();
    }
    public final void onStopped(){
       h.a(this.a);
    }
}
