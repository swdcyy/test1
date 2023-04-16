package com.kuaishou.gifshow.network.freetraffic.model.FreeTrafficDeviceInfoResponse;
import java.io.Serializable;
import java.lang.Object;

public class FreeTrafficDeviceInfoResponse implements Serializable	// class@00084a
{
    public List mAutoActiveTypes;
    public long mCreatedTime;
    public long mDuration;
    public String mFreeTrafficType;
    public boolean mIsActivated;
    public int mKCardProduct;
    public FreeTrafficDeviceInfoResponse$PromptInfo mMessage;
    public String mMobileCipher;
    public int mProductType;
    public long mStatusUpdateTime;
    public boolean mSwitch;
    public static final long serialVersionUID = 0x5b24c048d032b841;

    public void FreeTrafficDeviceInfoResponse(){
       super();
    }
}
