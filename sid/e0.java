package sid.e0;
import java.lang.String;
import com.yxcorp.plugin.tencent.map.MapLocationManager;
import java.lang.Long;
import hyb.d;
import com.yxcorp.plugin.tencent.map.KwaiMapLocation;

public class e0	// class@002426
{

    public static void a(String p0){
       MapLocationManager.getInstance().enableFakeLocation(p0);
    }
    public static String b(){
       return MapLocationManager.getInstance().getEncryptLocation();
    }
    public static long c(){
       return MapLocationManager.getLastLocationDatetime().longValue();
    }
    public static d d(){
       return MapLocationManager.getInstance().getLocation();
    }
}
