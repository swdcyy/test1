package aegon.chrome.net.AndroidCellularSignalStrength;
import java.lang.Object;
import android.os.Build$VERSION;
import android.os.HandlerThread;
import java.lang.String;
import android.os.Handler;
import android.os.Looper;
import aegon.chrome.net.AndroidCellularSignalStrength$a;
import java.lang.Runnable;

public class AndroidCellularSignalStrength	// class@000182
{
    public int a;
    public static final AndroidCellularSignalStrength b;

    static {
       AndroidCellularSignalStrength.b = new AndroidCellularSignalStrength();
    }
    public void AndroidCellularSignalStrength(){
       super();
       this.a = Integer.MIN_VALUE;
       if (Build$VERSION.SDK_INT < 23) {
          return;
       }
       HandlerThread handlerThrea = new HandlerThread("AndroidCellularSignalStrength");
       handlerThrea.start();
       new Handler(handlerThrea.getLooper()).post(new AndroidCellularSignalStrength$a(this));
       return;
    }
    public static int getSignalStrengthLevel(){
       return AndroidCellularSignalStrength.b.a;
    }
}
