package og7.a;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import com.google.gson.Gson;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfigAdv;
import com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfig;
import zk.d;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrConfigTypeAdapterFactory;
import zk.j;

public class a	// class@002021
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static Gson d;

    static {
       a.a = new int[9]{1,4,8,16,32,'@',128,256,512};
       int[] ointArray = new int[]{1};
       a.b = ointArray;
       a.c = new int[16]{8,16,32,'0','@','P','`',128,160,192,224,256,320,384,448,512};
    }
    public static Object a(String p0,Class p1){
       boolean b = ("{}").equals(p0);
       if (p1 == AnrMonitorConfig.class) {
          boolean b1 = ("{\"isRemoveInvalidSyncBarrier\":false}").equals(p0);
          Gson gson = (!b && (("{\"disable\":true}").equals(p0) || b1))? 1: null;
          if (!gson) {
             return a.b().h(p0, p1);
          }else {
             AnrMonitorConfig uAnrMonitorC = new AnrMonitorConfig();
             uAnrMonitorC.disable = true;
             if (b1) {
                uAnrMonitorC.isRemoveInvalidSyncBarrier = false;
             }
             return uAnrMonitorC;
          }
       }else if(p1 == AnrMonitorConfigAdv.class){
          if (!b) {
             return a.b().h(p0, p1);
          }
          return new AnrMonitorConfigAdv();
       }else if(p1 == AsyncScheduleConfig.class){
          if (b) {
             return AsyncScheduleConfig.createDefaultConfig();
          }
          if (("{\"enableServiceSchedule\":true,\"enableReceiverSchedule\":true,\"enableTrimMemorySchedule\":true,\"enableBgLockResMgrSchedule\":true,\"serviceBlackList\":[\"com.mini.app.service.MiniAppServiceM\",\"com.kuaishou.live.core.show.screenrecord.LiveScreenRecordForegroundService\",\"com.kwai.component.misc.wallpaper.VideoWallpaperService\"]}").equals(p0)) {
             return AsyncScheduleConfig.createDefaultConfig();
          }
          return a.b().h(p0, p1);
       }else {
          return a.b().h(p0, p1);
       }
    }
    public static Gson b(){
       if (a.d == null) {
          d uod = new d();
          uod.g(new AnrConfigTypeAdapterFactory());
          a.d = uod.b();
       }
       return a.d;
    }
}
