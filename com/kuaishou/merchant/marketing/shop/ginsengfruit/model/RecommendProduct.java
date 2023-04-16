package com.kuaishou.merchant.marketing.shop.ginsengfruit.model.RecommendProduct;
import java.io.Serializable;
import com.kuaishou.merchant.marketing.shop.ginsengfruit.model.RecommendProduct$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class RecommendProduct implements Serializable	// class@001be9
{
    public long itemCouponPrice;
    public String itemId;
    public String itemImage;
    public String itemName;
    public long itemOriginalPrice;
    public static final RecommendProduct$a Companion;
    public static final long serialVersionUID;

    static {
       RecommendProduct.Companion = new RecommendProduct$a(null);
    }
    public void RecommendProduct(){
       super();
    }
    public final long getItemCouponPrice(){
       return this.itemCouponPrice;
    }
    public final String getItemId(){
       return this.itemId;
    }
    public final String getItemImage(){
       return this.itemImage;
    }
    public final String getItemName(){
       return this.itemName;
    }
    public final long getItemOriginalPrice(){
       return this.itemOriginalPrice;
    }
    public final void setItemCouponPrice(long p0){
       this.itemCouponPrice = p0;
    }
    public final void setItemId(String p0){
       this.itemId = p0;
    }
    public final void setItemImage(String p0){
       this.itemImage = p0;
    }
    public final void setItemName(String p0){
       this.itemName = p0;
    }
    public final void setItemOriginalPrice(long p0){
       this.itemOriginalPrice = p0;
    }
}
