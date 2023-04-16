package gv6.b;
import java.lang.String;
import java.lang.Throwable;

public interface abstract b	// class@001712
{

    void addCustomStatEvent(float p0,String p1,String p2);
    boolean azerothHasInit();
    boolean dispatchPushCommand(String p0,String p1);
    String getAppVersion();
    String getDeviceId();
    String getGlobalId();
    String getManufacturerAndModel();
    String getSysRelease();
    String getUserId();
    boolean isDebugMode();
    void logE(String p0,String p1,Throwable p2);
    void logI(String p0,String p1);
}
