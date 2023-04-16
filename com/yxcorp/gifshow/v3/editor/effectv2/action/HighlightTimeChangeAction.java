package com.yxcorp.gifshow.v3.editor.effectv2.action.HighlightTimeChangeAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import hqc.d;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.kuaishou.edit.draft.HighlightTimeEffect$b;
import raa.e;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import haa.a;
import kba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.UndoAction;
import com.kuaishou.edit.draft.UndoAction$ActionCase;
import fqc.c;
import java.lang.Enum;
import com.kuaishou.edit.draft.AssetRotateAction;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.UndoAction$b;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AssetRotateAction$b;
import com.kuaishou.edit.draft.AssetSpeedAction;
import com.kuaishou.edit.draft.AssetSpeedAction$b;
import com.kuaishou.edit.draft.AssetRangeAction;
import com.kuaishou.edit.draft.AssetRangeAction$b;
import com.kuaishou.edit.draft.SplitAssetAction;
import com.kuaishou.edit.draft.SplitAssetAction$b;
import com.kuaishou.edit.draft.DeleteAssetAction;
import com.kuaishou.edit.draft.DeleteAssetAction$b;
import java.lang.Double;
import com.kuaishou.edit.draft.HighlightTimeEffect;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import dqc.a;
import hqc.f;
import hqc.g;
import com.yxcorp.gifshow.v3.editor.effectv2.data.HTParam;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.v3.editor.effectv2.data.HTMusicRange;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.effectv2.data.HighlightTimeConfigExtra;
import java.lang.CharSequence;
import com.kuaishou.edit.draft.EditLyric$b;
import com.kuaishou.edit.draft.EditLyric;
import com.yxcorp.gifshow.v3.editor.effectv2.data.HTTextParam;
import com.kuaishou.edit.draft.StickerResult$b;
import com.kuaishou.edit.draft.StickerResult;
import com.yxcorp.gifshow.v3.editor.effectv2.data.HTTextDefaultPosition;
import j80.f;
import com.kuaishou.edit.draft.FaceMagicEffect$b;
import com.kuaishou.edit.draft.FaceMagicEffect;
import com.kuaishou.edit.draft.Attributes;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.FaceMagicEffect$Type;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import maa.a;
import hqc.e;
import wba.d;
import com.yxcorp.gifshow.models.QMedia;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collection;
import lqc.d;
import java.lang.RuntimeException;
import wba.f;
import wba.n0;
import com.kuaishou.edit.draft.Asset$b;
import com.kwai.robust.PatchProxyResult;

public final class HighlightTimeChangeAction extends EditSdkAction	// class@000f45
{
    public final d currentEffect;
    public final int highlightTimeInsertTrackIndex;
    public final double highlightTimeStartTime;
    public final d lastEffect;
    public String selectHighlightTimeAssetIdentifier;

