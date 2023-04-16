package com.yxcorp.gifshow.edit.previewer.loaderv2.k;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import raa.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import raa.e;
import haa.a;
import maa.a;
import com.kwai.robust.PatchProxyResult;
import wba.d0;
import java.util.ArrayList;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import android.util.Pair;
import java.lang.Boolean;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.FaceMagicEffect;
import com.kuaishou.edit.draft.HighlightTimeEffect;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.FaceMagicEffect$b;
import com.kuaishou.edit.draft.TimeRange;
import wba.d;
import com.yxcorp.gifshow.edit.previewer.loaderv2.j;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import rba.c;
import sba.h;
import java.io.File;
import com.kuaishou.edit.draft.FaceMagicEffect$Type;
import com.kuaishou.edit.draft.FaceMagicEffect$Extra;
import ekd.k1;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import haa.e;
import tkd.b;
import tkd.d;
import t5b.a;
import s3b.a;
import ixc.c;
import brd.t;
import brd.a0;
import com.yxcorp.gifshow.edit.previewer.loaderv2.i;
import erd.g;
import com.yxcorp.gifshow.edit.previewer.loaderv2.MagicEffectLoaderException;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import java.lang.Double;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import wba.c0;
import z1.i;
import s16.a;
import com.kwai.video.editorsdk2.RenderPosDetail;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import java.util.Objects;
import mca.a;

public class k extends a	// class@001b43
{
    public c h;
    public e i;
    public a j;

