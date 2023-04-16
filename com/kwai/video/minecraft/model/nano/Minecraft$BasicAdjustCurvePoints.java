package com.kwai.video.minecraft.model.nano.Minecraft$BasicAdjustCurvePoints;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.nano.Minecraft$Vec2f;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public final class Minecraft$BasicAdjustCurvePoints extends ModelBase	// class@000a41
{

    public void Minecraft$BasicAdjustCurvePoints(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$BasicAdjustCurvePoints(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native ArrayList native_bPoints(long p0);
    public static native Minecraft$Vec2f native_bPoints_getItem(long p0,int p1);
    public static native void native_bPoints_setItem(long p0,int p1,Minecraft$Vec2f p2);
    public static native int native_bPoints_size(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$BasicAdjustCurvePoints native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native ArrayList native_gPoints(long p0);
    public static native Minecraft$Vec2f native_gPoints_getItem(long p0,int p1);
    public static native void native_gPoints_setItem(long p0,int p1,Minecraft$Vec2f p2);
    public static native int native_gPoints_size(long p0);
    public static native ArrayList native_rPoints(long p0);
    public static native Minecraft$Vec2f native_rPoints_getItem(long p0,int p1);
    public static native void native_rPoints_setItem(long p0,int p1,Minecraft$Vec2f p2);
    public static native int native_rPoints_size(long p0);
    public static native ArrayList native_rgbPoints(long p0);
    public static native Minecraft$Vec2f native_rgbPoints_getItem(long p0,int p1);
    public static native void native_rgbPoints_setItem(long p0,int p1,Minecraft$Vec2f p2);
    public static native int native_rgbPoints_size(long p0);
    public static native void native_setBPoints(long p0,ArrayList p1);
    public static native void native_setGPoints(long p0,ArrayList p1);
    public static native void native_setRPoints(long p0,ArrayList p1);
    public static native void native_setRgbPoints(long p0,ArrayList p1);
    public ImmutableArray bPoints(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustCurvePoints.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$BasicAdjustCurvePoints.native_bPoints(this.nativeRef), Minecraft$Vec2f.class);
    }
    public Minecraft$Vec2f bPoints(int p0){
       Minecraft$BasicAdjustCurvePoints uBasicAdjust = Minecraft$BasicAdjustCurvePoints.class;
       if (PatchProxy.isSupport(uBasicAdjust)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBasicAdjust, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$BasicAdjustCurvePoints.native_bPoints_getItem(this.nativeRef, p0);
    }
    public void bPointsSetItem(int p0,Minecraft$Vec2f p1){
       Minecraft$BasicAdjustCurvePoints uBasicAdjust = Minecraft$BasicAdjustCurvePoints.class;
       if (PatchProxy.isSupport(uBasicAdjust) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBasicAdjust, "26")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_bPoints_setItem(this.nativeRef, p0, p1);
       return;
    }
    public int bPointsSize(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustCurvePoints.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$BasicAdjustCurvePoints.native_bPoints_size(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$BasicAdjustCurvePoints.class, "1")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$BasicAdjustCurvePoints clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustCurvePoints.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$BasicAdjustCurvePoints.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public ImmutableArray gPoints(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustCurvePoints.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$BasicAdjustCurvePoints.native_gPoints(this.nativeRef), Minecraft$Vec2f.class);
    }
    public Minecraft$Vec2f gPoints(int p0){
       Minecraft$BasicAdjustCurvePoints uBasicAdjust = Minecraft$BasicAdjustCurvePoints.class;
       if (PatchProxy.isSupport(uBasicAdjust)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBasicAdjust, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$BasicAdjustCurvePoints.native_gPoints_getItem(this.nativeRef, p0);
    }
    public void gPointsSetItem(int p0,Minecraft$Vec2f p1){
       Minecraft$BasicAdjustCurvePoints uBasicAdjust = Minecraft$BasicAdjustCurvePoints.class;
       if (PatchProxy.isSupport(uBasicAdjust) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBasicAdjust, "20")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_gPoints_setItem(this.nativeRef, p0, p1);
       return;
    }
    public int gPointsSize(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustCurvePoints.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$BasicAdjustCurvePoints.native_gPoints_size(this.nativeRef);
    }
    public native final long native_create();
    public ImmutableArray rPoints(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustCurvePoints.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$BasicAdjustCurvePoints.native_rPoints(this.nativeRef), Minecraft$Vec2f.class);
    }
    public Minecraft$Vec2f rPoints(int p0){
       Minecraft$BasicAdjustCurvePoints uBasicAdjust = Minecraft$BasicAdjustCurvePoints.class;
       if (PatchProxy.isSupport(uBasicAdjust)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBasicAdjust, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$BasicAdjustCurvePoints.native_rPoints_getItem(this.nativeRef, p0);
    }
    public void rPointsSetItem(int p0,Minecraft$Vec2f p1){
       Minecraft$BasicAdjustCurvePoints uBasicAdjust = Minecraft$BasicAdjustCurvePoints.class;
       if (PatchProxy.isSupport(uBasicAdjust) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBasicAdjust, "14")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_rPoints_setItem(this.nativeRef, p0, p1);
       return;
    }
    public int rPointsSize(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustCurvePoints.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$BasicAdjustCurvePoints.native_rPoints_size(this.nativeRef);
    }
    public ImmutableArray rgbPoints(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustCurvePoints.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ImmutableArray(Minecraft$BasicAdjustCurvePoints.native_rgbPoints(this.nativeRef), Minecraft$Vec2f.class);
    }
    public Minecraft$Vec2f rgbPoints(int p0){
       Minecraft$BasicAdjustCurvePoints uBasicAdjust = Minecraft$BasicAdjustCurvePoints.class;
       if (PatchProxy.isSupport(uBasicAdjust)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBasicAdjust, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Minecraft$BasicAdjustCurvePoints.native_rgbPoints_getItem(this.nativeRef, p0);
    }
    public void rgbPointsSetItem(int p0,Minecraft$Vec2f p1){
       Minecraft$BasicAdjustCurvePoints uBasicAdjust = Minecraft$BasicAdjustCurvePoints.class;
       if (PatchProxy.isSupport(uBasicAdjust) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uBasicAdjust, "8")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_rgbPoints_setItem(this.nativeRef, p0, p1);
       return;
    }
    public int rgbPointsSize(){
       Object obj = PatchProxy.apply(null, this, Minecraft$BasicAdjustCurvePoints.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$BasicAdjustCurvePoints.native_rgbPoints_size(this.nativeRef);
    }
    public void setBPoints(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$BasicAdjustCurvePoints.class, "22")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_setBPoints(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setBPoints(Minecraft$Vec2f[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$BasicAdjustCurvePoints.class, "23")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_setBPoints(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setGPoints(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$BasicAdjustCurvePoints.class, "16")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_setGPoints(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setGPoints(Minecraft$Vec2f[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$BasicAdjustCurvePoints.class, "17")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_setGPoints(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setRPoints(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$BasicAdjustCurvePoints.class, "10")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_setRPoints(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setRPoints(Minecraft$Vec2f[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$BasicAdjustCurvePoints.class, "11")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_setRPoints(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setRgbPoints(ImmutableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$BasicAdjustCurvePoints.class, "4")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_setRgbPoints(this.nativeRef, p0.getArrayList());
       return;
    }
    public void setRgbPoints(Minecraft$Vec2f[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$BasicAdjustCurvePoints.class, "5")) {
          return;
       }
       Minecraft$BasicAdjustCurvePoints.native_setRgbPoints(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
}
