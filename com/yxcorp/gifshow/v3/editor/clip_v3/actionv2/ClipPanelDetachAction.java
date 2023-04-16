package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.ClipPanelDetachAction;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import java.util.List;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import t36.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import maa.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset;
import com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.ClipPanelDetachAction$a;
import t36.f$a;
import yoc.f;
import kba.a;
import kotlin.Triple;
import com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.ClipPanelDetachAction$b;
import xvc.c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import com.kuaishou.edit.draft.UndoAction;
import com.kuaishou.edit.draft.UndoAction$ActionCase;
import java.util.Collection;
import qaa.a;
import wba.m;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import brd.t;
import brd.w;
import brd.a0;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.ClipPanelDetachAction$c;
import com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.ClipPanelDetachAction$d;
import erd.g;
import crd.b;
import yoc.c;
import kotlin.Pair;
import java.util.ArrayList;
import fpc.a;
import cpc.c;
import fpc.b;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import java.lang.Integer;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.e$r;
import qr4.e$h;
import ooc.j;
import java.lang.System;
import com.google.common.collect.Lists;
import java.util.Iterator;
import yoc.a;
import java.lang.Enum;
import com.kuaishou.edit.draft.AssetArrangeAction;
import com.kuaishou.edit.draft.DeleteAssetAction;
import yoc.b;
import java.lang.Runnable;
import t45.c;
import yaa.c;
import wba.u;

public final class ClipPanelDetachAction extends EditSdkAction	// class@000db1
{
    public final f listeners;
    public final Size newSize;
    public final Size oldSize;
    public final boolean savedChanges;
    public final List segmentList;
    public final double totalDuration;

