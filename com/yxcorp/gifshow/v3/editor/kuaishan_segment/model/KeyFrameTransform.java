package com.yxcorp.gifshow.v3.editor.kuaishan_segment.model.KeyFrameTransform;
import java.io.Serializable;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KeyFrameTransform implements Serializable	// class@001022
{
    public float centerX;
    public float centerY;
    public double clipDurationInSeconds;
    public double clipStartInSeconds;
    public float originalScaleFromSdk;
    public float rotate;
    public float scale;
    public String transformedVideoPath;

    public void KeyFrameTransform(){
       super(null, 0, 0, 0, 0, 0, 0, 0, 255, null);
    }
    public void KeyFrameTransform(String p0,float p1,float p2,float p3,float p4,float p5,double p6,double p7){
       super();
       this.transformedVideoPath = p0;
       this.rotate = p1;
       this.scale = p2;
       this.originalScaleFromSdk = p3;
       this.centerX = p4;
       this.centerY = p5;
       this.clipStartInSeconds = p6;
       this.clipDurationInSeconds = p7;
    }
    public void KeyFrameTransform(String p0,float p1,float p2,float p3,float p4,float p5,double p6,double p7,int p8,u p9){
       int i = p8;
       int i1 = (i & 0x01)? 0: p0;
       int i2 = (i & 0x02)? 0x43b40000: p1;
       int i3 = 0x3f800000;
       int i4 = (i & 0x04)? 0x3f800000: p2;
       if (!(i & 0x08)) {
          i3 = p3;
       }
       int i5 = 0x3f000000;
       int i6 = (i & 0x10)? 0x3f000000: p4;
       if (!(i & 0x20)) {
          i5 = p5;
       }
       int i7 = 0xbff0000000000000;
       int i8 = (i & 0x40)? i7: p6;
       if (!(i & 0x0080)) {
          i7 = p7;
       }
       super(i1, i2, i4, i3, i6, i5, i8, i7);
       return;
    }
    public static KeyFrameTransform copy$default(KeyFrameTransform p0,String p1,float p2,float p3,float p4,float p5,float p6,double p7,double p8,int p9,Object p10){
       KeyFrameTransform keyFrameTran = p0;
       int i = p9;
       KeyFrameTransform transformedV = (i & 0x01)? keyFrameTran.transformedVideoPath: p1;
       KeyFrameTransform rotate = (i & 0x02)? keyFrameTran.rotate: p2;
       KeyFrameTransform scale = (i & 0x04)? keyFrameTran.scale: p3;
       KeyFrameTransform originalScal = (i & 0x08)? keyFrameTran.originalScaleFromSdk: p4;
       KeyFrameTransform centerX = (i & 0x10)? keyFrameTran.centerX: p5;
       KeyFrameTransform centerY = (i & 0x20)? keyFrameTran.centerY: p6;
       KeyFrameTransform clipStartInS = (i & 0x40)? keyFrameTran.clipStartInSeconds: p7;
       KeyFrameTransform clipDuration = (i & 0x0080)? keyFrameTran.clipDurationInSeconds: p8;
       return p0.copy(transformedV, rotate, scale, originalScal, centerX, centerY, clipStartInS, clipDuration);
    }
    public final void appendRotation(float p0){
       float f = this.rotate - p0;
       this.rotate = f;
       this.rotate = f % 360.00f;
    }
    public final String component1(){
       return this.transformedVideoPath;
    }
    public final float component2(){
       return this.rotate;
    }
    public final float component3(){
       return this.scale;
    }
    public final float component4(){
       return this.originalScaleFromSdk;
    }
    public final float component5(){
       return this.centerX;
    }
    public final float component6(){
       return this.centerY;
    }
    public final double component7(){
       return this.clipStartInSeconds;
    }
    public final double component8(){
       return this.clipDurationInSeconds;
    }
    public final KeyFrameTransform copy(String p0,float p1,float p2,float p3,float p4,float p5,double p6,double p7){
       Object obj;
       if (PatchProxy.isSupport(KeyFrameTransform.class)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5),Double.valueOf(p6),Double.valueOf(p7)};
          obj = PatchProxy.apply(objArray, this, KeyFrameTransform.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       KeyFrameTransform keyFrameTran = new KeyFrameTransform(p0, p1, p2, p3, p4, p5, p6, p7);
       return obj;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KeyFrameTransform.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KeyFrameTransform && (a.g(this.transformedVideoPath, p0.transformedVideoPath) && (!Float.compare(this.rotate, p0.rotate) && (!Float.compare(this.scale, p0.scale) && (!Float.compare(this.originalScaleFromSdk, p0.originalScaleFromSdk) && (!Float.compare(this.centerX, p0.centerX) && (!Float.compare(this.centerY, p0.centerY) && (!Double.compare(this.clipStartInSeconds, p0.clipStartInSeconds) && !Double.compare(this.clipDurationInSeconds, p0.clipDurationInSeconds)))))))))) {
          return true;
       }
       return false;
    }
    public final float getCenterX(){
       return this.centerX;
    }
    public final float getCenterY(){
       return this.centerY;
    }
    public final double getClipDurationInSeconds(){
       return this.clipDurationInSeconds;
    }
    public final double getClipStartInSeconds(){
       return this.clipStartInSeconds;
    }
    public final float getOriginalScaleFromSdk(){
       return this.originalScaleFromSdk;
    }
    public final float getRotate(){
       return this.rotate;
    }
    public final float getScale(){
       return this.scale;
    }
    public final String getTransformedVideoPath(){
       return this.transformedVideoPath;
    }
    public final boolean hasClipRange(){
       boolean b = (this.clipStartInSeconds >= 0 && this.clipDurationInSeconds >= 0)? true: false;
       return b;
    }
    public int hashCode(){
       KeyFrameTransform obj = PatchProxy.apply(null, this, KeyFrameTransform.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.transformedVideoPath;
       int i = (obj != null)? obj.hashCode(): 0;
       long l = Double.doubleToLongBits(this.clipStartInSeconds);
       l = Double.doubleToLongBits(this.clipDurationInSeconds);
       return ((((((((((((((i * 31) + Float.floatToIntBits(this.rotate)) * 31) + Float.floatToIntBits(this.scale)) * 31) + Float.floatToIntBits(this.originalScaleFromSdk)) * 31) + Float.floatToIntBits(this.centerX)) * 31) + Float.floatToIntBits(this.centerY)) * 31) + (int)(l ^ (l >> 32))) * 31) + (int)(l ^ (l >> 32)));
    }
    public final void setCenterX(float p0){
       this.centerX = p0;
    }
    public final void setCenterY(float p0){
       this.centerY = p0;
    }
    public final void setClipDurationInSeconds(double p0){
       this.clipDurationInSeconds = p0;
    }
    public final void setClipStartInSeconds(double p0){
       this.clipStartInSeconds = p0;
    }
    public final void setOriginalScaleFromSdk(float p0){
       this.originalScaleFromSdk = p0;
    }
    public final void setRotate(float p0){
       this.rotate = p0;
    }
    public final void setScale(float p0){
       this.scale = p0;
    }
    public final void setTransformedVideoPath(String p0){
       this.transformedVideoPath = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KeyFrameTransform.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KeyFrameTransform\(transformedVideoPath="+this.transformedVideoPath+", rotate="+this.rotate+", scale="+this.scale+", originalScaleFromSdk="+this.originalScaleFromSdk+", centerX="+this.centerX+", centerY="+this.centerY+", clipStartInSeconds="+this.clipStartInSeconds+", clipDurationInSeconds="+this.clipDurationInSeconds+"\)";
    }
}
