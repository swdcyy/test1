package com.kwai.yoda.session.logger.webviewload.SdkInitInfo;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collections;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Long;

public final class SdkInitInfo	// class@0012e2
{
    public Long appLaunchFinishTime;
    public Long appLaunchStartTime;
    public Long cacheInit;
    public Long databaseInit;
    public Long databaseOpen;
    public Long firstOfflineRequestSuccessTime;
    public Long initedTimeStamp;
    public Map ksCorePerformances;
    public Long ksInited;
    public Long ksInstalled;
    public Long ksPreloadCore;
    public Long ksPreloadCoreError;
    public Long ksPreloaded;
    public Long ksPreloadedCore;
    public Long miniInitedTimeStamp;
    public Long miniPreInitTimeStamp;
    public Long preInitTimeStamp;
    public Long preKsPreload;

    public void SdkInitInfo(){
       super();
       Map map = Collections.synchronizedMap(new LinkedHashMap());
       a.h(map, "Collections.synchronizedMap\(mutableMapOf\(\)\)");
       this.ksCorePerformances = map;
    }
    public final void a(Long p0){
       this.initedTimeStamp = p0;
    }
    public final void b(Long p0){
       this.preInitTimeStamp = p0;
    }
}
