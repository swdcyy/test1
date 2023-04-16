package com.kuaishou.merchant.transaction.live.dynamic.component.buybutton.BuyButtonModel;
import com.kuaishou.merchant.transaction.base.dynamic.model.BaseDynamicItemModel;
import java.util.HashSet;
import java.lang.String;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BuyButton;
import com.google.gson.JsonObject;

public class BuyButtonModel extends BaseDynamicItemModel	// class@000790
{
    public OrderConfirmLogParam$AgreementInfo mAgreementInfo;
    public ButtonRelateInfo mButtonRelateInfo;
    public BuyButton mBuyButton;
    public Commodity$FakeText mFakeText;
    public JsonObject mLog;
    public String mPrice;
    public ButtonRelateInfo mProgressFullButton;
    public MerchantLivePurchasePanelResponse$PurchaseAgreementInfo mPurchaseAgreementInfo;
    public HashSet mSignedAgreementSet;
    public ButtonRelateInfo mSoldOutButton;

    public void BuyButtonModel(){
       super();
       this.mSignedAgreementSet = new HashSet();
    }
    public String getButtonActionData(){
       BuyButtonModel tmBuyButton = this.mBuyButton;
       if (tmBuyButton == null) {
          return "";
       }
       return tmBuyButton.mButtonActionData;
    }
    public int getBuyButtonType(){
       BuyButtonModel tmBuyButton = this.mBuyButton;
       if (tmBuyButton == null) {
          return -1;
       }
       return tmBuyButton.mButtonType;
    }
    public JsonObject getServerParams(){
       return this.mLog;
    }
}
