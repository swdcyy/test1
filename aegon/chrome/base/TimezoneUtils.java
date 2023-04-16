package aegon.chrome.base.TimezoneUtils;
import java.lang.Object;
import java.lang.String;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import java.util.TimeZone;

public class TimezoneUtils	// class@000154
{

    public void TimezoneUtils(){
       super();
    }
    public static String getDefaultTimeZoneId(){
       StrictMode.setThreadPolicy(StrictMode.allowThreadDiskReads());
       return TimeZone.getDefault().getID();
    }
}
