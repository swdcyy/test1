package aegon.chrome.net.AndroidCellularSignalStrength$a;
import java.lang.Runnable;
import aegon.chrome.net.AndroidCellularSignalStrength;
import java.lang.Object;
import aegon.chrome.net.AndroidCellularSignalStrength$b;

public class AndroidCellularSignalStrength$a implements Runnable	// class@000180
{
    public final AndroidCellularSignalStrength b;

    public void AndroidCellularSignalStrength$a(AndroidCellularSignalStrength p0){
       this.b = p0;
       super();
    }
    public void run(){
       AndroidCellularSignalStrength$b uob = new AndroidCellularSignalStrength$b(this.b);
    }
}
