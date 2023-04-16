package com.yxcorp.gifshow.edit.previewer.loaderv2.c0;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lba.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import maa.a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import taa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Preview;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.kuaishou.edit.draft.Asset;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import rba.c;
import sba.h;
import android.util.Pair;
import java.io.File;
import java.lang.StringBuilder;
import com.kuaishou.edit.draft.OriginalVoice;
import wba.n0;
import pba.h;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qkd.b;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.k$e;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedFile;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedStream;
import java.lang.Integer;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$b;
import wba.d;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.edit.previewer.loaderv2.b0;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.yxcorp.gifshow.edit.previewer.loaderv2.VideoAssetLoaderException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.edit.previewer.loaderv2.PreviewLoaderException;

public class c0 extends a	// class@001b36
{
    public a h;
    public a i;

    public void c0(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c0.class, "1")) {
          return;
       }
       this.i = this.a.g1();
       this.h = this.a.o0();
       return;
    }
    public void d(){
       int i2;
       ArrayList uArrayList1;
       Workspace$Source source1;
       int i3;
       int i5;
       double d;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, c0.class, "2")) {
          return;
       }
       Workspace$Type type = obj.a.a1();
       Workspace$Source source = obj.a.T0();
       if (type != Workspace$Type.VIDEO && (type != Workspace$Type.KTV_MV && (type != Workspace$Type.LONG_VIDEO && (type != Workspace$Type.ALBUM_MOVIE || DraftUtils.Z(obj.a))))) {
          obj.a("load exit");
          return;
       }else if(source == Workspace$Source.PICTURE_RECREATION || source == Workspace$Source.MERCHANT_COMMENT_RECREATION){
          obj.a("workspace source is picture recreation or merchant comment recreation, load exit");
          return;
       }else {
          List list = obj.h.z();
          if (list.isEmpty()) {
             throw new PreviewLoaderException("No video assets.");
          }
          EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[list.size()];
          obj.b.setTrackAssets(trackAssetAr);
          obj.a("load trackAssetIndexInProject:0");
          GeneratedMessageLite generatedMes = obj.a.P0().v();
          ArrayList uArrayList = Lists.b();
          boolean i = 0;
          int i1 = 0;
          while (i1 < list.size()) {
             List obj1 = list.get(i1);
             BizCache effectiveFil = BizCache.EffectiveFile;
             File uFile = obj.d.c(effectiveFil).g(new Pair(obj1.getFile(), obj.h));
             obj.a("load trackAssetIndexInDraft:"+i1+"internal file:"+obj1.getFile()+",file:"+uFile+",type:"+type+",source:"+source);
             File uFile1 = uFile;
             Workspace$Type type1 = type;
             File uFile2 = uFile;
             BizCache uBizCache = effectiveFil;
             EditorSdk2V2$TrackAsset trackAsset = n0.c(obj1, uFile1, obj.i.v(), source, type, generatedMes, 0);
             if (trackAsset == null) {
                uArrayList.add(new h(i1, obj1.getFile(), uFile2));
                i1.c(new RuntimeException("VideoAssetLoader load error trackAsset is null"));
                if (obj.f == null) {
                   i2 = i1;
                   uArrayList1 = uArrayList;
                   obj1 = list;
                   source1 = source;
                   uFile = null;
                label_0245 :
                   i1 = i2 + 1;
                   source = source1;
                   uArrayList = uArrayList1;
                   list = obj1;
                   type = type1;
                }else {
                   trackAsset = new EditorSdk2V2$TrackAsset();
                }
             }
             if (!TextUtils.x(obj1.getAudioPath())) {
                File uFile3 = obj.d.c(uBizCache).g(new Pair(obj1.getAudioPath(), obj.h));
                if (b.S(uFile3)) {
                   trackAsset.setAssetAudioPath(uFile3.getAbsolutePath());
                }
             }
             if (b.g(obj.a.d1()) != null) {
                i3 = trackAsset.probedAssetFile().streams(trackAsset.probedAssetFile().videoStreamIndex()).rotation();
                obj.a("hasVoteStickerMagicEmoji, videoStream rotation = "+i3);
                int i4 = i3 % 180;
                if (i4) {
                   i3 = - i3;
                   trackAsset.setRotationDeg(i3);
                }
             }
             obj.b.trackAssetsSetItem(i, trackAsset);
             a uoa = obj.a.o0();
             if (PatchProxy.isSupport(c0.class)) {
                i5 = i;
                i2 = i1;
                uFile = null;
                uArrayList1 = uArrayList;
                obj1 = list;
                source1 = source;
                if (!PatchProxy.applyVoidThreeRefs(uoa, Integer.valueOf(i1), uFile2, this, c0.class, "4")) {
                label_01b6 :
                   if (uoa != null) {
                      uBizCache = null;
                      if (!uoa.y(i2).getDuration() - uBizCache || uoa.y(i2).getSelectedRange() == TimeRange.getDefaultInstance()) {
                         obj.a("fillAssetParam index:"+i2+",assetFile:"+uFile2);
                         i = uoa.D();
                         if (!i) {
                            uoa.c0();
                         }
                         Asset$b uob = uoa.n(i2);
                         if (!uob.getDuration() - uBizCache) {
                            float f = (float)d.f(uFile2.getAbsolutePath()) / 1000.00f;
                            d = (double)f;
                            uob.i(d);
                         }else {
                            d = uob.getDuration();
                         }
                         if (!uob.instance.hasSelectedRange()) {
                            TimeRange$b uob1 = TimeRange.newBuilder();
                            uob1.b(uBizCache);
                            uob1.a(d);
                            uob.s(uob1.build());
                         }
                         if (!i) {
                            uoa.g(uFile);
                         }
                      }
                   }
                }
             }else {
                i5 = i;
                i2 = i1;
                uArrayList1 = uArrayList;
                obj1 = list;
                source1 = source;
                uFile = null;
                goto label_01b6 ;
             }
             i = i5 + 1;
             goto label_0245 ;
          }
          uArrayList1 = uArrayList;
          if (!EditorSdk2UtilsV2.clearTemplateClipIfNeed(obj.b)) {
             obj.a("clear templateClip fail!");
          }
          EditorSdk2UtilsV2.loadProject(obj.b);
          if (obj.f == null && (!PatchProxy.applyVoidOneRefs(uArrayList1, obj, c0.class, "3") && !q.f(uArrayList1))) {
             obj.a("removeIllegalAssetIfNeeded illegalAssetDataList:"+uArrayList1);
             obj.h.c0();
             Collections.sort(uArrayList1, b0.b);
             Iterator iterator = uArrayList1.iterator();
             while (iterator.hasNext()) {
                obj.h.V(iterator.next().a);
             }
             obj.h.g(false);
             ArrayList uArrayList2 = new ArrayList(q.a(obj.b.trackAssets().toNormalArray()));
             for (i3 = 0; i3 < uArrayList1.size(); i3 = i3 + 1) {
                i1 = uArrayList2.size() - 1;
                uArrayList2.remove(i1);
             }
             EditorSdk2V2$TrackAsset[] trackAssetAr1 = new EditorSdk2V2$TrackAsset[false];
             obj.b.setTrackAssets(uArrayList2.toArray(trackAssetAr1));
             ExceptionHandler.handleCaughtException(new VideoAssetLoaderException("some asset files are invalid, need to delete, illegalAssetIndexList.size = "+uArrayList1.size(), uArrayList1));
          }
       label_0306 :
          return;
       }
    }
    public int g(){
       return 1;
    }
}
