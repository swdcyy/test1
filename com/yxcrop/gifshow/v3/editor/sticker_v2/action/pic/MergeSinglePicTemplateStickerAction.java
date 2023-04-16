package com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.MergeSinglePicTemplateStickerAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import lwc.h;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import wba.z;
import lnc.i1;
import java.lang.Boolean;
import com.kuaishou.edit.draft.Workspace$Type;
import eba.a;
import com.kuaishou.edit.draft.Sticker;
import java.lang.Integer;
import java.lang.Float;
import com.kuaishou.edit.draft.StickerResult;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Sticker$b;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import java.util.List;
import pwc.a;
import java.util.Collection;
import android.util.Pair;
import xvc.c;
import faa.a;
import q87.c;
import java.util.Iterator;
import java.lang.Iterable;
import wnd.e;
import java.util.ArrayList;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.MergeSinglePicTemplateStickerAction$a;
import java.util.Comparator;
import trd.x;

public final class MergeSinglePicTemplateStickerAction extends EditDraftAction	// class@000a5e
{
    public final h editorPreviewViewModel;
    public final c templateDraft;

    public void MergeSinglePicTemplateStickerAction(h p0,c p1){
       a.p(p0, "editorPreviewViewModel");
       a.p(p1, "templateDraft");
       super(false, 1, null);
       this.editorPreviewViewModel = p0;
       this.templateDraft = p1;
    }
    public final h getEditorPreviewViewModel(){
       return this.editorPreviewViewModel;
    }
    public final c getTemplateDraft(){
       return this.templateDraft;
    }
    public final float getTemplateTransScale(c p0){
       Size obj = PatchProxy.applyOneRefs(p0, this, MergeSinglePicTemplateStickerAction.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       int i = 0;
       Size size = z.r(p0, i);
       Size b = size.b;
       if (b > null && size.c > null) {
          size = this.editorPreviewViewModel.C0(i);
          obj = this.editorPreviewViewModel.v0(i);
          if (b >= null && obj.b > null) {
             size = size.b;
             if (size > null) {
                return ((((float)size * 0x3f800000) / (float)b) * 0x3f800000);
             }
          }
          i1.a("MergeTemplateStickerAction", "template size error");
       }
       return 0x3f800000;
    }
    public final boolean isSinglePicture(){
       Object obj = PatchProxy.apply(null, this, MergeSinglePicTemplateStickerAction.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.editorPreviewViewModel.G0().a1() == Workspace$Type.SINGLE_PICTURE)? true: false;
       return b;
    }
    public final void mergeSticker(c p0,a p1,Sticker p2,int p3,float p4){
       MergeSinglePicTemplateStickerAction mergeSingleP = MergeSinglePicTemplateStickerAction.class;
       if (PatchProxy.isSupport(mergeSingleP)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, mergeSingleP, "3")) {
             return;
          }
       }
       File uFile = DraftUtils.t(p2.getResult(), p0.U0());
       if (uFile != null) {
          a.o(uFile, "DraftUtils.getEffectiveS\x20\x02e.stickerDraft\) ?: return\x00");
          GeneratedMessageLite$Builder uBuilder = p1.b();
          a.o(uBuilder, "stickerDraft.append\(\)");
          uBuilder.mergeFrom(p2);
          uBuilder.m(1);
          StickerResult$b uob = uBuilder.getResult().toBuilder();
          a.o(uob, "resultBuilder");
          uob.w(p3);
          uob.m(p1.Q(uFile.getAbsolutePath()));
          uob.t((uob.getScale() * p4));
          if (this.isSinglePicture()) {
             List list = a.c(this.editorPreviewViewModel.G0());
             if (list.isEmpty() ^ 1) {
                uob.c();
                uob.b(list.get(0).first);
             }
          }
          uBuilder.i(uob.build());
       }
       return;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MergeSinglePicTemplateStickerAction.class, "1")) {
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
          a uoa1 = this.templateDraft.U0();
          if (uoa1 != null) {
             Object[] objArray = new Object[0];
             a.D().w("MergeTemplateStickerAction", "mergeStickerDraft", objArray);
             a.o(uoa1, "sourceStickerDraft");
             Iterator iterator = this.sortStickerList(uoa1).iterator();
             while (iterator.hasNext()) {
                this.mergeSticker(this.templateDraft, uoa, iterator.next(), e.a(), this.getTemplateTransScale(this.templateDraft));
             }
          }
       }
       return;
    }
    public final List sortStickerList(a p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, MergeSinglePicTemplateStickerAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       List list = p0.z();
       a.o(list, "stickerDraft.messages");
       obj.addAll(list);
       if (obj.size() > 1) {
          x.p0(obj, new MergeSinglePicTemplateStickerAction$a());
       }
       return obj;
    }
}
