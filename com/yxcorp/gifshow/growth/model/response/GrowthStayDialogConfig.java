package com.yxcorp.gifshow.growth.model.response.GrowthStayDialogConfig;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.model.response.GrowthStayDialogConfig$StayAccountDialog;
import com.yxcorp.gifshow.growth.model.response.GrowthStayDialogConfig$StayRelationDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class GrowthStayDialogConfig implements Serializable	// class@00144c
{
    public final GrowthStayDialogConfig$StayAccountDialog accountDialog;
    public final GrowthStayDialogConfig$StayRelationDialog relationDialog;

    public void GrowthStayDialogConfig(GrowthStayDialogConfig$StayAccountDialog p0,GrowthStayDialogConfig$StayRelationDialog p1){
       super();
       this.accountDialog = p0;
       this.relationDialog = p1;
    }
    public static GrowthStayDialogConfig copy$default(GrowthStayDialogConfig p0,GrowthStayDialogConfig$StayAccountDialog p1,GrowthStayDialogConfig$StayRelationDialog p2,int p3,Object p4){
       GrowthStayDialogConfig accountDialo;
       GrowthStayDialogConfig relationDial;
       if (p3 & 0x01) {
          accountDialo = p0.accountDialog;
       }
       if (p3 & 0x02) {
          relationDial = p0.relationDialog;
       }
       return p0.copy(accountDialo, relationDial);
    }
    public final GrowthStayDialogConfig$StayAccountDialog component1(){
       return this.accountDialog;
    }
    public final GrowthStayDialogConfig$StayRelationDialog component2(){
       return this.relationDialog;
    }
    public final GrowthStayDialogConfig copy(GrowthStayDialogConfig$StayAccountDialog p0,GrowthStayDialogConfig$StayRelationDialog p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GrowthStayDialogConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new GrowthStayDialogConfig(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthStayDialogConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof GrowthStayDialogConfig && (a.g(this.accountDialog, p0.accountDialog) && a.g(this.relationDialog, p0.relationDialog)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       GrowthStayDialogConfig obj = PatchProxy.apply(null, this, GrowthStayDialogConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.accountDialog;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       GrowthStayDialogConfig trelationDia = this.relationDialog;
       if (trelationDia != null) {
          i = trelationDia.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GrowthStayDialogConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "GrowthStayDialogConfig\(accountDialog="+this.accountDialog+", relationDialog="+this.relationDialog+"\)";
    }
}
