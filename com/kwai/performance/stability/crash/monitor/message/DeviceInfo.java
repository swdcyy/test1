package com.kwai.performance.stability.crash.monitor.message.DeviceInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import vg7.h;
import java.lang.StringBuilder;

public class DeviceInfo implements Serializable	// class@000e35
{
    public int mBatteryLevel;
    public int mBatteryTemperature;
    public int mCpuCores;
    public String mCpuPlatform;
    public int mDensityDpi;
    public String mFingerprint;
    public String mIsCharging;
    public String mIsSupportArm64;
    public String mModel;
    public String mRomVersion;
    public int mScreenHeight;
    public int mScreenWidth;
    public String mSocName;
    public static final long serialVersionUID = 0xace59cd8d343cf6b;

    public void DeviceInfo(){
       super();
       this.mIsCharging = "Unknown";
       this.mIsSupportArm64 = "Unknown";
       this.mModel = "";
       this.mFingerprint = "";
       this.mCpuPlatform = "";
       this.mRomVersion = "";
       this.mSocName = "";
    }
    public String toString(){
       return (new h().a()+"\t设备型号: "+this.mModel+"\n"+"\t设备指纹: "+this.mFingerprint+"\n"+"\t芯片平台: "+this.mCpuPlatform+"\n"+"\tROM版本: "+this.mRomVersion+"\n"+"\tSOC: "+this.mSocName+"\n"+"\t是否充电: "+this.mIsCharging+"\n"+"\t是否支持64位: "+this.mIsSupportArm64+"\n"+"\tCPU核数: "+this.mCpuCores+"\n"+"\tDPI: "+this.mDensityDpi+"\n"+"\t屏幕宽度: "+this.mScreenWidth+"\n"+"\t屏幕高度: "+this.mScreenHeight+"\n"+"\t电量: "+this.mBatteryLevel+"\n"+"\t电池温度: "+this.mBatteryTemperature+"\n").substring(0);
    }
}
