package com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.PreSellItemInfo;
import java.io.Serializable;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.presell.PreSellItemInfo$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PreSellItemInfo implements Serializable	// class@00075a
{
    public final String mContent;
    public final String mName;
    public static final PreSellItemInfo$a Companion;
    public static final long serialVersionUID;

    static {
       PreSellItemInfo.Companion = new PreSellItemInfo$a(null);
    }
    public void PreSellItemInfo(){
       super(null, null, 3, null);
    }
    public void PreSellItemInfo(String p0,String p1){
       super();
       this.mName = p0;
       this.mContent = p1;
    }
    public void PreSellItemInfo(String p0,String p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = "";
       }
       if (p2 & 0x02) {
          p1 = "";
       }
       super(p0, p1);
       return;
    }
    public static PreSellItemInfo copy$default(PreSellItemInfo p0,String p1,String p2,int p3,Object p4){
       PreSellItemInfo mName;
       PreSellItemInfo mContent;
       if (p3 & 0x01) {
          mName = p0.mName;
       }
       if (p3 & 0x02) {
          mContent = p0.mContent;
       }
       return p0.copy(mName, mContent);
    }
    public final String component1(){
       return this.mName;
    }
    public final String component2(){
       return this.mContent;
    }
    public final PreSellItemInfo copy(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PreSellItemInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PreSellItemInfo(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PreSellItemInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PreSellItemInfo && (a.g(this.mName, p0.mName) && a.g(this.mContent, p0.mContent)))) {
          return true;
       }
       return false;
    }
    public final String getMContent(){
       return this.mContent;
    }
    public final String getMName(){
       return this.mName;
    }
    public int hashCode(){
       PreSellItemInfo obj = PatchProxy.apply(null, this, PreSellItemInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mName;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PreSellItemInfo tmContent = this.mContent;
       if (tmContent != null) {
          i = tmContent.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PreSellItemInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PreSellItemInfo\(mName="+this.mName+", mContent="+this.mContent+"\)";
    }
}
