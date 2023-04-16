package com.kwai.video.minecraft.model.nano.Minecraft$TemplateAssetInfo;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import java.lang.Double;

public final class Minecraft$TemplateAssetInfo extends ModelBase	// class@000a77
{

    public void Minecraft$TemplateAssetInfo(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void Minecraft$TemplateAssetInfo(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static native int native_assetHeight(long p0);
    public static native int native_assetWidth(long p0);
    public static native void native_clear(long p0);
    public static native Minecraft$TemplateAssetInfo native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native double native_duration(long p0);
    public static native String native_path(long p0);
    public static native String native_refId(long p0);
    public static native void native_setAssetHeight(long p0,int p1);
    public static native void native_setAssetWidth(long p0,int p1);
    public static native void native_setDuration(long p0,double p1);
    public static native void native_setPath(long p0,String p1);
    public static native void native_setRefId(long p0,String p1);
    public static native void native_setStartTime(long p0,double p1);
    public static native double native_startTime(long p0);
    public int assetHeight(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateAssetInfo.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$TemplateAssetInfo.native_assetHeight(this.nativeRef);
    }
    public int assetWidth(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateAssetInfo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Minecraft$TemplateAssetInfo.native_assetWidth(this.nativeRef);
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, Minecraft$TemplateAssetInfo.class, "1")) {
          return;
       }
       Minecraft$TemplateAssetInfo.native_clear(this.nativeRef);
       return;
    }
    public Minecraft$TemplateAssetInfo clone(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateAssetInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TemplateAssetInfo.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public double duration(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateAssetInfo.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$TemplateAssetInfo.native_duration(this.nativeRef);
    }
    public native final long native_create();
    public String path(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateAssetInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TemplateAssetInfo.native_path(this.nativeRef);
    }
    public String refId(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateAssetInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Minecraft$TemplateAssetInfo.native_refId(this.nativeRef);
    }
    public void setAssetHeight(int p0){
       Minecraft$TemplateAssetInfo templateAsse = Minecraft$TemplateAssetInfo.class;
       if (PatchProxy.isSupport(templateAsse) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, templateAsse, "10")) {
          return;
       }
       Minecraft$TemplateAssetInfo.native_setAssetHeight(this.nativeRef, p0);
       return;
    }
    public void setAssetWidth(int p0){
       Minecraft$TemplateAssetInfo templateAsse = Minecraft$TemplateAssetInfo.class;
       if (PatchProxy.isSupport(templateAsse) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, templateAsse, "8")) {
          return;
       }
       Minecraft$TemplateAssetInfo.native_setAssetWidth(this.nativeRef, p0);
       return;
    }
    public void setDuration(double p0){
       Minecraft$TemplateAssetInfo templateAsse = Minecraft$TemplateAssetInfo.class;
       if (PatchProxy.isSupport(templateAsse) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, templateAsse, "14")) {
          return;
       }
       Minecraft$TemplateAssetInfo.native_setDuration(this.nativeRef, p0);
       return;
    }
    public void setPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateAssetInfo.class, "4")) {
          return;
       }
       Minecraft$TemplateAssetInfo.native_setPath(this.nativeRef, p0);
       return;
    }
    public void setRefId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Minecraft$TemplateAssetInfo.class, "6")) {
          return;
       }
       Minecraft$TemplateAssetInfo.native_setRefId(this.nativeRef, p0);
       return;
    }
    public void setStartTime(double p0){
       Minecraft$TemplateAssetInfo templateAsse = Minecraft$TemplateAssetInfo.class;
       if (PatchProxy.isSupport(templateAsse) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, templateAsse, "12")) {
          return;
       }
       Minecraft$TemplateAssetInfo.native_setStartTime(this.nativeRef, p0);
       return;
    }
    public double startTime(){
       Object obj = PatchProxy.apply(null, this, Minecraft$TemplateAssetInfo.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Minecraft$TemplateAssetInfo.native_startTime(this.nativeRef);
    }
}
