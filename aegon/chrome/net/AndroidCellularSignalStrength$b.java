package aegon.chrome.net.AndroidCellularSignalStrength$b;
import aegon.chrome.base.ApplicationStatus$c;
import android.telephony.PhoneStateListener;
import aegon.chrome.net.AndroidCellularSignalStrength;
import aegon.chrome.base.ThreadUtils;
import android.content.Context;
import a0.f;
import java.lang.String;
import java.lang.Object;
import android.telephony.TelephonyManager;
import aegon.chrome.base.ApplicationStatus;
import android.telephony.SignalStrength;

public class AndroidCellularSignalStrength$b extends PhoneStateListener implements ApplicationStatus$c	// class@000181
{
    public final TelephonyManager a;
    public final AndroidCellularSignalStrength b;
    public static final boolean c;

    public void AndroidCellularSignalStrength$b(AndroidCellularSignalStrength p0){
       this.b = p0;
       super();
       TelephonyManager systemServic = f.a().getSystemService("phone");
       this.a = systemServic;
       if (systemServic.getSimState() != 5) {
          return;
       }
       ApplicationStatus.a(this);
       systemServic.listen(this, 256);
       return;
    }
    public void a(int p0){
       if (p0 == 1) {
          this.a.listen(this, 256);
       }else if(p0 == 2){
          p0.a = Integer.MIN_VALUE;
          this.a.listen(this, 0);
       }
       return;
    }
    public void onSignalStrengthsChanged(SignalStrength p0){
       try{
          this.b.a = p0.getLevel();
       }catch(java.lang.SecurityException e0){
          p0.a = Integer.MIN_VALUE;
       }
       return;
    }
}
