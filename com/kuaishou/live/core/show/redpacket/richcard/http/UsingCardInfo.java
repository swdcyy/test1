package com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo;
import java.io.Serializable;
import com.kuaishou.live.core.show.redpacket.richcard.http.UsingCardInfo$a;
import nsd.u;
import com.kuaishou.live.core.show.redpacket.richcard.http.ItemInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Number;
import java.util.Arrays;
import java.lang.StringBuilder;

public final class UsingCardInfo implements Serializable	// class@000f9d
{
    public int cardCanUseRemainCount;
    public final int cardCanUseTotalCount;
    public final long cardId;
    public int cardUsedCount;
    public final ItemInfo[] itemInfoList;
    public static final UsingCardInfo$a Companion;
    public static final long serialVersionUID;

    static {
       UsingCardInfo.Companion = new UsingCardInfo$a(null);
    }
    public void UsingCardInfo(long p0,int p1,int p2,int p3,ItemInfo[] p4){
       super();
       this.cardId = p0;
       this.cardCanUseTotalCount = p1;
       this.cardUsedCount = p2;
       this.cardCanUseRemainCount = p3;
       this.itemInfoList = p4;
    }
    public static UsingCardInfo copy$default(UsingCardInfo p0,long p1,int p2,int p3,int p4,ItemInfo[] p5,int p6,Object p7){
       UsingCardInfo cardId;
       UsingCardInfo cardCanUseTo;
       UsingCardInfo cardUsedCoun;
       UsingCardInfo cardCanUseRe;
       UsingCardInfo itemInfoList;
       if (p6 & 0x01) {
          cardId = p0.cardId;
       }
       UsingCardInfo usingCardInf = cardId;
       if (p6 & 0x02) {
          cardCanUseTo = p0.cardCanUseTotalCount;
       }
       UsingCardInfo usingCardInf1 = cardCanUseTo;
       if (p6 & 0x04) {
          cardUsedCoun = p0.cardUsedCount;
       }
       UsingCardInfo usingCardInf2 = cardUsedCoun;
       if (p6 & 0x08) {
          cardCanUseRe = p0.cardCanUseRemainCount;
       }
       UsingCardInfo usingCardInf3 = cardCanUseRe;
       if (p6 & 0x10) {
          itemInfoList = p0.itemInfoList;
       }
       return p0.copy(usingCardInf, usingCardInf1, usingCardInf2, usingCardInf3, itemInfoList);
    }
    public final long component1(){
       return this.cardId;
    }
    public final int component2(){
       return this.cardCanUseTotalCount;
    }
    public final int component3(){
       return this.cardUsedCount;
    }
    public final int component4(){
       return this.cardCanUseRemainCount;
    }
    public final ItemInfo[] component5(){
       return this.itemInfoList;
    }
    public final UsingCardInfo copy(long p0,int p1,int p2,int p3,ItemInfo[] p4){
       Object obj;
       if (PatchProxy.isSupport(UsingCardInfo.class)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, UsingCardInfo.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       UsingCardInfo usingCardInf = new UsingCardInfo(p0, p1, p2, p3, p4);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UsingCardInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof UsingCardInfo && (!this.cardId - p0.cardId && (this.cardCanUseTotalCount == p0.cardCanUseTotalCount && (this.cardUsedCount == p0.cardUsedCount && (this.cardCanUseRemainCount == p0.cardCanUseRemainCount && a.g(this.itemInfoList, p0.itemInfoList))))))) {
          return true;
       }
       return false;
    }
    public final int getCardCanUseRemainCount(){
       return this.cardCanUseRemainCount;
    }
    public final int getCardCanUseTotalCount(){
       return this.cardCanUseTotalCount;
    }
    public final long getCardId(){
       return this.cardId;
    }
    public final int getCardUsedCount(){
       return this.cardUsedCount;
    }
    public final ItemInfo[] getItemInfoList(){
       return this.itemInfoList;
    }
    public final String getItemInfosJson(){
       JsonArray obj = PatchProxy.apply(null, this, UsingCardInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonArray();
       UsingCardInfo titemInfoLis = this.itemInfoList;
       if (titemInfoLis != null) {
          int len = titemInfoLis.length;
          for (int i = 0; i < len; i = i + 1) {
             obj.G(titemInfoLis[i].getJsonObject());
          }
       }
       return a.a.p(obj);
    }
    public int hashCode(){
       UsingCardInfo obj = PatchProxy.apply(null, this, UsingCardInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.cardId;
       int i = (((((((int)(obj ^ (obj >> 32)) * 31) + this.cardCanUseTotalCount) * 31) + this.cardUsedCount) * 31) + this.cardCanUseRemainCount) * 31;
       obj = this.itemInfoList;
       int i1 = (obj != null)? Arrays.hashCode(obj): 0;
       return (i + i1);
    }
    public final void setCardCanUseRemainCount(int p0){
       this.cardCanUseRemainCount = p0;
    }
    public final void setCardUsedCount(int p0){
       this.cardUsedCount = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, UsingCardInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UsingCardInfo\(cardId="+this.cardId+", cardCanUseTotalCount="+this.cardCanUseTotalCount+", cardUsedCount="+this.cardUsedCount+", cardCanUseRemainCount="+this.cardCanUseRemainCount+", itemInfoList="+Arrays.toString(this.itemInfoList)+"\)";
    }
}
