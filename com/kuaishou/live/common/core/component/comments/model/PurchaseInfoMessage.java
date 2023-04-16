package com.kuaishou.live.common.core.component.comments.model.PurchaseInfoMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.String;

public class PurchaseInfoMessage extends QLiveMessage	// class@0010c4
{
    public String mCommodityId;
    public String mCommodityName;
    public String mJumpToken;
    public String mOrderId;
    public int mPurchaseCount;
    public boolean mShouldShowViewButton;
    public static final long serialVersionUID = 0xf307237fdd573dd3;

    public void PurchaseInfoMessage(){
       super();
    }
    public String getCommodityId(){
       return this.mCommodityId;
    }
    public String getCommodityName(){
       return this.mCommodityName;
    }
    public String getJumpToken(){
       return this.mJumpToken;
    }
    public String getOrderId(){
       return this.mOrderId;
    }
    public int getPurchaseCount(){
       return this.mPurchaseCount;
    }
    public PurchaseInfoMessage setCommodityId(String p0){
       this.mCommodityId = p0;
       return this;
    }
    public PurchaseInfoMessage setCommodityName(String p0){
       this.mCommodityName = p0;
       return this;
    }
    public PurchaseInfoMessage setJumpToken(String p0){
       this.mJumpToken = p0;
       return this;
    }
    public PurchaseInfoMessage setOrderId(String p0){
       this.mOrderId = p0;
       return this;
    }
    public PurchaseInfoMessage setPurchaseCount(int p0){
       this.mPurchaseCount = p0;
       return this;
    }
}
