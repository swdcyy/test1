package com.kuaishou.locallife.half_container.HalfParams;
import java.lang.String;
import com.kuaishou.locallife.half_container.ColorMode;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class HalfParams	// class@00148e
{
    public final ColorMode backgroundColor;
    public final String biz;
    public final float cornerRadius;
    public final boolean disableDarkMode;
    public final ColorMode dragBarColor;
    public final boolean enableScroll;
    public final boolean hasDragBar;
    public final float height;
    public final ColorMode maskColor;
    public final float maskOpacity;
    public final String pageName;

    public void HalfParams(){
       super(null, null, 0, null, 0, 0, false, null, false, null, false, 2047, null);
    }
    public void HalfParams(String p0,String p1,float p2,ColorMode p3,float p4,float p5,boolean p6,ColorMode p7,boolean p8,ColorMode p9,boolean p10){
       a.p(p0, "biz");
       a.p(p1, "pageName");
       a.p(p3, "backgroundColor");
       a.p(p7, "maskColor");
       a.p(p9, "dragBarColor");
       super();
       this.biz = p0;
       this.pageName = p1;
       this.cornerRadius = p2;
       this.backgroundColor = p3;
       this.height = p4;
       this.maskOpacity = p5;
       this.enableScroll = p6;
       this.maskColor = p7;
       this.hasDragBar = p8;
       this.dragBarColor = p9;
       this.disableDarkMode = p10;
    }
    public void HalfParams(String p0,String p1,float p2,ColorMode p3,float p4,float p5,boolean p6,ColorMode p7,boolean p8,ColorMode p9,boolean p10,int p11,u p12){
       int i = p11;
       String str = "";
       String str1 = (i & 0x01)? str: p0;
       if (!(i & 0x02)) {
          str = p1;
       }
       int i1 = (i & 0x04)? 0x41800000: p2;
       ColorMode uColorMode = (i & 0x08)? new ColorMode("19191E", "ffffff"): p3;
       int i2 = (i & 0x10)? 0x3f400000: p4;
       int i3 = (i & 0x20)? 0: p5;
       int i4 = 1;
       int i5 = (i & 0x40)? 1: p6;
       ColorMode uColorMode1 = (i & 0x0080)? new ColorMode("00FFFFFF", "00FFFFFF"): p7;
       if (!(i & 0x0100)) {
          i4 = p8;
       }
       ColorMode uColorMode2 = (i & 0x0200)? new ColorMode("6B6B6F", "C6C6C6"): p9;
       i = (i & 0x0400)? 0: p10;
       super(str1, str, i1, uColorMode, i2, i3, i5, uColorMode1, i4, uColorMode2, i);
       return;
    }
    public static HalfParams copy$default(HalfParams p0,String p1,String p2,float p3,ColorMode p4,float p5,float p6,boolean p7,ColorMode p8,boolean p9,ColorMode p10,boolean p11,int p12,Object p13){
       HalfParams halfParams = p0;
       int i = p12;
       HalfParams biz = (i & 0x01)? halfParams.biz: p1;
       HalfParams pageName = (i & 0x02)? halfParams.pageName: p2;
       HalfParams cornerRadius = (i & 0x04)? halfParams.cornerRadius: p3;
       HalfParams backgroundCo = (i & 0x08)? halfParams.backgroundColor: p4;
       HalfParams height = (i & 0x10)? halfParams.height: p5;
       HalfParams maskOpacity = (i & 0x20)? halfParams.maskOpacity: p6;
       HalfParams enableScroll = (i & 0x40)? halfParams.enableScroll: p7;
       HalfParams maskColor = (i & 0x0080)? halfParams.maskColor: p8;
       HalfParams hasDragBar = (i & 0x0100)? halfParams.hasDragBar: p9;
       HalfParams dragBarColor = (i & 0x0200)? halfParams.dragBarColor: p10;
       HalfParams disableDarkM = (i & 0x0400)? halfParams.disableDarkMode: p11;
       return p0.copy(biz, pageName, cornerRadius, backgroundCo, height, maskOpacity, enableScroll, maskColor, hasDragBar, dragBarColor, disableDarkM);
    }
    public final String component1(){
       return this.biz;
    }
    public final ColorMode component10(){
       return this.dragBarColor;
    }
    public final boolean component11(){
       return this.disableDarkMode;
    }
    public final String component2(){
       return this.pageName;
    }
    public final float component3(){
       return this.cornerRadius;
    }
    public final ColorMode component4(){
       return this.backgroundColor;
    }
    public final float component5(){
       return this.height;
    }
    public final float component6(){
       return this.maskOpacity;
    }
    public final boolean component7(){
       return this.enableScroll;
    }
    public final ColorMode component8(){
       return this.maskColor;
    }
    public final boolean component9(){
       return this.hasDragBar;
    }
    public final HalfParams copy(String p0,String p1,float p2,ColorMode p3,float p4,float p5,boolean p6,ColorMode p7,boolean p8,ColorMode p9,boolean p10){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       object oobject3 = p7;
       object oobject4 = p9;
       HalfParams halfParams = HalfParams.class;
       if (PatchProxy.isSupport(halfParams)) {
          Object[] objArray = new Object[11];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Float.valueOf(p2);
          objArray[3] = oobject2;
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Float.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = oobject3;
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = oobject4;
          objArray[10] = Boolean.valueOf(p10);
          Object obj = PatchProxy.apply(objArray, this, halfParams, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(p0, "biz");
       a.p(oobject1, "pageName");
       a.p(oobject2, "backgroundColor");
       a.p(oobject3, "maskColor");
       a.p(oobject4, "dragBarColor");
       halfParams = new HalfParams(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
       return v13;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HalfParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof HalfParams && (a.g(this.biz, p0.biz) && (a.g(this.pageName, p0.pageName) && (!Float.compare(this.cornerRadius, p0.cornerRadius) && (a.g(this.backgroundColor, p0.backgroundColor) && (!Float.compare(this.height, p0.height) && (!Float.compare(this.maskOpacity, p0.maskOpacity) && (this.enableScroll == p0.enableScroll && (a.g(this.maskColor, p0.maskColor) && (this.hasDragBar == p0.hasDragBar && (a.g(this.dragBarColor, p0.dragBarColor) && this.disableDarkMode == p0.disableDarkMode)))))))))))) {
          return true;
       }
       return false;
    }
    public final ColorMode getBackgroundColor(){
       return this.backgroundColor;
    }
    public final String getBiz(){
       return this.biz;
    }
    public final float getCornerRadius(){
       return this.cornerRadius;
    }
    public final boolean getDisableDarkMode(){
       return this.disableDarkMode;
    }
    public final ColorMode getDragBarColor(){
       return this.dragBarColor;
    }
    public final boolean getEnableScroll(){
       return this.enableScroll;
    }
    public final boolean getHasDragBar(){
       return this.hasDragBar;
    }
    public final float getHeight(){
       return this.height;
    }
    public final ColorMode getMaskColor(){
       return this.maskColor;
    }
    public final float getMaskOpacity(){
       return this.maskOpacity;
    }
    public final String getPageName(){
       return this.pageName;
    }
    public int hashCode(){
       HalfParams obj = PatchProxy.apply(null, this, HalfParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.biz;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       HalfParams tpageName = this.pageName;
       int i2 = (tpageName != null)? tpageName.hashCode(): 0;
       i1 = (((i1 + i2) * 31) + Float.floatToIntBits(this.cornerRadius)) * 31;
       tpageName = this.backgroundColor;
       i2 = (tpageName != null)? tpageName.hashCode(): 0;
       i1 = (((((i1 + i2) * 31) + Float.floatToIntBits(this.height)) * 31) + Float.floatToIntBits(this.maskOpacity)) * 31;
       tpageName = this.enableScroll;
       int i3 = 1;
       if (tpageName != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tpageName = this.maskColor;
       i2 = (tpageName != null)? tpageName.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tpageName = this.hasDragBar;
       if (tpageName != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       tpageName = this.dragBarColor;
       if (tpageName != null) {
          i = tpageName.hashCode();
       }
       i1 = (i1 + i) * 31;
       HalfParams tdisableDark = this.disableDarkMode;
       if (tdisableDark == null) {
          i3 = tdisableDark;
       }
       return (i1 + i3);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HalfParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HalfParams\(biz="+this.biz+", pageName="+this.pageName+", cornerRadius="+this.cornerRadius+", backgroundColor="+this.backgroundColor+", height="+this.height+", maskOpacity="+this.maskOpacity+", enableScroll="+this.enableScroll+", maskColor="+this.maskColor+", hasDragBar="+this.hasDragBar+", dragBarColor="+this.dragBarColor+", disableDarkMode="+this.disableDarkMode+"\)";
    }
}