    public void HighlightTimeChangeAction(d p0,d p1,double p2,int p3,String p4){
       a.p(p0, "currentEffect");
       a.p(p1, "lastEffect");
       a.p(p4, "selectHighlightTimeAssetIdentifier");
       super();
       this.currentEffect = p0;
       this.lastEffect = p1;
       this.highlightTimeStartTime = p2;
       this.highlightTimeInsertTrackIndex = p3;
       this.selectHighlightTimeAssetIdentifier = p4;
    }
    public void HighlightTimeChangeAction(d p0,d p1,double p2,int p3,String p4,int p5,u p6){
       if (p5 & 0x10) {
          p4 = "";
       }
       super(p0, p1, p2, p3, p4);
       return;
    }
    public static void fillHighlightTimeDraft$default(HighlightTimeChangeAction p0,HighlightTimeEffect$b p1,double p2,e p3,String p4,boolean p5,int p6,Object p7){
       boolean b = (p6 & 0x10)? false: p5;
       p0.fillHighlightTimeDraft(p1, p2, p3, p4, b);
       return;
    }
    public final void changeUndo(int p0,boolean p1,c p2){
       int trackIndex;
       Object[] objArray2;
       GeneratedMessageLite$Builder uBuilder;
       GeneratedMessageLite$Builder uBuilder1;
       DeleteAssetAction$b uob;
       SplitAssetAction$b uob1;
       AssetRangeAction$b uob2;
       AssetSpeedAction$b uob3;
       AssetRotateAction$b uob4;
       if (PatchProxy.isSupport(HighlightTimeChangeAction.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, HighlightTimeChangeAction.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeSelectAction", "changeUndo highlightTimeEffectIndex:"+p0+", isDelete:"+p1, objArray);
       a uoa = a.a.u(p2);
       if (uoa.E()) {
          Object[] objArray1 = new Object[0];
          a.D().w("HighlightTimeSelectAction", "changeUndo empty return", objArray1);
          return;
       }else {
          List list = uoa.z();
          a.o(list, "undoDraft.messages");
          Iterator iterator = list.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             DeleteAssetAction obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             a.o(obj, "topUndoAction");
             UndoAction$ActionCase actionCase = obj.getActionCase();
             if (actionCase != null) {
                switch (c.a[actionCase.ordinal()]){
                    case 1:
                      obj = obj.getDeleteAssetAction();
                      a.o(obj, "topUndoAction.deleteAssetAction");
                      trackIndex = obj.getTrackIndex();
                      objArray2 = new Object[0];
                      a.D().w("HighlightTimeSelectAction", "changeUndo delete targetIndex:"+trackIndex, objArray2);
                      if (p0 < trackIndex) {
                         if (p1) {
                            uBuilder = uoa.n(i);
                            a.o(uBuilder, "undoDraft.getBuilder\(index\)");
                            uBuilder1 = uoa.n(i);
                            a.o(uBuilder1, "undoDraft.getBuilder\(index\)");
                            uob = uBuilder1.getDeleteAssetAction().toBuilder();
                            trackIndex = trackIndex - 1;
                            uob.c(trackIndex);
                            uBuilder.e(uob.build());
                         }else {
                            uBuilder = uoa.n(i);
                            a.o(uBuilder, "undoDraft.getBuilder\(index\)");
                            uBuilder1 = uoa.n(i);
                            a.o(uBuilder1, "undoDraft.getBuilder\(index\)");
                            uob = uBuilder1.getDeleteAssetAction().toBuilder();
                            trackIndex = trackIndex + 1;
                            uob.c(trackIndex);
                            uBuilder.e(uob.build());
                         }
                      }
                      break;
                    case 2:
                      SplitAssetAction splitAssetAc = obj.getSplitAssetAction();
                      a.o(splitAssetAc, "topUndoAction.splitAssetAction");
                      trackIndex = splitAssetAc.getTrackIndex();
                      objArray2 = new Object[0];
                      a.D().w("HighlightTimeSelectAction", "changeUndo split targetIndex:"+trackIndex, objArray2);
                      if (p0 < trackIndex) {
                         if (p1) {
                            uBuilder = uoa.n(i);
                            a.o(uBuilder, "undoDraft.getBuilder\(index\)");
                            uBuilder1 = uoa.n(i);
                            a.o(uBuilder1, "undoDraft.getBuilder\(index\)");
                            uob1 = uBuilder1.getSplitAssetAction().toBuilder();
                            trackIndex = trackIndex - 1;
                            uob1.a(trackIndex);
                            uBuilder.f(uob1.build());
                         }else {
                            uBuilder = uoa.n(i);
                            a.o(uBuilder, "undoDraft.getBuilder\(index\)");
                            uBuilder1 = uoa.n(i);
                            a.o(uBuilder1, "undoDraft.getBuilder\(index\)");
                            uob1 = uBuilder1.getSplitAssetAction().toBuilder();
                            trackIndex = trackIndex + 1;
                            uob1.a(trackIndex);
                            uBuilder.f(uob1.build());
                         }
                      }
                      break;
                    case 3:
                      AssetRangeAction assetRangeAc = obj.getAssetRangeAction();
                      a.o(assetRangeAc, "topUndoAction.assetRangeAction");
                      trackIndex = assetRangeAc.getTrackIndex();
                      objArray2 = new Object[0];
                      a.D().w("HighlightTimeSelectAction", "changeUndo asset range targetIndex:"+trackIndex, objArray2);
                      if (p0 < trackIndex) {
                         if (p1) {
                            uBuilder = uoa.n(i);
                            a.o(uBuilder, "undoDraft.getBuilder\(index\)");
                            uBuilder1 = uoa.n(i);
                            a.o(uBuilder1, "undoDraft.getBuilder\(index\)");
                            uob2 = uBuilder1.getAssetRangeAction().toBuilder();
                            trackIndex = trackIndex - 1;
                            uob2.a(trackIndex);
                            uBuilder.a(uob2.build());
                         }else {
                            uBuilder = uoa.n(i);
                            a.o(uBuilder, "undoDraft.getBuilder\(index\)");
                            uBuilder1 = uoa.n(i);
                            a.o(uBuilder1, "undoDraft.getBuilder\(index\)");
                            uob2 = uBuilder1.getAssetRangeAction().toBuilder();
                            trackIndex = trackIndex + 1;
                            uob2.a(trackIndex);
                            uBuilder.a(uob2.build());
                         }
                      }
                      break;
                    case 4:
                      AssetSpeedAction assetSpeedAc = obj.getAssetSpeedAction();
                      a.o(assetSpeedAc, "topUndoAction.assetSpeedAction");
                      trackIndex = assetSpeedAc.getEditingIndex();
                      objArray2 = new Object[0];
                      a.D().w("HighlightTimeSelectAction", "changeUndo speed targetIndex:"+trackIndex, objArray2);
                      if (p0 < trackIndex) {
                         if (p1) {
                            uBuilder = uoa.n(i);
                            a.o(uBuilder, "undoDraft.getBuilder\(index\)");
                            uBuilder1 = uoa.n(i);
                            a.o(uBuilder1, "undoDraft.getBuilder\(index\)");
                            uob3 = uBuilder1.getAssetSpeedAction().toBuilder();
                            trackIndex = trackIndex - 1;
                            uob3.a(trackIndex);
                            uBuilder.c(uob3.build());
                         }else {
                            uBuilder = uoa.n(i);
                            a.o(uBuilder, "undoDraft.getBuilder\(index\)");
                            uBuilder1 = uoa.n(i);
                            a.o(uBuilder1, "undoDraft.getBuilder\(index\)");
                            uob3 = uBuilder1.getAssetSpeedAction().toBuilder();
                            trackIndex = trackIndex + 1;
                            uob3.a(trackIndex);
                            uBuilder.c(uob3.build());
                         }
                      }
                      break;
                    case 5:
                      AssetRotateAction assetRotateA = obj.getAssetRotateAction();
                      a.o(assetRotateA, "topUndoAction.assetRotateAction");
                      trackIndex = assetRotateA.getTrackIndex();
                      objArray2 = new Object[0];
                      a.D().w("HighlightTimeSelectAction", "changeUndo rotate targetIndex:"+trackIndex, objArray2);
                      if (p0 < trackIndex) {
                         if (p1) {
                            uBuilder = uoa.n(i);
                            a.o(uBuilder, "undoDraft.getBuilder\(index\)");
                            uBuilder1 = uoa.n(i);
                            a.o(uBuilder1, "undoDraft.getBuilder\(index\)");
                            uob4 = uBuilder1.getAssetRotateAction().toBuilder();
                            trackIndex = trackIndex - 1;
                            uob4.a(trackIndex);
                            uBuilder.b(uob4.build());
                         }else {
                            uBuilder = uoa.n(i);
                            a.o(uBuilder, "undoDraft.getBuilder\(index\)");
                            uBuilder1 = uoa.n(i);
                            a.o(uBuilder1, "undoDraft.getBuilder\(index\)");
                            uob4 = uBuilder1.getAssetRotateAction().toBuilder();
                            trackIndex = trackIndex + 1;
                            uob4.a(trackIndex);
                            uBuilder.b(uob4.build());
                         }
                      }
                      break;
                    case 6:
                      objArray = new Object[0];
                      a.D().w("HighlightTimeSelectAction", "changeUndo transition", objArray);
                      break;
                    case 7:
                      objArray = new Object[0];
                      a.D().w("HighlightTimeSelectAction", "changeUndo arrange", objArray);
                      break;
                    default:
                }
             }
             i = i1;
          }
          return;
       }
    }
    public final void fillHighlightTimeDraft(HighlightTimeEffect$b p0,double p1,e p2,String p3,boolean p4){
       HighlightTimeChangeAction highlightTim = HighlightTimeChangeAction.class;
       int i = 0;
       if (PatchProxy.isSupport(highlightTim)) {
          Object[] objArray = new Object[]{p0,Double.valueOf(p1),p2,p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, highlightTim, "5")) {
             return;
          }
       }
       String str = "";
       String uploadOrigin = (p4)? p0.instance.getUploadOriginFrameFile(): str;
       Object[] objArray1 = new Object[i];
       a.D().w("HighlightTimeSelectAction", "fillHighlightTimeDraft draftVideoDuration:"+p1+", assetIdentifier:"+p3+", isReplace:"+p4+", oldText:"+str, objArray1);
       p0.clear();
       FeatureId$b uob = FeatureId.newBuilder();
       uob.a(this.currentEffect.getId());
       p0.copyOnWrite();
       p0.instance.setFeatureId(uob.build());
       p0.copyOnWrite();
       p0.instance.setAssetIdentifier(p3);
       p0.copyOnWrite();
       p0.instance.setKuaishanServerActionMode(this.currentEffect.n().d().a().a());
       TimeRange$b uob1 = TimeRange.newBuilder();
       uob1.b(this.currentEffect.n().d().a().c().start);
       double d = (this.currentEffect.n().d().a().c().a() - (double)i < 0)? p1: Math.min(p1, this.currentEffect.n().d().a().c().a());
       uob1.a(d);
       p0.copyOnWrite();
       p0.instance.setMusicTimeRange(uob1);
       p0.copyOnWrite();
       p0.instance.setUploadImageMaxWidthLimit(this.currentEffect.n().a().getUploadImageMaxWidthLimit());
       a.o(uploadOrigin, "oldUploadOriginFrameFile");
       HighlightTimeChangeAction highlightTim1 = (!uploadOrigin.length())? 1: null;
       highlightTim1 = (highlightTim1)? p2.Q(this.currentEffect.n().j): str;
       p0.copyOnWrite();
       p0.instance.setUploadOriginFrameFile(highlightTim1);
       EditLyric$b uob2 = EditLyric.newBuilder();
       if (str.length() > 0) {
          i = 1;
       }
       if (!i) {
          str = this.currentEffect.n().a().getDefaultText();
       }
       uob2.a(str);
       uob2.f(this.currentEffect.n().d().a().e().animeInRatio);
       uob2.h(this.currentEffect.n().d().a().e().animeOutRatio);
       uob2.m(this.currentEffect.n().d().a().e().textRangeRatio);
       uob2.e(1);
       StickerResult$b uob3 = StickerResult.newBuilder();
       uob3.t(this.currentEffect.n().d().a().e().textScale);
       uob3.s(this.currentEffect.n().d().a().e().textRotate);
       uob3.f(this.currentEffect.n().d().a().d().x);
       uob3.g(this.currentEffect.n().d().a().d().y);
       TimeRange$b uob4 = TimeRange.newBuilder();
       uob4.b(this.highlightTimeStartTime);
       uob4.a(p1);
       uob3.n(uob4);
       uob2.copyOnWrite();
       uob2.instance.addStickerResults(uob3);
       p0.copyOnWrite();
       p0.instance.setText(uob2);
       if (f.e(this.currentEffect.n().h())) {
          p0.copyOnWrite();
          p0.instance.setMusisFile(p2.Q(this.currentEffect.n().h()));
       }
       if (f.e(this.currentEffect.n().j())) {
          uob2 = p0.getText().toBuilder();
          uob2.g(p2.Q(this.currentEffect.n().j()));
          p0.b(uob2.build());
       }
       if (f.e(this.currentEffect.n().k())) {
          uob2 = p0.getText().toBuilder();
          uob2.i(p2.Q(this.currentEffect.n().k()));
          p0.b(uob2.build());
       }
       if (f.e(this.currentEffect.n().l())) {
          uob2 = p0.getText().toBuilder();
          uob2.n(p2.Q(this.currentEffect.n().l()));
          p0.b(uob2.build());
       }
       if (f.e(this.currentEffect.n().b())) {
          uob2 = p0.getText().toBuilder();
          uob2.k(p2.Q(this.currentEffect.n().b()));
          p0.b(uob2.build());
       }
       if (f.e(this.currentEffect.n().f())) {
          FaceMagicEffect$b uob5 = FaceMagicEffect.newBuilder();
          uob5.b(DraftUtils.i());
          uob5.a(p2.Q(this.currentEffect.n().f()));
          TimeRange$b uob6 = TimeRange.newBuilder();
          uob6.b(this.highlightTimeStartTime);
          uob6.a(p1);
          uob5.d(uob6);
          uob5.e(FaceMagicEffect$Type.FACE_MAGIC);
          p0.copyOnWrite();
          p0.instance.setMagicEffct(uob5);
       }
       return;
    }
    public final d getCurrentEffect(){
       return this.currentEffect;
    }
    public final double getHighlightTimeStartTime(){
       return this.highlightTimeStartTime;
    }
    public final d getLastEffect(){
       return this.lastEffect;
    }
    public final String getSelectHighlightTimeAssetIdentifier(){
       return this.selectHighlightTimeAssetIdentifier;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HighlightTimeChangeAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       this.performActionX(p0);
       return;
    }
    public final void performActionX(c p0){
       d a;
       GeneratedMessageLite$Builder uBuilder;
       GeneratedMessageLite$Builder uBuilder1;
       String str = this;
       List obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, str, HighlightTimeChangeAction.class, "2")) {
          return;
       }
       a.p(obj, "workspaceDraft");
       a uoa = a.c(p0);
       e uoe = a.l(p0);
       double d = (double)((float)str.currentEffect.n().i / 1000.00f);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("HighlightTimeSelectAction", "performAction currentAdvEffect:"+str.currentEffect+", lastEffect:"+str.lastEffect+','+"currentTime:"+str.highlightTimeStartTime+", draftDuration:"+d, objArray);
       a = e.a;
       if (a.g(str.currentEffect, a) && a.g(str.lastEffect, a)) {
          return;
       }
       String str1 = "highlightTimeEffectDraft¡­highlightTimeEffectIndex\)";
       if (a.g(str.lastEffect, a)) {
          HighlightTimeChangeAction highlightTim = (!str.selectHighlightTimeAssetIdentifier.length())? 1: null;
          if (highlightTim) {
             str.changeUndo((str.highlightTimeInsertTrackIndex - 1), i, obj);
             QMedia[] qMediaArray = new QMedia[]{str1};
             QMedia qMedia = new QMedia(-1, str.currentEffect.n().e(), str.currentEffect.n().i, 0, 1);
             obj = d.a.a(obj, (str.highlightTimeInsertTrackIndex - 1), CollectionsKt__CollectionsKt.r(qMediaArray), null);
             if (obj.isEmpty() ^ 1) {
                str.selectHighlightTimeAssetIdentifier = obj.get(i);
             }
             uBuilder = uoe.b();
             a.o(uBuilder, "highlightTimeEffectDraft.append\(\)");
             uBuilder1 = uBuilder;
             HighlightTimeChangeAction.fillHighlightTimeDraft$default(this, uBuilder1, d, uoe, str.selectHighlightTimeAssetIdentifier, false, 16, null);
          }else {
             int i1 = d.a.b(str.selectHighlightTimeAssetIdentifier, uoe, uoa);
             if (i1 >= 0) {
                uBuilder = uoe.n(i1);
                a.o(uBuilder, str1);
                uBuilder1 = uBuilder;
                this.replaceHighlightTime(uBuilder1, d, uoe, uoa);
             }else {
                throw new RuntimeException("HighlightTimeSelectAction performAction selectHighlightTimeAssetIdentifier offline invalid selectHighlightTimeAssetIdentifier:"+str.selectHighlightTimeAssetIdentifier);
             }
          }
       }else {
          int i2 = d.a.b(str.selectHighlightTimeAssetIdentifier, uoe, uoa);
          if (i2 >= 0) {
             GeneratedMessageLite$Builder uBuilder2 = uoe.n(i2);
             a.o(uBuilder2, str1);
             if (a.g(str.currentEffect, a)) {
                String assetIdentif = uBuilder2.instance.getAssetIdentifier();
                a.o(assetIdentif, "highlightTimeEffectBuilder.assetIdentifier");
                int i3 = f.b(uoa, assetIdentif);
                str.changeUndo(i3, 1, obj);
                if (i3 >= 0) {
                   uoa.V(i3);
                }
                uoe.V(i2);
                str.selectHighlightTimeAssetIdentifier = "";
             }else {
                this.replaceHighlightTime(uBuilder2, d, uoe, uoa);
             }
          }else {
             throw new RuntimeException("HighlightTimeSelectAction performAction selectHighlightTimeAssetIdentifier invalid selectHighlightTimeAssetIdentifier:"+str.selectHighlightTimeAssetIdentifier);
          }
       }
       return;
    }
    public final void replaceHighlightTime(HighlightTimeEffect$b p0,double p1,e p2,a p3){
       if (PatchProxy.isSupport(HighlightTimeChangeAction.class) && PatchProxy.applyVoidFourRefs(p0, Double.valueOf(p1), p2, p3, this, HighlightTimeChangeAction.class, "4")) {
          return;
       }
       String str = n0.e(this.currentEffect.n().e());
       Asset$b uob = p3.n(f.b(p3, this.selectHighlightTimeAssetIdentifier));
       uob.k(p3.R(this.currentEffect.n().e(), false));
       uob.i(p1);
       uob.m(str);
       a.o(str, "newSelectHighlightTimeAssetIdentifier");
       this.fillHighlightTimeDraft(p0, p1, p2, str, true);
       return;
    }
    public final void setSelectHighlightTimeAssetIdentifier(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighlightTimeChangeAction.class, "7")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.selectHighlightTimeAssetIdentifier = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HighlightTimeChangeAction.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HighlightTimeChangeAction\(currentEffect="+this.currentEffect+", lastEffect="+this.lastEffect+", highlightTimeStartTime="+this.highlightTimeStartTime+", highlightTimeInsertTrackIndex="+this.highlightTimeInsertTrackIndex+", selectHighlightTimeAssetIdentifier=\'"+this.selectHighlightTimeAssetIdentifier+"\'\)";
    }
}
