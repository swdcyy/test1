package com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils$sTimelineConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.app.Activity;
import android.content.Intent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import tkd.b;
import tkd.d;
import om6.j;
import om6.k;
import com.kwai.library.widget.popup.common.f;
import kotlin.jvm.internal.a;
import w69.b$a;
import w69.f$a;
import o79.a;
import w69.k$a;
import lnc.a1;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import uxb.o;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.b;
import w69.i$a;
import w69.b;
import w69.f;
import w69.k;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import ga9.c;
import java.util.HashMap;
import java.util.ArrayList;
import nsd.u;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;
import com.yxcorp.gifshow.v3.editor.clip_v3.videoreorder.vb.VideoReorderSelectedContainerViewBinder;
import e16.a$a;
import w69.i;
import e16.a;
import x79.d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import kba.a;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Collection;
import maa.a;
import com.kuaishou.edit.draft.UndoAction;
import com.kuaishou.edit.draft.AssetTransitionAction;
import rvc.e;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.AssetTransition;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import yoc.n;
import java.lang.Double;
import java.lang.Math;
import haa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.UndoAction$ActionCase;
import com.kuaishou.edit.draft.AssetRangeAction;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$b;
import com.kuaishou.edit.draft.TimeRange$b;
import raa.g;
import ekd.q;
import com.kuaishou.edit.draft.TimeEffect;
import opc.f;
import com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.SplitTrackEditAction;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import bpc.c;
import bpc.a;
import bpc.f;
import yoc.f;
import uvc.a;
import java.util.Objects;
import java.lang.Number;
import fpc.a;
import fpc.b;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import bpc.e;
import xvc.b;
import yoc.i;
import java.lang.Enum;
import com.kuaishou.edit.draft.AssetArrangeAction;
import wba.n0;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.AssetTransitionActionData;
import com.kuaishou.edit.draft.AssetRotateAction;
import com.kuaishou.edit.draft.AssetSpeedAction;
import com.kuaishou.edit.draft.SplitAssetAction;
import com.kuaishou.edit.draft.DeleteAssetAction;
import java.lang.RuntimeException;

public final class ClipUtils	// class@000daa
{
    public static double a;
    public static final p b;
    public static final ClipUtils c;

