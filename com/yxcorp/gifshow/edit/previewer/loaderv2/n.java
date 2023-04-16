package com.yxcorp.gifshow.edit.previewer.loaderv2.n;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import saa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import saa.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.ColorFilter;
import com.kuaishou.edit.draft.EnhanceColorFilter;
import com.kuaishou.edit.draft.ColorFilter$ResourceType;
import wba.a0;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import lnc.i1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import wba.d0;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import ekd.j;
import com.yxcorp.gifshow.edit.previewer.loaderv2.l;
import z1.i;
import s16.a;
import java.util.List;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import rba.c;
import sba.h;
import android.util.Pair;
import com.yxcorp.gifshow.edit.previewer.loaderv2.m;
import com.kwai.video.minecraft.model.nano.Minecraft$ColorFilterParam;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import haa.f;
import q87.c;

public class n extends a	// class@001b46
{
    public a h;
    public c i;

    public void n(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "1")) {
          return;
       }
       this.h = this.a.r0();
       this.i = this.a.x0();
       return;
    }
    public void d(){
       int i2;
       Object obj = this;
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, on, "2")) {
          return;
       }
       ColorFilter uColorFilter = obj.h.v();
       n i = obj.i;
       EnhanceColorFilter uEnhanceColo = (i != null)? i.v(): objArray;
       String str = "7";
       int i1 = 0;
       if (uColorFilter != null) {
          if (uColorFilter.getResourceType() == ColorFilter$ResourceType.ZIP) {
             this.h();
             if (!PatchProxy.applyVoidOneRefs(uColorFilter, obj, on, "3")) {
                n h = obj.h;
                String str1 = PatchProxy.applyTwoRefs(uColorFilter, h, objArray, a0.class, str);
                if (str1 != PatchProxyResult.class) {
                }else {
                   a.p(uColorFilter, "colorFilter");
                   a.p(h, "colorFilterDraft");
                   if (uColorFilter.getResourcesCount()) {
                      File uFile1 = DraftFileManager.E().B(uColorFilter.getResources(i1), h);
                      if (uFile1 != null) {
                         str1 = uFile1.getAbsolutePath();
                         a.o(str1, "unzipFile.absolutePath");
                      }else {
                         i1.c(new RuntimeException("error getColorFilterUnzipFilePath failed filterInfo:"+uColorFilter));
                      }
                   }
                   str1 = "";
                }
                if (!TextUtils.x(str1)) {
                   Minecraft$WesterosFaceMagicParam westerosFace = d0.c(uColorFilter, str1);
                   if (!j.h(obj.b.trackAssets().toNormalArray())) {
                      for (i2 = 0; i2 < obj.b.trackAssetsSize(); i2 = i2 + 1) {
                         EditorSdk2V2$TrackAsset trackAsset = obj.b.trackAssets(i2);
                         trackAsset.setMoreWesterosFaceMagicParams(a.f(trackAsset.moreWesterosFaceMagicParams().toNormalArray(), l.a));
                         trackAsset.setMoreWesterosFaceMagicParams(a.e(trackAsset.moreWesterosFaceMagicParams().toNormalArray(), westerosFace));
                      }
                   }
                }
             }
          }else {
             i2 = uColorFilter.getResourcesCount();
             String[] stringArray1 = new String[i2];
             if (i2 <= 0) {
                return;
             }else {
                i2 = 0;
                while (i2 < uColorFilter.getResourcesList().size()) {
                   File uFile2 = obj.d.c(BizCache.EffectiveFile).g(new Pair(uColorFilter.getResources(i2), obj.h));
                   if (uFile2 != null) {
                      stringArray1[i2] = uFile2.getAbsolutePath();
                   }else {
                      stringArray1[i2] = "";
                      obj.i("color filter file not found.");
                   }
                   i2 = i2 + 1;
                   n on1 = null;
                }
                if (!PatchProxy.applyVoid(objArray, obj, on, "4")) {
                   a b = obj.b;
                   if (b != null) {
                      EditorSdk2V2$TrackAsset[] trackAssetAr = b.trackAssets().toNormalArray();
                      if (trackAssetAr != null) {
                         i2 = trackAssetAr.length;
                         int i3 = 0;
                         while (i3 < i2) {
                            object oobject = trackAssetAr[i3];
                            if (oobject != null) {
                               oobject.setMoreWesterosFaceMagicParams(a.f(oobject.moreWesterosFaceMagicParams().toNormalArray(), m.a));
                            }
                            i3 = i3 + 1;
                            m om = null;
                         }
                      }
                   }
                }
                obj.b.setColorFilter(EditorSdk2Utils.createColorFilterParam(uColorFilter.getSdkType(), (uColorFilter.getIntensity() * 100.00f), stringArray1));
             }
          }
       }else {
          this.h();
       }
       if (uEnhanceColo != null) {
          if (!PatchProxy.applyVoidOneRefs(uEnhanceColo, obj, on, str)) {
             int resourcesCou = uEnhanceColo.getResourcesCount();
             String[] stringArray = new String[resourcesCou];
             if (resourcesCou > 0) {
                i1 = 0;
                while (i1 < uEnhanceColo.getResourcesList().size()) {
                   File uFile = obj.d.c(BizCache.EffectiveFile).g(new Pair(uEnhanceColo.getResources(i1), obj.i));
                   if (uFile != null) {
                      stringArray[i1] = uFile.getAbsolutePath();
                   }else {
                      stringArray[i1] = "";
                      obj.i("color filter file not found.");
                   }
                   i1 = i1 + 1;
                }
                obj.b.setEnhanceColorFilter(EditorSdk2Utils.createColorFilterParam(uEnhanceColo.getSdkType(), (uEnhanceColo.getIntensity() * 100.00f), stringArray));
             }
          }
       }else if(PatchProxy.applyVoid(null, obj, on, "6")){
          obj.b.setEnhanceColorFilter(null);
       }
       return;
    }
    public int g(){
       return 1;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, n.class, "5")) {
          return;
       }
       this.b.setColorFilter(null);
       return;
    }
    public final void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       f.D().A("FilterLoader", p0, objArray);
       return;
    }
}
