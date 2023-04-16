package com.kwai.video.ksspark.NewSparkLog;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.video.ksspark.NewSparkLogInterface;

public class NewSparkLog	// class@00092d
{
    public static NewSparkLogInterface logger;

    public void NewSparkLog(){
       super();
    }
    public static void log(int p0,String p1,String p2){
       if (PatchProxy.isSupport(NewSparkLog.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, NewSparkLog.class, "1")) {
          return;
       }
       NewSparkLogInterface logger = NewSparkLog.logger;
       if (logger == null) {
          return;
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 4) {
                if (p0 != 8) {
                   if (p0 != 16) {
                      logger.d(p1, p2);
                   }else {
                      logger.e(p1, p2);
                   }
                }else {
                   logger.w(p1, p2);
                }
             }else {
                logger.i(p1, p2);
             }
          }else {
             logger.d(p1, p2);
          }
       }else {
          logger.v(p1, p2);
       }
       return;
    }
    public static void setLogger(NewSparkLogInterface p0){
       NewSparkLog.logger = p0;
    }
}
