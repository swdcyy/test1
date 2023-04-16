package com.kwai.video.clipkit.mv.ClipAssetManager;
import com.kwai.FaceMagic.AE2.AE2Project;
import com.kwai.FaceMagic.AE2.AE2AssetRenderer;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import com.kwai.FaceMagic.AE2.AE2Asset;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.FaceMagic.AE2.AE2AssetExtraData;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;

public class ClipAssetManager	// class@001a9d
{
    public AE2AssetRenderer mAssetRender;
    public ArrayList mAssets;
    public AE2Project mProject;

    public void ClipAssetManager(AE2Project p0,AE2AssetRenderer p1,ArrayList p2){
       super();
       this.mAssetRender = p1;
       this.mAssets = p2;
       this.mProject = p0;
    }
    public ArrayList assets(){
       return this.mAssets;
    }
    public AE2Asset getAssetsWithId(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipAssetManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mProject.getAssetWithId(p0);
    }
    public boolean replaceTextureWithId(String p0,int p1){
       ClipAssetManager uClipAssetMa = ClipAssetManager.class;
       if (PatchProxy.isSupport(uClipAssetMa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uClipAssetMa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.mAssetRender.replaceTextureWithId(p0, p1);
    }
    public boolean replaceTextureWithId(String p0,int p1,AE2AssetExtraData p2){
       if (PatchProxy.isSupport(ClipAssetManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, ClipAssetManager.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = this.mAssetRender.replaceTextureWithId(p0, p1) & (this.mAssetRender.setAssetExtraData(p0, p2) & 0x01);
       if (!i) {
          EditorSdkLogger.e("ClipAssetManager", "replaceTextureWithId failed");
       }
       return i;
    }
}
