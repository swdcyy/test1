package com.loc.g$a;
import android.location.LocationListener;
import com.loc.g;
import java.lang.Object;
import android.location.Location;
import java.lang.String;
import android.os.Bundle;

public final class g$a implements LocationListener	// class@00143d
{
    public g a;

    public void g$a(g p0){
       this.a = p0;
    }
    public final void a(){
       this.a = null;
    }
    public final void onLocationChanged(Location p0){
       g$a ta = this.a;
       if (ta != null) {
          g.a(ta, p0);
       }
       return;
    }
    public final void onProviderDisabled(String p0){
       g$a ta = this.a;
       if (ta != null) {
          g.a(ta);
       }
       return;
    }
    public final void onProviderEnabled(String p0){
       ("gps").equalsIgnoreCase(p0);
    }
    public final void onStatusChanged(String p0,int p1,Bundle p2){
       g$a ta = this.a;
       if (ta != null) {
          g.a(ta, p1);
       }
       return;
    }
}
