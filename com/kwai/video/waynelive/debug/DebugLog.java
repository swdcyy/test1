package com.kwai.video.waynelive.debug.DebugLog;
import com.kwai.video.waynelive.debug.DebugLog$1;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.lang.StringBuilder;
import com.kwai.video.waynelive.debug.DebugLog$LogInterface;
import java.util.Iterator;

public class DebugLog	// class@000df4
{
    public static String KPTAG = "WayneLog ";
    public static int maxLength = 4000;
    public static DebugLog$LogInterface sLogInterface;

    static {
       DebugLog.sLogInterface = new DebugLog$1();
    }
    public void DebugLog(){
       super();
    }
    public static List String2List(String p0){
       String str;
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, DebugLog.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       p0 = p0.trim();
       int i = 0;
       while (i < p0.length()) {
          int maxLength = DebugLog.maxLength;
          int i1 = i + maxLength;
          if (p0.length() <= i1) {
             str = p0.substring(i);
          }else {
             maxLength = maxLength + i;
             str = p0.substring(i, maxLength);
          }
          i = i + DebugLog.maxLength;
          obj.add(str);
       }
       return obj;
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DebugLog.class, "2")) {
          return;
       }
       if (p1 != null && p1.length() > DebugLog.maxLength) {
          DebugLog.d(p0, DebugLog.String2List(p1));
       }else {
          DebugLog.sLogInterface.d(DebugLog.KPTAG+p0, p1);
       }
       return;
    }
    public static void d(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DebugLog.class, "3")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          DebugLog.sLogInterface.d(DebugLog.KPTAG+p0, iterator.next());
       }
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DebugLog.class, "7")) {
          return;
       }
       DebugLog.sLogInterface.e(DebugLog.KPTAG+p0, p1);
       return;
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DebugLog.class, "5")) {
          return;
       }
       if (p1 != null && p1.length() > DebugLog.maxLength) {
          DebugLog.i(p0, DebugLog.String2List(p1));
       }else {
          DebugLog.sLogInterface.i(DebugLog.KPTAG+p0, p1);
       }
       return;
    }
    public static void i(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DebugLog.class, "4")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          DebugLog.sLogInterface.i(DebugLog.KPTAG+p0, iterator.next());
       }
       return;
    }
    public static void setImpl(DebugLog$LogInterface p0){
       DebugLog.sLogInterface = p0;
    }
    public static void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DebugLog.class, "1")) {
          return;
       }
       DebugLog.sLogInterface.v(DebugLog.KPTAG+p0, p1);
       return;
    }
    public static void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DebugLog.class, "6")) {
          return;
       }
       DebugLog.sLogInterface.w(DebugLog.KPTAG+p0, p1);
       return;
    }
}
