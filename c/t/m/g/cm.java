package c.t.m.g.cm;
import android.os.PowerManager$WakeLock;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import android.os.PowerManager;

public abstract class cm	// class@000c17
{
    public static PowerManager$WakeLock a;

    public static void a(){
       PowerManager$WakeLock a = cm.a;
       if (a != null && a.isHeld()) {
          cm.a.release();
       }
       cm.a = null;
       return;
    }
    public static void a(Context p0){
       PowerManager$WakeLock a = cm.a;
       if (a != null && a.isHeld()) {
          cm.a.release();
       }
       PowerManager$WakeLock wakeLock = p0.getSystemService("power").newWakeLock(1, "WakeLocker");
       cm.a = wakeLock;
       wakeLock.acquire(5000);
       return;
    }
}
