package com.kwai.yoda.function.system.GetDeviceInfoFunction$DeviceInfoResultParams;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.system.GetDeviceInfoFunction$DeviceInfoResultParams$a;
import nsd.u;
import java.lang.String;

public final class GetDeviceInfoFunction$DeviceInfoResultParams extends FunctionResultParams	// class@0011e3
{
    public String mDeviceName;
    public String mIMEI;
    public String mMod;
    public String mSys;
    public static final GetDeviceInfoFunction$DeviceInfoResultParams$a Companion;
    public static final long serialVersionUID;

    static {
       GetDeviceInfoFunction$DeviceInfoResultParams.Companion = new GetDeviceInfoFunction$DeviceInfoResultParams$a(null);
    }
    public void GetDeviceInfoFunction$DeviceInfoResultParams(){
       super();
    }
    public final String getMDeviceName(){
       return this.mDeviceName;
    }
    public final String getMIMEI(){
       return this.mIMEI;
    }
    public final String getMMod(){
       return this.mMod;
    }
    public final String getMSys(){
       return this.mSys;
    }
    public final void setMDeviceName(String p0){
       this.mDeviceName = p0;
    }
    public final void setMIMEI(String p0){
       this.mIMEI = p0;
    }
    public final void setMMod(String p0){
       this.mMod = p0;
    }
    public final void setMSys(String p0){
       this.mSys = p0;
    }
}
