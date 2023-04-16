package com.kwai.video.waynelive.debug.Logger;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog;
import java.util.Map;

public class Logger	// class@000df6
{
    public String mLogExtraInfo;

    public void Logger(){
       super("");
    }
    public void Logger(String p0){
       super();
       this.mLogExtraInfo = p0;
    }
    public static String emptyIfNull(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, Logger.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (p0 == null)? "null": p0.toString();
       return p0;
    }
    public void e(String p0,String p1,Object p2,String p3,Object p4,Throwable p5){
       Logger logger = Logger.class;
       if (PatchProxy.isSupport(logger)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, logger, "9")) {
             return;
          }
       }
       p0 = " ";
       StringBuilder str = p0+p0+this.mLogExtraInfo+p0+p1+p0+p2+p0+p3+p0+p4;
       if (p5 != null) {
          p0 = p5.getMessage();
       }
       DebugLog.e("live", str+p0);
       return;
    }
    public void e(String p0,String p1,Object p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, Logger.class, "8")) {
          return;
       }
       p0 = " ";
       StringBuilder str = p0+p0+this.mLogExtraInfo+p0+p1+p0+p2;
       if (p3 != null) {
          p0 = p3.getMessage();
       }
       DebugLog.e("live", str+p0);
       return;
    }
    public void e(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Logger.class, "7")) {
          return;
       }
       p0 = " ";
       StringBuilder str = p0+p0+this.mLogExtraInfo;
       if (p1 != null) {
          p0 = p1.getMessage();
       }
       DebugLog.e("live", str+p0);
       return;
    }
    public void e(String p0,Map p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, Logger.class, "11")) {
          return;
       }
       p0 = " ";
       StringBuilder str = p0+p0+this.mLogExtraInfo+p0+p1+p0;
       if (p2 != null) {
          p0 = p2.getMessage();
       }
       DebugLog.e("live", str+p0);
       return;
    }
    public void e(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Logger.class, "6")) {
          return;
       }
       StringBuilder str = this.mLogExtraInfo+" ";
       String str1 = (p0 == null)? " null error": p0.getMessage();
       DebugLog.e("live", str+str1);
       return;
    }
    public void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Logger.class, "1")) {
          return;
       }
       DebugLog.i("live", this.mLogExtraInfo+" "+p0);
       return;
    }
    public void i(String p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, Logger.class, "2")) {
          return;
       }
       DebugLog.i("live", p0+" "+this.mLogExtraInfo+" "+p1+" "+p2);
       return;
    }
    public void i(String p0,String p1,Object p2,String p3,Object p4){
       Logger logger = Logger.class;
       if (PatchProxy.isSupport(logger)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, logger, "3")) {
             return;
          }
       }
       DebugLog.i("live", p0+" "+this.mLogExtraInfo+" "+p1+" "+p2+" "+p3+" "+p4);
       return;
    }
    public void i(String p0,String p1,Object p2,String p3,Object p4,String p5,Object p6){
       Logger logger = Logger.class;
       if (PatchProxy.isSupport(logger)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, this, logger, "4")) {
             return;
          }
       }
       DebugLog.i("live", p0+" "+this.mLogExtraInfo+" "+p1+" "+p2+" "+p3+" "+p4+" "+p5+" "+p6);
       return;
    }
    public void i(String p0,String p1,Object p2,String p3,Object p4,String p5,Object p6,String p7,Object p8){
       Logger logger = Logger.class;
       if (PatchProxy.isSupport(logger)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, this, logger, "5")) {
             return;
          }
       }
       DebugLog.i("live", p0+" "+this.mLogExtraInfo+" "+p1+" "+p2+" "+p3+" "+p4+" "+p5+" "+p6+" "+p7+" "+p8);
       return;
    }
    public void i(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Logger.class, "10")) {
          return;
       }
       DebugLog.i("live", p0+" "+this.mLogExtraInfo+" "+p1);
       return;
    }
}