    public void k(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "1")) {
          return;
       }
       this.h = this.a.z0();
       this.i = a.l(this.a);
       this.j = a.c(this.a);
       return;
    }
    public void d(){
       double d;
       PatchProxyResult patchProxyRe1;
       Iterator iterator1;
       ArrayList uArrayList2;
       double duration;
       int trackAssetIn;
       Pair pair2;
       String obj1;
       int i;
       int i1;
       Object[] objArray2;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, ok, "2")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = PatchProxy.apply(objArray, obj, ok, "3");
       String str = null;
       if (uArrayList1 != patchProxyRe) {
       }else {
          uArrayList1 = new ArrayList();
          for (int i3 = 0; i3 < obj.h.p(); i3 = i3 + 1) {
             uArrayList1.add(new Pair(Boolean.TRUE, obj.h.y(i3)));
          }
          for (i3 = 0; i3 < obj.i.p(); i3 = i3 + 1) {
             HighlightTimeEffect highlightTim = obj.i.y(i3);
             FaceMagicEffect$b uob = highlightTim.getMagicEffct().toBuilder();
             uob.copyOnWrite();
             uob.instance.setRange(d.e(obj.j, highlightTim.getAssetIdentifier(), str));
             uArrayList1.add(new Pair(Boolean.FALSE, uob.build()));
          }
          Collections.sort(uArrayList1, j.b);
       }
       Iterator iterator = uArrayList1.iterator();
       FaceMagicEffect$Extra uExtra = null;
       while (true) {
          d = 0;
          if (iterator.hasNext()) {
             Pair pair = iterator.next();
             Pair second = pair.second;
             h oh = obj.d.c(BizCache.EffectiveFile);
             str = second.getAssetDir();
             k h = (pair.first.booleanValue())? obj.h: obj.i;
             File uFile = oh.g(new Pair(str, h));
             if (second.getType() == FaceMagicEffect$Type.MAGIC_EMOJI) {
                uExtra = second.getExtra();
                if (uExtra != null) {
                   if (!k1.g()) {
                      uFile = d.a(0x3bf0d115).KA().a(e.b(uExtra), uFile).firstOrError().p(i.b).e();
                   }
                   uExtra = 1;
                }else {
                   throw new MagicEffectLoaderException("magic emoji extra lost");
                }
             }
             if (uFile == null) {
                i1.c(new RuntimeException("FaceMagicEffectLoader load faceMagicAssetDir is null"));
             label_011d :
                patchProxyRe1 = patchProxyRe;
                iterator1 = iterator;
                uArrayList2 = uArrayList;
             }else {
                str = uFile.getPath();
                Minecraft$WesterosFaceMagicParam westerosFace = PatchProxy.applyOneRefs(str, objArray, d0.class, "17");
                if (westerosFace != patchProxyRe) {
                }else {
                   westerosFace = d0.b(d, d, str);
                }
                uArrayList.add(new Pair(second, westerosFace));
                d = second.getRange().getStart();
                duration = second.getRange().getDuration();
                a b = obj.b;
                if (PatchProxy.isSupport(d0.class) && PatchProxy.applyVoidFourRefs(Double.valueOf(d), Double.valueOf(duration), b, westerosFace, null, d0.class, "25")) {
                   goto label_011d ;
                }else {
                   trackAssetIn = EditorSdk2UtilsV2.getTrackAssetIndexByPts(b, d);
                   uArrayList2 = uArrayList;
                   double d1 = d + duration;
                   int trackAssetIn1 = EditorSdk2UtilsV2.getTrackAssetIndexByPts(b, d1);
                   patchProxyRe1 = patchProxyRe;
                   iterator1 = iterator;
                   Object[] objArray1 = new Object[0];
                   f.D().w("PostEditorSdkUtil", "removeFaceMagicParamFromAllTrackAsset startTime:"+d+",duration:"+duration+",trackAssetStartIndex:"+trackAssetIn+",trackAssetEndIndex:"+trackAssetIn1, objArray1);
                   if (trackAssetIn >= 0 && (trackAssetIn1 < 0 || trackAssetIn1 < trackAssetIn)) {
                      i1.c(new RuntimeException("removeFaceMagicParamFromAllTrackAsset error index"));
                   }else {
                      while (trackAssetIn <= trackAssetIn1) {
                         EditorSdk2V2$TrackAsset trackAsset = b.trackAssets(trackAssetIn);
                         if (trackAsset.moreWesterosFaceMagicParamsSize() > 0) {
                            trackAsset.setMoreWesterosFaceMagicParams(a.f(trackAsset.moreWesterosFaceMagicParams().toNormalArray(), new c0(westerosFace)));
                         }
                         trackAssetIn = trackAssetIn + 1;
                      }
                   }
                }
             }
             uArrayList = uArrayList2;
             patchProxyRe = patchProxyRe1;
             iterator = iterator1;
             objArray = null;
             str = null;
          }else {
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                try{
                   Pair pair1 = iterator.next();
                   Pair first = pair1.first;
                   pair2 = pair1.second;
                   duration = first.getRange().getStart();
                   double duration1 = first.getRange().getDuration();
                   a b1 = obj.b;
                   if (PatchProxy.isSupport(d0.class) && PatchProxy.applyVoidFourRefs(Double.valueOf(duration), Double.valueOf(duration1), pair2, b1, null, d0.class, "21")) {
                   label_026e :
                      obj1 = null;
                   }else {
                      i = 5;
                      trackAssetIn = 4;
                      i1 = 3;
                      int i2 = 2;
                      if (PatchProxy.isSupport(d0.class)) {
                         objArray2 = new Object[i];
                         objArray2[0] = Double.valueOf(duration);
                         objArray2[1] = Double.valueOf(duration1);
                         objArray2[i2] = pair2;
                         objArray2[i1] = b1;
                         objArray2[trackAssetIn] = Boolean.TRUE;
                         if (PatchProxy.applyVoid(objArray2, null, d0.class, "22")) {
                            goto label_026e ;
                         }
                      }
                      if (PatchProxy.isSupport(d0.class)) {
                         objArray2 = new Object[6];
                         objArray2[0] = Double.valueOf(duration);
                         objArray2[1] = Double.valueOf(duration1);
                         objArray2[i2] = pair2;
                         objArray2[i1] = b1;
                         objArray2[trackAssetIn] = Boolean.TRUE;
                         objArray2[i] = Boolean.FALSE;
                         if (PatchProxy.applyVoid(objArray2, null, d0.class, "23")) {
                            goto label_026e ;
                         }
                      }else {
                         obj1 = 1;
                      }
                      RenderPosDetail renderPosDet = EditorSdk2UtilsV2.renderPosDetailOfRenderPos(b1, duration);
                      duration = duration + duration1;
                      RenderPosDetail renderPosDet1 = EditorSdk2UtilsV2.renderPosDetailOfRenderPos(b1, duration);
                      int trackAssetIn2 = renderPosDet.getTrackAssetIndex();
                      int trackAssetIn3 = renderPosDet1.getTrackAssetIndex();
                      boolean b2 = false;
                      objArray = new Object[b2];
                      f.D().w("PostEditorSdkUtil", "fillFaceMagicParamToAlTrackAsset trackAssetStartIndex:"+trackAssetIn2+",trackAssetEndIndex:"+trackAssetIn3+",ignoreOpening:"+b2, objArray);
                      if (trackAssetIn2 >= 0 && (trackAssetIn3 < 0 || trackAssetIn3 < trackAssetIn2)) {
                         i1.c(new RuntimeException("fillFaceMagicParamToAlTrackAsset error index"));
                      }else {
                         EditorSdk2V2$TrackAsset trackAsset1 = b1.trackAssets(trackAssetIn2);
                         EditorSdk2V2$TrackAsset trackAsset2 = b1.trackAssets(trackAssetIn3);
                         double trackAssetOr = renderPosDet.getTrackAssetOriginalPtsSec();
                         if (trackAsset1.clippedRange() != null) {
                            trackAssetOr = trackAssetOr - trackAsset1.clippedRange().start();
                         }
                         if (trackAssetIn2 == trackAssetIn3) {
                            trackAsset1.setMoreWesterosFaceMagicParams(a.e(trackAsset1.moreWesterosFaceMagicParams().toNormalArray(), d0.a(trackAssetOr, duration1, pair2, true)));
                         }else {
                            trackAsset1.setMoreWesterosFaceMagicParams(a.e(trackAsset1.moreWesterosFaceMagicParams().toNormalArray(), d0.a(trackAssetOr, (EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset1) - trackAssetOr), pair2, true)));
                            trackAssetIn2 = trackAssetIn2 + 1;
                            while (trackAssetIn2 < trackAssetIn3) {
                               trackAsset1 = b1.trackAssets(trackAssetIn2);
                               trackAsset1.setMoreWesterosFaceMagicParams(a.e(trackAsset1.moreWesterosFaceMagicParams().toNormalArray(), d0.a(0, EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset1), pair2, true)));
                            }
                            duration = (trackAsset2.clippedRange() != null)? trackAsset2.clippedRange().start(): 0;
                            double d2 = renderPosDet1.getTrackAssetOriginalPtsSec() - duration;
                            trackAsset2.setMoreWesterosFaceMagicParams(a.e(trackAsset2.moreWesterosFaceMagicParams().toNormalArray(), d0.a(0, d2, pair2, 1)));
                         }
                      }
                   }
                }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                   i1.c(e0);
                }
                Objects.toString(pair2);
                String str1 = null;
             }
             if (uExtra != null) {
                a.B();
             }
          }
       }
       return;
    }
    public int g(){
       return 1;
    }
}
