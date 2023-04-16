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
       return (new h().a()+"\t�豸�ͺ�: "+this.mModel+"\n"+"\t�豸ָ��: "+this.mFingerprint+"\n"+"\tоƬƽ̨: "+this.mCpuPlatform+"\n"+"\tROM�汾: "+this.mRomVersion+"\n"+"\tSOC: "+this.mSocName+"\n"+"\t�Ƿ���: "+this.mIsCharging+"\n"+"\t�Ƿ�֧��64λ: "+this.mIsSupportArm64+"\n"+"\tCPU����: "+this.mCpuCores+"\n"+"\tDPI: "+this.mDensityDpi+"\n"+"\t��Ļ���: "+this.mScreenWidth+"\n"+"\t��Ļ�߶�: "+this.mScreenHeight+"\n"+"\t����: "+this.mBatteryLevel+"\n"+"\t����¶�: "+this.mBatteryTemperature+"\n").substring(0);
    }
}
