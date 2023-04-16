package com.yxcrop.gifshow.v3.editor.sticker_v2.action.UpdateStickerTextAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.Sticker$Type;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.TagStickerParam$b;
import com.kuaishou.edit.draft.TagStickerParam;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.VoteStickerParam$b;
import com.kuaishou.edit.draft.VoteStickerParam;
import java.util.Collection;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.a1;

public final class UpdateStickerTextAction extends EditDraftAction	// class@000a57
{
    public final boolean commit;
    public final String tagText;
    public final int textRelatedStickerType;
    public final List voteOptionList;
    public final String voteQuestion;

    public void UpdateStickerTextAction(String p0,List p1,String p2,int p3,boolean p4){
       a.p(p1, "voteOptionList");
       super(false, 1, null);
       this.voteQuestion = p0;
       this.voteOptionList = p1;
       this.tagText = p2;
       this.textRelatedStickerType = p3;
       this.commit = p4;
    }
    public void performAction(c p0,c p1){
       GeneratedMessageLite$Builder uBuilder;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UpdateStickerTextAction.class, "1")) {
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
          List list = uoa.z();
          a.o(list, "stickerDraft.messages");
          int i = 0;
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             int i1 = i + 1;
             if (i < 0) {
                CollectionsKt__CollectionsKt.W();
             }
             a.o(obj, "it");
             if (obj.getStickerType() == Sticker$Type.VOTE_STICKER && this.textRelatedStickerType == 1) {
                uBuilder = uoa.n(i);
                a.o(uBuilder, "stickerDraft.getBuilder\(index\)");
                this.updateVoteStickerParam(uBuilder, this.voteQuestion, this.voteOptionList);
             }
             if (obj.getStickerType() == Sticker$Type.VOTE_STICKER_THREE && this.textRelatedStickerType == 2) {
                uBuilder = uoa.n(i);
                a.o(uBuilder, "stickerDraft.getBuilder\(index\)");
                this.updateVoteStickerParam(uBuilder, this.voteQuestion, this.voteOptionList);
             }
             if (obj.getStickerType() == Sticker$Type.TAG_STICKER && this.textRelatedStickerType == 3) {
                GeneratedMessageLite$Builder uBuilder1 = uoa.n(i);
                a.o(uBuilder1, "stickerDraft.getBuilder\(index\)");
                this.updateTagStickerParam(uBuilder1, this.tagText);
             }
             i = i1;
          }
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
    public final void updateTagStickerParam(Sticker$b p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, UpdateStickerTextAction.class, "3")) {
          return;
       }
       TagStickerParam$b uob = TagStickerParam.newBuilder();
       if (p1 != null) {
          a.o(uob, "tagParamBuilder");
          uob.a(p1);
       }
       p0.l(uob.build());
       return;
    }
    public final void updateVoteStickerParam(Sticker$b p0,String p1,List p2){
       int this;
       VoteStickerParam voteStickerP;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, UpdateStickerTextAction.class, "2")) {
          return;
       }
       VoteStickerParam$b uob = VoteStickerParam.newBuilder();
       String str = "voteParamBuilder";
       if (p1 != null) {
          a.o(uob, str);
          uob.d(p1);
       }else {
          a.o(uob, str);
          voteStickerP = p0.getVoteStickerParam();
          a.o(voteStickerP, "stickerBuilder.voteStickerParam");
          uob.d(voteStickerP.getQuestion());
       }
       int i = 1;
       this = 0;
       if ((p2.isEmpty() ^ i) && p2.get(this) != null) {
          p1 = (TextUtils.isEmpty(p2.get(this)))? a1.p(R.string.arg_RES_7f10513d): p2.get(this);
          uob.b(p1);
       }else {
          voteStickerP = p0.getVoteStickerParam();
          a.o(voteStickerP, "stickerBuilder.voteStickerParam");
          if (voteStickerP.getOptionsList().size() > 0) {
             uob.b(p0.getVoteStickerParam().getOptions(this));
          }
       }
       if (p2.size() > i && p2.get(i) != null) {
          p1 = (TextUtils.isEmpty(p2.get(i)))? a1.p(R.string.arg_RES_7f10513e): p2.get(i);
          uob.b(p1);
       }else {
          voteStickerP = p0.getVoteStickerParam();
          a.o(voteStickerP, "stickerBuilder.voteStickerParam");
          if (voteStickerP.getOptionsList().size() > i) {
             uob.b(p0.getVoteStickerParam().getOptions(i));
          }
       }
       if (p2.size() > 2 && p2.get(2) != null) {
          p1 = (TextUtils.isEmpty(p2.get(2)))? a1.p(R.string.arg_RES_7f10513e): p2.get(2);
          uob.b(p1);
       }else {
          voteStickerP = p0.getVoteStickerParam();
          a.o(voteStickerP, "stickerBuilder.voteStickerParam");
          if (voteStickerP.getOptionsList().size() > 2) {
             uob.b(p0.getVoteStickerParam().getOptions(2));
          }
       }
       p0.o(uob.build());
       return;
    }
}
