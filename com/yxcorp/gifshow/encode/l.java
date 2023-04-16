package com.yxcorp.gifshow.encode.l;
import io.reactivex.g;
import java.util.List;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import brd.v;
import com.kwai.robust.PatchProxyResult;
import pca.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.ClipImportHandler;
import gq.a;
import q87.c;
import mca.a;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import com.kwai.feature.post.api.core.model.GSConfig;
import com.yxcorp.gifshow.media.model.EncodeConfig$ImportEncodeConfig;
import com.yxcorp.gifshow.encode.k;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportCachePath;
import java.lang.Throwable;
import java.lang.Exception;
import brd.g;
import java.lang.Boolean;
import pca.x$a;
import pca.w;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportHandlerListener;
import pca.t;
import erd.f;
import com.kwai.video.clipkit.ClipImportHandler$ClipImportResult;

public final class l implements g	// class@000d2f
{
    public final List b;
    public final String c;
    public final Context d;

    public void l(List p0,String p1,Context p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       Object[] objArray;
       x$a uoa;
       l ol = this;
       g og = p0;
       l b = ol.b;
       l c = ol.c;
       l d = ol.d;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x ox = x.class;
       ClipImportHandler uClipImportH = PatchProxy.applyTwoRefs(b, c, null, ox, "1");
       boolean b1 = true;
       int i = 0;
       if (uClipImportH != patchProxyRe) {
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w("ClipKitExport", "initImportHandler", objArray1);
          String[] stringArray = new String[b.size()];
          for (int i2 = 0; i2 < b.size(); i2 = i2 + 1) {
             stringArray[i2] = b.get(i2);
          }
          try{
             a.u();
             if (!x.f()) {
                Object[] objArray2 = new Object[i];
                a.D().w("ClipKitExport", "initImportHandler: create dir fail", objArray2);
             }else {
                ClipImportHandler uClipImportH1 = new ClipImportHandler(c, stringArray, x.h(stringArray), null);
                EncodeConfig$ImportEncodeConfig importEncode = GSConfig.c().getImportEncodeConfig();
                if (importEncode != null) {
                   uClipImportH1.setImportParamWithPriority(importEncode.getImportTranscodeParams(), b1);
                }
                Object[] objArray3 = new Object[i];
                a.D().w("hwcfg_ClipKitExport", "initImportHandler: use devicepersona hardwareconfig", objArray3);
                uClipImportH1.setImportCatchPath(k.a);
                uClipImportH = uClipImportH1;
             }
          }catch(java.io.IOException e0){
             a.D().z("ClipKitExport", "initImportHandler: ", e0);
          }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
             a.D().z("ClipKitExport", "initImportHandler: ", e0);
          }
          uClipImportH = null;
       }
       if (uClipImportH == null) {
          objArray = new Object[i];
          a.D().A("ClipKitExport", "export,  initImportHandler fail", objArray);
          og.onError(new Exception("mImportHandler is null"));
       }else {
          int[] obj = PatchProxy.applyTwoRefs(d, uClipImportH, null, ox, "2");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             obj = uClipImportH.isNeedRebuild(d);
             int len = obj.length;
             int i1 = 0;
             while (true) {
                if (i1 < len) {
                   if (obj[i1] <= 0) {
                      i1 = i1 + 1;
                   }
                }else {
                   b1 = false;
                }
             }
          }
          if (!b1) {
             objArray = new Object[i];
             a.D().w("ClipKitExport", "export: not need rebuild", objArray);
             uoa = new x$a(-1, 0, null, 0, false);
             og.onNext(obj);
             p0.onComplete();
          }else {
             uClipImportH.setImportHandlerListener(new w(og));
             og.setCancellable(new t(uClipImportH));
             uClipImportH.run(d);
             objArray = new Object[i];
             a.D().w("ClipKitExport", "·¢ËÍµ¯´°", objArray);
             uoa = new x$a(0, 0, null, 0, false);
             og.onNext(obj);
          }
       }
       return;
    }
}
