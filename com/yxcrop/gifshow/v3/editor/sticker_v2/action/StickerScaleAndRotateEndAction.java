package com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerScaleAndRotateEndAction;
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
import rmd.c;
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
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.Sticker$Type;
import com.yxcorp.gifshow.edit.draft.DraftUtils;

public final class StickerScaleAndRotateEndAction extends EditDraftAction	// class@000a54
{
    public final float additionScale;
    public final boolean commit;
    public final int layerIndex;
    public final float rotate;
    public final float scale;

    public void StickerScaleAndRotateEndAction(int p0,float p1,float p2,float p3,boolean p4){
       super(false, 1, null);
       this.layerIndex = p0;
       this.scale = p1;
       this.additionScale = p2;
       this.rotate = p3;
       this.commit = p4;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickerScaleAndRotateEndAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.U0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.stickerDraft ?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
          p1 = c.a;
          StickerScaleAndRotateEndAction tlayerIndex = this.layerIndex;
          StickerScaleAndRotateEndAction tscale = this.scale;
          StickerScaleAndRotateEndAction tadditionSca = this.additionScale;
          StickerScaleAndRotateEndAction trotate = this.rotate;
          Objects.requireNonNull(p1);
          c uoc = c.class;
          if (PatchProxy.isSupport(uoc)) {
             Object[] objArray = new Object[]{Integer.valueOf(tlayerIndex),uoa,Float.valueOf(tscale),Float.valueOf(tadditionSca),Float.valueOf(trotate)};
             if (!PatchProxy.applyVoid(objArray, p1, uoc, "15")) {
             label_006c :
                a.p(uoa, "stickerDraft");
                if (uoa.z().size()) {
                   int i = l0.a.a(tlayerIndex, uoa);
                   if (i < 0) {
                      Object[] objArray1 = new Object[0];
                      a.D().t("NewStickerDraftUtils", "updateStickerDraftScaleByIndex stickerDraftPosition is invalid", objArray1);
                   }else {
                      GeneratedMessageLite$Builder uBuilder = uoa.n(i);
                      a.o(uBuilder, "stickerDraft.getBuilder\(index\)");
                      StickerResult$b uob = uBuilder.getResult().toBuilder();
                      if (DraftUtils.Q(uBuilder.instance.getStickerType())) {
                         a.o(uob, "stickerResultBuilder");
                         uob.v(tscale);
                      }else {
                         a.o(uob, "stickerResultBuilder");
                         uob.t(tscale);
                         uob.v(tadditionSca);
                      }
                      uob.s(trotate);
                      uob.build();
                      uBuilder.h(uob);
                      uBuilder.build();
                   }
                }
             }
          }else {
             goto label_006c ;
          }
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
