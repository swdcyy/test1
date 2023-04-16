package com.yxcorp.gifshow.edit.previewer.loaderv2.a$a;
import qba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import rba.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import raa.a;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.AEEffect;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import sba.h;
import android.util.Pair;
import java.io.File;
import com.kwai.video.minecraft.model.nano.Minecraft$LegacyAE2Effect;
import com.kuaishou.edit.draft.TimeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;

public class a$a extends a	// class@001b2b
{

    public void a$a(){
       super();
    }
    public boolean a(c p0,EditorSdk2V2$VideoEditorProject p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a uoa = p0.m0();
       if (uoa != null && p1.overlappedAE2Effects() != null) {
          List list = uoa.z();
          ArrayList uArrayList = p1.overlappedAE2Effects();
          if (uArrayList != null && uArrayList.size() == list.size()) {
             int i = 0;
             while (true) {
                if (i >= list.size()) {
                   return true;
                }
                AEEffect uAEEffect = list.get(i);
                File uFile = p2.c(BizCache.EffectiveFile).g(new Pair(uAEEffect.getAeAssetDir(), uoa));
                if (uFile == null) {
                   break ;
                }else {
                   String absolutePath = uFile.getAbsolutePath();
                   Minecraft$LegacyAE2Effect legacyAE2Eff = uArrayList.get(i);
                   if (!uAEEffect.getTimeRange().getStart() - legacyAE2Eff.assetTimeRange().start() && (!uAEEffect.getTimeRange().getDuration() - legacyAE2Eff.assetTimeRange().duration() && (!absolutePath.equals(legacyAE2Eff.assetDir()) || uAEEffect.getFillingMode() != legacyAE2Eff.fillingMode()))) {
                      return false;
                   }else {
                      i = i + 1;
                   }
                }
             }
             return false;
          }
       }
       return false;
    }
}
