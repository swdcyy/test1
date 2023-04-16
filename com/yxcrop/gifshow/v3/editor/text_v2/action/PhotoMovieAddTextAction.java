package com.yxcrop.gifshow.v3.editor.text_v2.action.PhotoMovieAddTextAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.edit.draft.TimeRange;
import com.kuaishou.edit.draft.TimeRange$b;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import hba.a;
import wnd.h;
import wnd.e;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;

public final class PhotoMovieAddTextAction extends EditDraftAction	// class@000b05
{
    public final int assetSize;
    public final double currentTime;
    public final String defaultText;
    public final boolean isCommit;
    public final boolean isFirstAdd;
    public final DraftTextStyleInfo lastUsedStyleInfo;

    public void PhotoMovieAddTextAction(double p0,int p1,DraftTextStyleInfo p2,String p3,boolean p4,boolean p5){
       a.p(p3, "defaultText");
       super(false, 1, null);
       this.currentTime = p0;
       this.assetSize = p1;
       this.lastUsedStyleInfo = p2;
       this.defaultText = p3;
       this.isFirstAdd = p4;
       this.isCommit = p5;
    }
    public void PhotoMovieAddTextAction(double p0,int p1,DraftTextStyleInfo p2,String p3,boolean p4,boolean p5,int p6,u p7){
       DraftTextStyleInfo uDraftTextSt = (p6 & 0x04)? null: p2;
       String str = (p6 & 0x08)? "": p3;
       boolean b = (p6 & 0x10)? false: p4;
       boolean b1 = (p6 & 0x20)? true: p5;
       super(p0, p1, uDraftTextSt, str, b, b1);
       return;
    }
    public final int getCurrentAssetIndex(){
       Object obj = PatchProxy.apply(null, this, PhotoMovieAddTextAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (int)((this.currentTime % ((double)this.assetSize * 2.00f)) / 2.00f);
    }
    public final TimeRange getTimeRange(){
       GeneratedMessageLite obj = PatchProxy.apply(null, this, PhotoMovieAddTextAction.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       double d = 2.00f;
       int currentAsset = this.getCurrentAssetIndex();
       double d1 = (double)currentAsset * d;
       if (this.isFirstAdd != null) {
          TimeRange$b uob = TimeRange.newBuilder();
          uob.b(0);
          uob.a(((double)this.assetSize * d));
          obj = uob.build();
          a.o(obj, "TimeRange.newBuilder\(\).s¡­ pictureDuration\).build\(\)");
       }else {
          TimeRange$b uob1 = TimeRange.newBuilder();
          uob1.b(d1);
          uob1.a(((double)(this.assetSize - currentAsset) * d));
          obj = uob1.build();
          a.o(obj, "TimeRange.newBuilder\(\).s¡­uration\(duration\).build\(\)");
       }
       return obj;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoMovieAddTextAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          PhotoMovieAddTextAction tlastUsedSty = this.lastUsedStyleInfo;
          if (tlastUsedSty == null) {
             tlastUsedSty = h.o();
          }
          PhotoMovieAddTextAction photoMovieAd = tlastUsedSty;
          int i = e.a();
          TimeRange timeRange = this.getTimeRange();
          Object[] objArray = new Object[0];
          a.D().w("PhotoMovieAddTextAction", "timeRange start="+timeRange.getStart()+" duration="+timeRange.getDuration(), objArray);
          if (!uoa.D()) {
             uoa.c0();
          }
          h.b(uoa, i, this.defaultText, timeRange, photoMovieAd, false, null, 0, 0, 448, null);
          if (this.isCommit != null) {
             uoa.f();
          }
       }
       return;
    }
}
