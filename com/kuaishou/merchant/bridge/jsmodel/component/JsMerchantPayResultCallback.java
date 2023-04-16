package com.kuaishou.merchant.bridge.jsmodel.component.JsMerchantPayResultCallback;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class JsMerchantPayResultCallback implements Serializable	// class@001614
{
    public String callbackId;
    public static final long serialVersionUID = 0x7ef017165b9963a6;

    public void JsMerchantPayResultCallback(String p0){
       super();
       this.callbackId = p0;
    }
}
