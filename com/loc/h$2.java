package com.loc.h$2;
import android.location.GpsStatus$Listener;
import com.loc.h;
import java.lang.Object;
import android.location.GpsStatus;
import android.location.LocationManager;
import java.lang.String;
import java.lang.Throwable;
import com.loc.fj;

public final class h$2 implements GpsStatus$Listener	// class@001440
{
    public final h a;

    public void h$2(h p0){
       this.a = p0;
       super();
    }
    public final void onGpsStatusChanged(int p0){
       h$2 ta = this.a;
       h b = ta.b;
       if (b == null) {
          return;
       }
       h.a(ta, b.getGpsStatus(h.b(ta)));
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 == 4) {
                   h.c(this.a);
                }
                return;
             }else {
                h.h();
                return;
             }
          }else {
             h.a(this.a);
             return;
          }
       }else {
          h.g();
          return;
       }
    }
}
