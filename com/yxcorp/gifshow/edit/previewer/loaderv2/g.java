package com.yxcorp.gifshow.edit.previewer.loaderv2.g;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.kuaishou.edit.draft.Slimming;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosBodySlimmingParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosBodySlimmingAdjust;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.SlimmingItem;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import oaa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;

public class g extends a	// class@001b3f
{
    public a h;

    public void g(){
       super();
    }
    public static Minecraft$WesterosBodySlimmingParam h(Slimming p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Minecraft$WesterosBodySlimmingParam westerosBody = new Minecraft$WesterosBodySlimmingParam();
       Minecraft$WesterosBodySlimmingAdjust[] westerosBody1 = new Minecraft$WesterosBodySlimmingAdjust[p0.getItemsCount()];
       Iterator iterator = p0.getItemsList().iterator();
       while (iterator.hasNext()) {
          SlimmingItem slimmingItem = iterator.next();
          Minecraft$WesterosBodySlimmingAdjust westerosBody2 = new Minecraft$WesterosBodySlimmingAdjust();
          westerosBody2.setType(slimmingItem.getType());
          westerosBody2.setIntensity(slimmingItem.getValue());
          westerosBody1[i] = westerosBody2;
          i = i + 1;
       }
       westerosBody.setAdjusts(westerosBody1);
       return westerosBody;
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "1")) {
          return;
       }
       this.h = p0.a.v0();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       Slimming slimming = this.h.v();
       if (slimming == null) {
          return;
       }
       Minecraft$WesterosBodySlimmingParam westerosBody = g.h(slimming);
       for (int i = 0; i < this.b.trackAssetsSize(); i = i + 1) {
          this.b.trackAssets(i).setWesterosBodySlimmingParam(westerosBody);
       }
       return;
    }
    public int g(){
       return 1;
    }
}
