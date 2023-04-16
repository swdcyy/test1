package com.yxcrop.gifshow.v3.editor.text_v2.action.pic.PictureUpdatePositionAction;
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
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wnd.h;
import java.lang.Integer;
import java.lang.Float;
import wba.l0;
import faa.a;
import w46.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import java.lang.Iterable;

public final class PictureUpdatePositionAction extends EditDraftAction	// class@000b1d
{
    public final int layerIndex;
    public final float moveX;
    public final float moveY;
    public final List newIdentifyList;

    public void PictureUpdatePositionAction(int p0,float p1,float p2,List p3){
       a.p(p3, "newIdentifyList");
       super(false, 1, null);
       this.layerIndex = p0;
       this.moveX = p1;
       this.moveY = p2;
       this.newIdentifyList = p3;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PictureUpdatePositionAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
          PictureUpdatePositionAction tlayerIndex = this.layerIndex;
          PictureUpdatePositionAction tmoveX = this.moveX;
          PictureUpdatePositionAction tmoveY = this.moveY;
          PictureUpdatePositionAction tnewIdentify = this.newIdentifyList;
          h oh = h.class;
          if (PatchProxy.isSupport(oh)) {
             Object[] objArray = new Object[]{uoa,Integer.valueOf(tlayerIndex),Float.valueOf(tmoveX),Float.valueOf(tmoveY),tnewIdentify};
             if (!PatchProxy.applyVoid(objArray, null, oh, "37")) {
             label_0064 :
                a.p(uoa, "textDraft");
                a.p(tnewIdentify, "newIdentifyList");
                if (uoa.z().size()) {
                   int i = l0.a.a(tlayerIndex, uoa);
                   if (i < 0) {
                      Object[] objArray1 = new Object[0];
                      a.D().t("TextDraftUtil", "updateTextFont textDraftPosition is invalid", objArray1);
                   }else {
                      GeneratedMessageLite$Builder uBuilder = uoa.n(i);
                      a.o(uBuilder, "textDraft.getBuilder\(index\)");
                      StickerResult$b uob = uBuilder.getResult().toBuilder();
                      a.o(uob, "stickerBuilder");
                      uob.f(tmoveX);
                      uob.g(tmoveY);
                      uob.c();
                      uob.a(tnewIdentify);
                      uob.build();
                      uBuilder.j(uob);
                      uBuilder.build();
                   }
                }
             }
          }else {
             goto label_0064 ;
          }
          uoa.f();
       }
       return;
    }
}
