package com.yxcrop.gifshow.v3.editor.text_v3.action.DecorationMoveProcessAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import nsd.u;
import java.util.ArrayList;
import hba.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$PropertyKeyFrame$a;
import xod.d;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$AssetTransform;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$AssetTransform$a;
import wba.a;
import kotlin.jvm.internal.a;
import com.kwai.common.draft.model.CommonDraftBaseAssetModel$PropertyKeyFrame;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Text;
import java.util.Collection;
import com.kuaishou.edit.draft.StickerResult;
import wba.l0;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kuaishou.edit.draft.Text$b;
import com.kwai.video.minecraft.model.nano.Minecraft$PropertyKeyFrame;

public final class DecorationMoveProcessAction extends EditDraftAction	// class@000bfa
{
    public final boolean changeAll;
    public final boolean commit;
    public final boolean diffChangeToSdk;
    public ArrayList frames;
    public final int layerIndex;
    public final float x;
    public final float y;

    public void DecorationMoveProcessAction(int p0,boolean p1,float p2,float p3,boolean p4,boolean p5){
       super(false, 1, null);
       this.layerIndex = p0;
       this.changeAll = p1;
       this.x = p2;
       this.y = p3;
       this.commit = p4;
       this.diffChangeToSdk = p5;
       this.frames = new ArrayList();
    }
    public final void changeSingle(int p0,a p1){
       DecorationMoveProcessAction uDecorationM = DecorationMoveProcessAction.class;
       if (PatchProxy.isSupport(uDecorationM) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uDecorationM, "3")) {
          return;
       }
       CommonDraftBaseAssetModel$PropertyKeyFrame$a propertyKeyF = d.g(p0, p1);
       if (propertyKeyF != null) {
          CommonDraftBaseAssetModel$AssetTransform$a uAssetTransf = propertyKeyF.getAssetTransform().toBuilder();
          a a = a.a;
          uAssetTransf.a(a.g(this.x));
          uAssetTransf.b(a.g(this.y));
          propertyKeyF.a(uAssetTransf);
          GeneratedMessageLite generatedMes = propertyKeyF.build();
          a.o(generatedMes, "transformBuilder.build\(\)");
          d.n(generatedMes, p0, p1);
       }
       return;
    }
    public final boolean getDiffChangeToSdk(){
       return this.diffChangeToSdk;
    }
    public final ArrayList getFrames(){
       return this.frames;
    }
    public final int getLayerIndex(){
       return this.layerIndex;
    }
    public void performAction(c p0,c p1){
       StickerResult result;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DecorationMoveProcessAction.class, "2")) {
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
          if (this.changeAll != null) {
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
                result = text.getResult();
                a.o(result, "it.result");
                this.changeSingle(result.getZIndex(), uoa);
             }
          }else {
             this.changeSingle(this.layerIndex, uoa);
          }
          if (this.diffChangeToSdk != null) {
             int i = l0.a.a(this.layerIndex, uoa);
             if (i < 0) {
                PostUtils.D("DecorationMoveProcessAction", "performAction", new RuntimeException("draft is empty"));
                return;
             }else {
                GeneratedMessageLite$Builder uBuilder = uoa.n(i);
                a.o(uBuilder, "textDraft.getBuilder\(draftPosition\)");
                int propertyKeyF = uBuilder.getPropertyKeyFramesCount();
                for (int i1 = 0; i1 < propertyKeyF; i1 = i1 + 1) {
                   CommonDraftBaseAssetModel$PropertyKeyFrame propertyKeyF1 = uBuilder.getPropertyKeyFrames(i1);
                   a.o(propertyKeyF1, "textBuilder.getPropertyKeyFrames\(i\)");
                   StickerResult result1 = uBuilder.getResult();
                   a.o(result1, "textBuilder.result");
                   this.frames.add(a.d(propertyKeyF1, (double)result1.getScale()));
                }
             }
          }
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
    public final void setFrames(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationMoveProcessAction.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.frames = p0;
       return;
    }
}
