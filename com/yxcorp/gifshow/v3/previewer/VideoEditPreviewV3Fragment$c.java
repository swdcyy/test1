package com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import voc.o;
import com.yxcorp.gifshow.v3.f;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.yxcorp.gifshow.v3.editor.k;
import java.util.Objects;
import faa.a;
import q87.c;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import android.content.res.Resources;
import cw9.c;
import java.lang.Math;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import w46.b;

public class VideoEditPreviewV3Fragment$c implements Runnable	// class@001583
{
    public final VideoEditPreviewV3Fragment b;

    public void VideoEditPreviewV3Fragment$c(VideoEditPreviewV3Fragment p0){
       this.b = p0;
       super();
    }
    public void run(){
       boolean b;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VideoEditPreviewV3Fragment$c.class, "1")) {
          return;
       }
       if (!PostExperimentUtils.l1() && !b.a(-404437045).g()) {
          EditorSdk2V2$VideoEditorProject videoEditorP = this.b.L.f();
          long l = 0x7e9000;
          f uof = f.class;
          if (PatchProxy.isSupport(uof)) {
             Object obj = PatchProxy.applyTwoRefs(videoEditorP, Long.valueOf(l), objArray, uof, "38");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(videoEditorP != null && videoEditorP.trackAssets().isNotEmpty()){
                int i1 = 0;
                while (true) {
                   if (i1 < videoEditorP.trackAssetsSize()) {
                      EditorSdk2V2$TrackAsset trackAsset = videoEditorP.trackAssets(i1);
                      long l1 = (long)EditorSdk2UtilsV2.getTrackAssetWidth(trackAsset) * (long)EditorSdk2UtilsV2.getTrackAssetHeight(trackAsset);
                      if (l1 - l >= 0) {
                         b = true;
                      }else {
                         i1 = i1 + 1;
                      }
                   }
                }
             }
             b = false;
          }else {
             goto label_004d ;
          }
          if (!b) {
             k ok = k.f();
             Objects.requireNonNull(ok);
             if (!PatchProxy.applyVoid(objArray, ok, k.class, "18")) {
                String str = "ThumbnailHelper";
                if (ok.c == null || ok.a == null) {
                   objArray1 = new Object[0];
                   a.D().t(str, "autoFetchThumbnail check null", objArray1);
                }else {
                   ok.b = true;
                   objArray1 = new Object[0];
                   a.D().s(str, "autoFetchThumbnail", objArray1);
                   int i = a1.e(48.00f);
                   ok.h(Math.ceil((double)(((float)(n.z(a.a().a()) - (a1.e(15.00f) * 2)) * 0x3f800000) / (float)c.b(a.a().a().getResources(), R.dimen.arg_RES_7f07017f))), 0, ((ok.a.getVideoWidth() * i) / ok.a.getVideoHeight()), i);
                }
             }
          }
       }
       return;
    }
}
