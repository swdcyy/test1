package com.kwai.framework.cache.initmodule.d;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import com.kwai.sdk.switchconfig.a;
import x56.b;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.utility.Log;
import x56.d;
import x56.c;
import com.kwai.framework.cache.model.OnlineClearConfig;

public final class d implements Runnable	// class@0014f1
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       Gson a;
       CheckDiskModule.w = a.t().getValue("appSpaceMonitor", b.class, null);
       a = a.a;
       Log.b("CheckDiskModule", "DiskSpaceConfig: "+a.q(CheckDiskModule.w));
       CheckDiskModule.t = a.t().getValue("LOW_DISK_MODE_CONFIG", d.class, null);
       Log.b("CheckDiskModule", "LowDiskModeConfigModel: "+a.q(CheckDiskModule.t));
       CheckDiskModule.u = a.t().getValue("FILE_FULL_SCAN_CONFIG", c.class, null);
       Log.b("CheckDiskModule", "FullScanConfig: "+a.q(CheckDiskModule.u));
       CheckDiskModule.v = a.t().getValue("AUTO_CLEAN_CONFIG", OnlineClearConfig.class, null);
       Log.b("CheckDiskModule", "AutoOnlineClearConfig: "+a.q(CheckDiskModule.v));
       CheckDiskModule.x = a.t().d("FileUtilsSizeOfOptimize", CheckDiskModule.x);
       CheckDiskModule.y = a.t().d("showCacheModuleList", CheckDiskModule.y);
       CheckDiskModule.z = a.t().d("CalculateKwaiDiskUsedOptimizeConfig", CheckDiskModule.z);
    }
}
