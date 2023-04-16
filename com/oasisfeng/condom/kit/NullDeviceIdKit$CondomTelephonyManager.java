package com.oasisfeng.condom.kit.NullDeviceIdKit$CondomTelephonyManager;
import android.telephony.TelephonyManager;
import com.oasisfeng.condom.kit.NullDeviceIdKit;
import android.content.Context;
import java.lang.String;
import android.telephony.PhoneStateListener;

public class NullDeviceIdKit$CondomTelephonyManager extends TelephonyManager	// class@000a99
{
    public final NullDeviceIdKit a;

    public void NullDeviceIdKit$CondomTelephonyManager(NullDeviceIdKit p0,Context p1){
       this.a = p0;
       super(p1);
    }
    public String getDeviceId(){
       return null;
    }
    public String getDeviceId(int p0){
       return null;
    }
    public String getImei(){
       return null;
    }
    public String getImei(int p0){
       return null;
    }
    public String getLine1Number(){
       return null;
    }
    public String getMeid(){
       return null;
    }
    public String getMeid(int p0){
       return null;
    }
    public String getSimSerialNumber(){
       return null;
    }
    public String getSubscriberId(){
       return null;
    }
    public void listen(PhoneStateListener p0,int p1){
       if (p1 & 0x0e) {
          super.listen(p0, (p1 & 0xf1));
       }else {
          super.listen(p0, p1);
       }
       return;
    }
}
