package com.kuaishou.merchant.transaction.order.orderlist.list.model.FavorShopInfo;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.FavorShopInfo$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;

public final class FavorShopInfo implements Serializable	// class@00088b
{
    public boolean isFavorShopMoreUpLoad;
    public String jumpUrl;
    public List shopList;
    public String title;
    public String viewMore;
    public static final FavorShopInfo$a Companion;
    public static final long serialVersionUID;

    static {
       FavorShopInfo.Companion = new FavorShopInfo$a(null);
    }
    public void FavorShopInfo(){
       super(null, null, null, null, false, 31, null);
    }
    public void FavorShopInfo(String p0,String p1,String p2,List p3,boolean p4){
       super();
       this.title = p0;
       this.viewMore = p1;
       this.jumpUrl = p2;
       this.shopList = p3;
       this.isFavorShopMoreUpLoad = p4;
    }
    public void FavorShopInfo(String p0,String p1,String p2,List p3,boolean p4,int p5,u p6){
       ArrayList uArrayList;
       String str = "";
       String str1 = (p5 & 0x01)? str: p0;
       String str2 = (p5 & 0x02)? str: p1;
       if (!(p5 & 0x04)) {
          str = p2;
       }
       if (p5 & 0x08) {
          uArrayList = new ArrayList();
       }
       ArrayList uArrayList1 = uArrayList;
       boolean b = (p5 & 0x10)? false: p4;
       super(str1, str2, str, uArrayList1, b);
       return;
    }
    public final String getJumpUrl(){
       return this.jumpUrl;
    }
    public final List getShopList(){
       return this.shopList;
    }
    public final String getTitle(){
       return this.title;
    }
    public final String getViewMore(){
       return this.viewMore;
    }
    public final boolean isFavorShopMoreUpLoad(){
       return this.isFavorShopMoreUpLoad;
    }
    public final void setFavorShopMoreUpLoad(boolean p0){
       this.isFavorShopMoreUpLoad = p0;
    }
    public final void setJumpUrl(String p0){
       this.jumpUrl = p0;
    }
    public final void setShopList(List p0){
       this.shopList = p0;
    }
    public final void setTitle(String p0){
       this.title = p0;
    }
    public final void setViewMore(String p0){
       this.viewMore = p0;
    }
}
