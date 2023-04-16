package com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileRenderViewDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileRenderViewData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.kwai.video.editorsdk2.EditorSdk2AnimatedRenderView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.util.Objects;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.View;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout$LayoutParams;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.view.ViewGroup$LayoutParams;
import android.view.TextureView;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import android.content.Context;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.lang.Boolean;

public final class NewOriginFileRenderViewDrawer extends NewOriginFileDrawer	// class@000a6b
{
    public EditorSdk2AnimatedRenderView mStickerView;

    public void NewOriginFileRenderViewDrawer(NewOriginFileRenderViewData p0){
       a.p(p0, "elementData");
       super(p0);
    }
    public final EditorSdk2AnimatedRenderView getRenderView(){
       return this.mStickerView;
    }
    public final void h(EditDecorationContainerViewV2 p0,long p1){
       if (PatchProxy.isSupport(NewOriginFileRenderViewDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, NewOriginFileRenderViewDrawer.class, "4")) {
          return;
       }
       NewOriginFileRenderViewDrawer tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          Objects.requireNonNull(p0, "null cannot be cast to non-null type com.yxcorp.gifshow.decoration.widget.DecorationContainerView<*, com.yxcorp.gifshow.decoration.widget.BaseDrawer<*>>");
          View view = this.initView(p0);
          this.mDecorationShowingView = view;
          p0.addView(view);
       }else {
          a.m(tmStickerVie);
          tmStickerVie.setAssetId(p1);
       }
       NewOriginFileRenderViewDrawer tmStickerVie1 = this.mStickerView;
       a.m(tmStickerVie1);
       tmStickerVie1.setLayoutParams(new AbsoluteLayout$LayoutParams((int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f(), 0, 0));
       return;
    }
    public View initView(DecorationContainerView p0){
       Long longx;
       NewOriginFileRenderViewDrawer tmStickerVie;
       AbsoluteLayout$LayoutParams obj = PatchProxy.applyOneRefs(p0, this, NewOriginFileRenderViewDrawer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "decorationContainerView");
       this.setContainerView(p0);
       obj = new AbsoluteLayout$LayoutParams((int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f(), 0, 0);
       this.mStickerView = new EditorSdk2AnimatedRenderView(p0.getContext());
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       if (tmBaseDrawer instanceof NewOriginFileRenderViewData) {
          String str = "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileRenderViewData";
          Objects.requireNonNull(tmBaseDrawer, str);
          if (tmBaseDrawer.S0() != null) {
             tmBaseDrawer = this.mBaseDrawerData;
             Objects.requireNonNull(tmBaseDrawer, str);
             longx = tmBaseDrawer.S0();
          label_005a :
             if (longx == null) {
                tmStickerVie = this.mStickerView;
                a.m(tmStickerVie);
                tmStickerVie.setAssetId((long)(this.mBaseDrawerData.k()+this.mBaseDrawerData.l0()).hashCode());
             }else {
                NewOriginFileRenderViewDrawer tmStickerVie2 = this.mStickerView;
                a.m(tmStickerVie2);
                tmStickerVie2.setAssetId(longx.longValue());
             }
             tmStickerVie = this.mStickerView;
             a.m(tmStickerVie);
             tmStickerVie.setLayoutParams(obj);
             tmStickerVie = 1;
             if (!PatchProxy.isSupport(NewOriginFileRenderViewDrawer.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, NewOriginFileRenderViewDrawer.class, "2")) {
                NewOriginFileRenderViewDrawer tmStickerVie1 = this.mStickerView;
                if (tmStickerVie1 == null || tmStickerVie1.isKeepLastFrame() != tmStickerVie) {
                   tmStickerVie1 = this.mStickerView;
                   if (tmStickerVie1 != null) {
                      tmStickerVie1.setKeepLastFrame(tmStickerVie);
                   }
                }
             }
             tmStickerVie = this.mStickerView;
             a.m(tmStickerVie);
             return tmStickerVie;
          }
       }
       longx = null;
       goto label_005a ;
    }
    public void updateView(EditDecorationContainerViewV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewOriginFileRenderViewDrawer.class, "3")) {
          return;
       }
       a.p(p0, "decorationContainerView");
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       if (tmBaseDrawer instanceof NewOriginFileRenderViewData) {
          String str = "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileRenderViewData";
          Objects.requireNonNull(tmBaseDrawer, str);
          if (tmBaseDrawer.S0() != null) {
             tmBaseDrawer = this.mBaseDrawerData;
             Objects.requireNonNull(tmBaseDrawer, str);
             Long longx = tmBaseDrawer.S0();
             a.m(longx);
             this.h(p0, longx.longValue());
          label_0060 :
             return;
          }
       }
       this.h(p0, (long)(this.mBaseDrawerData.k()+this.mBaseDrawerData.l0()).hashCode());
       goto label_0060 ;
    }
}
