package com.yxcorp.gifshow.edit.previewer.loaderv2.h;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.kuaishou.edit.draft.Makeup;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupAdjust;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosMakeupResource;
import java.util.Iterator;
import com.kuaishou.edit.draft.Makeup$SubFeatures;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import xaa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;

public class h extends a	// class@001b40
{
    public a h;

    public void h(){
       super();
    }
    public static Minecraft$WesterosMakeupParam h(Makeup p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       int i1 = p0.getSubFeaturesList().size();
       Minecraft$WesterosMakeupParam westerosMake = new Minecraft$WesterosMakeupParam();
       Minecraft$WesterosMakeupAdjust[] westerosMake1 = new Minecraft$WesterosMakeupAdjust[i1];
       Minecraft$WesterosMakeupResource[] westerosMake2 = new Minecraft$WesterosMakeupResource[i1];
       Iterator iterator = p0.getSubFeaturesList().iterator();
       while (iterator.hasNext()) {
          Makeup$SubFeatures subFeatures = iterator.next();
          Minecraft$WesterosMakeupResource westerosMake3 = new Minecraft$WesterosMakeupResource();
          westerosMake3.setType(subFeatures.getSecodaryTypeId());
          westerosMake3.setResourceDir(subFeatures.getResPath());
          westerosMake3.setIntensity(subFeatures.getIntensity());
          westerosMake3.setPriority(subFeatures.getPriority());
          westerosMake2[i] = westerosMake3;
          Minecraft$WesterosMakeupAdjust westerosMake4 = new Minecraft$WesterosMakeupAdjust();
          westerosMake4.setIndensity(subFeatures.getIntensity());
          westerosMake4.setMode(subFeatures.getSecodaryTypeId());
          westerosMake1[i] = westerosMake4;
          i = i + 1;
       }
       westerosMake.setResources(westerosMake2);
       westerosMake.setAdjusts(westerosMake1);
       return westerosMake;
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "1")) {
          return;
       }
       this.h = p0.a.w0();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       Makeup makeup = this.h.v();
       if (makeup == null) {
          return;
       }
       Minecraft$WesterosMakeupParam westerosMake = h.h(makeup);
       for (int i = 0; i < this.b.trackAssetsSize(); i = i + 1) {
          this.b.trackAssets(i).setWesterosMakeupParam(westerosMake);
       }
       return;
    }
    public int g(){
       return 1;
    }
}
