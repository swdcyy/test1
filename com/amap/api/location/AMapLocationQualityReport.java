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
                         str1 = "�������ý�����GPS��λȨ�ޣ�����GPS��λȨ����������߶�λ�ľ�ȷ��\n";
                      }
                   }else {
                      str1 = "�����豸��ǰ���õĶ�λģʽ������GPS��λ��ѡ�����GPSģʽ�Ķ�λģʽ��������߶�λ�ľ�ȷ��\n";
                   }
                }else {
                   str1 = "�����豸�ر���GPS��λ���ܣ�����GPS��λ������������߶�λ�ľ�ȷ��\n";
                }
             }else {
                str1 = "�����豸û��GPSģ�����GPSģ���쳣���޷�����GPS��λ\n";
             }
          }else if(ta == AMapLocationClientOption$AMapLocationMode.Device_Sensors && this.d < 4){
             str1 = "��ǰGPS�ź�����λ�ø��¿��ܻ��ӳ�\n";
          }
          str = str+str1;
       }
    label_0036 :
       if (this.a != AMapLocationClientOption$AMapLocationMode.Device_Sensors) {
          if (("DISCONNECTED").equals(this.e)) {
             str1 = "�����豸δ���ӵ����磬�޷��������綨λ\n";
          }else if(("2G").equals(this.e)){
             str1 = "�����豸����״̬��̫�ã����綨λ���ܻ����ӳ�\n";
          }else if(this.b == null){
             str = str+"�����豸WIFI�����ѹرգ���WIFI������������߶�λ�ĳɹ���\n";
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
