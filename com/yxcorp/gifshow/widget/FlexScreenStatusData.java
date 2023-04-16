package com.yxcorp.gifshow.widget.FlexScreenStatusData;
import java.io.Serializable;
import nsd.u;
import java.lang.Object;
import android.content.Context;
import lnc.a1;
import android.graphics.Point;
import com.yxcorp.utility.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.StringBuilder;

public final class FlexScreenStatusData implements Serializable	// class@00184e
{
    public int bottomBarHeight;
    public int displayHeight;
    public boolean hasBottomBar;
    public boolean hasHole;
    public boolean hasSafeArea;
    public boolean hasStatusBar;
    public int holeHeight;
    public boolean isStatusBarInHole;
    public int screenRealHeight;
    public int screenRealWidth;
    public int statusBarHeight;

    public void FlexScreenStatusData(){
       super(false, false, false, false, false, 0, 0, 0, 0, 0, 0, 2047, null);
    }
    public void FlexScreenStatusData(boolean p0,boolean p1,boolean p2,boolean p3,boolean p4,int p5,int p6,int p7,int p8,int p9,int p10){
       super();
       this.hasBottomBar = p0;
       this.hasStatusBar = p1;
       this.hasHole = p2;
       this.isStatusBarInHole = p3;
       this.hasSafeArea = p4;
       this.statusBarHeight = p5;
       this.holeHeight = p6;
       this.bottomBarHeight = p7;
       this.displayHeight = p8;
       this.screenRealWidth = p9;
       this.screenRealHeight = p10;
       Point point = n.s(a1.c());
       this.screenRealWidth = point.x;
       this.screenRealHeight = point.y;
    }
    public void FlexScreenStatusData(boolean p0,boolean p1,boolean p2,boolean p3,boolean p4,int p5,int p6,int p7,int p8,int p9,int p10,int p11,u p12){
       int i = p11;
       int i1 = 0;
       int i2 = (i & 0x01)? 0: p0;
       int i3 = 1;
       int i4 = (i & 0x02)? 1: p1;
       if (!(i & 0x04)) {
          i3 = p2;
       }
       int i5 = (i & 0x08)? 0: p3;
       int i6 = (i & 0x10)? 0: p4;
       int i7 = (i & 0x20)? 0: p5;
       int i8 = (i & 0x40)? 0: p6;
       int i9 = (i & 0x0080)? 0: p7;
       int i10 = (i & 0x0100)? 0: p8;
       int i11 = (i & 0x0200)? 0: p9;
       if (!(i & 0x0400)) {
          i1 = p10;
       }
       super(i2, i4, i3, i5, i6, i7, i8, i9, i10, i11, i1);
       return;
    }
    public static FlexScreenStatusData copy$default(FlexScreenStatusData p0,boolean p1,boolean p2,boolean p3,boolean p4,boolean p5,int p6,int p7,int p8,int p9,int p10,int p11,int p12,Object p13){
       FlexScreenStatusData uFlexScreenS = p0;
       int i = p12;
       FlexScreenStatusData hasBottomBar = (i & 0x01)? uFlexScreenS.hasBottomBar: p1;
       FlexScreenStatusData hasStatusBar = (i & 0x02)? uFlexScreenS.hasStatusBar: p2;
       FlexScreenStatusData hasHole = (i & 0x04)? uFlexScreenS.hasHole: p3;
       FlexScreenStatusData isStatusBarI = (i & 0x08)? uFlexScreenS.isStatusBarInHole: p4;
       FlexScreenStatusData hasSafeArea = (i & 0x10)? uFlexScreenS.hasSafeArea: p5;
       FlexScreenStatusData statusBarHei = (i & 0x20)? uFlexScreenS.statusBarHeight: p6;
       FlexScreenStatusData holeHeight = (i & 0x40)? uFlexScreenS.holeHeight: p7;
       FlexScreenStatusData bottomBarHei = (i & 0x0080)? uFlexScreenS.bottomBarHeight: p8;
       FlexScreenStatusData displayHeigh = (i & 0x0100)? uFlexScreenS.displayHeight: p9;
       FlexScreenStatusData screenRealWi = (i & 0x0200)? uFlexScreenS.screenRealWidth: p10;
       FlexScreenStatusData screenRealHe = (i & 0x0400)? uFlexScreenS.screenRealHeight: p11;
       return p0.copy(hasBottomBar, hasStatusBar, hasHole, isStatusBarI, hasSafeArea, statusBarHei, holeHeight, bottomBarHei, displayHeigh, screenRealWi, screenRealHe);
    }
    public final boolean component1(){
       return this.hasBottomBar;
    }
    public final int component10(){
       return this.screenRealWidth;
    }
    public final int component11(){
       return this.screenRealHeight;
    }
    public final boolean component2(){
       return this.hasStatusBar;
    }
    public final boolean component3(){
       return this.hasHole;
    }
    public final boolean component4(){
       return this.isStatusBarInHole;
    }
    public final boolean component5(){
       return this.hasSafeArea;
    }
    public final int component6(){
       return this.statusBarHeight;
    }
    public final int component7(){
       return this.holeHeight;
    }
    public final int component8(){
       return this.bottomBarHeight;
    }
    public final int component9(){
       return this.displayHeight;
    }
    public final FlexScreenStatusData copy(boolean p0,boolean p1,boolean p2,boolean p3,boolean p4,int p5,int p6,int p7,int p8,int p9,int p10){
       Object obj;
       if (PatchProxy.isSupport(FlexScreenStatusData.class)) {
          Object[] objArray = new Object[11];
          objArray[0] = Boolean.valueOf(p0);
          objArray[1] = Boolean.valueOf(p1);
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          objArray[9] = Integer.valueOf(p9);
          objArray[10] = Integer.valueOf(p10);
          obj = PatchProxy.apply(objArray, this, FlexScreenStatusData.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       FlexScreenStatusData uFlexScreenS = new FlexScreenStatusData(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
       return obj;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof FlexScreenStatusData && (this.hasBottomBar == p0.hasBottomBar && (this.hasStatusBar == p0.hasStatusBar && (this.hasHole == p0.hasHole && (this.isStatusBarInHole == p0.isStatusBarInHole && (this.hasSafeArea == p0.hasSafeArea && (this.statusBarHeight == p0.statusBarHeight && (this.holeHeight == p0.holeHeight && (this.bottomBarHeight == p0.bottomBarHeight && (this.displayHeight == p0.displayHeight && (this.screenRealWidth == p0.screenRealWidth && this.screenRealHeight == p0.screenRealHeight)))))))))))) {
          return true;
       }
       return false;
    }
    public final int getBottomBarHeight(){
       return this.bottomBarHeight;
    }
    public final int getDisplayHeight(){
       return this.displayHeight;
    }
    public final boolean getHasBottomBar(){
       return this.hasBottomBar;
    }
    public final boolean getHasHole(){
       return this.hasHole;
    }
    public final boolean getHasSafeArea(){
       return this.hasSafeArea;
    }
    public final boolean getHasStatusBar(){
       return this.hasStatusBar;
    }
    public final int getHoleHeight(){
       return this.holeHeight;
    }
    public final int getScreenRealHeight(){
       return this.screenRealHeight;
    }
    public final int getScreenRealWidth(){
       return this.screenRealWidth;
    }
    public final int getStatusBarHeight(){
       return this.statusBarHeight;
    }
    public int hashCode(){
       int i1;
       int i2;
       FlexScreenStatusData obj = PatchProxy.apply(null, this, FlexScreenStatusData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.hasBottomBar;
       int i = 1;
       if (obj != null) {
          i1 = 1;
       }
       i1 = i1 * 31;
       FlexScreenStatusData thasStatusBa = this.hasStatusBar;
       if (thasStatusBa != null) {
          thasStatusBa = 1;
       }
       i1 = (i1 + thasStatusBa) * 31;
       thasStatusBa = this.hasHole;
       if (thasStatusBa != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       thasStatusBa = this.isStatusBarInHole;
       if (thasStatusBa != null) {
          i2 = 1;
       }
       i1 = (i1 + i2) * 31;
       thasStatusBa = this.hasSafeArea;
       if (thasStatusBa == null) {
          i = thasStatusBa;
       }
       return (((((((((((((i1 + i) * 31) + this.statusBarHeight) * 31) + this.holeHeight) * 31) + this.bottomBarHeight) * 31) + this.displayHeight) * 31) + this.screenRealWidth) * 31) + this.screenRealHeight);
    }
    public final boolean isStatusBarInHole(){
       return this.isStatusBarInHole;
    }
    public final Size screenRealSizeConvert(){
       Object obj = PatchProxy.apply(null, this, FlexScreenStatusData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Size(this.screenRealWidth, this.screenRealHeight);
    }
    public final void setBottomBarHeight(int p0){
       this.bottomBarHeight = p0;
    }
    public final void setDisplayHeight(int p0){
       this.displayHeight = p0;
    }
    public final void setHasBottomBar(boolean p0){
       this.hasBottomBar = p0;
    }
    public final void setHasHole(boolean p0){
       this.hasHole = p0;
    }
    public final void setHasSafeArea(boolean p0){
       this.hasSafeArea = p0;
    }
    public final void setHasStatusBar(boolean p0){
       this.hasStatusBar = p0;
    }
    public final void setHoleHeight(int p0){
       this.holeHeight = p0;
    }
    public final void setScreenRealHeight(int p0){
       this.screenRealHeight = p0;
    }
    public final void setScreenRealWidth(int p0){
       this.screenRealWidth = p0;
    }
    public final void setStatusBarHeight(int p0){
       this.statusBarHeight = p0;
    }
    public final void setStatusBarInHole(boolean p0){
       this.isStatusBarInHole = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FlexScreenStatusData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FlexScreenStatusData\(hasBottomBar="+this.hasBottomBar+", hasStatusBar="+this.hasStatusBar+", hasHole="+this.hasHole+", "+"isStatusBarInHole="+this.isStatusBarInHole+", hasSafeArea="+this.hasSafeArea+", statusBarHeight="+this.statusBarHeight+", "+"holeHeight="+this.holeHeight+", bottomBarHeight="+this.bottomBarHeight+", displayHeight = "+this.displayHeight+", screenRealWidth="+this.screenRealWidth+','+" screenRealHeight="+this.screenRealHeight+')';
    }
}
