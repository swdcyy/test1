package com.yxcorp.gifshow.encode.RxExportApi;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Math;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ConditionLimit;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import cj9.b;
import tkd.b;
import tkd.d;
import b26.c;
import b26.d;
import com.kwai.feature.post.api.core.model.GSConfig;
import com.yxcorp.gifshow.media.model.EncodeConfig$ImportEncodeConfig;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.IllegalStateException;
import com.yxcorp.gifshow.encode.RxExportApi$a;
import brd.t;
import com.kwai.video.clipkit.mv.TemplateImportHandler;
import android.content.Context;
import lnc.a1;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.yxcorp.gifshow.encode.y0;
import io.reactivex.g;
import t45.d;
import brd.z;
import pca.b2;
import erd.a;

public final class RxExportApi	// class@000d0a
{

    public void RxExportApi(){
       super();
    }
    public static Size a(int p0,int p1){
       Size size;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RxExportApi rxExportApi = RxExportApi.class;
       if (PatchProxy.isSupport(rxExportApi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, rxExportApi, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (PatchProxy.isSupport(rxExportApi)) {
          size = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(1280), null, RxExportApi.class, "4");
          if (size != patchProxyRe) {
          label_005e :
             return size;
          }
       }
       float f = ((float)p0 * 0x3f800000) / (float)p1;
       if (p0 < p1) {
          p0 = Math.min(1280, p1);
          p1 = (int)((float)p0 * f);
       }else {
          p1 = Math.min(1280, p0);
          p0 = (int)((float)p1 / f);
       }
       size = new Size(p1, p0);
       goto label_005e ;
    }
    public static Size b(int p0,int p1,int p2,int p3,boolean p4,boolean p5,int p6){
       int i1;
       int i2;
       Object[] objArray2;
       RxExportApi rxExportApi = RxExportApi.class;
       int i = 1;
       EditorSdk2$ConditionLimit uConditionLi = null;
       if (PatchProxy.isSupport(rxExportApi)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5),Integer.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, uConditionLi, rxExportApi, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float f = ((float)p2 * 0x3f800000) / (float)p3;
       float f1 = (float)p1;
       float f2 = ((float)p0 * 0x3f800000) / f1;
       if (p6 > 0) {
          uConditionLi = EditorSdk2Utils.getMVConditionLimitNativeLimit(p6);
       }
       if (!p4) {
          if (uConditionLi == null || (!uConditionLi.imageLimitWidth() || !uConditionLi.imageLimitHeight())) {
             i = 0;
          }
          if (i) {
             i1 = Math.min(uConditionLi.imageLimitWidth(), uConditionLi.imageLimitHeight());
             if (p0 < p1) {
                i1 = Math.min(Math.min(i1, p1), p3);
             }else {
                i2 = Math.min(Math.min(i1, p0), p2);
             label_0116 :
                i1 = (int)((float)i2 / f2);
             }
          }else {
             i1 = 1280;
             if (p0 < p1) {
                i1 = Math.min(i1, p1);
             }else {
                i2 = Math.min(i1, p0);
                goto label_0116 ;
             }
          }
          i2 = (int)((float)i1 * f2);
       }else {
          i1 = Math.min(p2, p0);
          if (uConditionLi != null && (uConditionLi.videoLimitWidth() && uConditionLi.videoLimitHeight())) {
             i1 = Math.min(i1, Math.min(uConditionLi.videoLimitWidth(), uConditionLi.videoLimitHeight()));
             objArray2 = new Object[0];
             a.D().w("RxExportApi", "calculateExportWH videoLimitWidth ="+uConditionLi.videoLimitWidth()+"videoLimitHeight ="+uConditionLi.videoLimitHeight(), objArray2);
          }
       label_00f2 :
          if (p5) {
             i2 = 1080;
             if (i1 > i2) {
                objArray2 = new Object[0];
                a.D().A("RxExportApi", "calculateExportWH: too big?  want to export w="+i1, objArray2);
             }
             i2 = Math.min(i1, i2);
             goto label_0116 ;
          }else {
             i = (int)((float)i1 / f);
             if (i > p1) {
                i2 = (int)(f1 * f);
                i1 = p1;
             }else {
                i2 = i1;
                i1 = i;
             }
          }
       }
       Object[] objArray1 = new Object[0];
       a.D().w("RxExportApi", "calculateExportWH normalize="+p5+", assetRatio: "+f+", mediaRatio: "+f2+", assetWidth: "+p2+", assetHeight: "+p3+", mediaWidth: "+p0+", mediaHeight: "+p1+", exportWidth: "+i2+", exportHeight: "+i1, objArray1);
       return new Size(i2, i1);
    }
    public static EditorSdk2$ExportOptions c(int p0,int p1){
       EditorSdk2$ExportOptions obj1;
       RxExportApi rxExportApi = RxExportApi.class;
       Object obj = null;
       if (PatchProxy.isSupport(rxExportApi)) {
          obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), obj, rxExportApi, "8");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       try{
          obj1 = EditorSdk2Utils.createDefaultExportOptions();
          obj1.setWidth(p0);
          obj1.setHeight(p1);
          obj1.setX264Params(b.c().getX264Params());
          if (d.a(0x2e6e89ac).C5(obj1.width(), obj1.height())) {
             EncodeConfig$ImportEncodeConfig importEncode = GSConfig.c().getImportEncodeConfig();
             obj1.setVideoEncoderType(5);
             obj1.setVideoGopSize(250);
             obj1.setVideoBitrate(0x7a1200);
             if (importEncode != null) {
                obj1.setVideoGopSize(importEncode.mVideoGopSize);
                obj1.setVideoBitrate(importEncode.mVideoBitrate);
             }
             Object[] objArray = new Object[0];
             a.D().w("RxExportApi", "createDefaultOptions: using hard encode videoGopSize="+obj1.videoGopSize()+" videoBitrate="+obj1.videoBitrate(), objArray);
          }
          return obj1;
       }catch(java.lang.Exception e0){
          return obj;
       }
    }
    public static File d(){
       File obj = PatchProxy.apply(null, null, RxExportApi.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(PostUtils.p(".video_cache")+File.separator+"export_api");
       int i = 0;
       String str = "RxExportApi";
       if (!obj.exists()) {
          Object[] objArray = new Object[i];
          a.D().s(str, "getCacheDir: create new dir "+obj, objArray);
          if (!obj.mkdir()) {
             throw new IllegalStateException("failed create "+obj);
          }
       }
       if (obj.isDirectory()) {
          return obj;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().A(str, "getCacheDir: is not directory "+obj, objArray1);
          throw new IllegalStateException("is not directory "+obj);
       }
    }
    public static t e(RxExportApi$a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RxExportApi.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("RxExportApi", "rxSdkTemplateExportHandlerTask invoked with config = "+p0, objArray);
       TemplateImportHandler templateImpo = new TemplateImportHandler(a1.c(), p0.a, p0.b, RxExportApi.d().getAbsolutePath(), p0.d, p0.c, p0.e, p0.f, p0.g, p0.h);
       return t.create(new y0(p0, obj)).subscribeOn(d.c).observeOn(d.a).doFinally(new b2(obj));
    }
}
