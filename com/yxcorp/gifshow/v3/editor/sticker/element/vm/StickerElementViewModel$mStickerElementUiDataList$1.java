package com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel$mStickerElementUiDataList$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel;
import java.lang.Object;
import ktc.a;
import ktc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import ltc.a;
import java.lang.Float;
import ktc.c;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.VoteStickerParam;
import java.util.List;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.TagStickerParam;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.kuaishou.edit.draft.TimeRange;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;

public final class StickerElementViewModel$mStickerElementUiDataList$1 extends Lambda implements p	// class@00123a
{
    public final StickerElementViewModel this$0;

    public void StickerElementViewModel$mStickerElementUiDataList$1(StickerElementViewModel p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final b invoke(a p0,b p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, StickerElementViewModel$mStickerElementUiDataList$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "x");
       EditStickerBaseDrawerData uEditSticker = (p1 != null)? p1.b(): null;
       obj = new b(uEditSticker);
       StickerElementViewModel b = (this.this$0.p.b())? this.this$0.b: 0x3f800000;
       StickerElementViewModel e = this.this$0.e;
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(b), Float.valueOf(e), obj, b.class, "7")) {
          a.p(p0, "editStickerDraftData");
          obj.b = e;
          a b1 = p0.b;
          obj.c = b1;
          if (b1.b() == -1) {
             VoteStickerParam voteStickerP = p0.a().getVoteStickerParam();
             a.o(voteStickerP, "editStickerDraftData.draftSticker.voteStickerParam");
             String question = voteStickerP.getQuestion();
             a.o(question, "editStickerDraftData.dra¡­voteStickerParam.question");
             obj.e = question;
             voteStickerP = p0.a().getVoteStickerParam();
             a.o(voteStickerP, "editStickerDraftData.draftSticker.voteStickerParam");
             int i = 1;
             if (voteStickerP.getOptionsList().size() > i) {
                question = p0.a().getVoteStickerParam().getOptions(0);
                a.o(question, "editStickerDraftData.dra¡­tickerParam.getOptions\(0\)");
                obj.f = question;
                question = p0.a().getVoteStickerParam().getOptions(i);
                a.o(question, "editStickerDraftData.dra¡­tickerParam.getOptions\(1\)");
                obj.g = question;
             }
          }
          StickerResult result = p0.a().getResult();
          if (obj.c.b() == -1.#Rf) {
             TagStickerParam tagStickerPa = p0.a().getTagStickerParam();
             a.o(tagStickerPa, "editStickerDraftData.draftSticker.tagStickerParam");
             String text = tagStickerPa.getText();
             a.o(text, "editStickerDraftData.dra¡­cker.tagStickerParam.text");
             obj.h = text;
             a.o(result, "stickerResult");
             obj.a.P((float)result.getResourceWidth());
             obj.a.M((float)result.getResourceHeight());
          }
          a.o(result, "stickerResult");
          TimeRange range = result.getRange();
          obj.a.Y(result.getCenterX());
          obj.a.Z(result.getCenterY());
          obj.a.b0(result.getScale());
          obj.a.K(result.getViewScale());
          obj.a.U(b);
          obj.a.a0(result.getRotate());
          a.o(range, "timeRange");
          obj.a.x0(range.getStart());
          obj.a.q0(range.getDuration());
          obj.a.v0(result.getZIndex());
          obj.a.R(obj.c.c);
          obj.a.D0((float)result.getResourceWidth());
          obj.a.C0((float)result.getResourceHeight());
       }
       return obj;
    }
}
