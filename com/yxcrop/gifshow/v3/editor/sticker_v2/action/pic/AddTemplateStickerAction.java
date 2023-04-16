package com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.AddTemplateStickerAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eba.a;
import faa.a;
import q87.c;
import maa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Asset;
import java.lang.Double;
import haa.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.AddTemplateStickerAction$a;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.StickerResult;
import java.io.File;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.StringBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.StickerResult$b;
import trd.t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import wnd.e;
import com.yxcorp.gifshow.util.PostUtils;

public final class AddTemplateStickerAction extends EditDraftAction	// class@000a59
{
    public final String assetIdentifier;
    public final String segmentIdentifier;
    public final c templateDraft;

    public void AddTemplateStickerAction(c p0,String p1,String p2){
       a.p(p0, "templateDraft");
       a.p(p1, "assetIdentifier");
       super(false, 1, null);
       this.templateDraft = p0;
       this.assetIdentifier = p1;
       this.segmentIdentifier = p2;
    }
    public final String getAssetIdentifier(){
       return this.assetIdentifier;
    }
    public final String getSegmentIdentifier(){
       return this.segmentIdentifier;
    }
    public final c getTemplateDraft(){
       return this.templateDraft;
    }
    public void performAction(c p0,c p1){
       Object[] objArray;
       Double uDouble1;
       Double uDouble2;
       StickerResult$b obj;
       Sticker sticker;
       List list2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AddTemplateStickerAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = this.templateDraft.U0();
       int i = 0;
       if (uoa == null) {
          objArray = new Object[i];
          a.D().A("AddTemplateStickerAction", "apply: template sticker draft is null", objArray);
          return;
       }else {
          a uoa1 = this.templateDraft.o0();
          Double uDouble = null;
          if (uoa1 != null) {
             Asset uAsset = uoa1.v();
             if (uAsset != null) {
                uDouble1 = Double.valueOf(uAsset.getOriginPicWidth());
             label_004a :
                if (uDouble1 != null) {
                   double d = (double)i;
                   if (uDouble1.doubleValue() - d > 0) {
                      a uoa2 = a.q(p0);
                      if (!uoa2.D()) {
                         return;
                      }else {
                         List list = a.c(p0).z();
                         a.o(list, "DraftGetUtils.getAssetDr¡­\(workspaceDraft\).messages");
                         Iterator iterator = list.iterator();
                         while (true) {
                            if (iterator.hasNext()) {
                               uDouble2 = iterator.next();
                               obj = uDouble2;
                               a.o(obj, "it");
                               if (!a.g(obj.getIdentifier(), this.assetIdentifier)) {
                                  continue ;
                               }
                            }else {
                               uDouble2 = uDouble;
                            }
                            if (uDouble2 != null) {
                               uDouble = Double.valueOf(uDouble2.getOriginPicWidth());
                            }
                            if (uDouble == null || uDouble.doubleValue() - d <= 0) {
                               break ;
                            }else {
                               float f = (float)uDouble.doubleValue() / (float)uDouble1.doubleValue();
                               List list1 = uoa.z();
                               a.o(list1, "templateStickerDraft.messages");
                               Iterator iterator1 = CollectionsKt___CollectionsKt.f5(list1, new AddTemplateStickerAction$a()).iterator();
                               while (iterator1.hasNext()) {
                                  sticker = iterator1.next();
                                  a.o(sticker, "templateSticker");
                                  File uFile = DraftUtils.t(sticker.getResult(), uoa);
                                  if (uFile == null) {
                                     Object[] objArray1 = new Object[i];
                                     a.D().A("AddTemplateStickerAction", "apply: template sticker invalid: "+sticker, objArray1);
                                  }else {
                                     Sticker$b uob = uoa2.b().mergeFrom(sticker);
                                     boolean b = true;
                                     uob.m(b);
                                     obj = sticker.getResult().toBuilder();
                                     obj.m(uoa2.Q(uFile.getAbsolutePath()));
                                     obj.c();
                                     AddTemplateStickerAction tsegmentIden = this.segmentIdentifier;
                                     if (tsegmentIden == null) {
                                        list2 = t.k(this.assetIdentifier);
                                     }else {
                                        String[] stringArray = new String[2];
                                        stringArray[i] = this.assetIdentifier;
                                        stringArray[b] = tsegmentIden;
                                        list2 = CollectionsKt__CollectionsKt.L(stringArray);
                                     }
                                     obj.a(list2);
                                     StickerResult result = sticker.getResult();
                                     a.o(result, "templateSticker.result");
                                     float f1 = result.getScale() * f;
                                     obj.t(f1);
                                     obj.w(e.a());
                                     uob.h(obj);
                                     continue ;
                                  }
                               }
                               return;
                            }
                         }
                         PostUtils.F("AddTemplateStickerAction", "apply: asset size invalid");
                         return;
                      }
                   }
                }
                objArray = new Object[i];
                a.D().A("AddTemplateStickerAction", "apply: template asset size invalid", objArray);
                return;
             }
          }
          uDouble1 = uDouble;
          goto label_004a ;
       }
    }
}
