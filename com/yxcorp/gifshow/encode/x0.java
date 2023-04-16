package com.yxcorp.gifshow.encode.x0;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import android.graphics.Bitmap$Config;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.utility.RomUtils;
import o56.c;
import o56.a;
import xf6.g;
import java.lang.CharSequence;
import e17.i;
import gq.a;
import q87.c;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import javax.inject.Provider;
import com.yxcorp.gifshow.encode.x0$a;
import mca.a;
import com.yxcorp.gifshow.log.PostLogger;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.kwai.video.clipkit.log.ClipEditImageExportLog;
import java.lang.System;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import kotlin.Pair;
import x59.g;
import com.facebook.common.references.a;
import wba.z;
import com.kwai.feature.post.api.core.model.GSConfig;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.lang.StringBuilder;
import java.util.Collection;
import ekd.q;
import com.kuaishou.edit.draft.AssetSegment;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.io.File;
import qkd.b;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.yxcorp.gifshow.util.PictureMemoryUtils;
import android.app.Application;
import android.content.Context;
import com.kwai.video.clipkit.utils.Utils$Size;
import com.kwai.video.clipkit.config.ClipKitConfigManager;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.graphics.BitmapFactory$Options;
import android.graphics.BitmapFactory;
import com.yxcorp.gifshow.util.z;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.OutOfMemoryError;
import sxb.a;
import vba.d;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.yxcorp.gifshow.edit.previewer.utils.d;
import tkd.b;
import tkd.d;
import pca.c0;
import java.lang.Float;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.kwai.video.editorsdk2.BitmapFilterRendererWesteros;
import com.yxcorp.gifshow.media.util.c;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips$NoSpaceLeftException;
import java.lang.Throwable;
import pca.l;
import java.lang.RuntimeException;
import com.kwai.video.videoprocessor.JpegBuilderException;
import com.yxcorp.gifshow.encode.EncodeException;
import lnc.a1;
import com.kwai.video.clipkit.log.ClipEditLogger;
import java.lang.Integer;
import lq.i;
import lq.a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import ch7.i;
import com.kwai.performance.stability.oom.leakfix.base.LowMemoryLevel;

public final class x0	// class@000d58
{

