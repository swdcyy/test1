package com.kwai.link.IKlinkHost;
import com.kwai.link.model.ApplicationInfo;
import com.kwai.link.model.LogConfig;
import com.kwai.link.model.NetworkInfo;
import com.kwai.link.model.ZtCommonInfo;
import java.lang.String;
import java.util.Map;

public interface abstract IKlinkHost	// class@000d11
{

    ApplicationInfo getApplicationInfo();
    LogConfig getLogConfig();
    NetworkInfo getNetworkInfo();
    ZtCommonInfo getZtCommonInfo();
    String queryPersistentInfo(String p0);
    void removePersistentInfo(String p0);
    void reportEvent(String p0,String p1,String p2);
    void reportEvent(String p0,Map p1,float p2);
    void storePersistentInfo(String p0,String p1);
}
