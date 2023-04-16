package com.yxcorp.gateway.pay.params.PaymentInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PaymentInfo implements Serializable	// class@001242
{
    public String mActivityDiscountCode;
    public PaymentInfo$BankCard mBankCard;
    public String mChannelType;
    public String mExtra;
    public PaymentInfo$Installment mInstallment;
    public String mLoadingIconUrl;
    public String mLoadingText;
    public String mMerchantId;
    public String mOutOrderNo;
    public String mPaymentMethod;
    public String mProvider;
    public static final long serialVersionUID = 0x8aa77788e28682eb;

    public void PaymentInfo(){
       super();
    }
    public String getActivityDiscountCode(){
       return this.mActivityDiscountCode;
    }
    public String getChannelType(){
       return this.mChannelType;
    }
    public String getExtra(){
       return this.mExtra;
    }
    public String getMerchantId(){
       return this.mMerchantId;
    }
    public String getOutOrderNo(){
       return this.mOutOrderNo;
    }
    public String getPaymentMethod(){
       return this.mPaymentMethod;
    }
    public String getProvider(){
       return this.mProvider;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PaymentInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PaymentInfo{mMerchantId=\'"+this.mMerchantId+'''+", mOutOrderNo=\'"+this.mOutOrderNo+'''+", mProvider=\'"+this.mProvider+'''+", mChannelType=\'"+this.mChannelType+'''+", mPaymentMethod=\'"+this.mPaymentMethod+'''+", mActivityDiscountCode=\'"+this.mActivityDiscountCode+'''+", mExtra=\'"+this.mExtra+'''+", mBankCard="+this.mBankCard+", mInstallment="+this.mInstallment+'}';
    }
}
