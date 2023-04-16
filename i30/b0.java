package i30.b0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import android.os.Build;
import android.content.Context;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.dfp.c.d;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import com.kuaishou.dfp.envdetect.Proxy.EngineProxy;
import org.json.JSONObject;
import java.lang.StringBuilder;
import android.telephony.TelephonyManager;
import android.net.NetworkInfo;
import com.kwai.performance.fluency.ipcproxy.lib.b;

public class b0	// class@00178c
{
    public static String a = "";

    public void b0(){
       super();
    }
    public static boolean A(){
       Object obj = PatchProxy.apply(null, null, b0.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (Build$VERSION.SDK_INT >= 26) {
          b = true;
       }
       return b;
    }
    public static String B(){
       Object obj = PatchProxy.apply(null, null, b0.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.TAGS);
    }
    public static String C(){
       Object obj = PatchProxy.apply(null, null, b0.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.TYPE);
    }
    public static String D(){
       Object obj = PatchProxy.apply(null, null, b0.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.USER);
    }
    public static String E(){
       Object obj = PatchProxy.apply(null, null, b0.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.f("/sys/devices/virtual/misc/cpu_dma_latency/uevent");
    }
    public static String F(){
       Object obj = PatchProxy.apply(null, null, b0.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.f("/proc/sys/net/ipv4/tcp_syncookies");
    }
    public static String a(){
       Object obj = PatchProxy.apply(null, null, b0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.BOARD);
    }
    public static synchronized String b(Context p0,String p1){
       _monitor_enter(b0.class);
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b0.class, "15");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(b0.class);
          return obj;
       }else if(!TextUtils.isEmpty(b0.a) && !(b0.a).startsWith("KWE")){
          _monitor_exit(b0.class);
          return b0.a;
       }else if(!TextUtils.isEmpty(p1) && (!p1.startsWith("KWE") && !p1.equals("unknown"))){
          b0.a = p1;
          _monitor_exit(b0.class);
          return p1;
       }else if(!b0.A()){
          p1 = b0.z();
          b0.a = p1;
          if (!TextUtils.isEmpty(p1)) {
             _monitor_exit(b0.class);
             return b0.a;
          }
       }
       p1 = Build.SERIAL;
       if (!TextUtils.isEmpty(p1) && !p1.equals("unknown")) {
          b0.a = p1;
          _monitor_exit(b0.class);
          return p1;
       }else {
          String[] stringArray = new String[]{"android.permission.READ_PHONE_STATE"};
          if (d.j(p0, stringArray)) {
             String serial = Build.getSerial();
             if (!TextUtils.isEmpty(serial) && !serial.equals("unknown")) {
                b0.a = serial;
                _monitor_exit(b0.class);
                return serial;
             }else {
                _monitor_exit(b0.class);
                return b0.a;
             }
          }else {
             _monitor_exit(b0.class);
             return "KWE_PN";
          }
       }
    }
    public static String c(String p0){
       BufferedReader uBufferedRea;
       File obj = PatchProxy.applyOneRefs(p0, null, b0.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(p0);
       if (obj.exists()) {
          uBufferedRea = new BufferedReader(new FileReader(obj));
          String str = uBufferedRea.readLine();
          if (!TextUtils.isEmpty(str)) {
             uBufferedRea.close();
             return str.trim();
          }
       }else {
          uBufferedRea = null;
       }
       if (uBufferedRea != null) {
          uBufferedRea.close();
       }
       return null;
    }
    public static String d(){
       Object obj = PatchProxy.apply(null, null, b0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.BOOTLOADER);
    }
    public static synchronized String e(Context p0){
       String[] stringArray;
       String serial;
       _monitor_enter(b0.class);
       JSONObject jSONObject = null;
       String obj = PatchProxy.applyOneRefs(p0, jSONObject, b0.class, "16");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(b0.class);
          return obj;
       }else if(!TextUtils.isEmpty(b0.a)){
          _monitor_exit(b0.class);
          return b0.a;
       }else if(!b0.A()){
          obj = b0.z();
          b0.a = obj;
          if (!TextUtils.isEmpty(obj)) {
             _monitor_exit(b0.class);
             return b0.a;
          }
       }
       obj = EngineProxy.getInstance(p0).bqp();
       if (!TextUtils.isEmpty(obj)) {
          try{
             jSONObject = new JSONObject(obj.trim());
          }catch(org.json.JSONException e0){
          }
       }
    }
    public static String f(String p0){
       File obj = PatchProxy.applyOneRefs(p0, null, b0.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(p0);
       if (!obj.exists()) {
          return "notExist";
       }
       if (!obj.isFile()) {
          return "isContent";
       }
       p0 = "";
       BufferedReader uBufferedRea = new BufferedReader(new FileReader(obj));
       String str = uBufferedRea.readLine();
       while (str != null) {
          p0 = p0+str;
       }
       p0 = b0.h(p0);
       try{
          uBufferedRea.close();
          return p0;
       }catch(java.io.IOException e0){
       }
    }
    public static String g(){
       Object obj = PatchProxy.apply(null, null, b0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.BRAND);
    }
    public static String h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b0.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return "KWE_N";
       }
       return (p0.replace("=", "")).replace("&", "");
    }
    public static String i(){
       Object obj = PatchProxy.apply(null, null, b0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.CPU_ABI+","+Build.CPU_ABI2);
    }
    public static String j(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b0.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String networkCount = p0.getSystemService("phone").getNetworkCountryIso();
       if (!TextUtils.isEmpty(networkCount)) {
          return b0.h(networkCount);
       }
       return "KWE_N";
    }
    public static String k(){
       return Build.DEVICE;
    }
    public static String l(Context p0){
       String[] obj = PatchProxy.applyOneRefs(p0, null, b0.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"android.permission.ACCESS_NETWORK_STATE"};
       if (!d.j(p0, obj)) {
          return "KWE_PN";
       }
       NetworkInfo networkInfo = b.c();
       if (networkInfo == null || !networkInfo.isConnected()) {
          return "KWE_OTHER";
       }
       if (networkInfo.getType() == 1) {
          return "WiFi";
       }
       return "Mobile Network";
    }
    public static String m(){
       Object obj = PatchProxy.apply(null, null, b0.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.DISPLAY);
    }
    public static String n(Context p0){
       p0 = PatchProxy.applyOneRefs(p0, null, b0.class, "26");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       String str = b.l();
       if (!TextUtils.isEmpty(str)) {
          return str;
       }
       return "KWE_N";
    }
    public static String o(){
       Object obj = PatchProxy.apply(null, null, b0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.FINGERPRINT);
    }
    public static String p(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b0.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TelephonyManager systemServic = p0.getSystemService("phone");
       if (systemServic.getSimState() == 5) {
          String str = systemServic.getPhoneType()+"";
          if (!TextUtils.isEmpty(str)) {
             return str;
          }
       }
       return "KWE_N";
    }
    public static String q(){
       Object obj = PatchProxy.apply(null, null, b0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.HARDWARE);
    }
    public static String r(Context p0){
       p0 = PatchProxy.applyOneRefs(p0, null, b0.class, "28");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       String str = b.p();
       if (TextUtils.isEmpty(str)) {
          str = "KWE_N";
       }
       return str;
    }
    public static String s(){
       Object obj = PatchProxy.apply(null, null, b0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.HOST);
    }
    public static String t(){
       Object obj = PatchProxy.apply(null, null, b0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.ID);
    }
    public static String u(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b0.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int simState = p0.getSystemService("phone").getSimState();
       obj = 1;
       if (!simState || simState == obj) {
          obj = 0;
       }
       if (obj) {
          return "exsist";
       }else {
          return "noexsist";
       }
    }
    public static String v(){
       Object obj = PatchProxy.apply(null, null, b0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.MANUFACTURER);
    }
    public static String w(){
       Object obj = PatchProxy.apply(null, null, b0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.MODEL);
    }
    public static String x(){
       Object obj = PatchProxy.apply(null, null, b0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.PRODUCT);
    }
    public static String y(){
       Object obj = PatchProxy.apply(null, null, b0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.h(Build.RADIO);
    }
    public static String z(){
       Object obj = PatchProxy.apply(null, null, b0.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.c("/sys/class/android_usb/android0/iSerial");
    }
}
