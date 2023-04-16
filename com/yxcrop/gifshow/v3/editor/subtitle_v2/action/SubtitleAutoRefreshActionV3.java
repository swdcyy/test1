package com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleAutoRefreshActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Text;
import com.kuaishou.edit.draft.StickerResult;
import com.kuaishou.edit.draft.TimeRange;
import java.lang.Integer;
import java.lang.Number;
import wnd.h;

public final class SubtitleAutoRefreshActionV3 extends EditSdkAction	// class@000ad9
{
    public final double videoDuration;

    public void SubtitleAutoRefreshActionV3(double p0){
       super();
       this.videoDuration = p0;
    }
    public final double getVideoDuration(){
       return this.videoDuration;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SubtitleAutoRefreshActionV3.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       Object[] objArray = new Object[0];
       a.D().w("PhotoMovieAddTextAction", "performAction videoDuration:"+this.videoDuration, objArray);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
          ArrayList uArrayList = new ArrayList();
          List list = uoa.z();
          a.o(list, "textDraft.messages");
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Text text = iterator.next();
             if (text.hasSubtitleExtraParam()) {
                a.o(text, "it");
                StickerResult result = text.getResult();
                a.o(result, "it.result");
                TimeRange range = result.getRange();
                a.o(range, "it.result.range");
                if (range.getStart() - this.videoDuration > 0) {
                   StickerResult result1 = text.getResult();
                   a.o(result1, "it.result");
                   uArrayList.add(Integer.valueOf(result1.getZIndex()));
                }
             }
          }
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             h.d(iterator1.next().intValue(), uoa);
          }
          uoa.f();
       }
       return;
    }
}
