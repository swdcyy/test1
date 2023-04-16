package com.yxcorp.gifshow.aicutv2.m;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject$u;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import java.lang.Object;
import o69.d2$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import o69.c;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.util.List;
import com.yxcorp.gifshow.models.QMedia;

public final class m implements o	// class@0019ae
{
    public final VideoTemplateProject$u b;
    public final VideoTemplate c;

    public void m(VideoTemplateProject$u p0,VideoTemplate p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       m om = PatchProxy.applyOneRefs(p0, this, m.class, "1");
       if (om != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0 = this.b.b.a0().trackAssets();
          if (p0 != null) {
             int i = 0;
             p0 = p0.iterator();
             while (p0.hasNext()) {
                Object obj = p0.next();
                int i1 = i + 1;
                if (i < 0) {
                   CollectionsKt__CollectionsKt.W();
                }
                Iterator iterator = this.b.b.M().iterator();
                while (iterator.hasNext()) {
                   QMedia qMedia = iterator.next();
                   if (a.g(obj.assetPath(), qMedia.path)) {
                      int i2 = a.g(obj.assetPath(), qMedia.mExportFilePath) ^ 0x01;
                      if (i2) {
                         obj.setAssetPath(qMedia.mExportFilePath);
                      }
                   }
                }
                i = i1;
             }
          }
          om = this.c;
       }
       return om;
    }
}
