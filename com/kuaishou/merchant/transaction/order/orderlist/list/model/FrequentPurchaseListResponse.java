package com.kuaishou.merchant.transaction.order.orderlist.list.model.FrequentPurchaseListResponse;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.FrequentPurchaseListResponse$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import com.kuaishou.merchant.transaction.order.orderlist.list.model.FavorShopInfo;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import java.util.Collection;

public final class FrequentPurchaseListResponse implements Serializable	// class@00088d
{
    public FavorShopInfo favorShopInfo;
    public boolean isFavorPurchaseUpLoad;
    public List items;
    public String jumpUrl;
    public String showSwithch;
    public String title;
    public String viewMore;
    public static final FrequentPurchaseListResponse$a Companion;
    public static final long serialVersionUID;

    static {
       FrequentPurchaseListResponse.Companion = new FrequentPurchaseListResponse$a(null);
    }
    public void FrequentPurchaseListResponse(){
       super(null, null, null, null, null, null, false, 127, null);
    }
    public void FrequentPurchaseListResponse(String p0,String p1,String p2,List p3,String p4,FavorShopInfo p5,boolean p6){
       super();
       this.title = p0;
       this.viewMore = p1;
       this.jumpUrl = p2;
       this.items = p3;
       this.showSwithch = p4;
       this.favorShopInfo = p5;
       this.isFavorPurchaseUpLoad = p6;
    }
    public void FrequentPurchaseListResponse(String p0,String p1,String p2,List p3,String p4,FavorShopInfo p5,boolean p6,int p7,u p8){
       ArrayList uArrayList;
       String str = "";
       String str1 = (p7 & 0x01)? str: p0;
       String str2 = (p7 & 0x02)? str: p1;
       String str3 = (p7 & 0x04)? str: p2;
       if (p7 & 0x08) {
          uArrayList = new ArrayList();
       }
       ArrayList uArrayList1 = uArrayList;
       if (!(p7 & 0x10)) {
          str = p4;
       }
       if (p7 & 0x20) {
          p5 = null;
       }
       FavorShopInfo uFavorShopIn = p5;
       boolean b = (p7 & 0x40)? false: p6;
       super(str1, str2, str3, uArrayList1, str, uFavorShopIn, b);
       return;
    }
    public static final FrequentPurchaseListResponse empty(){
       Object[] objArray = null;
       FrequentPurchaseListResponse$a obj = PatchProxy.apply(objArray, objArray, FrequentPurchaseListResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FrequentPurchaseListResponse.Companion;
       Objects.requireNonNull(obj);
       FrequentPurchaseListResponse uFrequentPur = PatchProxy.apply(objArray, obj, FrequentPurchaseListResponse$a.class, "1");
       if (uFrequentPur != PatchProxyResult.class) {
       }else {
          FrequentPurchaseListResponse uFrequentPur1 = new FrequentPurchaseListResponse(null, null, null, null, null, null, false, 127, null);
       }
       return uFrequentPur;
    }
    public final FavorShopInfo getFavorShopInfo(){
       return this.favorShopInfo;
    }
    public final List getItems(){
       return this.items;
    }
    public final String getJumpUrl(){
       return this.jumpUrl;
    }
    public final String getShowSwithch(){
       return this.showSwithch;
    }
    public final String getTitle(){
       return this.title;
    }
    public final String getViewMore(){
       return this.viewMore;
    }
    public final boolean isFavorPurchaseUpLoad(){
       return this.isFavorPurchaseUpLoad;
    }
    public final boolean isFavorShop(){
       Object obj = PatchProxy.apply(null, this, FrequentPurchaseListResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("favorShop").equals(this.showSwithch);
    }
    public final boolean isValid(){
       Object[] objArray = null;
       FrequentPurchaseListResponse obj = PatchProxy.apply(objArray, this, FrequentPurchaseListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.isFavorShop()) {
          obj = this.favorShopInfo;
          if (obj != null) {
             objArray = obj.getShopList();
          }
          boolean b1 = (objArray == null || objArray.isEmpty())? true: false;
          if (b1) {
          label_0032 :
             if (!this.isFavorShop()) {
                obj = this.items;
                b1 = (obj == null || obj.isEmpty())? 1: 0;
                if (b1) {
                label_0049 :
                   b = false;
                }
             }else {
                goto label_0049 ;
             }
          }
       }else {
          goto label_0032 ;
       }
       return b;
    }
    public final void setFavorPurchaseUpLoad(boolean p0){
       this.isFavorPurchaseUpLoad = p0;
    }
    public final void setFavorShopInfo(FavorShopInfo p0){
       this.favorShopInfo = p0;
    }
    public final void setItems(List p0){
       this.items = p0;
    }
    public final void setJumpUrl(String p0){
       this.jumpUrl = p0;
    }
    public final void setShowSwithch(String p0){
       this.showSwithch = p0;
    }
    public final void setTitle(String p0){
       this.title = p0;
    }
    public final void setViewMore(String p0){
       this.viewMore = p0;
    }
}