    public void ClipPanelDetachAction(boolean p0,List p1,Size p2,Size p3,f p4,double p5){
       a.p(p1, "segmentList");
       a.p(p2, "oldSize");
       a.p(p3, "newSize");
       super();
       this.savedChanges = p0;
       this.segmentList = p1;
       this.oldSize = p2;
       this.newSize = p3;
       this.listeners = p4;
       this.totalDuration = p5;
    }
    public void ClipPanelDetachAction(boolean p0,List p1,Size p2,Size p3,f p4,double p5,int p6,u p7){
       f uof = (p6 & 0x10)? null: p4;
       super(p0, p1, p2, p3, uof, p5);
       return;
    }
    public final void handlePanelHideRotateChange(c p0,boolean p1,Size p2,Size p3,f p4){
       ClipPanelDetachAction uClipPanelDe = ClipPanelDetachAction.class;
       if (PatchProxy.isSupport(uClipPanelDe)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uClipPanelDe, "4")) {
             return;
          }
       }
       List list = a.c(p0).o();
       a.o(list, "getAssetDraft\(workspaceDraft\).committedMessages");
       List list1 = a.c(p0).z();
       a.o(list1, "getAssetDraft\(workspaceDraft\).messages");
       Object obj = list.get(0);
       a.o(obj, "oldAssetList[0]");
       list1 = list1.get(0);
       a.o(list1, "newAssetList[0]");
       if ((obj.getRotate() % 360) != (list1.getRotate() % 360) || (a.g(p2, p3) ^ 1)) {
          p4.s0(new ClipPanelDetachAction$a(p1));
       }
       return;
    }
    public final void notifyPanelCloseHideEvent(c p0,Size p1,Size p2,f p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ClipPanelDetachAction.class, "2")) {
          return;
       }
       this.handlePanelHideRotateChange(p0, false, p1, p2, p3);
       return;
    }
    public final void notifyPanelSaveHideEvent(c p0,Size p1,Size p2,f p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ClipPanelDetachAction.class, "3")) {
          return;
       }
       this.handlePanelHideRotateChange(p0, true, p1, p2, p3);
       Triple triple = f.a.c(a.a.u(p0));
       boolean b = triple.component2().booleanValue();
       boolean b1 = triple.component3().booleanValue();
       if (!triple.component1().booleanValue() && (b || b1)) {
          p3.s0(ClipPanelDetachAction$b.a);
       }
       return;
    }
    public void performAction(c p0,c p1){
       UndoAction undoAction;
       f a;
       int i4;
       Object[] objArray1;
       ClipPanelDetachAction listeners;
       int i5;
       UndoAction$ActionCase actionCase;
       ClipPanelDetachAction uClipPanelDe;
       c uoc1;
       boolean i6;
       int i7;
       c uoc2;
       c uoc3;
       Iterator iterator;
       Asset asset;
       String str4;
       Object obj = this;
       Object obj1 = p0;
       f obj2 = p1;
       f uof = f.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, ClipPanelDetachAction.class, "1")) {
          return;
       }
       String str = "workspaceDraft";
       a.p(obj1, str);
       a.p(obj2, "store");
       super.performAction(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       String str1 = "ClipPanelDetachAction";
       a.D().w(str1, "performAction savedChanges:"+obj.savedChanges, objArray);
       int i1 = 4;
       f obj3 = null;
       int i2 = -1;
       int i3 = 1;
       if (obj.savedChanges != null) {
          obj2 = f.a;
          Objects.requireNonNull(obj2);
          undoAction = PatchProxy.applyOneRefs(obj1, obj2, uof, "13");
          if (undoAction != patchProxyRe) {
          }else {
             a.p(obj1, str);
             i4 = a.a.u(obj1).p();
             if (i4 > 0) {
                i4 = i4 + i2;
                while (true) {
                   if (i4 >= 0) {
                      a a2 = a.a;
                      Object obj5 = a2.u(obj1).z().get(i4);
                      a.o(obj5, "getUndoDraft\(workspaceDraft\).messages[index]");
                      if (obj5.getActionCase() != UndoAction$ActionCase.ASSET_ROTATE_ACTION) {
                         undoAction = a2.u(obj1).z().get(i4);
                      }else {
                         i4 = i4 - 1;
                      }
                   }
                }
             }
             undoAction = obj3;
          }
          a = f.a;
          a uoa = a.a.u(obj1);
          Objects.requireNonNull(a);
          UndoAction undoAction1 = PatchProxy.applyOneRefs(uoa, a, uof, "14");
          if (undoAction1 != patchProxyRe) {
          }else {
             a.p(uoa, "undoDraft");
             List list2 = uoa.o();
             a.o(list2, "undoDraft.committedMessages");
             i5 = list2.size();
             if (i5 > 0) {
                i5 = i5 + i2;
                while (true) {
                   if (i5 >= 0) {
                      Object obj4 = uoa.o().get(i5);
                      a.o(obj4, "undoDraft.committedMessages[index]");
                      if (obj4.getActionCase() != UndoAction$ActionCase.ASSET_ROTATE_ACTION) {
                         undoAction1 = uoa.o().get(i5);
                      }else {
                         i5 = i5 - 1;
                      }
                   }
                }
             }
             undoAction1 = obj3;
          }
          i4 = a.g(undoAction, undoAction1) ^ i3;
          objArray1 = new Object[i];
          a.D().w(str1, "performAction clearCover:"+i4, objArray1);
          if (i4) {
             a.f(p0).c0();
             m.b(a.f(p0), i3, i, i1, obj3);
             a.f(p0).f();
          }
          a.c(p0).f();
          a.a.u(obj1).f();
          DraftFileManager uDraftFileMa = DraftFileManager.E();
          Objects.requireNonNull(uDraftFileMa);
          t ot = PatchProxy.applyOneRefs(obj1, uDraftFileMa, DraftFileManager.class, "52");
          if (ot != patchProxyRe) {
          }else {
             ot = uDraftFileMa.s(obj1, i, i3);
          }
          a0.z(ot).G(d.a).R(ClipPanelDetachAction$c.b, ClipPanelDetachAction$d.b);
          listeners = obj.listeners;
          if (listeners != null) {
             obj.notifyPanelSaveHideEvent(obj1, obj.oldSize, obj.newSize, listeners);
          }
       }else {
          a.c(p0).j();
          a.a.u(obj1).j();
          listeners = obj.listeners;
          if (listeners != null) {
             obj.notifyPanelCloseHideEvent(obj1, obj.oldSize, obj.newSize, listeners);
          }
       }
       a uoa1 = p0.c1();
       if (uoa1 != null) {
          List list = uoa1.z();
          if (list != null) {
             i4 = list.size();
          label_0196 :
             i5 = 0;
             a uoa2 = null;
             while (i5 < i4) {
                uoa2 = p0.c1();
                if (uoa2 != null) {
                   List list1 = uoa2.z();
                   if (list1 != null) {
                      UndoAction undoAction2 = list1.get(i5);
                      if (undoAction2 != null) {
                         actionCase = undoAction2.getActionCase();
                      label_01b4 :
                         uoa2 = (actionCase == UndoAction$ActionCase.ASSET_ARRANGE_ACTION)? 1: null;
                         if (uoa2) {
                         }
                      }
                   }
                }
                actionCase = obj3;
                goto label_01b4 ;
                i5 = i5 + 1;
             }
             a uoa3 = uoa2;
             c a1 = c.a;
             ClipPanelDetachAction segmentList = obj.segmentList;
             Objects.requireNonNull(a1);
             c uoc = c.class;
             if (PatchProxy.isSupport(uoc)) {
                p1 = uoc;
                uClipPanelDe = segmentList;
                uoc1 = a1;
                if (!PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(uoa3), segmentList, a1, c.class, "1")) {
                label_01f3 :
                   a.p(obj1, str);
                   String str2 = "segmentList";
                   a.p(uClipPanelDe, str2);
                   obj3 = f.a;
                   Triple triple = obj3.c(a.a.u(obj1));
                   boolean b = triple.component1().booleanValue();
                   boolean b1 = triple.component2().booleanValue();
                   i5 = triple.component3().booleanValue();
                   Pair pair = PatchProxy.applyOneRefs(uClipPanelDe, obj3, uof, "15");
                   if (pair != patchProxyRe) {
                   }else {
                      a.p(uClipPanelDe, str2);
                      ArrayList uArrayList1 = new ArrayList();
                      int i8 = uClipPanelDe.size();
                      int i9 = 0;
                      i6 = true;
                      int i10 = -1;
                      while (i9 < i8) {
                         i7 = uClipPanelDe.size() - i3;
                         if (i9 != i7 && c.a(uClipPanelDe.get(i9))) {
                            i7 = i9 + 1;
                            if (c.a(uClipPanelDe.get(i7))) {
                               if (i10 < 0) {
                                  i10 = uClipPanelDe.get(i9).s().a().getMLogId();
                               }
                               i7 = i10;
                               if (uClipPanelDe.get(i9).s().a().getMLogId() == TransitionEffect.Companion.b().getMLogId()) {
                                  i6 = false;
                               }else {
                                  uArrayList1.add(Integer.valueOf(uClipPanelDe.get(i9).s().a().getMLogId()));
                               }
                               i10 = i7;
                               if (uClipPanelDe.get(i9).s().a().getMLogId() != i7) {
                                  i6 = false;
                               }
                            }
                         }
                         i9 = i9 + 1;
                         i3 = 1;
                      }
                      pair = new Pair(Boolean.valueOf(i6), uArrayList1);
                   }
                   i4 = pair.getFirst().booleanValue();
                   int[] ointArray = CollectionsKt___CollectionsKt.F5(pair.getSecond());
                   i6 = 3;
                   i7 = 6;
                   i2 = 5;
                   if (PatchProxy.isSupport(p1)) {
                      objArray1 = new Object[]{obj1,Boolean.valueOf(b),Boolean.valueOf(b1),Boolean.valueOf(i5),Boolean.valueOf(i4),ointArray,Boolean.valueOf(uoa3)};
                      uoc2 = p1;
                      uoc3 = uoc1;
                      if (!PatchProxy.applyVoid(objArray1, uoc3, uoc2, "2")) {
                      label_0334 :
                         VideoContext videoContext = p0.d1();
                         Objects.requireNonNull(videoContext);
                         if (PatchProxy.isSupport(VideoContext.class)) {
                            Object[] objArray2 = new Object[i7];
                            objArray2[i] = Boolean.valueOf(b);
                            objArray2[1] = Boolean.valueOf(b1);
                            objArray2[2] = Boolean.valueOf(i5);
                            objArray2[3] = Boolean.valueOf(i4);
                            objArray2[4] = ointArray;
                            objArray2[5] = Boolean.valueOf(uoa3);
                            if (PatchProxy.apply(objArray2, videoContext, VideoContext.class, "86") != patchProxyRe) {
                            }
                         }
                         VideoContext.b();
                         videoContext.a.d.y = new e$r();
                         e$h y = videoContext.a.d.y;
                         y.a = b;
                         y.b = b1;
                         y.c = i5;
                         y.d = i4;
                         y.e = ointArray;
                         y.f = uoa3;
                      }
                   }else {
                      uoc2 = p1;
                      uoc3 = uoc1;
                      goto label_0334 ;
                   }
                   j.a(p0);
                   if (!PatchProxy.applyVoidOneRefs(obj1, uoc3, uoc2, "3")) {
                      long l = System.currentTimeMillis();
                      ArrayList uArrayList = Lists.b();
                      a.o(uArrayList, "Lists.newArrayList\(\)");
                      if (!PatchProxy.applyVoidTwoRefs(obj1, uArrayList, uoc3, uoc2, "4")) {
                         iterator = a.c(p0).z().iterator();
                         while (iterator.hasNext()) {
                            asset = iterator.next();
                            a.o(asset, "asset");
                            str4 = uoc3.a(asset);
                            if (str4 != null && !uArrayList.contains(str4)) {
                               uArrayList.add(str4);
                            }else {
                               continue ;
                            }
                         }
                      }
                      if (!PatchProxy.applyVoidTwoRefs(obj1, uArrayList, uoc3, uoc2, "5")) {
                         iterator = a.a.u(obj1).z().iterator();
                         while (iterator.hasNext()) {
                            UndoAction undoAction3 = iterator.next();
                            a.o(undoAction3, "undoAction");
                            UndoAction$ActionCase actionCase1 = undoAction3.getActionCase();
                            if (actionCase1 == null) {
                               continue ;
                            }else {
                               i6 = a.a[actionCase1.ordinal()];
                               if (i6 != 1) {
                                  if (i6 != 2) {
                                  }else {
                                     AssetArrangeAction assetArrange = undoAction3.getAssetArrangeAction();
                                     a.o(assetArrange, "undoAction.assetArrangeAction");
                                     Iterator iterator1 = assetArrange.getOriginalAssetsList().iterator();
                                     while (iterator1.hasNext()) {
                                        Asset uAsset = iterator1.next();
                                        a.o(uAsset, "asset");
                                        String str3 = uoc3.a(uAsset);
                                        if (str3 != null && !uArrayList.contains(str3)) {
                                           uArrayList.add(str3);
                                        }else {
                                           continue ;
                                        }
                                     }
                                  }
                               }else {
                                  DeleteAssetAction deleteAssetA = undoAction3.getDeleteAssetAction();
                                  a.o(deleteAssetA, "undoAction.deleteAssetAction");
                                  asset = deleteAssetA.getAsset();
                                  a.o(asset, "undoAction.deleteAssetAction.asset");
                                  str4 = uoc3.a(asset);
                                  if (str4 != null && !uArrayList.contains(str4)) {
                                     uArrayList.add(str4);
                                     continue ;
                                  }else {
                                     continue ;
                                  }
                               }
                            }
                         }
                      }
                      c.a(new b(uArrayList, obj1, l));
                   }
                }
             }else {
                p1 = uoc;
                uClipPanelDe = segmentList;
                uoc1 = a1;
                goto label_01f3 ;
             }
             u.s(p0.J0(), obj.totalDuration);
             return;
          }
       }
       i4 = 0;
       goto label_0196 ;
    }
}
