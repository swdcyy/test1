package com.kuaishou.merchant.transaction.detail.skupanel.model.PurchaseMethodInfo;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.detail.skupanel.model.PurchaseMethodInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PurchaseMethodInfo implements Serializable	// class@000783
{
    public String bottomBuyButtonText;
    public String encryptCode;
    public boolean mBtnSelected;
    public boolean mFromBind;
    public boolean selected;
    public String text;
    public String tips;
    public int type;
    public static final PurchaseMethodInfo$a Companion;
    public static final long serialVersionUID;

    static {
       PurchaseMethodInfo.Companion = new PurchaseMethodInfo$a(null);
    }
    public void PurchaseMethodInfo(String p0,int p1,String p2,boolean p3,String p4,String p5){
       super();
       this.text = p0;
       this.type = p1;
       this.tips = p2;
       this.selected = p3;
       this.bottomBuyButtonText = p4;
       this.encryptCode = p5;
    }
    public static PurchaseMethodInfo copy$default(PurchaseMethodInfo p0,String p1,int p2,String p3,boolean p4,String p5,String p6,int p7,Object p8){
       PurchaseMethodInfo text;
       PurchaseMethodInfo type;
       PurchaseMethodInfo tips;
       PurchaseMethodInfo selected;
       PurchaseMethodInfo bottomBuyBut;
       PurchaseMethodInfo encryptCode;
       if (p7 & 0x01) {
          text = p0.text;
       }
       if (p7 & 0x02) {
          type = p0.type;
       }
       p8 = type;
       if (p7 & 0x04) {
          tips = p0.tips;
       }
       PurchaseMethodInfo purchaseMeth = tips;
       if (p7 & 0x08) {
          selected = p0.selected;
       }
       PurchaseMethodInfo purchaseMeth1 = selected;
       if (p7 & 0x10) {
          bottomBuyBut = p0.bottomBuyButtonText;
       }
       PurchaseMethodInfo purchaseMeth2 = bottomBuyBut;
       if (p7 & 0x20) {
          encryptCode = p0.encryptCode;
       }
       return p0.copy(text, p8, purchaseMeth, purchaseMeth1, purchaseMeth2, encryptCode);
    }
    public final String component1(){
       return this.text;
    }
    public final int component2(){
       return this.type;
    }
    public final String component3(){
       return this.tips;
    }
    public final boolean component4(){
       return this.selected;
    }
    public final String component5(){
       return this.bottomBuyButtonText;
    }
    public final String component6(){
       return this.encryptCode;
    }
    public final PurchaseMethodInfo copy(String p0,int p1,String p2,boolean p3,String p4,String p5){
       Object obj;
       if (PatchProxy.isSupport(PurchaseMethodInfo.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Boolean.valueOf(p3),p4,p5};
          obj = PatchProxy.apply(objArray, this, PurchaseMethodInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PurchaseMethodInfo purchaseMeth = new PurchaseMethodInfo(p0, p1, p2, p3, p4, p5);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PurchaseMethodInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PurchaseMethodInfo && (a.g(this.text, p0.text) && (this.type == p0.type && (a.g(this.tips, p0.tips) && (this.selected == p0.selected && (a.g(this.bottomBuyButtonText, p0.bottomBuyButtonText) && a.g(this.encryptCode, p0.encryptCode)))))))) {
          return true;
       }
       return false;
    }
    public final String getBottomBuyButtonText(){
       return this.bottomBuyButtonText;
    }
    public final String getEncryptCode(){
       return this.encryptCode;
    }
    public final boolean getMBtnSelected(){
       return this.mBtnSelected;
    }
    public final boolean getMFromBind(){
       return this.mFromBind;
    }
    public final boolean getSelected(){
       return this.selected;
    }
    public final String getText(){
       return this.text;
    }
    public final String getTips(){
       return this.tips;
    }
    public final int getType(){
       return this.type;
    }
    public int hashCode(){
       PurchaseMethodInfo obj = PatchProxy.apply(null, this, PurchaseMethodInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.text;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = ((i1 * 31) + this.type) * 31;
       PurchaseMethodInfo ttips = this.tips;
       int i2 = (ttips != null)? ttips.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttips = this.selected;
       if (ttips != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       ttips = this.bottomBuyButtonText;
       i2 = (ttips != null)? ttips.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       ttips = this.encryptCode;
       if (ttips != null) {
          i = ttips.hashCode();
       }
       return (i1 + i);
    }
    public final void setBottomBuyButtonText(String p0){
       this.bottomBuyButtonText = p0;
    }
    public final void setEncryptCode(String p0){
       this.encryptCode = p0;
    }
    public final void setMBtnSelected(boolean p0){
       this.mBtnSelected = p0;
    }
    public final void setMFromBind(boolean p0){
       this.mFromBind = p0;
    }
    public final void setSelected(boolean p0){
       this.selected = p0;
    }
    public final void setText(String p0){
       this.text = p0;
    }
    public final void setTips(String p0){
       this.tips = p0;
    }
    public final void setType(int p0){
       this.type = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PurchaseMethodInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PurchaseMethodInfo\(text="+this.text+", type="+this.type+", tips="+this.tips+", selected="+this.selected+", bottomBuyButtonText="+this.bottomBuyButtonText+", encryptCode="+this.encryptCode+"\)";
    }
}
