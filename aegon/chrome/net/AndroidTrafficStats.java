package aegon.chrome.net.AndroidTrafficStats;
import java.lang.Object;
import android.os.Process;
import android.net.TrafficStats;

public class AndroidTrafficStats	// class@000188
{

    public void AndroidTrafficStats(){
       super();
    }
    public static long getCurrentUidRxBytes(){
       long uidRxBytes = TrafficStats.getUidRxBytes(Process.myUid());
       if (uidRxBytes - -1) {
       }else {
          uidRxBytes = 0;
       }
       return uidRxBytes;
    }
    public static long getCurrentUidTxBytes(){
       long uidTxBytes = TrafficStats.getUidTxBytes(Process.myUid());
       if (uidTxBytes - -1) {
       }else {
          uidTxBytes = 0;
       }
       return uidTxBytes;
    }
    public static long getTotalRxBytes(){
       long totalRxBytes = TrafficStats.getTotalRxBytes();
       if (totalRxBytes - -1) {
       }else {
          totalRxBytes = 0;
       }
       return totalRxBytes;
    }
    public static long getTotalTxBytes(){
       long totalTxBytes = TrafficStats.getTotalTxBytes();
       if (totalTxBytes - -1) {
       }else {
          totalTxBytes = 0;
       }
       return totalTxBytes;
    }
}
