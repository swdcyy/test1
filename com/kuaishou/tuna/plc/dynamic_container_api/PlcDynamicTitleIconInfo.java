package com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleIconInfo;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleIconInfo$a;
import nsd.u;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleIconInfo$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class PlcDynamicTitleIconInfo implements Serializable, Parcelable	// class@001024
{
    public final int actionType;
    public final String iconUrl;
    public final String iconUrlDark;
    public static final Parcelable$Creator CREATOR;
    public static final PlcDynamicTitleIconInfo$a Companion;
    public static final long serialVersionUID;

    static {
       PlcDynamicTitleIconInfo.Companion = new PlcDynamicTitleIconInfo$a(null);
       PlcDynamicTitleIconInfo.CREATOR = new PlcDynamicTitleIconInfo$b();
    }
    public void PlcDynamicTitleIconInfo(){
       super(null, null, 0, 7, null);
    }
    public void PlcDynamicTitleIconInfo(String p0,String p1,int p2){
       a.p(p0, "iconUrl");
       a.p(p1, "iconUrlDark");
       super();
       this.iconUrl = p0;
       this.iconUrlDark = p1;
       this.actionType = p2;
    }
    public void PlcDynamicTitleIconInfo(String p0,String p1,int p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = "";
       }
       if (p3 & 0x02) {
          p1 = "";
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static PlcDynamicTitleIconInfo copy$default(PlcDynamicTitleIconInfo p0,String p1,String p2,int p3,int p4,Object p5){
       PlcDynamicTitleIconInfo iconUrl;
       PlcDynamicTitleIconInfo iconUrlDark;
       PlcDynamicTitleIconInfo actionType;
       if (p4 & 0x01) {
          iconUrl = p0.iconUrl;
       }
       if (p4 & 0x02) {
          iconUrlDark = p0.iconUrlDark;
       }
       if (p4 & 0x04) {
          actionType = p0.actionType;
       }
       return p0.copy(iconUrl, iconUrlDark, actionType);
    }
    public final String component1(){
       return this.iconUrl;
    }
    public final String component2(){
       return this.iconUrlDark;
    }
    public final int component3(){
       return this.actionType;
    }
    public final PlcDynamicTitleIconInfo copy(String p0,String p1,int p2){
       if (PatchProxy.isSupport(PlcDynamicTitleIconInfo.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, PlcDynamicTitleIconInfo.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "iconUrl");
       a.p(p1, "iconUrlDark");
       return new PlcDynamicTitleIconInfo(p0, p1, p2);
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicTitleIconInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PlcDynamicTitleIconInfo && (a.g(this.iconUrl, p0.iconUrl) && (a.g(this.iconUrlDark, p0.iconUrlDark) && this.actionType == p0.actionType)))) {
          return true;
       }
       return false;
    }
    public final int getActionType(){
       return this.actionType;
    }
    public final String getIconUrl(){
       return this.iconUrl;
    }
    public final String getIconUrlDark(){
       return this.iconUrlDark;
    }
    public int hashCode(){
       PlcDynamicTitleIconInfo obj = PatchProxy.apply(null, this, PlcDynamicTitleIconInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.iconUrl;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       PlcDynamicTitleIconInfo ticonUrlDark = this.iconUrlDark;
       if (ticonUrlDark != null) {
          i = ticonUrlDark.hashCode();
       }
       return (((i1 + i) * 31) + this.actionType);
    }
    public final boolean isValid(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicTitleIconInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.actionType > 9 && !TextUtils.x(this.iconUrl))? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicTitleIconInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PlcDynamicTitleIconInfo\(iconUrl="+this.iconUrl+", iconUrlDark="+this.iconUrlDark+", actionType="+this.actionType+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PlcDynamicTitleIconInfo.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PlcDynamicTitleIconInfo.class, "6")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.iconUrl);
       p0.writeString(this.iconUrlDark);
       p0.writeInt(this.actionType);
       return;
    }
}
