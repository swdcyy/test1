package com.kuaishou.live.core.show.redpacket.richcard.http.ItemInfo;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.ItemInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import java.lang.Number;
import android.net.Uri;
import java.lang.StringBuilder;

public final class ItemInfo implements Serializable	// class@000f87
{
    public long itemCount;
    public final String itemIcon;
    public final int itemId;
    public final String itemName;
    public final String itemType;
    public final int itemTypeValue;
    public static final ItemInfo$a Companion;
    public static final long serialVersionUID;

    static {
       ItemInfo.Companion = new ItemInfo$a(null);
    }
    public void ItemInfo(String p0,int p1,int p2,String p3,String p4,long p5){
       super();
       this.itemType = p0;
       this.itemTypeValue = p1;
       this.itemId = p2;
       this.itemName = p3;
       this.itemIcon = p4;
       this.itemCount = p5;
    }
    public static ItemInfo copy$default(ItemInfo p0,String p1,int p2,int p3,String p4,String p5,long p6,int p7,Object p8){
       ItemInfo itemType;
       ItemInfo itemTypeValu;
       ItemInfo itemId;
       ItemInfo itemName;
       ItemInfo itemIcon;
       ItemInfo itemCount;
       if (p7 & 0x01) {
          itemType = p0.itemType;
       }
       if (p7 & 0x02) {
          itemTypeValu = p0.itemTypeValue;
       }
       p8 = itemTypeValu;
       if (p7 & 0x04) {
          itemId = p0.itemId;
       }
       ItemInfo itemInfo = itemId;
       if (p7 & 0x08) {
          itemName = p0.itemName;
       }
       ItemInfo itemInfo1 = itemName;
       if (p7 & 0x10) {
          itemIcon = p0.itemIcon;
       }
       ItemInfo itemInfo2 = itemIcon;
       if (p7 & 0x20) {
          itemCount = p0.itemCount;
       }
       return p0.copy(itemType, p8, itemInfo, itemInfo1, itemInfo2, itemCount);
    }
    public final String component1(){
       return this.itemType;
    }
    public final int component2(){
       return this.itemTypeValue;
    }
    public final int component3(){
       return this.itemId;
    }
    public final String component4(){
       return this.itemName;
    }
    public final String component5(){
       return this.itemIcon;
    }
    public final long component6(){
       return this.itemCount;
    }
    public final ItemInfo copy(String p0,int p1,int p2,String p3,String p4,long p5){
       Object obj;
       if (PatchProxy.isSupport(ItemInfo.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4,Long.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, ItemInfo.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       ItemInfo itemInfo = new ItemInfo(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ItemInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof ItemInfo && (a.g(this.itemType, p0.itemType) && (this.itemTypeValue == p0.itemTypeValue && (this.itemId == p0.itemId && (a.g(this.itemName, p0.itemName) && (a.g(this.itemIcon, p0.itemIcon) && !this.itemCount - p0.itemCount))))))) {
          return true;
       }
       return false;
    }
    public final long getItemCount(){
       return this.itemCount;
    }
    public final String getItemIcon(){
       return this.itemIcon;
    }
    public final int getItemId(){
       return this.itemId;
    }
    public final String getItemName(){
       return this.itemName;
    }
    public final String getItemType(){
       return this.itemType;
    }
    public final int getItemTypeValue(){
       return this.itemTypeValue;
    }
    public final JsonObject getJsonObject(){
       JsonObject obj = PatchProxy.apply(null, this, ItemInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.a0("itemCount", Long.valueOf(this.itemCount));
       obj.c0("itemIcon", Uri.encode(this.itemIcon));
       obj.c0("itemName", this.itemName);
       return obj;
    }
    public int hashCode(){
       ItemInfo obj = PatchProxy.apply(null, this, ItemInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.itemType;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((((i1 * 31) + this.itemTypeValue) * 31) + this.itemId) * 31;
       ItemInfo titemName = this.itemName;
       int i2 = (titemName != null)? titemName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       titemName = this.itemIcon;
       if (titemName != null) {
          i = titemName.hashCode();
       }
       ItemInfo titemCount = this.itemCount;
       return (((i1 + i) * 31) + (int)(titemCount ^ (titemCount >> 32)));
    }
    public final void setItemCount(long p0){
       this.itemCount = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ItemInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ItemInfo\(itemType="+this.itemType+", itemTypeValue="+this.itemTypeValue+", itemId="+this.itemId+", itemName="+this.itemName+", itemIcon="+this.itemIcon+", itemCount="+this.itemCount+"\)";
    }
}
