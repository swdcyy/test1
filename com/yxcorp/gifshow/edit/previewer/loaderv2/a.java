package com.yxcorp.gifshow.edit.previewer.loaderv2.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.a$a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import raa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.util.Objects;
import java.lang.Boolean;
import java.util.ArrayList;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.AEEffect;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import rba.c;
import sba.h;
import android.util.Pair;
import java.io.File;
import com.kwai.video.minecraft.model.nano.Minecraft$LegacyAE2Effect;
import com.kuaishou.edit.draft.TimeRange;
import com.kwai.video.minecraft.model.nano.Minecraft$Range;
import java.util.Iterator;
import wba.a;
import com.kwai.video.editorsdk2.EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings;
import kotlin.jvm.internal.a;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import qkd.b;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import lnc.i1;
import com.kwai.video.editorsdk2.EditorSdk2AE2Utils$CreateAE2EffectParamRet;
import com.kwai.video.editorsdk2.EditorSdk2AE2Utils;

public class a extends a	// class@001b2d
{
    public a h;
    public a$a i;

    public void a(){
       super();
       this.i = new a$a();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       this.h = this.a.m0();
       return;
    }
    public void d(){
       a a;
       boolean b1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, uoa, "3")) {
          return;
       }
       if (!DraftUtils.K(obj.a) && !DraftUtils.U(obj.a)) {
          a i = obj.i;
          a = obj.a;
          a b = obj.b;
          a d = obj.d;
          Objects.requireNonNull(i);
          a obj1 = PatchProxy.applyThreeRefs(a, b, d, i, a$a.class, "1");
          int i1 = 0;
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             a = a.m0();
             if (a != null && b.overlappedAE2Effects() != null) {
                List list1 = a.z();
                ArrayList uArrayList1 = b.overlappedAE2Effects();
                if (uArrayList1 != null && uArrayList1.size() == list1.size()) {
                   int i3 = 0;
                   while (true) {
                      if (i3 < list1.size()) {
                         AEEffect uAEEffect1 = list1.get(i3);
                         File uFile2 = d.c(BizCache.EffectiveFile).g(new Pair(uAEEffect1.getAeAssetDir(), a));
                         if (uFile2 != null) {
                            String absolutePath1 = uFile2.getAbsolutePath();
                            Minecraft$LegacyAE2Effect legacyAE2Eff = uArrayList1.get(i3);
                            if (uAEEffect1.getTimeRange().getStart() - legacyAE2Eff.assetTimeRange().start() || (uAEEffect1.getTimeRange().getDuration() - legacyAE2Eff.assetTimeRange().duration() || (absolutePath1.equals(legacyAE2Eff.assetDir()) && uAEEffect1.getFillingMode() == legacyAE2Eff.fillingMode()))) {
                               i3 = i3 + 1;
                            }
                         }
                      }else {
                         b1 = true;
                      }
                   }
                }
             }
          label_00d6 :
             b1 = false;
          }
          if (b1) {
             return;
          }else {
             obj.b.setOverlappedAE2Effects(objArray);
             a = obj.b;
             obj1 = obj.h;
             if (!PatchProxy.applyVoidTwoRefs(a, obj1, obj, uoa, "4")) {
                List list = obj1.z();
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   AEEffect uAEEffect = iterator.next();
                   EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings uEditorSdk2A = PatchProxy.applyTwoRefs(obj1, uAEEffect, objArray, a.class, "1");
                   if (uEditorSdk2A != patchProxyRe) {
                   }else {
                      a.p(obj1, "baseDraft");
                      a.p(uAEEffect, "aeEffect");
                      uEditorSdk2A = new EditorSdk2AE2Utils$EditorSdk2AE2EffectSettings();
                      TimeRange timeRange = uAEEffect.getTimeRange();
                      a.o(timeRange, "aeEffect.timeRange");
                      double start = timeRange.getStart();
                      timeRange = uAEEffect.getTimeRange();
                      a.o(timeRange, "aeEffect.timeRange");
                      uEditorSdk2A.displayRange = EditorSdk2Utils.createTimeRange(start, timeRange.getDuration());
                      File uFile = DraftFileManager.E().B(uAEEffect.getAeAssetDir(), obj1);
                      String absolutePath = (uFile != null)? uFile.getAbsolutePath(): objArray;
                      uEditorSdk2A.ae2AssetDir = absolutePath;
                      uEditorSdk2A.fillingMode = uAEEffect.getFillingMode();
                      uEditorSdk2A.textPicArray = new ArrayList();
                      int textPictureP = uAEEffect.getTextPicturePathCount();
                      int i2 = 0;
                      while (i2 < textPictureP) {
                         File uFile1 = DraftFileManager.E().B(uAEEffect.getTextPicturePath(i2), obj1);
                         if (!b.S(uFile1)) {
                            i1.c(new RuntimeException("AEEffectLoader load text file invalid textFile:"+uAEEffect.getTextPicturePath(i2)+",i:"+i2));
                         }else {
                            a.o(uFile1, "textFile");
                            uEditorSdk2A.textPicArray.add(uFile1.getAbsolutePath());
                         }
                         i2 = i2 + 1;
                         String str = null;
                      }
                   }
                   Objects.toString(uEditorSdk2A);
                   uArrayList.add(uEditorSdk2A);
                   objArray = null;
                }
                if (!PatchProxy.applyVoidTwoRefs(a, uArrayList, obj, uoa, "5")) {
                   while (i1 < uArrayList.size()) {
                      EditorSdk2AE2Utils$CreateAE2EffectParamRet uCreateAE2Ef = EditorSdk2AE2Utils.applyAE2EffectOnProjectBySettingsV2(a, uArrayList.get(i1));
                      if (uCreateAE2Ef.param == null) {
                         i1.c(new RuntimeException("AEEffectLoader load error create createAE2EffectParamRet failed error:"+uCreateAE2Ef.error));
                      }
                      i1 = i1 + 1;
                   }
                }
                list.toString();
             }
          }
       }
       return;
    }
    public void f(EditorSdk2V2$VideoEditorProject p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       p0.setOverlappedAE2Effects(null);
       return;
    }
    public int g(){
       return 1;
    }
}
