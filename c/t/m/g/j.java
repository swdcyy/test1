package c.t.m.g.j;
import c.t.m.g.a;
import c.t.m.g.aq;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.HashMap;
import java.lang.Object;

public class j	// class@000c99
{
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = true;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    public static c i;
    public static final a j;
    public static aq k;

    static {
       j.j = new a();
       j.k = aq.a;
    }
    public static final int a(String p0){
       if (p0.startsWith("fc4") || p0.startsWith("dc4")) {
          return 4;
       }
       if (p0.startsWith("fc3") || p0.startsWith("dc3")) {
          return 3;
       }
       if (p0.startsWith("fc2") || p0.startsWith("dc2")) {
          return 2;
       }
       if (!p0.startsWith("fc1") && (p0.startsWith("fc") || p0.startsWith("dc"))) {
          return 1;
       }
       return -1;
    }
    public static final String a(){
       return "fc4.";
    }
    public static final String a(int p0){
       String str;
       if (j.a) {
          str = "";
          String str1 = (j.h)? "https://lstest.map.qq.com/nlpdr?sf": "https://nlp.map.qq.com/?sf";
          return str+str1+p0;
       }else if(j.h){
          str = "https://testdatalbs.sparta.html5.qq.com/tr?sf";
       }else {
          str = "https://analytics.map.qq.com/?sf";
       }
       int i = 1;
       if (p0 > i) {
          str = str+p0;
       }else if(p0 == i){
          return "";
       }
       return str;
    }
    public static HashMap b(){
       HashMap hashMap = new HashMap();
       hashMap.put("D_CH_ID", "fc_sdk");
       hashMap.put("D_FC_SRC", "209");
       hashMap.put("D_UP_INTERVAL", "1800000");
       hashMap.put("D_UP_USE_HTTPS", "true");
       hashMap.put("D_MAX_1F_SIZE", "102400");
       hashMap.put("D_NUM_UP", "1");
       hashMap.put("D_MAX_BUF_WF", "25600");
       hashMap.put("D_MAX_FOLDER_SIZE", "104857600");
       hashMap.put("D_MAX_DAY_RENAME", "3");
       hashMap.put("D_MAX_DAY_DELETE", "30");
       hashMap.put("D_MAX_SIZE_UP_1DAY", "10485760");
       hashMap.put("D_UP_NET", "w");
       hashMap.put("D_POS_COLL", "false");
       hashMap.put("D_WRITE_MAC", "false");
       hashMap.put("D_UP_WF_INFO", "true");
       hashMap.put("D_UP_U_TRACK_INFO", "false");
       hashMap.put("D_UP_GPS_FOR_NAVI", "false");
       return hashMap;
    }
}
