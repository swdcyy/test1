package com.amap.api.location.AMapLocationQualityReport;
import java.lang.Cloneable;
import java.lang.Object;
import com.amap.api.location.AMapLocationClientOption$AMapLocationMode;
import java.lang.String;
import java.lang.Throwable;
import com.loc.fj;
import java.lang.StringBuffer;

public class AMapLocationQualityReport implements Cloneable	// class@000ed1
{
    public AMapLocationClientOption$AMapLocationMode a;
    public boolean b;
    public int c;
    public int d;
    public String e;
    public long f;
    public boolean g;

    public void AMapLocationQualityReport(){
       super();
       this.b = false;
       this.c = 2;
       this.d = 0;
       this.e = "UNKNOWN";
       this.f = 0;
       this.g = false;
       this.a = AMapLocationClientOption$AMapLocationMode.Hight_Accuracy;
    }
    public AMapLocationQualityReport clone(){
       AMapLocationQualityReport uAMapLocatio = new AMapLocationQualityReport();
       super.clone();
       uAMapLocatio.setGpsStatus(this.c);
       uAMapLocatio.setGPSSatellites(this.d);
       uAMapLocatio.setWifiAble(this.b);
       uAMapLocatio.setNetUseTime(this.f);
       uAMapLocatio.setNetworkType(this.e);
       uAMapLocatio.setLocationMode(this.a);
       uAMapLocatio.setInstallHighDangerMockApp(this.g);
       return uAMapLocatio;
    }
    public Object clone(){
       return this.clone();
    }
    public String getAdviseMessage(){
       String str1;
       StringBuffer str = "";
       AMapLocationQualityReport ta = this.a;
       if (ta != AMapLocationClientOption$AMapLocationMode.Battery_Saving) {
          AMapLocationQualityReport tc = this.c;
          if (tc != null) {
             if (tc != 1) {
                if (tc != 2) {
                   if (tc != 3) {
                      if (tc == 4) {
                         str1 = "您的设置禁用了GPS定位权限，开启GPS定位权限有助于提高定位的精确度\n";
                      }
                   }else {
                      str1 = "您的设备当前设置的定位模式不包含GPS定位，选择包含GPS模式的定位模式有助于提高定位的精确度\n";
                   }
                }else {
                   str1 = "您的设备关闭了GPS定位功能，开启GPS定位功能有助于提高定位的精确度\n";
                }
             }else {
                str1 = "您的设备没有GPS模块或者GPS模块异常，无法进行GPS定位\n";
             }
          }else if(ta == AMapLocationClientOption$AMapLocationMode.Device_Sensors && this.d < 4){
             str1 = "当前GPS信号弱，位置更新可能会延迟\n";
          }
          str = str+str1;
       }
    label_0036 :
       if (this.a != AMapLocationClientOption$AMapLocationMode.Device_Sensors) {
          if (("DISCONNECTED").equals(this.e)) {
             str1 = "您的设备未连接到网络，无法进行网络定位\n";
          }else if(("2G").equals(this.e)){
             str1 = "您的设备网络状态不太好，网络定位可能会有延迟\n";
          }else if(this.b == null){
             str = str+"您的设备WIFI开关已关闭，打开WIFI开关有助于提高定位的成功率\n";
          }
          str = str+str1;
          goto label_0059 ;
       }
       return str;
    }
    public int getGPSSatellites(){
       return this.d;
    }
    public int getGPSStatus(){
       return this.c;
    }
    public long getNetUseTime(){
       return this.f;
    }
    public String getNetworkType(){
       return this.e;
    }
    public boolean isInstalledHighDangerMockApp(){
       return this.g;
    }
    public boolean isWifiAble(){
       return this.b;
    }
    public void setGPSSatellites(int p0){
       this.d = p0;
    }
    public void setGpsStatus(int p0){
       this.c = p0;
    }
    public void setInstallHighDangerMockApp(boolean p0){
       this.g = p0;
    }
    public void setLocationMode(AMapLocationClientOption$AMapLocationMode p0){
       this.a = p0;
    }
    public void setNetUseTime(long p0){
       this.f = p0;
    }
    public void setNetworkType(String p0){
       this.e = p0;
    }
    public void setWifiAble(boolean p0){
       this.b = p0;
    }
}
