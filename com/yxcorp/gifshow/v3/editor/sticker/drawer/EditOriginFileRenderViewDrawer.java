package com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileRenderViewDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileDrawer;
import ptc.a;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import com.kwai.video.editorsdk2.EditorSdk2AnimatedRenderView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.AbsoluteLayout$LayoutParams;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.content.Context;
import android.widget.AbsoluteLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.TextureView;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class EditOriginFileRenderViewDrawer extends EditOriginFileDrawer	// class@001223
{
    public EditorSdk2AnimatedRenderView c;

    public void EditOriginFileRenderViewDrawer(){
       super();
    }
    public void EditOriginFileRenderViewDrawer(double p0,double p1,int p2,a p3,float p4,float p5,float p6){
       super(p0, p1, p2, p3, p4, p5, p6);
    }
    public static boolean isEditOriginFileRenderViewDrawer(EditStickerBaseDrawer p0){
       return p0 instanceof EditOriginFileRenderViewDrawer;
    }
    public EditorSdk2AnimatedRenderView getRenderView(){
       return this.c;
    }
    public View initView(DecorationContainerView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditOriginFileRenderViewDrawer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       EditorSdk2AnimatedRenderView uEditorSdk2A = new EditorSdk2AnimatedRenderView(p0.getContext());
       this.c = uEditorSdk2A;
       uEditorSdk2A.setAssetId(this.mRenderViewDrawerDataProvider.F2());
       this.c.setLayoutParams(new AbsoluteLayout$LayoutParams((int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f(), 0, 0));
       this.setKeepLastFrame(true);
       return this.c;
    }
    public void replace(DecorationContainerView p0,a p1,StickerDetailInfo p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, EditOriginFileRenderViewDrawer.class, "2")) {
          return;
       }
       super.replace(p0, p1, p2);
       EditOriginFileRenderViewDrawer tc = this.c;
       if (tc == null) {
          View view = this.initView(p0);
          this.mDecorationShowingView = view;
          p0.addView(view);
       }else {
          tc.setAssetId(p1.F2());
       }
       return;
    }
    public void setKeepLastFrame(boolean p0){
       if (PatchProxy.isSupport(EditOriginFileRenderViewDrawer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditOriginFileRenderViewDrawer.class, "3")) {
          return;
       }
       if (this.c.isKeepLastFrame() == p0) {
          return;
       }
       this.c.setKeepLastFrame(p0);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditOriginFileRenderViewDrawer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EditOriginFileRenderViewDrawer{"+super.toString()+"mRenderViewDrawerDataProvider="+this.mRenderViewDrawerDataProvider+'}';
    }
}
