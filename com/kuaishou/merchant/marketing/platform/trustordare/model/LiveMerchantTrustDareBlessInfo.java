package com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareBlessInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public final class LiveMerchantTrustDareBlessInfo implements Serializable	// class@001b69
{
    public List mBlessBgUrls;
    public String mBlessDes;
    public String mButtonTitle;
    public String mJumpUrl;
    public final long serialVersionUID;

    public void LiveMerchantTrustDareBlessInfo(){
       super();
       this.serialVersionUID = 0x54f0e36675538c69;
       this.mBlessDes = "";
       this.mBlessBgUrls = new ArrayList();
       this.mButtonTitle = "";
       this.mJumpUrl = "";
    }
    public final List getMBlessBgUrls(){
       return this.mBlessBgUrls;
    }
    public final String getMBlessDes(){
       return this.mBlessDes;
    }
    public final String getMButtonTitle(){
       return this.mButtonTitle;
    }
    public final String getMJumpUrl(){
       return this.mJumpUrl;
    }
    public final void setMBlessBgUrls(List p0){
       this.mBlessBgUrls = p0;
    }
    public final void setMBlessDes(String p0){
       this.mBlessDes = p0;
    }
    public final void setMButtonTitle(String p0){
       this.mButtonTitle = p0;
    }
    public final void setMJumpUrl(String p0){
       this.mJumpUrl = p0;
    }
}
