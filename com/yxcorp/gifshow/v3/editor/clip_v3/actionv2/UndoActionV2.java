package com.yxcorp.gifshow.v3.editor.clip_v3.actionv2.UndoActionV2;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.kuaishou.edit.draft.UndoAction$ActionCase;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zoc.a;
import java.lang.Enum;
import lnc.a1;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import xvc.o;
import maa.a;
import haa.a;
import kba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import yoc.m;
import xvc.b;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.UndoAction;
import nsd.u;
import com.kuaishou.edit.draft.AssetRangeAction;
import com.kuaishou.edit.draft.TimeRange;
import java.util.List;
import com.kuaishou.edit.draft.Asset;
import yoc.j;
import com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.CharSequence;
import e17.i;

public final class UndoActionV2 extends EditSdkAction	// class@000dc6
{

    public void UndoActionV2(){
       super();
    }
    public final String getUndoToastString(UndoAction$ActionCase p0){
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, this, UndoActionV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       switch (a.c[p0.ordinal()]){
           case 1:
             str = a1.p(R.string.arg_RES_7f1005f0);
             a.o(str, "CommonUtil.string\(R.string.clip_undo_delete\)");
             break;
           case 2:
             str = a1.p(R.string.arg_RES_7f1005f1);
             a.o(str, "CommonUtil.string\(R.string.clip_undo_divide\)");
             break;
           case 3:
             str = a1.p(R.string.arg_RES_7f1005ef);
             a.o(str, "CommonUtil.string\(R.stri¡­clip_undo_adjust_segment\)");
             break;
           case 4:
             str = a1.p(R.string.arg_RES_7f1005f2);
             a.o(str, "CommonUtil.string\(R.string.clip_undo_transition\)");
             break;
           case 5:
             str = a1.p(R.string.arg_RES_7f100cbf);
             a.o(str, "CommonUtil.string\(R.string.edit_undo_speed\)");
             break;
           case 6:
             str = a1.p(R.string.arg_RES_7f100cbe);
             a.o(str, "CommonUtil.string\(R.string.edit_undo_rotate\)");
             break;
           case 7:
             str = a1.p(R.string.arg_RES_7f100cbd);
             a.o(str, "CommonUtil.string\(R.string.edit_undo_arrange\)");
             break;
           default:
             str = "";
       }
       return str;
    }
    public o performActionWithPop(c p0,c p1){
       o oo;
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, UndoActionV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       a uoa = a.c(p0);
       obj = a.a.u(p0);
       int i = 3;
       if (!obj.p()) {
          m.d(5);
          this.setActionCode(i);
          return null;
       }else {
          UndoAction undoAction = obj.y((obj.p() - 1));
          a.o(undoAction, "undoMessage");
          UndoAction$ActionCase actionCase = undoAction.getActionCase();
          if (actionCase != null) {
             switch (a.a[actionCase.ordinal()]){
                 case 1:
                   m.d(1);
                   break;
                 case 2:
                   m.d(2);
                   break;
                 case 3:
                   m.d(4);
                   break;
                 case 4:
                   m.d(6);
                   break;
                 case 5:
                   m.d(7);
                   break;
                 case 6:
                   m.d(i);
                   break;
                 case 7:
                   m.d(8);
                   break;
                 default:
             }
          }
          UndoAction$ActionCase actionCase1 = undoAction.getActionCase();
          if (actionCase1 == null || a.b[actionCase1.ordinal()] != 1) {
             oo = new o(undoAction, 0, false, null, 14, null);
          }else {
             AssetRangeAction assetRangeAc = undoAction.getAssetRangeAction();
             a.o(assetRangeAc, "undoMessage.assetRangeAction");
             TimeRange originalRang = assetRangeAc.getOriginalRange();
             AssetRangeAction assetRangeAc1 = undoAction.getAssetRangeAction();
             a.o(assetRangeAc1, "undoMessage.assetRangeAction");
             uoa = uoa.z().get(assetRangeAc1.getTrackIndex());
             a.o(uoa, "assetDraft.messages[index]");
             TimeRange selectedRang = uoa.getSelectedRange();
             a.o(originalRang, "originRange");
             double start = originalRang.getStart();
             a.o(selectedRang, "nowRange");
             oo = new o(undoAction, 0, (j.a(start, selectedRang.getStart()) ^ 0x01), null, 10, null);
          }
          try{
             ClipUtils.c.h(p0);
          }catch(java.lang.IndexOutOfBoundsException e12){
             PostUtils.D("UndoActionV2", "performActionWithPop", e12);
          }
          UndoAction$ActionCase actionCase2 = undoAction.getActionCase();
          a.o(actionCase2, "undoMessage.actionCase");
          i.d(R.style.arg_RES_7f11066a, this.getUndoToastString(actionCase2));
          obj.V((obj.p() - 1));
          return uoa;
       }
    }
}
