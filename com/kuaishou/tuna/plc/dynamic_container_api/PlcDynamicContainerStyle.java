package com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle$a;
import nsd.u;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicContainerStyle$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class PlcDynamicContainerStyle implements Serializable, Parcelable	// class@00101e
{
    public final String containerBackgroundColor;
    public final String containerBackgroundColorDark;
    public final String containerCloseIconUrl;
    public final float containerRadiusDp;
    public float dialogAnchorPercent;
    public final boolean disableDarkMode;
    public int dragStyle;
    public final boolean hasCloseButton;
    public final boolean hasDragBar;
    public static final Parcelable$Creator CREATOR;
    public static final PlcDynamicContainerStyle$a Companion;
    public static final long serialVersionUID;

    static {
       PlcDynamicContainerStyle.Companion = new PlcDynamicContainerStyle$a(null);
       PlcDynamicContainerStyle.CREATOR = new PlcDynamicContainerStyle$b();
    }
    public void PlcDynamicContainerStyle(){
       super(false, 0, 0, null, null, 0, false, false, null, 511, null);
    }
    public void PlcDynamicContainerStyle(boolean p0,float p1,float p2,String p3,String p4,int p5,boolean p6,boolean p7,String p8){
       a.p(p3, "containerBackgroundColor");
       a.p(p4, "containerBackgroundColorDark");
       a.p(p8, "containerCloseIconUrl");
       super();
       this.disableDarkMode = p0;
       this.containerRadiusDp = p1;
       this.dialogAnchorPercent = p2;
       this.containerBackgroundColor = p3;
       this.containerBackgroundColorDark = p4;
       this.dragStyle = p5;
       this.hasDragBar = p6;
       this.hasCloseButton = p7;
       this.containerCloseIconUrl = p8;
    }
    public void PlcDynamicContainerStyle(boolean p0,float p1,float p2,String p3,String p4,int p5,boolean p6,boolean p7,String p8,int p9,u p10){
       int i = p9;
       int i1 = 0;
       int i2 = (i & 0x01)? 0: p0;
       int i3 = (i & 0x02)? 0x41800000: p1;
       int i4 = (i & 0x04)? 0x3f400000: p2;
       String str = (i & 0x08)? "#FFFFFFFF": p3;
       String str1 = (i & 0x10)? "#FF19191E": p4;
       int i5 = (i & 0x20)? 0: p5;
       int i6 = (i & 0x40)? 0: p6;
       if (!(i & 0x0080)) {
          i1 = p7;
       }
       String str2 = (i & 0x0100)? "": p8;
       super(i2, i3, i4, str, str1, i5, i6, i1, str2);
       return;
    }
    public static PlcDynamicContainerStyle copy$default(PlcDynamicContainerStyle p0,boolean p1,float p2,float p3,String p4,String p5,int p6,boolean p7,boolean p8,String p9,int p10,Object p11){
       PlcDynamicContainerStyle plcDynamicCo = p0;
       int i = p10;
       PlcDynamicContainerStyle disableDarkM = (i & 0x01)? plcDynamicCo.disableDarkMode: p1;
       PlcDynamicContainerStyle containerRad = (i & 0x02)? plcDynamicCo.containerRadiusDp: p2;
       PlcDynamicContainerStyle dialogAnchor = (i & 0x04)? plcDynamicCo.dialogAnchorPercent: p3;
       PlcDynamicContainerStyle containerBac = (i & 0x08)? plcDynamicCo.containerBackgroundColor: p4;
       PlcDynamicContainerStyle containerBac1 = (i & 0x10)? plcDynamicCo.containerBackgroundColorDark: p5;
       PlcDynamicContainerStyle dragStyle = (i & 0x20)? plcDynamicCo.dragStyle: p6;
       PlcDynamicContainerStyle hasDragBar = (i & 0x40)? plcDynamicCo.hasDragBar: p7;
       PlcDynamicContainerStyle hasCloseButt = (i & 0x0080)? plcDynamicCo.hasCloseButton: p8;
       PlcDynamicContainerStyle containerClo = (i & 0x0100)? plcDynamicCo.containerCloseIconUrl: p9;
       return p0.copy(disableDarkM, containerRad, dialogAnchor, containerBac, containerBac1, dragStyle, hasDragBar, hasCloseButt, containerClo);
    }
    public final boolean component1(){
       return this.disableDarkMode;
    }
    public final float component2(){
       return this.containerRadiusDp;
    }
    public final float component3(){
       return this.dialogAnchorPercent;
    }
    public final String component4(){
       return this.containerBackgroundColor;
    }
    public final String component5(){
       return this.containerBackgroundColorDark;
    }
    public final int component6(){
       return this.dragStyle;
    }
    public final boolean component7(){
       return this.hasDragBar;
    }
    public final boolean component8(){
       return this.hasCloseButton;
    }
    public final String component9(){
       return this.containerCloseIconUrl;
    }
    public final PlcDynamicContainerStyle copy(boolean p0,float p1,float p2,String p3,String p4,int p5,boolean p6,boolean p7,String p8){
       PlcDynamicContainerStyle obj;
       object oobject = p3;
       object oobject1 = p4;
       object oobject2 = p8;
       if (PatchProxy.isSupport(PlcDynamicContainerStyle.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = Boolean.valueOf(p0);
          objArray[1] = Float.valueOf(p1);
          objArray[2] = Float.valueOf(p2);
          objArray[3] = oobject;
          objArray[4] = oobject1;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = oobject2;
          obj = PatchProxy.apply(objArray, this, PlcDynamicContainerStyle.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "containerBackgroundColor");
       a.p(oobject1, "containerBackgroundColorDark");
       a.p(oobject2, "containerCloseIconUrl");
       obj = new PlcDynamicContainerStyle(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v11;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicContainerStyle.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PlcDynamicContainerStyle && (this.disableDarkMode == p0.disableDarkMode && (!Float.compare(this.containerRadiusDp, p0.containerRadiusDp) && (!Float.compare(this.dialogAnchorPercent, p0.dialogAnchorPercent) && (a.g(this.containerBackgroundColor, p0.containerBackgroundColor) && (a.g(this.containerBackgroundColorDark, p0.containerBackgroundColorDark) && (this.dragStyle == p0.dragStyle && (this.hasDragBar == p0.hasDragBar && (this.hasCloseButton == p0.hasCloseButton && a.g(this.containerCloseIconUrl, p0.containerCloseIconUrl))))))))))) {
          return true;
       }
       return false;
    }
    public final String getContainerBackgroundColor(){
       return this.containerBackgroundColor;
    }
    public final String getContainerBackgroundColorDark(){
       return this.containerBackgroundColorDark;
    }
    public final String getContainerCloseIconUrl(){
       return this.containerCloseIconUrl;
    }
    public final float getContainerRadiusDp(){
       return this.containerRadiusDp;
    }
    public final float getDialogAnchorPercent(){
       return this.dialogAnchorPercent;
    }
    public final boolean getDisableDarkMode(){
       return this.disableDarkMode;
    }
    public final int getDragStyle(){
       return this.dragStyle;
    }
    public final boolean getHasCloseButton(){
       return this.hasCloseButton;
    }
    public final boolean getHasDragBar(){
       return this.hasDragBar;
    }
    public int hashCode(){
       int i1;
       PlcDynamicContainerStyle tcontainerCl;
       PlcDynamicContainerStyle obj = PatchProxy.apply(null, this, PlcDynamicContainerStyle.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.disableDarkMode;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = ((((i1 * 31) + Float.floatToIntBits(this.containerRadiusDp)) * 31) + Float.floatToIntBits(this.dialogAnchorPercent)) * 31;
       PlcDynamicContainerStyle tcontainerBa = this.containerBackgroundColor;
       int i2 = 0;
       int i3 = (tcontainerBa != null)? tcontainerBa.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tcontainerBa = this.containerBackgroundColorDark;
       i3 = (tcontainerBa != null)? tcontainerBa.hashCode(): 0;
       i1 = (((i1 + i3) * 31) + this.dragStyle) * 31;
       tcontainerBa = this.hasDragBar;
       if (tcontainerBa != null) {
          i3 = 1;
       }
       i1 = (i1 + i3) * 31;
       tcontainerBa = this.hasCloseButton;
       if (tcontainerBa == null) {
          tcontainerCl = tcontainerBa;
       }
       i1 = (i1 + i) * 31;
       tcontainerCl = this.containerCloseIconUrl;
       if (tcontainerCl != null) {
          i2 = tcontainerCl.hashCode();
       }
       return (i1 + i2);
    }
    public final boolean isFixedHeight(){
       PlcDynamicContainerStyle tdragStyle = this.dragStyle;
       boolean b = true;
       if (tdragStyle != b && tdragStyle != null) {
          b = false;
       }
       return b;
    }
    public final void setDialogAnchorPercent(float p0){
       this.dialogAnchorPercent = p0;
    }
    public final void setDragStyle(int p0){
       this.dragStyle = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicContainerStyle.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PlcDynamicContainerStyle\(disableDarkMode="+this.disableDarkMode+", containerRadiusDp="+this.containerRadiusDp+", dialogAnchorPercent="+this.dialogAnchorPercent+", containerBackgroundColor="+this.containerBackgroundColor+", containerBackgroundColorDark="+this.containerBackgroundColorDark+", dragStyle="+this.dragStyle+", hasDragBar="+this.hasDragBar+", hasCloseButton="+this.hasCloseButton+", containerCloseIconUrl="+this.containerCloseIconUrl+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PlcDynamicContainerStyle.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PlcDynamicContainerStyle.class, "5")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.disableDarkMode);
       p0.writeFloat(this.containerRadiusDp);
       p0.writeFloat(this.dialogAnchorPercent);
       p0.writeString(this.containerBackgroundColor);
       p0.writeString(this.containerBackgroundColorDark);
       p0.writeInt(this.dragStyle);
       p0.writeInt(this.hasDragBar);
       p0.writeInt(this.hasCloseButton);
       p0.writeString(this.containerCloseIconUrl);
       return;
    }
}
