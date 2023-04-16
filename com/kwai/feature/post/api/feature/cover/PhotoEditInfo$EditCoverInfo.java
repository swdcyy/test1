package com.kwai.feature.post.api.feature.cover.PhotoEditInfo$EditCoverInfo;
import java.io.Serializable;
import java.lang.String;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo$CoverFrame;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PhotoEditInfo$EditCoverInfo implements Serializable	// class@001392
{
    public int assetHeight;
    public int assetWidth;
    public String atlasIndexes;
    public String authorText;
    public float centerX;
    public float centerY;
    public PhotoEditInfo$CoverFrame coverFrame;
    public String coverRatioStr;
    public int coverScale;
    public double customTimestamp;
    public String editSubtitle;
    public String editTitle;
    public String fontName;
    public boolean inSafeArea;
    public String locationText;
    public String originCoverPath;
    public float rotate;
    public float scale;
    public String timeText;
    public String titleStyle;

    public void PhotoEditInfo$EditCoverInfo(){
       super(0, null, null, null, null, null, null, null, false, null, 0, 0, 0, 0, 0, null, 0xffff, null);
    }
    public void PhotoEditInfo$EditCoverInfo(double p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,boolean p8,String p9,float p10,float p11,float p12,float p13,int p14,PhotoEditInfo$CoverFrame p15){
       int i = this;
       Object obj = p3;
       Object obj1 = p4;
       Object obj2 = p5;
       Object obj3 = p6;
       Object obj4 = p7;
       Object obj5 = p9;
       a.p(p1, "atlasIndexes");
       a.p(p2, "editTitle");
       a.p(obj, "titleStyle");
       a.p(obj1, "editSubtitle");
       a.p(obj2, "timeText");
       a.p(obj3, "authorText");
       a.p(obj4, "locationText");
       a.p(obj5, "fontName");
       super();
       i.customTimestamp = p0;
       i.atlasIndexes = p1;
       i.editTitle = p2;
       i.titleStyle = obj;
       i.editSubtitle = obj1;
       i.timeText = obj2;
       i.authorText = obj3;
       i.locationText = obj4;
       i.inSafeArea = p8;
       i.fontName = obj5;
       i.centerX = p10;
       i.centerY = p11;
       i.rotate = p12;
       i.scale = p13;
       i.coverScale = p14;
       i.coverFrame = p15;
       i.coverRatioStr = "";
       i.originCoverPath = "";
    }
    public void PhotoEditInfo$EditCoverInfo(double p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,boolean p8,String p9,float p10,float p11,float p12,float p13,int p14,PhotoEditInfo$CoverFrame p15,int p16,u p17){
       int i = p16;
       int i1 = (i & 0x01)? 0: p0;
       String str = "";
       String str1 = (i & 0x02)? str: p1;
       String str2 = (i & 0x04)? str: p2;
       String str3 = (i & 0x08)? str: p3;
       String str4 = (i & 0x10)? str: p4;
       String str5 = (i & 0x20)? str: p5;
       String str6 = (i & 0x40)? str: p6;
       String str7 = (i & 0x0080)? str: p7;
       int i2 = (i & 0x0100)? 1: p8;
       if (!(i & 0x0200)) {
          str = p9;
       }
       int i3 = 0x42480000;
       int i4 = (i & 0x0400)? 0x42480000: p10;
       if (!(i & 0x0800)) {
          i3 = p11;
       }
       int i5 = (i & 0x1000)? 0: p12;
       int i6 = (i & 0x2000)? 0x3f800000: p13;
       int i7 = i6;
       i6 = (i & 0x4000)? 0: p14;
       i = (i & 0x8000)? 0: p15;
       super(i1, str1, str2, str3, str4, str5, str6, str7, i2, str, i4, i3, i5, i7, i6, i);
       return;
    }
    public static PhotoEditInfo$EditCoverInfo copy$default(PhotoEditInfo$EditCoverInfo p0,double p1,String p2,String p3,String p4,String p5,String p6,String p7,String p8,boolean p9,String p10,float p11,float p12,float p13,float p14,int p15,PhotoEditInfo$CoverFrame p16,int p17,Object p18){
       int i1;
       PhotoEditInfo$EditCoverInfo uEditCoverIn = p0;
       int i = p17;
       PhotoEditInfo$EditCoverInfo customTimest = (i & 0x01)? uEditCoverIn.customTimestamp: p1;
       PhotoEditInfo$EditCoverInfo atlasIndexes = (i & 0x02)? uEditCoverIn.atlasIndexes: p2;
       PhotoEditInfo$EditCoverInfo editTitle = (i & 0x04)? uEditCoverIn.editTitle: p3;
       PhotoEditInfo$EditCoverInfo titleStyle = (i & 0x08)? uEditCoverIn.titleStyle: p4;
       PhotoEditInfo$EditCoverInfo editSubtitle = (i & 0x10)? uEditCoverIn.editSubtitle: p5;
       PhotoEditInfo$EditCoverInfo timeText = (i & 0x20)? uEditCoverIn.timeText: p6;
       PhotoEditInfo$EditCoverInfo authorText = (i & 0x40)? uEditCoverIn.authorText: p7;
       PhotoEditInfo$EditCoverInfo locationText = (i & 0x0080)? uEditCoverIn.locationText: p8;
       PhotoEditInfo$EditCoverInfo inSafeArea = (i & 0x0100)? uEditCoverIn.inSafeArea: p9;
       PhotoEditInfo$EditCoverInfo fontName = (i & 0x0200)? uEditCoverIn.fontName: p10;
       PhotoEditInfo$EditCoverInfo centerX = (i & 0x0400)? uEditCoverIn.centerX: p11;
       PhotoEditInfo$EditCoverInfo centerY = (i & 0x0800)? uEditCoverIn.centerY: p12;
       PhotoEditInfo$EditCoverInfo rotate = (i & 0x1000)? uEditCoverIn.rotate: p13;
       PhotoEditInfo$EditCoverInfo uEditCoverIn1 = rotate;
       rotate = (i & 0x2000)? uEditCoverIn.scale: p14;
       PhotoEditInfo$EditCoverInfo uEditCoverIn2 = rotate;
       rotate = (i & 0x4000)? uEditCoverIn.coverScale: p15;
       PhotoEditInfo$EditCoverInfo coverFrame = (i & 0x8000)? uEditCoverIn.coverFrame: p16;
       return p0.copy(customTimest, atlasIndexes, editTitle, titleStyle, editSubtitle, timeText, authorText, locationText, inSafeArea, fontName, centerX, centerY, uEditCoverIn1, uEditCoverIn2, rotate, coverFrame);
    }
    public final double component1(){
       return this.customTimestamp;
    }
    public final String component10(){
       return this.fontName;
    }
    public final float component11(){
       return this.centerX;
    }
    public final float component12(){
       return this.centerY;
    }
    public final float component13(){
       return this.rotate;
    }
    public final float component14(){
       return this.scale;
    }
    public final int component15(){
       return this.coverScale;
    }
    public final PhotoEditInfo$CoverFrame component16(){
       return this.coverFrame;
    }
    public final String component2(){
       return this.atlasIndexes;
    }
    public final String component3(){
       return this.editTitle;
    }
    public final String component4(){
       return this.titleStyle;
    }
    public final String component5(){
       return this.editSubtitle;
    }
    public final String component6(){
       return this.timeText;
    }
    public final String component7(){
       return this.authorText;
    }
    public final String component8(){
       return this.locationText;
    }
    public final boolean component9(){
       return this.inSafeArea;
    }
    public final PhotoEditInfo$EditCoverInfo copy(double p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,boolean p8,String p9,float p10,float p11,float p12,float p13,int p14,PhotoEditInfo$CoverFrame p15){
       PhotoEditInfo$EditCoverInfo obj;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p6;
       object oobject6 = p7;
       object oobject7 = p9;
       if (PatchProxy.isSupport(PhotoEditInfo$EditCoverInfo.class)) {
          Object[] objArray = new Object[16];
          objArray[0] = Double.valueOf(p0);
          objArray[1] = oobject;
          objArray[2] = oobject1;
          objArray[3] = oobject2;
          objArray[4] = oobject3;
          objArray[5] = oobject4;
          objArray[6] = oobject5;
          objArray[7] = oobject6;
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = oobject7;
          objArray[10] = Float.valueOf(p10);
          objArray[11] = Float.valueOf(p11);
          objArray[12] = Float.valueOf(p12);
          objArray[13] = Float.valueOf(p13);
          objArray[14] = Integer.valueOf(p14);
          objArray[15] = p15;
          obj = PatchProxy.apply(objArray, this, PhotoEditInfo$EditCoverInfo.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "atlasIndexes");
       a.p(oobject1, "editTitle");
       a.p(oobject2, "titleStyle");
       a.p(oobject3, "editSubtitle");
       a.p(oobject4, "timeText");
       a.p(oobject5, "authorText");
       a.p(oobject6, "locationText");
       a.p(oobject7, "fontName");
       obj = new PhotoEditInfo$EditCoverInfo(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
       return v18;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PhotoEditInfo$EditCoverInfo.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PhotoEditInfo$EditCoverInfo && (!Double.compare(this.customTimestamp, p0.customTimestamp) && (a.g(this.atlasIndexes, p0.atlasIndexes) && (a.g(this.editTitle, p0.editTitle) && (a.g(this.titleStyle, p0.titleStyle) && (a.g(this.editSubtitle, p0.editSubtitle) && (a.g(this.timeText, p0.timeText) && (a.g(this.authorText, p0.authorText) && (a.g(this.locationText, p0.locationText) && (this.inSafeArea == p0.inSafeArea && (a.g(this.fontName, p0.fontName) && (!Float.compare(this.centerX, p0.centerX) && (!Float.compare(this.centerY, p0.centerY) && (!Float.compare(this.rotate, p0.rotate) && (!Float.compare(this.scale, p0.scale) && (this.coverScale == p0.coverScale && a.g(this.coverFrame, p0.coverFrame)))))))))))))))))) {
          return true;
       }
       return false;
    }
    public final int getAssetHeight(){
       return this.assetHeight;
    }
    public final int getAssetWidth(){
       return this.assetWidth;
    }
    public final String getAtlasIndexes(){
       return this.atlasIndexes;
    }
    public final String getAuthorText(){
       return this.authorText;
    }
    public final float getCenterX(){
       return this.centerX;
    }
    public final float getCenterY(){
       return this.centerY;
    }
    public final PhotoEditInfo$CoverFrame getCoverFrame(){
       return this.coverFrame;
    }
    public final String getCoverRatioStr(){
       return this.coverRatioStr;
    }
    public final int getCoverScale(){
       return this.coverScale;
    }
    public final double getCustomTimestamp(){
       return this.customTimestamp;
    }
    public final String getEditSubtitle(){
       return this.editSubtitle;
    }
    public final String getEditTitle(){
       return this.editTitle;
    }
    public final String getFontName(){
       return this.fontName;
    }
    public final boolean getInSafeArea(){
       return this.inSafeArea;
    }
    public final String getLocationText(){
       return this.locationText;
    }
    public final String getOriginCoverPath(){
       return this.originCoverPath;
    }
    public final float getRotate(){
       return this.rotate;
    }
    public final float getScale(){
       return this.scale;
    }
    public final String getTimeText(){
       return this.timeText;
    }
    public final String getTitleStyle(){
       return this.titleStyle;
    }
    public int hashCode(){
       PhotoEditInfo$EditCoverInfo obj = PatchProxy.apply(null, this, PhotoEditInfo$EditCoverInfo.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       long l = Double.doubleToLongBits(this.customTimestamp);
       int i = (int)(l ^ (l >> 32)) * 31;
       obj = this.atlasIndexes;
       int i1 = 0;
       int i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.editTitle;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.titleStyle;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.editSubtitle;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.timeText;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.authorText;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.locationText;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.inSafeArea;
       if (obj != null) {
          i2 = 1;
       }
       i = (i + i2) * 31;
       obj = this.fontName;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (((((((((((i + i2) * 31) + Float.floatToIntBits(this.centerX)) * 31) + Float.floatToIntBits(this.centerY)) * 31) + Float.floatToIntBits(this.rotate)) * 31) + Float.floatToIntBits(this.scale)) * 31) + this.coverScale) * 31;
       obj = this.coverFrame;
       if (obj != null) {
          i1 = obj.hashCode();
       }
       return (i + i1);
    }
    public final void setAssetHeight(int p0){
       this.assetHeight = p0;
    }
    public final void setAssetWidth(int p0){
       this.assetWidth = p0;
    }
    public final void setAtlasIndexes(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoEditInfo$EditCoverInfo.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.atlasIndexes = p0;
       return;
    }
    public final void setAuthorText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoEditInfo$EditCoverInfo.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.authorText = p0;
       return;
    }
    public final void setCenterX(float p0){
       this.centerX = p0;
    }
    public final void setCenterY(float p0){
       this.centerY = p0;
    }
    public final void setCoverFrame(PhotoEditInfo$CoverFrame p0){
       this.coverFrame = p0;
    }
    public final void setCoverRatioStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoEditInfo$EditCoverInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.coverRatioStr = p0;
       return;
    }
    public final void setCoverScale(int p0){
       this.coverScale = p0;
    }
    public final void setCustomTimestamp(double p0){
       this.customTimestamp = p0;
    }
    public final void setEditSubtitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoEditInfo$EditCoverInfo.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.editSubtitle = p0;
       return;
    }
    public final void setEditTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoEditInfo$EditCoverInfo.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.editTitle = p0;
       return;
    }
    public final void setFontName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoEditInfo$EditCoverInfo.class, "10")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.fontName = p0;
       return;
    }
    public final void setInSafeArea(boolean p0){
       this.inSafeArea = p0;
    }
    public final void setLocationText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoEditInfo$EditCoverInfo.class, "9")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.locationText = p0;
       return;
    }
    public final void setOriginCoverPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoEditInfo$EditCoverInfo.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.originCoverPath = p0;
       return;
    }
    public final void setRotate(float p0){
       this.rotate = p0;
    }
    public final void setScale(float p0){
       this.scale = p0;
    }
    public final void setTimeText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoEditInfo$EditCoverInfo.class, "7")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.timeText = p0;
       return;
    }
    public final void setTitleStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoEditInfo$EditCoverInfo.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.titleStyle = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PhotoEditInfo$EditCoverInfo.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EditCoverInfo\(customTimestamp="+this.customTimestamp+", atlasIndexes="+this.atlasIndexes+", editTitle="+this.editTitle+", titleStyle="+this.titleStyle+", editSubtitle="+this.editSubtitle+", timeText="+this.timeText+", authorText="+this.authorText+", locationText="+this.locationText+", inSafeArea="+this.inSafeArea+", fontName="+this.fontName+", centerX="+this.centerX+", centerY="+this.centerY+", rotate="+this.rotate+", scale="+this.scale+", coverScale="+this.coverScale+", coverFrame="+this.coverFrame+"\)";
    }
}