    public void x0(){
       super();
    }
    public static Bitmap a(Bitmap p0,boolean p1){
       Bitmap obj;
       x0 ox0 = x0.class;
       if (PatchProxy.isSupport(ox0)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, ox0, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (Build$VERSION.SDK_INT >= 26 && p0.getConfig() == Bitmap$Config.RGBA_F16) {
          boolean b = false;
          if (a.t().d("convert_RGBA_F16", b) || RomUtils.w()) {
             if (a.a().c() && g.I()) {
                i.d(R.style.arg_RES_7f11066a, "convertBitmap convert");
             }
             Object[] objArray = new Object[b];
             a.D().w("ImageEncodeUtils", "processColorSpace is RGBA_F16 and vivo system, so convert to argb 8888", objArray);
             obj = Bitmap.createBitmap(p0.getWidth(), p0.getHeight(), Bitmap$Config.ARGB_8888);
             new Canvas(obj).drawBitmap(p0, new Matrix(), null);
             if (p1) {
                p0.recycle();
             }
             return obj;
          }
       }
       return p0;
    }
    public static boolean b(c p0,List p1,Provider p2,x0$a p3,boolean p4){
       PostLogger obj1;
       Object[] objArray4;
       String str7;
       List list3;
       int i9;
       String str8;
       g og1;
       PatchProxyResult patchProxyRe2;
       Bitmap uBitmap;
       int i11;
       b0 uob0;
       Size size;
       int height;
       File uFile;
       c uoc;
       a uoa1;
       d uod;
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub;
       VideoContext videoContext;
       EncodeException obj4;
       Bitmap uBitmap1;
       File uFile1;
       JpegBuilderException retcode;
       int i12;
       Object[] objArray5;
       PostWorkErrorTips$NoSpaceLeftException noSpaceLeftE;
       PostLogger postLogger;
       Object[] objArray6;
       Object obj5;
       Object[] objArray7;
       String str10;
       int i13;
       int i14;
       BitmapFactory$Options options;
       BitmapFactory$Options options1;
       Bitmap uBitmap2;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       String str = "exportImage error by no space left";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x0 ox0 = x0.class;
       int i = 2;
       int i1 = 3;
       x0 obj = null;
       int i2 = 1;
       int i3 = 0;
       String str1 = "1";
       if (PatchProxy.isSupport(ox0)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,p3,Boolean.valueOf(p4)};
          obj1 = PatchProxy.apply(objArray, obj, ox0, str1);
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       a.u();
       Object[] objArray1 = new Object[i3];
       a.D().w("ImageEncodeUtils", "exportImage", objArray1);
       obj1 = new PostLogger().c("ImageEncodeUtils");
       obj1.k(p0.V0());
       PostSubTaskEvent eNCODE_RENDE = PostSubTaskEvent.ENCODE_RENDER_IMAGE;
       String str2 = "exportImage\(\)";
       obj1.h(eNCODE_RENDE).j(PostLogger$Status.BEGIN).f(str2).d();
       GeneratedMessageLite generatedMes = p0.v();
       ClipEditImageExportLog uClipEditIma = new ClipEditImageExportLog();
       uClipEditIma.mSuccess = i2;
       long l = System.currentTimeMillis();
       if (generatedMes != null) {
          if (generatedMes.getType() == Workspace$Type.LONG_PICTURE) {
             uClipEditIma.mImageType = 29;
          }else if(generatedMes.getType() == Workspace$Type.ATLAS){
             uClipEditIma.mImageType = 30;
          }else if(generatedMes.getType() == Workspace$Type.SINGLE_PICTURE){
             if (p0.T0() == Workspace$Source.CAPTURE) {
                uClipEditIma.mImageType = 6;
             }else if(p0.T0() == Workspace$Source.IMPORT){
                uClipEditIma.mImageType = i;
             }
          }
       }
       Pair pair = x0.d();
       g og = pair.component2().component2();
       boolean b = pair.component1().booleanValue();
       Object obj2 = pair.component2().component1();
       List list = z.y(p0);
       if (generatedMes != null) {
          int i4 = GSConfig.b();
          obj = (generatedMes.getType() == Workspace$Type.SINGLE_PICTURE)? 1: 0;
          if (obj) {
             i4 = DraftFileManager.l;
          }
          int i5 = i4;
          String str3 = str2;
          String str4 = str;
          int i6 = 0;
          Object[] objArray2 = new Object[i6];
          a.D().w("ImageEncodeUtils", "exportImage assetSegmentList.size: "+list.size(), objArray2);
          if (!q.f(p1)) {
             objArray2 = new Object[i6];
             a.D().w("ImageEncodeUtils", "outputFiles by encodeInfo", objArray2);
             List list1 = (a.x())? z.v(p0): null;
             i3 = 0;
             str2 = null;
             while (true) {
                if (i3 < list.size()) {
                   int i7 = str2;
                   str2 = "task canceled";
                   if (p2.get().booleanValue()) {
                      Object[] objArray3 = new Object[0];
                      a.D().w("ImageEncodeUtils", str2, objArray3);
                      return 0;
                   }else {
                      List list2 = list;
                      EditorSdk2V2$AnimatedSubAsset[] obj3 = list.get(i3);
                      int i8 = i5;
                      pair = z.l(obj3, null);
                      String str5 = str1;
                      PatchProxyResult patchProxyRe1 = patchProxyRe;
                      String str6 = "processAtlasInfo: ";
                      x0 ox01 = ox0;
                      objArray4 = new Object[0];
                      a.D().w("ImageEncodeUtils", str6+i3+" finalPicture is "+pair.getFirst(), objArray4);
                      if (pair.getFirst() == null) {
                         x0.e(str6+i3+" file is null", oobject2);
                      label_01f2 :
                         str7 = null;
                      label_0372 :
                         i6 = p0;
                         list3 = list1;
                         i9 = obj;
                         str = str3;
                         str7 = str4;
                         str8 = str5;
                         obj = ox01;
                         og1 = og;
                         patchProxyRe2 = patchProxyRe1;
                      }else {
                         str6 = "processAtlasInfo index: ";
                         if (!b.S(pair.getFirst())) {
                            x0.e(str6+i3+" filePath: "+pair.getFirst().getAbsolutePath()+" is invalid", oobject2);
                            goto label_01f2 ;
                         }else {
                            a uoa = a.D();
                            String str9 = str6+i3+" assetSegment: "+obj3.getFile();
                            objArray1 = new Object[0];
                            try{
                               uoa.w("ImageEncodeUtils", str9, objArray1);
                               PictureMemoryUtils.a(BitmapUtil.E(obj3.getFile()));
                               if (a.x()) {
                                  if (generatedMes.getType() == Workspace$Type.SINGLE_PICTURE) {
                                     ClipKitConfigManager.getSingleExportSize(a.b());
                                  }else {
                                     ClipKitConfigManager.getAtlasExportSize(a.b());
                                  }
                                  str7 = list1.get(i3);
                                  String absolutePath = pair.getFirst().getAbsolutePath();
                                  if (new File(str7).exists()) {
                                     b0 uob01 = BitmapUtil.E(str7);
                                     i14 = uob01.b / uob01.a;
                                     float f = (float)i14;
                                     if (f - 0x4031c71c > 0) {
                                        i11 = 3;
                                     }else if((obj3.getCropFile()).length() > 0){
                                        i11 = 1;
                                     }else {
                                        absolutePath = list1.get(i3);
                                        i11 = 0;
                                     }
                                  }else {
                                     i11 = 2;
                                  }
                                  if (PostExperimentUtils.s0()) {
                                     options = new BitmapFactory$Options();
                                     options.inJustDecodeBounds = true;
                                     BitmapFactory.decodeFile(absolutePath, options);
                                     options.inJustDecodeBounds = false;
                                  }else {
                                     options = null;
                                  }
                                  try{
                                     uBitmap = BitmapUtil.x(absolutePath, Utils$Size.width, Utils$Size.height, false, z.g(options), true);
                                     if (options == null) {
                                        i14 = 0;
                                        uClipEditIma.insertOriginSize(absolutePath, i14, i14, i11);
                                     }else {
                                        uClipEditIma.insertOriginSize(absolutePath, options.outWidth, options.outHeight, i11);
                                     }
                                     uClipEditIma.mSingleLongSide = Utils$Size.width;
                                  label_034e :
                                     if (uBitmap != null) {
                                        uBitmap = x0.a(uBitmap, true);
                                     }
                                  }catch(java.lang.OutOfMemoryError e0){
                                  }
                               }else if(PostExperimentUtils.s0()){
                                  options1 = new BitmapFactory$Options();
                                  options1.inJustDecodeBounds = true;
                                  BitmapFactory.decodeFile(pair.getFirst().getAbsolutePath(), options1);
                                  options1.inJustDecodeBounds = false;
                               }else {
                                  options1 = null;
                               }
                               if (obj) {
                                  int width = GSConfig.i();
                                  uBitmap2 = BitmapUtil.x(pair.getFirst().getAbsolutePath(), width, width, false, z.g(options1), true);
                                  PostUtils.a(pair.getFirst().getAbsolutePath(), "ImageEncodeUtils");
                               }else {
                                  try{
                                     uBitmap2 = BitmapUtil.z(pair.getFirst().getAbsolutePath(), z.g(options1), true);
                                     PostUtils.a(pair.getFirst().getAbsolutePath(), "ImageEncodeUtils");
                                  }catch(java.lang.OutOfMemoryError e0){
                                     uBitmap = null;
                                  }
                               }
                               uBitmap = uBitmap2;
                               if (options1 == null) {
                                  uClipEditIma.insertOriginSize(obj3.getFile(), 0, 0, 0);
                               }else {
                                  uClipEditIma.insertOriginSize(obj3.getFile(), options1.outWidth, options1.outHeight, 0);
                               }
                               uClipEditIma.mSingleLongSide = GSConfig.i();
                               goto label_034e ;
                            }catch(java.lang.OutOfMemoryError e0){
                            }catch(java.lang.OutOfMemoryError e0){
                               uBitmap = uBitmap2;
                            }catch(java.lang.OutOfMemoryError e0){
                            }
                            PictureMemoryUtils.i(e0, BitmapUtil.E(obj3.getFile()));
                         }
                      }
                      i3 = i3 + 1;
                      oobject1 = p1;
                      str4 = str7;
                      str3 = str;
                      ox0 = obj;
                      patchProxyRe = patchProxyRe2;
                      str1 = str8;
                      oobject = i6;
                      i6 = i7;
                      list = list2;
                      i5 = i8;
                      og = og1;
                      list1 = list3;
                      int i10 = i9;
                   }
                }else {
                   og1 = og;
                   String str11 = str2;
                   str = str3;
                   if (!b) {
                      objArray4 = new Object[0];
                      a.D().w("ImageEncodeUtils", "exportImage release not in PostSession manager", objArray4);
                      og1.e();
                   }else {
                      objArray4 = new Object[0];
                      a.D().w("ImageEncodeUtils", "exportImage close manager ref", objArray4);
                      obj2.close();
                   }
                   if (str11 != null) {
                      i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f103dd6));
                      break ;
                   }
                   break ;
                }
             }
             uClipEditIma.mImageEditStrategy = a.x();
             uClipEditIma.mCostTime = System.currentTimeMillis() - l;
             ClipEditLogger.reportImageExportLog(p0.V0(), uClipEditIma);
             obj1 = new PostLogger().c("ImageEncodeUtils");
             obj1.k(p0.V0());
             obj1.h(PostSubTaskEvent.ENCODE_RENDER_IMAGE).j(PostLogger$Status.FINISH).f(str).d();
             return true;
          }else {
             throw x0.c(0, "exportImage outputFiles is empty");
          }
       }else {
          RuntimeException runtimeExcep = new RuntimeException("workspace is null");
          PostLogger postLogger1 = new PostLogger().b("ImageEncodeUtils");
          postLogger1.k(p0.V0());
          postLogger1.h(eNCODE_RENDE).j(PostLogger$Status.ERROR).f(str2).g("processAtlasInfo workspace is null").l(runtimeExcep).d();
          throw runtimeExcep;
       }
    }
    public static EncodeException c(int p0,String p1){
       x0 ox0 = x0.class;
       if (PatchProxy.isSupport(ox0)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, ox0, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Object[] objArray = new Object[0];
       a.D().A("ImageEncodeUtils", p1, objArray);
       return new EncodeException(p0, p1);
    }
    public static Pair d(){
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, objArray, x0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "ImageEncodeUtils";
       a.D().w(str, "getBitmapFilterRendererManager", objArray1);
       if (!i.h()) {
          objArray1 = new Object[i];
          a.D().w(str, "getBitmapFilterRendererManager post session not available new", objArray1);
          obj = new g();
       }else {
          objArray = i.m().p().g();
          if (objArray == null) {
             objArray1 = new Object[i];
             a.D().w(str, "getBitmapFilterRendererManager post session available but manager released", objArray1);
             obj = new g();
          }else {
             Object[] objArray2 = new Object[i];
             a.D().w(str, "getBitmapFilterRendererManager post session available and manager not released", objArray2);
             obj = objArray.j();
             i = true;
          }
       }
       return new Pair(Boolean.valueOf(i), new Pair(objArray, obj));
    }
    public static void e(String p0,Provider p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, x0.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().A("ImageEncodeUtils", p0, objArray);
       if (!p1.get().booleanValue()) {
          ExceptionHandler.handleCaughtException(x0.c(-1, p0));
       }
       return;
    }
    public static void f(a p0,Bitmap p1,boolean p2,Provider p3){
       if (PatchProxy.isSupport(x0.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, null, x0.class, "3")) {
          return;
       }
       if (p0.j(p1)) {
          return;
       }
       if (p2) {
          x0.e("newFilterProcessor process fail maybe by native oom", p3);
          return;
       }else {
          Object[] objArray = new Object[0];
          a.D().w("ImageEncodeUtils", "first renderBitmap fail, retry after gc", objArray);
          i.d().i("newFilterProcessor process fail maybe by native oom", LowMemoryLevel.LEVEL5);
          x0.f(p0, p1, true, p3);
          return;
       }
    }
}
