package com.kwai.video.stannis.audio.support.LocalHeadphoneMonitor;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import android.os.Build;
import java.lang.Number;
import java.lang.Boolean;
import com.kwai.video.stannis.utils.Log;
import java.lang.Integer;

public class LocalHeadphoneMonitor	// class@000c45
{
    public int bufferSize;
    public int deviceType;
    public int roundTripLatency;
    public static int defaultBufferSize;
    public static int defaultRoundTripLatency;
    public static boolean enableTest;
    public static Map supportsMap;

    static {
       HashMap hashMap = new HashMap();
       LocalHeadphoneMonitor.supportsMap = hashMap;
       LocalHeadphoneMonitor.defaultBufferSize = 4096;
       LocalHeadphoneMonitor.defaultRoundTripLatency = 80;
       hashMap.put("XIAOMI~MI 8", new LocalHeadphoneMonitor(1, 4096, 80));
       LocalHeadphoneMonitor.supportsMap.put("XIAOMI~MIX 2", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put(("OPPO~OPPO A57").toUpperCase(), new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PBAM00", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~OPPO R11st", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PAAM00", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PCAM10", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PBEM00", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PCAM00", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PDPM00", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PADM00", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PCNM00", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PBCM30", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PCLM10", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PDNM00", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PDEM10", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       LocalHeadphoneMonitor.supportsMap.put("OPPO~PDSM00", new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
    }
    public void LocalHeadphoneMonitor(int p0,int p1,int p2){
       super();
       this.deviceType = p0;
       this.bufferSize = p1;
       this.roundTripLatency = p2;
    }
    public static void addConfig(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, LocalHeadphoneMonitor.class, "7")) {
          return;
       }
       LocalHeadphoneMonitor.supportsMap.put(p0+"~"+p1, new LocalHeadphoneMonitor(1, LocalHeadphoneMonitor.defaultBufferSize, LocalHeadphoneMonitor.defaultRoundTripLatency));
       return;
    }
    public static String configKey(){
       Object obj = PatchProxy.apply(null, null, LocalHeadphoneMonitor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return (Build.MANUFACTURER+"~"+Build.MODEL).toUpperCase();
    }
    public static void enableTestConfig(boolean p0){
       LocalHeadphoneMonitor.enableTest = p0;
    }
    public static int getBufferSize(){
       LocalHeadphoneMonitor obj = PatchProxy.apply(null, null, LocalHeadphoneMonitor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = LocalHeadphoneMonitor.supportsMap.get(LocalHeadphoneMonitor.configKey());
       if (obj == null) {
          return LocalHeadphoneMonitor.defaultBufferSize;
       }
       return obj.bufferSize;
    }
    public static int getDeviceType(){
       LocalHeadphoneMonitor obj = PatchProxy.apply(null, null, LocalHeadphoneMonitor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = LocalHeadphoneMonitor.supportsMap.get(LocalHeadphoneMonitor.configKey());
       if (obj == null) {
          return 1;
       }
       return obj.deviceType;
    }
    public static int getRoundTripLatency(){
       LocalHeadphoneMonitor obj = PatchProxy.apply(null, null, LocalHeadphoneMonitor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = LocalHeadphoneMonitor.supportsMap.get(LocalHeadphoneMonitor.configKey());
       if (obj == null) {
          return LocalHeadphoneMonitor.defaultRoundTripLatency;
       }
       return obj.roundTripLatency;
    }
    public static boolean isLocalHeadphoneSupport(){
       Object obj = PatchProxy.apply(null, null, LocalHeadphoneMonitor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (LocalHeadphoneMonitor.enableTest) {
          Log.i("LocalHeadphoneMonitor", "[LocalHeadphoneMonitor] isLocalHeadphoneSupport debug enable. Key:["+LocalHeadphoneMonitor.configKey()+"]");
          return true;
       }else if(LocalHeadphoneMonitor.supportsMap.containsKey(LocalHeadphoneMonitor.configKey())){
          return true;
       }else {
          return false;
       }
    }
    public static void setTestConfig(int p0,int p1){
       LocalHeadphoneMonitor localHeadpho = LocalHeadphoneMonitor.class;
       if (PatchProxy.isSupport(localHeadpho) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, localHeadpho, "6")) {
          return;
       }
       if (LocalHeadphoneMonitor.enableTest) {
          LocalHeadphoneMonitor.supportsMap.put(LocalHeadphoneMonitor.configKey(), new LocalHeadphoneMonitor(1, p0, p1));
       }
       return;
    }
}
