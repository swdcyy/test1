package com.loc.ek$a;
import android.location.LocationListener;
import com.loc.ek;
import java.lang.Object;
import android.location.Location;
import java.lang.String;
import android.os.Bundle;

public final class ek$a implements LocationListener	// class@00140a
{
    public ek a;

    public void ek$a(ek p0){
       this.a = p0;
    }
    public final void a(){
       this.a = null;
    }
    public final void a(ek p0){
       this.a = p0;
    }
    public final void onLocationChanged(Location p0){
       ek$a ta = this.a;
       if (ta != null) {
          ta.a(p0);
       }
       return;
    }
    public final void onProviderDisabled(String p0){
    }
    public final void onProviderEnabled(String p0){
    }
    public final void onStatusChanged(String p0,int p1,Bundle p2){
    }
}
