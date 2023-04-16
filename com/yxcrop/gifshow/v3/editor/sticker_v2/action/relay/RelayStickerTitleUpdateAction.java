package com.yxcrop.gifshow.v3.editor.sticker_v2.action.relay.RelayStickerTitleUpdateAction;
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
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.Sticker$Type;
import kotlin.Pair;
import java.lang.Integer;
import java.lang.Number;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.RelayStickerParam;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.RelayStickerParam$b;

public final class RelayStickerTitleUpdateAction extends EditDraftAction	// class@000a65
{
    public final boolean needCommit;
    public final String newTitle;

    public void RelayStickerTitleUpdateAction(String p0,boolean p1){
       a.p(p0, "newTitle");
       super(false, 1, null);
       this.newTitle = p0;
       this.needCommit = p1;
    }
    public final boolean getNeedCommit(){
       return this.needCommit;
    }
    public final String getNewTitle(){
       return this.newTitle;
    }
    public void performAction(c p0,c p1){
       Pair pair;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RelayStickerTitleUpdateAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.U0();
       if (uoa != null) {
          if (!uoa.D()) {
             uoa.c0();
          }
          List list = uoa.z();
          a.o(list, "messages");
          Iterator iterator = list.iterator();
          int i = 0;
          while (true) {
             if (iterator.hasNext()) {
                Object obj = iterator.next();
                Object obj1 = obj;
                a.o(obj1, "it");
                obj1 = (obj1.getStickerType() == Sticker$Type.RELAY_STICKER)? 1: null;
                if (obj1) {
                   pair = new Pair(Integer.valueOf(i), obj);
                label_0064 :
                   if (pair != null) {
                      pair = pair.getSecond();
                      a.o(pair, "stickerpair.second");
                      RelayStickerParam$b uob = pair.getRelayStickerParam().toBuilder();
                      uob.a(this.newTitle);
                      uoa.n(pair.getFirst().intValue()).g(uob);
                   }
                   if (this.needCommit != null) {
                      uoa.g(true);
                      break ;
                   }
                }else {
                   i = i + 1;
                }
             }else {
                pair = null;
                goto label_0064 ;
             }
          }
       }
       return;
    }
}
