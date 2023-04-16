package com.yxcrop.gifshow.v3.editor.text_v3.action.TextAlignTypeChangeActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import nsd.u;
import hba.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel$a;
import xod.d;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Text;
import java.util.Collection;
import com.kuaishou.edit.draft.StickerResult;

public final class TextAlignTypeChangeActionV3 extends EditSdkAction	// class@000bff
{
    public final int alignType;
    public final boolean commit;
    public final boolean isSubtitle;
    public final int layerIndex;
    public final int textLayerIndex;

    public void TextAlignTypeChangeActionV3(int p0,int p1,boolean p2,int p3,boolean p4){
       super();
       this.alignType = p0;
       this.layerIndex = p1;
       this.isSubtitle = p2;
       this.textLayerIndex = p3;
       this.commit = p4;
    }
    public void TextAlignTypeChangeActionV3(int p0,int p1,boolean p2,int p3,boolean p4,int p5,u p6){
       int i = (p5 & 0x08)? 0: p3;
       super(p0, p1, p2, i, p4);
       return;
    }
    public final void changeSingle(int p0,a p1,int p2){
       if (PatchProxy.isSupport(TextAlignTypeChangeActionV3.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, TextAlignTypeChangeActionV3.class, "2")) {
          return;
       }
       CommonDraftTextAssetModel$TextInfoModel$a textInfoMode = d.f(p0, p1, 0, 4, null);
       if (textInfoMode != null) {
          textInfoMode.a(p2);
       }
       if (textInfoMode != null) {
          GeneratedMessageLite generatedMes = textInfoMode.build();
          if (generatedMes != null) {
             d.m(generatedMes, p0, p1, 0, 8, null);
          }
       }
       return;
    }
    public final int getAlignType(){
       return this.alignType;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextAlignTypeChangeActionV3.class, "1")) {
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
                this.changeSingle(result.getZIndex(), uoa, this.alignType);
             }
          }else {
             this.changeSingle(this.layerIndex, uoa, this.alignType);
          }
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
