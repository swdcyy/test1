package com.yxcorp.gifshow.v3.previewer.ktv.p;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import ekd.j;
import java.util.Collections;
import java.util.ArrayList;
import wba.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.android.model.music.Music;
import android.graphics.Bitmap;
import java.lang.Integer;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import qkd.b;
import android.graphics.BitmapFactory$Options;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import mwc.n;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import lnc.a1;
import android.graphics.Rect;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import juc.b;
import faa.a;
import w46.b;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.util.resource.Category;
import com.yxcorp.gifshow.edit.previewer.utils.KtvEditUtils;
import com.yxcorp.gifshow.v3.editor.i;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.Math;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import java.lang.Double;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import qaa.a;
import com.yxcorp.gifshow.plugin.impl.record.KtvInfo;
import laa.m0;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.Asset$Type;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.v3.previewer.ktv.p$b;
import uxb.i;
import uxb.l;
import java.io.FileOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import mwc.p;
import wba.d;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedFile;
import haa.f;
import q87.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.model.Lyrics;
import com.yxcorp.gifshow.model.Lyrics$Line;

public class p	// class@0015cd
{

    public void p(){
       super();
    }
    public static List a(EditorSdk2V2$VideoEditorProject p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, p.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = p0.animatedSubAssets().toNormalArray();
       if (j.h(uAnimatedSub)) {
          return Collections.emptyList();
       }
       obj = new ArrayList(uAnimatedSub.length);
       int len = uAnimatedSub.length;
       int i = 0;
       while (i < len) {
          object oobject = uAnimatedSub[i];
          if (b.s(oobject.opaque())) {
             obj.add(oobject);
          }
          i = i + 1;
       }
       return obj;
    }
    public static Bitmap b(c p0,int p1,int p2,Music p3){
       String obj;
       Bitmap uBitmap;
       Music music = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p op = p.class;
       if (PatchProxy.isSupport(op)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, p.class, "23");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (!music || (music.mArtist == null || (music.mName == null || (p0.o0() != null && p0.o0().p() >= 1)))) {
          int i = 0;
          String albumId = p0.o0().y(i).getAlbumId();
          if (TextUtils.isEmpty(albumId) || !b.S(new File(albumId))) {
             obj = "generateKtvDefaultCover file is invalid: path:"+albumId;
             Object[] objArray = new Object[i];
             a.D().t("KtvEditUtils", obj, objArray);
             i1.c(new IllegalStateException(obj));
          }else if(PatchProxy.isSupport(op)){
             uBitmap = PatchProxy.applyFourRefs(albumId, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, p.class, "24");
             if (uBitmap != patchProxyRe) {
             label_0125 :
                return uBitmap;
             }
          }
          BitmapFactory$Options options = new BitmapFactory$Options();
          options.inMutable = true;
          uBitmap = BitmapFactory.decodeFile(albumId, options);
          Canvas uCanvas = new Canvas(uBitmap);
          uCanvas.drawBitmap(uBitmap, 0, 0, null);
          Rect rect = v4;
          Rect rect1 = new Rect(a1.e(16.00f), a1.e(16.00f), a1.e(16.00f), a1.e(16.00f));
          TextStyleAttrs textStyleAtt = rect1;
          TextStyleAttrs textStyleAtt1 = new TextStyleAttrs();
          TextStyleValue textStyleVal = textStyleAtt1;
          TextStyleValue textStyleVal1 = new TextStyleValue();
          TextDrawConfigParam textDrawConf = new TextDrawConfigParam(-1, a1.e(0x41f00000), 0, a1.e(240.00f), 0, a1.e(140.00f), 0, rect, 4, 40, "", 0, 0, a1.a(0x7f0619c5), "", "Cover "+music.mArtist, "", "", false, 0, -1, 0, 0, -1, textStyleAtt, textStyleVal);
          n on = new n(v3);
          on.a(music.mName);
          on.g(uCanvas, true);
          on.j(uCanvas, true);
          goto label_0125 ;
       }
    label_014a :
       return null;
    }
    public static String c(){
       Object obj = PatchProxy.apply(null, null, p.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Category dENOISE_MODE = Category.DENOISE_MODEL;
       return dENOISE_MODE.getResourceDir()+dENOISE_MODE.getResourceName();
    }
    public static File d(){
       Object obj = PatchProxy.apply(null, null, p.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KtvEditUtils.b();
    }
    public static EditorSdk2V2$AudioAsset e(i p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, p.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       EditorSdk2V2$VideoEditorProject videoEditorP = p0.e();
       obj1 = PatchProxy.applyOneRefs(videoEditorP, obj, KtvEditUtils.class, "6");
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else if(videoEditorP == null){
          EditorSdk2V2$AudioAsset[] uAudioAssetA = videoEditorP.audioAssets().toNormalArray();
          int len = uAudioAssetA.length;
          int i = 0;
          while (i < len) {
             object oobject = uAudioAssetA[i];
             if (!oobject.assetId() - 1011) {
                obj = oobject;
                break ;
             }
             i = i + 1;
          }
       }
       return obj;
    }
    public static EditorSdk2V2$TrackAsset[] f(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       EditorSdk2V2$VideoEditorProject videoEditorP = p0.e();
       if (videoEditorP == null) {
          return null;
       }
       EditorSdk2V2$TrackAsset[] trackAssetAr = videoEditorP.trackAssets().toNormalArray();
       if (trackAssetAr == null || trackAssetAr.length < 1) {
          return null;
       }
       return trackAssetAr;
    }
    public static void g(int p0,int p1,EditorSdk2V2$AudioAsset p2){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, p.class, "7")) {
          return;
       }
       EditorSdk2$TimeRange timeRange = null;
       if (p0 >= 0) {
          p.p(p2, (double)Math.abs(p0), (double)p1);
          p2.setDisplayRange(timeRange);
       }else {
          p2.setClippedRange(timeRange);
          double d = (double)Math.abs(p0);
          double d1 = (double)p1;
          if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidThreeRefs(p2, Double.valueOf(d), Double.valueOf(d1), null, p.class, "12")) {
             d = d / 0x408f400000000000;
             d1 = d1 / 0x408f400000000000;
             if (p2.displayRange() != null) {
                p2.displayRange().setStart(d);
                p2.displayRange().setDuration(d1);
             }else {
                p2.setDisplayRange(EditorSdk2Utils.createTimeRange(d, d1));
             }
          }
       }
       return;
    }
    public static boolean h(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0 != null && (p0.p() > 0 && (p0.y(i).getAlbumId() != null && (p0.y(i).getAlbumId()).startsWith(p.d().getAbsolutePath())))) {
          i = true;
       }
    label_0042 :
       return i;
    }
    public static boolean i(Workspace$Type p0){
       boolean b = (p0 == Workspace$Type.KTV_MV || p0 == Workspace$Type.KTV_SONG)? true: false;
       return b;
    }
    public static boolean j(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0 != null && (p0.p() > 0 && (p0.y(i).getAlbumId() != null && !(p0.y(i).getAlbumId()).startsWith(p.d().getAbsolutePath())))) {
          i = true;
       }
    label_0042 :
       return i;
    }
    public static boolean k(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0.o0() == null || (p0.s0() != null && (p.h(p0.o0()) && p0.s0().E()))) {
          b = true;
       }
    label_0037 :
       return b;
    }
    public static boolean l(KtvInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && (p0.getKaraokeType() == 1 && !p0.hasRecordPath())) {
          return true;
       }
       return false;
    }
    public static void m(c p0,Bitmap p1,boolean p2){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, p.class, "20")) {
          return;
       }
       int i = 0;
       String albumId = p0.o0().y(i).getAlbumId();
       String file = p0.o0().y(i).getFile();
       if (p1 == null || (albumId != null && file != null)) {
          p0.o0().c0();
          String str = "/";
          str = (file.startsWith(str))? p0.f0()+file: p0.f0()+str+file;
          p.n(p1, str);
          Asset$b uob = p0.o0().k();
          uob.k(file);
          uob.d(albumId);
          uob.w(Asset$Type.PICTURE);
          p0.o0().f();
          if (p2) {
             p0.s0().c0();
             while (!p0.s0().E()) {
                p0.s0().Y();
             }
             p0.s0().f();
          }else {
             f.L(p0.s0(), p1);
          }
          ArrayList uArrayList = new ArrayList();
          QMedia qMedia = new QMedia(0, albumId, 0, 0, 0);
          uArrayList.add(p0.s0().E());
          RxBus.f.b(new p$b(uArrayList));
          l.e().kq();
       }
    label_00e7 :
       return;
    }
    public static void n(Bitmap p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, p.class, "25")) {
          return;
       }
       File uFile = new File(p1);
       if (uFile.exists()) {
          uFile.delete();
       }
       try{
          FileOutputStream uFileOutputS = new FileOutputStream(uFile);
          p0.compress(Bitmap$CompressFormat.JPEG, 100, uFileOutputS);
          uFileOutputS.flush();
          uFileOutputS.close();
       }catch(java.io.FileNotFoundException e3){
          e3.printStackTrace();
       }catch(java.io.IOException e3){
          e3.printStackTrace();
       }
       return;
    }
    public static void o(c p0,Activity p1,KtvInfo p2,boolean p3){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, p.class, "21")) {
          return;
       }
       try{
          Bitmap uBitmap = p.b(p0, n.k(p1), n.j(p1), p2.getMusicInfo());
          if (uBitmap != null) {
             p.m(p0, uBitmap, p3);
          }
          l.e().kq();
       }catch(java.lang.Exception e8){
          PostUtils.D("KtvEditUtils", "replaceKtvSongDefaultCover", e8);
       }
       return;
    }
    public static void p(EditorSdk2V2$AudioAsset p0,double p1,double p2){
       if (PatchProxy.isSupport(p.class) && PatchProxy.applyVoidThreeRefs(p0, Double.valueOf(p1), Double.valueOf(p2), null, p.class, "11")) {
          return;
       }
       p0.setClippedRange(EditorSdk2UtilsV2.createTimeRange((p1 / 0x408f400000000000), (p2 / 0x408f400000000000)));
       return;
    }
    public static void q(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, p.class, "4")) {
          return;
       }
       try{
          p0.j().sendChangeToPlayer(false);
       }catch(java.lang.Exception e3){
          PostUtils.D("ktv_log", "updateProject", e3);
       }
       return;
    }
    public static void r(EditorSdk2V2$VideoEditorProject p0,KtvInfo p1){
       object oobject;
       object oobject1;
       int i7;
       double d1;
       double d3;
       int len;
       double d8;
       ImmutableArray immutableArr;
       ArrayList uArrayList;
       Iterator iterator;
       EditorSdk2V2$TrackAsset trackAsset;
       TimeRange$b uob;
       EditorSdk2$ProbedFile probedFile;
       List list1;
       Object obj5;
       object obj = p0;
       object obj1 = p1;
       p op = p.class;
       Object obj2 = null;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, obj2, op, "6")) {
          return;
       }
       try{
          EditorSdk2V2$AudioAsset[] uAudioAssetA = p0.audioAssets().toNormalArray();
          if (obj1 != null && (p1.getKaraokeType() == 1 || p1.hasRecordPath())) {
             p op1 = (p1.hasRecordPath())? 2: 1;
             if (uAudioAssetA != null && uAudioAssetA.length >= op1) {
                op1 = p.a();
                int i = op1.c();
                int i1 = op1.d();
                int i2 = 0;
                if (!p1.hasRecordPath()) {
                   oobject = uAudioAssetA[i2];
                   oobject1 = obj2;
                }else {
                   oobject1 = uAudioAssetA[i2];
                   oobject = uAudioAssetA[1];
                }
                double d = 0x408f400000000000;
                int i3 = (int)(EditorSdk2UtilsV2.getComputedDuration(p0) * d);
                int i4 = i1 - i;
                int i5 = p.a().g();
                int i6 = obj1.mSingStart + i;
                if (p1.getKaraokeType() != 1) {
                   i7 = i;
                   d1 = (double)i4;
                   p.p(oobject1, (double)i, d1);
                   p.p(oobject, (double)(i6 - i5), d1);
                }else {
                   i7 = i;
                   if (!p1.hasRecordPath()) {
                      len = (obj1.mSingStart - i5) + i7;
                      if (i4 > 0) {
                         p.g(len, i4, oobject);
                      }else {
                         p.g(len, i3, oobject);
                      }
                   }else if(i4 > 0){
                      p.g((i5 + i7), i4, oobject1);
                   }else {
                      p.g((i5 + i7), i3, oobject1);
                   }
                }
                if (PatchProxy.isSupport(op)) {
                   i = i4;
                   if (!PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(i7), Integer.valueOf(i1), null, p.class, "8")) {
                   label_00ca :
                      EditorSdk2V2$TrackAsset[] trackAssetAr = p0.trackAssets().toNormalArray();
                      if (trackAssetAr != null && trackAssetAr.length >= 1) {
                         double d4 = (double)i7 / d;
                         double d5 = (double)i1 / d;
                         if (p1.getKaraokeType() == 2) {
                            if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), trackAssetAr, null, op, "9")) {
                               oobject = trackAssetAr[i2];
                               double d6 = (double)i;
                               if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidThreeRefs(oobject, Double.valueOf(0), Double.valueOf(d6), null, p.class, "13")) {
                                  oobject.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, (d6 / d)));
                               }
                            }
                         }else if(p1.getKaraokeType() == 3){
                            d5 = d5 - d4;
                            if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidTwoRefs(Double.valueOf(d5), trackAssetAr, null, op, "10")) {
                               len = trackAssetAr.length;
                               d4 = 0;
                               i3 = 0;
                               while (i3 < len) {
                                  object oobject2 = trackAssetAr[i3];
                                  if (d4 - d5 >= 0) {
                                     oobject2.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, 0));
                                  }else {
                                     double d7 = d5 - 4.00f;
                                     if (d4 - d7 < 0) {
                                        d7 = 2.00f;
                                        oobject2.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, d7));
                                        d4 = d4 + d7;
                                     }else {
                                        d4 = d5 - d4;
                                        oobject2.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, d4));
                                        d4 = d5;
                                     }
                                  }
                                  i3 = i3 + 1;
                                  EditorSdk2V2$TimeRangeV2 timeRangeV2 = null;
                               }
                            }
                         }else if(PatchProxy.isSupport(d.class)){
                            d8 = d5;
                            d1 = d4;
                            if (!PatchProxy.applyVoidThreeRefs(Double.valueOf(d4), Double.valueOf(d5), p0, 0, d.class, "19")) {
                            }
                         }else {
                            d8 = d5;
                            d1 = d4;
                         }
                      }
                   }
                }else {
                   i = i4;
                   goto label_00ca ;
                }
                if (p1.getKaraokeType() != 1 && !PatchProxy.applyVoidTwoRefs(obj, obj1, null, op, "15")) {
                   KtvInfo mClipLyric = obj1.mClipLyric;
                   if (mClipLyric == null) {
                      Object[] objArray = new Object[0];
                      a.D().A("KtvEditUtils", "info.mClipLyric is null", objArray);
                   }else {
                      Lyrics mLines = mClipLyric.mLines;
                      if (mLines != null && !mLines.isEmpty()) {
                         List list = p.a(p0);
                         if (list.size() >= mLines.size()) {
                            Object obj3 = null;
                            Object[] obj4 = PatchProxy.applyOneRefs(obj, obj3, KtvEditUtils.class, "5");
                            if (obj4 != PatchProxyResult.class) {
                               obj = obj4;
                            }else {
                               EditorSdk2V2$AudioAsset[] uAudioAssetA1 = p0.audioAssets().toNormalArray();
                               if (uAudioAssetA1 != null && uAudioAssetA1.length >= 1) {
                                  i6 = uAudioAssetA1.length;
                                  int i8 = 0;
                                  while (true) {
                                     if (i8 < i6) {
                                        obj1 = uAudioAssetA1[i8];
                                        if (!obj1.assetId() - 1012) {
                                           obj = obj1;
                                           break ;
                                        }else {
                                           i8 = i8 + 1;
                                        }
                                     }
                                  }
                               }
                               obj = obj3;
                            }
                            double d2 = obj.clippedRange().start();
                            i2 = 0;
                            while (i2 < mLines.size()) {
                               Lyrics$Line line = mLines.get(i2);
                               EditorSdk2V2$AnimatedSubAsset uAnimatedSub = list.get(i2);
                               if (!uAnimatedSub.dataId() - (long)i2) {
                                  float f = 1000.00f;
                                  float f1 = (float)line.mStart / f;
                                  d1 = (double)f1 - d2;
                                  if (d1 < 0) {
                                     float f2 = (float)line.mDuration / f;
                                     d3 = (double)f2 + d1;
                                     uAnimatedSub.displayRange().setDuration(d3);
                                     uAnimatedSub.displayRange().setStart(0);
                                  }else {
                                     uAnimatedSub.displayRange().setStart(d1);
                                     f = (float)line.mDuration / 1000.00f;
                                     uAnimatedSub.displayRange().setDuration((double)f);
                                  }
                                  float f3 = (float)line.mStart / 1000.00f;
                                  d3 = (double)f3 - d2;
                                  uAnimatedSub.displayRange().setStart(Math.max(d3, 0));
                                  uAnimatedSub.displayRange().setDuration(Math.max(uAnimatedSub.displayRange().duration(), 0));
                               }
                               i2 = i2 + 1;
                            }
                         }
                      }
                   }
                }
             }
          }
       }catch(java.lang.Exception e0){
          PostUtils.D("KtvEditUtils", "refreshLyricsOffset", e0);
       }
    label_0344 :
       return;
    }
}
