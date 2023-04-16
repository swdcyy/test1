package com.kwai.feature.api.platform.bridge.beans.QRCodeBridgeResult;
import java.io.Serializable;
import java.lang.Object;

public class QRCodeBridgeResult implements Serializable	// class@00106d
{
    public String mCode;
    public String mErrorMsg;
    public JsonObject mExtendInfo;
    public String mOriginQRCode;
    public int mResult;
    public static final long serialVersionUID = 0x67f575306b986912;

    public void QRCodeBridgeResult(){
       super();
    }
}
