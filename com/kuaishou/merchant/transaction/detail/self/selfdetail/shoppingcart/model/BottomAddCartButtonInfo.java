package com.kuaishou.merchant.transaction.detail.self.selfdetail.shoppingcart.model.BottomAddCartButtonInfo;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.shoppingcart.model.BottomAddCartButtonInfo$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class BottomAddCartButtonInfo implements Serializable	// class@000760
{
    public List mBackgroundColors;
    public String mButtonText;
    public String mJumpUrl;
    public boolean mShowButton;
    public static final BottomAddCartButtonInfo$a Companion;
    public static final long serialVersionUID;

    static {
       BottomAddCartButtonInfo.Companion = new BottomAddCartButtonInfo$a(null);
    }
    public void BottomAddCartButtonInfo(String p0,boolean p1,String p2,List p3){
       super();
       this.mJumpUrl = p0;
       this.mShowButton = p1;
       this.mButtonText = p2;
       this.mBackgroundColors = p3;
    }
    public void BottomAddCartButtonInfo(String p0,boolean p1,String p2,List p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = "";
       }
       if (p4 & 0x04) {
          p2 = "";
       }
       if (p4 & 0x08) {
          p3 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static BottomAddCartButtonInfo copy$default(BottomAddCartButtonInfo p0,String p1,boolean p2,String p3,List p4,int p5,Object p6){
       BottomAddCartButtonInfo mJumpUrl;
       BottomAddCartButtonInfo mShowButton;
       BottomAddCartButtonInfo mButtonText;
       BottomAddCartButtonInfo mBackgroundC;
       if (p5 & 0x01) {
          mJumpUrl = p0.mJumpUrl;
       }
       if (p5 & 0x02) {
          mShowButton = p0.mShowButton;
       }
       if (p5 & 0x04) {
          mButtonText = p0.mButtonText;
       }
       if (p5 & 0x08) {
          mBackgroundC = p0.mBackgroundColors;
       }
       return p0.copy(mJumpUrl, mShowButton, mButtonText, mBackgroundC);
    }
    public final String component1(){
       return this.mJumpUrl;
    }
    public final boolean component2(){
       return this.mShowButton;
    }
    public final String component3(){
       return this.mButtonText;
    }
    public final List component4(){
       return this.mBackgroundColors;
    }
    public final BottomAddCartButtonInfo copy(String p0,boolean p1,String p2,List p3){
       if (PatchProxy.isSupport(BottomAddCartButtonInfo.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, BottomAddCartButtonInfo.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new BottomAddCartButtonInfo(p0, p1, p2, p3);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BottomAddCartButtonInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof BottomAddCartButtonInfo && (a.g(this.mJumpUrl, p0.mJumpUrl) && (this.mShowButton == p0.mShowButton && (a.g(this.mButtonText, p0.mButtonText) && a.g(this.mBackgroundColors, p0.mBackgroundColors)))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       BottomAddCartButtonInfo obj = PatchProxy.apply(null, this, BottomAddCartButtonInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mJumpUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       BottomAddCartButtonInfo tmShowButton = this.mShowButton;
       if (tmShowButton != null) {
          tmShowButton = 1;
       }
       i1 = (i1 + tmShowButton) * 31;
       tmShowButton = this.mButtonText;
       int i2 = (tmShowButton != null)? tmShowButton.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmShowButton = this.mBackgroundColors;
       if (tmShowButton != null) {
          i = tmShowButton.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BottomAddCartButtonInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BottomAddCartButtonInfo\(mJumpUrl="+this.mJumpUrl+", mShowButton="+this.mShowButton+", mButtonText="+this.mButtonText+", mBackgroundColors="+this.mBackgroundColors+"\)";
    }
}
