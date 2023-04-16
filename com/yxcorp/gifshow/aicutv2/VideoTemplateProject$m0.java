package com.yxcorp.gifshow.aicutv2.VideoTemplateProject$m0;
import erd.o;
import com.yxcorp.gifshow.aicutv2.VideoTemplateProject;
import java.lang.Object;
import o69.g1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.kwai.video.ksmemorykit.EditorSmartClipResult;
import fg6.a;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import t69.j;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import o69.c;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import java.lang.Double;
import java.lang.Long;
import java.lang.Number;
import i69.d;
import j69.a;
import j69.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import brd.t;

public final class VideoTemplateProject$m0 implements o	// class@001991
{
    public final VideoTemplateProject b;

    public void VideoTemplateProject$m0(VideoTemplateProject p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       String str;
       t ot = PatchProxy.applyOneRefs(p0, this, VideoTemplateProject$m0.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "task");
          EditorSmartClipResult uEditorSmart = p0.d();
          if (uEditorSmart != null) {
             String[] sceneDetecti = uEditorSmart.getSceneDetectionJsonResults();
             if (sceneDetecti != null) {
                str = a.a.r(ArraysKt___ArraysKt.uy(sceneDetecti), new j().getType());
             label_0038 :
                String str1 = str;
                p0 = p0.d();
                if (p0 != null) {
                   p0 = p0.getProject();
                   if (p0 != null) {
                      p0 = p0.trackAssets();
                      if (p0 != null) {
                         p0 = p0.iterator();
                         while (p0.hasNext()) {
                            EditorSdk2V2$TrackAsset trackAsset = p0.next();
                            Iterator iterator = this.b.M().iterator();
                            while (iterator.hasNext()) {
                               QMedia qMedia = iterator.next();
                               if (a.g(trackAsset.assetPath(), qMedia.path)) {
                                  EditorSdk2V2$TimeRangeV2 timeRangeV2 = trackAsset.clippedRange();
                                  Double uDouble = (timeRangeV2 != null)? Double.valueOf(timeRangeV2.start()): Long.valueOf(0);
                                  qMedia.mClipStart = uDouble.longValue();
                                  timeRangeV2 = trackAsset.clippedRange();
                                  if (timeRangeV2 != null) {
                                     uDouble = Double.valueOf(timeRangeV2.duration());
                                  }else {
                                     long l = qMedia.duration * 1000;
                                     Long longx = Long.valueOf(l);
                                  }
                                  qMedia.mClipDuration = uDouble.longValue();
                               }
                            }
                         }
                      }
                   }
                }
                p0 = this.b;
                ot = this.b.P0(str1, CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E(), d.d.a().c().m2(), p0.U, p0.N0());
             }
          }
          str = false;
          goto label_0038 ;
       }
       return ot;
    }
}
