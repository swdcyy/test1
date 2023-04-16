package com.kwai.video.devicepersona.hardware.DPHardwareUtils;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.reflect.Method;
import java.lang.Number;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.CharSequence;
import java.lang.Long;
import java.io.IOException;

public class DPHardwareUtils	// class@001b39
{

    public void DPHardwareUtils(){
       super();
    }
    public static Map getAzerothRequestParam(){
       HashMap obj = PatchProxy.apply(null, null, DPHardwareUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("boardPlatform", DPHardwareUtils.getBoardPlatform());
       obj.put("memoryTotalSize", String.valueOf((DPHardwareUtils.getRamTotalSize() >> 20)));
       return obj;
    }
    public static String getBoardPlatform(){
       String str = String.class;
       String obj = PatchProxy.apply(null, null, DPHardwareUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "unknown";
       try{
          Class uClass = Class.forName("android.os.SystemProperties");
          Class[] uClassArray = new Class[]{str,str};
          Object[] objArray = new Object[]{"ro.board.platform",obj};
          obj = uClass.getMethod("get", uClassArray).invoke(uClass, objArray);
          return obj;
       }catch(java.lang.Exception e0){
       }
    }
    public static long getRamTotalSize(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, objArray, DPHardwareUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       try{
          BufferedReader uBufferedRea = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
          try{
             while (true) {
                obj = uBufferedRea.readLine();
                if (obj != null) {
                   if (obj.contains("MemTotal")) {
                      long l = Long.valueOf(obj.split("\\s+")[1]).longValue();
                      try{
                         l = l << 10;
                         uBufferedRea.close();
                      }catch(java.io.IOException e2){
                         e2.printStackTrace();
                      }
                      return l;
                   }
                }else {
                   uBufferedRea.close();
                   break ;
                }
             }
          }catch(java.lang.Exception e0){
             objArray = uBufferedRea;
          }
          if (objArray != null) {
             objArray.close();
          }
       }catch(java.lang.Exception e0){
          goto label_0063 ;
       }catch(java.io.IOException e0){
          e0.printStackTrace();
       }
       return 0;
    }
}
