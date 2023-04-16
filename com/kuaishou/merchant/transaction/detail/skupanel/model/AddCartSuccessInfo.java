package com.kuaishou.merchant.transaction.detail.skupanel.model.AddCartSuccessInfo;
import java.io.Serializable;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class AddCartSuccessInfo implements Serializable	// class@000781
{
    public String mExtra;
    public int mItemCount;
    public String mItemId;
    public String mSkuId;

    public void AddCartSuccessInfo(){
       super(null, null, 0, null, 15, null);
    }
    public void AddCartSuccessInfo(String p0,String p1,int p2,String p3){
       super();
       this.mItemId = p0;
       this.mSkuId = p1;
       this.mItemCount = p2;
       this.mExtra = p3;
    }
    public void AddCartSuccessInfo(String p0,String p1,int p2,String p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = "";
       }
       if (p4 & 0x02) {
          p1 = "";
       }
       if (p4 & 0x04) {
          p2 = 1;
       }
       if (p4 & 0x08) {
          p3 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static AddCartSuccessInfo copy$default(AddCartSuccessInfo p0,String p1,String p2,int p3,String p4,int p5,Object p6){
       AddCartSuccessInfo mItemId;
       AddCartSuccessInfo mSkuId;
       AddCartSuccessInfo mItemCount;
       AddCartSuccessInfo mExtra;
       if (p5 & 0x01) {
          mItemId = p0.mItemId;
       }
       if (p5 & 0x02) {
          mSkuId = p0.mSkuId;
       }
       if (p5 & 0x04) {
          mItemCount = p0.mItemCount;
       }
       if (p5 & 0x08) {
          mExtra = p0.mExtra;
       }
       return p0.copy(mItemId, mSkuId, mItemCount, mExtra);
    }
    public final String component1(){
       return this.mItemId;
    }
    public final String component2(){
       return this.mSkuId;
    }
    public final int component3(){
       return this.mItemCount;
    }
    public final String component4(){
       return this.mExtra;
    }
    public final AddCartSuccessInfo copy(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(AddCartSuccessInfo.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, this, AddCartSuccessInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new AddCartSuccessInfo(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AddCartSuccessInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof AddCartSuccessInfo && (a.g(this.mItemId, p0.mItemId) && (a.g(this.mSkuId, p0.mSkuId) && (this.mItemCount == p0.mItemCount && a.g(this.mExtra, p0.mExtra)))))) {
          return true;
       }
       return false;
    }
    public final String getMExtra(){
       return this.mExtra;
    }
    public final int getMItemCount(){
       return this.mItemCount;
    }
    public final String getMItemId(){
       return this.mItemId;
    }
    public final String getMSkuId(){
       return this.mSkuId;
    }
    public int hashCode(){
       AddCartSuccessInfo obj = PatchProxy.apply(null, this, AddCartSuccessInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mItemId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       AddCartSuccessInfo tmSkuId = this.mSkuId;
       int i2 = (tmSkuId != null)? tmSkuId.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + this.mItemCount) * 31;
       tmSkuId = this.mExtra;
       if (tmSkuId != null) {
          i = tmSkuId.hashCode();
       }
       return (i1 + i);
    }
    public final void setMExtra(String p0){
       this.mExtra = p0;
    }
    public final void setMItemCount(int p0){
       this.mItemCount = p0;
    }
    public final void setMItemId(String p0){
       this.mItemId = p0;
    }
    public final void setMSkuId(String p0){
       this.mSkuId = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AddCartSuccessInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AddCartSuccessInfo\(mItemId="+this.mItemId+", mSkuId="+this.mSkuId+", mItemCount="+this.mItemCount+", mExtra="+this.mExtra+"\)";
    }
}
