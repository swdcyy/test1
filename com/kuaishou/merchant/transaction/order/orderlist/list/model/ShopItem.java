package com.kuaishou.merchant.transaction.order.orderlist.list.model.ShopItem;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.ShopItem$a;
import nsd.u;
import java.lang.String;
import java.lang.Long;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.ShopTagPic;
import java.lang.Object;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.Style;

public final class ShopItem implements Serializable	// class@000896
{
    public String sellerFullName;
    public Long sellerId;
    public String sellerLogo;
    public boolean shopHasUpload;
    public String shopLink;
    public int shopTag;
    public ShopTagPic shopTagPic;
    public static final ShopItem$a Companion;
    public static final long serialVersionUID;

    static {
       ShopItem.Companion = new ShopItem$a(null);
    }
    public void ShopItem(){
       super(null, null, null, null, 0, null, false, 127, null);
    }
    public void ShopItem(String p0,String p1,String p2,Long p3,int p4,ShopTagPic p5,boolean p6){
       super();
       this.sellerFullName = p0;
       this.sellerLogo = p1;
       this.shopLink = p2;
       this.sellerId = p3;
       this.shopTag = p4;
       this.shopTagPic = p5;
       this.shopHasUpload = p6;
    }
    public void ShopItem(String p0,String p1,String p2,Long p3,int p4,ShopTagPic p5,boolean p6,int p7,u p8){
       String str = "";
       String str1 = (p7 & 0x01)? str: p0;
       String str2 = (p7 & 0x02)? str: p1;
       if (!(p7 & 0x04)) {
          str = p2;
       }
       Long longx = (p7 & 0x08)? Long.valueOf(0): p3;
       int i = 0;
       int i1 = (p7 & 0x10)? 0: p4;
       if (p7 & 0x20) {
          ShopTagPic shopTagPic = new ShopTagPic(0, 0, 0, 7, 0);
       }else {
          int i2 = p5;
       }
       if (!(p7 & 0x40)) {
          i = p6;
       }
       super(str1, str2, str, longx, i1, v6, i);
       return;
    }
    public final String getSellerFullName(){
       return this.sellerFullName;
    }
    public final Long getSellerId(){
       return this.sellerId;
    }
    public final String getSellerLogo(){
       return this.sellerLogo;
    }
    public final boolean getShopHasUpload(){
       return this.shopHasUpload;
    }
    public final String getShopLink(){
       return this.shopLink;
    }
    public final int getShopTag(){
       return this.shopTag;
    }
    public final ShopTagPic getShopTagPic(){
       return this.shopTagPic;
    }
    public final void setSellerFullName(String p0){
       this.sellerFullName = p0;
    }
    public final void setSellerId(Long p0){
       this.sellerId = p0;
    }
    public final void setSellerLogo(String p0){
       this.sellerLogo = p0;
    }
    public final void setShopHasUpload(boolean p0){
       this.shopHasUpload = p0;
    }
    public final void setShopLink(String p0){
       this.shopLink = p0;
    }
    public final void setShopTag(int p0){
       this.shopTag = p0;
    }
    public final void setShopTagPic(ShopTagPic p0){
       this.shopTagPic = p0;
    }
}
