package com.yxcrop.gifshow.v3.editor.text_v3.action.TextDesignFontChangeActionV3;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import ood.d;
import bod.a;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import hba.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$ResourceType;
import xod.d;
import java.lang.Number;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel$a;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$TextInfoModel;
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

public final class TextDesignFontChangeActionV3 extends EditSdkAction	// class@000c01
{
    public final boolean commit;
    public final boolean isSubtitle;
    public final Integer lastAlignType;
    public final a lastFontItem;
    public final int layerIndex;
    public final int textLayerIndex;
    public final d textTemplateItem;

    public void TextDesignFontChangeActionV3(int p0,boolean p1,d p2,a p3,Integer p4,int p5,boolean p6){
       a.p(p2, "textTemplateItem");
       super();
       this.layerIndex = p0;
       this.isSubtitle = p1;
       this.textTemplateItem = p2;
       this.lastFontItem = p3;
       this.lastAlignType = p4;
       this.textLayerIndex = p5;
       this.commit = p6;
    }
    public void TextDesignFontChangeActionV3(int p0,boolean p1,d p2,a p3,Integer p4,int p5,boolean p6,int p7,u p8){
       int i = (p7 & 0x20)? 0: p5;
       super(p0, p1, p2, p3, p4, i, p6);
       return;
    }
    public final void changeSingle(int p0,a p1,d p2,a p3,Integer p4){
       CommonDraftTextAssetModel$TextInfoModel$a obj = this;
       int i = p0;
       object oobject = p1;
       object oobject1 = p3;
       TextDesignFontChangeActionV3 textDesignFo = TextDesignFontChangeActionV3.class;
       int i1 = 4;
       int i2 = 0;
       if (PatchProxy.isSupport(textDesignFo)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,p2,oobject1,p4};
          if (PatchProxy.applyVoid(objArray, obj, textDesignFo, "2")) {
             return;
          }
       }
       int i3 = 4;
       d.k(p0, p2, p1, 0, 0, null, obj.isSubtitle, null, 184, 0);
       if (oobject1 != null) {
          d.l(oobject1, i, oobject);
       }
       if (p4 != null) {
          int i4 = p4.intValue();
          obj = d.f(i, oobject, 0, i3, null);
          if (obj != null) {
             obj.a(i4);
          }
          if (obj != null) {
             GeneratedMessageLite generatedMes = obj.build();
             if (generatedMes != null) {
                d.m(generatedMes, p0, p1, 0, 8, null);
             }
          }
       }
    label_0075 :
       return;
    }
    public final Integer getLastAlignType(){
       return this.lastAlignType;
    }
    public final a getLastFontItem(){
       return this.lastFontItem;
    }
    public final d getTextTemplateItem(){
       return this.textTemplateItem;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextDesignFontChangeActionV3.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.W0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.textDraft ?: return");
          Object[] objArray = new Object[0];
          a.D().w("AddTextDelayActionV3", "performAction layerIndex:"+this.layerIndex+", isSubtitle:"+this.isSubtitle+", textTemplateItem:"+this.textTemplateItem+','+"lastFontItem:"+this.lastFontItem+", lastAlignType:"+this.lastAlignType+", textLayerIndex:"+this.textLayerIndex+", commit:"+this.commit, objArray);
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
                this.changeSingle(result.getZIndex(), uoa, this.textTemplateItem, this.lastFontItem, this.lastAlignType);
             }
          }else {
             this.changeSingle(this.layerIndex, uoa, this.textTemplateItem, this.lastFontItem, this.lastAlignType);
          }
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
}
