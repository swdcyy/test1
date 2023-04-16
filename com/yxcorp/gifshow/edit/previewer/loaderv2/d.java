package com.yxcorp.gifshow.edit.previewer.loaderv2.d;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Workspace$Source;
import taa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Preview;
import fba.a;
import haa.a;
import com.kuaishou.edit.draft.AICutTheme;
import com.kuaishou.edit.draft.AICutTheme$DpiType;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.Boolean;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import haa.f;
import q87.c;
import com.yxcorp.gifshow.edit.previewer.loaderv2.cache.BizCache;
import rba.b;
import rba.c;
import sba.h;
import android.util.Pair;
import java.io.File;
import maa.a;
import java.util.List;
import yaa.c;
import com.kuaishou.edit.draft.Music;
import wba.u;
import com.kuaishou.edit.draft.TimeRange;
import uba.e;
import java.lang.Double;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kuaishou.edit.draft.Asset;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import trd.t;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.lang.Number;
import com.kuaishou.edit.draft.Asset$Type;
import kotlin.Pair;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.TimeRange$b;
import java.lang.IllegalArgumentException;
import com.kwai.video.clipkit.mv.ClipAICut$TemplateAssetInfo;
import com.kuaishou.edit.draft.AEEffect;
import com.kwai.video.clipkit.mv.ClipAICut$TemplateAssetTextInfo;
import qkd.b;
import com.yxcorp.gifshow.edit.previewer.loaderv2.d$b;
import com.yxcorp.gifshow.edit.previewer.loaderv2.d$a;
import com.kuaishou.edit.draft.Asset$PositionType;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaiShanAssetTag;
import java.lang.Long;
import com.kwai.video.clipkit.mv.EditorSdk2MvCreationResult;
import sba.a;
import sba.a$a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.edit.previewer.loaderv2.PreviewLoaderException;
import java.lang.Throwable;
import w46.b;
import com.kwai.video.clipkit.mv.ClipMvUtils;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import wba.n0;
import lba.a;
import com.kuaishou.edit.draft.OriginalVoice;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import wba.d;
import com.kwai.video.minecraft.model.MutableTimeline;
import com.kwai.video.minecraft.model.nano.Minecraft$KSAVClip;
import com.kwai.video.minecraft.model.nano.Minecraft$LegacyAE2Effect;
import java.lang.Integer;

public class d extends a	// class@001b3c
{
    public a h;
    public String i;
    public KwaiMvParam j;
    public EditorSdk2MvCreationResult k;

