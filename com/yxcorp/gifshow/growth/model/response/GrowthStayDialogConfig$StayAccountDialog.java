package com.yxcorp.gifshow.growth.model.response.GrowthStayDialogConfig$StayAccountDialog;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthStayDialogConfig$StayAccountDialog implements Serializable	// class@00144a
{
    public final String cash;
    public final String coin;
    public final String desc;
    public final String detainBtn;
    public final String detainLink;
    public final String title;
    public final String uninstallBtn;

    public void GrowthStayDialogConfig$StayAccountDialog(String p0,String p1,String p2,String p3,String p4,String p5,String p6){
       super();
       this.title = p0;
       this.desc = p1;
       this.coin = p2;
       this.cash = p3;
       this.detainBtn = p4;
       this.detainLink = p5;
       this.uninstallBtn = p6;
    }
    public static GrowthStayDialogConfig$StayAccountDialog copy$default(GrowthStayDialogConfig$StayAccountDialog p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,int p8,Object p9){
       GrowthStayDialogConfig$StayAccountDialog title;
       GrowthStayDialogConfig$StayAccountDialog desc;
       GrowthStayDialogConfig$StayAccountDialog coin;
       GrowthStayDialogConfig$StayAccountDialog cash;
       GrowthStayDialogConfig$StayAccountDialog detainBtn;
       GrowthStayDialogConfig$StayAccountDialog detainLink;
       GrowthStayDialogConfig$StayAccountDialog uninstallBtn;
       if (p8 & 0x01) {
          title = p0.title;
       }
       if (p8 & 0x02) {
          desc = p0.desc;
       }
       p9 = desc;
       if (p8 & 0x04) {
          coin = p0.coin;
       }
       GrowthStayDialogConfig$StayAccountDialog stayAccountD = coin;
       if (p8 & 0x08) {
          cash = p0.cash;
       }
       GrowthStayDialogConfig$StayAccountDialog stayAccountD1 = cash;
       if (p8 & 0x10) {
          detainBtn = p0.detainBtn;
       }
       GrowthStayDialogConfig$StayAccountDialog stayAccountD2 = detainBtn;
       if (p8 & 0x20) {
          detainLink = p0.detainLink;
       }
       GrowthStayDialogConfig$StayAccountDialog stayAccountD3 = detainLink;
       if (p8 & 0x40) {
          uninstallBtn = p0.uninstallBtn;
       }
       return p0.copy(title, p9, stayAccountD, stayAccountD1, stayAccountD2, stayAccountD3, uninstallBtn);
    }
    public final String component1(){
       return this.title;
    }
    public final String component2(){
       return this.desc;
    }
    public final String component3(){
       return this.coin;
    }
    public final String component4(){
       return this.cash;
    }
    public final String component5(){
       return this.detainBtn;
    }
    public final String component6(){
       return this.detainLink;
    }
    public final String component7(){
       return this.uninstallBtn;
    }
    public final GrowthStayDialogConfig$StayAccountDialog copy(String p0,String p1,String p2,String p3,String p4,String p5,String p6){
       Object obj;
       if (PatchProxy.isSupport(GrowthStayDialogConfig$StayAccountDialog.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          obj = PatchProxy.apply(objArray, this, GrowthStayDialogConfig$StayAccountDialog.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       GrowthStayDialogConfig$StayAccountDialog stayAccountD = new GrowthStayDialogConfig$StayAccountDialog(p0, p1, p2, p3, p4, p5, p6);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthStayDialogConfig$StayAccountDialog.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthStayDialogConfig$StayAccountDialog && (a.g(this.title, p0.title) && (a.g(this.desc, p0.desc) && (a.g(this.coin, p0.coin) && (a.g(this.cash, p0.cash) && (a.g(this.detainBtn, p0.detainBtn) && (a.g(this.detainLink, p0.detainLink) && a.g(this.uninstallBtn, p0.uninstallBtn))))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthStayDialogConfig$StayAccountDialog obj = PatchProxy.apply(null, this, GrowthStayDialogConfig$StayAccountDialog.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.title;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       GrowthStayDialogConfig$StayAccountDialog tdesc = this.desc;
       int i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.coin;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.cash;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.detainBtn;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.detainLink;
       i2 = (tdesc != null)? tdesc.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tdesc = this.uninstallBtn;
       if (tdesc != null) {
          i = tdesc.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthStayDialogConfig$StayAccountDialog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StayAccountDialog\(title="+this.title+", desc="+this.desc+", coin="+this.coin+", cash="+this.cash+", detainBtn="+this.detainBtn+", detainLink="+this.detainLink+", uninstallBtn="+this.uninstallBtn+"\)";
    }
}
