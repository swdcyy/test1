package com.kwai.video.westeros.CacheManager;
import com.kwai.video.westeros.helpers.ValidationChecker;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public class CacheManager	// class@000e5b
{
    public final ValidationChecker checker;
    public final long westeros;
    public static final String TAG = "CacheManager";

    public void CacheManager(long p0,ValidationChecker p1){
       super();
       this.westeros = p0;
       this.checker = p1;
    }
    public void loadCacheSensorDataFromFile(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CacheManager.class, "4")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeLoadCacheSensorDataFromFile(this.westeros, p0);
       }
       return;
    }
    public native final void nativeLoadCacheSensorDataFromFile(long p0,String p1);
    public native final void nativeSaveCacheSensorDataToFile(long p0,String p1,long p2,long p3);
    public native final void nativeStartCacheSensorData(long p0);
    public native final void nativeStopCacheSensorData(long p0);
    public void saveCacheSensorDataToFile(String p0,long p1,long p2){
       if (PatchProxy.isSupport(CacheManager.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, CacheManager.class, "3")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSaveCacheSensorDataToFile(this.westeros, p0, p1, p2);
       }
       return;
    }
    public void startCacheSensorData(){
       if (PatchProxy.applyVoid(null, this, CacheManager.class, "1")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeStartCacheSensorData(this.westeros);
       }
       return;
    }
    public void stopCacheSensorData(){
       if (PatchProxy.applyVoid(null, this, CacheManager.class, "2")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeStopCacheSensorData(this.westeros);
       }
       return;
    }
}
