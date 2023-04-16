package com.yxcorp.gifshow.edit.previewer.loaderv2.r;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import maa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import vaa.a;
import fba.a;
import yaa.c;
import com.kuaishou.edit.draft.Workspace$Type;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.util.List;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.PreviewLoaderException;
import com.kuaishou.edit.draft.Asset;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import rba.c;
import sba.h;
import android.util.Pair;
import java.io.File;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.kwai.video.minecraft.model.nano.Minecraft$RationalV2;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import com.kwai.video.minecraft.model.nano.Minecraft$TransitionParam;
import com.kuaishou.edit.draft.AssetTransition;
import com.kuaishou.edit.draft.TimeRange;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import wba.n0;
import pba.f;
import java.lang.Runnable;
import ekd.k1;
import taa.a;
import com.kuaishou.edit.draft.Preview;
import com.kuaishou.edit.draft.Music;
import wba.u;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import java.util.ArrayList;
import com.kwai.robust.PatchProxyResult;
import uba.e;
import java.lang.Double;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.lang.Number;
import java.text.DecimalFormat;
import java.math.RoundingMode;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import com.kwai.video.minecraft.model.MutableClip;
import java.lang.IllegalArgumentException;

public class r extends a	// class@001b4a
{
    public Toast h;
    public a i;
    public a j;
    public a k;
    public c l;

