package com.yxcorp.gifshow.record.interactive.RecordVoteStickerData;
import com.yxcorp.gifshow.record.interactive.RecordStickerBaseData;
import com.yxcorp.gifshow.record.interactive.RecordVoteStickerData$a;
import nsd.u;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Object;
import kotlin.jvm.internal.a;
import qr4.k$e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import qr4.k$e$g;
import java.util.List;
import trd.n;
import java.util.Collection;

public final class RecordVoteStickerData extends RecordStickerBaseData	// class@001790
{
    public final ArrayList optionList;
    public String question;
    public static final RecordVoteStickerData$a Companion;

    static {
       RecordVoteStickerData.Companion = new RecordVoteStickerData$a(null);
    }
    public void RecordVoteStickerData(){
       super(null, null, 0, 0, 15, null);
    }
    public void RecordVoteStickerData(String p0,ArrayList p1,float p2,float p3){
       a.p(p0, "question");
       a.p(p1, "optionList");
       super(p2, p3, 0, 4, null);
       this.question = p0;
       this.optionList = p1;
    }
    public void RecordVoteStickerData(String p0,ArrayList p1,float p2,float p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = "";
       }
       if (p4 & 0x02) {
          p1 = new ArrayList();
       }
       if (p4 & 0x04) {
          p2 = 0x3f000000;
       }
       if (p4 & 0x08) {
          p3 = 0x3f000000;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public static final RecordVoteStickerData convertToData(k$e p0){
       k$e a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecordVoteStickerData$a obj = PatchProxy.applyOneRefs(p0, null, RecordVoteStickerData.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = RecordVoteStickerData.Companion;
       Objects.requireNonNull(obj);
       RecordVoteStickerData recordVoteSt = PatchProxy.applyOneRefs(p0, obj, RecordVoteStickerData$a.class, "1");
       if (recordVoteSt != patchProxyRe) {
       }else {
          a.p(p0, "voteMagicEmoji");
          recordVoteSt = new RecordVoteStickerData(null, null, 0, 0, 15, null);
          a = p0.A;
          if (a != null) {
             k$e$g a1 = a.a;
             a.o(a1, "voteMagicEmoji.voteConfig.question");
             patchProxyRe.setQuestion(a1);
             patchProxyRe.getOptionList().clear();
             k$e$g b = p0.A.b;
             a.o(b, "voteMagicEmoji.voteConfig.options");
             patchProxyRe.getOptionList().addAll(n.t(b));
             a1 = p0.A.c;
             if (a1 != null && a1.length > 1) {
                patchProxyRe.setCenterX(a1[0]);
                patchProxyRe.setCenterY(p0.A.c[1]);
             }
          }
          recordVoteSt = patchProxyRe;
       }
       return recordVoteSt;
    }
    public final ArrayList getOptionList(){
       return this.optionList;
    }
    public final String getQuestion(){
       return this.question;
    }
    public final void setQuestion(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordVoteStickerData.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.question = p0;
       return;
    }
    public final void update(RecordVoteStickerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordVoteStickerData.class, "1")) {
          return;
       }
       a.p(p0, "stickerData");
       this.question = p0.question;
       this.optionList.clear();
       this.optionList.addAll(p0.optionList);
       this.setCenterX(p0.getCenterX());
       this.setCenterY(p0.getCenterY());
       return;
    }
}
