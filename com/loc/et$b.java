package com.loc.et$b;
import android.telephony.PhoneStateListener;
import com.loc.et;
import java.util.List;
import com.loc.ek;
import com.loc.fq;
import android.telephony.CellLocation;
import java.lang.Throwable;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

public final class et$b extends PhoneStateListener	// class@001419
{
    public final et a;

    public void et$b(et p0){
       this.a = p0;
       super();
    }
    public final void onCellInfoChanged(List p0){
       if (et.e(this.a) != null) {
          et.e(this.a).c();
       }
       if ((fq.b() - et.a(this.a)) - 500 < 0) {
          return;
       }else {
          et.a(this.a, et.c(this.a));
          this.a.a(p0);
          et.a(this.a, fq.b());
          return;
       }
    }
    public final void onCellLocationChanged(CellLocation p0){
       if ((fq.b() - et.a(this.a)) - 500 < 0) {
          return;
       }
       et.a(this.a, p0);
       this.a.a(et.d(this.a));
       et.a(this.a, fq.b());
       return;
    }
    public final void onDataConnectionStateChanged(int p0){
       super.onDataConnectionStateChanged(p0);
    }
    public final void onServiceStateChanged(ServiceState p0){
       int state = p0.getState();
       if (state) {
          if (state == 1) {
             this.a.j();
             return;
          }
       }else {
          this.a.a(false, false);
       }
       return;
    }
    public final void onSignalStrengthChanged(int p0){
       super.onSignalStrengthChanged(p0);
    }
    public final void onSignalStrengthsChanged(SignalStrength p0){
       if (p0 == null) {
          return;
       }
       et$b ta = this.a;
       ta.d = p0;
       if (et.e(ta) != null) {
          et.e(this.a).c();
       }
       return;
    }
}