    public void r(){
       super();
       this.h = null;
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "1")) {
          return;
       }
       this.i = this.a.o0();
       this.j = this.a.F0();
       this.k = this.a.n0();
       this.l = this.a.J0();
       return;
    }
    public void d(){
       EditorSdk2V2$TrackAsset trackAsset;
       Object[] objArray2;
       b0 a;
       float f;
       ArrayList uArrayList;
       List list1;
       int i6;
       double d;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, r.class, "2")) {
          return;
       }
       Workspace$Type type = obj.a.a1();
       Workspace$Type pHOTO_MOVIE = Workspace$Type.PHOTO_MOVIE;
       if (type != pHOTO_MOVIE && type != Workspace$Type.SINGLE_PICTURE) {
          return;
       }
       if (obj.j.v() != null || DraftUtils.U(obj.a)) {
          return;
       }
       List list = obj.i.z();
       if (list.isEmpty()) {
          throw new PreviewLoaderException("No photo assets.");
       }
       EditorSdk2V2$TrackAsset[] trackAssetAr = new EditorSdk2V2$TrackAsset[list.size()];
       obj.b.setTrackAssets(trackAssetAr);
       String str = "PhotoAssetLoaderV2";
       r or = null;
       if (type != pHOTO_MOVIE || EditorSdk2UtilsV2.clearTemplateClipIfNeed(obj.b)) {
          Object[] objArray1 = objArray;
          int i = 0;
          while (true) {
             TimeRange timeRange = null;
             int i1 = 2;
             int i2 = 1;
             if (i < list.size()) {
                Asset uAsset = list.get(i);
                File uFile = obj.d.c(BizCache.EffectiveFile).g(new Pair(uAsset.getFile(), obj.i));
                String str1 = ", workspace ";
                if (uFile != null) {
                   if (objArray1 == null) {
                      b0 uob0 = BitmapUtil.E(uFile.getAbsolutePath());
                      if (uob0.a > null && uob0.b > null) {
                         objArray1 = uob0;
                      }
                   }
                   Minecraft$InputFileOptions inputFileOpt = new Minecraft$InputFileOptions();
                   Minecraft$RationalV2 rationalV2 = EditorSdk2Utils.createRationalV2(i2, i1);
                   try{
                      inputFileOpt.setFrameRate(rationalV2);
                      trackAsset = EditorSdk2UtilsV2.openTrackAsset(uFile.getAbsolutePath(), objArray, inputFileOpt);
                      if (uAsset.hasTransition()) {
                         trackAsset.setTransitionParam(new Minecraft$TransitionParam());
                         trackAsset.transitionParam().setType(uAsset.getTransition().getSdkType());
                         trackAsset.transitionParam().setDuration(uAsset.getTransition().getDuration());
                      }
                      if (uAsset.hasSelectedRange()) {
                         trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(uAsset.getSelectedRange().getStart(), uAsset.getSelectedRange().getDuration()));
                      }else {
                         trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(timeRange, 2.00f));
                      }
                      n0.a(trackAsset);
                      obj.b.trackAssetsSetItem(i, trackAsset);
                      i = i + 1;
                      or = null;
                   }catch(java.io.IOException e0){
                      objArray2 = new Object[0];
                      f.D().A(str, "OpenTrackAsset Failed: "+trackAsset+", path "+trackAsset.getAbsolutePath()+str1+e0.a.D0(), objArray2);
                      k1.o(new f(e0));
                      return;
                   }
                }else {
                   objArray2 = new Object[0];
                   f.D().A(str, "Asset file not found: "+uAsset.getFile()+str1+obj.a.D0(), objArray2);
                   throw new PreviewLoaderException("Asset file not found.");
                }
             }else if(type == Workspace$Type.SINGLE_PICTURE){
                if (objArray1 != null) {
                   b0 b = objArray1.b;
                   a = objArray1.a;
                   f = 2.78f;
                   if (((float)b / (float)a) - f > 0) {
                      obj.b.setProjectOutputHeight((int)((float)a * f));
                   }else {
                      obj.b.setProjectOutputHeight(b);
                   }
                   obj.b.setProjectOutputWidth(objArray1.a);
                   obj.b.trackAssets(0).setPositioningMethod(i1);
                }else {
                   throw new PreviewLoaderException("Could not get dimension of any photo asset.");
                }
             }else if(DraftUtils.l(obj.a) && DraftUtils.T(obj.a)){
                i6 = 0;
                obj.b.setProjectOutputWidth(i6);
                obj.b.setProjectOutputHeight(i6);
             }else if(obj.a.P0() != null && obj.a.P0().v() != null){
                Preview preview = obj.a.P0().v();
                if (preview.getWidth() > 0 && preview.getHeight() > 0) {
                   obj.b.setProjectOutputWidth(preview.getWidth());
                   obj.b.setProjectOutputHeight(preview.getHeight());
                   i = 0;
                   Object[] objArray5 = new Object[i];
                   f.D().w(str, "load mProject.projectOutputWidth\(\):"+obj.b.projectOutputWidth()+",mProject.projectOutputHeight\(\):"+obj.b.projectOutputHeight(), objArray5);
                label_026a :
                   if (!DraftUtils.T(obj.a)) {
                      obj.b.setIsKwaiPhotoMovie(i);
                      break ;
                   }else {
                      Music music = u.a(obj.l);
                      TimeRange timeRange1 = u.i(obj.l);
                      if (music != null && (music.getTransPointsCount() > 0 && timeRange1 != null)) {
                         obj.b.setIsKwaiPhotoMovie(i);
                         ArrayList arrayList = obj.b.trackAssets().getArrayList();
                         List transPointsL = music.getTransPointsList();
                         double start = timeRange1.getStart();
                         double duration = timeRange1.getDuration();
                         PatchProxyResult patchProxyRe = PatchProxyResult.class;
                         e uoe = e.class;
                         if (PatchProxy.isSupport(uoe)) {
                            uArrayList = PatchProxy.applyFourRefs(arrayList, transPointsL, Double.valueOf(start), Double.valueOf(duration), null, e.class, "1");
                            if (uArrayList != patchProxyRe) {
                            }
                         }
                         a.p(arrayList, "trackAssetList");
                         a.p(transPointsL, "transPointList");
                         int i3 = 0;
                         Object[] objArray3 = new Object[i3];
                         f.D().s("generateSyncedTrackAssets", "generateSyncedTrackAssets: trackAssetList="+arrayList.size()+", "+"transPointList="+transPointsL.size()+", clipStart="+start+", clipDuration="+duration, objArray3);
                         if (arrayList.size() > i2 && (!transPointsL.isEmpty() && duration - (double)i3 > 0)) {
                            int i4 = arrayList.size();
                            if (PatchProxy.isSupport(uoe)) {
                               list1 = PatchProxy.applyThreeRefs(Integer.valueOf(i4), Double.valueOf(duration), transPointsL, null, e.class, "5");
                               if (list1 != patchProxyRe) {
                               }
                            }
                            list1 = CollectionsKt___CollectionsKt.J5(transPointsL);
                            i6 = 0;
                            while (i4 > list1.size()) {
                               i6 = i6 + i2;
                               uArrayList = new ArrayList(u.Y(transPointsL, 10));
                               Iterator iterator = transPointsL.iterator();
                               while (iterator.hasNext()) {
                                  d = (double)i6 * duration;
                                  double d1 = iterator.next().doubleValue() + d;
                                  uArrayList.add(Double.valueOf(d1));
                                  iterator = iterator;
                                  d = 1;
                               }
                               list1.addAll(uArrayList);
                               i2 = 1;
                            }
                            objArray1 = new Object[0];
                            f.D().s("generateSyncedTrackAssets", "generateSyncedTrackAssets: finalTransPoints: "+list1, objArray1);
                            int i5 = list1.size();
                            uArrayList = new ArrayList();
                            for (i6 = 0; i6 < i5; i6 = i6 + 1) {
                               int i7 = i6 % arrayList.size();
                               EditorSdk2V2$TrackAsset trackAsset1 = arrayList.get(i7).clone();
                               if (!i6) {
                                  d = list1.get(i6).doubleValue() - start;
                               }else {
                                  i4 = i6 - 1;
                                  d = list1.get(i6).doubleValue() - list1.get(i4).doubleValue();
                               }
                               DecimalFormat uDecimalForm = new DecimalFormat("0.###");
                               uDecimalForm.setRoundingMode(RoundingMode.FLOOR);
                               String str2 = uDecimalForm.format(d);
                               a.o(str2, "format.format\(duration\)");
                               d = Double.parseDouble(str2);
                               trackAsset1.setClippedRange(EditorSdk2UtilsV2.createTimeRange(0, d));
                               StringBuilder str3 = "i="+i6+", duration="+d;
                               Object[] objArray4 = new Object[0];
                               f.D().s("generateSyncedTrackAssets", str3+", index="+i7, objArray4);
                               a.o(trackAsset1, "newTrackAsset");
                               trackAsset1.getMainClip().setClipId(String.valueOf(EditorSdk2Utils.getRandomID()));
                               uArrayList.add(trackAsset1);
                            }
                            EditorSdk2V2$TrackAsset[] trackAssetAr1 = new EditorSdk2V2$TrackAsset[uArrayList.size()];
                            obj.b.setTrackAssets(uArrayList.toArray(trackAssetAr1));
                         }else {
                            throw new IllegalArgumentException("generateSyncedTrackAssets get wrong args, "+"assetList:"+arrayList+", pointList:"+transPointsL+", duration:"+duration);
                         }
                      }else {
                         obj.b.setIsKwaiPhotoMovie(true);
                         break ;
                      }
                   }
                   break ;
                }
             }
             i = false;
             goto label_026a ;
          }
          return;
       }else {
          objArray2 = new Object[or];
          f.D().A(str, "clear videoEditorProject templateClip fail, workspace "+obj.a.D0(), objArray2);
          throw new PreviewLoaderException("Clear videoEditorProject templateClip fail.");
       }
    }
    public int g(){
       return 1;
    }
}
