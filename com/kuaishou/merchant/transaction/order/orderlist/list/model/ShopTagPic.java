package com.kuaishou.merchant.transaction.order.orderlist.list.model.ShopTagPic;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.ShopTagPic$a;
import nsd.u;
import java.lang.String;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.Style;
import java.lang.Object;

public final class ShopTagPic implements Serializable	// class@000898
{
    public String pic;
    public String shopTagBorderColor;
    public Style style;
    public static final ShopTagPic$a Companion;
    public static final long serialVersionUID;

    static {
       ShopTagPic.Companion = new ShopTagPic$a(null);
    }
    public void ShopTagPic(){
       super(null, null, null, 7, null);
    }
    public void ShopTagPic(String p0,String p1,Style p2){
       super();
       this.shopTagBorderColor = p0;
       this.pic = p1;
       this.style = p2;
    }
    public void ShopTagPic(String p0,String p1,Style p2,int p3,u p4){
       String str = "";
       if (p3 & 0x01) {
          p0 = str;
       }
       if (p3 & 0x02) {
          p1 = str;
       }
       if (p3 & 0x04) {
          p2 = new Style(0, 0, 3, null);
       }
       super(p0, p1, p2);
       return;
    }
    public final String getPic(){
       return this.pic;
    }
    public final String getShopTagBorderColor(){
       return this.shopTagBorderColor;
    }
    public final Style getStyle(){
       return this.style;
    }
    public final void setPic(String p0){
       this.pic = p0;
    }
    public final void setShopTagBorderColor(String p0){
       this.shopTagBorderColor = p0;
    }
    public final void setStyle(Style p0){
       this.style = p0;
    }
}
