package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder$c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.a;
import java.lang.Runnable;
import android.widget.AbsoluteLayout;

public final class StickerAtlasOrSinglePictureSubViewBinder$a extends DecorationContainerView$e	// class@000ab1
{
    public final StickerAtlasOrSinglePictureSubViewBinder a;

    public void StickerAtlasOrSinglePictureSubViewBinder$a(StickerAtlasOrSinglePictureSubViewBinder p0){
       this.a = p0;
       super();
    }
    public void b(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder$a.class, "6")) {
       }else {
          this.a.J(p0);
       }
       return;
    }
    public void c(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder$a.class, "3")) {
       }else {
          this.a.M(p0);
       }
       return;
    }
    public void i(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder$a.class, "4")) {
       }else {
          this.a.M(p0);
       }
       return;
    }
    public void p(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder$a.class, "2")) {
       }else {
          this.a.M(p0);
       }
       return;
    }
    public boolean r(BaseDrawer p0){
       return p0 instanceof NewEditStickerBaseDrawer;
    }
    public void t(BaseDrawer p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StickerAtlasOrSinglePictureSubViewBinder$a.class, "1")) {
       }else if(p0 != null && (!p0.isInitFromDraft() && (this.a.k.d(p0) && p0 instanceof NewOriginFileDrawer))){
          this.a.f.post(new a(this, p0));
       }
       return;
    }
    public void x(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder$a.class, "7")) {
       }else {
          this.a.J(p0);
       }
       return;
    }
    public void y(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder$a.class, "5")) {
       }else {
          this.a.J(p0);
       }
       return;
    }
}
