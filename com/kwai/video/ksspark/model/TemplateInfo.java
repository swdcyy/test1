package com.kwai.video.ksspark.model.TemplateInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksspark.NewSparkTemplateManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Double;
import java.util.Iterator;
import com.kwai.video.ksspark.model.ReplaceableAsset;

public class TemplateInfo	// class@000935
{
    public final long mNativeInfoAddress;
    public ArrayList replaceableAssets;

    public void TemplateInfo(long p0){
       super();
       this.mNativeInfoAddress = p0;
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, TemplateInfo.class, "8")) {
          return;
       }
       super.finalize();
       NewSparkTemplateManager.nativeDeleteTemplateInfo(this.mNativeInfoAddress);
       return;
    }
    public double getDuration(){
       Object obj = PatchProxy.apply(null, this, TemplateInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return (double)NewSparkTemplateManager.nativeProjectDuration(this.mNativeInfoAddress);
    }
    public long getNativeInfoAddress(){
       return this.mNativeInfoAddress;
    }
    public String getPath(){
       Object obj = PatchProxy.apply(null, this, TemplateInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NewSparkTemplateManager.nativeGetPath(this.mNativeInfoAddress);
    }
    public int getProjectHeight(){
       Object obj = PatchProxy.apply(null, this, TemplateInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return NewSparkTemplateManager.nativeGetHeight(this.mNativeInfoAddress);
    }
    public int getProjectWidth(){
       Object obj = PatchProxy.apply(null, this, TemplateInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return NewSparkTemplateManager.nativeGetWidth(this.mNativeInfoAddress);
    }
    public int getVersion(){
       Object obj = PatchProxy.apply(null, this, TemplateInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return NewSparkTemplateManager.nativeProjectVersion(this.mNativeInfoAddress);
    }
    public ArrayList replaceableAssets(){
       Object obj = PatchProxy.apply(null, this, TemplateInfo.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NewSparkTemplateManager.nativeGetReplaceableAssets(this.mNativeInfoAddress);
    }
    public void updateReplaceableAsset(long p0,double p1,double p2,String p3){
       TemplateInfo templateInfo = this;
       if (PatchProxy.isSupport(TemplateInfo.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), p3, this, TemplateInfo.class, "7")) {
          return;
       }
       Iterator iterator = templateInfo.replaceableAssets.iterator();
       while (iterator.hasNext()) {
          ReplaceableAsset replaceableA = iterator.next();
          double d = p1;
          if (!p0 - replaceableA.getAssetID()) {
             replaceableA.setScaleX(d);
             replaceableA.setScaleY(p2);
             replaceableA.setPath(p3);
             NewSparkTemplateManager.nativeUpdateReplaceableAsset(templateInfo.mNativeInfoAddress, p0, p1, p2, p3);
          }else {
             int i = p3;
          }
       }
       return;
    }
}
