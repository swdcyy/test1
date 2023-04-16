package aegon.chrome.net.a$a;
import android.telephony.PhoneStateListener;
import aegon.chrome.net.a;
import android.telephony.ServiceState;
import java.lang.Object;
import android.telephony.TelephonyManager;
import java.util.Objects;
import java.lang.String;

public class a$a extends PhoneStateListener	// class@0001a8
{
    public ServiceState a;
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onServiceStateChanged(ServiceState p0){
       a$a ta = this.a;
       if (ta == null || !ta.equals(p0)) {
          this.a = p0;
          a$a tb = this.b;
          TelephonyManager telephonyMan = a.b();
          Objects.requireNonNull(tb);
          if (telephonyMan != null) {
             tb.a = telephonyMan.getNetworkCountryIso();
             tb.b = telephonyMan.getNetworkOperator();
             tb.c = telephonyMan.getSimOperator();
          }
       }
       return;
    }
}
