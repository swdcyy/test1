package com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.ClearTemplateStickerAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eba.a;
import haa.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.StickerResult;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Integer;
import java.util.Collection;
import java.util.Set;

public final class ClearTemplateStickerAction extends EditDraftAction	// class@000a5b
{
    public final String assetIdentifier;

    public void ClearTemplateStickerAction(String p0){
       a.p(p0, "assetIdentifier");
       super(false, 1, null);
       this.assetIdentifier = p0;
    }
    public final String getAssetIdentifier(){
       return this.assetIdentifier;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClearTemplateStickerAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = a.q(p0);
       boolean b = uoa.D();
       if (!b) {
          uoa.c0();
       }
       List list = uoa.z();
       a.o(list, "stickerDraft.messages");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = list.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          StickerResult obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          a.o(obj, "sticker");
          Integer integer = null;
          if (obj.getTemplateSticker()) {
             obj = obj.getResult();
             a.o(obj, "sticker.result");
             List assetIdentif = obj.getAssetIdentifierList();
             a.o(assetIdentif, "sticker.result.assetIdentifierList");
             String str = CollectionsKt___CollectionsKt.p2(assetIdentif);
             if (str != null && StringsKt__StringsKt.O2(str, this.assetIdentifier, false, 2, integer) == true) {
                integer = Integer.valueOf(i);
             }
          }
          if (integer != null) {
             uArrayList.add(integer);
          }
          i = i1;
       }
       if (uArrayList.isEmpty() ^ 1) {
          uoa.X(CollectionsKt___CollectionsKt.L5(uArrayList));
       }
       if (!b) {
          uoa.f();
       }
       return;
    }
}
