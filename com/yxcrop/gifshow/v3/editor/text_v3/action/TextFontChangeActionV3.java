package com.yxcrop.gifshow.v3.editor.text_v3.action.TextFontChangeActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import bod.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import hba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Text;
import java.util.Collection;
import com.kuaishou.edit.draft.StickerResult;
import xod.d;

public final class TextFontChangeActionV3 extends EditSdkAction	// class@000c03
{
    public final boolean commit;
    public final a fontItem;
    public final boolean isSubtitle;
    public final int layerIndex;
    public final int textLayerIndex;

    public void TextFontChangeActionV3(int p0,boolean p1,int p2,a p3,boolean p4){
       a.p(p3, "fontItem");
       super();
       this.layerIndex = p0;
       this.isSubtitle = p1;
       this.textLayerIndex = p2;
       this.fontItem = p3;
       this.commit = p4;
    }
    public void TextFontChangeActionV3(int p0,boolean p1,int p2,a p3,boolean p4,int p5,u p6){
       int i = (p5 & 0x04)? 0: p2;
       super(p0, p1, i, p3, p4);
       return;
    }
    public final a getFontItem(){
       return this.fontItem;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextFontChangeActionV3.class, "1")) {
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
          if (this.isSubtitle != null) {
             List list = uoa.z();
             a.o(list, "textDraft.messages");
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Object obj = iterator.next();
                if (obj.hasSubtitleExtraParam()) {
                   uArrayList.add(obj);
                }
             }
             iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                Text text = iterator.next();
                a.o(text, "it");
                StickerResult result = text.getResult();
                a.o(result, "it.result");
                d.l(this.fontItem, result.getZIndex(), uoa);
             }
          }else {
             d.l(this.fontItem, this.layerIndex, uoa);
          }
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
