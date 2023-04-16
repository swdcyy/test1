package com.kuaishou.merchant.transaction.purchase.model.PrepayParam;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.base.model.BankCard;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo$Installment;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import java.lang.Throwable;
import o74.a;
import java.lang.Long;
import java.lang.Integer;
import java.lang.StringBuilder;

public class PrepayParam implements Serializable	// class@000949
{
    public final boolean IF_REPAY;
    public String mActivityDiscountCode;
    public String mBankCardPayType;
    public String mBankCardToken;
    public boolean mHide;
    public String mInstallmentProductNo;
    public int mPayLocationType;
    public String mPaymentMethod;
    public int mPrePayType;
    public String mProvider;
    public String mProviderChannelType;
    public String mSubCashierConfigScene;
    public long mTid;
    public String mTransactionPassThrough;
    public static final long serialVersionUID = 0x6029f173d34cb900;

    public void PrepayParam(long p0,boolean p1,String p2,String p3,String p4,String p5,String p6,int p7,String p8,String p9,String p10){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, 0, "");
    }
    public void PrepayParam(long p0,boolean p1,String p2,String p3,String p4,String p5,String p6,int p7,String p8,String p9,String p10,int p11,String p12){
       super();
       this.IF_REPAY = false;
       this.mTid = p0;
       this.mHide = p1;
       this.mProvider = p2;
       this.mProviderChannelType = p3;
       this.mPaymentMethod = p4;
       this.mInstallmentProductNo = p5;
       this.mTransactionPassThrough = p6;
       this.mPrePayType = p7;
       this.mBankCardToken = p8;
       this.mBankCardPayType = p9;
       this.mActivityDiscountCode = p10;
       this.mPayLocationType = p11;
       this.mSubCashierConfigScene = p12;
    }
    public static String forCreateOrderUnionApi(PaymentMethodInfo p0){
       PrepayParam obj = p0;
       PaymentMethodInfo$Installment installment = null;
       String obj1 = PatchProxy.applyOneRefs(obj, installment, PrepayParam.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = "";
       if (obj == null || !p0.isValid()) {
          PrepayParam prepayParam = new PrepayParam(0, false, null, null, null, null, null, 0, null, null, null);
       }else {
          BankCard selectedBank = p0.getSelectedBankCard();
          PaymentMethodInfo mProvider = obj.mProvider;
          PaymentMethodInfo mProviderCha = obj.mProviderChannelType;
          PaymentMethodInfo mPaymentMeth = obj.mPaymentMethod;
          if (p0.getSelectedInstallment() != null) {
             installment = p0.getSelectedInstallment().mInstallmentProductNo;
          }
          Object obj2 = installment;
          BankCard uBankCard = (selectedBank != null)? selectedBank.mToken: obj1;
          BankCard uBankCard1 = (selectedBank != null)? selectedBank.mBankCardPayType: obj1;
          PrepayParam prepayParam1 = new PrepayParam(0, true, mProvider, mProviderCha, mPaymentMeth, obj2, null, 0, uBankCard, uBankCard1, p0.getActivityDiscountCode(), 2000, p0.getSelectedSubCashierConfigScene());
       }
       obj = v19;
       try{
          obj1 = a.a.q(obj);
       }catch(java.lang.Exception e0){
          a.l(MerchantTransactionLogBiz.PURCHASE, "PrepayParam", "forCreateOrderUnionApi failed", e0);
       }
       return obj1;
    }
    public static PrepayParam forPrepayApi(PaymentMethodInfo p0,long p1,String p2,int p3){
       BankCard obj;
       PaymentMethodInfo paymentMetho = p0;
       if (PatchProxy.isSupport(PrepayParam.class)) {
          obj = PatchProxy.applyFourRefs(p0, Long.valueOf(p1), p2, Integer.valueOf(p3), null, PrepayParam.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!paymentMetho || !p0.isValid()) {
          PrepayParam prepayParam = new PrepayParam(p1, false, null, null, null, null, p2, p3, null, null, null, 2000, "");
          return obj;
       }else {
          obj = p0.getSelectedBankCard();
          PaymentMethodInfo mProvider = paymentMetho.mProvider;
          PaymentMethodInfo mProviderCha = paymentMetho.mProviderChannelType;
          PaymentMethodInfo mPaymentMeth = paymentMetho.mPaymentMethod;
          PaymentMethodInfo$Installment mInstallment = (p0.getSelectedInstallment() != null)? p0.getSelectedInstallment().mInstallmentProductNo: null;
          PaymentMethodInfo$Installment installment = mInstallment;
          String str = "";
          BankCard uBankCard = (obj != null)? obj.mToken: str;
          BankCard uBankCard1 = (obj != null)? obj.mBankCardPayType: str;
          PrepayParam prepayParam1 = new PrepayParam(p1, true, mProvider, mProviderCha, mPaymentMeth, installment, p2, p3, uBankCard, uBankCard1, p0.getActivityDiscountCode(), 2000, p0.getSelectedSubCashierConfigScene());
          return v16;
       }
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PrepayParam.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PrepayParam{mHide="+this.mHide+", mProvider=\'"+this.mProvider+'''+", mProviderChannelType=\'"+this.mProviderChannelType+'''+", mPaymentMethod=\'"+this.mPaymentMethod+'''+", IF_REPAY="+false+", mInstallmentProductNo=\'"+this.mInstallmentProductNo+'''+", mTid="+this.mTid+", mTransactionPassThrough=\'"+this.mTransactionPassThrough+'''+", mPrepayType="+this.mPrePayType+'}';
    }
}
