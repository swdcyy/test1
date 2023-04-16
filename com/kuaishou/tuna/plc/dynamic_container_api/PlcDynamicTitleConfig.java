package com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig$a;
import nsd.u;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleConfig$b;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.util.Collection;
import java.util.Iterator;
import com.kuaishou.tuna.plc.dynamic_container_api.PlcDynamicTitleIconInfo;

public final class PlcDynamicTitleConfig implements Serializable, Parcelable	// class@001021
{
    public final int closeType;
    public final boolean disableDarkMode;
    public final List leftIcons;
    public String navBarBackgroundColor;
    public String navBarBackgroundColorDark;
    public final List rightIcons;
    public List searchWords;
    public final String titleText;
    public boolean useSearchBar;
    public static final Parcelable$Creator CREATOR;
    public static final PlcDynamicTitleConfig$a Companion;
    public static final long serialVersionUID;

    static {
       PlcDynamicTitleConfig.Companion = new PlcDynamicTitleConfig$a(null);
       PlcDynamicTitleConfig.CREATOR = new PlcDynamicTitleConfig$b();
    }
    public void PlcDynamicTitleConfig(){
       super(false, 0, null, null, null, null, null, false, null, 511, null);
    }
    public void PlcDynamicTitleConfig(boolean p0,int p1,String p2,String p3,String p4,List p5,List p6,boolean p7,List p8){
       a.p(p2, "navBarBackgroundColor");
       a.p(p3, "navBarBackgroundColorDark");
       a.p(p4, "titleText");
       a.p(p5, "leftIcons");
       a.p(p6, "rightIcons");
       super();
       this.disableDarkMode = p0;
       this.closeType = p1;
       this.navBarBackgroundColor = p2;
       this.navBarBackgroundColorDark = p3;
       this.titleText = p4;
       this.leftIcons = p5;
       this.rightIcons = p6;
       this.useSearchBar = p7;
       this.searchWords = p8;
    }
    public void PlcDynamicTitleConfig(boolean p0,int p1,String p2,String p3,String p4,List p5,List p6,boolean p7,List p8,int p9,u p10){
       int i = p9;
       int i1 = 0;
       int i2 = (i & 0x01)? 0: p0;
       int i3 = (i & 0x02)? 0: p1;
       String str = "";
       String str1 = (i & 0x04)? str: p2;
       String str2 = (i & 0x08)? str: p3;
       if (!(i & 0x10)) {
          str = p4;
       }
       ArrayList uArrayList = (i & 0x20)? new ArrayList(): p5;
       ArrayList uArrayList1 = (i & 0x40)? new ArrayList(): p6;
       if (!(i & 0x0080)) {
          i1 = p7;
       }
       i = (i & 0x0100)? 0: p8;
       super(i2, i3, str1, str2, str, uArrayList, uArrayList1, i1, i);
       return;
    }
    public static PlcDynamicTitleConfig copy$default(PlcDynamicTitleConfig p0,boolean p1,int p2,String p3,String p4,String p5,List p6,List p7,boolean p8,List p9,int p10,Object p11){
       PlcDynamicTitleConfig plcDynamicTi = p0;
       int i = p10;
       PlcDynamicTitleConfig disableDarkM = (i & 0x01)? plcDynamicTi.disableDarkMode: p1;
       PlcDynamicTitleConfig closeType = (i & 0x02)? plcDynamicTi.closeType: p2;
       PlcDynamicTitleConfig navBarBackgr = (i & 0x04)? plcDynamicTi.navBarBackgroundColor: p3;
       PlcDynamicTitleConfig navBarBackgr1 = (i & 0x08)? plcDynamicTi.navBarBackgroundColorDark: p4;
       PlcDynamicTitleConfig titleText = (i & 0x10)? plcDynamicTi.titleText: p5;
       PlcDynamicTitleConfig leftIcons = (i & 0x20)? plcDynamicTi.leftIcons: p6;
       PlcDynamicTitleConfig rightIcons = (i & 0x40)? plcDynamicTi.rightIcons: p7;
       PlcDynamicTitleConfig useSearchBar = (i & 0x0080)? plcDynamicTi.useSearchBar: p8;
       PlcDynamicTitleConfig searchWords = (i & 0x0100)? plcDynamicTi.searchWords: p9;
       return p0.copy(disableDarkM, closeType, navBarBackgr, navBarBackgr1, titleText, leftIcons, rightIcons, useSearchBar, searchWords);
    }
    public final boolean component1(){
       return this.disableDarkMode;
    }
    public final int component2(){
       return this.closeType;
    }
    public final String component3(){
       return this.navBarBackgroundColor;
    }
    public final String component4(){
       return this.navBarBackgroundColorDark;
    }
    public final String component5(){
       return this.titleText;
    }
    public final List component6(){
       return this.leftIcons;
    }
    public final List component7(){
       return this.rightIcons;
    }
    public final boolean component8(){
       return this.useSearchBar;
    }
    public final List component9(){
       return this.searchWords;
    }
    public final PlcDynamicTitleConfig copy(boolean p0,int p1,String p2,String p3,String p4,List p5,List p6,boolean p7,List p8){
       PlcDynamicTitleConfig obj;
       object oobject = p2;
       object oobject1 = p3;
       object oobject2 = p4;
       object oobject3 = p5;
       object oobject4 = p6;
       if (PatchProxy.isSupport(PlcDynamicTitleConfig.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = Boolean.valueOf(p0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = oobject;
          objArray[3] = oobject1;
          objArray[4] = oobject2;
          objArray[5] = oobject3;
          objArray[6] = oobject4;
          objArray[7] = Boolean.valueOf(p7);
          objArray[8] = p8;
          obj = PatchProxy.apply(objArray, this, PlcDynamicTitleConfig.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p2, "navBarBackgroundColor");
       a.p(oobject1, "navBarBackgroundColorDark");
       a.p(oobject2, "titleText");
       a.p(oobject3, "leftIcons");
       a.p(oobject4, "rightIcons");
       obj = new PlcDynamicTitleConfig(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v11;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcDynamicTitleConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PlcDynamicTitleConfig && (this.disableDarkMode == p0.disableDarkMode && (this.closeType == p0.closeType && (a.g(this.navBarBackgroundColor, p0.navBarBackgroundColor) && (a.g(this.navBarBackgroundColorDark, p0.navBarBackgroundColorDark) && (a.g(this.titleText, p0.titleText) && (a.g(this.leftIcons, p0.leftIcons) && (a.g(this.rightIcons, p0.rightIcons) && (this.useSearchBar == p0.useSearchBar && a.g(this.searchWords, p0.searchWords))))))))))) {
          return true;
       }
       return false;
    }
    public final int getCloseType(){
       return this.closeType;
    }
    public final boolean getDisableDarkMode(){
       return this.disableDarkMode;
    }
    public final List getLeftIcons(){
       return this.leftIcons;
    }
    public final String getNavBarBackgroundColor(){
       return this.navBarBackgroundColor;
    }
    public final String getNavBarBackgroundColorDark(){
       return this.navBarBackgroundColorDark;
    }
    public final List getRightIcons(){
       return this.rightIcons;
    }
    public final List getSearchWords(){
       return this.searchWords;
    }
    public final String getTitleText(){
       return this.titleText;
    }
    public final boolean getUseSearchBar(){
       return this.useSearchBar;
    }
    public int hashCode(){
       int i1;
       PlcDynamicTitleConfig tsearchWords;
       PlcDynamicTitleConfig obj = PatchProxy.apply(null, this, PlcDynamicTitleConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.disableDarkMode;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = ((i1 * 31) + this.closeType) * 31;
       PlcDynamicTitleConfig tnavBarBackg = this.navBarBackgroundColor;
       int i2 = 0;
       int i3 = (tnavBarBackg != null)? tnavBarBackg.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tnavBarBackg = this.navBarBackgroundColorDark;
       i3 = (tnavBarBackg != null)? tnavBarBackg.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tnavBarBackg = this.titleText;
       i3 = (tnavBarBackg != null)? tnavBarBackg.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tnavBarBackg = this.leftIcons;
       i3 = (tnavBarBackg != null)? tnavBarBackg.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tnavBarBackg = this.rightIcons;
       i3 = (tnavBarBackg != null)? tnavBarBackg.hashCode(): 0;
       i1 = (i1 + i3) * 31;
       tnavBarBackg = this.useSearchBar;
       if (tnavBarBackg == null) {
          tsearchWords = tnavBarBackg;
       }
       i1 = (i1 + i) * 31;
       tsearchWords = this.searchWords;
       if (tsearchWords != null) {
          i2 = tsearchWords.hashCode();
       }
       return (i1 + i2);
    }
    public final void setNavBarBackgroundColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicTitleConfig.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.navBarBackgroundColor = p0;
       return;
    }
    public final void setNavBarBackgroundColorDark(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcDynamicTitleConfig.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.navBarBackgroundColorDark = p0;
       return;
    }
    public final void setSearchWords(List p0){
       this.searchWords = p0;
    }
    public final void setUseSearchBar(boolean p0){
       this.useSearchBar = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PlcDynamicTitleConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PlcDynamicTitleConfig\(disableDarkMode="+this.disableDarkMode+", closeType="+this.closeType+", navBarBackgroundColor="+this.navBarBackgroundColor+", navBarBackgroundColorDark="+this.navBarBackgroundColorDark+", titleText="+this.titleText+", leftIcons="+this.leftIcons+", rightIcons="+this.rightIcons+", useSearchBar="+this.useSearchBar+", searchWords="+this.searchWords+"\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PlcDynamicTitleConfig.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PlcDynamicTitleConfig.class, "7")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.disableDarkMode);
       p0.writeInt(this.closeType);
       p0.writeString(this.navBarBackgroundColor);
       p0.writeString(this.navBarBackgroundColorDark);
       p0.writeString(this.titleText);
       PlcDynamicTitleConfig tleftIcons = this.leftIcons;
       p0.writeInt(tleftIcons.size());
       Iterator iterator = tleftIcons.iterator();
       while (iterator.hasNext()) {
          iterator.next().writeToParcel(p0, 0);
       }
       tleftIcons = this.rightIcons;
       p0.writeInt(tleftIcons.size());
       iterator = tleftIcons.iterator();
       while (iterator.hasNext()) {
          iterator.next().writeToParcel(p0, 0);
       }
       p0.writeInt(this.useSearchBar);
       p0.writeStringList(this.searchWords);
       return;
    }
}