    public void d(){
       super();
    }
    public static Size h(c p0){
       Preview obj = PatchProxy.applyOneRefs(p0, null, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.T0() == Workspace$Source.ANNUAL_ALBUM_2022 || p0.T0() == Workspace$Source.ANNUAL_ALBUM_2022_LOCAL) {
          obj = p0.P0().v();
          if (obj != null && (obj.getWidth() && obj.getHeight())) {
             return new Size(obj.getWidth(), obj.getHeight());
          }else {
             AICutTheme uAICutTheme = a.a(p0).v();
             if (uAICutTheme != null && uAICutTheme.getDpi() == AICutTheme$DpiType.D_720) {
                return new Size(720, 1280);
             }
          }
       }
       return new Size(1080, 1920);
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "2")) {
          return;
       }
       this.h = this.a.n0();
       return;
    }
    public void d(){
       a a;
       File obj;
       boolean b;
       Object[] objArray1;
       String str1;
       String str2;
       long l;
       boolean b1;
       ArrayList uArrayList;
       String str5;
       String str6;
       long l1;
       String str7;
       String str8;
       PatchProxyResult patchProxyRe1;
       d uod1;
       String str9;
       EditorSdk2MvCreationResult uEditorSdk2M1;
       a uoa1;
       PatchProxyResult patchProxyRe2;
       String str10;
       String str11;
       Size size;
       Object[] objArray2;
       List list;
       Iterator iterator3;
       int this;
       int i1;
       d$b uob;
       int i2;
       Object[] objArray4;
       double d;
       List list2;
       String str13;
       String str14;
       String str15;
       long l2;
       PatchProxyResult patchProxyRe3;
       d uod2;
       int i3;
       Music obj2;
       List list3;
       ClipAICut$TemplateAssetInfo this1;
       Size size2;
       Iterator iterator5;
       double duration;
       List list4;
       double d3;
       int i7;
       double d4;
       double duration2;
       Pair pair;
       int i9;
       String str17;
       ArrayList obj3;
       Object obj4;
       EditorSdk2MvCreationResult uEditorSdk2M = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uEditorSdk2M, uod, "4")) {
          return;
       }
       uEditorSdk2M.k = objArray;
       uEditorSdk2M.j = objArray;
       uEditorSdk2M.i = objArray;
       int i = 0;
       if (uEditorSdk2M.a.a1() != Workspace$Type.AI_CUT && !DraftUtils.Z(uEditorSdk2M.a)) {
          a = uEditorSdk2M.a;
          obj = PatchProxy.applyOneRefs(a, objArray, DraftUtils.class, "13");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(DraftUtils.l(a) && DraftUtils.U(a)){
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             return;
          }
       }
    label_004e :
       FeatureId uFeatureId = null;
       AICutTheme uAICutTheme = uEditorSdk2M.h.v();
       String str = "AICutStyleLoader";
       if (uAICutTheme != null) {
          String external = uAICutTheme.getFeatureId().getExternal();
          if (TextUtils.x(external)) {
             objArray1 = new Object[i];
             f.D().A(str, "load: no style", objArray1);
          }
          obj = uEditorSdk2M.d.c(BizCache.EffectiveFile).g(new Pair(uAICutTheme.getDirectory(), uEditorSdk2M.h));
          String absolutePath = (obj != null)? obj.getAbsolutePath(): objArray;
          str1 = external;
          str2 = absolutePath;
          l = uAICutTheme.getSeed();
       }else {
          l = uFeatureId;
          str2 = objArray;
          objArray4 = str2;
       }
       a uoa = uEditorSdk2M.a.o0();
       if (uoa != null) {
          b = DraftUtils.E(uEditorSdk2M.a.n0());
          a a1 = uEditorSdk2M.a;
          ArrayList obj1 = PatchProxy.applyOneRefs(a1, uEditorSdk2M, uod, "8");
          String str3 = "No video assets.";
          String str4 = "constructTemplateAssetInfo invoked";
          if (obj1 != patchProxyRe) {
             b1 = b;
             uArrayList = obj1;
             str5 = str3;
             str6 = str2;
             l1 = l;
             str7 = str;
             str8 = str1;
             patchProxyRe1 = patchProxyRe;
             uod1 = uod;
             str9 = str4;
          }else {
             objArray = new Object[i];
             f.D().w(str, str4, objArray);
             a uoa3 = a.c(a1);
             List list1 = uoa3.z();
             if (!list1.isEmpty()) {
                boolean b2 = uoa3.D();
                if (!b2) {
                   uoa3.c0();
                }
                a1 = uEditorSdk2M.a;
                if (PatchProxy.applyVoidTwoRefs(a1, uoa3, uEditorSdk2M, uod, "9")) {
                   b1 = b;
                   list2 = list1;
                   str13 = str4;
                   str14 = str3;
                   str15 = str2;
                   l2 = l;
                   patchProxyRe3 = patchProxyRe;
                   uod2 = uod;
                   str9 = str;
                   str8 = str1;
                }else {
                   b1 = b;
                   Object[] objArray5 = new Object[i];
                   f.D().w(str, "calculateClippedRangeForAsset invoked", objArray5);
                   list = uoa3.z();
                   obj2 = u.a(a1.J0());
                   TimeRange timeRange = u.i(a1.J0());
                   e uoe = (obj2 != null && (obj2.getTransPointsCount() > 0 && timeRange != null))? 1: null;
                   if (!DraftUtils.i0(a1) || !uoe) {
                      list2 = list1;
                      str13 = str4;
                      str14 = str3;
                      str15 = str2;
                      l2 = l;
                      patchProxyRe3 = patchProxyRe;
                      uod2 = uod;
                      str8 = str1;
                      objArray1 = new Object[0];
                      str9 = str;
                      f.D().w(str9, "calculateClippedRangeForAsset: no need to apply music rhythm", objArray1);
                      for (i1 = 0; i1 < list.size(); i1 = i1 + 1) {
                         Asset uAsset2 = list.get(i1);
                         duration = (uAsset2.getSelectedRange().getDuration() > 0)? uAsset2.getSelectedRange().getDuration(): 2.00f;
                         TimeRange$b uob2 = TimeRange.newBuilder(uAsset2.getSelectedRange());
                         uob2.a(duration);
                         uoa3.n(i1).s(uob2.build());
                      }
                   }else {
                      str13 = str4;
                      str14 = str3;
                      Object[] objArray6 = new Object[0];
                      f.D().w(str, "calculateClippedRangeForAsset: apply music rhythm", objArray6);
                      List transPointsL = obj2.getTransPointsList();
                      duration = timeRange.getStart();
                      double duration1 = timeRange.getDuration();
                      uoe = e.class;
                      if (PatchProxy.isSupport(uoe)) {
                         str15 = str2;
                         list4 = PatchProxy.applyFourRefs(list, transPointsL, Double.valueOf(duration), Double.valueOf(duration1), null, e.class, "2");
                         if (list4 != patchProxyRe) {
                            l2 = l;
                            uod2 = uod;
                            str6 = str;
                            str8 = str1;
                         label_0237 :
                            list2 = list1;
                            patchProxyRe3 = patchProxyRe;
                         }
                      }else {
                         str15 = str2;
                      }
                      a.p(list, "assetList");
                      a.p(transPointsL, "transPointList");
                      l2 = l;
                      str8 = str1;
                      objArray4 = new Object[0];
                      str10 = "generateSyncedTrackAssets";
                      f.D().s(str10, "generateSyncedClipRangeForAssets: assetList="+list.size()+", "+"transPointList="+transPointsL.size()+", clipStart="+duration+", clipDuration="+duration1, objArray4);
                      if (!list.isEmpty() && !transPointsL.isEmpty()) {
                         str6 = str;
                         int i5 = 0;
                         double d2 = (double)i5;
                         if (duration1 - d2 > 0) {
                            uod2 = uod;
                            if (list.size() == 1) {
                               TimeRange selectedRang = list.get(i5).getSelectedRange();
                               a.o(selectedRang, "assetList[0].selectedRange");
                               d = selectedRang.getStart();
                               selectedRang = list.get(i5).getSelectedRange();
                               a.o(selectedRang, "assetList[0].selectedRange");
                               list4 = t.k(EditorSdk2Utils.createTimeRange(d, selectedRang.getDuration()));
                               goto label_0237 ;
                            }else {
                               String str16 = "asset.selectedRange";
                               if (PatchProxy.isSupport(uoe)) {
                                  list4 = PatchProxy.applyThreeRefs(list, Double.valueOf(duration1), transPointsL, null, e.class, "4");
                                  if (list4 != patchProxyRe) {
                                  }
                               }
                               Iterator iterator6 = list.iterator();
                               double d6 = 0;
                               while (iterator6.hasNext()) {
                                  TimeRange selectedRang2 = iterator6.next().getSelectedRange();
                                  a.o(selectedRang2, str16);
                                  d6 = d6 + selectedRang2.getDuration();
                               }
                               list4 = CollectionsKt___CollectionsKt.J5(transPointsL);
                               i3 = 0;
                               while (d6 - duration1 > 0) {
                                  i3 = i3 + 1;
                                  patchProxyRe3 = patchProxyRe;
                                  list2 = list1;
                                  obj3 = new ArrayList(u.Y(transPointsL, 10));
                                  iterator3 = transPointsL.iterator();
                                  while (iterator3.hasNext()) {
                                     double d7 = (double)i3 * duration1;
                                     double d8 = iterator3.next().doubleValue() + d7;
                                     obj3.add(Double.valueOf(d8));
                                     transPointsL = transPointsL;
                                     iterator3 = iterator3;
                                  }
                                  list4.addAll(obj3);
                                  d6 = d6 - duration1;
                                  list1 = list2;
                                  patchProxyRe = patchProxyRe3;
                               }
                               list2 = list1;
                               patchProxyRe3 = patchProxyRe;
                               Object[] objArray7 = new Object[0];
                               f.D().s(str10, "generateSyncedClipRangeForAssets: finalTransPoints:"+list4, objArray7);
                               ArrayList uArrayList4 = new ArrayList();
                               i2 = list4.size();
                               for (int i6 = 0; i6 < i2; i6 = i6 + 1) {
                                  if (!i6) {
                                     d3 = list4.get(i6).doubleValue() - duration;
                                  }else {
                                     i7 = i6 - 1;
                                     d3 = list4.get(i6).doubleValue() - list4.get(i7).doubleValue();
                                  }
                                  uArrayList4.add(Double.valueOf(d3));
                               }
                               list4 = new ArrayList();
                               i2 = list.size();
                               d3 = 0;
                               int i8 = 0;
                               this = 0;
                               while (i8 < i2) {
                                  Asset uAsset3 = list.get(i8);
                                  TimeRange selectedRang1 = uAsset3.getSelectedRange();
                                  a.o(selectedRang1, str16);
                                  double start = selectedRang1.getStart();
                                  selectedRang1 = uAsset3.getSelectedRange();
                                  a.o(selectedRang1, str16);
                                  if (selectedRang1.getDuration() - d2 > 0) {
                                     selectedRang1 = uAsset3.getSelectedRange();
                                     a.o(selectedRang1, str16);
                                     d4 = selectedRang1.getDuration();
                                  }else {
                                     d4 = 2.00f;
                                  }
                                  double d5 = uArrayList4.get(this).doubleValue() - d3;
                                  if (d5 - d4 > 0) {
                                     if (uAsset3.getType() == Asset$Type.VIDEO) {
                                        duration2 = uAsset3.getDuration();
                                        if (d5 - duration2 > 0) {
                                           d3 = d3 + duration2;
                                           duration1 = d3;
                                           d6 = d2;
                                           d3 = 0;
                                        label_0449 :
                                           d2 = duration2;
                                        label_044b :
                                           list4.add(EditorSdk2Utils.createTimeRange(d3, d2));
                                           i8 = i8 + 1;
                                           d3 = duration1;
                                           d2 = d6;
                                        }else {
                                           pair = e.a(start, d4, duration2, d5);
                                           d3 = pair.getFirst().doubleValue();
                                           this = this + 1;
                                           duration2 = pair.getSecond().doubleValue();
                                           d6 = d2;
                                        }
                                     }else {
                                        duration1 = (double)4;
                                        if (d5 - duration1 > 0) {
                                           d3 = d3 + duration1;
                                           d5 = duration1;
                                        }else {
                                           this = this + 1;
                                           i9 = 0;
                                        }
                                        duration1 = d3;
                                        d6 = d2;
                                        d3 = 0;
                                        d2 = d5;
                                        goto label_044b ;
                                     }
                                  }else {
                                     while (true) {
                                        i9 = uArrayList4.size() - 1;
                                        str17 = "beatIntervalDurations[nextBeatIntervalIndex]";
                                        if (this < i9) {
                                           this = this + 1;
                                           v9 = d5 - d4;
                                           if (i9 < 0) {
                                              obj3 = uArrayList4.get(this);
                                              a.o(obj3, str17);
                                              d5 = d5 + obj3.doubleValue();
                                           }else if(!i9){
                                           label_042f :
                                              d6 = d2;
                                           label_0431 :
                                              obj4 = null;
                                              break ;
                                           }else {
                                              Asset$Type vIDEO = Asset$Type.VIDEO;
                                              if (uAsset3.getType() == vIDEO) {
                                                 duration2 = uAsset3.getDuration();
                                                 d6 = d2;
                                              }else {
                                                 d6 = d2;
                                                 duration2 = (double)4;
                                              }
                                              if (d5 - duration2 > 0) {
                                                 this = this - 1;
                                                 obj4 = 1;
                                                 break ;
                                              }else if(uAsset3.getType() == vIDEO){
                                                 pair = e.a(start, d4, duration2, d5);
                                                 start = pair.getFirst().doubleValue();
                                                 d5 = pair.getSecond().doubleValue();
                                                 goto label_0431 ;
                                              }else {
                                                 start = 0;
                                                 goto label_0431 ;
                                              }
                                           }
                                        }else {
                                           goto label_042f ;
                                        }
                                     }
                                     if (obj4) {
                                        obj4 = uArrayList4.get(this);
                                        a.o(obj4, str17);
                                        d5 = d5 - obj4.doubleValue();
                                     }
                                     d3 = start;
                                     duration2 = d5;
                                  }
                                  i7 = 0;
                                  goto label_0449 ;
                               }
                               for (i1 = 0; i1 < list.size(); i1 = i1 + 1) {
                                  EditorSdk2$TimeRange timeRange1 = list4.get(i1);
                                  TimeRange$b uob3 = TimeRange.newBuilder();
                                  uob3.b(timeRange1.start());
                                  uob3.a(timeRange1.duration());
                                  uoa3.n(i1).s(uob3.build());
                               }
                               str9 = str6;
                            }
                         }
                      }
                      throw new IllegalArgumentException("generateSyncedClipRangeForAssets get wrong args, "+"assetList:"+list+", pointList:"+transPointsL+", duration:"+duration1);
                   }
                }
                Size size1 = d.h(uEditorSdk2M.a);
                ArrayList uArrayList2 = new ArrayList();
                i3 = 0;
                while (i3 < list2.size()) {
                   list1 = list2;
                   obj2 = list1.get(i3);
                   ArrayList uArrayList3 = new ArrayList();
                   if (obj2.getSubAssetCount() > 0) {
                      int i4 = 0;
                      while (i4 < obj2.getSubAssetCount()) {
                         Asset subAsset = obj2.getSubAsset(i4);
                         GeneratedMessageLite$Builder uBuilder = subAsset.toBuilder();
                         list3 = list1;
                         str5 = str14;
                         str6 = str15;
                         l1 = l2;
                         str7 = str9;
                         str9 = str13;
                         this1 = this.i(uoa3, size1, i3, subAsset, uBuilder);
                         Asset$b uob1 = uoa3.n(i3);
                         uob1.copyOnWrite();
                         uob1.instance.setSubAsset(i4, uBuilder);
                         if (this1 != null) {
                            uArrayList3.add(this1);
                         }
                         i4 = i4 + 1;
                         str13 = str9;
                         list1 = list3;
                         str9 = str7;
                         str15 = str6;
                         l2 = l1;
                         str14 = str5;
                      }
                      list3 = list1;
                      l1 = l2;
                      str5 = str14;
                      str6 = str15;
                      str7 = str9;
                      str9 = str13;
                   }else {
                      list3 = list1;
                      l1 = l2;
                      str5 = str14;
                      str6 = str15;
                      str7 = str9;
                      str9 = str13;
                      this1 = this.i(uoa3, size1, i3, obj2, uoa3.n(i3));
                      if (this1 != null) {
                         uArrayList3.add(this1);
                      }
                   }
                   if (uArrayList3.isEmpty()) {
                      size2 = size1;
                      uod1 = uod2;
                      patchProxyRe1 = patchProxyRe3;
                   }else {
                      uod1 = uod2;
                      obj1 = PatchProxy.applyTwoRefs(uoa3, obj2, uEditorSdk2M, uod1, "11");
                      str4 = "";
                      patchProxyRe1 = patchProxyRe3;
                      if (obj1 != patchProxyRe1) {
                      }else {
                         obj1 = new ArrayList();
                         Iterator iterator4 = obj2.getAe2EffectsList().iterator();
                         while (iterator4.hasNext()) {
                            AEEffect uAEEffect = iterator4.next();
                            ClipAICut$TemplateAssetTextInfo templateAsse1 = new ClipAICut$TemplateAssetTextInfo();
                            size2 = size1;
                            templateAsse1.textMarker = uAEEffect.getTemplateId();
                            if (uAEEffect.getTextPicturePathCount() > 0) {
                               iterator5 = iterator4;
                               File uFile = uEditorSdk2M.d.c(BizCache.EffectiveFile).g(new Pair(uAEEffect.getTextPicturePath(0), uoa3));
                               templateAsse1.customImagePath = str4;
                               if (b.S(uFile)) {
                                  templateAsse1.customImagePath = uFile.getAbsolutePath();
                               }
                            }else {
                               iterator5 = iterator4;
                            }
                            obj1.add(templateAsse1);
                            uEditorSdk2M = this;
                            size1 = size2;
                            iterator4 = iterator5;
                         }
                      }
                      size2 = size1;
                      uob = new d$b(null);
                      uob.b.addAll(uArrayList3);
                      uob.c.addAll(new ArrayList(obj1));
                      i1 = (obj2.getType() == Asset$Type.VIDEO)? true: false;
                      uob.a = i1;
                      uob.d = str4;
                      if (obj2.getPositionType() == Asset$PositionType.OPENING) {
                         uob.d = KuaiShanAssetTag.OPENING.getAssetTag();
                      }else if(obj2.getPositionType() == Asset$PositionType.ENDING){
                         uob.d = KuaiShanAssetTag.ENDING.getAssetTag();
                      }
                      uArrayList2.add(uob);
                   }
                   i3 = i3 + 1;
                   uEditorSdk2M = this;
                   str13 = str9;
                   uod2 = uod1;
                   patchProxyRe3 = patchProxyRe1;
                   list2 = list3;
                   size1 = size2;
                   str9 = str7;
                   str15 = str6;
                   l2 = l1;
                   str14 = str5;
                }
                l1 = l2;
                uod1 = uod2;
                patchProxyRe1 = patchProxyRe3;
                str5 = str14;
                str6 = str15;
                str7 = str9;
                str9 = str13;
                if (!b2) {
                   uoa3.g(false);
                }
                uArrayList = uArrayList2;
             }else {
                throw new PreviewLoaderException(str3);
             }
          }
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             uArrayList1.add(iterator.next().a(0));
          }
          if (PatchProxy.isSupport(uod1)) {
             uEditorSdk2M1 = PatchProxy.applyFourRefs(str6, str8, uArrayList1, Long.valueOf(l1), this, d.class, "12");
             if (uEditorSdk2M1 != patchProxyRe1) {
                uoa1 = this;
                patchProxyRe2 = patchProxyRe1;
                str10 = str7;
                str11 = str8;
             label_0738 :
                if (uEditorSdk2M1.hasError() || uEditorSdk2M1.getProject() == null) {
                   f.D().e(str10, "constructAICutCreationResult has error", new PreviewLoaderException("constructAICutCreationResult error with error code = "+uEditorSdk2M1.getErrorCode()+", reason = "+uEditorSdk2M1.getErrorReason()));
                   size = d.h(uoa1.a);
                   obj1 = new ArrayList(uArrayList1);
                   if (obj1.isEmpty()) {
                      Iterator iterator1 = uArrayList.iterator();
                      while (iterator1.hasNext()) {
                         obj1.add(iterator1.next().a(0));
                      }
                   }
                   uEditorSdk2M1 = ClipMvUtils.createOriginalProjectResult(size.b, size.c, obj1);
                   b1 = false;
                }
                uoa1.i = str11;
                uoa1.k = uEditorSdk2M1;
                uoa1.j = uEditorSdk2M1.getMVParam();
                EditorSdk2V2$VideoEditorProject project = uoa1.k.getProject();
                if (!b1) {
                   if (PatchProxy.applyVoidOneRefs(project, uoa1, uod1, "5") || (project != null && uoa1.a.o0() != null)) {
                      a = uoa1.a.o0();
                      for (a1 = null; a1 < project.trackAssets().size() && a1 < a.p(); i1 = a1 + 1) {
                         EditorSdk2V2$TrackAsset trackAsset1 = project.trackAssets(a1);
                         Asset uAsset1 = a.y(a1);
                         trackAsset1.setCropOptions(null);
                         n0.g(trackAsset1, uAsset1);
                         if (uoa1.a.a1() == Workspace$Type.ALBUM_MOVIE && uAsset1.getType() == Asset$Type.PICTURE) {
                            trackAsset1.setImproveHighResolutionUpscaleQuality(true);
                         }else {
                            Boolean uBoolean = 1;
                         }
                         Preview preview = (uoa1.a.P0() == null)? null: uoa1.a.P0().v();
                         n0.f(preview, uoa1.a.T0(), uoa1.a.a1(), trackAsset1);
                         OriginalVoice originalVoic = (uoa1.a.g1() == null)? null: uoa1.a.g1().v();
                         n0.j(trackAsset1, originalVoic, uoa1.a.a1());
                      }
                   }
                }else {
                   a a2 = uoa1.a;
                   if (!PatchProxy.applyVoidThreeRefs(uArrayList, project, a2, this, d.class, "7")) {
                      objArray1 = new Object[0];
                      f.D().w(str10, "configOriginalAudio invoked", objArray1);
                      if (project == null || a2 == null) {
                         objArray2 = new Object[0];
                         f.D().t(str10, "configOriginalAudio: invalid input params", objArray2);
                      }else {
                         iterator = uArrayList.iterator();
                         while (iterator.hasNext()) {
                            uob = iterator.next();
                            if (uob.a == null) {
                               continue ;
                            }else {
                               i2 = 0;
                               ClipAICut$TemplateAssetInfo assetPath = uob.a(i2).assetPath;
                               ClipAICut$TemplateAssetInfo templateAsse = PatchProxy.apply(null, uob, d$b.class, "1");
                               if (templateAsse != patchProxyRe2) {
                               }else {
                                  templateAsse = uob.b.get(i2).refId;
                               }
                               objArray4 = new Object[i2];
                               f.D().s(str10, "Set original audio asset: "+assetPath, objArray4);
                               str7 = str10;
                               d = uob.a(i2).clippedRange.start();
                               iterator3 = iterator;
                               double d1 = uob.a(i2).clippedRange.duration();
                               try{
                                  ClipMvUtils.AddTemplateAudioAssetToProject(project, templateAsse, assetPath, EditorSdk2UtilsV2.createTimeRange(d, d1));
                                  iterator = iterator3;
                                  str10 = str7;
                               }catch(java.lang.Exception e0){
                                  str10 = str7;
                                  f.D().e(str10, "configOriginalAudioAsset AddTemplateAudioAssetToProject fail "+e0, e0);
                                  iterator = iterator3;
                                  goto label_0882 ;
                               }
                            }
                         }
                         OriginalVoice originalVoic1 = (a2.g1() == null)? null: a2.g1().v();
                         if (originalVoic1 != null) {
                            n0.i(project, originalVoic1);
                         }
                      }
                   }
                }
                if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidThreeRefs(uoa, project, Boolean.valueOf(b1), this, d.class, "6")) {
                   objArray2 = new Object[0];
                   f.D().w(str10, "configRotationByUser invoked", objArray2);
                   list = uoa.z();
                   if (!list.isEmpty()) {
                      Iterator iterator2 = list.iterator();
                      while (iterator2.hasNext()) {
                         Asset uAsset = iterator2.next();
                         String str12 = d.d(uAsset);
                         if (b1) {
                            Object[] objArray3 = new Object[0];
                            f.D().w(str10, "configCropOptionsByUser: set rotate = "+uAsset.getRotate()+" for asset: "+str12, objArray3);
                            iterator3 = ClipMvUtils.getArrayForAllMatchedAVClips(project.getTemplateTimeline(), str12).iterator();
                            while (iterator3.hasNext()) {
                               iterator3.next().setRotationDeg(uAsset.getRotate());
                            }
                         }else {
                            ImmutableArray immutableArr = project.trackAssets();
                            this = 0;
                            while (this < immutableArr.size()) {
                               EditorSdk2V2$TrackAsset trackAsset = immutableArr.get(this);
                               if (TextUtils.n(str12, trackAsset.getMainClip().aeRefId())) {
                                  trackAsset.setRotationDeg(uAsset.getRotate());
                               }
                               this++;
                            }
                         }
                      }
                   }else {
                      throw new PreviewLoaderException(str5);
                   }
                }
                uoa1.b = project.clone();
                uoa1.a("load: styleId="+str11+",stylePath="+str6+",seed="+l1);
                return;
             }
          }
          objArray1 = new Object[0];
          str10 = str7;
          f.D().w(str10, str9, objArray1);
          uoa1 = this;
          size = d.h(uoa1.a);
          patchProxyRe2 = patchProxyRe1;
          str11 = str8;
          a$a uoa2 = new a$a(str6, str11, size.b, size.c, uArrayList1, l1);
          uEditorSdk2M1 = uoa1.d.c(BizCache.AICutMvCreationResult).e(objArray1);
          goto label_0738 ;
       }else {
          throw new PreviewLoaderException("Asset draft is null");
       }
    }
    public void f(EditorSdk2V2$VideoEditorProject p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "3")) {
          return;
       }
       if (p1.a1() != Workspace$Type.AI_CUT && !DraftUtils.Z(p1)) {
          return;
       }
       p0.setOverlappedAE2Effects(null);
       return;
    }
    public int g(){
       return 1;
    }
    public final ClipAICut$TemplateAssetInfo i(a p0,Size p1,int p2,Asset p3,Asset$b p4){
       Size b;
       d uod = d.class;
       int i = 0;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uod, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       File uFile = this.d.c(BizCache.EffectiveFile).g(new Pair(p3.getFile(), p0));
       if (!b.S(uFile)) {
          Object[] objArray1 = new Object[i];
          f.D().t("AICutStyleLoader", "Invalid asset file in index: "+p2, objArray1);
          return null;
       }else {
          ClipAICut$TemplateAssetInfo templateAsse = new ClipAICut$TemplateAssetInfo();
          templateAsse.refId = d.d(p3);
          templateAsse.assetPath = uFile.getAbsolutePath();
          templateAsse.clippedRange = EditorSdk2Utils.createTimeRange(p3.getSelectedRange().getStart(), p3.getSelectedRange().getDuration());
          Size size = d.i(templateAsse.assetPath, p4);
          if (!(p3.getRotate() % 180)) {
             b = size.b;
             if (b <= null) {
                b = p1.b;
             }
             templateAsse.assetWidth = b;
             size = size.c;
             if (size <= null) {
                size = p1.c;
             }
             templateAsse.assetHeight = size;
          }else {
             b = size.b;
             if (b <= null) {
                b = p1.b;
             }
             templateAsse.assetHeight = b;
             size = size.c;
             if (size <= null) {
                size = p1.c;
             }
             templateAsse.assetWidth = size;
          }
          return templateAsse;
       }
    }
}
