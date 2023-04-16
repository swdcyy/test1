package com.facebook.react.turbomodule.core.TurboModulePerfLogger;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import java.lang.Enum;

public class TurboModulePerfLogger	// class@00130e
{
    public static boolean a;
    public static boolean b;

    public void TurboModulePerfLogger(){
       super();
    }
    public static void a(String p0,String p1,int p2){
       if (TurboModulePerfLogger.b) {
          ReactMarker.logTMMMarker(p0, p1, null, p2);
       }
       return;
    }
    public static native void jniSetEnabled(boolean p0);
    public static void moduleCreateCacheHit(String p0,int p1){
       TurboModulePerfLogger.a(ReactMarkerConstants.moduleCreateCacheHit.name(), p0, p1);
    }
    public static void moduleCreateConstructEnd(String p0,int p1){
       TurboModulePerfLogger.a(ReactMarkerConstants.moduleCreateConstructEnd.name(), p0, p1);
    }
    public static void moduleCreateConstructStart(String p0,int p1){
       TurboModulePerfLogger.a(ReactMarkerConstants.moduleCreateConstructStart.name(), p0, p1);
    }
    public static void moduleCreateEnd(String p0,int p1){
       TurboModulePerfLogger.a(ReactMarkerConstants.moduleCreateEnd.name(), p0, p1);
    }
    public static void moduleCreateFail(String p0,int p1){
       TurboModulePerfLogger.a(ReactMarkerConstants.moduleCreateFail.name(), p0, p1);
    }
    public static void moduleCreateSetUpEnd(String p0,int p1){
       TurboModulePerfLogger.a(ReactMarkerConstants.moduleCreateSetUpEnd.name(), p0, p1);
    }
    public static void moduleCreateSetUpStart(String p0,int p1){
       TurboModulePerfLogger.a(ReactMarkerConstants.moduleCreateSetUpStart.name(), p0, p1);
    }
    public static void moduleCreateStart(String p0,int p1){
       TurboModulePerfLogger.a(ReactMarkerConstants.moduleCreateStart.name(), p0, p1);
    }
    public static void moduleDataCreateEnd(String p0,int p1){
       TurboModulePerfLogger.a(ReactMarkerConstants.moduleDataCreateEnd.name(), p0, p1);
    }
    public static void moduleDataCreateStart(String p0,int p1){
       TurboModulePerfLogger.a(ReactMarkerConstants.moduleDataCreateStart.name(), p0, p1);
    }
}
