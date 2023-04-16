package com.frog.engine.internal.FrogEngineInternal;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import com.frog.engine.internal.FrogGameHandlerImpl;
import com.frog.engine.FrogRunGameResultListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.frog.engine.internal.FrogLog;
import com.frog.engine.internal.FrogEngineInternal$c;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import android.content.Context;
import com.frog.engine.FrogBaseRequestListener;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.app.Activity;
import com.frog.engine.utils.ViewUtils;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import java.lang.System;
import java.lang.Throwable;
import android.util.Log;
import com.frog.engine.data.FrogInitParam;
import com.frog.engine.FrogCommonListener;
import com.frog.engine.FrogCanvasKVStorageProxy;
import java.io.File;
import com.frog.engine.internal.FrogEngineInternal$a;
import android.os.AsyncTask;
import com.frog.engine.internal.FrogEngineInternal$b;

public class FrogEngineInternal	// class@001538
{
    public static Context applicationContext;
    public static int mActivityDisplayHeight;
    public static int mActivityDisplayWidth;
    public static Handler mMainHandler;
    public static Map sListenerMap;

    static {
       FrogEngineInternal.mMainHandler = new Handler(Looper.getMainLooper());
       FrogEngineInternal.sListenerMap = new HashMap();
    }
    public void FrogEngineInternal(){
       super();
    }
    public static void callResult(int p0,String p1,FrogGameHandlerImpl p2,FrogRunGameResultListener p3){
       if (PatchProxy.isSupport(FrogEngineInternal.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, FrogEngineInternal.class, "4")) {
          return;
       }
       FrogLog.v("runGameResult", "code:"+p0+" msg:"+p1);
       if (p3 != null) {
          FrogEngineInternal.mMainHandler.post(new FrogEngineInternal$c(p0, p3, p2, p1));
       }
       return;
    }
    public static boolean canHandlerGameCommand(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FrogEngineInternal.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Map map = FrogEngineInternal.sListenerMap.get(p0);
       if (map == null || map.size() <= 0) {
          return false;
       }
       return map.containsKey(p1);
    }
    public static int getActivityDisplayHeight(){
       return FrogEngineInternal.mActivityDisplayHeight;
    }
    public static int getActivityDisplayWidth(){
       return FrogEngineInternal.mActivityDisplayWidth;
    }
    public static Context getApplicationContext(){
       return FrogEngineInternal.applicationContext;
    }
    public static FrogBaseRequestListener getGameCommandRequestListener(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FrogEngineInternal.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map map = FrogEngineInternal.sListenerMap.get(p0);
       if (map == null || map.size() <= 0) {
          return null;
       }
       return map.get(p1);
    }
    public static Map getListenerMap(){
       return FrogEngineInternal.sListenerMap;
    }
    public static String[] getSupportAsyncCommands(String p0){
       String[] stringArray;
       Object obj = PatchProxy.applyOneRefs(p0, null, FrogEngineInternal.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map map = FrogEngineInternal.sListenerMap.get(p0);
       int i = 0;
       if (map == null || !map.size()) {
          stringArray = new String[i];
          return stringArray;
       }else {
          HashSet hashSet = new HashSet();
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry.getValue() != null && uEntry.getValue().isAsyncRequest()) {
                hashSet.add(uEntry.getKey());
             }
          }
          stringArray = new String[hashSet.size()];
          Iterator iterator1 = hashSet.iterator();
          while (iterator1.hasNext()) {
             stringArray[i] = iterator1.next();
             i = i + 1;
          }
          return stringArray;
       }
    }
    public static String[] getSupportSyncCommands(String p0){
       String[] stringArray;
       Object obj = PatchProxy.applyOneRefs(p0, null, FrogEngineInternal.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map map = FrogEngineInternal.sListenerMap.get(p0);
       int i = 0;
       if (map == null || !map.size()) {
          stringArray = new String[i];
          return stringArray;
       }else {
          HashSet hashSet = new HashSet();
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (uEntry.getValue() != null && !uEntry.getValue().isAsyncRequest()) {
                hashSet.add(uEntry.getKey());
             }
          }
          stringArray = new String[hashSet.size()];
          Iterator iterator1 = hashSet.iterator();
          while (iterator1.hasNext()) {
             stringArray[i] = iterator1.next();
             i = i + 1;
          }
          return stringArray;
       }
    }
    public static void initActivityWidthAndHeight(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FrogEngineInternal.class, "1")) {
          return;
       }
       if (p0 != null && !p0.isFinishing()) {
          FrogEngineInternal.mActivityDisplayHeight = ViewUtils.getDisplayHeight(p0);
          FrogEngineInternal.mActivityDisplayWidth = ViewUtils.getDisplayWidth(p0);
       }
       return;
    }
    public static boolean onLoadNativeLibraries(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FrogEngineInternal.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       ApplicationInfo metaData = p0.getPackageManager().getApplicationInfo(p0.getPackageName(), 128).metaData;
       System.loadLibrary(metaData.getString("android.app.ks_ffmpeg_lib_name"));
       String str = metaData.getString("android.app.ks_frog_lib_name");
       System.loadLibrary(metaData.getString("android.app.ks_openal_lib_name"));
       System.loadLibrary(str);
       return true;
    }
    public static void registerBaseCommands(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FrogEngineInternal.class, "7")) {
          return;
       }
       if (p1 == null || p1.size() <= 0) {
          return;
       }
       _monitor_enter(FrogEngineInternal.class);
       Map map = FrogEngineInternal.sListenerMap.get(p0);
       if (map == null) {
          FrogEngineInternal.sListenerMap.put(p0, p1);
       }else {
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (!map.containsKey(uEntry)) {
                map.put(uEntry.getKey(), uEntry.getValue());
             }
          }
       }
       _monitor_exit(FrogEngineInternal.class);
       return;
    }
    public static void runGame(Activity p0,FrogInitParam p1,FrogRunGameResultListener p2,FrogCommonListener p3,FrogCanvasKVStorageProxy p4){
       FrogEngineInternal uFrogEngineI = FrogEngineInternal.class;
       Object obj = null;
       if (PatchProxy.isSupport(uFrogEngineI)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, obj, uFrogEngineI, "2")) {
             return;
          }
       }
       if (p0 != null && (p1 == null || !p1.legal())) {
          FrogEngineInternal.callResult(-1, "context is:"+p0+" init param is:"+p1, obj, p2);
          return;
       }else if(!new File(p1.getGamePath()).exists()){
          FrogEngineInternal.callResult(-2, "game resource not exist", obj, p2);
          return;
       }else {
          AsyncTask.execute(new FrogEngineInternal$a());
          FrogEngineInternal$b uob = new FrogEngineInternal$b(p0, p1, p2, p3, p4);
          FrogEngineInternal.mMainHandler.post(v7);
          return;
       }
    }
}