    static {
       ClipUtils.c = new ClipUtils();
       ClipUtils.a = (double)((float)LongVideoLocalProject.e(true) / 1000.00f);
       ClipUtils.b = s.c(ClipUtils$sTimelineConfig$2.INSTANCE);
    }
    public void ClipUtils(){
       super();
    }
    public static final Intent a(Activity p0,long p1,int p2){
       String obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(ClipUtils.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), null, ClipUtils.class, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       Intent intent = d.a(0x2538349d).nt(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       obj = f.m(R.string.arg_RES_7f100cc4, objArray);
       a.o(obj, "WidgetUtils.getString\(R.¡­_video_arrange_max_count\)");
       Object[] objArray1 = new Object[i];
       String str = f.m(R.string.arg_RES_7f100cc5, objArray1);
       a.o(str, "WidgetUtils.getString\(R.¡­deo_arrange_max_duration\)");
       b$a uoa = new b$a();
       uoa.c(true);
       f$a uoa1 = new f$a();
       uoa1.g(a.a);
       uoa1.c(2);
       k$a uoa2 = new k$a();
       uoa2.f(a1.p(R.string.arg_RES_7f1045fa));
       uoa2.g(true);
       uoa2.n((PostExperimentUtils.e() ^ true));
       uoa2.q(true);
       uoa2.p(true);
       uoa2.t = true;
       uoa2.U = p1;
       k$a uoa3 = uoa2.r(i);
       AlbumLimitOption$Builder uBuilder = o.a().a("post_edit_cut_reorder");
       uBuilder.g((p2 - 31));
       uBuilder.p(i);
       uBuilder.h(obj);
       uBuilder.h = b.C - p1;
       i$a obj1 = PatchProxy.applyOneRefs(str, uBuilder, AlbumLimitOption$Builder.class, "9");
       if (obj1 != patchProxyRe) {
          uBuilder = obj1;
       }else {
          a.q(str, "_a");
          uBuilder.i = str;
       }
       obj1 = new i$a().a(uoa.a()).d(uoa1.a()).m(uoa3.b()).f(uBuilder.d());
       c uoc = new c(null, null, false, 7, null);
       obj1.n(v11.e(AbsSelectedContainerViewBinder.class, VideoReorderSelectedContainerViewBinder.class));
       d.a(intent, new a$a().g(obj1.b()).f());
       return intent;
    }
    public final String b(){
       String obj = PatchProxy.apply(null, this, ClipUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       double a = ClipUtils.a;
       double d = (double)60;
       int i = 1;
       if (a - d >= 0) {
          Object[] objArray = new Object[i];
          objArray[0] = String.valueOf((int)(a / d));
          obj = f.m(R.string.arg_RES_7f1005e7, objArray);
          a.o(obj, "WidgetUtils.getString\(R.¡­/ 60\).toInt\(\).toString\(\)\)");
       }else {
          Object[] objArray1 = new Object[i];
          objArray1[0] = String.valueOf(a);
          obj = f.m(R.string.arg_RES_7f1005e5, objArray1);
          a.o(obj, "WidgetUtils.getString\(R.¡­LimitDuration.toString\(\)\)");
       }
       return obj;
    }
    public final Pair c(c p0){
       TransitionEffect obj = PatchProxy.applyOneRefs(p0, this, ClipUtils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       obj = TransitionEffect.Companion.b();
       a uoa = p0.c1();
       List list = null;
       List list1 = (uoa != null)? uoa.z(): list;
       ArrayList uArrayList = new ArrayList(list1);
       a uoa1 = p0.o0();
       if (uoa1 != null) {
          list = uoa1.z();
       }
       ArrayList uArrayList1 = new ArrayList(list);
       int i = uArrayList.size();
       int i1 = 0;
       int i2 = 0;
       String str = null;
       boolean b = false;
       boolean b1 = false;
       int i3 = 1;
       while (i2 < i) {
          if (uArrayList.get(i2).hasAssetTransitionAction()) {
             AssetTransitionAction obj1 = uArrayList.get(i2);
             a.o(obj1, "undoMessageList[index]");
             obj1 = obj1.getAssetTransitionAction();
             a.o(obj1, "transitionAction");
             b1 = obj1.getCurApplyToAll();
             obj = (b1)? e.a.a(obj1.getCurType()): TransitionEffect.Companion.b();
             str = 1;
             b = true;
          }
          i2 = i2 + 1;
       }
       if (str == null) {
          i = uArrayList1.size();
          int i4 = 0;
          while (i4 < i) {
             Object obj2 = uArrayList1.get(i4);
             a.o(obj2, "assetMessageList[index]");
             i2 = a.g(obj2.getTransition(), AssetTransition.getDefaultInstance()) ^ i3;
             if (i2) {
                AssetTransition obj3 = uArrayList1.get(i4);
                a.o(obj3, "assetMessageList[index]");
                obj3 = obj3.getTransition();
                a.o(obj3, "assetMessageList[index].transition");
                obj = e.a.a(obj3.getSdkType());
                b = true;
                b1 = 1;
                break ;
             }
             i4 = i4 + 1;
          }
       }
       if (b) {
          i3 = b1;
       }
       Object[] objArray = new Object[i1];
       a.D().w("ClipUtils", "getDraftTransitionParam hasTransition"+b+", "+"undoActionHasTransition"+str+", isApplyAll"+i3+", "+"currentApplyAllTransitionType"+obj, objArray);
       Boolean uBoolean = Boolean.valueOf(i3);
       if (obj == null) {
          obj = TransitionEffect.Companion.b();
       }
       return new Pair(uBoolean, obj);
    }
    public final n d(){
       Object obj = PatchProxy.apply(null, this, ClipUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipUtils.b.getValue();
    }
    public final Pair e(c p0,int p1,boolean p2,double p3,double p4){
       a obj;
       int i4;
       TimeRange selectedRang1;
       GeneratedMessageLite$Builder uBuilder;
       TimeRange$b uob;
       object oobject = p0;
       int i = p1;
       double d = p3;
       ClipUtils uClipUtils = ClipUtils.class;
       int i1 = 2;
       int i2 = 1;
       int i3 = 0;
       Integer integer = Integer.valueOf(i3);
       if (PatchProxy.isSupport(uClipUtils)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Boolean.valueOf(p2),Double.valueOf(p3),Double.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, uClipUtils, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i5 = this;
       }
       a.p(oobject, "workspaceDraft");
       double d1 = 0;
       if (Math.abs(p3) - 0x3f50624dd2f1a9fc < 0) {
          return new Pair(Double.valueOf(d1), integer);
       }else {
          obj = a.a.u(oobject);
          UndoAction undoAction = obj.y((obj.p() - i2));
          a.o(undoAction, "undoMessage");
          if (undoAction.getActionCase() != UndoAction$ActionCase.ASSET_RANGE_ACTION) {
             return new Pair(Double.valueOf(d1), integer);
          }else {
             AssetRangeAction assetRangeAc = undoAction.getAssetRangeAction();
             a.o(assetRangeAc, "undoMessage.assetRangeAction");
             TimeRange originalRang = assetRangeAc.getOriginalRange();
             a.o(originalRang, "originRange");
             double start = originalRang.getStart();
             a uoa = a.c(p0);
             Asset uAsset = uoa.z().get(i);
             a.o(uAsset, "asset");
             TimeRange selectedRang = uAsset.getSelectedRange();
             a.o(selectedRang, "asset.selectedRange");
             double start1 = selectedRang.getStart();
             selectedRang = uAsset.getSelectedRange();
             a.o(selectedRang, "asset.selectedRange");
             double start2 = selectedRang.getStart();
             selectedRang = uAsset.getSelectedRange();
             a.o(selectedRang, "asset.selectedRange");
             start2 = start2 + selectedRang.getDuration();
             double duration = uAsset.getDuration();
             double d2 = originalRang.getDuration() + start;
             double d3 = (uAsset.getSpeed() - (double)i3 <= 0)? 0x3ff0000000000000: uAsset.getSpeed();
             double d4 = start;
             double d5 = (ClipUtils.a - p4) * d3;
             d3 = d3 * (p4 - 0x3ff0000000000000);
             if (p2) {
                duration = start1 - d4;
                d5 = (- d5) - duration;
                d3 = d3 - duration;
                i4 = (d - d3 > 0)? 2: 0;
                i2 = (d - d5 < 0)? 1: i4;
                d = Math.max(Math.min(Math.max(Math.min(d, d3), d5), ((start2 - start1) - 0x3fc999999999999a)), (- start1));
                if (Math.abs(d) - 0x3f50624dd2f1a9fc < 0) {
                   return new Pair(Double.valueOf(0), Integer.valueOf(i2));
                }else {
                   originalRang = uAsset.getSelectedRange();
                   a.o(originalRang, "asset.selectedRange");
                   selectedRang1 = uAsset.getSelectedRange();
                   a.o(selectedRang1, "asset.selectedRange");
                   uBuilder = uoa.n(i);
                   a.o(uBuilder, "assetDraft.getBuilder\(assetDraftIndex\)");
                   uob = TimeRange.newBuilder();
                   uob.b((originalRang.getStart() + d));
                   uob.a((selectedRang1.getDuration() - d));
                   uBuilder.s(uob.build());
                }
             }else {
                d2 = start2 - d2;
                d5 = d5 - d2;
                d3 = (- d3) - d2;
                i4 = (d - d3 < 0)? 2: 0;
                i2 = (d - d5 > 0)? 1: i4;
                d = Math.max(Math.min(Math.min(Math.max(d, d3), d5), (duration - start2)), ((start1 - start2) + 0x3fc999999999999a));
                if (Math.abs(d) - 0x3f50624dd2f1a9fc < 0) {
                   return new Pair(Double.valueOf(0), Integer.valueOf(i2));
                }else {
                   originalRang = uAsset.getSelectedRange();
                   a.o(originalRang, "asset.selectedRange");
                   selectedRang1 = uAsset.getSelectedRange();
                   a.o(selectedRang1, "asset.selectedRange");
                   uBuilder = uoa.n(i);
                   a.o(uBuilder, "assetDraft.getBuilder\(assetDraftIndex\)");
                   uob = TimeRange.newBuilder();
                   uob.b(originalRang.getStart());
                   uob.a((selectedRang1.getDuration() + d));
                   uBuilder.s(uob.build());
                }
             }
             return new Pair(Double.valueOf(d), Integer.valueOf(i2));
          }
       }
    }
    public final boolean f(c p0){
       g obj = PatchProxy.applyOneRefs(p0, this, ClipUtils.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "workspaceDraft");
       obj = p0.Y0();
       List list = (obj != null)? obj.z(): null;
       int i = 0;
       if (!q.f(list)) {
          g og = p0.Y0();
          if (og != null) {
             List list1 = og.z();
             if (list1 != null) {
                TimeEffect timeEffect = list1.get(i);
                if (timeEffect != null && timeEffect.getSdkType() == 3) {
                   i = true;
                }
             }
          }
       }
       return i;
    }
    public final void g(f p0,boolean p1,boolean p2,boolean p3){
       f a;
       double d;
       TransitionEffect transitionEf;
       Object obj = p0;
       if (PatchProxy.isSupport(ClipUtils.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, ClipUtils.class, "11")) {
          return;
       }
       a.p(obj, "clipViewModel");
       int b = false;
       boolean b1 = (p0.o0().c().g() || p2)? true: false;
       int i = p0.o0().e().c();
       a = f.a;
       f uof = p0.o0().e();
       a uoa = p0.o0().a();
       Objects.requireNonNull(a);
       if (PatchProxy.isSupport(f.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(uof, uoa, Boolean.valueOf(b), a, f.class, "11");
          if (obj1 != PatchProxyResult.class) {
             d = obj1.doubleValue();
          label_00f5 :
             SplitTrackEditAction splitTrackEd = new SplitTrackEditAction(b1, i, d, TransitionEffect.Companion.a(p0.o0().g().c()), p1);
             obj.z0(v0, p3);
             return;
          }
       }
       a.p(uof, "timelineState");
       a.p(uoa, "playerState");
       b = uof.c();
       double uoa1 = uoa.c();
       List list = uof.f();
       a uoa2 = (b > 0)? list.get((b - 1)): null;
       d = 0;
       double d1 = a.g(b, d, list);
       if (uoa2 != null) {
          b uob = uoa2.s();
          if (uob != null) {
             transitionEf = uob.a();
             if (transitionEf != null) {
             label_00cb :
                if (EditorSdk2Utils.transitionTypeHasOverlayDuration(transitionEf.getMSdkId())) {
                   d = 0x3ff0000000000000;
                   if (uoa2 != null && !uoa2.q() - d) {
                      d = transitionEf.getMCostTime();
                   }else {
                      double mCostTime = transitionEf.getMCostTime();
                      if (uoa2 != null) {
                         d = uoa2.q();
                      }
                      d = mCostTime / d;
                   }
                }
                d = (uoa1 - d1) + d;
                goto label_00f5 ;
             }
          }
       }
       transitionEf = TransitionEffect.Companion.b();
       goto label_00cb ;
    }
    public final void h(c p0){
       int trackIndex;
       List originalAsse;
       Iterator iterator;
       AssetTransitionActionData uAssetTransi;
       int i2;
       GeneratedMessageLite$Builder uBuilder;
       GeneratedMessageLite$Builder uBuilder1;
       GeneratedMessageLite$Builder uBuilder5;
       GeneratedMessageLite$Builder uBuilder6;
       String str2;
       int trackIndex1;
       AssetTransitionActionData uAssetTransi2;
       GeneratedMessageLite$Builder uBuilder7;
       UndoAction obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, ClipUtils.class, "4")) {
          return;
       }
       a.p(obj, "workspaceDraft");
       a uoa = a.c(p0);
       a uoa1 = a.a.u(obj);
       int b = this.f(p0);
       int i = 1;
       UndoAction undoAction = uoa1.z().get((uoa1.p() - i));
       a.o(undoAction, "topUndoAction");
       UndoAction$ActionCase actionCase = undoAction.getActionCase();
       if (actionCase != null) {
          String str = "undoAction";
          String str1 = "undoDraft.getMessage\(undoDraft.count - 1\)";
          int i1 = 0;
          switch (i.a[actionCase.ordinal()]){
              case 1:
                DeleteAssetAction deleteAssetA = undoAction.getDeleteAssetAction();
                a.o(deleteAssetA, "topUndoAction.deleteAssetAction");
                trackIndex = deleteAssetA.getTrackIndex();
                i = 1;
                GeneratedMessageLite generatedMes = uoa1.y((uoa1.p() - i));
                a.o(generatedMes, str1);
                DeleteAssetAction deleteAssetA1 = generatedMes.getDeleteAssetAction();
                a.o(deleteAssetA1, "undoDraft.getMessage\(und¡­nt - 1\).deleteAssetAction");
                uoa.C(trackIndex, n0.d(deleteAssetA1.getAsset(), uoa, i, uoa1, false));
                if (!b) {
                   obj = uoa1.z().get((uoa1.p() - i));
                   a.o(obj, str);
                   DeleteAssetAction deleteAssetA2 = obj.getDeleteAssetAction();
                   a.o(deleteAssetA2, "undoAction.deleteAssetAction");
                   originalAsse = deleteAssetA2.getOriginalAssetTransitionsList();
                   a.o(originalAsse, "undoAction.deleteAssetAc¡­ginalAssetTransitionsList");
                   iterator = originalAsse.iterator();
                   while (iterator.hasNext()) {
                      uAssetTransi = iterator.next();
                      a.o(uAssetTransi, "it");
                      i2 = trackIndex - 1;
                      if (uAssetTransi.getTrackIndex() == i2) {
                         uBuilder = uoa.n(i2);
                         a.o(uBuilder, "assetDraft.getBuilder\(targetIndex - 1\)");
                         uBuilder.v(uAssetTransi.getAssetTransition());
                      }
                   }
                label_0408 :
                   return;
                }else {
                   b = uoa.p();
                   for (i1 = 0; i1 < b; i1 = i1 + 1) {
                      uBuilder1 = uoa.n(i1);
                      a.o(uBuilder1, "assetDraft.getBuilder\(index\)");
                      uBuilder1.v(TransitionEffect.Companion.b().toAssetTransition());
                   }
                }
                break;
              case 2:
                SplitAssetAction splitAssetAc = undoAction.getSplitAssetAction();
                a.o(splitAssetAc, "topUndoAction.splitAssetAction");
                trackIndex = splitAssetAc.getTrackIndex();
                int i3 = trackIndex + 1;
                TimeRange obj1 = uoa.z().get(i3);
                a.o(obj1, "assetDraft.messages[targetIndex + 1]");
                obj1 = obj1.getSelectedRange();
                GeneratedMessageLite$Builder uBuilder2 = uoa.n(trackIndex);
                a.o(uBuilder2, "assetDraft.getBuilder\(targetIndex\)");
                TimeRange selectedRang = uBuilder2.getSelectedRange();
                GeneratedMessageLite$Builder uBuilder3 = uoa.n(trackIndex);
                a.o(uBuilder3, "assetDraft.getBuilder\(targetIndex\)");
                GeneratedMessageLite$Builder uBuilder4 = selectedRang.toBuilder();
                a.o(selectedRang, "splietedAssetSelectedRange");
                a.o(obj1, "splitedSecondAssetSelectedRange");
                uBuilder4.a((selectedRang.getDuration() + obj1.getDuration()));
                uBuilder3.s(uBuilder4.build());
                if (!b) {
                   obj = uoa1.z().get((uoa1.p() - 1));
                   a.o(obj, str);
                   SplitAssetAction splitAssetAc1 = obj.getSplitAssetAction();
                   a.o(splitAssetAc1, "undoAction.splitAssetAction");
                   originalAsse = splitAssetAc1.getOriginalAssetTransitionsList();
                   a.o(originalAsse, "undoAction.splitAssetAct¡­ginalAssetTransitionsList");
                   iterator = originalAsse.iterator();
                   while (iterator.hasNext()) {
                      AssetTransitionActionData uAssetTransi1 = iterator.next();
                      a.o(uAssetTransi1, "it");
                      i2 = trackIndex - 1;
                      if (uAssetTransi1.getTrackIndex() == i2) {
                         uBuilder5 = uoa.n(i2);
                         a.o(uBuilder5, "assetDraft.getBuilder\(targetIndex - 1\)");
                         uBuilder5.v(uAssetTransi1.getAssetTransition());
                      }
                      if (uAssetTransi1.getTrackIndex() == trackIndex) {
                         uBuilder5 = uoa.n(trackIndex);
                         a.o(uBuilder5, "assetDraft.getBuilder\(targetIndex\)");
                         uBuilder5.v(uAssetTransi1.getAssetTransition());
                      }
                   }
                }else {
                   b = uoa.p();
                   for (i1 = 0; i1 < b; i1 = i1 + 1) {
                      uBuilder = uoa.n(i1);
                      a.o(uBuilder, "assetDraft.getBuilder\(index\)");
                      uBuilder.v(TransitionEffect.Companion.b().toAssetTransition());
                   }
                }
                uoa.V(i3);
                uBuilder6 = uoa.n(trackIndex);
                a.o(uBuilder6, "assetDraft.getBuilder\(targetIndex\)");
                uoa.T(uBuilder6.getFile(), uoa1);
                goto label_0408 ;
                break;
              case 3:
                AssetRangeAction assetRangeAc = undoAction.getAssetRangeAction();
                str2 = "topUndoAction.assetRangeAction";
                a.o(assetRangeAc, str2);
                trackIndex1 = assetRangeAc.getTrackIndex();
                AssetRangeAction assetRangeAc1 = undoAction.getAssetRangeAction();
                a.o(assetRangeAc1, str2);
                TimeRange originalRang = assetRangeAc1.getOriginalRange();
                if (!b) {
                   AssetRangeAction assetRangeAc2 = undoAction.getAssetRangeAction();
                   a.o(assetRangeAc2, str2);
                   originalAsse = assetRangeAc2.getOriginalAssetTransitionsList();
                   a.o(originalAsse, "topUndoAction.assetRange¡­ginalAssetTransitionsList");
                   iterator = originalAsse.iterator();
                   while (iterator.hasNext()) {
                      uAssetTransi2 = iterator.next();
                      a.o(uAssetTransi2, "it");
                      i2 = trackIndex1 - 1;
                      if (uAssetTransi2.getTrackIndex() == i2) {
                         uBuilder = uoa.n(i2);
                         a.o(uBuilder, "assetDraft.getBuilder\(targetIndex - 1\)");
                         uBuilder.v(uAssetTransi2.getAssetTransition());
                      }
                      if (uAssetTransi2.getTrackIndex() == trackIndex1) {
                         uBuilder = uoa.n(trackIndex1);
                         a.o(uBuilder, "assetDraft.getBuilder\(targetIndex\)");
                         uBuilder.v(uAssetTransi2.getAssetTransition());
                      }
                   }
                }else {
                   b = uoa.p();
                   for (; i1 < b; i1 = i1 + 1) {
                      uBuilder7 = uoa.n(i1);
                      a.o(uBuilder7, "assetDraft.getBuilder\(index\)");
                      uBuilder7.v(TransitionEffect.Companion.b().toAssetTransition());
                   }
                }
                uBuilder6 = uoa.n(trackIndex1);
                a.o(uBuilder6, "assetDraft.getBuilder\(targetIndex\)");
                TimeRange$b uob = TimeRange.newBuilder();
                a.o(originalRang, "originTimeRange");
                uob.b(originalRang.getStart());
                uob.a(originalRang.getDuration());
                uBuilder6.s(uob.build());
                goto label_0408 ;
                break;
              case 4:
                AssetSpeedAction assetSpeedAc = undoAction.getAssetSpeedAction();
                str2 = "topUndoAction.assetSpeedAction";
                a.o(assetSpeedAc, str2);
                trackIndex1 = assetSpeedAc.getEditingIndex();
                AssetSpeedAction assetSpeedAc1 = undoAction.getAssetSpeedAction();
                a.o(assetSpeedAc1, str2);
                GeneratedMessageLite$Builder uBuilder8 = uoa.n(trackIndex1);
                a.o(uBuilder8, "assetDraft.getBuilder\(targetIndex\)");
                uBuilder8.u(assetSpeedAc1.getSpeed());
                if (!b) {
                   AssetSpeedAction assetSpeedAc2 = undoAction.getAssetSpeedAction();
                   a.o(assetSpeedAc2, str2);
                   originalAsse = assetSpeedAc2.getOriginalAssetTransitionsList();
                   a.o(originalAsse, "topUndoAction.assetSpeed¡­ginalAssetTransitionsList");
                   iterator = originalAsse.iterator();
                   while (iterator.hasNext()) {
                      uAssetTransi2 = iterator.next();
                      a.o(uAssetTransi2, "it");
                      i = trackIndex1 - 1;
                      if (uAssetTransi2.getTrackIndex() == i) {
                         uBuilder = uoa.n(i);
                         a.o(uBuilder, "assetDraft.getBuilder\(targetIndex - 1\)");
                         uBuilder.v(uAssetTransi2.getAssetTransition());
                      }
                      if (uAssetTransi2.getTrackIndex() == trackIndex1) {
                         uBuilder = uoa.n(trackIndex1);
                         a.o(uBuilder, "assetDraft.getBuilder\(targetIndex\)");
                         uBuilder.v(uAssetTransi2.getAssetTransition());
                      }
                   }
                }else {
                   b = uoa.p();
                   for (; i1 < b; i1 = i1 + 1) {
                      uBuilder1 = uoa.n(i1);
                      a.o(uBuilder1, "assetDraft.getBuilder\(index\)");
                      uBuilder1.v(TransitionEffect.Companion.b().toAssetTransition());
                   }
                }
                break;
              case 5:
                AssetRotateAction assetRotateA = undoAction.getAssetRotateAction();
                a.o(assetRotateA, "topUndoAction.assetRotateAction");
                AssetRotateAction assetRotateA1 = undoAction.getAssetRotateAction();
                a.o(assetRotateA1, "topUndoAction.assetRotateAction");
                Asset$b uob1 = uoa.n(assetRotateA.getTrackIndex());
                uob1.r(assetRotateA1.getRotationDeg());
                uob1.build();
                goto label_0408 ;
                break;
              case 6:
                if (!b) {
                   AssetTransitionAction assetTransit = undoAction.getAssetTransitionAction();
                   a.o(assetTransit, "topUndoAction.assetTransitionAction");
                   originalAsse = assetTransit.getOriginalAssetTransitionsList();
                   a.o(originalAsse, "topUndoAction.assetTrans¡­ginalAssetTransitionsList");
                   iterator = originalAsse.iterator();
                   while (iterator.hasNext()) {
                      uAssetTransi = iterator.next();
                      a.o(uAssetTransi, "it");
                      uBuilder7 = uoa.n(uAssetTransi.getTrackIndex());
                      a.o(uBuilder7, "assetDraft.getBuilder\(it.trackIndex\)");
                      uBuilder7.v(uAssetTransi.getAssetTransition());
                   }
                }else {
                   b = uoa.p();
                   for (; i1 < b; i1 = i1 + 1) {
                      uBuilder1 = uoa.n(i1);
                      a.o(uBuilder1, "assetDraft.getBuilder\(index\)");
                      uBuilder1.v(TransitionEffect.Companion.b().toAssetTransition());
                   }
                }
                break;
              case 7:
                uoa.d();
                GeneratedMessageLite generatedMes1 = uoa1.y((uoa1.p() - i));
                a.o(generatedMes1, str1);
                AssetArrangeAction assetArrange = generatedMes1.getAssetArrangeAction();
                a.o(assetArrange, "assetArrangeAction");
                trackIndex = assetArrange.getOriginalAssetsList().size();
                for (int i4 = 0; i4 < trackIndex; i4 = i4 + 1) {
                   Asset uAsset = n0.d(assetArrange.getOriginalAssets(i4), uoa, i, uoa1, i1);
                   a.o(uAsset, "cloneAssetForNewClip\(ass¡­, true, undoDraft, false\)");
                   uoa.C(i4, uAsset);
                   uoa.T(uAsset.getFile(), uoa1);
                }
                break;
              default:
          }
       }
       throw new RuntimeException("undoToAssetDraft unsupported action:"+undoAction);
    }
}
