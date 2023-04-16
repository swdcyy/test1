package com.kwai.framework.network.idc.config.ScheduleConfig;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class ScheduleConfig	// class@000c0e
{
    public List mCdnHostGroups;
    public long mGoodIdcThresholdMs;
    public Map mHosts;
    public Map mHttpsHosts;
    public List mIdcIpList;
    public RegionInfo mRegionInfo;
    public boolean mServerIdcOnly;
    public List mSpeedTestTypeAndOrder;
    public long mTestSpeedTimeoutMs;
    public String mUserFlag;
    public static final List a;

    static {
       ArrayList uArrayList = new ArrayList();
       ScheduleConfig.a = uArrayList;
       uArrayList.add("api");
       uArrayList.add("live");
       uArrayList.add("upload");
    }
    public void ScheduleConfig(){
       super();
       this.mSpeedTestTypeAndOrder = ScheduleConfig.a;
       this.mGoodIdcThresholdMs = 100;
       this.mTestSpeedTimeoutMs = 3000;
       this.mServerIdcOnly = false;
       this.mHosts = new HashMap();
       this.mHttpsHosts = new HashMap();
    }
    public long a(){
       return this.mGoodIdcThresholdMs;
    }
    public List b(){
       Object obj = PatchProxy.apply(null, this, ScheduleConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mIdcIpList == null) {
          this.mIdcIpList = new ArrayList();
       }
       return this.mIdcIpList;
    }
    public long c(){
       return this.mTestSpeedTimeoutMs;
    }
}
