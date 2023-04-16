package com.kuaishou.merchant.transaction.order.orderlist.list.model.CommodityItem;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.CommodityItem$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;

public final class CommodityItem implements Serializable	// class@000889
{
    public int height;
    public String itemPicUrl;
    public int width;
    public static final CommodityItem$a Companion;
    public static final long serialVersionUID;

    static {
       CommodityItem.Companion = new CommodityItem$a(null);
    }
    public void CommodityItem(){
       super(null, 0, 0, 7, null);
    }
    public void CommodityItem(String p0,int p1,int p2){
       super();
       this.itemPicUrl = p0;
       this.height = p1;
       this.width = p2;
    }
    public void CommodityItem(String p0,int p1,int p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = "";
       }
       if (p3 & 0x02) {
          p1 = 0;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final int getHeight(){
       return this.height;
    }
    public final String getItemPicUrl(){
       return this.itemPicUrl;
    }
    public final int getWidth(){
       return this.width;
    }
    public final void setHeight(int p0){
       this.height = p0;
    }
    public final void setItemPicUrl(String p0){
       this.itemPicUrl = p0;
    }
    public final void setWidth(int p0){
       this.width = p0;
    }
}
