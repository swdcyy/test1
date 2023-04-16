package com.yxcorp.gifshow.edit.previewer.utils.KtvEditUtils;
import java.lang.Object;
import com.yxcorp.gifshow.edit.previewer.utils.KtvEditUtils$KtvAssetIdType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.edit.previewer.utils.KtvEditUtils$a;
import java.lang.Enum;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Boolean;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset;
import qaa.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import wba.b;

public class KtvEditUtils	// class@001b66
{

    public void KtvEditUtils(){
       super();
    }
    public static int a(KtvEditUtils$KtvAssetIdType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KtvEditUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = KtvEditUtils$a.a[p0.ordinal()];
       if (i == 1) {
          return 1011;
       }
       if (i != 2) {
          return 0;
       }
       return 1012;
    }
    public static File b(){
       Object obj = PatchProxy.apply(null, null, KtvEditUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostUtils.p("ktv_def_cover");
    }
    public static boolean c(c p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KtvEditUtils ktvEditUtils = KtvEditUtils.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, ktvEditUtils, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (p0 != null && (p0.o0() != null && p0.o0().p() == 1)) {
          a uoa = p0.o0();
          Object obj1 = PatchProxy.applyOneRefs(uoa, null, ktvEditUtils, "2");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(uoa != null && (uoa.p() > 0 && (uoa.v().getAlbumId() != null && !(uoa.v().getAlbumId()).startsWith(KtvEditUtils.b().getAbsolutePath())))){
             b = true;
          }else {
             b = false;
          }
          if (b || !p0.s0().E()) {
             return true;
          }
       }
    label_0077 :
       return false;
    }
    public static void d(EditorSdk2V2$VideoEditorProject p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KtvEditUtils.class, "7")) {
          return;
       }
       ArrayList arrayList = p0.animatedSubAssets().getArrayList();
       Iterator iterator = arrayList.iterator();
       while (iterator.hasNext()) {
          if (b.s(iterator.next().opaque())) {
             iterator.remove();
          }
       }
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = new EditorSdk2V2$AnimatedSubAsset[arrayList.size()];
       p0.setAnimatedSubAssets(uAnimatedSub);
       for (int i = 0; i < arrayList.size(); i = i + 1) {
          p0.animatedSubAssetsSetItem(i, arrayList.get(i));
       }
       return;
    }
}
