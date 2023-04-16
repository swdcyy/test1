package com.yxcorp.gifshow.growth.invitecode.model.FissionExtraInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.invitecode.model.FissionExtraInfo$a;
import nsd.u;
import com.yxcorp.gifshow.growth.invitecode.model.GrowthC2CDialogModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class FissionExtraInfo implements Serializable	// class@0013d0
{
    public final GrowthC2CDialogModel c2cDialog;
    public static final FissionExtraInfo$a Companion;
    public static final long serialVersionUID;

    static {
       FissionExtraInfo.Companion = new FissionExtraInfo$a(null);
    }
    public void FissionExtraInfo(){
       super(null, 1, null);
    }
    public void FissionExtraInfo(GrowthC2CDialogModel p0){
       super();
       this.c2cDialog = p0;
    }
    public void FissionExtraInfo(GrowthC2CDialogModel p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       super(p0);
       return;
    }
    public static FissionExtraInfo copy$default(FissionExtraInfo p0,GrowthC2CDialogModel p1,int p2,Object p3){
       FissionExtraInfo c2cDialog;
       if (p2 & 0x01) {
          c2cDialog = p0.c2cDialog;
       }
       return p0.copy(c2cDialog);
    }
    public final GrowthC2CDialogModel component1(){
       return this.c2cDialog;
    }
    public final FissionExtraInfo copy(GrowthC2CDialogModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FissionExtraInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FissionExtraInfo(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FissionExtraInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FissionExtraInfo && a.g(this.c2cDialog, p0.c2cDialog))) {
          return true;
       }
       return false;
    }
    public final GrowthC2CDialogModel getC2cDialog(){
       return this.c2cDialog;
    }
    public int hashCode(){
       FissionExtraInfo obj = PatchProxy.apply(null, this, FissionExtraInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.c2cDialog;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FissionExtraInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FissionExtraInfo\(c2cDialog="+this.c2cDialog+"\)";
    }
}
