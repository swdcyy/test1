package com.yxcorp.gifshow.encode.i;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.config.AuditFrameUploadParam;
import java.lang.String;
import java.lang.reflect.Type;
import gq.a;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.StringBuilder;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import k2b.u1;
import java.util.List;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import brd.t;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import com.yxcorp.gifshow.encode.e;
import io.reactivex.g;
import pca.d;
import erd.a;
import pca.e;
import pca.h;
import erd.g;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.Thread;
import java.util.Collections;
import com.kwai.video.editorsdk2.ThumbnailGenerator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import ekd.k1;
import java.lang.Double;
import java.io.File;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import lnc.a1;
import com.yxcorp.gifshow.util.v;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequestBuilder;
import com.kwai.video.editorsdk2.ThumbnailGeneratorRequest;
import com.kwai.video.editorsdk2.ThumbnailGeneratorResult;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.kwai.video.editorsdk2.ExportTask;
import com.kwai.video.editorsdk2.ExportEventListener;

public class i	// class@000d27
{
    public a a;
    public ExportTask b;
    public float c;
    public int d;
    public ThumbnailGenerator e;
    public AuditFrameUploadParam f;
    public Map g;
    public Map h;
    public int i;
    public int j;
    public boolean k;

    public void i(boolean p0){
       super();
       ExportTask uExportTask = null;
       this.b = uExportTask;
       this.c = 0;
       this.d = -1;
       this.g = new HashMap();
       this.h = new HashMap();
       this.k = p0;
       AuditFrameUploadParam value = a.t().getValue("rawFrameUploadParam2", AuditFrameUploadParam.class, uExportTask);
       this.f = value;
       if (value != null) {
          value = value.mMaxCount;
          if (value != null) {
             this.j = value;
             return;
          }
       }
       Object[] objArray = new Object[0];
       a.D().s("AssetExportManager", "auditFrameParam is null or maxCount is 0", objArray);
       return;
    }
    public static void c(int p0,long p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), null, oi, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AssetExportManager", "logExportFinish\(\) status = ["+p0+"], produceTime = ["+p1+"]", objArray);
       h$b uob = h$b.e(p0, "MPORT_VIDEO_CUT_COST");
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.timeCost = p1;
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public static t f(List p0,KSAssetExportInfo p1,boolean p2,boolean p3,boolean p4){
       int i;
       i oi = i.class;
       i = 0;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, oi, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray1 = new Object[i];
       a.D().s("AssetExportManager", "rxCompressAndClipMedias\(\) medias = ["+p0.size()+"], ksAssetExportInfo = ["+p1+"], isForceClip = ["+p2+"]", objArray1);
       long l = System.currentTimeMillis();
       e uoe = new e(new i(p4), p0, p1, p2, p3);
       return t.create(p4).doOnComplete(new d(l)).doOnDispose(new e(l)).doOnError(new h(l));
    }
    public final EditorSdk2V2$VideoEditorProject a(String p0){
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.applyOneRefs(p0, this, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = EditorSdk2UtilsV2.createProjectWithFile(p0);
       EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[1];
       obj.setTrackAssets(trackAssetAr);
       EditorSdk2V2$TrackAsset trackAsset = new EditorSdk2V2$TrackAsset();
       trackAsset.setAssetPath(p0);
       obj.trackAssetsSetItem(0, trackAsset);
       return obj;
    }
    public final List b(EditorSdk2V2$VideoEditorProject p0,List p1){
       int i;
       File uFile;
       String str;
       i oi = this;
       String obj = p0;
       List list = p1;
       i obj1 = PatchProxy.applyTwoRefs(obj, list, oi, i.class, "12");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       i = 0;
       Object[] objArray = new Object[i];
       a.D().s("AssetExportManager", "fetchFrame: start, currentThread: "+Thread.currentThread(), objArray);
       obj1 = oi.e;
       if (obj1 == null) {
          return Collections.emptyList();
       }
       obj1.setProject(obj);
       int computedWidt = EditorSdk2UtilsV2.getComputedWidth(p0);
       int computedHeig = EditorSdk2UtilsV2.getComputedHeight(p0);
       obj = obj.trackAssets(i).assetPath();
       Object[] objArray1 = new Object[i];
       a.D().s("AssetExportManager", "fetchFrame width: "+computedWidt+", height: "+computedHeig, objArray1);
       ArrayList uArrayList = Lists.b();
       int i1 = 0;
       while (true) {
          if (i1 >= p1.size()) {
             return uArrayList;
          }
          long l = k1.i();
          double d = list.get(i1).doubleValue();
          if (oi.e == null) {
             break ;
          }else {
             int i2 = 4;
             int i3 = 5;
             int i4 = 1;
             if (PatchProxy.isSupport(i.class)) {
                Object[] objArray2 = new Object[i3];
                objArray2[0] = obj;
                objArray2[i4] = Integer.valueOf(i1);
                objArray2[2] = Integer.valueOf(computedWidt);
                objArray2[3] = Integer.valueOf(computedHeig);
                objArray2[i2] = Double.valueOf(d);
                uFile = PatchProxy.apply(objArray2, null, i.class, "13");
                if (uFile != PatchProxyResult.class) {
                   str = obj;
                label_011a :
                   obj = uFile.getAbsolutePath();
                   if (uFile.exists()) {
                      objArray1 = new Object[0];
                      a.D().w("AssetExportManager", "fetchFrame: has cache using "+uFile, objArray1);
                      uArrayList.add(obj);
                   }else {
                      Bitmap thumbnailBit = obj1.getThumbnailSync(obj1.newRequestBuilder().setUseMetadataRetriever(true).setThumbnailSize(computedWidt, computedHeig).setPositionByRenderPositionSec(d).build()).getThumbnailBitmap();
                      if (thumbnailBit != null) {
                         BitmapUtil.M(thumbnailBit, obj, 100);
                         uArrayList.add(obj);
                         objArray2 = new Object[0];
                         a.D().s("AssetExportManager", "fetchFrameManual timeCost: "+k1.t(l)+", pos: "+d+", index: "+i1+", threadId: "+Thread.currentThread().getId(), objArray2);
                      label_01ab :
                         i1 = i1 + 1;
                         oi = this;
                         list = p1;
                         obj = str;
                         i oi1 = null;
                      }
                   }
                   obj = null;
                   goto label_01ab ;
                }else {
                   i3 = 5;
                }
             }
             Object[] objArray3 = new Object[i3];
             objArray3[0] = obj;
             objArray3[1] = Integer.valueOf(i1);
             objArray3[2] = Integer.valueOf(computedWidt);
             objArray3[3] = Integer.valueOf(computedHeig);
             objArray3[i2] = Double.valueOf(d);
             str = obj;
             uFile = new File(a1.c().getCacheDir(), v.f(TextUtils.join("_", objArray3))+".jpg");
             goto label_011a ;
          }
       }
       return Collections.emptyList();
    }
    public void d(ExportTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("AssetExportManager", "releaseExportTask", objArray);
       if (p0 != null) {
          p0.setExportEventListener(null);
          p0.release();
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, i.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("AssetExportManager", "releaseThumbnailGenerator", objArray);
       i te = this.e;
       if (te != null) {
          te.release();
          this.e = null;
       }
       return;
    }
}
