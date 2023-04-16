package com.yxcrop.gifshow.v3.editor.text_v3.action.TextTemplateChangeActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import ood.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import hba.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$ResourceType;
import bod.a;
import xod.d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Text;
import java.util.Collection;
import com.kuaishou.edit.draft.StickerResult;

public final class TextTemplateChangeActionV3 extends EditSdkAction	// class@000c06
{
    public final boolean commit;
    public final boolean isSubtitle;
    public final int layerIndex;
    public final int textLayerIndex;
    public final d textTemplateItem;

    public void TextTemplateChangeActionV3(int p0,boolean p1,d p2,int p3,boolean p4){
       a.p(p2, "textTemplateItem");
       super();
       this.layerIndex = p0;
       this.isSubtitle = p1;
       this.textTemplateItem = p2;
       this.textLayerIndex = p3;
       this.commit = p4;
    }
    public void TextTemplateChangeActionV3(int p0,boolean p1,d p2,int p3,boolean p4,int p5,u p6){
       int i = (p5 & 0x08)? 0: p3;
       super(p0, p1, p2, i, p4);
       return;
    }
    public final void changeSingle(int p0,a p1,d p2){
       if (PatchProxy.isSupport(TextTemplateChangeActionV3.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, TextTemplateChangeActionV3.class, "2")) {
          return;
       }
       d.k(p0, p2, p1, 0, 0, null, this.isSubtitle, p2.q(), 56, null);
       return;
    }
    public final d getTextTemplateItem(){
       return this.textTemplateItem;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextTemplateChangeActionV3.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          Object[] objArray = new Object[0];
          a.D().w("TextTemplateChangeActionV3", "performAction layerIndex:"+this.layerIndex+", isSubtitle:"+this.isSubtitle+", textTemplateItem:"+this.textTemplateItem+','+" textLayerIndex:"+this.textLayerIndex+", commit:"+this.commit, objArray);
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
                this.changeSingle(result.getZIndex(), uoa, this.textTemplateItem);
             }
          }else {
             this.changeSingle(this.layerIndex, uoa, this.textTemplateItem);
          }
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
