package com.tkruntime.v8.V8Trace;
import java.lang.Object;
import com.tkruntime.v8.V8;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.tkruntime.v8.V8Trace$ILogger;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import java.lang.System;
import java.io.PrintStream;

public class V8Trace	// class@000fce
{
    public static V8Trace$ILogger sLogger;

    public void V8Trace(){
       super();
    }
    public static void addCommunicationCost(V8 p0,float p1){
       V8Trace v8Trace = V8Trace.class;
       if (PatchProxy.isSupport(v8Trace) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), null, v8Trace, "5")) {
          return;
       }
       V8Trace$ILogger sLogger = V8Trace.sLogger;
       if (sLogger != null) {
          sLogger.addCommunicationCost(p0, p1);
       }
       return;
    }
    public static void beginSection(V8 p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, V8Trace.class, "6")) {
          return;
       }
       V8Trace$ILogger sLogger = V8Trace.sLogger;
       if (sLogger != null) {
          sLogger.beginSection(p0, p1, p2);
       }
       return;
    }
    public static void beginSection(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, V8Trace.class, "8")) {
          return;
       }
       V8Trace$ILogger sLogger = V8Trace.sLogger;
       if (sLogger != null) {
          sLogger.beginSection(p0, p1, p2);
       }
       return;
    }
    public static String createTraceTag(String p0,String p1,String p2,String p3,String p4){
       V8Trace v8Trace = V8Trace.class;
       if (PatchProxy.isSupport(v8Trace)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, v8Trace, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p1 = "["+p0+"]["+p1+"]["+p2+"]";
       if (!TextUtils.isEmpty(p3)) {
          p1 = p1+"["+p3+"]";
       }
       if (!TextUtils.isEmpty(p4)) {
          p1 = p1+"["+p4+"]";
       }
       return p1;
    }
    public static void endSection(V8 p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, V8Trace.class, "7")) {
          return;
       }
       V8Trace$ILogger sLogger = V8Trace.sLogger;
       if (sLogger != null) {
          sLogger.endSection(p0);
       }
       return;
    }
    public static void endSection(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, V8Trace.class, "9")) {
          return;
       }
       V8Trace$ILogger sLogger = V8Trace.sLogger;
       if (sLogger != null) {
          sLogger.endSection(p0, p1, p2);
       }
       return;
    }
    public static ArrayList parseTraceTag(String p0){
       Object obj = null;
       ArrayList obj1 = PatchProxy.applyOneRefs(p0, obj, V8Trace.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (TextUtils.isEmpty(p0)) {
          return obj;
       }
       obj1 = new ArrayList();
       int i = 0;
       int i1 = p0.indexOf("]", i);
       while (i1 > 0) {
          i = i + 1;
          obj1.add(p0.substring(i, i1));
          i = i1 + 1;
          i1 = p0.indexOf("]", i);
       }
       return obj1;
    }
    public static void printLog(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, V8Trace.class, "4")) {
          return;
       }
       int i = p0.length();
       for (int i1 = 0; i1 < i; i1 = i2) {
          int i2 = i1 + 4000;
          String str = (i <= i2)? p0.substring(i1): p0.substring(i1, i2);
          System.out.println("V8Trace: "+str);
       }
       return;
    }
    public static void setLogger(V8Trace$ILogger p0){
       V8Trace.sLogger = p0;
    }
    public static void traceLog(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, V8Trace.class, "3")) {
          return;
       }
       V8Trace$ILogger sLogger = V8Trace.sLogger;
       if (sLogger != null) {
          sLogger.traceLog(p0+": "+p1);
       }
       return;
    }
}
