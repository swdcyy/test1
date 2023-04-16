package com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextFontChangeAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import bod.a;
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
import d0c.a;
import wnd.h;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;

public final class TextFontChangeAction extends EditDraftAction	// class@000b7d
{
    public final boolean commit;
    public final a fontItem;
    public final boolean isSubtitle;
    public final int layerIndex;

    public void TextFontChangeAction(int p0,boolean p1,a p2,boolean p3){
       a.p(p2, "fontItem");
       super(false, 1, null);
       this.layerIndex = p0;
       this.isSubtitle = p1;
       this.fontItem = p2;
       this.commit = p3;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextFontChangeAction.class, "1")) {
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
          TextFontChangeAction tlayerIndex = this.layerIndex;
          TextFontChangeAction tisSubtitle = this.isSubtitle;
          String str = this.fontItem.b().c();
          a.m(str);
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(tlayerIndex), Boolean.valueOf(tisSubtitle), uoa, str, null, h.class, "19")) {
             a.p(uoa, "textDraft");
             a.p(str, "fontName");
             if (tisSubtitle != null) {
                Iterator iterator = h.j(uoa).iterator();
                while (iterator.hasNext()) {
                   h.r(iterator.next().intValue(), uoa, str);
                }
             }else {
                h.r(tlayerIndex, uoa, str);
             }
          }
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
