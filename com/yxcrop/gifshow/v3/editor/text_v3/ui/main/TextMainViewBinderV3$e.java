package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3$e;
import rod.b;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainViewBinderV3;
import java.lang.Object;
import ood.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import yod.k;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import qod.a;
import xld.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import xld.c;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$ResourceType;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextDesignFontChangeActionV3;
import bod.a;
import nsd.u;
import xvc.b;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextDesignFontDelayChangeActionV3;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextTemplateChangeActionV3;

public final class TextMainViewBinderV3$e implements b	// class@000c48
{
    public final TextMainViewBinderV3 a;

    public void TextMainViewBinderV3$e(TextMainViewBinderV3 p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Object p1){
       DraftTextStyleInfo uDraftTextSt;
       CommonDraftTextAssetModel$ResourceType resourceType;
       TextMainViewBinderV3$e uoe1;
       Object obj = p1;
       p1 = TextMainViewBinderV3$e.class;
       if (!PatchProxy.isSupport(p1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj, this, p1, "1")) {
          a.p(obj, "item");
          int i = this.a.a0().o0().o();
          TextMainViewBinderV3$e uoe = null;
          if (p0 == -2) {
             uDraftTextSt = this.a.a0().o0().A();
             resourceType = (uDraftTextSt != null)? uDraftTextSt.k(): uoe;
             if (resourceType == CommonDraftTextAssetModel$ResourceType.FLOWER_WORD) {
             label_0071 :
                if (obj.q() == CommonDraftTextAssetModel$ResourceType.FLOWER_WORD) {
                   uDraftTextSt = this.a.a0().o0().A();
                   resourceType = (uDraftTextSt != null)? uDraftTextSt.k(): uoe;
                   if (resourceType == CommonDraftTextAssetModel$ResourceType.TEMPLATE) {
                      TextDesignFontChangeActionV3 textDesignFo = new TextDesignFontChangeActionV3(i, false, obj, null, null, 0, this.a.a0().o0().w(), 32, null);
                      this.a.a0().t0(CommonDraftTextAssetModel$ResourceType.TEMPLATE);
                   }else {
                      k ok = this.a.a0();
                      DraftTextStyleInfo uDraftTextSt1 = this.a.a0().o0().A();
                      String str = (uDraftTextSt1 != null)? uDraftTextSt1.f(): uoe;
                      DraftTextStyleInfo uDraftTextSt2 = this.a.a0().o0().A();
                      if (uDraftTextSt2 != null) {
                         uoe = Integer.valueOf(uDraftTextSt2.c());
                      }
                      TextDesignFontDelayChangeActionV3 textDesignFo1 = new TextDesignFontDelayChangeActionV3(i, false, obj, str, uoe, 0, this.a.a0().o0().w(), 32, null);
                      ok.t0(CommonDraftTextAssetModel$ResourceType.TEMPLATE);
                   }
                }else {
                   TextTemplateChangeActionV3 textTemplate = new TextTemplateChangeActionV3(i, false, obj, 0, this.a.a0().o0().w(), 8, null);
                   this.a.a0().t0(CommonDraftTextAssetModel$ResourceType.FLOWER_WORD);
                }
             }
          }else if(p0 == -1){
             uDraftTextSt = this.a.a0().o0().A();
             resourceType = (uDraftTextSt != null)? uDraftTextSt.k(): uoe;
             if (resourceType == CommonDraftTextAssetModel$ResourceType.TEMPLATE) {
             }
          }else {
             goto label_0071 ;
          }
       }
    label_0139 :
       return;
    }
}
