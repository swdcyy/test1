package i0.a;
import java.lang.Runnable;
import aegon.chrome.net.a;
import java.lang.Object;
import android.telephony.TelephonyManager;
import java.util.Objects;
import aegon.chrome.base.ThreadUtils;
import aegon.chrome.net.a$a;
import android.telephony.PhoneStateListener;

public final class a implements Runnable	// class@00214c
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       TelephonyManager telephonyMan = a.b();
       if (telephonyMan != null) {
          Objects.requireNonNull(tb);
          a$a uoa = new a$a(tb);
          tb.d = uoa;
          telephonyMan.listen(uoa, 1);
       }
       return;
    }
}
