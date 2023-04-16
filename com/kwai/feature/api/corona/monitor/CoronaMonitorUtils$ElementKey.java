package com.kwai.feature.api.corona.monitor.CoronaMonitorUtils$ElementKey;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CoronaMonitorUtils$ElementKey extends Enum	// class@000e19
{
    public final String keyType;
    public static final CoronaMonitorUtils$ElementKey[] $VALUES;
    public static final CoronaMonitorUtils$ElementKey ACTIVITY_FINISHING;
    public static final CoronaMonitorUtils$ElementKey ACTIVITY_PAGE_PATH;
    public static final CoronaMonitorUtils$ElementKey FRAGMENT_IS_REUMED;
    public static final CoronaMonitorUtils$ElementKey FRAGMENT_IS_SELECT;
    public static final CoronaMonitorUtils$ElementKey KEY_ERROR_CODE;
    public static final CoronaMonitorUtils$ElementKey KEY_ERROR_MSG;
    public static final CoronaMonitorUtils$ElementKey KEY_ERROR_URL;
    public static final CoronaMonitorUtils$ElementKey KEY_LOW_DEVICE;
    public static final CoronaMonitorUtils$ElementKey KEY_LOW_DEVICE_COMMON_LEVEL;
    public static final CoronaMonitorUtils$ElementKey KEY_TOP_VISIBLE;
    public static final CoronaMonitorUtils$ElementKey LOG_EXTRA_NAME;
    public static final CoronaMonitorUtils$ElementKey LOG_PAGE_PARAMS;
    public static final CoronaMonitorUtils$ElementKey OWNER_PAGE_TYPE;
    public static final CoronaMonitorUtils$ElementKey SCENE_TYPE;

    static {
       CoronaMonitorUtils$ElementKey[] uElementKeyA = new CoronaMonitorUtils$ElementKey[14];
       CoronaMonitorUtils$ElementKey uElementKey = new CoronaMonitorUtils$ElementKey("OWNER_PAGE_TYPE", 0, "ownerPageCode");
       CoronaMonitorUtils$ElementKey.OWNER_PAGE_TYPE = uElementKey;
       uElementKeyA[0] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("SCENE_TYPE", 1, "ownerScene");
       CoronaMonitorUtils$ElementKey.SCENE_TYPE = uElementKey;
       uElementKeyA[1] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("LOG_PAGE_PARAMS", 2, "ownerLogPageParams");
       CoronaMonitorUtils$ElementKey.LOG_PAGE_PARAMS = uElementKey;
       uElementKeyA[2] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("LOG_EXTRA_NAME", 3, "ownerLogExtraName");
       CoronaMonitorUtils$ElementKey.LOG_EXTRA_NAME = uElementKey;
       uElementKeyA[3] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("FRAGMENT_IS_SELECT", 4, "ownerPageSelect");
       CoronaMonitorUtils$ElementKey.FRAGMENT_IS_SELECT = uElementKey;
       uElementKeyA[4] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("FRAGMENT_IS_REUMED", 5, "ownerFragmentResumed");
       CoronaMonitorUtils$ElementKey.FRAGMENT_IS_REUMED = uElementKey;
       uElementKeyA[5] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("ACTIVITY_PAGE_PATH", 6, "ownerControllerPath");
       CoronaMonitorUtils$ElementKey.ACTIVITY_PAGE_PATH = uElementKey;
       uElementKeyA[6] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("ACTIVITY_FINISHING", 7, "ownerControllerFinishing");
       CoronaMonitorUtils$ElementKey.ACTIVITY_FINISHING = uElementKey;
       uElementKeyA[7] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("KEY_TOP_VISIBLE", 8, "isVisible");
       CoronaMonitorUtils$ElementKey.KEY_TOP_VISIBLE = uElementKey;
       uElementKeyA[8] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("KEY_ERROR_CODE", 9, "errorCode");
       CoronaMonitorUtils$ElementKey.KEY_ERROR_CODE = uElementKey;
       uElementKeyA[9] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("KEY_ERROR_MSG", 10, "errorMsg");
       CoronaMonitorUtils$ElementKey.KEY_ERROR_MSG = uElementKey;
       uElementKeyA[10] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("KEY_ERROR_URL", 11, "errorHttpUrl");
       CoronaMonitorUtils$ElementKey.KEY_ERROR_URL = uElementKey;
       uElementKeyA[11] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("KEY_LOW_DEVICE", 12, "isLowDevice");
       CoronaMonitorUtils$ElementKey.KEY_LOW_DEVICE = uElementKey;
       uElementKeyA[12] = uElementKey;
       uElementKey = new CoronaMonitorUtils$ElementKey("KEY_LOW_DEVICE_COMMON_LEVEL", 13, "standardDevicePerformance");
       CoronaMonitorUtils$ElementKey.KEY_LOW_DEVICE_COMMON_LEVEL = uElementKey;
       uElementKeyA[13] = uElementKey;
       CoronaMonitorUtils$ElementKey.$VALUES = uElementKeyA;
    }
    public void CoronaMonitorUtils$ElementKey(String p0,int p1,String p2){
       super(p0, p1);
       this.keyType = p2;
    }
    public static CoronaMonitorUtils$ElementKey valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CoronaMonitorUtils$ElementKey.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CoronaMonitorUtils$ElementKey.class, p0);
    }
    public static CoronaMonitorUtils$ElementKey[] values(){
       Object obj = PatchProxy.apply(null, null, CoronaMonitorUtils$ElementKey.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CoronaMonitorUtils$ElementKey.$VALUES.clone();
    }
    public final String getKeyType(){
       return this.keyType;
    }
}
