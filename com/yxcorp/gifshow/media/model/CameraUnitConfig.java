package com.yxcorp.gifshow.media.model.CameraUnitConfig;
import java.io.Serializable;
import java.lang.Object;

public class CameraUnitConfig implements Serializable	// class@001d06
{
    public boolean mAllowEisWhenEffectOn;
    public boolean mEnable;
    public boolean mEnableBacklightDetection;
    public boolean mEnableLowLightBoost;
    public boolean mEnableSATCamera;
    public boolean mSupportSuperEis;
    public boolean mSupportSuperEisPro;
    public static final long serialVersionUID = 0x1a4ca965242c3d9;

    public void CameraUnitConfig(){
       super();
       this.mEnable = false;
       this.mSupportSuperEis = false;
       this.mSupportSuperEisPro = false;
       this.mAllowEisWhenEffectOn = false;
       this.mEnableLowLightBoost = false;
       this.mEnableSATCamera = false;
       this.mEnableBacklightDetection = false;
    }
    public boolean isEisEnable(){
       boolean b = (this.mEnable != null && (this.mSupportSuperEis != null || this.mSupportSuperEisPro != null))? true: false;
       return b;
    }
}
