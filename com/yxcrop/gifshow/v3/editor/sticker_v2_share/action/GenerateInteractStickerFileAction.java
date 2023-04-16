package com.yxcrop.gifshow.v3.editor.sticker_v2_share.action.GenerateInteractStickerFileAction;
import com.yxcorp.gifshow.v3.framework.post.EditDraftAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import xvc.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.utility.Log;
import java.lang.Integer;
import java.util.List;
import wba.l0;
import faa.a;
import w46.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Sticker$b;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import tmd.a;
import q87.c;

public final class GenerateInteractStickerFileAction extends EditDraftAction	// class@000ad1
{
    public final float assetTransformedScale;
    public final boolean commit;
    public final int containerViewWidth;
    public final Size contentSize;
    public final Size currentAssetSize;
    public final NewEditStickerBaseDrawer element;
    public final boolean isPicture;

    public void GenerateInteractStickerFileAction(NewEditStickerBaseDrawer p0,Size p1,float p2,int p3,boolean p4,Size p5,boolean p6){
       a.p(p0, "element");
       a.p(p1, "currentAssetSize");
       a.p(p5, "contentSize");
       super(false, 1, null);
       this.element = p0;
       this.currentAssetSize = p1;
       this.assetTransformedScale = p2;
       this.containerViewWidth = p3;
       this.isPicture = p4;
       this.contentSize = p5;
       this.commit = p6;
    }
    public void GenerateInteractStickerFileAction(NewEditStickerBaseDrawer p0,Size p1,float p2,int p3,boolean p4,Size p5,boolean p6,int p7,u p8){
       boolean b = (p7 & 0x40)? true: p6;
       super(p0, p1, p2, p3, p4, p5, b);
       return;
    }
    public final float getAssetTransformedScale(){
       return this.assetTransformedScale;
    }
    public final boolean getCommit(){
       return this.commit;
    }
    public final int getContainerViewWidth(){
       return this.containerViewWidth;
    }
    public final Size getContentSize(){
       return this.contentSize;
    }
    public final Size getCurrentAssetSize(){
       return this.currentAssetSize;
    }
    public final NewEditStickerBaseDrawer getElement(){
       return this.element;
    }
    public final boolean isPicture(){
       return this.isPicture;
    }
    public void performAction(c p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GenerateInteractStickerFileAction.class, "1")) {
          return;
       }
       a.p(p0, "workspaceDraft");
       a.p(p1, "store");
       super.performAction(p0, p1);
       a uoa = p0.U0();
       if (uoa != null) {
          a.o(uoa, "workspaceDraft.stickerDraft ?: return");
          if (!uoa.D()) {
             uoa.c0();
          }
          this.updateElementListBitmapInfo(this.element, uoa);
          if (this.commit != null) {
             uoa.f();
          }
       }
       return;
    }
    public final void updateElementListBitmapInfo(NewEditStickerBaseDrawer p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GenerateInteractStickerFileAction.class, "2")) {
          return;
       }
       BaseDrawer mDecorationB = p0.mDecorationBitmap;
       int i = (mDecorationB != null)? mDecorationB.getWidth(): -1;
       mDecorationB = p0.mDecorationBitmap;
       int i1 = (mDecorationB != null)? mDecorationB.getHeight(): -1;
       String elementOutpu = p0.getElementOutputPath();
       Log.b("GenerateInteractStickerFileAction", p0.getLayerIndex()+" GenerateFile: "+i+", "+i1+", "+elementOutpu);
       this.updateStickerBitmapInfo(p0, p0.getLayerIndex(), p1, elementOutpu, i, i1);
       return;
    }
    public final void updateStickerBitmapInfo(NewEditStickerBaseDrawer p0,int p1,a p2,String p3,int p4,int p5){
       Object obj = this;
       int i = p1;
       object oobject = p2;
       object oobject1 = p3;
       int i1 = p4;
       int i2 = p5;
       GenerateInteractStickerFileAction generateInte = GenerateInteractStickerFileAction.class;
       if (PatchProxy.isSupport(generateInte)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),oobject,oobject1,Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, obj, generateInte, "3")) {
             return;
          }
       }
       if (!p2.z().size()) {
          return;
       }else {
          int i3 = l0.a.a(i, oobject);
          if (i3 < 0) {
             Object[] objArray1 = new Object[0];
             a.D().t("GenerateInteractStickerFileAction", "updateTextBitmapInfo stickerDraftPosition is invalid", objArray1);
             return;
          }else {
             Log.b("GenerateInteractStickerFileAction", "updateTextBitmapInfo: "+i+", "+oobject1);
             GeneratedMessageLite$Builder uBuilder = oobject.n(i3);
             a.o(uBuilder, "stickerDraft.getBuilder\(index\)");
             StickerResult$b uob = uBuilder.getResult().toBuilder();
             a.o(uob, "stickerResultBuilder");
             uob.m(p2.Q(p3));
             if (i1 > 0) {
                uob.r((double)i1);
             }
             if (i2 > 0) {
                uob.q((double)i2);
             }
             if (i1 > 0 && i2 > 0) {
                float f = (p0.getElementData().I0())? 0x3f800000: p0.getScale();
                GenerateInteractStickerFileAction isPicture = obj.isPicture;
                float f1 = (p0.getElementData().J0())? (float)i1: (float)obj.contentSize.b;
                uob.t(a.a(f, isPicture, f1, (float)i1, obj.currentAssetSize.b, (float)obj.containerViewWidth, obj.assetTransformedScale));
                Object[] objArray2 = new Object[0];
                a.D().w("GenerateInteractStickerFileAction", "updateTextBitmapInfo width = "+i1+", height = "+i2+", scale = "+uob.getScale(), objArray2);
             }else {
                Object[] objArray3 = new Object[0];
                a.D().t("GenerateInteractStickerFileAction", "updateTextBitmapInfo invalid width or height, cannot generate bitmap", objArray3);
             }
             uob.build();
             uBuilder.h(uob);
             uBuilder.build();
             return;
          }
       }
    }
}
