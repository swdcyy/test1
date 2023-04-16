package com.kwai.video.minecraft.model.nano.Minecraft$TextInfoModel;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.nano.Minecraft$AutoWrap;
import java.lang.String;
import com.kwai.video.minecraft.model.nano.Minecraft$Shift;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Double;
import com.kwai.video.minecraft.model.nano.Minecraft$TextStroke;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public final class Minecraft$TextInfoModel extends ModelBase	// class@000a7e
{

    public void Minecraft$TextInfoModel(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TextInfoModel(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native void native_clear(long p0);
    public static native Minecraft$TextInfoModel native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native void native_setAlignType(long p0,int p1);
    public static native void native_setAutoWrap(long p0,Minecraft$AutoWrap p1);
    public static native void native_setEffectSourcePath(long p0,String p1);
    public static native void native_setEffectType(long p0,int p1);
    public static native void native_setFillBackgroundAlpha(long p0,int p1);
    public static native void native_setFillBackgroundColor(long p0,int p1);
    public static native void native_setFlowerWordId(long p0,int p1);
    public static native void native_setFontId(long p0,String p1);
    public static native void native_setItalic(long p0,boolean p1);
    public static native void native_setLetterSpace(long p0,double p1);
    public static native void native_setLineSpace(long p0,double p1);
    public static native void native_setScale(long p0,double p1);
    public static native void native_setShadowAlpha(long p0,int p1);
    public static native void native_setShadowAngle(long p0,int p1);
    public static native void native_setShadowColor(long p0,int p1);
    public static native void native_setShadowIntensity(long p0,int p1);
    public static native void native_setShadowShift(long p0,Minecraft$Shift p1);
    public static native void native_setStroke(long p0,ArrayList p1);
    public static native void native_setText(long p0,String p1);
    public static native void native_setTextColor(long p0,int p1);
    public static native void native_setTextColorAlpha(long p0,int p1);
    public static native void native_setThickness(long p0,boolean p1);
    public static native void native_setUnderline(long p0,boolean p1);
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TextInfoModel.class, "1")) {
          return;
       }
       Minecraft$TextInfoModel.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TextInfoModel clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TextInfoModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TextInfoModel.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public native final long native_create();
    public void setAlignType(int p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textInfoMode, "6")) {
          return;
       }
       Minecraft$TextInfoModel.native_setAlignType(this.nativeRef, p0);
       return;
    }
    public void setAutoWrap(Minecraft$AutoWrap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TextInfoModel.class, "25")) {
          return;
       }
       Minecraft$TextInfoModel.native_setAutoWrap(this.nativeRef, p0);
       return;
    }
    public void setEffectSourcePath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TextInfoModel.class, "20")) {
          return;
       }
       Minecraft$TextInfoModel.native_setEffectSourcePath(this.nativeRef, p0);
       return;
    }
    public void setEffectType(int p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textInfoMode, "21")) {
          return;
       }
       Minecraft$TextInfoModel.native_setEffectType(this.nativeRef, p0);
       return;
    }
    public void setFillBackgroundAlpha(int p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textInfoMode, "10")) {
          return;
       }
       Minecraft$TextInfoModel.native_setFillBackgroundAlpha(this.nativeRef, p0);
       return;
    }
    public void setFillBackgroundColor(int p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textInfoMode, "9")) {
          return;
       }
       Minecraft$TextInfoModel.native_setFillBackgroundColor(this.nativeRef, p0);
       return;
    }
    public void setFlowerWordId(int p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textInfoMode, "11")) {
          return;
       }
       Minecraft$TextInfoModel.native_setFlowerWordId(this.nativeRef, p0);
       return;
    }
    public void setFontId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TextInfoModel.class, "5")) {
          return;
       }
       Minecraft$TextInfoModel.native_setFontId(this.nativeRef, p0);
       return;
    }
    public void setItalic(boolean p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, textInfoMode, "23")) {
          return;
       }
       Minecraft$TextInfoModel.native_setItalic(this.nativeRef, p0);
       return;
    }
    public void setLetterSpace(double p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, textInfoMode, "15")) {
          return;
       }
       Minecraft$TextInfoModel.native_setLetterSpace(this.nativeRef, p0);
       return;
    }
    public void setLineSpace(double p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, textInfoMode, "16")) {
          return;
       }
       Minecraft$TextInfoModel.native_setLineSpace(this.nativeRef, p0);
       return;
    }
    public void setScale(double p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, textInfoMode, "14")) {
          return;
       }
       Minecraft$TextInfoModel.native_setScale(this.nativeRef, p0);
       return;
    }
    public void setShadowAlpha(int p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textInfoMode, "17")) {
          return;
       }
       Minecraft$TextInfoModel.native_setShadowAlpha(this.nativeRef, p0);
       return;
    }
    public void setShadowAngle(int p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textInfoMode, "19")) {
          return;
       }
       Minecraft$TextInfoModel.native_setShadowAngle(this.nativeRef, p0);
       return;
    }
    public void setShadowColor(int p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textInfoMode, "7")) {
          return;
       }
       Minecraft$TextInfoModel.native_setShadowColor(this.nativeRef, p0);
       return;
    }
    public void setShadowIntensity(int p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textInfoMode, "8")) {
          return;
       }
       Minecraft$TextInfoModel.native_setShadowIntensity(this.nativeRef, p0);
       return;
    }
    public void setShadowShift(Minecraft$Shift p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TextInfoModel.class, "18")) {
          return;
       }
       Minecraft$TextInfoModel.native_setShadowShift(this.nativeRef, p0);
       return;
    }
    public void setStroke(Minecraft$TextStroke[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TextInfoModel.class, "13")) {
          return;
       }
       Minecraft$TextInfoModel.native_setStroke(this.nativeRef, new ArrayList(Arrays.asList(p0)));
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TextInfoModel.class, "3")) {
          return;
       }
       Minecraft$TextInfoModel.native_setText(this.nativeRef, p0);
       return;
    }
    public void setTextColor(int p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textInfoMode, "4")) {
          return;
       }
       Minecraft$TextInfoModel.native_setTextColor(this.nativeRef, p0);
       return;
    }
    public void setTextColorAlpha(int p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, textInfoMode, "12")) {
          return;
       }
       Minecraft$TextInfoModel.native_setTextColorAlpha(this.nativeRef, p0);
       return;
    }
    public void setThickness(boolean p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, textInfoMode, "22")) {
          return;
       }
       Minecraft$TextInfoModel.native_setThickness(this.nativeRef, p0);
       return;
    }
    public void setUnderline(boolean p0){
       Minecraft$TextInfoModel textInfoMode = Minecraft$TextInfoModel.class;
       if (PatchProxy.isSupport(textInfoMode) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, textInfoMode, "24")) {
          return;
       }
       Minecraft$TextInfoModel.native_setUnderline(this.nativeRef, p0);
       return;
    }
}
