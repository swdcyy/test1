package com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextTemplateChangeAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import bod.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import wnd.h;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;

public final class TextTemplateChangeAction extends EditDraftAction	// class@000b7f
{
    public final boolean commit;
    public final boolean isSubtitle;
    public final int layerIndex;
    public final d textTemplateItem;

    public void TextTemplateChangeAction(int p0,boolean p1,d p2,boolean p3){
       a.p(p2, "textTemplateItem");
       super(false, 1, null);
       this.layerIndex = p0;
       this.isSubtitle = p1;
       this.textTemplateItem = p2;
       this.commit = p3;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextTemplateChangeAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
          TextTemplateChangeAction tlayerIndex = this.layerIndex;
          TextTemplateChangeAction tisSubtitle = this.isSubtitle;
          TextTemplateChangeAction ttextTemplat = this.textTemplateItem;
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(tlayerIndex), Boolean.valueOf(tisSubtitle), uoa, ttextTemplat, null, h.class, "17")) {
             a.p(uoa, "textDraft");
             a.p(ttextTemplat, "templateItem");
             if (tisSubtitle != null) {
                Iterator iterator = h.j(uoa).iterator();
                while (iterator.hasNext()) {
                   h.v(iterator.next().intValue(), uoa, ttextTemplat);
                }
             }else {
                h.v(tlayerIndex, uoa, ttextTemplat);
             }
          }
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
