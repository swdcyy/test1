package j9a.a;
import java.lang.Object;

public class a	// class@002988
{
    public boolean enableSpeedTestInWifi;
    public ArrayList mBanDeviceNameList;
    public ArrayList mBanOsVersionList;
    public boolean mEnableColdStart;
    public boolean mUseNetSore;
    public int netScorePollInterval;
    public int timeOutSec;
    public int toastType;
    public int weakNetworkThreshold;
    public int wifiPollInterval;

    public void a(){
       super();
       this.weakNetworkThreshold = 15;
       this.timeOutSec = 5;
       this.wifiPollInterval = 60;
       this.toastType = 1;
       this.mUseNetSore = false;
       this.mEnableColdStart = false;
       this.netScorePollInterval = 2;
       this.enableSpeedTestInWifi = true;
    }
}
