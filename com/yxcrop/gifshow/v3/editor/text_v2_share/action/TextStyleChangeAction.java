package com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextStyleChangeAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wnd.h;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;

public final class TextStyleChangeAction extends EditDraftAction	// class@000b7e
{
    public final boolean commit;
    public final boolean isSubtitle;
    public final int layerIndex;
    public final TextStyleValue textStyleValue;

    public void TextStyleChangeAction(int p0,boolean p1,TextStyleValue p2,boolean p3){
       super(false, 1, null);
       this.layerIndex = p0;
       this.isSubtitle = p1;
       this.textStyleValue = p2;
       this.commit = p3;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextStyleChangeAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          if (this.textStyleValue != null) {
             if (!uoa.D()) {
                uoa.c0();
             }
             TextStyleChangeAction tlayerIndex = this.layerIndex;
             TextStyleChangeAction tisSubtitle = this.isSubtitle;
             TextStyleChangeAction ttextStyleVa = this.textStyleValue;
             if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(tlayerIndex), Boolean.valueOf(tisSubtitle), uoa, ttextStyleVa, null, h.class, "21")) {
                a.p(uoa, "textDraft");
                a.p(ttextStyleVa, "styleValue");
                if (tisSubtitle != null) {
                   Iterator iterator = h.j(uoa).iterator();
                   while (iterator.hasNext()) {
                      h.w(iterator.next().intValue(), uoa, ttextStyleVa);
                   }
                }else {
                   h.w(tlayerIndex, uoa, ttextStyleVa);
                }
             }
             if (this.commit != null) {
                uoa.f();
             }
          }
       }
       return;
    }
}
