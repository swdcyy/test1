package com.kuaishou.merchant.api.live.basic.model.LiveMerchantConfirmTextInfo;
import java.io.Serializable;
import java.lang.Object;

public class LiveMerchantConfirmTextInfo implements Serializable	// class@001561
{
    public boolean mDisableShopLive;
    public String mDisableShopLiveText;
    public boolean mEnableReduceExposure;
    public String mMerchantForbiddenText;
    public String mMerchantForbiddenTitle;
    public String mMerchantReadmeText;
    public String mMerchantReadmeTitle;
    public LiveReduceExposureExplainInfo mReduceExposureExplainInfo;
    public String mReduceExposureText;
    public static final long serialVersionUID = 0x54a900df23a1bf84;

    public void LiveMerchantConfirmTextInfo(){
       super();
    }
}
