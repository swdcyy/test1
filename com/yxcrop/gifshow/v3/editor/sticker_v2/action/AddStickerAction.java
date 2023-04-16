package com.yxcrop.gifshow.v3.editor.sticker_v2.action.AddStickerAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import cmd.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.edit.draft.TimeRange;
import java.lang.Boolean;
import com.kuaishou.edit.draft.TimeRange$b;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import rmd.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.util.Objects;
import itc.k3;
import com.kuaishou.edit.draft.FeatureId;
import jw8.q;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Float;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import wnd.e;
import wba.h0;
import tmd.a;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import java.lang.System;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.StickerResult$b;
import java.lang.CharSequence;
import java.util.List;
import java.util.Collection;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Sticker$Type;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import faa.a;
import q87.c;
import wba.l0;
import com.kuaishou.edit.draft.DynamicStickerParam$b;
import com.kuaishou.edit.draft.DynamicStickerParam;
import com.kwai.video.minecraft.model.nano.Minecraft$InputFileOptions;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$FrameRate;
import com.kwai.video.minecraft.model.nano.Minecraft$RationalV2;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo$Frame;
import com.kuaishou.edit.draft.Frame$b;
import com.kuaishou.edit.draft.Frame;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.io.File;
import kotlin.text.StringsKt__StringsKt;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.RelayStickerParam;
import com.kuaishou.edit.draft.RelayStickerParam$b;
import java.util.ArrayList;
import lnc.a1;
import com.kuaishou.edit.draft.VoteStickerParam;
import com.kuaishou.edit.draft.VoteStickerParam$b;

public final class AddStickerAction extends EditSdkAction	// class@000a4d
{
    public final double currentTime;
    public final double duration;
    public final boolean isCommit;
    public final StickerDetailInfo stickerDetailInfo;
    public final b stickerPreviewInfo;

