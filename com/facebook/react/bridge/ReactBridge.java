package com.facebook.react.bridge.ReactBridge;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import hg.a;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.soloader.SoLoader;

public class ReactBridge	// class@00121a
{
    public static boolean sDidInit;
    public static long sLoadEndTime;
    public static long sLoadStartTime;

    public void ReactBridge(){
       super();
    }
    public static long getLoadEndTime(){
       return ReactBridge.sLoadEndTime;
    }
    public static long getLoadStartTime(){
       return ReactBridge.sLoadStartTime;
    }
    public static boolean isInitialized(){
       return ReactBridge.sDidInit;
    }
    public static synchronized void staticInit(){
       _monitor_enter(ReactBridge.class);
       if (PatchProxy.applyVoid(null, null, ReactBridge.class, "1")) {
          _monitor_exit(ReactBridge.class);
          return;
       }else if(ReactBridge.sDidInit){
          _monitor_exit(ReactBridge.class);
          return;
       }else {
          ReactBridge.sLoadStartTime = SystemClock.uptimeMillis();
          a.a(0, "ReactBridge.staticInit::load:reactnativejni");
          ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
          SoLoader.b("reactnativejni");
          ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
          a.c(0, "ReactBridge.staticInit::load:reactnativejni");
          ReactBridge.sLoadEndTime = SystemClock.uptimeMillis();
          ReactBridge.sDidInit = true;
          _monitor_exit(ReactBridge.class);
          return;
       }
    }
}
