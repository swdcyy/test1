package c.t.m.g.ei;
import java.util.HashMap;
import java.lang.Object;

public class ei	// class@000c6b
{

    public static HashMap a(){
       HashMap hashMap = new HashMap();
       hashMap.put("https", "true");
       hashMap.put("up_apps", "true");
       hashMap.put("start_daemon", "false");
       hashMap.put("up_daemon_delay", "300000");
       hashMap.put("gps_kalman", "false");
       hashMap.put("callback_wifis", "false");
       hashMap.put("min_wifi_scan_interval", "8000");
       hashMap.put("collect_bles", "true");
       hashMap.put("start_event_track", "true");
       hashMap.put("f_coll_item", "2");
       hashMap.put("f_coll_up_net", "w");
       hashMap.put("enable_wifi_native_sort", "true");
       hashMap.put("enable_invoke_map", "false");
       hashMap.put("deny_secret_info", "false");
       return hashMap;
    }
}
