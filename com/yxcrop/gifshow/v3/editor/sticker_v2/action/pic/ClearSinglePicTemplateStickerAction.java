package com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.ClearSinglePicTemplateStickerAction;
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
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Sticker;
import java.lang.Integer;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Set;

public final class ClearSinglePicTemplateStickerAction extends EditDraftAction	// class@000a5a
{

    public void ClearSinglePicTemplateStickerAction(){
       super(false, 1, null);
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClearSinglePicTemplateStickerAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.U0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.stickerDraft ?: return");
          boolean b = uoa.D();
          if (!b) {
             uoa.c0();
          }
          HashSet hashSet = new HashSet();
          List list = uoa.z();
          a.o(list, "stickerDraft.messages");
          Iterator iterator = list.iterator();
          int i = 0;
          int i1 = 0;
          while (iterator.hasNext()) {
             Sticker sticker = iterator.next();
             a.o(sticker, "it");
             if (sticker.getTemplateSticker()) {
                hashSet.add(Integer.valueOf(i1));
             }
             i1 = i1 + 1;
          }
          Object[] objArray = new Object[i];
          a.D().w("ClearTemplateStickerAction", "ClearTemplateStickerAction: removeTemplateSticker size = "+hashSet.size(), objArray);
          uoa.X(hashSet);
          if (!b) {
             uoa.f();
          }
       }
       return;
    }
}
