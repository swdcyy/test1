package com.yxcrop.gifshow.v3.editor.text_v2_share.action.DecorationMoveEndAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import tmd.a;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Float;
import java.util.List;
import wba.l0;
import faa.a;
import w46.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import hba.a;
import wnd.h;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;

public final class DecorationMoveEndAction extends EditDraftAction	// class@000b70
{
    public final boolean commit;
    public final boolean isSticker;
    public final boolean isSubtitle;
    public final int layerIndex;
    public final float x;
    public final float y;

    public void DecorationMoveEndAction(int p0,boolean p1,boolean p2,float p3,float p4,boolean p5){
       super(false, 1, null);
       this.layerIndex = p0;
       this.isSubtitle = p1;
       this.isSticker = p2;
       this.x = p3;
       this.y = p4;
       this.commit = p5;
    }
    public void DecorationMoveEndAction(int p0,boolean p1,boolean p2,float p3,float p4,boolean p5,int p6,u p7){
       boolean b = (p6 & 0x04)? false: p2;
       super(p0, p1, b, p3, p4, p5);
       return;
    }
    public void performAction(c p0,c p1){
       a uoa;
       a a;
       DecorationMoveEndAction tlayerIndex;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationMoveEndAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       int i = 0;
       if (this.isSticker != null) {
          uoa = p0.U0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.stickerDraft ?: return");
             if (!uoa.D()) {
                uoa.c0();
             }
             a = a.a;
             tlayerIndex = this.layerIndex;
             DecorationMoveEndAction tx = this.x;
             DecorationMoveEndAction ty = this.y;
             Objects.requireNonNull(a);
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(tlayerIndex), uoa, Float.valueOf(tx), Float.valueOf(ty), a, a.class, "1")) {
                a.p(uoa, "stickerDraft");
                if (uoa.z().size()) {
                   int i1 = l0.a.a(tlayerIndex, uoa);
                   if (i1 < 0) {
                      Object[] objArray = new Object[i];
                      a.D().t("StickerDraftUtils", "updateStickerDraftPositionByIndex stickerDraftPosition is invalid", objArray);
                   }else {
                      GeneratedMessageLite$Builder uBuilder = uoa.n(i1);
                      a.o(uBuilder, "stickerDraft.getBuilder\(index\)");
                      StickerResult$b uob = uBuilder.getResult().toBuilder();
                      a.o(uob, "stickerResultBuilder");
                      uob.f(tx);
                      uob.g(ty);
                      uob.build();
                      uBuilder.h(uob);
                      uBuilder.build();
                   }
                }
             }
             if (this.commit != null) {
                uoa.f();
             }
          }else {
             return;
          }
       }else {
          uoa = p0.W0();
          if (uoa != null) {
             a.o(uoa, "workspaceDraft.textDraft ?: return");
             if (!uoa.D()) {
                uoa.c0();
             }
             tlayerIndex = this.layerIndex;
             DecorationMoveEndAction tisSubtitle = this.isSubtitle;
             DecorationMoveEndAction tx1 = this.x;
             DecorationMoveEndAction ty1 = this.y;
             if (PatchProxy.isSupport(h.class)) {
                Object[] objArray1 = new Object[]{Integer.valueOf(tlayerIndex),Boolean.valueOf(tisSubtitle),uoa,Float.valueOf(tx1),Float.valueOf(ty1)};
                if (!PatchProxy.applyVoid(objArray1, null, h.class, "33")) {
                label_0104 :
                   a.p(uoa, "textDraft");
                   if (tisSubtitle != null) {
                      Iterator iterator = h.j(uoa).iterator();
                      while (iterator.hasNext()) {
                         h.s(iterator.next().intValue(), uoa, tx1, ty1);
                      }
                   }else {
                      h.s(tlayerIndex, uoa, tx1, ty1);
                   }
                }
             }else {
                goto label_0104 ;
             }
             if (this.commit != null) {
                uoa.f();
             }
          }
       }
       return;
    }
}
