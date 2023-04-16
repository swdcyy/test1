package com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareRedPacketStyle;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;

public final class LiveMerchantTrustDareRedPacketStyle implements Serializable	// class@001b6d
{
    public List mBottomBgUrls;
    public List mContentBgUrls;
    public List mMiddleBgUrls;
    public final long serialVersionUID;

    public void LiveMerchantTrustDareRedPacketStyle(){
       super();
       this.serialVersionUID = 0x4955b8448f9a29;
       this.mMiddleBgUrls = new ArrayList();
       this.mBottomBgUrls = new ArrayList();
       this.mContentBgUrls = new ArrayList();
    }
    public final List getMBottomBgUrls(){
       return this.mBottomBgUrls;
    }
    public final List getMContentBgUrls(){
       return this.mContentBgUrls;
    }
    public final List getMMiddleBgUrls(){
       return this.mMiddleBgUrls;
    }
    public final void setMBottomBgUrls(List p0){
       this.mBottomBgUrls = p0;
    }
    public final void setMContentBgUrls(List p0){
       this.mContentBgUrls = p0;
    }
    public final void setMMiddleBgUrls(List p0){
       this.mMiddleBgUrls = p0;
    }
}
