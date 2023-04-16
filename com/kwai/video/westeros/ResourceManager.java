package com.kwai.video.westeros.ResourceManager;
import com.kwai.video.westeros.helpers.ValidationChecker;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.video.westeros.models.YlabModelPathConfig;
import com.google.protobuf.AbstractMessageLite;

public class ResourceManager	// class@000e60
{
    public final ValidationChecker checker;
    public final long westeros;
    public static final String TAG = "ResourceManager";
    public static final int kMmuModelPathIndex = 1;
    public static final int kYlabModelPathIndex;

    public void ResourceManager(long p0,ValidationChecker p1){
       super();
       this.westeros = p0;
       this.checker = p1;
    }
    public native final void nativeSetAiDeformJsonPath(long p0,String p1);
    public native final void nativeSetDeformJsonPath(long p0,String p1,boolean p2);
    public native final void nativeSetDirtyLensDetectModelPath(long p0,String p1);
    public native final void nativeSetFace3DResourcesDir(long p0,String p1);
    public native final void nativeSetModelIsBuiltIn(long p0,boolean p1);
    public native final void nativeSetPath(long p0,int p1,String p2);
    public native final void nativeSetYlabModelPathConfig(long p0,byte[] p1);
    public void setAiDeformJsonPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceManager.class, "3")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetAiDeformJsonPath(this.westeros, p0);
       }
       return;
    }
    public void setDeformJsonPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceManager.class, "1")) {
          return;
       }
       this.setDeformJsonPath(p0, false);
       return;
    }
    public void setDeformJsonPath(String p0,boolean p1){
       ResourceManager resourceMana = ResourceManager.class;
       if (PatchProxy.isSupport(resourceMana) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, resourceMana, "2")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetDeformJsonPath(this.westeros, p0, p1);
       }
       return;
    }
    public void setDirtyLensDetectModelPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceManager.class, "9")) {
          return;
       }
       this.nativeSetDirtyLensDetectModelPath(this.westeros, p0);
       return;
    }
    public void setFace3DResourcesDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceManager.class, "8")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetFace3DResourcesDir(this.westeros, p0);
       }
       return;
    }
    public void setMmuModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceManager.class, "7")) {
          return;
       }
       if (this.checker.isValid() && p0 != null) {
          String str = "/";
          if (!p0.endsWith(str)) {
             p0 = p0+str;
          }
          this.nativeSetPath(this.westeros, 1, p0);
       }
       return;
    }
    public void setModelIsBuiltIn(boolean p0){
       ResourceManager resourceMana = ResourceManager.class;
       if (PatchProxy.isSupport(resourceMana) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, resourceMana, "4")) {
          return;
       }
       this.nativeSetModelIsBuiltIn(this.westeros, p0);
       return;
    }
    public void setYlabModelDir(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceManager.class, "5")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetPath(this.westeros, 0, p0);
       }
       return;
    }
    public void setYlabModelPathConfig(YlabModelPathConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ResourceManager.class, "6")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetYlabModelPathConfig(this.westeros, p0.toByteArray());
       }
       return;
    }
}
