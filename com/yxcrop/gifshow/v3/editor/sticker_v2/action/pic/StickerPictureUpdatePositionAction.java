package com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.StickerPictureUpdatePositionAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import rmd.c;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Float;
import wba.l0;
import faa.a;
import w46.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import java.lang.Iterable;

public final class StickerPictureUpdatePositionAction extends EditDraftAction	// class@000a61
{
    public final int layerIndex;
    public final float moveX;
    public final float moveY;
    public final List newIdentifyList;
    public final float translateScale;

    public void StickerPictureUpdatePositionAction(int p0,float p1,float p2,float p3,List p4){
       a.p(p4, "newIdentifyList");
       super(false, 1, null);
       this.layerIndex = p0;
       this.moveX = p1;
       this.moveY = p2;
       this.translateScale = p3;
       this.newIdentifyList = p4;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickerPictureUpdatePositionAction.class, "1")) {
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
          StickerPictureUpdatePositionAction tlayerIndex = this.layerIndex;
          StickerPictureUpdatePositionAction tmoveX = this.moveX;
          StickerPictureUpdatePositionAction tmoveY = this.moveY;
          StickerPictureUpdatePositionAction ttranslateSc = this.translateScale;
          StickerPictureUpdatePositionAction tnewIdentify = this.newIdentifyList;
          Objects.requireNonNull(p1);
          c uoc = c.class;
          if (PatchProxy.isSupport(uoc)) {
             Object[] objArray = new Object[]{uoa,Integer.valueOf(tlayerIndex),Float.valueOf(tmoveX),Float.valueOf(tmoveY),Float.valueOf(ttranslateSc),tnewIdentify};
             if (!PatchProxy.applyVoid(objArray, p1, uoc, "14")) {
             label_0071 :
                a.p(uoa, "stickerDraft");
                a.p(tnewIdentify, "newIdentifyList");
                if (uoa.z().size()) {
                   int i = l0.a.a(tlayerIndex, uoa);
                   if (i < 0) {
                      Object[] objArray1 = new Object[0];
                      a.D().t("NewStickerDraftUtils", "updatePicturePosition stickerDraftPosition is invalid", objArray1);
                   }else {
                      GeneratedMessageLite$Builder uBuilder = uoa.n(i);
                      a.o(uBuilder, "stickerDraft.getBuilder\(index\)");
                      StickerResult$b uob = uBuilder.getResult().toBuilder();
                      a.o(uob, "stickerResultBuilder");
                      uob.f(tmoveX);
                      uob.g(tmoveY);
                      uob.t((uob.getScale() * ttranslateSc));
                      uob.c();
                      uob.a(tnewIdentify);
                      uob.build();
                      uBuilder.h(uob);
                      uBuilder.build();
                   }
                }
             }
          }else {
             goto label_0071 ;
          }
          uoa.f();
       }
       return;
    }
}
