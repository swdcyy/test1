package com.yxcorp.gifshow.model.response.login.QRCodeLoginResponse;
import java.io.Serializable;
import java.lang.Object;

public class QRCodeLoginResponse implements Serializable	// class@001f97
{
    public long mExpireTime;
    public String mLoginText;
    public String mQRLoginToken;

    public void QRCodeLoginResponse(){
       super();
    }
}
