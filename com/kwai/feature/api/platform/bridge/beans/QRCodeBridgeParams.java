package com.kwai.feature.api.platform.bridge.beans.QRCodeBridgeParams;
import java.io.Serializable;
import java.lang.Object;

public class QRCodeBridgeParams implements Serializable	// class@00106c
{
    public String mActivityType;
    public String mCallback;
    public String mFromScene;
    public boolean mIsForceCloseScanPage;
    public boolean mIsNeedCallBack;
    public List mTargetHandlerActionList;
    public static final long serialVersionUID = 0xfb9fd6ce87c98564;

    public void QRCodeBridgeParams(){
       super();
    }
}