    public void AddStickerAction(double p0,double p1,StickerDetailInfo p2,b p3,boolean p4){
       a.p(p2, "stickerDetailInfo");
       a.p(p3, "stickerPreviewInfo");
       super();
       this.currentTime = p0;
       this.duration = p1;
       this.stickerDetailInfo = p2;
       this.stickerPreviewInfo = p3;
       this.isCommit = p4;
    }
    public void AddStickerAction(double p0,double p1,StickerDetailInfo p2,b p3,boolean p4,int p5,u p6){
       boolean b = (p5 & 0x10)? false: p4;
       super(p0, p1, p2, p3, b);
       return;
    }
    public final int getCurrentAssetIndex(int p0){
       AddStickerAction uAddStickerA = AddStickerAction.class;
       if (PatchProxy.isSupport(uAddStickerA)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAddStickerA, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (int)((this.currentTime % ((double)p0 * 2.00f)) / 2.00f);
    }
    public final double getCurrentTime(){
       return this.currentTime;
    }
    public final double getDuration(){
       return this.duration;
    }
    public final TimeRange getPhotoMovieTimeRange(boolean p0,int p1){
       TimeRange$b obj;
       AddStickerAction uAddStickerA = AddStickerAction.class;
       if (PatchProxy.isSupport(uAddStickerA)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uAddStickerA, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       double d = 2.00f;
       int currentAsset = this.getCurrentAssetIndex(p1);
       double d1 = (p0)? 0: (double)currentAsset * d;
       if (!p0) {
          p1 = p1 - currentAsset;
       }
       obj = TimeRange.newBuilder();
       obj.b(d1);
       obj.a(((double)p1 * d));
       GeneratedMessageLite generatedMes = obj.build();
       a.o(generatedMes, "TimeRange.newBuilder\(\).s¡­uration\(duration\).build\(\)");
       return generatedMes;
    }
    public final StickerDetailInfo getStickerDetailInfo(){
       return this.stickerDetailInfo;
    }
    public final b getStickerPreviewInfo(){
       return this.stickerPreviewInfo;
    }
    public final TimeRange getTimeRange(boolean p0,boolean p1){
       TimeRange photoMovieTi;
       GeneratedMessageLite generatedMes;
       AddStickerAction uAddStickerA = AddStickerAction.class;
       if (PatchProxy.isSupport(uAddStickerA)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uAddStickerA, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uAddStickerA = this.stickerPreviewInfo;
       if (uAddStickerA.b != null) {
          photoMovieTi = this.getPhotoMovieTimeRange(p0, uAddStickerA.h);
       }else {
          double d = 0;
          if (p1) {
             TimeRange$b uob = TimeRange.newBuilder();
             uob.b(d);
             uob.a(0x3ff0000000000000);
             photoMovieTi = uob.build();
             a.o(photoMovieTi, "TimeRange.newBuilder\(\).s¡­.setDuration\(1.0\).build\(\)");
          }else {
             TimeRange$b uob1 = TimeRange.newBuilder();
             if (p0) {
                uob1.b(d);
                uob1.a(this.duration);
                generatedMes = uob1.build();
                a.o(generatedMes, "timeRangeBuilder.setStar¡­uration\(duration\).build\(\)");
             }else {
                uAddStickerA = this.currentTime;
                AddStickerAction tduration = this.duration;
                if (uAddStickerA - (tduration - 0x3fe0000000000000) > 0) {
                   uob1.b((tduration - 0x3fe0000000000000));
                   uob1.a(0x3fe0000000000000);
                   generatedMes = uob1.build();
                   a.o(generatedMes, "timeRangeBuilder.setStar¡­N_DURATION_LIMIT\).build\(\)");
                }else {
                   uob1.b(uAddStickerA);
                   uob1.a((this.duration - this.currentTime));
                   generatedMes = uob1.build();
                   a.o(generatedMes, "timeRangeBuilder.setStar¡­on - currentTime\).build\(\)");
                }
             }
             return generatedMes;
          }
       }
       return photoMovieTi;
    }
    public final boolean isCommit(){
       return this.isCommit;
    }
    public void performAction(c p0,c p1){
       c a;
       String str3;
       StickerDetailInfo mStickerType;
       FeatureId uFeatureId;
       Size size1;
       float f2;
       Object obj6;
       Object obj7;
       b e;
       Size size2;
       int i2;
       b uob;
       b uob1;
       int i3;
       float f4;
       float f5;
       boolean b2;
       Object obj = this;
       Size obj1 = p0;
       b obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, AddStickerAction.class, "1")) {
          return;
       }
       a.p(obj1, "workspaceDraft");
       a.p(obj2, "store");
       super.performAction(p0, p1);
       obj2 = obj.stickerPreviewInfo.a;
       a = c.a;
       AddStickerAction stickerDetai = obj.stickerDetailInfo;
       Objects.requireNonNull(a);
       int i = 6;
       String str = 5;
       String str1 = 3;
       String str2 = "stickerDetailInfo";
       if (PatchProxy.isSupport(uoc)) {
          str3 = PatchProxy.applyTwoRefs(stickerDetai, Boolean.valueOf(obj2), a, uoc, "11");
          if (str3 != patchProxyRe) {
          }else {
          label_0047 :
             a.p(stickerDetai, str2);
             mStickerType = stickerDetai.mStickerType;
             if (mStickerType != i && (mStickerType == str1 || mStickerType == str)) {
                str3 = "";
             }else {
                str3 = k3.t(stickerDetai, obj2);
                a.o(str3, "StickerUtils.getStickerF¡­kerDetailInfo, isPicture\)");
             }
          }
       }else {
          goto label_0047 ;
       }
       Object[] obj3 = str3;
       StickerDetailInfo mStickerId = obj.stickerDetailInfo.mStickerId;
       a.o(mStickerId, "stickerDetailInfo.mStickerId");
       mStickerType = obj.stickerDetailInfo.mStickerType;
       float f = -1.#Rf;
       AddStickerAction obj4 = null;
       i = -2;
       if (PatchProxy.isSupport(uoc)) {
          uFeatureId = PatchProxy.applyTwoRefs(mStickerId, Integer.valueOf(mStickerType), obj4, uoc, "10");
          if (uFeatureId != patchProxyRe) {
          label_0084 :
             b obj5 = uFeatureId;
             int realStickerT = obj.stickerDetailInfo.getRealStickerType((obj2 ^ 0x01));
             AddStickerAction stickerDetai1 = obj.stickerDetailInfo;
             Size size = obj.stickerPreviewInfo.c();
             float f1 = obj.stickerPreviewInfo.b();
             Objects.requireNonNull(a);
             str1 = "previewSize";
             if (PatchProxy.isSupport(uoc)) {
                size1 = size;
                AddStickerAction uAddStickerA = stickerDetai1;
                i = realStickerT;
                f2 = f1;
                obj6 = obj5;
                obj5 = -1;
                obj7 = obj3;
                size = PatchProxy.applyFourRefs(Integer.valueOf(realStickerT), stickerDetai1, size1, Float.valueOf(f1), a, c.class, "12");
                if (size != patchProxyRe) {
                }else {
                   stickerDetai = uAddStickerA;
                label_00fe :
                   a.p(stickerDetai, str2);
                   a.p(size1, str1);
                   size2 = new Size(obj5, obj5);
                   if (i != -2) {
                      if (i) {
                         if (i != 2) {
                            size = size2;
                         }else {
                            b2 = true;
                            obj1 = new Size(stickerDetai.getResourceWidth(b2), stickerDetai.getResourceHeight(b2));
                         }
                      }else {
                         b2 = false;
                         obj1 = new Size(stickerDetai.getResourceWidth(b2), stickerDetai.getResourceHeight(b2));
                      }
                   }else {
                      obj1 = c.d(null, i, f2);
                   }
                   size = obj1;
                }
             }else {
                size1 = size;
                i = realStickerT;
                f2 = f1;
                obj7 = obj3;
                obj6 = obj5;
                int i5 = -1;
                stickerDetai = stickerDetai1;
                goto label_00fe ;
             }
             obj1 = size;
             if (obj.stickerDetailInfo.isTagSticker()) {
                obj3 = 0x4e1f;
             }else if(obj.stickerDetailInfo.isInteractiveSticker()){
                obj3 = 0x4e20;
             }else {
                int i4 = e.a();
             }
             stickerDetai = obj.stickerDetailInfo;
             f = obj.stickerPreviewInfo.b();
             stickerDetai1 = obj.stickerPreviewInfo;
             e = stickerDetai1.e;
             size2 = stickerDetai1.c();
             obj4 = obj.stickerPreviewInfo;
             b i1 = obj4.i;
             obj5 = obj4.j;
             b f3 = obj4.f;
             if (PatchProxy.isSupport(uoc)) {
                i2 = obj3;
                obj3 = new Object[9];
                obj3[0] = stickerDetai;
                obj3[1] = obj1;
                obj3[2] = Float.valueOf(f);
                obj3[3] = Float.valueOf(e);
                obj3[4] = size2;
                obj3[5] = Float.valueOf(i1);
                obj3[6] = Float.valueOf(obj5);
                obj3[7] = Boolean.valueOf(obj2);
                obj3[8] = Float.valueOf(f3);
                uob = f3;
                uob1 = i1;
                h0 oh0 = PatchProxy.apply(obj3, null, uoc, "13");
                if (oh0 != patchProxyRe) {
                   i3 = i2;
                label_0257 :
                   a uoa = p0.U0();
                   if (uoa != null) {
                      a.o(uoa, "workspaceDraft.stickerDraft ?: return");
                      if (!uoa.D()) {
                         uoa.c0();
                      }
                      GeneratedMessageLite$Builder uBuilder = uoa.b();
                      a.o(uBuilder, "stickerDraft.append\(\)");
                      StickerResult$b uob2 = uBuilder.getResult().toBuilder();
                      h0 oh01 = oh0.b(StickerTextValueType.Draft);
                      a.o(uob2, "stickerResultBuilder");
                      uob2.f(oh01.g());
                      uob2.g(oh01.h());
                      uob2.s(oh01.i());
                      uob2.t(oh01.j());
                      uob2.v(oh01.c());
                      uob2.o(obj.getTimeRange(obj.stickerDetailInfo.isInteractiveSticker(), obj2));
                      Object obj8 = (obj7.length() > 0)? 1: null;
                      if (obj8) {
                         uob2.m(uoa.Q(obj7));
                      }
                      if (i3 >= 0) {
                         uob2.w(i3);
                      }
                      if (obj.stickerPreviewInfo.a().isEmpty() ^ 1) {
                         uob2.a(obj.stickerPreviewInfo.a());
                      }
                      size2 = obj1.b;
                      if (size2 > null) {
                         uob2.r((double)size2);
                      }
                      obj1 = obj1.c;
                      if (obj1 > null) {
                         uob2.q((double)obj1);
                      }
                      uBuilder.i(uob2.build());
                      uBuilder.f(obj6);
                      uBuilder.a();
                      uBuilder.c();
                      uBuilder.b();
                      if (i != -4) {
                         if (i != -3) {
                            if (i != -2) {
                               if (i != -1) {
                                  if (i) {
                                     if (i == 2) {
                                        uBuilder.j(Sticker$Type.DYNAMIC_STICKER);
                                        obj.setDynamicStickerParam(obj.stickerDetailInfo, uoa, obj2, i3);
                                     }
                                  }else {
                                     uBuilder.j(Sticker$Type.NORMAL_STICKER);
                                  }
                               }else {
                                  uBuilder.j(Sticker$Type.VOTE_STICKER);
                                  obj.setVoteStickerParam(uoa, i3, false);
                               }
                            }else {
                               uBuilder.j(Sticker$Type.TAG_STICKER);
                            }
                         }else {
                            uBuilder.j(Sticker$Type.RELAY_STICKER);
                            obj.setRelayStickerParam(uoa, i3);
                         }
                      }else {
                         uBuilder.j(Sticker$Type.VOTE_STICKER_THREE);
                         obj.setVoteStickerParam(uoa, i3, true);
                      }
                      if (obj.isCommit != null) {
                         uoa.f();
                      }
                      if (obj2 != null) {
                         h1.m();
                         h1.b();
                      }
                   }
                   return;
                }
             }else {
                uob = f3;
                uob1 = i1;
                i2 = obj3;
             }
             a.p(stickerDetai, str2);
             a.p(obj1, "stickerOriginSize");
             a.p(size2, str1);
             Size b = size2.b;
             size2 = c.d(null, stickerDetai.getRealStickerType((obj2 ^ 0x01)), f).b;
             if (PatchProxy.isSupport(uoc)) {
                b obj9 = PatchProxy.applyFourRefs(stickerDetai, Boolean.valueOf(obj2), Float.valueOf(f), Float.valueOf(e), null, c.class, "9");
                if (obj9 != patchProxyRe) {
                   f4 = obj9.floatValue();
                label_021b :
                   Size b1 = obj1.b;
                   if (b1 > null && obj1.c > null) {
                      obj9 = uob1;
                      i3 = i2;
                      f5 = a.a(f4, obj2, (float)size2, (float)b1, b, f, uob) * 0x3f800000;
                   }else {
                      obj9 = uob1;
                      i3 = i2;
                      f5 = f4;
                   }
                   h0 oh02 = new h0(obj9, obj5, f5, 0, StickerTextValueType.EditElement, 0x3f800000, 0x3f800000, String.valueOf(System.currentTimeMillis()));
                   goto label_0257 ;
                }
             }
             a.p(stickerDetai, str2);
             f4 = 0x3f800000;
             goto label_021b ;
          }
       }
       a.p(mStickerId, "stickerId");
       if (mStickerType != i) {
          if (mStickerType != f && mStickerType != str1) {
             if (mStickerType == 5) {
             label_0098 :
                mStickerId = "TAG_STICKER";
             }
          }else {
             mStickerId = "sticker_vote_0";
          }
       }else {
          goto label_0098 ;
       }
       uFeatureId = q.a(mStickerId);
       a.o(uFeatureId, "StickerIds.getStickerFea¡­ickerName\(decorationName\)");
       goto label_0084 ;
    }
    public final void setDynamicStickerParam(StickerDetailInfo p0,a p1,boolean p2,int p3){
       StickerJsonInfo$FrameRate dynamicStick;
       String str2;
       if (PatchProxy.isSupport(AddStickerAction.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), this, AddStickerAction.class, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("AddStickerAction", "setDynamicStickerParam: ", objArray);
       p3 = l0.a.a(p3, p1);
       if (p3 < 0) {
          return;
       }
       GeneratedMessageLite$Builder uBuilder = p1.n(p3);
       a.o(uBuilder, "stickerDraft.getBuilder\(position\)");
       StickerResult$b uob = uBuilder.getResult().toBuilder();
       String str = k3.t(p0, p2);
       a.o(str, "StickerUtils.getStickerF¡­kerDetailInfo, isPicture\)");
       DynamicStickerParam$b uob1 = DynamicStickerParam.newBuilder();
       Minecraft$InputFileOptions inputFileOpt = new Minecraft$InputFileOptions();
       String str1 = "stickerDetailInfo.dynamicStickerFrameRate!!";
       if (p0.getDynamicStickerFrameRate() == null) {
          inputFileOpt.setFrameRate(EditorSdk2Utils.createRationalV2(15, 1));
       }else {
          StickerJsonInfo$FrameRate dynamicStick1 = p0.getDynamicStickerFrameRate();
          a.m(dynamicStick1);
          a.o(dynamicStick1, str1);
          dynamicStick = p0.getDynamicStickerFrameRate();
          a.m(dynamicStick);
          a.o(dynamicStick, str1);
          inputFileOpt.setFrameRate(EditorSdk2Utils.createRationalV2(dynamicStick1.getNum(), dynamicStick.getDen()));
       }
       a.o(uob1, "dynamicStickerParamBuilder");
       uob1.d((double)(((float)inputFileOpt.frameRate().num() * 0x3f800000) / (float)inputFileOpt.frameRate().den()));
       List frameInfoLis = p0.getFrameInfoList();
       a.o(frameInfoLis, "stickerDetailInfo.frameInfoList");
       if (frameInfoLis.isEmpty()) {
          return;
       }else {
          Iterator iterator = frameInfoLis.iterator();
          while (iterator.hasNext()) {
             StickerJsonInfo$Frame uFrame = iterator.next();
             Frame$b uob2 = Frame.newBuilder();
             a.o(uob2, "frameBuilder");
             a.o(uFrame, "frame");
             uob2.c(uFrame.getX());
             uob2.d(uFrame.getY());
             uob2.b(uFrame.getW());
             uob2.a(uFrame.getH());
             uob1.a(uob2);
          }
          int i1 = (p0.isSequenceImage())? 3: 4;
          uob1.b(i1);
          uob1.c(p0.disableLoopAnimation());
          if (p0.isSequenceImage()) {
             dynamicStick = p0.getDynamicStickerFrameRate();
             a.m(dynamicStick);
             a.o(dynamicStick, str1);
             EditorSdk2V2$TimeRangeV2 timeRangeV2 = EditorSdk2UtilsV2.createTimeRange(0, (double)dynamicStick.getDen());
             String separator = File.separator;
             a.o(separator, "File.separator");
             i1 = StringsKt__StringsKt.w3(str, separator, 0, false, 6, null);
             if (i1 >= 0) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                str2 = str.substring(i, i1);
                a.o(str2, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
             }else {
                str2 = str;
             }
             a.o(uob, "stickerResultBuilder");
             uob.m(p1.Q(str2));
             Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
             String str3 = str.substring((i1 + 1));
             a.o(str3, "\(this as java.lang.String\).substring\(startIndex\)");
             uob.l(str3);
             TimeRange$b uob3 = TimeRange.newBuilder();
             uob3.b(timeRangeV2.start());
             uob3.a(timeRangeV2.duration());
             uob.i(uob3.build());
          }
          uBuilder.e(uob1);
          uBuilder.f(q.a(p0.mStickerId));
          uBuilder.h(uob);
          return;
       }
    }
    public final void setRelayStickerParam(a p0,int p1){
       AddStickerAction uAddStickerA = AddStickerAction.class;
       if (PatchProxy.isSupport(uAddStickerA) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAddStickerA, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AddStickerAction", "setRelayStickerParam: ", objArray);
       p1 = l0.a.a(p1, p0);
       if (p1 < 0) {
          return;
       }
       GeneratedMessageLite$Builder uBuilder = p0.n(p1);
       a.o(uBuilder, "stickerDraft.getBuilder\(position\)");
       RelayStickerParam$b uob = uBuilder.instance.getRelayStickerParam().toBuilder();
       uob.a("");
       a.o(uob, "stickerBuilder.relayStic¡­er\(\)\n        .setText\(\"\"\)");
       uBuilder.h(uBuilder.getResult().toBuilder());
       uBuilder.g(uob);
       return;
    }
    public final void setVoteStickerParam(a p0,int p1,boolean p2){
       if (PatchProxy.isSupport(AddStickerAction.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, AddStickerAction.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("AddStickerAction", "setVoteStickerParam: ", objArray);
       p1 = l0.a.a(p1, p0);
       if (p1 < 0) {
          return;
       }
       GeneratedMessageLite$Builder uBuilder = p0.n(p1);
       a.o(uBuilder, "stickerDraft.getBuilder\(position\)");
       StickerResult$b uob = uBuilder.getResult().toBuilder();
       ArrayList uArrayList = new ArrayList();
       String str = a1.p(R.string.arg_RES_7f10513d);
       a.o(str, "CommonUtil.string\(R.string.voting_option1\)");
       uArrayList.add(str);
       str = a1.p(R.string.arg_RES_7f10513e);
       a.o(str, "CommonUtil.string\(R.string.voting_option2\)");
       uArrayList.add(str);
       if (p2) {
          String str1 = a1.p(R.string.arg_RES_7f103b43);
          a.o(str1, "CommonUtil.string\(R.string.other\)");
          uArrayList.add(str1);
       }
       VoteStickerParam$b uob1 = uBuilder.getVoteStickerParam().toBuilder();
       str = this.stickerDetailInfo.getStickerDefaultText();
       if (str == null) {
          str = "";
       }
       uob1.d(str);
       uob1.a(uArrayList);
       a.o(uob1, "stickerBuilder.voteStick¡­  .addAllOptions\(options\)");
       uBuilder.h(uob);
       uBuilder.n(uob1);
       return;
    }
}
