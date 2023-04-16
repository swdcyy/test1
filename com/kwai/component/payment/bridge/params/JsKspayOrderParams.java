package com.kwai.component.payment.bridge.params.JsKspayOrderParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class JsKspayOrderParams implements Serializable	// class@0009f5
{
    public String mActivityDiscountCode;
    public String mCallback;
    public String mExtra;
    public String mLoadingIconUrl;
    public String mLoadingText;
    public String mMerchantId;
    public String mOutOrderNo;
    public String mPaymentChannelType;
    public String mPaymentMethod;
    public String mProvider;
    public static final long serialVersionUID = 0xd3b6a5be3eea0474;

    public void JsKspayOrderParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsKspayOrderParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsKspayOrderParams{mCallback=\'"+this.mCallback+'''+", mMerchantId=\'"+this.mMerchantId+'''+", mOutOrderNo=\'"+this.mOutOrderNo+'''+", mPaymentMethod=\'"+this.mPaymentMethod+'''+", mProvider=\'"+this.mProvider+'''+", mPaymentChannelType=\'"+this.mPaymentChannelType+'''+", mActivityDiscountCode=\'"+this.mActivityDiscountCode+'''+", mExtra=\'"+this.mExtra+'''+'}';
    }
}
