package com.loc.et$a;
import android.telephony.TelephonyManager$CellInfoCallback;
import com.loc.et;
import java.util.List;
import com.loc.fq;
import android.telephony.CellLocation;
import java.lang.Throwable;
import java.lang.String;
import com.loc.fj;
import java.lang.SecurityException;

public final class et$a extends TelephonyManager$CellInfoCallback	// class@001418
{
    public final et a;

    public void et$a(et p0){
       this.a = p0;
       super();
    }
    public final void onCellInfo(List p0){
       try{
          if ((fq.b() - et.a(this.a)) - 500 < 0) {
             return;
          }
          et.b(this.a);
          et.a(this.a, et.c(this.a));
          this.a.a(p0);
          et.a(this.a, fq.b());
          return;
       }catch(java.lang.SecurityException e6){
          this.a.g = e6.getMessage();
          return;
       }
    }
}
