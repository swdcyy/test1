package com.loc.h$a;
import android.location.LocationListener;
import com.loc.h;
import java.lang.Object;
import android.location.Location;
import java.lang.Thread;
import java.lang.String;
import android.os.Bundle;

public final class h$a implements LocationListener	// class@001441
{
    public h a;

    public void h$a(h p0){
       this.a = p0;
    }
    public final void a(){
       this.a = null;
    }
    public final void onLocationChanged(Location p0){
       Thread.currentThread().getId();
       h$a ta = this.a;
       if (ta != null) {
          h.a(ta, p0);
       }
       return;
    }
    public final void onProviderDisabled(String p0){
       h$a ta = this.a;
       if (ta != null) {
          h.a(ta, p0);
       }
       return;
    }
    public final void onProviderEnabled(String p0){
    }
    public final void onStatusChanged(String p0,int p1,Bundle p2){
       h$a ta = this.a;
       if (ta != null) {
          h.a(ta, p1);
       }
       return;
    }
}
